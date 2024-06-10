import java.util.Scanner;
class point 
 {
    int x;
    int y;
    int coul;
    public void initialise(int a, int b,int c)
        {
           x=a;
           y=b;
           coul=c;
        }

         
    public void afficher()
    {  
         System.out.println("x== "+ x);
         System.out.println("y== "+ y);
         System.out.println("couleur== "+ coul);

    } 
    public point somme(point Z)
    {
        point R = new point();
        R.x= x + Z.x ;
        R.y= y + Z.y ;
        R.coul = coul + Z.coul;

        return R ;
    }

}  
public class Testpoint1 
{
    public static void main(String[] args) {
    Scanner nombre=new Scanner(System.in);
        
        
        System.out.println("donner les coordonnes du pointA : ");
        System.out.println("tapez la valeur de AX");
        int x1=nombre.nextInt();
        System.out.println("Tapez la valeur de Ay : ");
        int y1=nombre.nextInt();
        System.out.println("Tapez la valeur de la couleur de A : ");
        int c1=nombre.nextInt();
        point A =new point();
        A.initialise(x1, y1, c1);

        System.out.println("entrer les cordonnes du point B");
        System.out.println("Tapez la valeur de Bx : ");
        int x2=nombre.nextInt();
        System.out.println("Tapez la valeur de By : ");
        int y2=nombre.nextInt();
        System.out.println("Tapez la valeur de la couleur de B : ");
        int c2=nombre.nextInt();
        point B=new point();
        B.initialise(x2, y2, c2);
        point C=new point();
        C=A.somme(B);

        A.afficher();
        B.afficher();

    }
   
} 