package vendadecarros;

import java.util.Scanner;


public class VendaDeCarros {

    public static void main(String[] args) {
      
        int AnoFabricação = 0;
        float ValorCarro = 0.0f;
        Scanner Leitor = new Scanner(System.in);
        float PorcentagemDesconto = 0.0f;
        float ValorDesconto = 0.0f;
        float ValorPagar = 0.0f;
        
        int TotalSeminovos = 0;
        int TotalCarros = 0;
        
        char DesejaRepetir = 's';
        while (DesejaRepetir == 's' || DesejaRepetir == 'S') {
            
            System.out.println("Digite o ano de fabricação do Veículo: ");
            AnoFabricação = Leitor.nextInt();
            System.out.println("Digite o valor do Veículo: ");
            ValorCarro = Leitor.nextFloat();
            
            if (AnoFabricação <= 2000){
                PorcentagemDesconto = 0.12f;
                
            }else{
                PorcentagemDesconto = 0.07f;
                TotalSeminovos++;
            }
            TotalCarros++;
            ValorDesconto = ValorCarro * PorcentagemDesconto;
            ValorPagar = ValorCarro - ValorDesconto;
            
            System.out.println("O desconto é de: " + ValorDesconto);
            System.out.println("O valor é de: " + ValorPagar);
            
            System.out.println("Deseja fazer mais cadastros: Digite S para sim "
                    + "e N para não!");
            DesejaRepetir = Leitor.next().charAt(0);
            
            
        }
        System.out.println("O Total de carros seminovos é de: " + 
                TotalSeminovos);
        System.out.println("O Total de carros: " + TotalCarros);
    }
    
}
