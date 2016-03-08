# 326. Power of Three
"""
Given an integer, write a function to determine if it is a power of three. 

Follow up:
 Could you do it without using any loop / recursion? 
"""


class Solution(object):
    def isPowerOfThree(self, n):
        """
        :type n: int
        :rtype: bool
        """
        return False if n <= 0 else n == pow(3, round(math.log(n, 3)))

# 231. Power of Two
class Solution(object):
    def isPowerOfTwo(self, n):
        """
        :type n: int
        :rtype: bool
        """
        return False if n<=0 else n == pow(2, round(math.log(n, 2)))
        