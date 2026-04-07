import java.lang.*;
import java.util.Scanner;
import java.io.*;

class leetcode
{
	public static void main(String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		while (T-- > 0)
		{
			int N = sc.nextInt();
			String S = sc.next();
			StringBuilder sb = new StringBuilder(S);
            int count=0;

			for (int i = 0; i < sb.length() - 1; i++)
			{
				if (sb.charAt(i) == sb.charAt(i + 1))
				{
					if (sb.charAt(i) == '0')
					{
						sb.insert(i + 1, '1');

					}
					else
					{
						sb.insert(i + 1, '0');
					}
                    count++;
				}
			}

			System.out.println(count);
		}
	}
}