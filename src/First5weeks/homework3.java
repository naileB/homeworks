package First5weeks;

public class homework3 {
	public static void main(String[] args) {

		// Task1
		int num1 = 20;
		int num2 = 30;
		int max;

		if (num2 > num1) {
			max = num2;
		} else if (num1 > num2) {
			max = num1;

		} else {
			max = num1;

		}
		System.out.println(max);

		/*
		 * Task2 int hour = 12; int minute = 24; int second = 33; String amORpm = "PM";
		 * 
		 * System.out.println(hour + ":" +minute + ":" + second +" " + amORpm);
		 */

		int hour = 12;
		int minute = 24;
		int second = 33;
		String amORpm;
		if (hour >= 12) {
			amORpm = "pm";
			if (hour != 12)
				hour = hour - 12;

		} else {
			amORpm = "am";
		}
		System.out.println(hour + ":" + minute + ":" + second + " " + amORpm);

		// Task3
		int n1 = 11, n2 = 22, n3 = 33;
		String bigger;
		if (n2 > n1 && n2 > n3) {
			bigger = "n2";
		} else if (n1 > n2 && n1 > n3) {
			bigger = "n1";
		} else {
			bigger = "n3";
		}

		System.out.println(bigger + " is bigger");

		/*
		 * int n1 = 11, n2 = 22, n3 = 33; int maX; String bigger; if (n2>n1 && n2>n3) {
		 * max=n2; bigger= "n2"; } else if (n1>n2 && n1>n3) { max=n1; bigger= "n1"; }
		 * else{ max=n3; bigger= "n3"; } System.out.println(max + "is bigger value" );
		 * System.out.println(bigger + " is bigger");
		 */

//Task4
		int StatusCode = 500;
		if (StatusCode == 200)
			System.out.println("OK");
		else if (StatusCode == 201)
			System.out.println("Created");
		else if (StatusCode == 202)
			System.out.println("Accepted");
		else if (StatusCode == 301)
			System.out.println("Moved Permanently");
		else if (StatusCode == 303)
			System.out.println("See Other");
		else if (StatusCode == 304)
			System.out.println("Not Modified");
		else if (StatusCode == 307)
			System.out.println("Temporary Redirect");
		else if (StatusCode == 400)
			System.out.println("Bad Request");
		else if (StatusCode == 401)
			System.out.println("Unauthorized");
		else if (StatusCode == 403)
			System.out.println("Forbidden");
		else if (StatusCode == 404)
			System.out.println("Not Found");
		else if (StatusCode == 410)
			System.out.println("Gone");
		else if (StatusCode == 500)
			System.out.println("Internal Server Error");
		else if (StatusCode == 503)
			System.out.println("Service Unavailable");
//Task5

		int num = 0;
		String res;
		if (num > 0) {
			res = "possitive";
		} else if (num < 0) {
			res = "negative";
		} else {
			res = "zero";
		}
		System.out.println("print:\n" + "\t" + res);

	}


}
