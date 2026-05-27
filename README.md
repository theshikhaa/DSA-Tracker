# DSA-Tracker

A collection of Java solutions for Data Structures & Algorithms problems, organized by topic. This repo is a practice tracker — solutions are plain Java files (no build system required) and are grouped in topic folders.

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
Below are all problem files currently in the repository, grouped by topic. Click a problem name to open it.

### Arrays
- [UnionArray](Arrays/UnionArray.java)
- [TwoSum](Arrays/TwoSum.java)
- [maxProduct](Arrays/maxProduct.java)
- [maximumLength](Arrays/maximumLength.java)
- [MaxConsecutiveOnes](Arrays/MaxConsecutiveOnes.java)
- [maxAbsDiff](Arrays/maxAbsDiff.java)
- [matchPlayersAndTrainers](Arrays/matchPlayersAndTrainers.java)
- [MajorityElement](Arrays/MajorityElement.java)
- [LinearSearch](Arrays/LinearSearch.java)
- [LeftRotate1](Arrays/LeftRotate1.java)
- [LargestNumber](Arrays/LargestNumber.java)
- [IsSorted](Arrays/IsSorted.java)
- [count_NGE](Arrays/count_NGE.java)
- [RemoveDuplicatesSorted](Arrays/RemoveDuplicatesSorted.java)
- [rearrangeArray](Arrays/rearrangeArray.java)
- [nextGreater2](Arrays/nextGreater2.java)
- [MoveZeros](Arrays/MoveZeros.java)
- [MissingNumber](Arrays/MissingNumber.java)
- [maxThreeProduct](Arrays/maxThreeProduct.java)
- [maxSubArray](Arrays/maxSubArray.java)
- [SingleNumber](Arrays/SingleNumber.java)
- [secondSmallest](Arrays/secondSmallest.java)
- [SecondMax_NoSort](Arrays/SecondMax_NoSort.java)
- [maxProfit](Arrays/maxProfit.java)

#### Arrays / Sorting
- [bubbleSortRecursive](Arrays/Sorting/bubbleSortRecursive.java)

### Recursion
- [combinationSum3](Recursion/combinationSum3.java)
- [combinationSum2](Recursion/combinationSum2.java)
- [combinationSum](Recursion/combinationSum.java)
- [checkSubsequenceSum](Recursion/checkSubsequenceSum.java)
- [addOperators](Recursion/addOperators.java)
- [fibonacci](Recursion/fibonacci.java)
- [factorial](Recursion/factorial.java)
- [countSubsequence](Recursion/countSubsequence.java)
- [gcd](Recursion/gcd.java)
- [generateParenthesis](Recursion/generateParenthesis.java)
- [wordSearch](Recursion/wordSearch.java)
- [wordBreak](Recursion/wordBreak.java)
- [sudoku](Recursion/sudoku.java)
- [subsetsWithDup](Recursion/subsetsWithDup.java)
- [subsetSum](Recursion/subsetSum.java)
- [subsets](Recursion/subsets.java)
- [subsequenceSum](Recursion/subsequenceSum.java)
- [sortStack](Recursion/sortStack.java)
- [seriesSum](Recursion/seriesSum.java)
- [reverseStack](Recursion/reverseStack.java)
- [reverseArray](Recursion/reverseArray.java)
- [printTillN](Recursion/printTillN.java)
- [printNos](Recursion/printNos.java)
- [power](Recursion/power.java)
- [partition](Recursion/partition.java)
- [palindrome](Recursion/palindrome.java)
- [oneSubset](Recursion/oneSubset.java)
- [n_queen](Recursion/N-Queen/n_queen.java)
- [letterCombinations](Recursion/letterCombinations.java)
- [isSubsetSum](Recursion/isSubsetSum.java)
- [graphColoring](Recursion/graphColoring.java)

### String
- [toUpper](String/toUpper.java)
- [toggleCase](String/toggleCase.java)
- [smallestUnitString](String/smallestUnitString.java)
- [nonRepeatingChar](String/nonRepeatingChar.java)
- [maximumGain](String/maximumGain.java)
- [makeFancyString](String/makeFancyString.java)
- [isValid](String/isValid.java)
- [hasUnique](String/hasUnique.java)
- [getCount](String/getCount.java)
- [count](String/count.java)
- [areAnagrams](String/areAnagrams.java)

#### String / Patterns_Recognition
- [reverseWords](String/Patterns_Recognition/reverseWords.java)
- [LongestWordLength](String/Patterns_Recognition/LongestWordLength.java)
- [longestCommonPrefix](String/Patterns_Recognition/longestCommonPrefix.java)
- [getLongestPal](String/Patterns_Recognition/getLongestPal.java)
- [findSubstrings](String/Patterns_Recognition/findSubstrings.java)
- [areRotations](String/Patterns_Recognition/areRotations.java)

