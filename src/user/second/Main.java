package user.second;

public class Main {

	
	public static void main(String[] args) {
		final Number num = new Number(Math.random());
		boolean watcher=false;
		int counter=1;
		while(!watcher){
			double tempNum=Math.random();
			if(num.isInThreshold(tempNum)){
				watcher=true;
			}
			counter++;
		}
		

	}

}
