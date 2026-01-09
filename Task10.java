public class Task10 {
    public int lastDigitSum(int input1, int input2)
    {
        if(input1 < 0)
        {
            input1 = -input1;
        }
        if(input2 < 0)
        {
            input2 = - input2;
        }
        int lastDigit1 = input1 % 10;
        int lastDigit2 = input2 % 10;
        return lastDigit1 + lastDigit2;
    }

    public static void main(String args[])
    {
        Task10 t = new Task10();
        System.out.println(t.lastDigitSum(123, 456));
    }
}
