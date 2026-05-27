# DSA-Tracker

A collection of Java solutions for Data Structures & Algorithms problems, organized by topic. This repo is a practice tracker — solutions are plain Java files (no build system required) and are grouped in topic folders.

## Repository structure
- Arrays/: array problems and utilities
- Binary-Tree/: tree traversals and tree problems
- BinarySearch/: binary search variants and helpers
- BitManipulation/: bitwise problems
- LinkedList/: singly/doubly linked list problems
- Queue/: queue implementations and problems
- Recursion/: recursion & backtracking problems
- SlidingWindow/: sliding window techniques
- Stacks/: stack problems
- String/: string algorithms

Note: Each folder contains individual `.java` files for separate problems.

## Topic summary
This table shows number of problems per topic and some example filenames. Difficulty is currently `Unspecified`; see the note below to add difficulty tags.

| Topic | Count | Example problems |
|-------|:-----:|------------------|
| Arrays | 25 | [Arrays/TwoSum.java](Arrays/TwoSum.java), [Arrays/maxProduct.java](Arrays/maxProduct.java), [Arrays/maximumLength.java](Arrays/maximumLength.java), [Arrays/MaxConsecutiveOnes.java](Arrays/MaxConsecutiveOnes.java), [Arrays/maxAbsDiff.java](Arrays/maxAbsDiff.java), [Arrays/MajorityElement.java](Arrays/MajorityElement.java) |
| Recursion | 31 | [Recursion/combinationSum3.java](Recursion/combinationSum3.java), [Recursion/combinationSum2.java](Recursion/combinationSum2.java), [Recursion/combinationSum.java](Recursion/combinationSum.java), [Recursion/checkSubsequenceSum.java](Recursion/checkSubsequenceSum.java), [Recursion/addOperators.java](Recursion/addOperators.java), [Recursion/gcd.java](Recursion/gcd.java) |
| String | 17 | [String/toUpper.java](String/toUpper.java), [String/toggleCase.java](String/toggleCase.java), [String/smallestUnitString.java](String/smallestUnitString.java), [String/Patterns_Recognition/reverseWords.java](String/Patterns_Recognition/reverseWords.java), [String/Patterns_Recognition/longestCommonPrefix.java](String/Patterns_Recognition/longestCommonPrefix.java), [String/Patterns_Recognition/getLongestPal.java](String/Patterns_Recognition/getLongestPal.java) |
| SlidingWindow | 22 | [SlidingWindow/totalFruit.java](SlidingWindow/totalFruit.java), [SlidingWindow/subarraysWithKDistinct.java](SlidingWindow/subarraysWithKDistinct.java), [SlidingWindow/SubarraysSum.java](SlidingWindow/SubarraysSum.java), [SlidingWindow/smallestSubWithSum.java](SlidingWindow/smallestSubWithSum.java), [SlidingWindow/search.java](SlidingWindow/search.java), [SlidingWindow/numSubarrayProductLessThanK.java](SlidingWindow/numSubarrayProductLessThanK.java) |
| Binary-Tree | 20 | [Binary-Tree/zigzagLevelOrder.java](Binary-Tree/zigzagLevelOrder.java), [Binary-Tree/topView.java](Binary-Tree/topView.java), [Binary-Tree/rightSideView.java](Binary-Tree/rightSideView.java), [Binary-Tree/Preorder.java](Binary-Tree/Preorder.java), [Binary-Tree/Postorder.java](Binary-Tree/Postorder.java), [Binary-Tree/levelOrder.java](Binary-Tree/levelOrder.java) |
| LinkedList | 13 | [LinkedList/deleteNode.java](LinkedList/deleteNode.java), [LinkedList/countNodesInLoop.java](LinkedList/countNodesInLoop.java), [LinkedList/addNode.java](LinkedList/addNode.java), [LinkedList/detectCycle2.java](LinkedList/detectCycle2.java), [LinkedList/deleteXthNode.java](LinkedList/deleteXthNode.java), [LinkedList/getIntersectionNode.java](LinkedList/getIntersectionNode.java) |
| BinarySearch | 8 | [BinarySearch/upperBound.java](BinarySearch/upperBound.java), [BinarySearch/searchRange.java](BinarySearch/searchRange.java), [BinarySearch/SearchInsertPosition.java](BinarySearch/SearchInsertPosition.java), [BinarySearch/searchInsert.java](BinarySearch/searchInsert.java), [BinarySearch/SearchInRotatedSortedArray.java](BinarySearch/SearchInRotatedSortedArray.java), [BinarySearch/lowerBound.java](BinarySearch/lowerBound.java) |
| Stacks | 9 | [Stacks/validParenthesis.java](Stacks/validParenthesis.java), [Stacks/usingQueue.java](Stacks/usingQueue.java), [Stacks/usingLL.java](Stacks/usingLL.java), [Stacks/sumSubarrayMins.java](Stacks/sumSubarrayMins.java), [Stacks/stack.java](Stacks/stack.java), [Stacks/preToPost.java](Stacks/preToPost.java) |
| Queue | 3 | [Queue/queue.java](Queue/queue.java), [Queue/usingStack.java](Queue/usingStack.java), [Queue/usingLL.java](Queue/usingLL.java) |
| BitManipulation | 1 | [BitManipulation/getDecimalValue.java](BitManipulation/getDecimalValue.java) |

