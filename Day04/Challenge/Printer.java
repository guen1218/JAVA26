package Challenge;

public class Printer {
	private int numOfPapers;
	private boolean duplex;
	public Printer(int numOfPapers) {
		this.numOfPapers = numOfPapers;
	}
	
	public Printer(int numOfPapers, boolean duplex) {
		this.numOfPapers = numOfPapers;
		this.duplex = duplex;
	}
//	
//	public void print(int amount) {
//		if(numOfPapers <= 0) {
//			System.out.println("용지가 없습니다.");
//		}else {
//			int paper = numOfPapers - amount;
//			if(paper>=0) {
//				System.out.printf("%d장 출력했습니다. 현재 %d장 남아 있습니다.\n",amount,paper);
//				numOfPapers = paper;
//			}else {
//				System.out.printf("모두 출력하려면 용지가 %d매 부족합니다. %d장만 출력합니다.\n", amount-numOfPapers, numOfPapers);
//				numOfPapers = 0;
//			}
//		}
//	}
		
	public void print(int amount) {
		if(numOfPapers <= 0) {
			System.out.println("용지가 없습니다.");
		}else {
			if(duplex) {
				int aamount;
				if(amount%2==1) {
					aamount = (amount+1)/2;
				}else {
					aamount = (amount)/2;
				}
				int paper = numOfPapers - aamount;
				if(paper>=0) {
					System.out.printf("양면으로 %d장 출력했습니다. 현재 %d장 남아 있습니다.\n",aamount,paper);
					numOfPapers = paper;
				}else {
					System.out.printf("단면으로 모두 출력하려면 용지가 %d매 부족합니다. %d장만 출력합니다.\n", aamount-numOfPapers, numOfPapers);
					numOfPapers = 0;
				}
			}else {
				int paper = numOfPapers - amount;
				if(paper>=0) {
					System.out.printf("단면으로 %d장 출력했습니다. 현재 %d장 남아 있습니다.\n",amount,paper);
					numOfPapers = paper;
				}else {
					System.out.printf("단면으로 모두 출력하려면 용지가 %d매 부족합니다. %d장만 출력합니다.\n", amount-numOfPapers, numOfPapers);
					numOfPapers = 0;
				}
			}
		}
	}
	
	
	public boolean getDuplex() {
		return duplex;
	}
	
	public void setDuplex(boolean duplex) {
		this.duplex = duplex;
	}
}
