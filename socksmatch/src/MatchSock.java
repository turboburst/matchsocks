import java.util.ArrayList;

public class MatchSock {
	public static void main(String[] args) {
		
		String socksString = "1/blue/right,2/blue/right,3/red/right,4/blue/left,5/purple/left,6/red/left,7/green/left,8/red/left,9/blue/left";
		String[] sockStringArray = socksString.split(",");
		ArrayList<Sock> sockList = new ArrayList<Sock>();
		//initialize sock list according to given string
		for(int i = 0; i < sockStringArray.length; i++) {
			String[] sockInfo = sockStringArray[i].split("/");
			Sock currentSock = new Sock(Integer.valueOf(sockInfo[0]), sockInfo[1], sockInfo[2]);
			sockList.add(currentSock);
		}
		
		ArrayList<int[]> sockPair = new ArrayList<int[]>();
		ArrayList<int[]> sockNotPair = new ArrayList<int[]>();
		
		//use loop to decide socks can be a pair or can not be a pair
		for(int i = 0; i < sockList.size() - 1; i++) {
			for(int j = i + 1; j < sockList.size(); j++) {
				if(sockList.get(i).isApair(sockList.get(j))) {
					int[] sockPairIds = new int[] {sockList.get(i).getSockId(), sockList.get(j).getSockId()};
					sockPair.add(sockPairIds);
				}
				else {
					int[] sockNotPairIds = new int[] {sockList.get(i).getSockId(), sockList.get(j).getSockId()};
					sockNotPair.add(sockNotPairIds);
				}
			}
			
		}
		
		//display result
		System.out.println("Socks can be a pair: ");
		for(int[] pairIds: sockPair) {
			System.out.println(pairIds[0] + "\t" + pairIds[1]);
		}
		System.out.println("Socks can not be a pair: ");
		for(int[] notPairIds: sockNotPair) {
			System.out.println(notPairIds[0] + "\t" + notPairIds[1]);
		}
	}

}
