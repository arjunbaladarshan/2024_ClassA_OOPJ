class Time{
	int days;
	int hours;
	int miniutes;
	int seconds;
	public Time(){
		hours = 0;
		miniutes = 0;
		seconds = 0;
	}

	public Time(int hours, int miniutes, int seconds){
		this.hours = hours;
		this.miniutes = miniutes;
		this.seconds = seconds;
	}

	public Time substract(Time temp){
		Time ans = new Time();
		ans.hours = this.hours - temp.hours;
		ans.miniutes = this.miniutes - temp.miniutes;
		ans.seconds = this.seconds - temp.seconds;

		if(ans.seconds<0){
			ans.seconds = 60+ans.seconds;
			ans.miniutes--;
		}
		if(ans.miniutes<0){
			ans.miniutes = 60+ans.miniutes;
			ans.hours--;
		}
		if(ans.hours>24){
			ans.days+= ans.hours/24;
			ans.hours = ans.hours%24;
			
		}
		return ans;
	}

	public void print(){
		System.out.println("Days ="+days+", Hour = "+hours+", Minutes = "+miniutes+", Seconds = "+seconds);
	}
}
public class TimeDemo{
	public static void main(String[] args) {
		Time t1 = new Time(12,51,00);
		Time t2 = new Time(75,00,00);
		Time ans = t2.substract(t1);
		ans.print();
	}
}