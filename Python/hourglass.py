"""
CODEFORCES
B. Hourglass
time limit per test
1 second
memory limit per test
256 megabytes

Vadim's hourglass measures s minutes. He flipped it over, and the time started. Every k minutes, Vadim will flip his hourglass again. He will do this even if the sand is still falling. Also, if the sand has already finished falling but there are still some minutes left, Vadim will wait for the required time and only then flip the hourglass. Each flip is done instantly.

However, Vadim needs to leave for errands in m minutes, and he will stop flipping the hourglass (if Vadim needs to flip the hourglass in the last minute, he will do so). Determine how many minutes the sand will continue to fall after Vadim leaves.
Input

Each test consists of several test cases. The first line contains a single integer t (1≤t≤104) — the number of test cases. The following lines describe the test cases.

In a single line of each test case, there are three integers s, k, and m — the number of minutes the hourglass measures, the number of minutes after which the hourglass flips, and the number of minutes after which Vadim will leave for errands (1≤s,k,m≤109).
Output

For each test case, output how many minutes the sand will continue to fall after Vadim leaves.
Example
Input
Copy

6
8 8 12
5 10 17
12 2 3
16 7 7
1 1 10
2 60 15

Output
Copy

4
0
1
7
1
0

Note

In the first test case, Vadim will flip the hourglass just as the sand stops falling, then 4 minutes pass, Vadim leaves, and 4 minutes will remain.

In the second test case, Vadim will flip the hourglass at the 10-th minute, in the next 5 minutes the sand will completely finish falling, and in 2 minutes Vadim will leave, resulting in 0 minutes remaining.

In the third test case, 2 minutes of sand have already fallen before the first flip, so after the flip, this sand will continue to fall. After 1 minute, 1 minute will remain.

In the fourth test case, 7 minutes of sand have already fallen before the first flip, Vadim will perform it and immediately leave, so 7 minutes will remain.
"""

t = int(input())
 
resp = []
 
for i in range(0,t):
    s,k,m = list(map(int,input().split(" ")))
 
    qnt = m//k
 
    gap = max(0, ( m - k*qnt))
 
    if(s > k and (qnt%2) != 0):
        s = k
        
    resp.append(max(0,s-gap))
 
 
for r in resp:
    print(r)