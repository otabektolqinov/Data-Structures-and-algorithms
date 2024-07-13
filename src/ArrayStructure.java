public class ArrayStructure {

    public int secondMax(int[] array){
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for (int num : array){
            if(num > max){
                secondMax = max;
                max = num;
            } else if (num > secondMax & num != max) {
                secondMax = num;
            }
        }
        return secondMax;

    }

    public void moveZeros(int[] array){
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] != 0 && array[j] == 0){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            if(array[j] != 0){
                j++;
            }
        }
    }

    public boolean isPalindrome(String s){
        char[] chars = s.toCharArray();
        int j = s.length() - 1;
        for (int i = 0; i < j; i++) {
            if(chars[i] != chars[j]){
                return false;
            }
            j--;
        }
        return true;
    }

}
