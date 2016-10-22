/**
	 * Accepts a command-line argument such as "LFFFRFFFRRFFF"
	 * where "L" => rotate 90 degrees left
	 *  	 "R" => rotate 90 degrees right
	 *    	 "F" => move forward one unit
	 *
	 * Method should print the appropriate and correct final position
	 * of the robot.
	 *
	 * Example:
	 * 		 For input "FFRF", the result should be [1,2].
	 */
package interview;

import java.util.Arrays;

public class MarsRoverOperation2 {
	public static int[] moveRobot(String input){
		int x=0,y=0;
	
		char direction='N';
		char[] inputArr=input.toCharArray();
		for(int i=0;i<inputArr.length;i++){
			if(inputArr[i]=='F'){
				switch(direction){
				case 'N':
					y++;
					break;
				case 'W':
					x--;
					break;
				case 'S':
					y--;
					break;
				case 'E':
					x++;
					break;
				default:
					break;
				}
			}
		
			if(inputArr[i]=='L'){
				switch(direction){
				case 'N':
					direction='W';
					break;
				case 'W':
					direction='S';
					break;
				case 'S':
					direction='E';
					break;
				case 'E':
					direction='N';
					break;
				default:
					break;
				}
			}
			
			if(inputArr[i]=='R'){
				switch(direction){
				case 'N':
					direction='E';
					break;
				case 'E':
					direction='S';
					break;
				case 'S':
					direction='W';
					break;
				case 'W':
					direction='N';
					break;
				default:
					break;
				}
			}
		}
		int[] coordinates={x,y};
		return coordinates;
	}
	
	public static void main(String argv[]) {
		String input="LFFFRFFFRRFFF";
		System.out.println(Arrays.toString(moveRobot(input)));
		
	}
}
