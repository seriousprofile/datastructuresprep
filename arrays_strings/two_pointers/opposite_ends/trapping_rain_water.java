class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int left = 0, right = n - 1; 
        int leftMax = 0, rightMax = 0; 
        int water = 0; 

        while(left < right){
            
            //case 1:
            if(height[left] < height[right]){
                // sub case 1:
                if(height[left] >= leftMax){
                    leftMax = height[left];
                } else {
                    water += leftMax - height[left];
                }
                left++;
            } else {
                //sub case 2:
                if(height[right] >= rightMax){
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }
                right--;
            }
        }
        return water;
    }
}