Difficulty tagging
- Currently all problems are `Unspecified` difficulty. To add difficulties you can:
	- Rename files with a suffix (for example `TwoSum_easy.java`) or
	- Add a `problems.yml` or `problems.json` mapping filenames to `easy|medium|hard`, or
	- Ask me to auto-classify problems (I can attempt heuristics, or use online lookups if you allow internet access).

If you want, I can auto-generate a full list of filenames per topic in the README, or add a `problems.json` file so you can edit difficulties easily. Which would you prefer?

## Requirements

## Full problem lists
Below are all problem files currently in the repository, grouped by topic. Click a filename to open it.

### Arrays
- [Arrays/UnionArray.java](Arrays/UnionArray.java)
- [Arrays/TwoSum.java](Arrays/TwoSum.java)
- [Arrays/maxProduct.java](Arrays/maxProduct.java)
- [Arrays/maximumLength.java](Arrays/maximumLength.java)
- [Arrays/MaxConsecutiveOnes.java](Arrays/MaxConsecutiveOnes.java)
- [Arrays/maxAbsDiff.java](Arrays/maxAbsDiff.java)
- [Arrays/matchPlayersAndTrainers.java](Arrays/matchPlayersAndTrainers.java)
- [Arrays/MajorityElement.java](Arrays/MajorityElement.java)
- [Arrays/LinearSearch.java](Arrays/LinearSearch.java)
- [Arrays/LeftRotate1.java](Arrays/LeftRotate1.java)
- [Arrays/LargestNumber.java](Arrays/LargestNumber.java)
- [Arrays/IsSorted.java](Arrays/IsSorted.java)
- [Arrays/count_NGE.java](Arrays/count_NGE.java)
- [Arrays/RemoveDuplicatesSorted.java](Arrays/RemoveDuplicatesSorted.java)
- [Arrays/rearrangeArray.java](Arrays/rearrangeArray.java)
- [Arrays/nextGreater2.java](Arrays/nextGreater2.java)
- [Arrays/MoveZeros.java](Arrays/MoveZeros.java)
- [Arrays/MissingNumber.java](Arrays/MissingNumber.java)
- [Arrays/maxThreeProduct.java](Arrays/maxThreeProduct.java)
- [Arrays/maxSubArray.java](Arrays/maxSubArray.java)
- [Arrays/SingleNumber.java](Arrays/SingleNumber.java)
- [Arrays/secondSmallest.java](Arrays/secondSmallest.java)
- [Arrays/SecondMax_NoSort.java](Arrays/SecondMax_NoSort.java)
- [Arrays/maxProfit.java](Arrays/maxProfit.java)

