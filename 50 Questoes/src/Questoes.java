import java.util.Scanner;
public class Questoes {
    
    static Scanner sc = new Scanner(System.in);
    static void q1(){
        double n1, n2;
        
        System.out.println("Insira o primeiro número: ");
        n1 = sc.nextDouble();
        System.out.println("Insera o segundo agora: ");
        n2 = sc.nextDouble();
        
        System.out.println("Soma: "+(n1+n2)+"\nSubtração: "+(n1-n2)+"\nMultiplicação: "+(n1*n2)+"\nDivisão: "+(n1/n2));
    }
    static void q2(){
        double combustivelGasto, distancia, resultado;
        
        System.out.println("Qual a distancia percorrida: ");
        distancia = sc.nextDouble();
        System.out.println("Qual a quantidade de combustivel gasto: ");
        combustivelGasto = sc.nextDouble();
        
        resultado = combustivelGasto/distancia;
        
        System.out.println("Gasto médio por quilômetro: "+resultado);
    }
    static void q3(){
        double salario;
        double valorDeVendas;
        String nome;
        
        System.out.println("Insira seu nome: ");
        nome = sc.nextLine();
        System.out.println("Insira seu salario");
        salario = sc.nextDouble();
        System.out.println("Insira o valor das vendas");
        valorDeVendas = sc.nextDouble();
        System.out.println("Salario final de "+nome+": "+(salario+(valorDeVendas*0.15)));
    }
    static void q4(){
        
        double celsius, fahreinheit;
        
        System.out.println("Insira a temperatura em celsius");
        celsius = sc.nextDouble();
        
        fahreinheit = (9*celsius+160)/5;
        System.out.println("A temperatura em fahreinheit: "+fahreinheit);
    }
    static void q5(){
         
         double cotacao, dollar, reais;
         
         System.out.println("insira a cotação do dollar");
         cotacao = sc.nextDouble();
         System.out.println("insira o seu valor em dollares disponivel");
         dollar = sc.nextDouble();
         reais = dollar * cotacao;
         System.out.println("valor em reais: "+reais);
     }
    static void q6(){
         
         double valorDepositado, rendimento;
         
         System.out.println("Valor de deposito: ");
         valorDepositado = sc.nextDouble();
         rendimento = valorDepositado * 0.07;
         System.out.println("valor de rendimento: "+rendimento);
     }
    static void q7(){
         
         double valor, prestacao;
         System.out.println("Valor da compra: ");
         valor = sc.nextDouble();
         prestacao = valor/5;
         System.out.println("valor da prestacao: "+prestacao);
     }
    static void q8(){
        double custo, percentual, valorDeVenda;
        
         System.out.println("Insira o custo do produto: ");
         custo = sc.nextDouble();
         System.out.println("insirar o percentual:");
         percentual = sc.nextDouble();
         valorDeVenda = custo+(custo*percentual);
         System.out.println("valor de venda do produto: "+valorDeVenda);
     }
    static void q9(){
         double custoFab, consumidor;
         
         System.out.println("Insirar o custo de fabrica");
         custoFab = sc.nextDouble();
         consumidor = custoFab+(((custoFab*0.45)+custoFab)*0.28);
         System.out.println("Valor repassado ao consumidor: "+consumidor);
         
     }
    static void q10(){
         int a = 10;
         int b = 20;
         int aux;
         aux = a;
         a = b;
         b = aux;
         System.out.println("A: "+a+" B: "+b);
     }
    static void q11(){
         int a,b,c,x,y;
         int z = 0;
         a = 100;
         b = 120;
         System.out.println(b);
         b = 234;
         System.out.println(a+" "+b);
         System.out.println(".........................................");
         a = 23;
         b = 56;
         c = a+b;
         b = 34;
         a = 67;
         System.out.println(a+" "+b+" "+c);
         System.out.println("...........................................");
         a = 300;
         b = 200;
         c = a+b;
         System.out.println(c);
         b = 140;
         System.out.println(b+" "+c);
         c = a+b;
         System.out.println(a+" "+b+" "+c);
         System.out.println(".............................................");
         
         x = 1; 
         y = 23; z = y-z;
         System.out.println(z);
         x = 5;
         y = x+z;
     }
    static void q12(){
         double a, b, c;
         
         a = (4/2)+(2/4);
         System.out.println("A "+a);
         a = 4/2+2/4;
         System.out.println("A "+a);
         
         b = 4/(2+2)/4;
         System.out.println("B "+b);
         b = 4/2+2/4;
         System.out.println("B "+b);
         
         c = (4+2)*2-4;
         System.out.println("C "+c);
         c = 4+2*2-4;
         System.out.println("C "+c);
     }
    static void q13(){
        
    }

    public static void main(String[] args) {
        //q1();
        //q2();
        //q3();
        //q4();
        //q5();
        //q6();
        //q7();
        //q8();
        //q9();
        //q10();
        //q11();
        //q12();
        q13();
       
    }
    
}
