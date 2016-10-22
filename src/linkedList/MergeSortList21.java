package linkedList;

public class MergeSortList21 {
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		  if(l1 == null){
	            return l2;
	        }
	        if(l2 == null){
	            return l1;
	        }
	   
		ListNode mergeHead;
		  if(l1.val < l2.val){
	            mergeHead = l1;
	            mergeHead.next = mergeTwoLists(l1.next, l2);
	        }
	        else{
	            mergeHead = l2;
	            mergeHead.next = mergeTwoLists(l1, l2.next);
	        }
	    return mergeHead;
	}
	public static void main(String[] args) {
		ListNode l1=new ListNode(1);
		ListNode l12=new ListNode(3);
		ListNode l13=new ListNode(4);
		ListNode l14=new ListNode(7);
		ListNode l15=new ListNode(9);
		l1.next=l12;
		l12.next=l13;
		l13.next=l14;
		l14.next=l15;
		
		ListNode l2=new ListNode(2);
		ListNode l22=new ListNode(3);
		ListNode l23=new ListNode(5);
		ListNode l24=new ListNode(10);
		ListNode l25=new ListNode(12);
		l2.next=l22;
		l22.next=l23;
		l23.next=l24;
		l24.next=l25;
		System.out.println(mergeTwoLists(l1,l2));
	}
}
