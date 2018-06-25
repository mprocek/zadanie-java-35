import java.util.Scanner;

public class Magazyn {
    public static void main(String[] args) {

        Buty[] tab = new Buty[3];
        boolean loop;

        Scanner scan = new Scanner(System.in);

        for(int i=0; i<tab.length; i++){
            do {
                loop=true;
                System.out.println("Wprowadź dane " + (i+1) + ":");
                tab[i]= new Buty(scan.nextLine(),scan.nextInt());
                scan.nextLine();
                for(int y=0; y<tab.length; y++){
                    if (y!=i){
                        if (tab[i].equals(tab[y]))
                            loop=false;
                        }
                    }

                if (loop==false)
                    System.out.println("Duplikat");
            } while(!loop);
        }

        for (Buty buty:tab ) {
            System.out.println(buty.toString());
        }
    }
}
