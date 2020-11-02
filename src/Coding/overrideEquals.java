package Coding;

class overrideEquals {
	
	public String name;
	public int id;

	overrideEquals(String name, int id) {
		this.name = name;
		this.id = id;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (obj == null) return false;
//		if(obj.getClass()!=this.getClass()) return false;
//		if(!((overrideEquals)obj).name.equals(this.name)) return false;
//		if(((overrideEquals)obj).id != this.id) return false;
//		return true;
//	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if(obj.getClass()!=this.getClass()) return false;
		overrideEquals OverrideEquals = (overrideEquals) obj;
		if(!OverrideEquals.name.equals(this.name)) return false;
		if(OverrideEquals.id != this.id) return false;
		return true;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null || obj.getClass() != this.getClass())
//			return false;
//		Geek geek = (Geek) obj;
//		return (geek.name == this.name && geek.id == this.id);
//	}

	public static void main(String[] args) {
		overrideEquals g1 = new overrideEquals("aa", 1);
		overrideEquals g2 = new overrideEquals("aa", 1);

		if (g1.equals(g2)) {
			System.out.println("Both Objects are equal. ");
		} else {
			System.out.println("Both Objects are not equal. ");

		}
	}
}