#### Arrays / Sorting
- [Arrays/Sorting/bubbleSortRecursive.java](Arrays/Sorting/bubbleSortRecursive.java)

### Recursion
- [Recursion/combinationSum3.java](Recursion/combinationSum3.java)
- [Recursion/combinationSum2.java](Recursion/combinationSum2.java)
- [Recursion/combinationSum.java](Recursion/combinationSum.java)
- [Recursion/checkSubsequenceSum.java](Recursion/checkSubsequenceSum.java)
- [Recursion/addOperators.java](Recursion/addOperators.java)
- [Recursion/fibonacci.java](Recursion/fibonacci.java)
- [Recursion/factorial.java](Recursion/factorial.java)
- [Recursion/countSubsequence.java](Recursion/countSubsequence.java)
- [Recursion/gcd.java](Recursion/gcd.java)
- [Recursion/generateParenthesis.java](Recursion/generateParenthesis.java)
- [Recursion/wordSearch.java](Recursion/wordSearch.java)
- [Recursion/wordBreak.java](Recursion/wordBreak.java)
- [Recursion/sudoku.java](Recursion/sudoku.java)
- [Recursion/subsetsWithDup.java](Recursion/subsetsWithDup.java)
- [Recursion/subsetSum.java](Recursion/subsetSum.java)
- [Recursion/subsets.java](Recursion/subsets.java)
- [Recursion/subsequenceSum.java](Recursion/subsequenceSum.java)
- [Recursion/sortStack.java](Recursion/sortStack.java)
- [Recursion/seriesSum.java](Recursion/seriesSum.java)
- [Recursion/reverseStack.java](Recursion/reverseStack.java)
- [Recursion/reverseArray.java](Recursion/reverseArray.java)
- [Recursion/printTillN.java](Recursion/printTillN.java)
- [Recursion/printNos.java](Recursion/printNos.java)
- [Recursion/power.java](Recursion/power.java)
- [Recursion/partition.java](Recursion/partition.java)
- [Recursion/palindrome.java](Recursion/palindrome.java)
- [Recursion/oneSubset.java](Recursion/oneSubset.java)
- [Recursion/N-Queen/n_queen.java](Recursion/N-Queen/n_queen.java)
- [Recursion/letterCombinations.java](Recursion/letterCombinations.java)
- [Recursion/isSubsetSum.java](Recursion/isSubsetSum.java)
- [Recursion/graphColoring.java](Recursion/graphColoring.java)

### String
- [String/toUpper.java](String/toUpper.java)
- [String/toggleCase.java](String/toggleCase.java)
- [String/smallestUnitString.java](String/smallestUnitString.java)
- [String/nonRepeatingChar.java](String/nonRepeatingChar.java)
- [String/maximumGain.java](String/maximumGain.java)
- [String/makeFancyString.java](String/makeFancyString.java)
- [String/isValid.java](String/isValid.java)
- [String/hasUnique.java](String/hasUnique.java)
- [String/getCount.java](String/getCount.java)
- [String/count.java](String/count.java)
- [String/areAnagrams.java](String/areAnagrams.java)

#### String / Patterns_Recognition
- [String/Patterns_Recognition/reverseWords.java](String/Patterns_Recognition/reverseWords.java)
- [String/Patterns_Recognition/LongestWordLength.java](String/Patterns_Recognition/LongestWordLength.java)
- [String/Patterns_Recognition/longestCommonPrefix.java](String/Patterns_Recognition/longestCommonPrefix.java)
- [String/Patterns_Recognition/getLongestPal.java](String/Patterns_Recognition/getLongestPal.java)
- [String/Patterns_Recognition/findSubstrings.java](String/Patterns_Recognition/findSubstrings.java)
- [String/Patterns_Recognition/areRotations.java](String/Patterns_Recognition/areRotations.java)

