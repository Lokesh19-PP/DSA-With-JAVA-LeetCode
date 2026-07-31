import java.util.*;

class Pair {
    int freq;
    char ch;

    Pair(int f, char c) {
        this.freq = f;
        this.ch = c;
    }
}

class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : tasks) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(b.freq, a.freq)
        );

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            pq.offer(new Pair(entry.getValue(), entry.getKey()));
        }

        int time = 0;

        while (!pq.isEmpty()) {
            List<Pair> temp = new ArrayList<>();
            int cycle = n + 1;

            while (cycle > 0 && !pq.isEmpty()) {
                Pair current = pq.poll();
                current.freq--;
                temp.add(current);
                time++;
                cycle--;
            }

            for (Pair p : temp) {
                if (p.freq > 0) {
                    pq.offer(p);
                }
            }

            if (!pq.isEmpty()) {
                time += cycle;
            }
        }

        return time;
    }
}