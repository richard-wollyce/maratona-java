package richardwollyce.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    static void main(String[] args) {
        // 1,2,3,4,5 meses
        // 31,28,31,30 dias
        int[][] quantidadeDeDias = new int[3][3];

        quantidadeDeDias[0][0] = 31;
        quantidadeDeDias[0][1] = 28;
        quantidadeDeDias[0][2] = 31;

        quantidadeDeDias[1][0] = 31;
        quantidadeDeDias[1][1] = 28;
        quantidadeDeDias[1][2] = 31;

        quantidadeDeDias[2][0] = 31;
        quantidadeDeDias[2][1] = 28;
        quantidadeDeDias[2][2] = 31;

        for (int i = 0; i < quantidadeDeDias.length; i++) {
            for (int j = 0; j < quantidadeDeDias[i].length; j++) {
                System.out.println(quantidadeDeDias[i][j]);
            }

        }

        System.out.println("------------------");

        for (int[] arrBase : quantidadeDeDias){
            for (int num: arrBase) {
                System.out.println(num);
            }
        }
    }
}
