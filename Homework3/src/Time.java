// Jasmine Chin 111717723

import java.time.LocalDateTime;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		LocalDateTime currentTime = LocalDateTime.now();
		this.hour = currentTime.getHour();
		this.minute = currentTime.getMinute();
		this.second = currentTime.getSecond();
	}
	
	public Time(long elapseTime) {
		second += (int) (elapseTime/1000);
		minute += (int) (second/60);
		second = second % 60;
		hour += (int) (minute/60);
		minute = minute % 60;
		hour = hour % 24;
	}
	
	public Time(int givenHr, int givenMin, int givenSec) {
		hour = givenHr;
		minute = givenMin;
		second = givenSec;
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	public void setTime(long elapseTime) {
		second += (int) (elapseTime/1000);
		minute += (int) (second/60);
		second = second % 60;
		hour += (int) (minute/60);
		minute = minute % 60;
		hour = hour % 24;
	}
	
	public String toString() {
		return hour + " : " + minute + " : " + second;
	}

	public static void main(String[] args) {
		Time time1 = new Time();
		Time time2 = new Time(555550000);
		System.out.println(time1);
		System.out.println(time2);
		Time time3 = new Time(3,4,5);
		time3.setTime(60000);
		System.out.print(time3.getHour() + " : " + time3.getMinute() + " : " + time3.getSecond());
	}

}
