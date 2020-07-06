/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleção_de_exercicios;

/**
 *
 * @author Luciana
 */
import java.util.Scanner;
public class Seleção_de_Exercicios 
{
    
    public static void geD()
    {
         Scanner entrada = new Scanner (System.in);
       String sx;
       System.out.print("Informe seu sexo [M/F]: ");
       sx = entrada.nextLine();
       System.out.print("Dígite sua idade: ");
       int ano = entrada.nextInt();
       System.out.print("Dígite sua altura: ");
       double alt = entrada.nextDouble();
       System.out.print("Dígite seu peso: ");
       double peso = entrada.nextDouble();
       
       if ("M".equals(sx))
       {
           double gebm = 66.47 + (13.75 * peso) + (5 * alt) - (6.76 * ano);
           System.out.println(gebm);
       }
       else
       {
           if ("F".equals(sx))
           {
               double gebf = 665.1 + (9.56 * peso) + (1.85 * alt) - (4.67 * ano);
               System.out.println(gebf);
           }
       }
    }
    
    public static void numExtenso()
    {
        Scanner ent = new Scanner(System.in);
        double a, c, d, u;
        
        System.out.print("Dígite um número entre 0 e 999: \n");
        a = ent.nextDouble();
        
        if (a<0 || a>999)
        {
            System.out.print("O número é inválido. \n");
        }
        else
        {
            System.out.print("O número por extenso é: \n");
            
            if (a==0)
            {
                System.out.print("Zero");                
            }
            else
            {
                c = Math.floor(a/100);
                d = Math.floor((a%100)/10);
                u = Math.floor((a%100)%100);
                
                int cll=(int)c;
                int dll=(int)d;
                int ull=(int)u;
                
                String cs, ds, us;
                cs=Double.toString(c);
                ds=Double.toString(d);
                us=Double.toString(u);
                
                char ci = cs.charAt(0);
                char di = ds.charAt(0);
                char ui = us.charAt(0);
                
                if (cll==1 && dll==0 && ull==0)
                {
                    System.out.print("Cem \n");
                }
                else
                {
                    switch(ci)
                    {
                        case '0': System.out.print(" ");break;
                        case '1': System.out.print("Cento");break;
                        case '2': System.out.print("Duzentos");break;
                        case '3': System.out.print("Trezentos");break;
                        case '4': System.out.print("quatrocentos");break;
                        case '5': System.out.print("Quinhentos");break;
                        case '6': System.out.print("Seiscentos");break;
                        case '7': System.out.print("Setecentos");break;
                        case '8': System.out.print("Oitocentos");break;
                        case '9': System.out.print("Novecentos");break;
                        default: System.out.print("Erro");
                    }
                    
                    if (ull!=0 && dll!=0 && cll!=0)
                    {
                        System.out.print(" e ");
                    }
                    if(dll!=1)
                    {
                        switch(di)
                        {
                            case '0': System.out.print("");break;
                            case '1': System.out.print("Dez");break;
                            case '2': System.out.print("Vinte");break;
                            case '3': System.out.print("Trinta");break;
                            case '4': System.out.print("Quarenta");break;
                            case '5': System.out.print("Cinquenta");break;
                            case '6': System.out.print("Sessenta");break;
                            case '7': System.out.print("Setenta");break;
                            case '8': System.out.print("Oitenta");break;
                            case '9': System.out.print("Noventa");break;
                        }
                    }
                    else
                    {
                        switch(ui)
                        {
                            case '1': System.out.print("Doze");break;
                            case '2': System.out.print("Doze");break;
                            case '3': System.out.print("Treze");break;
                            case '4': System.out.print("Quatorze");break;
                            case '5': System.out.print("Quinze");break;
                            case '6': System.out.print("Dezesseis");break;
                            case '7': System.out.print("Dezessete");break;
                            case '8': System.out.print("Dezoito");break;
                            case '9': System.out.print("Dezenove");break;
                            default: System.out.print("Erro");
                        }
                    }
                    if (((ull!=0) &&(dll!=1) && cll!=0) || ((dll!=0) && (cll!=0) && (ull!=0)))
                    {
                        System.out.print(" e ");
                    }
                    if(dll!=1)
                    {
                        switch(ui)
                        {
                            case '0': System.out.println("");break;
                            case '1': System.out.println("Um");break;
                            case '2': System.out.println("Dois");break;
                            case '3': System.out.println("Três");break;
                            case '4': System.out.println("Quatro");break;
                            case '5': System.out.println("Cinco");break;
                            case '6': System.out.println("Seis");break;
                            case '7': System.out.println("Sete");break;
                            case '8': System.out.println("Oito");break;
                            case '9': System.out.println("Nove");break;
                            default: System.out.print("Erro");
                        }
                    }
                }
                System.out.print("\n");
            }
        }
    }
    
