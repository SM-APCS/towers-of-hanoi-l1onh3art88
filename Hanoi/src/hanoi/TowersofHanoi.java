/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanoi;

/**
 *
 * @author spenc_000
 */
public class TowersofHanoi {
    private int totalDisks;
    
    //--------------------
    // Sets up the puzzle with the specified number of disks. 
    
    public TowersofHanoi (int disks) {
        totalDisks = disks;
    }
    
    //--------------------
    // Performs the intial call to moveTower to solve the puzzle. 
    // Moves the disk from tower 1 to tower 3 using tower 2.
    
    public void solve(){
        moveTower (totalDisks, 1, 3, 2);
    }
    
    //--------------------
    // Moves the specified number of disks from oent ower to another
    // by moving a subtower of n-1 disks outof the way, moving one
    // disk, then moving the subtower back. Base case of 1 disk. 
    private void moveTower (int numDisks, int start, int end, int temp){
        if (numDisks ==1)
            moveOneDisk (start, end);
        else{
            moveTower (numDisks-1, start, temp, end);
            moveOneDisk (start, end);
            moveTower (numDisks-1, temp, end, start);
            
        }
    }
    // -------------------
    // Prints instructions to move one disk from the specified start
    // tower to the specified end tower
    
    private void moveOneDisk(int start, int end){
        System.out.println( "Move on disk from " + start + " to " + end);
    }
}
