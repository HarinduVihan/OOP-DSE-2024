public class Polymorphism
{
   public static void main(String[]args)
	{
	 Animal a1 = new Animal();
	 Animal p1 = new Pig();
	 a1.animalSound();
	 p1.animalSound();
	}
}


//parent
class Animal
{
   public void animalSound()
	{
	  System.out.println("Animal makes a sound");
	}
}

//child
class Pig extends Animal
{
    public void animalSound()
	{
	  System.out.println("Pig says: Oink Oink");
	}
}

	  
	