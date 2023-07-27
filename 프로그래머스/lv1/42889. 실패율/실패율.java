import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] n = new int[N];
        int sl = stages.length;
        double[] r = new double[N];

        for (int i = 0; i < stages.length; i++) {
            if (stages[i] <= N) {
                n[stages[i] - 1]++;
            }
        }

        for (int i = 0; i < n.length; i++) {
            double failureRate = sl == 0 ? 0 : (double) n[i] / sl;
            r[i] = failureRate;
            sl -= n[i];
        }

        Map<Integer, Double> result = new LinkedHashMap<>();
        for (int i = 0; i < N; i++) {
            result.put(i + 1, r[i]);
        }

        List<Map.Entry<Integer, Double>> sortedEntries = new ArrayList<>(result.entrySet());
        Collections.sort(sortedEntries, (a, b) -> b.getValue().compareTo(a.getValue()));

        for (int i = 0; i < N; i++) {
            answer[i] = sortedEntries.get(i).getKey();
        }

        return answer;
    }
}