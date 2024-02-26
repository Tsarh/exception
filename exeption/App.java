import java.util.*;

public class App
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.print("entrer votre age: ");
            int age = sc.nextInt(); // apres avoir executer cette instruction il va tout de suite lever une exception s'il y en a sinon il va executer le 13eme ligne
            System.out.println("vous avez "+ age +" ans");
        }
        catch(InputMismatchException e) // exception bien precie
        {
            System.out.println("il faut pas entrer des caractère mais des nombres"); 
        }
        catch(Exception e) // exception generale
        {
            System.out.println("ERREUR: "+ e.getMessage()); // executer si l'exception en haut n'est pas la bonne sinon jamais executer
        }
        finally 
        {
            System.out.println("ok :)"); // cette instruction s'execute toujour apres avoir executer une exception
        }
    }
}