### SlidingWindow
- [SlidingWindow/totalFruit.java](SlidingWindow/totalFruit.java)
- [SlidingWindow/subarraysWithKDistinct.java](SlidingWindow/subarraysWithKDistinct.java)
- [SlidingWindow/SubarraysSum.java](SlidingWindow/SubarraysSum.java)
- [SlidingWindow/smallestSubWithSum.java](SlidingWindow/smallestSubWithSum.java)
- [SlidingWindow/search.java](SlidingWindow/search.java)
- [SlidingWindow/numSubarrayProductLessThanK.java](SlidingWindow/numSubarrayProductLessThanK.java)
- [SlidingWindow/NumberOfSubstrings.java](SlidingWindow/NumberOfSubstrings.java)
- [SlidingWindow/NumberOfSubarrays.java](SlidingWindow/NumberOfSubarrays.java)
- [SlidingWindow/minWindow.java](SlidingWindow/minWindow.java)
- [SlidingWindow/minSubArrayLen.java](SlidingWindow/minSubArrayLen.java)
- [SlidingWindow/maxVowels.java](SlidingWindow/maxVowels.java)
- [SlidingWindow/maxSlidingWindow.java](SlidingWindow/maxSlidingWindow.java)
- [SlidingWindow/maxScore.java](SlidingWindow/maxScore.java)
- [SlidingWindow/maximumSumSubarray.java](SlidingWindow/maximumSumSubarray.java)
- [SlidingWindow/MaxConsecutiveOnes.java](SlidingWindow/MaxConsecutiveOnes.java)
- [SlidingWindow/LongestSubsting.java](SlidingWindow/LongestSubsting.java)
- [SlidingWindow/longestSubarray.java](SlidingWindow/longestSubarray.java)
- [SlidingWindow/longestBeautifulSubstring.java](SlidingWindow/longestBeautifulSubstring.java)
- [SlidingWindow/lengthOfLongestSubstringKDistinct.java](SlidingWindow/lengthOfLongestSubstringKDistinct.java)
- [SlidingWindow/findMaxAverage.java](SlidingWindow/findMaxAverage.java)
- [SlidingWindow/findAnagrams.java](SlidingWindow/findAnagrams.java)
- [SlidingWindow/checkInclusion.java](SlidingWindow/checkInclusion.java)

### Binary-Tree
- [Binary-Tree/zigzagLevelOrder.java](Binary-Tree/zigzagLevelOrder.java)
- [Binary-Tree/topView.java](Binary-Tree/topView.java)
- [Binary-Tree/rightSideView.java](Binary-Tree/rightSideView.java)
- [Binary-Tree/Preorder.java](Binary-Tree/Preorder.java)
- [Binary-Tree/Postorder.java](Binary-Tree/Postorder.java)
- [Binary-Tree/minDepth.java](Binary-Tree/minDepth.java)
- [Binary-Tree/maxPathSum.java](Binary-Tree/maxPathSum.java)
- [Binary-Tree/maxDepth.java](Binary-Tree/maxDepth.java)
- [Binary-Tree/lowestCommonAncestor.java](Binary-Tree/lowestCommonAncestor.java)
- [Binary-Tree/levelOrder.java](Binary-Tree/levelOrder.java)
- [Binary-Tree/iterativePreOrder.java](Binary-Tree/iterativePreOrder.java)
- [Binary-Tree/iterativePostOrder.java](Binary-Tree/iterativePostOrder.java)
- [Binary-Tree/iterativeInorder.java](Binary-Tree/iterativeInorder.java)
- [Binary-Tree/isSymmetric.java](Binary-Tree/isSymmetric.java)
- [Binary-Tree/isSameTree.java](Binary-Tree/isSameTree.java)
- [Binary-Tree/isBalanced.java](Binary-Tree/isBalanced.java)
- [Binary-Tree/Inorder.java](Binary-Tree/Inorder.java)
- [Binary-Tree/diameterOfBinaryTree.java](Binary-Tree/diameterOfBinaryTree.java)
- [Binary-Tree/bottomView.java](Binary-Tree/bottomView.java)
- [Binary-Tree/allTraversals.java](Binary-Tree/allTraversals.java)

