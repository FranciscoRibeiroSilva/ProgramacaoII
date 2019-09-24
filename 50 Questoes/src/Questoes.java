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
    static void q26(){
        
        int valor1, valor2, maior;
        
        System.out.println("Insira o primeiro valor...");
        valor1 = sc.nextInt();
        System.out.println("Insira o segundo valor...");
        valor2 = sc.nextInt();
        
        maior = (valor1 > valor2) ? valor1 : valor2;
        
        System.out.println("O valor "+maior+" é o maior.");
    }
    static void q27(){
        int valor1, valor2, menor, maior;
        
        System.out.println("Insira o primeiro valor...");
        valor1 = sc.nextInt();
        System.out.println("Insira o segundo valor...");
        valor2 = sc.nextInt();
        
        if(valor1 > valor2){
            
            menor = valor2;
            maior = valor1;
        }
        else{
            maior = valor2;
            menor = valor1;
        }
    }
    static void q28(){
        
        int horaDeInicio, horaDeTermino, duracao;
        
        System.out.println("Insira a hora de inico do jogo");
        horaDeInicio = sc.nextInt();
        System.out.println("Insira a hora de termino do jogo");
        horaDeTermino = sc.nextInt();
        
        if (horaDeInicio >= horaDeTermino){
            
            duracao = (24 - horaDeInicio) + horaDeTermino;
        }
        else{
            
            duracao = horaDeTermino - horaDeInicio;
        }
        
        System.out.println("Duração do jogo em horas: "+duracao);
    }
    static void q29(){
        int horasDeTrabalho, horaExtra;
        double salarioFinal, porHora;
        
        System.out.println("Informe o total de horas de trabalho...");
        horasDeTrabalho = sc.nextInt();
        System.out.println("Informe o pagamento por hora...");
        porHora = sc.nextDouble();
        
        if (horasDeTrabalho > 160){
            
            horaExtra = horasDeTrabalho - 160;
            horasDeTrabalho = horasDeTrabalho - horaExtra;
            
            salarioFinal = (horasDeTrabalho * porHora) + (horaExtra * (porHora +(porHora * 0.50)));
        }
        else{
            salarioFinal = horasDeTrabalho * porHora;
        }
        
        System.out.println("Salario final: R$ "+salarioFinal);
    }
    static void q30(){
        String nome, sexo;
        double altura, pesoIdeal;
        
        System.out.println("Informe seu nome: ");
        nome = sc.next();
        System.out.println("informe sua Altura: ");
        altura = sc.nextDouble();
        System.out.println("Informe seu sexo (M)asculino ou (F)eminino: ");
        sexo = sc.next();
        
        if (sexo == "M"){
            pesoIdeal = (72.7 * altura) - 58;
        }
        else{
            pesoIdeal = (62.1 * altura) - 44.7;
        }
        
        System.out.println("Peso ideal:"+pesoIdeal);
    }
    static void q31(){
        
        double salario, salarioFinal, totalDeVendas;
        
        System.out.println("Informe o salario");
        salario = sc.nextDouble();
        System.out.println("Informe o valor total de vendas");
        totalDeVendas = sc.nextDouble();
        
        if (totalDeVendas <= 1500){
            
            salarioFinal = salario + (totalDeVendas * 0.03);
        }
        else{
            
            salarioFinal = salario + (1500 * 0.03) + (0.05 * (totalDeVendas - 1500));
        }
        
        System.out.println("Salario Final: "+salarioFinal);
    }
    static void q32(){
        int numeroDaConta;
        double saldo, debito, credito, saldoAtual;
        
        System.out.println("Número da Conta...");
        numeroDaConta = sc.nextInt();
        System.out.println("Saldo...");
        saldo = sc.nextDouble();
        System.out.println("Debito...");
        debito = sc.nextDouble();
        System.out.println("Credito...");
        credito = sc.nextDouble();
        
        saldoAtual = saldo - debito + credito;
        
        if (saldoAtual >= 0){
            
            System.out.println("Saldo positivo de "+saldoAtual);
        }
        else{
            
            System.out.println("saldo negativo de "+saldoAtual);
        }
    }
    static void q33(){
        int atual, maxima, minima, media;
        
        System.out.println("Qual a quantidade atual em estoque");
        atual = sc.nextInt();
        System.out.println("Qual a quantidade maxima em estoque");
        maxima = sc.nextInt();
        System.out.println("Qual a quantidade minia em estoque");
        minima = sc.nextInt();
        
        media = (maxima + minima)/2;
        
        if (atual >= media){
            
            System.out.println("Não Efetuar compra");
        }
        else{
            
            System.out.println("Efetuar compra");
        }
    }
    static void q34(){
        
        int valor;
        
        System.out.println("Insira um valor");
        valor = sc.nextInt();
        
        if (valor >= 0){
            
            System.out.println("Valor positivo");
        }
        else{
            System.out.println("Valor negativo");
        }
    }
    static void q35(){
        
        int valor1, valor2, valor3, maior;
        
        System.out.println("Valor 1...");
        valor1 = sc.nextInt();
        System.out.println("Valor 2...");
        valor2 = sc.nextInt();
        System.out.println("Valor 3...");
        valor3 = sc.nextInt();
        
        if (valor1 > valor2){
            
            maior = valor1;
        }
        else{
            
            if (valor2 > valor3){
                
                maior = valor2;
            }
            else{
                
                maior = valor3;
            }
        }
        
        System.out.println("O maior valor: "+maior);
    }
    static void q36(){
        
        int valor1, valor2, valor3, maior, segMaior, soma;
        
        System.out.println("Valor 1...");
        valor1 = sc.nextInt();
        System.out.println("Valor 2...");
        valor2 = sc.nextInt();
        System.out.println("Valor 3...");
        valor3 = sc.nextInt();
        
        if (valor1 > valor2){
            
            maior = valor1;
            
            if (valor2 > valor3){
                segMaior = valor2;
                
            }
            else{
                segMaior = valor3;
            }
            
        }
        else{
            
            if (valor2 > valor3){
                
                maior = valor2;
                
                if (valor3 > valor1){
                    
                    segMaior = valor3;
                    
                }
                else{
                    
                    segMaior = valor1;
                }
            }
            else{
                
                maior = valor3;
                
                if (valor1 > valor2){
                    
                    segMaior = valor1;
                }
                else{
                    segMaior = valor2;
                }
            }
        }
        
        soma = maior + segMaior;
        
        System.out.println("Soma dos dois maiores valores");
    }
    static void q37(){
        int valor1, valor2, valor3, maior, segMaior, menor;
        
        System.out.println("Valor 1...");
        valor1 = sc.nextInt();
        System.out.println("Valor 2...");
        valor2 = sc.nextInt();
        System.out.println("Valor 3...");
        valor3 = sc.nextInt();
        
        if (valor1 > valor2){
            
            maior = valor1;
            
            if (valor2 > valor3){
                segMaior = valor2;
                menor = valor3;
            }
            else{
                segMaior = valor3;
                menor = valor2;
            }
            
        }
        else{
            
            if (valor2 > valor3){
                
                maior = valor2;
                
                if (valor3 > valor1){
                    
                    segMaior = valor3;
                    menor = valor1;
                    
                }
                else{
                    
                    segMaior = valor1;
                    menor = valor3;
                }
            }
            else{
                
                maior = valor3;
                
                if (valor1 > valor2){
                    
                    segMaior = valor1;
                    menor = valor2;
                }
                else{
                    segMaior = valor2;
                    menor = valor1;
                }
            }
        }
        
        System.out.println(menor+", "+segMaior+", "+maior);
    }
    static void q38(){
        int a, b, c;
        
        System.out.println("Lado A");
        a = sc.nextInt();
        System.out.println("Lado B");
        b = sc.nextInt();
        System.out.println("Lado C");
        c = sc.nextInt();
        
        if ((a < (b + c)) && (b < (a + c)) && (c < (b + a))){
            
            System.out.println("Forma um triângulo");
        }
        else{
            
            System.out.println("Não forma um triângulo");
        }
    }
    static void q39(){
    
        String timeA, timeB;
        int golsA, golsB;
    
        System.out.println("Nome de time...");
        timeA = sc.next();
        System.out.println("Nome de time...");
        timeB = sc.next();
    
        System.out.println("Gols do time "+timeA+": ");
        golsA = sc.nextInt();
        System.out.println("Gols do time "+timeB+": ");
        golsB = sc.nextInt();
        
        if (golsA == golsB){
            
            System.out.println("Empate");
        }
        else{
            
            if (golsA > golsB){
                
                System.out.println(timeA);
            }
            else{
                
                System.out.println(timeB);
            }
        }
}
    static void q40(){
        
        int valor1, valor2;
        
        System.out.println("Valor 1: ");
        valor1 = sc.nextInt();
        System.out.println("Valor 2: ");
        valor2 = sc.nextInt();
        
        if (valor1 == valor2){
            
            System.out.println("Números iguais");
        }
        else{
            
            if(valor1 > valor2){
                
                System.out.println("Primeiro é maior");
            }
            else{
                
                System.out.println("Segundo é maior");
            }
        }
    }
    static void q41(){
        int x, y, z;
        char resposta;
        
        System.out.println("Insira x...");
        x = sc.nextInt();
        System.out.println("Insira Y...");
        y = sc.nextInt();
        
        z = (x * y) + 5;
        
        if (z <= 0){
            
            resposta = 'A';
        }
        else{
            
            if (z <= 100){
                
                resposta = 'B';
            }
            else{
                
                resposta = 'c';
            }
        }
        
        System.out.println(z+" "+resposta);
    }
    static void q42(){
        
        int litros;
        double pagar = 0;
        String tipo;
        
        System.out.println("Selecione o combustivel A-alcool ou G-Gasolina...");
        tipo = sc.next();
        System.out.println("Quantidade em litros...");
        litros = sc.nextInt();
        
        switch(tipo){
            
            case "A":
                
                if (litros > 20){
                    
                    pagar = 2.90 - (2.90 * 0.03);
                }
                else{
                    pagar = 2.90 - (2.90 * 0.05);
                }
                break;
                
            case "G":
                if (litros > 20){
                    
                    pagar = 3.30 - (3.30 * 0.04);
                }
                else{
                    pagar = 3.30 - (3.30 * 0.06);
                }
                break;
                
            default:
                System.out.println("Opição invalida!");
        }
        
        System.out.println("Valor a pagar: "+pagar);
    }
    static void q43(){
        
        int idHo1, idHo2, idMu1, idMu2, maH, maM, nH, nM;
        
        System.out.println("Idade homem");
        idHo1 = sc.nextInt();
        System.out.println("Idade mulher");
        idMu1 = sc.nextInt();
        System.out.println("Idade homem");
        idHo2 = sc.nextInt();
        System.out.println("Idade mulher");
        idMu2 = sc.nextInt();
        
        if (idHo1 > idHo2){
            
            maH = idHo1;
            nH = idHo2;
        }
        else{
            
            maH = idHo2;
            nH = idHo1;
        }
        
        if (idMu1 > idMu2){
            
            maM = idMu1;
            nM = idMu2;
        }
        else{
            
            maM = idMu2;
            nM = idMu1;
        }
        System.out.println("Soma de idades "+ maH + nM);
        System.out.println("Produto de idades "+maM + nH);
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
        //q26();
        //q27();
        //q28();
        //q29();
        //q30();
        //q31();
        //q32();
        //q33();
        //q34();
        //q35();
        //q36();
        //q37();
        //q38();
        //q39();
        //q40();
        //q41();
        //q42();
       
    }
    
}
