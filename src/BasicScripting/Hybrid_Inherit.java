package BasicScripting;

class One {
	void cow() {
		System.out.println("Cow call Hamba");
	}

}

class Two {
	void hourse() {
		System.out.println("Hourse call e hih hih");
	}
}

class Three extends Two {
	void rockstar() {
		System.out.println("Rockstar call Kuccuru ku");
	}

}

class Hybrid_Inherit extends Three {
	void Cat() {
		System.out.println("Cat call Mew Mew");

	}

	public static void main(String[] args) {
		System.out.println("We love pets");
		Hybrid_Inherit h = new Hybrid_Inherit();
		h.rockstar();
		h.hourse();
		h.Cat();
		One n=new One();
		n.cow();
		

	}

}