### BinarySearch
- [BinarySearch/upperBound.java](BinarySearch/upperBound.java)
- [BinarySearch/searchRange.java](BinarySearch/searchRange.java)
- [BinarySearch/SearchInsertPosition.java](BinarySearch/SearchInsertPosition.java)
- [BinarySearch/searchInsert.java](BinarySearch/searchInsert.java)
- [BinarySearch/SearchInRotatedSortedArray.java](BinarySearch/SearchInRotatedSortedArray.java)
- [BinarySearch/lowerBound.java](BinarySearch/lowerBound.java)
- [BinarySearch/countFreq.java](BinarySearch/countFreq.java)
- [BinarySearch/BinarySearch.java](BinarySearch/BinarySearch.java)

### LinkedList
- [LinkedList/deleteNode.java](LinkedList/deleteNode.java)
- [LinkedList/countNodesInLoop.java](LinkedList/countNodesInLoop.java)
- [LinkedList/addNode.java](LinkedList/addNode.java)
- [LinkedList/detectCycle2.java](LinkedList/detectCycle2.java)
- [LinkedList/deleteXthNode.java](LinkedList/deleteXthNode.java)
- [LinkedList/getIntersectionNode.java](LinkedList/getIntersectionNode.java)
- [LinkedList/getNth.java](LinkedList/getNth.java)
- [LinkedList/hasCycle.java](LinkedList/hasCycle.java)
- [LinkedList/searchKey.java](LinkedList/searchKey.java)
- [LinkedList/reverseSingleLL.java](LinkedList/reverseSingleLL.java)
- [LinkedList/reverseDLL.java](LinkedList/reverseDLL.java)
- [LinkedList/middleNode.java](LinkedList/middleNode.java)
- [LinkedList/insertAtEnd.java](LinkedList/insertAtEnd.java)

### Stacks
- [Stacks/validParenthesis.java](Stacks/validParenthesis.java)
- [Stacks/usingQueue.java](Stacks/usingQueue.java)
- [Stacks/usingLL.java](Stacks/usingLL.java)
- [Stacks/sumSubarrayMins.java](Stacks/sumSubarrayMins.java)
- [Stacks/stack.java](Stacks/stack.java)
- [Stacks/preToPost.java](Stacks/preToPost.java)
- [Stacks/nextSmaller.java](Stacks/nextSmaller.java)
- [Stacks/nextGreater.java](Stacks/nextGreater.java)
- [Stacks/infixToPrefix.java](Stacks/infixToPrefix.java)

### Queue
- [Queue/queue.java](Queue/queue.java)
- [Queue/usingLL.java](Queue/usingLL.java)
- [Queue/usingStack.java](Queue/usingStack.java)

### BitManipulation
- [BitManipulation/getDecimalValue.java](BitManipulation/getDecimalValue.java)

- Java 8 (1.8) or later
- A terminal or an IDE with Java support (VS Code, IntelliJ, Eclipse)

## How to compile & run
Compile a single file (example for `TwoSum`):

```bash
javac Arrays/TwoSum.java
java -cp Arrays TwoSum
```

Explanation: `javac` produces a `.class` file inside the same folder. Use `-cp <folder>` and run the class name (without `.class`). If a file is in the default package and located inside `Arrays/`, you run it with `-cp Arrays ClassName`.

Compile all Java files (Bash with globstar enabled):

```bash
shopt -s globstar && javac **/*.java
```

If you prefer an IDE, open the project and run any file containing a `main` method directly.

## Example
- Problem: Two Sum
- File: `Arrays/TwoSum.java`
- To run:

```bash
javac Arrays/TwoSum.java
java -cp Arrays TwoSum
```

## Contribution
- Add new problem solutions in the appropriate topic folder.
- Use descriptive filenames and keep each solution focused on a single problem.
- Open an issue or a pull request if you want to suggest changes.

## Credits & Sources
- Problems come from LeetCode and GeeksforGeeks.
- [LeetCode profile](https://leetcode.com/u/shikha_04/)
- [GFG profile](https://www.geeksforgeeks.org/user/shikha_04/)

## License
This repository is provided as-is. Add a license if you want to make reuse terms explicit (for example, MIT).


