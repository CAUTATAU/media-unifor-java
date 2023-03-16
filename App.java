import java.util.Locale;
public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Media media = new Media();
        media.SetAV1();
        media.SetAV2();
        media.SetAV3();
        System.out.println("o valor da média é: "+media.CalcularMedia());
    }
}
