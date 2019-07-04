uint32 nextCollatz(uint32 n) {
    if (n % 2 == 0)
        return n / 2;
    else
        return 3 * n + 1;
}
void printCollatz(uint32 n) {
    while (n != 1) {
        print(n);
        n = nextCollatz(n);
    }
}

void main() {
    /*int64 x = 25;
    int64 y = - 10;
    //print("x + y = ", x + y);
    //print("x * y = ", x * y);
    //uint32 z = (uint32) (x - (x / y));
    int64 a = x / y;
    int64 z = (x - (x / y));
    print("a = ", a);
    print("z = ", 1 + 8 * z);*/

    printCollatz(27 :: uint32);

}
