package HW_Lesson02;

public class SequencesImpl implements Sequences {
    // сделаю рефакторинг и уберу повторяющиеся участки кода

    private void printLastElem(int i, int n, long x) {
        if (i == n - 2) {
            System.out.print(x);
        } else {
            System.out.print(x + ", ");
        }
    }

    @Override
    public void a(int n) {
        if (n > 0) {
            long x = 2;
            System.out.print("a: " + x + ", ");
            for (int i = 0; i < n - 1; i++) {
                x += 2;
                printLastElem(i, n, x);
            }
            System.out.println();
        }
    }

    @Override
    public void b(int n) {
        if (n > 0) {
            long x = 1;
            System.out.print("b: " + x + ", ");
            for (int i = 0; i < n - 1; i++) {
                x += 2;
                printLastElem(i, n, x);
            }
            System.out.println();
        }
    }

    @Override
    public void c(int n) {
        if (n > 0) {
            long x = 1;
            long res = 1;
            System.out.print("c: " + x + ", ");
            for (int i = 0; i < n - 1; i++) {
                x += 2;
                res += x;
                printLastElem(i, n, res);
            }
            System.out.println();
        }
    }

    @Override
    public void d(int n) {
        if (n > 0) {
            long x = 1;
            long res;
            System.out.print("d: " + x + ", ");
            for (int i = 0; i < n - 1; i++) {
                x += 1;
                res = x * x * x;
                printLastElem(i, n, res);
            }
            System.out.println();
        }
    }

    @Override
    public void e(int n) {
        if (n > 0) {
            long x = 1;
            System.out.print("e: " + x + ", ");
            for (int i = 0; i < n - 1; i++) {
                x *= -1;
                printLastElem(i, n, x);
            }
            System.out.println();
        }
    }

    @Override
    public void f(int n) {
        if (n > 0) {
            long x = 1;
            long res;
            System.out.print("f: " + x + ", ");
            for (int i = 0; i < n - 1; i++) {
                x += 1;
                if (x % 2 == 0) {
                    res = x * (-1);
                } else
                    res = x;
                printLastElem(i, n, res);
            }
            System.out.println();
        }
    }

    @Override
    public void g(int n) {
        if (n > 0) {
            long x = 1;
            long x1 = 1;
            long res;
            System.out.print("g: " + x + ", ");
            for (int i = 0; i < n - 1; i++) {
                x += 2;
                x1 += x;
                if (x1 % 2 == 0) {
                    res = x1 * (-1);
                } else res = x1;
                printLastElem(i, n, res);
            }
            System.out.println();
        }
    }

    @Override
    public void h(int n) {
        if (n > 0) {
            long x = 1;
            long res;
            System.out.print("h: " + x + ", ");
            for (int i = 0; i < n - 1; i++) {
                if (i % 2 != 0) {
                    x += 1;
                    res = x;
                } else
                    res = 0;
                printLastElem(i, n, res);
            }
            System.out.println();
        }
    }

    @Override
    public void i(int n) {
        if (n > 0) {
            long x = 1;
            long res = 1;
            System.out.print("i: " + x + ", ");
            for (int i = 0; i < n - 1; i++) {
                x += 1;
                res *= x;
                printLastElem(i, n, res);
            }
            System.out.println();
        }
    }

    @Override
    public void j(int n) {
        if (n > 0) {
            long a0 = 1;
            long a1 = 1;
            long res;
            if (n > 1) {
                System.out.print("j: " + a0 + ", " + a1 + ", ");
                for (int i = 1; i < n - 1; i++) {
                    res = a1 + a0;
                    a0 = a1;
                    a1 = res;
                    printLastElem(i, n, res);
                }
            } else System.out.println("j: " + a0);
        }

    }
}
