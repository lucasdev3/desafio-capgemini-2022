package br.com.proway.capgemini.questao3;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    // Function to get the count of subStrings
    // whose anagrams are palindromic
    static void countSubString(String s)
    {
        // Store the answer
        int answer = 0;

        // Map to store the freq of masks
        HashMap<Integer,
                        Integer> m = new HashMap<Integer,
                Integer>();

        // Set frequency for mask
        // 00...00 to 1
        m.put(0, 1);

        // Store mask in x from 0 to i
        int x = 0;
        for (int j = 0; j < s.length(); j++)
        {
            x ^= 1 << (s.charAt(j) - 'a');

            // Update answer
            answer += m.getOrDefault(x, 0);
            for (int i = 0; i < 26; ++i)
            {
                answer += m.getOrDefault(x ^ (1 << i), 0);
            }

            // Update frequency
            if (m.containsKey(x))
                m.put(x, m.get(x) + 1);
            else
                m.put(x, 1);
        }

        // Print the answer
        System.out.print(answer/2);
    }

    // Driver Code
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe uma palavra para verificação:");
        String palavra = teclado.next();


        // Function Call
        countSubString(palavra);
    }
}
