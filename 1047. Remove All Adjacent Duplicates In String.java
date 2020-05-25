class Solution {
    public String removeDuplicates(String S) {
        
        char[] str = S.toCharArray();
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<str.length; i++) {
            
            if ( !stack.isEmpty() && stack.peek() == str[i] ) {
                stack.pop();
            } else {
                stack.push(str[i]);
            }
        }
        
        char[] arr = new char[stack.size()];
        for(int i=0; i<arr.length; i++) {
            arr[i] = stack.pop();
            System.out.print(arr[i]);
        }
        
        for(int i=0; i<arr.length/2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        
        String res = String.valueOf(arr);
        return res;
    }
}
