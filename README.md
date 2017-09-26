<h1>Description of exercises</h1><h2>SeriesUp.java</h2>
<p>
  Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n(n + 1)/2.


<ul>
<li>seriesUp(3) → [1, 1, 2, 1, 2, 3]
</li><li>seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
</li><li>seriesUp(2) → [1, 1, 2]


</li></ul>
</p>
<h2>MaxMirror.java</h2>
<p>
  We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.


<ul>
<li>maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
</li><li>maxMirror([1, 2, 1, 4]) → 3
</li><li>maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2


</li></ul>
</p>
<h2>LinearIn.java</h2>
<p>
  Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.


<ul>
<li>linearIn([1, 2, 4, 6], [2, 4]) → true
</li><li>linearIn([1, 2, 4, 6], [2, 3, 4]) → false
</li><li>linearIn([1, 2, 4, 4, 6], [2, 4]) → true


</li></ul>
</p>
<h2>Fix45.java</h2>
<p>
  (This is a slightly harder version of the fix34 problem.) Return an array that contains exactly the same numbers as the given array, but rearranged so that every 4 is immediately followed by a 5. Do not move the 4's, but every other number may move. The array contains the same number of 4's and 5's, and every 4 has a number after it that is not a 4. In this version, 5's may appear anywhere in the original array.


<ul>
<li>fix45([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9]
</li><li>fix45([1, 4, 1, 5]) → [1, 4, 5, 1]
</li><li>fix45([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]


</li></ul>
</p>
<h2>SquareUp.java</h2>
<p>
  Given n>=0, create an array length nn with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).


<ul>
<li>squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
</li><li>squareUp(2) → [0, 1, 2, 1]
</li><li>squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]


</li></ul>
</p>
<h2>Fix34.java</h2>
<p>
  Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is immediately followed by a 4. Do not move the 3's, but every other number may move. The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.


<ul>
<li>fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
</li><li>fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
</li><li>fix34([3, 2, 2, 4]) → [3, 4, 2, 2]


</li></ul>
</p>
<h2>CountClumps.java</h2>
<p>
  Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array.


<ul>
<li>countClumps([1, 2, 2, 3, 4, 4]) → 2
</li><li>countClumps([1, 1, 2, 1, 1]) → 2
</li><li>countClumps([1, 1, 1, 1, 1]) → 1


</li></ul>
</p>
<h2>CanBalance.java</h2>
<p>
  Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.


<ul>
<li>canBalance([1, 1, 1, 2, 1]) → true
</li><li>canBalance([2, 1, 1, 2, 1]) → false
</li><li>canBalance([10, 10]) → true


</li></ul>
</p>
<h2>EqualIsNot.java</h2>
<p>
  Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).


<ul>
<li>equalIsNot("This is not") → false
</li><li>equalIsNot("This is notnot") → true
</li><li>equalIsNot("noisxxnotyynotxisi") → true


</li></ul>
</p>
<h2>CountTriple.java</h2>
<p>
  We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of triples in the given string. The triples may overlap.


<ul>
<li>countTriple("abcXXXabc") → 1
</li><li>countTriple("xxxabyyyycd") → 3
</li><li>countTriple("a") → 0


</li></ul>
</p>
<h2>GHappy.java</h2>
<p>
  We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return true if all the g's in the given string are happy.


<ul>
<li>gHappy("xxggxx") → true
</li><li>gHappy("xxgxx") → false
</li><li>gHappy("xxggyygxx") → false


</li></ul>
</p>
<h2>MaxBlock.java</h2>
<p>
  Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.


<ul>
<li>maxBlock("hoopla") → 2
</li><li>maxBlock("abbCCCddBBBxx") → 3
</li><li>maxBlock("") → 0


</li></ul>
</p>
<h2>SameEnds.java</h2>
<p>
  Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. For example, 
<ul>
<li>sameEnds("abXab") is "ab".

</li><li>sameEnds("abXYab") → "ab"
</li><li>sameEnds("xx") → "x"
</li><li>sameEnds("xxx") → "x"


