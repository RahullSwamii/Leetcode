class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(numRows);

        for (int r = 0; r < numRows; r++) {
            List<Integer> row = new ArrayList<>(r + 1);
            for (int c = 0; c <= r; c++) {
                if (c == 0 || c == r) {
                    row.add(1);
                } else {
                    List<Integer> prevRow = result.get(r-1);
                    row.add(prevRow.get(c-1) + prevRow.get(c));
                }
            }
            result.add(row);
        }
        return result;
    }
}