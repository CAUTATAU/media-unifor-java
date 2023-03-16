import java.util.Scanner;
public class Media {
    
    Scanner ler = new Scanner(System.in);
    double AV1;
    double AV2;
    double AV3;
    public void SetAV1()
    {
        System.out.println("Digite a nota da AV1");
        double nota = ler.nextDouble();
        this.AV1 = nota;
    }
    public void SetAV2()
    {
        System.out.println("Digite a nota da AV2");
        double nota = ler.nextDouble();
        this.AV2 = nota;
    }
    public void SetAV3()
    {
        System.out.println("Digite a nota da AV3");
        double nota = ler.nextDouble();
        this.AV3 = nota;
    }
    public double CalcularMedia()
    {
        return (((AV1+AV2)/2)+AV3)/2;
    }
    
    

}
