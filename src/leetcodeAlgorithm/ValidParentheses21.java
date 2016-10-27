package leetcodeAlgorithm;

import java.util.Stack;

public class ValidParentheses21 {
	   public static boolean isValid(String s) {
	        Stack<Character> stk=new Stack<Character>();
	        char[] arr=s.toCharArray();
	        for(int i=0;i<arr.length;i++){
	             switch(arr[i]){
	                  case '{':
	                  case '[':
	                  case '(':
	                      stk.push(arr[i]);
	                      break;
	                  case ')':
	                	  if(stk.size()==0||stk.peek()!='('){
	                    	   return false;
	                       }
	                       else{
	                    	   stk.pop();
	                      }
	                      break;
	                  case ']':
	                       if(stk.size()==0||stk.peek()!='['){
	                    	   return false;
	                       }
	                       else{
	                    	   stk.pop();
	                      }
	                      break;
	                  case '}':
	                	  if(stk.size()==0||stk.peek()!='{'){
	                    	   return false;
	                       }
	                       else{
	                    	   stk.pop();
	                      }
	                      break;
	                default:
	                break;
	             }
	        }
	       return stk.size()==0?true:false;
	    }
	
	public static void main(String[] args) {
		System.out.println(isValid("}"));
	}
}