    public static void multiplos()
    {
        Scanner entrada;
        int a,b;

        entrada = new Scanner(System.in);
        
        System.out.print("Dígite um número. \n");
        a = entrada.nextInt();
        System.out.print("Dígite outro número. \n");
        b = entrada.nextInt();
        if((a%b)==0)
        {
            System.out.println("Os números digitados são multiplos.");
        }
        else
        {
            System.out.println("Não são multiplos.");
        }
    }
    
    public static void ordem()
    {
        Scanner entrada;
        int i;
        double a,b,c,maior = 0,menor = 0,meio = 0;
        
        entrada = new Scanner(System.in);
        
        System.out.print("Dígite um número de 1 a 3. \n");
        i = entrada.nextInt();
        System.out.print("Dígite o primeiro valor. \n");
        a = entrada.nextDouble();
        System.out.print("Dígite o segundo valor. \n");
        b = entrada.nextDouble();
        System.out.print("Dígite o terceiro valor. \n");
        c = entrada.nextDouble();
        
        if ((a>b)&&(a>c))
        {
            maior = a;
        }
        else
        {
            if ((b>a)&&(b>c))
            {
                maior=b;
            }
            else
            {
                if ((c>a)&&(c>b))
                {
                    maior=c;
                }
            }
        }
        if ((a<b)&&(a<c))
        {
            menor=a;
        }
        else
        {
            if ((b<a)&&(b<c))
            {
                menor=b;
            }
            else
            {
                if ((c<a)&&(c<b))
                {
                    menor=c;
                }
            }
        }
        if (i==1)
        {
            System.out.println("Ordem crescente: "+menor+""+meio+""+maior);
        }
        else
        {
            if (i==2)
            {
                System.out.println("Ordem decrescente: "+maior+""+meio+""+menor);
            }
        }
    }
    
    public static void empresaNatal()
    {
        Scanner entrada;
        int hora_extra, hora_falta, premio = 0, h, conv1, conv2;
        
        entrada = new Scanner(System.in);
        
        System.out.print("Informe o número de horas extras em minutos. \n");
        hora_extra = entrada.nextInt();
        System.out.print("Informe o número de horas de falta em minutos. \n");
        hora_falta = entrada.nextInt();
        
        h = (hora_extra)-(2/3*(hora_falta));
        conv1 = hora_extra/60;
        conv2 = hora_falta/60;
        
        if (h>2400)
        {
            premio=500;
        }
        else
        {
            if (h>1801 && h <= 2400)
            {
                premio=400;
            }
            else
            {
                if (h >1201 && h <= 1800)
                {
                    premio=300;
                }
                else
                {
                    if (h >600 && h <= 1200)
                    {
                        premio=200;
                    }
                    else
                    {
                        if (h <= 600)
                        {
                            premio=100;
                        }
                    }
                }
            }
        }
        System.out.println("O valor em horas extra é:"+conv1+"\n"+"O valor de horas em falta é: "+conv2+"\n"+"O valor do premio é: "+premio);
    }
    
    public static void horario()
    {
        Scanner entrada;
        double hrEnt, resu;
        
        entrada = new Scanner(System.in);
        
        System.out.print("Insirá o horário de entrada: ");
        hrEnt = entrada.nextDouble();       
        
        resu = hrEnt+6;
        
        System.out.println("Sairá as: "+resu);
    }
    
