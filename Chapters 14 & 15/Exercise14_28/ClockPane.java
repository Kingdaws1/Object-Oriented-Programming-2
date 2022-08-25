import java.util.Calendar;
import java.util.GregorianCalendar;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;

public class ClockPane extends Pane{
	private int hour;
	private int minute;
	private int second;
	boolean hourHandVisible = true;
	boolean minuteHandVisible = true;
	boolean secondHandVisible = true;
	
	private double w = 250, h = 250;
	
	public ClockPane() {
		setCurrentTime();
	}
	
	public ClockPane(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		paintClock();
	}
	
	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		this.hour = hour;
		paintClock();
	}
	
	public int getMinute() {
		return minute;
	}
	
	public void setMinute(int minute) {
		this.minute = minute;
		paintClock();
	}
	
	public int getSecond() {
		return second;
	}
	
	public void setSecond(int second) {
		this.second = second;
		paintClock();
	}
	
	public boolean getHourHandVisible() {
		return hourHandVisible;
	}
	
	public void setHourHandVisible(boolean isVisible) {
		this.hourHandVisible = isVisible;
		paintClock();
	}
	
	public boolean getMinuteHandVisible() {
		return minuteHandVisible;
	}
	
	public void setMinuteHandVisible(boolean isVisible) {
		this.minuteHandVisible = isVisible;
		paintClock();
	}
	
	public boolean getSecondHandVisible() {
		return secondHandVisible;
	}
	
	public void setSecondHandVisible(boolean isVisible) {
		this.secondHandVisible = isVisible;
		paintClock();
	}
	
	public double getW() {
		return w;
	}
	
	public void setW(double w) {
		this.w = w;
		paintClock();
	}
	
	public double getH() {
		return h;
	}
	
	public void setH(double h) {
		this.h = h;
		paintClock();
	}
	
	public void setCurrentTime() {
		Calendar calendar = new GregorianCalendar();
		this.hour = calendar.get(Calendar.HOUR_OF_DAY);
		this.minute = calendar.get(Calendar.MINUTE);
		this.second = calendar.get(Calendar.SECOND);
		
		paintClock();
	}
	
	protected void paintClock() {
		double clockRadius = Math.min(w, h) * 0.8 * 0.5;
		double centerX = w / 2;
		double centerY = h / 2;
		
		Circle circle = new Circle(centerX, centerY, clockRadius);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		getChildren().add(circle);
		Text t1 = new Text(centerX - 5, centerY - clockRadius + 12, "12");
		getChildren().add(t1);
		Text t2 = new Text(centerX - clockRadius + 3, centerY + 5, "9");
		getChildren().add(t2);
		Text t3 = new Text(centerX + clockRadius - 10, centerY + 3, "3");
		getChildren().add(t3);
		Text t4 = new Text(centerX - 3, centerY + clockRadius - 3, "6");
		getChildren().add(t4);
		
		if (getSecondHandVisible() == true) {
			double sLength = clockRadius * 0.8;
			double secondX = centerX + sLength * Math.sin(second * (2 * Math.PI / 60));
			double secondY = centerY - sLength * Math.cos(second * (2 * Math.PI / 60));
			Line sLine = new Line(centerX, centerY, secondX, secondY);
			sLine.setStroke(Color.RED);
			getChildren().add(sLine);
		}
		
		if (getMinuteHandVisible() == true) {
			double mLength = clockRadius * 0.65;
			double minuteX = centerX + mLength * Math.sin(minute * (2 * Math.PI / 60));
			double minuteY = centerY - mLength * Math.cos(minute * (2 * Math.PI / 60));
			Line mLine = new Line(centerX, centerY, minuteX, minuteY);
			mLine.setStroke(Color.BLUE);
			getChildren().add(mLine);
		}
		
		if (getHourHandVisible() == true) {
			double hLength = clockRadius * 0.5;
			double hourX = centerX + hLength * Math.sin((hour % 12 + minute / 60) * (2 * Math.PI / 12));
			double hourY = centerY - hLength * Math.cos((hour % 12 + minute / 60) * (2 * Math.PI / 12));
			Line hLine = new Line(centerX, centerY, hourX, hourY);
			hLine.setStroke(Color.GREEN);
			getChildren().add(hLine);
		}
		
	}
	
}
