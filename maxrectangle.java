import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        int n = heights.length;
        int[] nsr = new int[n];
        int[] nsl = new int[n];
        
        // Next smaller right
        Stack<Integer> s = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = n;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        
        // Clear the stack for next calculation
        s.clear();
        
        // Next smaller left
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        
        // Calculate max area
        for (int i = 0; i < n; i++) {
            int h = heights[i];
            int w = nsr[i] - nsl[i] - 1;
            int currArea = h * w;
            maxArea = Math.max(currArea, maxArea);
        }

        return maxArea;
    }
}
