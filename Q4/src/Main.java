import java.math.RoundingMode;
import java.text.DecimalFormat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Q4:");
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;
        double total = sp + rj + mg + es + outros;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        System.out.println("Valor total mensal: " + total);
        System.out.println("Valor percentual de SP: " + decimalFormat.format(sp / total * 100) + "%");
        System.out.println("Valor percentual de RJ: " + decimalFormat.format(rj / total * 100) + "%");
        System.out.println("Valor percentual de MG: " + decimalFormat.format(mg / total * 100) + "%");
        System.out.println("Valor percentual de ES: " + decimalFormat.format(es / total * 100) + "%");
        System.out.println("Valor percentual de outros estados: " + decimalFormat.format(outros / total * 100) + "%");
    }
}