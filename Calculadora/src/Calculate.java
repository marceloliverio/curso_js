public class Calculate {

    public static void main (String[] args){
      int x = Integer.parseInt(args[1]);
      int y = Integer.parseInt(args[2]);

        if (args[0].equals("somar")) {
            soma(x, y);
        } else if (args[0].equals("subtrair")){
            subtrair(x, y);
    } else{
        System.out.println("Nenhuma função definida");
        }
    }

    static void soma( int x, int y){

        System.out.println(x +y);
    }
    static void subtrair( int x, int y){

        System.out.println(x - y);
    }
}

