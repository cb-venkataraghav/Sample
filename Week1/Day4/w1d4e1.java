import java.util.*;

abstract class Animals{

	
}

 class Mammal extends Animals{

	
}


class Bird extends Animals{

}

class bat extends Mammal implements fly,herb{

} 

interface herb{

 	boolean is_herbivore = true;

}
interface not_herb{

	boolean is_herbivore = false;
}
interface fly{

        boolean can_fly = true;

}
interface cant_fly{

        boolean can_fly = false;
}
class  dog extends Mammal implements cant_fly,not_herb{
}


class  cow extends Mammal implements cant_fly, herb{

}

class  ostrich extends Bird implements cant_fly,not_herb{

} 

class  parrot extends Bird implements fly,herb{

} 

class w1d4e1{

	public static void main(String[] args){

	bat b = new bat();

	cow c = new cow();

	dog d = new dog();

	ostrich o = new ostrich();

	parrot p = new parrot();

	System.out.println("Animals that are herbivores...");

	if(b.is_herbivore)

		System.out.println("Bat");

	if(c.is_herbivore)

                System.out.println("Cow");

	if(d.is_herbivore)

                System.out.println("Dog");

	if(o.is_herbivore)

                System.out.println("Ostrich");

	if(p.is_herbivore)

                System.out.println("Parrot");

	
	System.out.println("Animals that can fly...");

        if(b.can_fly)

                System.out.println("Bat");

        if(c.can_fly)
        
                System.out.println("Cow");

        if(d.can_fly)

                System.out.println("Dog");

        if(o.can_fly)

                System.out.println("Ostrich");

        if(p.can_fly)

                System.out.println("Parrot");


	}


}