</li></ul>
</p>
<h2>SumDigits.java</h2>
<p>
  Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters. Return 0 if there are no digits in the string. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)


<ul>
<li>sumDigits("aa1bc2d3") → 6
</li><li>sumDigits("aa11b33") → 8
</li><li>sumDigits("Chocolate") → 0


</li></ul>
</p>
<h2>MirrorEnds.java</h2>
<p>
  Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string. In other words, zero or more characters at the very begining of the given string, and at the very end of the string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".


<ul>
<li>mirrorEnds("abXYZba") → "ab"
</li><li>mirrorEnds("abca") → "a"
</li><li>mirrorEnds("aba") → "aba"


</li></ul>
</p>
<h2>DividesSelf.java</h2>
<p>
 
  We'll say that a positive int divides itself if every digit in the number divides into the number evenly. So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly. We'll say that 0 does not divide into anything evenly, so no number with a 0 digit divides itself. Note: use % to get the rightmost digit, and / to discard the rightmost digit.


<ul>
<li>dividesSelf(128) → true
</li><li>dividesSelf(12) → true
</li><li>dividesSelf(120) → false


</li></ul>
</p>
<h2>UserCompare.java</h2>
<p>
  We have data for two users, A and B, each with a String name and an int id. The goal is to order the users such as for sorting. Return -1 if A comes before B, 1 if A comes after B, and 0 if they are the same. Order first by the string names, and then by the id numbers if the names are the same. Note: with Strings str1.compareTo(str2) returns an int value which is negative/0/positive to indicate how str1 is ordered to str2 (the value is not limited to -1/0/1). (On the AP, there would be two User objects, but here the code simply takes the two strings and two ints directly. The code logic is the same.)


<ul>
<li>userCompare("bb", 1, "zz", 2) → -1
</li><li>userCompare("bb", 1, "aa", 2) → 1
</li><li>userCompare("bb", 1, "bb", 1) → 0


</li></ul>
</p>
<h2>CopyEvens.java</h2>
<p>
  Given an array of positive ints, return a new array of length "count" containing the first even numbers from the original array. The original array will contain at least "count" even numbers.


<ul>
<li>copyEvens([3, 2, 4, 5, 8], 2) → [2, 4]
</li><li>copyEvens([3, 2, 4, 5, 8], 3) → [2, 4, 8]
</li><li>copyEvens([6, 1, 2, 4, 5, 8], 3) → [6, 2, 4]


</li></ul>
</p>
<h2>WordsCount.java</h2>
<p>
  Given an array of strings, return the count of the number of strings with the given length.


<ul>
<li>wordsCount(["a", "bb", "b", "ccc"], 1) → 2
</li><li>wordsCount(["a", "bb", "b", "ccc"], 3) → 1
</li><li>wordsCount(["a", "bb", "b", "ccc"], 4) → 0


</li></ul>
</p>
<h2>ScoresAverage.java</h2>
<p>
  Given an array of scores, compute the int average of the first half and the second half, and return whichever is larger. We'll say that the second half begins at index length/2. The array length will be at least 2. To practice decomposition, write a separate helper method
