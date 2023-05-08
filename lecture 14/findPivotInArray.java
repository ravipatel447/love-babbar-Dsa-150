import java.util.*;
import java.io.*;

class findPivotInArray {
    public static void main(String[] args) throws java.lang.Exception {
        try {
            PrintWriter pw = new PrintWriter(System.out);
            int ar[] = new int[] { 7, 9, 16, 1, 2, 5 };
            int n = ar.length;
            int start = 0;
            int end = n - 1;
            int mid = (start + end) / 2;
            while (start < end) {
                if (ar[mid] > ar[n - 1]) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
                mid = (start + end) / 2;
            }
            pw.println("Pivot Element is " + mid);
            pw.flush();
        } catch (Exception e) {
            return;
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}