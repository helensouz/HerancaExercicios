package br.com.herancaExercicios;

public class TestaAnimal {

	public static void main(String[] args) {

		Cavalo c1 = new Cavalo();
		Cachorro cachorro1 = new Cachorro();
		Preguica preguica1 = new Preguica();
		
		c1.setNome("Jubileu");
		c1.setIdade(5);
		c1.setSom("iiiiiihh");
		c1.setVelocidade(10);
		
		cachorro1.setNome("Thor");
		cachorro1.setIdade(5);
		cachorro1.setSom("auau");
		cachorro1.setVelocidade(1);
		
		preguica1.setNome("Bili");
		preguica1.setIdade(0);
		preguica1.setSom("iuiuiu");
		preguica1.setEscalada(1);
		
		System.out.println();
		
		System.out.println("O nome do Cavalo �: " + c1.getNome());
		System.out.println("Sua idade �: " + c1.getIdade());
		System.out.println("Seu som �: " + c1.getSom());
		System.out.println("Sua velocidade �: " + c1.getVelocidade());
		
		System.out.println();
		
		System.out.println("O nome do cachorro: " + cachorro1.getNome());
		System.out.println("Sua idade: " + cachorro1.getIdade());
		System.out.println("Seu som �: " + cachorro1.getSom());
		System.out.println("Sua velocidade por hora �: " + cachorro1.getVelocidade());
		
		System.out.println();
		
		System.out.println("O nome do cachorro: " + preguica1.getNome());
		System.out.println("Sua idade: " + preguica1.getIdade());
		System.out.println("Seu som �: " + preguica1.getSom());
		System.out.println("Sua velocidade por hora �: " + preguica1.getEscalada());
		
		
		
		
		
		
		
		
		
	}

}
