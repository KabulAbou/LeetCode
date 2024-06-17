public class solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int current;
        int listIterator = 0;

        int[] result = new int[nums.length];

        for(Integer number : nums){
            int iterator = 0;
            current = number;
            for(Integer number2 : nums){
                if(current > number2){
                    iterator++;
                }
            }
            result[listIterator] = iterator;
            listIterator++;
        }
        return result;
    }
}
