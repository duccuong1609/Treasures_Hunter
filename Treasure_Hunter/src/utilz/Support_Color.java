package utilz;

public class Support_Color {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] my_color;
		float[] red_color;
		
		my_color = new int[48];
		red_color = new float[48];
		
		for(int i=0;i<my_color.length;i++) {
			my_color[i] = i;
			red_color[i] = (float)(13*i)/33;
		}
		for(int i =0;i<my_color.length;i++) {
			System.out.println("id : " + my_color[i] + " red :" + red_color[i]);
		}
		
	}

}
