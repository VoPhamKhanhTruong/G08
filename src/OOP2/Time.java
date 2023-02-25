package OOP2;

public class Time {
	int hour;
	int minute;
	int second;

	public Time(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	
	public void setTime(int hour,int minute, int second) {
		
	}
	
	public Time nextSecond() {
		Time time = new Time(hour,minute,second);
		if(time.second<59)
		{
			time.second++;
		}
		else {
			time.second = 0;
			if(time.minute<59) 
			{
				time.minute++;
			}
			else {
				time.second = 0;
				if(time.hour < 23)
				{
					time.hour++;
				}
				else
				{
					time.hour = 0;
				}
			}
		}
		return time;
	}
	
	public Time previousSecond() {
		return previousSecond();
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d",hour,minute,second);
	}
}
