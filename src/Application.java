
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world"); // shortcut: syso (ctrl+space)
		
		// met "new" kunnen we een nieuwe product object aanmaken
		Product product1 = new Product();
		Product product2 = new Product();
		
		// Passen we de gegevens van product 1 aan
//		product1.name = "TV";
//		product1.price = 123;
		product1.setName("TV");
		product1.setPrice(250);
		product1.printPrice();
		
		// Passen we de gegevens aan van product 2
//		product2.name = "Laptop";
//		product2.price = 850;
		product1.setName("Laptop");
		product2.setPrice(20.50);
		product2.printPrice();
		
//		System.out.println("Product 2 prijs is " + product2.price);
		
		boolean outcome = product2.isExpensive();
		System.out.println("Product 2 duur: " + outcome + "\n");
		
		Product product3 = new Product(34.75);
		System.out.println("Product 3 prijs: " + product3.getPrice() + "\n");
		
		Dier kat = new Dier();
		Dier hond = new Dier();
		
		kat.naam = "Milo";
		kat.leeftijd = 3;
		kat.kleur = "zwart";
		kat.levend = true;
		kat.man = false;
		kat.printDetails();
		kat.setNaam("Milo2");
		System.out.println("Kat naam is " + kat.naam);
		
		hond.naam = "Riki";
		hond.leeftijd = 1;
		hond.kleur = "rood";
		hond.levend = true;
		hond.man = true;
		hond.printDetails();
		System.out.println("diernaam: " + hond.getNaam() + "\n");
		
		Dier egel = new Dier("Dirk", 15, "bruin", false, false);
		egel.printDetails();

	}

}
