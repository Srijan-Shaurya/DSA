//This is the parameterized way
//so the parameterized way is to give the output as in printing the statement
//there is one more way functional way for recursion is
static void f(int n, int sum) {
    if (n < 1) {
        IO.println(sum);
        return;
    }
    f(n - 1, sum + n);
}

void main() {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    f(n, 0);
}
