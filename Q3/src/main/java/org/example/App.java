package org.example;

import java.io.InputStreamReader;
import java.io.Reader;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Objects;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Q3:" );
        ArrayList<FaturamentoDiario> faturamentoMensal = lerJson("dados.json");
        faturamentoMensal.removeIf(faturamento -> faturamento.getValor() == 0.0);

        System.out.println("Menor faturamento: " + menorFaturamento(faturamentoMensal));
        System.out.println("Maior faturamento: " + maiorFaturamento(faturamentoMensal));
        System.out.println("Dias acima da média: " + diasAcimaDaMedia(faturamentoMensal));
    }

    public static FaturamentoDiario menorFaturamento(ArrayList<FaturamentoDiario> faturamentoMensal) {
        FaturamentoDiario menorFaturamento = faturamentoMensal.get(0);
        for (FaturamentoDiario faturamento : faturamentoMensal) {
            if (faturamento.getValor() < menorFaturamento.getValor()) {
                menorFaturamento = faturamento;
            }
        }
        return menorFaturamento;
    }

    public static FaturamentoDiario maiorFaturamento(ArrayList<FaturamentoDiario> faturamentoMensal) {
        FaturamentoDiario maiorFaturamento = faturamentoMensal.get(0);
        for (FaturamentoDiario faturamento : faturamentoMensal) {
            if (faturamento.getValor() > maiorFaturamento.getValor()) {
                maiorFaturamento = faturamento;
            }
        }
        return maiorFaturamento;
    }

    public static int diasAcimaDaMedia(ArrayList<FaturamentoDiario> faturamentoDiario) {
        double mediaMensal = 0;
        for (FaturamentoDiario faturamento : faturamentoDiario) {
            mediaMensal += faturamento.getValor();
        }
        mediaMensal /= faturamentoDiario.size();
        int diasAcimaDaMedia = 0;
        for (FaturamentoDiario faturamento : faturamentoDiario) {
            if (faturamento.getValor() > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }
        return diasAcimaDaMedia;
    }

    public static ArrayList<FaturamentoDiario> lerJson(String path) {
        ClassLoader classLoader = FaturamentoDiario.class.getClassLoader();
        try (Reader reader = new InputStreamReader(Objects.requireNonNull(classLoader.getResourceAsStream(path)))) {
            Gson gson = new Gson();
            return gson.fromJson(reader, new TypeToken<ArrayList<FaturamentoDiario>>() {
            }.getType());
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
