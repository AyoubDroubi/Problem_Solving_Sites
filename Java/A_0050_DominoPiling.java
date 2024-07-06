public class Domino_piling {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        Scanner ip = new Scanner(System.in);
        double a=ip.nextInt();
        double b=ip.nextInt();
        double c=a*b;
        System.out.println((int)Math.floor(c/2));
    }
}
