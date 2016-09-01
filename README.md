# queru
trabajo de programación I
public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int ancho;
        System.out.println("Ingrese el ancho : ");
        ancho = lector.nextInt();
        System.out.println("introdusca el alto: ");
        int alto;
        alto = lector.nextInt();
        for (int a = 0; a < alto; a++) {
            System.out.println("");
            for (int i = 0; i < ancho; i++) {
                System.out.print("*");
                
            }
        }
    }
}
