package KickStart;

import java.util.*;

/**
 *  After spending many hours studying for programming competitions, you decided to take a rest and play video games. You are currently playing an adventure game called Quick Start.

This game has N levels, and you are currently on the K-th level. Unfortunately, you just realized that to beat the boss at the final level, you will need a special sword, which can be picked up at level S. You have already completed that level, but you forgot to pick up the sword at that level.

Now you want to pick up the sword and finish the game in the least amount of time possible, and for that you have two options:

    Restart the game and complete all levels again, starting from level 1.
    Move to previous levels until you reach level S, pick up the sword and complete all the remaining levels, starting from level S.

Every time you enter a level you have to exit it, either by completing it and going to the next level or by moving to a previous level or by finishing / exiting the game. Exiting any level takes 1 minute. That means, for example, that it took you L minutes to complete the first L levels.

Your task is to discover which option would result in the least amount of total time to finish the game (including the time you have already spent).
Input

The first line of the input gives the number of test cases, T. T test cases follow.

The first (and only) line of each test case contains three integers N, K and S: the number of levels in the game, the current level you are in, and the level where you have to pick up the sword, respectively.
Output

For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) and y is the least amount of total time to finish the game. 
 */


class Retype{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int t = sc.nextInt();
        int i = 1;
        while(i <= t){
            String[] S = sc.next().split(" ");
            int n = Integer.parseInt(S[0]);
            int k = Integer.parseInt(S[1]);
            int s = Integer.parseInt(S[2]);
            System.out.println("Case #" + i + ": " + Math.min(k + n, 2 * k - 2 * s + n));
            i++;
        }
        sc.close();
    }
}