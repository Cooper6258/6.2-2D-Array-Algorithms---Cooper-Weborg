public class App {
    public static void main(String[] args) throws Exception {
    String[][] stars = {{"*", "*", "*", "*", "*"},
                          {"*", "*", "*", "*", "*"},
                          {"*", "*", "*", "*", "*"},
                          {"*", "*", "*", "*", "*"},
                          {"*", "*", "*", "*", "*"}};

    int[][] numbers = {{-8, -4, 90, 42, 88},
                       {51, 19, -6, -7, -4}, 
                       {60, -3, -4, -2, 10}};
    
    for(int i = 0; i <numbers.length; i++){
        for(int j = 0 ; j < numbers[i].length; j++ ){
            System.out.print(numbers[i][j] + " ");
        }
    System.out.println();
    }

    System.out.println();

    for(int i = 0; i < stars.length; i++){
        for(int j = 0; j < stars[i].length; j++){
            if(i >= j){
                System.out.print(stars[i][j] + " ");
            }
            
        }
    System.out.println();
    }

    System.out.println();

    int sum = 0;
    for(int i = 0; i < numbers.length; i++){
        for(int j = 0 ; j < numbers[i].length; j++ ){
            sum += numbers[i][j];
        }
    }   
    System.out.println(sum);
    }
}