    public static void sequenciaInt()
    {
        Scanner entrada = new Scanner(System.in);
        
        float i=0;
        float fat = 1;
        float a = 1;
        
        while (a>=0)
        {
            System.out.print("Dígite um número: ");
            a = entrada.nextInt();
            fat+=a;
            i++;
        }
        System.out.println( fat/(i-1));
    }
        
    
    public static void cardapio()
    {
        Scanner entrada;
        String cd;
        int qtd;
        double pc;
        
        entrada = new Scanner(System.in);
        
        System.out.println("C - Cachorro quente = R$2,00");
        System.out.println("R - Refrigerante = R$2,50");
        System.out.println("S - Sobremesa = R$1,50"); 
        
        
        System.out.print("Dígite o código do pedido: ");
        cd = entrada.nextLine();
        System.out.print("Dígite a quantidade: ");
        qtd = entrada.nextInt();
        
        int i = 1;
        double pcn = 0;
        while(i!=0)
        {
            if(null == cd)
            {
                System.out.println("só aceita os códigos (C, R e S em Maiusculo");
            }
            else
            {
                switch (cd)
                {
                    case "C":
                        pc = 2*qtd;
                        System.out.println(qtd+" Cachorro quente é R$"+pc);
                        pcn += pc;
                        break;
                    case "R":
                        pc = 2.5*qtd;
                        System.out.println(qtd+" Refrigerante é R$"+pc);
                        pcn += pc;
                        break;
                    case "S":
                        pc = 1.5*qtd;
                        System.out.println(qtd+" Sobremesa é R$"+pc);
                        pcn += pc;
                        break;
                    default:
                        System.out.println("Só aceita os códigos (C, R, S em Maiusculo ");
                        break;
                }
                System.out.print("Dígite x para sair ou qualquer letra para continuar: ");
                String ss = entrada.next();
                if("X".equals(ss))
                {
                    System.out.println("O preço total sairá R$"+ pcn);
                    i = 0;
                }
                else
                {
                    System.out.print("Dígite o código do alimento: ");
                    cd = entrada.next();
                    System.out.print("Dígite a quantidade: ");
                    qtd = entrada.nextInt();
                    i = 1;
                }
                System.out.println();
            }
        }
    }
    
    public static void somaDosPrimeiros()
    {
        Scanner entrada;
        int n,i,soma;
        
        entrada = new Scanner(System.in);
        
        System.out.print("Dígite um valor: ");
        n = entrada.nextInt();
        soma=0;
        i=1;
        
        while (1<=n)
        {
            soma=soma+i;
            i=i+1;
        }
        System.out.println("A soma dos "+n+"primeiros números é: "+soma);      
    }
    
    public static void somaDosPrimos()
    {
        Scanner entrada = new Scanner(System.in);
        int i, j, somaPrim = 2, quantDiv = 0, n;
        
        System.out.print("Dígite um número: ");
        n = entrada.nextInt();
        
        for (i=3;i<=n;i+=2)
        {
            quantDiv=0;
            for (j = 1; j <= i; j++)
            {
                if  (i % j == 0)
                {
                    quantDiv++;
                }
                if (quantDiv > 2)
                {
                    break;
                }
            }
            if (quantDiv == 2)
            {
                somaPrim += i;
            }
        }
        System.out.println("A soma dos números primos é: "+somaPrim);
    }
            
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        String prgm;
        
        System.out.println("Programas");
        System.out.println("\n");
        System.out.println("1 - GEB\n- 0 a 900 por extenso\n3- multiplos ou não?\n"
        + "4- Ordem crescente ou decrescente\n5- Natal da Empresa\n6- Horário de entrada e saída\n"
        + "7- Média da sequência\n8- Lanchonete\n9- Soma dos N primeiros\nx- Soma dos primos\n");
        System.out.print("Dígite o número do programa que deseja: ");
        prgm = entrada.nextLine();
        
        char pg = prgm.charAt(0);
        while (pg != 0)
        {
            switch (pg)
            {
                case '0':   System.exit(0);break;
                case '1':   geD();break;
                case '2':   numExtenso();break;
                case '3':   multiplos();break;
                case '4':   ordem();break;
                case '5':   empresaNatal();break;
                case '6':   horario();break;
                case '7':   sequenciaInt();break;
                case '8':   cardapio();break;
                case '9':   somaDosPrimeiros();break;
                case 'x':  somaDosPrimos();break;
            }
            System.out.print("Dígite o número do programa que deseja: ");
            prgm = entrada.nextLine();
            pg = prgm.charAt(0);
        }
    }
    
}
