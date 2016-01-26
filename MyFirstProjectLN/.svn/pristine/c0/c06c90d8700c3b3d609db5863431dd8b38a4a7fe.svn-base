package ru.spec.java1.lec4;

public enum Menu {
	MAIN("Главная"){
		@Override
		public void action() {
			System.out.println("go to " + this);
		}
	},
	PROJECTS("Проекты"),
	PROJECT_1("Проект 1", PROJECTS),
	SUB_PROJECT_1_1("Подпроект 1.1", PROJECT_1), // Подпроект 1.1 >> Проект 1 >> Проекты
	PROJECT_2("Проект 2", PROJECTS),
	ABOUT("О нас"),
	HELP("Поддержка");
	
	private Menu() {
	}

	private Menu(String title) {
		this.title = title;
	}
	
	private Menu(String title, Menu parent) {
		this.title = title;
		this.parent = parent;
	}
	
	String title;
	Menu parent;
	
	public void action(){
		System.out.println("no action");
	}
	
	public String toString() {
		String res="";
		if(parent!=null){
			res+=parent+" << ";
		}
		
//		for(Menu tmp = this; tmp != null ; tmp=tmp.parent){
//			res+= (tmp.title == null ? tmp.name():tmp.title) + " >> ";
//		}
		return res+ (title == null ? name():title);
//		return res;
	};
}
