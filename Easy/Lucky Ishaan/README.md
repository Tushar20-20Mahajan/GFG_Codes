<h2><a href="https://practice.geeksforgeeks.org/problems/lucky-ishaan0443/0">Lucky Ishaan</a></h2><h3>Difficulty Level : Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Ishaan has bought N lottery tickets each having an ID denoted by an array A. As a result comes out, Ishaan gets very lucky and gets to know that each one of his tickets has won some prize. But unfortunately, he can't claim all of his lottery tickets.<br>
The "<strong>sum_id</strong>" of a lottery ticket is the sum of the individual digits of the ticket ID. For example, sum_id of a ticket with ID = 1234 is 1+2+3+4 = <strong>10</strong>.<br>
Ishaan can claim the prize of a ticket only if no other ticket with the same sum_id has been claimed by him yet (Refer to example for explanation).<br>
Find out the maximum number of tickets he can claim.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
<strong>arr[ ]</strong> = {123, 42, 45, 78, 12345}
<strong>Output :</strong> 3
<strong>Explanation:</strong>
sum_id of Ticket 1: 1+2+3 = 6 (claimed)
sum_id of Ticket 2: 4+2 = 6 (can't be claimed since Ticket 1, with same sum_id has already been claimed)
sum_id of Ticket 3: 4+5 = 9 (claimed),
sum_id of Ticket 4: 7+8 = 15 (claimed),
sum_id of Ticket 5: 1+2+3+4+5 = 15
(can't be claimed since Ticket 4 with the same sum_id has already been claimed)</span></pre>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong> 
<strong>arr[ ]</strong> = {2, 3, 4, 6, 22, 8} </span>
<span style="font-size:18px"><strong>Output:</strong> 5 </span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
This is a function problem. The input is already taken care of by the driver code. You only need to complete the function <strong>lucky()</strong> that takes an array <strong>(arr)</strong>, sizeOfArray <strong>(n)</strong>, and return the maximum number of tickets he can claim.&nbsp;The driver code takes care of the printing.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N).<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(1).</span><br>
<br>
<span style="font-size:18px"><strong>Constraints :</strong><br>
1&nbsp;≤ N&nbsp;≤ 5000<br>
1&nbsp;≤ A[i]&nbsp;≤ 10<sup>15</sup></span></p>
</div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Data Structures</code>&nbsp;