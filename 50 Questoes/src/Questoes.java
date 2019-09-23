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
        int a, b, c, d, e, f, g, h, i, j;
        
        a = 6 * (3 + 2);
        b = 2 + 6 * (3 + 2);
        c = 2 + 3 * 6 / (2+4);
        d = 2 * 8 /(3+1);
        e = 3 + (16 - 2) / (2 * 9 - 2);
        f = 6 /3 + 8 / 2;
        g = (3 + 8 / 2) * 4 + 3*2;
        h = (6 * (3*3) +6) - 10;
        i = (10 * 3 + 3) * 9;
        j = (-12) * 4 + 3 * (-4);
    }
    static void q14(){
        int valor, antecessor, sucessor;
        
        System.out.println("Insira o valor: ");
        valor = sc.nextInt();
        
        antecessor = valor - 1;
        sucessor = valor + 1;
        System.out.println("Antecessor: "+antecessor+"\nSucessor: "+sucessor);
    }
    static void q15(){
        
        double altura, base, area;
        
        System.out.println("Base do retângulo: ");
        base = sc.nextDouble();
        System.out.println("Altura do retângulo: ");
        altura = sc.nextDouble();
        area = altura * base;
        System.out.println("Area do retângulo igual a "+area);
    }
    static void q16(){
        int anos, meses, dias, diasTotais;
        
        System.out.println("Entre com a idade em anos...");
        anos = sc.nextInt();
        System.out.println("Entre com a idade em meses...");
        meses = sc.nextInt();
        System.out.println("Entre com a idade em dias...");
        dias = sc.nextInt();
        
        diasTotais = dias + (anos * 365) + (meses * 30);
        
        System.out.println("Idade em dias: "+diasTotais);
        
    }
    static void q17(){
        int eleitores, votosBrancos, votosNulos, votosValidos;
        
            System.out.println("Total de eleitores...");
            eleitores = sc.nextInt();
            System.out.println("Votos em branco...");
            votosBrancos = sc.nextInt();
            System.out.println("votos nulos...");
            votosNulos = sc.nextInt();
            System.out.println("Votos validos...");
            votosValidos = sc.nextInt();
            
            System.out.println("Votos em branco: "+(votosBrancos*(eleitores/100)));
            System.out.println("Votos nulos: "+(votosNulos*(eleitores/100)));
            System.out.println("Votos validos: "+(votosValidos*(eleitores/100)));
    }
    static void q18(){
        double salario, percentual, novoSalario;
        
        System.out.println("Informe o salario atual...");
        salario = sc.nextDouble();
        System.out.println("Informe o valor de reajuste...");
        percentual = sc.nextDouble();
        
        novoSalario = salario + (salario*(percentual/100));
        
        System.out.println("Novo salario: "+novoSalario);
    }
    static void q19(){
        double custoFab, consumidor;
         
         System.out.println("Insirar o custo de fabrica");
         custoFab = sc.nextDouble();
         consumidor = custoFab+(((custoFab*0.45)+custoFab)*0.28);
         System.out.println("Valor repassado ao consumidor: "+consumidor);
    }
    static void q20(){
        
        double salarioFixo, comissaoFixa, valorDasVendas, salarioTotal;
        int carrosVendidos;
        
        System.out.println("Informe o salario fixo do vendedor...");
        salarioFixo = sc.nextDouble();
        
        System.out.println("Informe a comissão fixa por carro vendido...");
        comissaoFixa = sc.nextDouble();
        
        System.out.println("Quantidade de carros vendidos...");
        carrosVendidos = sc.nextInt();
        
        System.out.println("Insira o valor total das vendas");
        valorDasVendas = sc.nextDouble();
        
        salarioTotal = salarioFixo + (comissaoFixa * carrosVendidos) + (valorDasVendas * 0.05);
        
        System.out.println("Salario total do vendedor em questão: "+salarioTotal);
    }
    static void q21(){
        int valor;
        
        System.out.println("Insira o valor...");
        valor = sc.nextInt();
        
        if (valor < 10){
            System.out.println("É MAIOR QUE 10");
        }
        else{
            System.out.println("NÃO É MAIOR QUE 10");
        }
    }
    static void q22(){
        int valor;
        
        System.out.println("Insira um valor...");
        valor = sc.nextInt();
        
        if(valor >= 0){
            System.out.println("Valor positivo");
        }
        else{
            System.out.println("Valor negativo");
        }
    }
    static void q23(){
        int quantidade;
        double custoDaCompra;
        
        System.out.println("Informe a quantidade de maças compradas...");
        quantidade = sc.nextInt();
        
        if (quantidade >= 12){
            
            custoDaCompra = quantidade * 1.00;
            System.out.println("Custo da compra: "+custoDaCompra);
        }
        else{
            
            custoDaCompra = quantidade * 1.30;
            System.out.println("Custo da compra: "+custoDaCompra);
        }
    }
    static void q24(){
        double nota1, nota2, media;
        
        System.out.println("Informe a 1ª nota...");
        nota1 = sc.nextDouble();
        System.out.println("Informe a 2ª nota...");
        nota2 = sc.nextDouble();
        
        media = (nota1 + nota2)/2;
        
        if (media >= 6 ){
            System.out.println("Aluno aprovado\nMedia: "+media);
        }
        else{
            System.out.println("Aluno reprovado\nMedia: "+media);
        }
    }
    static void q25(){
        int anoAtual, anoDeNascimento;
        
        System.out.println("Insira o ano atual...");
        anoAtual = sc.nextInt();
        System.out.println("Insira o ano de nascimento...");
        anoDeNascimento = sc.nextInt();
        
        if ((anoAtual - anoDeNascimento)>= 16){
            
            System.out.println("Pode votar esse ano");
        }
        else{
            System.out.println("Não podera votar esse ano");
        }
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
        //q13();
        //q14();
        //q15();
        //q16();
        //q17();
        //q18();
        //q19();
        //q20();
        //q21();
        //q22();
        //q23();
        //q24();
        //q25();
       
    }
    
}
