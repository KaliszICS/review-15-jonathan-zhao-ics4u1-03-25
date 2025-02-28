public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int goodString(String s) {
        int minOperations = -1;
		for (int i = 0; i < 26; i++) {
			char c = (char) (i + 'a');
       
            int firstIndex = s.indexOf(c);
            int lastIndex = s.lastIndexOf(c);
            
            
            if (firstIndex == -1 || lastIndex == -1) {
                break;
            }
            
            
            int operations = firstIndex + (s.length() - lastIndex - 1);
            
            
            if (minOperations == -1 || operations < minOperations) {
                minOperations = operations;
            }
        }
        

		
		return minOperations;
	}

}

