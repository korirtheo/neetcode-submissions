class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map <Integer, Integer> indices = new HashMap<Integer, Integer>();

        for (int i = 0; i < numbers.length; i++) {
                if(indices.containsKey(target - numbers[i])) {
                    return new int[]{indices.get(target - numbers[i]), i + 1};
                }
                else {
                    indices.put(numbers[i], i + 1);
                }
        }

        return new int[]{};
        
    }
}
