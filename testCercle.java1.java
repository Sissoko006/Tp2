import java.util.Scanner;
class cercle
    {
       int r;
       public void initialise(int rayon)
      {
          r=rayon;
      }
    
    public double perimetre()
        {
          double p;
          p= r*2*3.14;
          return p;   
        }

    public double surface() 
        {
           double s;
           s= 3.14*r*r;
           return s;
        } 
    public void afficher()
    {  
         System.out.println("rayon =="+ r);

    }     
    }
public class testcercle
       {
          
          public static void main(String[] args) {
            Scanner nombre=new Scanner(System.in);
                System.out.println("Tapez les coordonne du cercle C1")
                System.out.println("Tapez la valeur de r1 : ");
                int r=nombre.nextInt();
                cercle c1=new cercle();
                c1.initialise(r);
                
                System.out.println("Tapez la valeur de r2 : ");
                int r2=nombre.nextInt();
                cercle c2=new cercle();
                c2.initialise(r2);

                double p1=c1.perimetre();
                double s1=c1.surface();
                System.out.println("le perimetre de r1 est :" + p1 +"  la surface de r1" + s1);
                double p2=c2.perimetre();
                double s2=c2.surface();
                System.out.println("le perimetre de r1 est :" + p2 +"  la surface de r1" + s2);

            }
    label(f2)