int average(int[] scores, int start, int end) { which computes the average of the elements between indexes start..end. Call your helper method twice to implement 
<ul>
<li>scoresAverage(). Write your helper method after your </li><li>scoresAverage() method in the JavaBat text area. Normally you would compute averages with doubles, but here we use ints so the expected results are exact.

</li><li>scoresAverage([2, 2, 4, 4]) → 4
</li><li>scoresAverage([4, 4, 4, 2, 2, 2]) → 4
</li><li>scoresAverage([3, 4, 5, 1, 2, 3]) → 4


</li></ul>
</p>
<h2>ScoresIncreasing.java</h2>
<p>Given an array of scores, return true if each score is equal or greater than the one before. The array will be length 2 or more.


<ul>
<li>scoresIncreasing([1, 3, 4]) → true
</li><li>scoresIncreasing([1, 3, 2]) → false
</li><li>scoresIncreasing([1, 1, 4]) → true

</li></ul>
</p>
<h2>WordsWithoutList.java</h2>
<p>
  Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the given length are omitted. See wordsWithout() below which is more difficult because it uses arrays.


<ul>
<li>wordsWithoutList(["a", "bb", "b", "ccc"], 1) → ["bb", "ccc"]
</li><li>wordsWithoutList(["a", "bb", "b", "ccc"], 3) → ["a", "bb", "b"]
</li><li>wordsWithoutList(["a", "bb", "b", "ccc"], 4) → ["a", "bb", "b", "ccc"]


</li></ul>
</p>
<h2>WordsWithout.java</h2>
<p>
  Given an array of strings, return a new array without the strings that are equal to the target string. One approach is to count the occurrences of the target string, make a new array of the correct length, and then copy over the correct strings.


<ul>
<li>wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
</li><li>wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
</li><li>wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]


</li></ul>
</p>
<h2>CopyEndy.java</h2>
<p>
  We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive). Given an array of positive ints, return a new array of length "count" containing the first endy numbers from the original array. Decompose out a separate isEndy(int n) method to test if a number is endy. The original array will contain at least "count" endy numbers.


<ul>
<li>copyEndy([9, 11, 90, 22, 6], 2) → [9, 90]
</li><li>copyEndy([9, 11, 90, 22, 6], 3) → [9, 90, 6]
</li><li>copyEndy([12, 1, 1, 13, 0, 20], 2) → [1, 1]


</li></ul>
</p>
<h2>MatchUp.java</h2>
<p>
  Given 2 arrays that are the same length containing strings, compare the 1st string in one array to the 1st string in the other array, the 2nd to the 2nd and so on. Count the number of times that the 2 strings are non-empty and start with the same char. The strings may be any length, including 0.


<ul>
<li>matchUp(["aa", "bb", "cc"], ["aaa", "xx", "bb"]) → 1
</li><li>matchUp(["aa", "bb", "cc"], ["aaa", "b", "bb"]) → 2
</li><li>matchUp(["aa", "bb", "cc"], ["", "", "ccc"]) → 1


</li></ul>
</p>
<h2>CommonTwo.java</h2>
<p>
  Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates. Return the count of the number of strings which appear in both arrays. The best "linear" solution makes a single pass over both arrays, taking advantage of the fact that they are in alphabetical order.


<ul>
<li>commonTwo(["a", "c", "x"], ["b", "c", "d", "x"]) → 2
</li><li>commonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"]) → 3
</li><li>commonTwo(["a", "b", "c"], ["a", "b", "c"]) → 3


</li></ul>
</p>
<h2>BigHeights.java</h2>
<p>
  (A variation on the sumHeights problem.) We have an array of heights, representing the altitude along a walking trail. Given start/end indexes into the array, return the number of "big" steps for a walk starting at the start index and ending at the end index. We'll say that step is big if it is 5 or more up or down. The start end end index will both be valid indexes into the array with start <= end.


<ul>
<li>bigHeights([5, 3, 6, 7, 2], 2, 4) → 1
</li><li>bigHeights([5, 3, 6, 7, 2], 0, 1) → 0
</li><li>bigHeights([5, 3, 6, 7, 2], 0, 4) → 1



</li></ul>
</p>
<h2>ScoreUp.java</h2>
<p>
  The "key" array is an array containing the correct answers to an exam, like {"a", "a", "b", "b"}. the "answers" array contains a student's answers, with "?" representing a question left blank. The two arrays are not empty and are the same length. Return the score for this array of answers, giving +4 for each correct answer, -1 for each incorrect answer, and +0 for each blank answer.


<ul>
<li>scoreUp(["a", "a", "b", "b"], ["a", "c", "b", "c"]) → 6
</li><li>scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "c"]) → 11
</li><li>scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "b"]) → 16


