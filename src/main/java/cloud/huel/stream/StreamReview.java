package cloud.huel.stream;

import java.util.Arrays;

/**
 * @author 张晓华
 * @version 1.0
 */
public class StreamReview {

	public static void main(String[] args) {
		stream();
	}



	public static void stream(){
		String [] strs = {"ab","ac","ad","ae","ff"};
		long num = Arrays.stream(strs).filter(i->i.startsWith("a")).distinct().count();
		System.out.println(num == strs.length-1);
		String[] strings = new String [strs.length];
		strings = strs;
		strs = null;
		Arrays.stream(strings).filter(i->i.startsWith("f")).forEach(s-> System.out.println(s));
	}



}