### SlidingWindow
- [totalFruit](SlidingWindow/totalFruit.java)
- [subarraysWithKDistinct](SlidingWindow/subarraysWithKDistinct.java)
- [SubarraysSum](SlidingWindow/SubarraysSum.java)
- [smallestSubWithSum](SlidingWindow/smallestSubWithSum.java)
- [search](SlidingWindow/search.java)
- [numSubarrayProductLessThanK](SlidingWindow/numSubarrayProductLessThanK.java)
- [NumberOfSubstrings](SlidingWindow/NumberOfSubstrings.java)
- [NumberOfSubarrays](SlidingWindow/NumberOfSubarrays.java)
- [minWindow](SlidingWindow/minWindow.java)
- [minSubArrayLen](SlidingWindow/minSubArrayLen.java)
- [maxVowels](SlidingWindow/maxVowels.java)
- [maxSlidingWindow](SlidingWindow/maxSlidingWindow.java)
- [maxScore](SlidingWindow/maxScore.java)
- [maximumSumSubarray](SlidingWindow/maximumSumSubarray.java)
- [MaxConsecutiveOnes](SlidingWindow/MaxConsecutiveOnes.java)
- [LongestSubsting](SlidingWindow/LongestSubsting.java)
- [longestSubarray](SlidingWindow/longestSubarray.java)
- [longestBeautifulSubstring](SlidingWindow/longestBeautifulSubstring.java)
- [lengthOfLongestSubstringKDistinct](SlidingWindow/lengthOfLongestSubstringKDistinct.java)
- [findMaxAverage](SlidingWindow/findMaxAverage.java)
- [findAnagrams](SlidingWindow/findAnagrams.java)
- [checkInclusion](SlidingWindow/checkInclusion.java)

### Binary-Tree
- [zigzagLevelOrder](Binary-Tree/zigzagLevelOrder.java)
- [topView](Binary-Tree/topView.java)
- [rightSideView](Binary-Tree/rightSideView.java)
- [Preorder](Binary-Tree/Preorder.java)
- [Postorder](Binary-Tree/Postorder.java)
- [minDepth](Binary-Tree/minDepth.java)
- [maxPathSum](Binary-Tree/maxPathSum.java)
- [maxDepth](Binary-Tree/maxDepth.java)
- [lowestCommonAncestor](Binary-Tree/lowestCommonAncestor.java)
- [levelOrder](Binary-Tree/levelOrder.java)
- [iterativePreOrder](Binary-Tree/iterativePreOrder.java)
- [iterativePostOrder](Binary-Tree/iterativePostOrder.java)
- [iterativeInorder](Binary-Tree/iterativeInorder.java)
- [isSymmetric](Binary-Tree/isSymmetric.java)
- [isSameTree](Binary-Tree/isSameTree.java)
- [isBalanced](Binary-Tree/isBalanced.java)
- [Inorder](Binary-Tree/Inorder.java)
- [diameterOfBinaryTree](Binary-Tree/diameterOfBinaryTree.java)
- [bottomView](Binary-Tree/bottomView.java)
- [allTraversals](Binary-Tree/allTraversals.java)

### BinarySearch
- [upperBound](BinarySearch/upperBound.java)
- [searchRange](BinarySearch/searchRange.java)
- [SearchInsertPosition](BinarySearch/SearchInsertPosition.java)
- [searchInsert](BinarySearch/searchInsert.java)
- [SearchInRotatedSortedArray](BinarySearch/SearchInRotatedSortedArray.java)
- [lowerBound](BinarySearch/lowerBound.java)
- [countFreq](BinarySearch/countFreq.java)
- [BinarySearch](BinarySearch/BinarySearch.java)

### LinkedList
- [deleteNode](LinkedList/deleteNode.java)
- [countNodesInLoop](LinkedList/countNodesInLoop.java)
- [addNode](LinkedList/addNode.java)
- [detectCycle2](LinkedList/detectCycle2.java)
- [deleteXthNode](LinkedList/deleteXthNode.java)
- [getIntersectionNode](LinkedList/getIntersectionNode.java)
- [getNth](LinkedList/getNth.java)
- [hasCycle](LinkedList/hasCycle.java)
- [searchKey](LinkedList/searchKey.java)
- [reverseSingleLL](LinkedList/reverseSingleLL.java)
- [reverseDLL](LinkedList/reverseDLL.java)
- [middleNode](LinkedList/middleNode.java)
- [insertAtEnd](LinkedList/insertAtEnd.java)

### Stacks
- [validParenthesis](Stacks/validParenthesis.java)
- [usingQueue](Stacks/usingQueue.java)
- [usingLL](Stacks/usingLL.java)
- [sumSubarrayMins](Stacks/sumSubarrayMins.java)
- [stack](Stacks/stack.java)
- [preToPost](Stacks/preToPost.java)
- [nextSmaller](Stacks/nextSmaller.java)
- [nextGreater](Stacks/nextGreater.java)
- [infixToPrefix](Stacks/infixToPrefix.java)

### Queue
- [queue](Queue/queue.java)
- [usingLL](Queue/usingLL.java)
- [usingStack](Queue/usingStack.java)

### BitManipulation
- [getDecimalValue](BitManipulation/getDecimalValue.java)

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


