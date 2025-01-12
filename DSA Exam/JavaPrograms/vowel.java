import java.util.*;

 class Stringlist{

	 class Node{
		char data;
		Node next;
		
		public Node(char data){
			this.data = data;
			this.next= null;
		
		}
	}
	Node head;
	
	public  void insertCharacter(char c){
	
		Node ob = new Node(c);
		Node curr =head;
		if(head==null){
			head=ob;
			}
		else{
			
			while(curr.next!=null){
				curr=curr.next;
			}
			curr.next = ob;
		}
	
	}
	
	static boolean isVowel(char ch){
		return ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u';	
	}
	
	public  int CountVowels(){
	
		int count=0;
		Node temp =head;
		while(temp!=null){
			if(isVowel(temp.data)){
				count++;
			}
			temp = temp.next;
		}
		return count;
	}
}
	class vowel{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		Stringlist list = new Stringlist();
		System.out.println("Enter the String : ");
		
		String str = sc.nextLine();
		for(int i=0;i<str.length();i++){
			char c =str.charAt(i);
			list.insertCharacter(c);	
		}
		int m = list.CountVowels();
		System.out.println("Number of Vowels is : "+m);
	}

}
