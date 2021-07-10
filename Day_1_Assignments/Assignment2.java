import java.util.Random;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int total=0, count_0s=0, count_1s=0, count_2s=0, count_3s=0, count_4s=0, count_6s=0;
		float strikeRate;
		int runs[] = new int[30];
		Random random = new Random();
		
		for(int i=0; i<runs.length; i++) {
			runs[i] = (random.nextInt(6))+1;
			total+=runs[i];
			if(runs[i]==0) {
				count_0s+=1;
			}
			else if(runs[i]==1) {
				count_1s+=1;
			}
			else if(runs[i]==2) {
				count_2s+=1;
			}
			else if(runs[i]==3) {
				count_3s+=1;
			}
			else if(runs[i]==4) {
				count_4s+=1;
			}
			else if(runs[i]==6) {
				count_6s+=1;
			}
			
		}
		strikeRate = (total/30)*100;
		
		System.out.println("Total Runs scored are "+total);
		System.out.println("Out of which\nZeros are "+count_0s+"\n"+"Ones are "+count_1s+"\n"+
		"Twos are "+count_2s+"\n"+"Threes are "+count_3s+"\n"+"Fours are "+count_4s+"\n"+"Sixes are "+count_6s+"\n");
		System.out.println("Strike Rate of the Batsman is "+strikeRate);
	}
	
}
