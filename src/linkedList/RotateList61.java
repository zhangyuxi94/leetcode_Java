package linkedList;

 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

public class RotateList61 {
	public static ListNode rotateRight(ListNode head, int k) {
		if(head==null||head.next==null){
			return head;
		}
		int count=0;
		ListNode cnt=head;
		while(cnt!=null){
			cnt=cnt.next;
			count++;
		}
		int slowIndex=count-k%count-1;
		ListNode slowNode=head;
		while(slowIndex>0){
			slowNode=slowNode.next;
			slowIndex--;
		}
		ListNode fastNode=slowNode;
		while(fastNode.next!=null){
			fastNode=fastNode.next;
		}
		fastNode.next=head;
		ListNode rst=slowNode.next;
		slowNode.next=null;
	
//		System.out.println(rst.val);
//		System.out.println(rst.next.val);
//		System.out.println(rst.next.next.val);
//		System.out.println(rst.next.next.next.val);
//		System.out.println(rst.next.next.next.next.val);
//		System.out.println(rst.next.next.next.next.next);
		return rst;
	}
	public static void main(String[] args) {
//		ListNode head=null;
		ListNode head=new ListNode(1);
//		ListNode h2=null;
		ListNode h2=new ListNode(2);
		ListNode h3=new ListNode(3);
		ListNode h4=new ListNode(4);
		ListNode h5=new ListNode(5);
		head.next=h2;
		h2.next=h3;
		h3.next=h4;
		h4.next=h5;
		System.out.println(rotateRight(head,0));
	}
}
