package Salario_Bruto;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculaSalario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        System.out.println("Quanto você ganha por hora? ");
        double valorPorHora = entrada.nextDouble();
        System.out.println("Quantas horas você trabalhou este mês? ");

        double horasTrabalhadas = entrada.nextDouble();
        double salarioBruto = valorPorHora * horasTrabalhadas;
        System.out.println("\nSalário Bruto: R$ " +formato.format(salarioBruto));

        double horasExtras =0;
        double valorHoraExtra = 0;

        if(horasTrabalhadas > 160 ){
            horasExtras = horasTrabalhadas - 160;
            valorHoraExtra = horasExtras * valorPorHora * 0.5;
            System.out.println("Valor das horas extras : R$ "+formato.format(valorHoraExtra) );
        }

        double impostoRenda = 0.11 * (salarioBruto + valorHoraExtra);

        double salarioLiquido = (salarioBruto + valorHoraExtra) - impostoRenda;

        System.out.println("Salário liquido: R$ "+formato.format(salarioLiquido));

        System.out.println("\n===== DESCRIÇÃO DETALHADA ======");
        System.out.println("Salário Bruto: R$ "+formato.format(salarioBruto));
        System.out.println("Valor das Horas Extras: R$ "+formato.format(valorHoraExtra));
        System.out.println("Valor do Imposto de Renda: R$ "+formato.format(impostoRenda));
        System.out.println("Salário Liquido: R$ "+formato.format(salarioLiquido));

        entrada.close();

    }
}
