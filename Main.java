import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner ent = new Scanner(System.in);
    
    //Exercício 1:
    System.out.println("Exercício 1:");
    int numero1, numero2, somanro;
    System.out.println("Digite dois números inteiros: ");
    numero1 = ent.nextInt();
    numero2 = ent.nextInt();
    somanro = numero1 + numero2;
    System.out.println("A soma desses números é: " + somanro);
    System.out.println("");
    System.out.println("");

    //Exercício 2:
    double PrimeiroBimestre, SegundoBimestre,       
    TerceiroBimestre, QuartoBimestre, MediaNotasBimestrais;
   
    System.out.println("Exercício 2:");
    System.out.println("Digite as notas dos quatro bimestres: ");
    PrimeiroBimestre = ent.nextDouble();
    SegundoBimestre = ent.nextDouble();
    TerceiroBimestre = ent.nextDouble();
    QuartoBimestre = ent.nextDouble();
     MediaNotasBimestrais = (PrimeiroBimestre + SegundoBimestre + TerceiroBimestre + QuartoBimestre)/4;
    System.out.println("As notas do primeiro, segundo, terceiro e quarto bimestre são, respectivamente: " + PrimeiroBimestre + ", " + SegundoBimestre + ", " + TerceiroBimestre + ", " + QuartoBimestre + ".");
    System.out.println("A média bimestral é " + MediaNotasBimestrais + ".");
    System.out.println("");
    System.out.println("");

    //Exercício 3:
    double metros, conversorCentimetro, centimetros;
    System.out.println("Exercício 3:");
    System.out.println("Digite uma distância em metros para converter para centímetro:");
    metros = ent.nextDouble();
    conversorCentimetro = 1E2;
    centimetros = metros*conversorCentimetro;
    System.out.print(metros + "m convertido para centímetros é igual a "+ centimetros + "cm.");
    System.out.println("");
    System.out.println("");
    System.out.println("");

    //Exercício 4:
    double raio, area, pi=3.14;
    System.out.println("Exercício 4");
    System.out.println("Vamos calcular a área de um círculo! Digite o raio desejado em metros: ");
    raio= ent.nextDouble();
    area= Math.pow(raio,2)*pi;
    System.out.println("A área do círculo de raio " + raio + "m é igual a: " +area + "m");
    System.out.println("");
    System.out.println("");

    //Exercício 5
    double lado, areaQuadrado, dobroA;
    System.out.println("Exercício 5");
    System.out.println("Vamos calcular a área de um quadrado! Digite o comprimento do lado do quadrado desejado: "); 
    lado = ent.nextDouble();
    areaQuadrado = Math.pow(lado,2);
    dobroA= areaQuadrado*2;
    System.out.println("A área do quadrado de lado = " + lado + "m é: " + areaQuadrado + "m². Já o dobro dessa área é: " + dobroA + "m²." );
    System.out.println("");
    System.out.println("");

    //Exercício 6
    double celsius,fahrenheit;
    System.out.println("Exercício 6");
    System.out.println("Vamos converter! Digite os graus em Fahrenheit para converter para Celsius:");
    fahrenheit = ent.nextDouble();
    celsius = 5*((fahrenheit-32)/9);
    System.out.println("A conversão de " + fahrenheit + " graus Fahrenheit para graus Celsius é de: " + celsius + " graus Celsius.");
  }
}