</li></ul>
</p>
<h2>CreateReadme.java</h2>
<p>
  Creates a README.md. 
  
   Recurses through all folders 
   Parses comments at top of each file
   Writes out README.md
 

<ul>
</ul>
</p>
<h2>ScoresClump.java</h2>
<p>
  Given an array of scores sorted in increasing order, return true if the array contains 3 adjacent scores that differ from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}.


<ul>
<li>scoresClump([3, 4, 5]) → true
</li><li>scoresClump([3, 4, 6]) → false
</li><li>scoresClump([1, 3, 5, 5]) → true


</li></ul>
</p>
<h2>Utils.java</h2>
<p>
Utility methods



<ul>
</ul>
</p>
<h2>Count8.java</h2>
<p>
  Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit, except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4. Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).


<ul>
<li>count8(8) → 1
</li><li>count8(818) → 2
</li><li>count8(8818) → 4


</li></ul>
</p>
<h2>AllStar.java</h2>
<p>
  Given a string, compute recursively a new string where all the adjacent chars are now separated by a "".


<ul>
<li>allStar("hello") → "hello"
</li><li>allStar("abc") → "abc"
</li><li>allStar("ab") → "ab"


</li></ul>
</p>
<h2>Array220.java</h2>
<p>
  Given an array of ints, compute recursively if the array contains somewhere a value followed in the array by that value times 10. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.


<ul>
<li>array220([1, 2, 20], 0) → true
</li><li>array220([3, 30], 0) → true
</li><li>array220([3], 0) → false


</li></ul>
</p>
<h2>PairStar.java</h2>
<p>
Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a " ".


<ul>
<li>pairStar("hello") → "hel lo"
</li><li>pairStar("xxyy") → "x xy y"
</li><li>pairStar("aaaa") → "a a a a"

</li></ul>
</p>
<h2>CountAbc.java</h2>
<p> Count recursively the total number of "abc" and "aba" substrings that appear in the given string.

<ul>
<li>countAbc("abc") → 1
</li><li>countAbc("abcxxabc") → 2
</li><li>countAbc("abaxxaba") → 2


</li></ul>
</p>
<h2>Count7.java</h2>
<p>
  Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).


<ul>
<li>count7(717) → 2
</li><li>count7(7) → 1
</li><li>count7(123) → 0


</li></ul>
</p>
<h2>Triangle.java</h2>
<p>
  We have Triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) the total number of blocks in such a Triangle with the given number of rows.


<ul>
<li>triangle(0) → 0
</li><li>triangle(1) → 1
</li><li>triangle(2) → 3


</li></ul>
</p>
<h2>Count11.java</h2>
<p>
  Given a string, compute recursively (no loops) the number of "11" substrings in the string. The "11" substrings should not overlap.

 
<ul>
<li>count11("11abc11") → 2
 </li><li>count11("abc11x11x11") → 3
 </li><li>count11("111") → 1
 

</li></ul>
</p>
<h2>CountPairs.java</h2>
<p>

 We'll say that a "pair" in a string is two instances of a char separated by a char. So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x. Recursively compute the number of pairs in the given string.


<ul>
<li>countPairs("axa") → 1
</li><li>countPairs("axax") → 2
</li><li>countPairs("axbx") → 1

</li></ul>
</p>
<h2>EndX.java</h2>
<p>
 Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.


<ul>
<li>endX("xxre") → "rexx"
</li><li>endX("xxhixx") → "hixxxx"
</li><li>endX("xhixhix") → "hihixxx"
 

</li></ul>
</p>
<h2>CountX.java</h2>
<p>
  Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.


<ul>
<li>countX("xxhixx") → 4
</li><li>countX("xhixhix") → 3
</li><li>countX("hi") → 0

</li></ul>
</p>
<h2>Has271.java</h2>
<p>
 
  Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.


<ul>
<li>has271([1, 2, 7, 1]) → true
</li><li>has271([1, 2, 8, 1]) → false
</li><li>has271([2, 7, 1]) → true



</li></ul>
</p>

