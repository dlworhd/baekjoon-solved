
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int resultX = 0;
        int resultY = 0;

        int x = 1;
        int y = 1;

        int xCnt = 0;
        int yCnt = 0;

        int crossXCnt = 0;
        int crossYCnt = 0;

        while (true) {

            crossXCnt++;


            if (crossXCnt % 2 != 0) {

                for (int i = x; i >= 1; i--) {
                    xCnt++;
                    if (n == xCnt) {
                        resultX = i;
                        break;
                    }
                }
            } else {
                for (int i = 1; i <= x; i++) {
                    xCnt++;
                    if (n == xCnt) {
                        resultX = i;
                        break;
                    }
                }

            }

            if (resultX != 0) {
                break;
            }

            x++;
        }

        while (true) {
            crossYCnt++;

            if (crossYCnt % 2 == 0) {
                for (int i = y; i >= 1; i--) {
                    yCnt++;
                    if (n == yCnt) {
                        resultY = i;
                        break;
                    }
                }
            } else {
                for (int i = 1; i <= y; i++) {
                    yCnt++;
                    if (n == yCnt) {
                        resultY = i;
                        break;
                    }
                }
            }
            if (resultY != 0) {
                break;
            }

            y++;
        }
        
        System.out.println(resultX + "/" + resultY);
        
    }
}