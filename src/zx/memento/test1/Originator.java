package zx.memento.test1;

public class Originator {
	
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public void show(){
		System.out.println("State="+state);
	}

	public Memento createMemento(){
		return new Memento(state);
	}
	
	public void setMemento(Memento memento){
		this.state=memento.getState();
	}

}
