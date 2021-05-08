public class CoinSolver {

    final static int coins[] = {1, 7, 10, 22};

    static int minCoins(int value)
    {
        int table[] = new int[value + 1];
        table[0] = 0;
        for (int i = 1; i <= value; i++)
        {
            table[i] = Integer.MAX_VALUE;
        }
        for (int i = 1; i <= value; i++)
        {
            for (int j = 0; j < 4; j++)
                if (coins[j] <= i)
                {
                    int sub_res = table[i - coins[j]];
                    if (sub_res != Integer.MAX_VALUE && sub_res + 1 < table[i])
                    {
                        table[i] = sub_res + 1;
                    }

                }
        }
        if(table[value]==Integer.MAX_VALUE)
            return -1;
        return table[value];
    }
}
