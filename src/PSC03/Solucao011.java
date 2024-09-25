package PSC03;

import javax.swing.JOptionPane;

public class Solucao011 {
    public static void main(String[] args) {
        int iCodigo, iTipo;
        double dKWh, dCusto;
        double dTotalResidencial = 0, dTotalComercial = 0, dTotalIndustrial = 0;
        int iCountResidencial = 0, iCountComercial = 0;

        while (true) {
            iCodigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do consumidor (0 para sair e mostrar o Resumo das contas.):"));
            if (iCodigo == 0) break;

            dKWh = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de kWh consumidos:"));

            iTipo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo do consumidor (1-Residencial, 2-Comercial, 3-Industrial):"));

            switch (iTipo) {
                case 1:
                    dCusto = dKWh * 0.3;
                    dTotalResidencial += dKWh;
                    iCountResidencial++;
                    break;
                case 2:
                    dCusto = dKWh * 0.5;
                    dTotalComercial += dKWh;
                    iCountComercial++;
                    break;
                case 3:
                    dCusto = dKWh * 0.7;
                    dTotalIndustrial += dKWh;
                    break;
                default:
                System.out.println("Tipo de consumidor inválido!");
                continue;
        }

        System.out.println(String.format("Custo total para o consumidor: " + iCodigo +  " R$ " + dCusto));
    }

    double dMediaResidencial = iCountResidencial > 0 ? dTotalResidencial / iCountResidencial : 0;
    double dMediaComercial = iCountComercial > 0 ? dTotalComercial / iCountComercial : 0;

    System.out.printf("Total de consumo residencial:" + dTotalResidencial + " kWh%n");
    System.out.printf("Total de consumo comercial:" + dTotalComercial + " kWh%n");
    System.out.printf("Total de consumo industrial:" + dTotalIndustrial + " kWh%n");
    System.out.printf("Média de consumo residencial:" + dMediaResidencial + " kWh%n");
    System.out.printf("Média de consumo comercial:" + dMediaComercial + " kWh%n");
}
}