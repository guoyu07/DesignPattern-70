package zx.observerpattern.test2;

public class NBAObserver extends Observer{

	public NBAObserver(String name, Subject sub) {
		super(name, sub);
	}

	@Override
	public void update() {
		System.out.println(sub.getSubjectState()+" "+name+" 关闭NBA直播继续工作！！！");
	}

}
