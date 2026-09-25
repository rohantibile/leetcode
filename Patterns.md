# 🚀 DSA Pattern-Wise Roadmap — 90 Days, Zero to Interview-Ready

> **Goal:** Learn to *recognize patterns*, not memorize solutions.  
> **Plan:** 90 days · 167 core problems · 65 optional ⭐ stretch problems · 12 revision days · 4 timed mock interviews.  
> **Level:** Beginner → strong Medium-level interview readiness (selected Hard classics included).  
> **Time needed:** ~2–3 hours/day. If you only have ~1.5 hours, do **core only** and skip ⭐ problems.

---

## 📌 How This Roadmap Works

1. **One pattern at a time.** Every day has a *pattern name*, a *“Spot it when…”* clue, and a *key idea*. Read them **before** solving.
2. **Strict sequence.** Easy → Medium → Hard inside every pattern. Nothing depends on a topic that comes later (Heap before Merge-K, Union Find before MST, Recursion before Trees, and so on).
3. **Core vs ⭐ Stretch.** Core problems are mandatory. ⭐ problems are extra practice — skip them if you are behind schedule.
4. **Every 7th day is revision.** No new problems. You re-solve, you test yourself, you clean your Redo Queue.
5. **Last 6 days are integration.** Pattern-blind sets, timed mocks and a final pattern-identification test.

### ✅ How to tick checkboxes on GitHub
Checkboxes in a `.md` file are **not clickable** on the repo page. Open the file → ✏️ Edit → change `- [ ]` to `- [x]` → commit. (Tip: commit daily, your green graph doubles as motivation.)

---

## 🧭 Daily Routine (2–3 hours)

| Time | What to do |
|---|---|
| 15–20 min | Read the day's **Pattern / Spot it when / Key idea**. Watch or read one short explanation *only if needed*. |
| 90–120 min | Solve the core problems (see rules below). |
| 20 min | Write notes for each problem (template at the bottom). |
| 30 min *(optional)* | ⭐ Stretch problems. |

### 🔒 Rules for Solving (this is how you avoid “solving like a donkey”)

1. **Read the problem, then close the editor for 5 minutes.** Write examples and a brute-force idea on paper first.
2. **Before coding, answer:** *What is the pattern? Why? What data structure? What is the time/space complexity?*
3. **Hint ladder** — never jump straight to the solution:
   1. Struggle honestly for **20–30 min** (Easy: 15–20 min).
   2. Read only the **topic tag / one-line hint**.
   3. Read the **approach** (not the code) and close the tab.
   4. Code it yourself. Only then compare with the official/editorial code.
4. **If you needed step 3 or 4 → add the problem to the 🔴 Redo Queue** (bottom of this file). You must re-solve it on the next revision day.
5. **After every problem write 3 lines:** pattern, key insight, mistake you made.
6. **Never skip a day silently.** If you miss a day, do not stack days — shift the plan by one day and drop ⭐ problems to catch up.

---

## 🗺️ Phase Overview

| Phase | Days | Patterns |
|---|---|---|
| 1 — Linear Foundations | 1–28 | Hashing, Prefix Sum, Matrix, Two Pointers, Kadane, Sliding Window, Binary Search, Linked List, Stack, Monotonic Stack |
| 2 — Recursion & Hierarchies | 29–49 | Recursion, Tree DFS/BFS, BST, Heap, Intervals, Backtracking, Trie |
| 3 — Graphs, Greedy & Bits | 50–63 | Grid/Graph DFS-BFS, Topological Sort, Union Find, Dijkstra, MST, Greedy, Bit Manipulation, Design |
| 4 — Dynamic Programming | 64–77 | 1D DP, Knapsack, String DP, Grid DP, LIS, LCS, Edit Distance, State Machine |
| 5 — Integration & Mocks | 78–90 | Hard classics, pattern-blind practice, timed mocks, final test |

---

## ✅ Master Progress Tracker

- [ ] **Week 1** (Days 1–7) — Hashing, Prefix Sum & Matrix
- [ ] **Week 2** (Days 8–14) — Two Pointers, Kadane & Sliding Window
- [ ] **Week 3** (Days 15–21) — Sliding Window (finish), Binary Search & Linked List (start)
- [ ] **Week 4** (Days 22–28) — Linked List & Stack
- [ ] **Week 5** (Days 29–35) — Recursion & Trees
- [ ] **Week 6** (Days 36–42) — Advanced Trees, Heap & Intervals
- [ ] **Week 7** (Days 43–49) — Intervals, Backtracking & Trie
- [ ] **Week 8** (Days 50–56) — Graphs — Traversal, Topological Sort & Union Find
- [ ] **Week 9** (Days 57–63) — Weighted Graphs, Greedy, Bits & Design
- [ ] **Week 10** (Days 64–70) — DP Foundations
- [ ] **Week 11** (Days 71–77) — DP Advanced
- [ ] **Week 12** (Days 78–84) — Hard Classics & Pattern-Blind Practice
- [ ] **Final Week** (Days 85–90) — Mock Interviews & Final Test

**Legend:** 🟢 Easy · 🟡 Medium · 🔴 Hard · ⭐ Stretch (optional)

---

# Phase 1 — Linear Foundations (Days 1–28)

**Focus:** Hashing → Prefix Sum → Matrix → Two Pointers → Kadane → Sliding Window → Binary Search → Linked List → Stack.  
**Exit: you can solve most Easy and standard Medium array/string/list problems without hints.**

## 📅 Week 1 — Hashing, Prefix Sum & Matrix (Days 1–7)

### Day 1 — Complexity Thinking + Brute Force → Optimal
> - **Pattern:** HashSet / HashMap lookup
> - **Spot it when:** You keep asking “have I seen this value before?” inside a loop (brute force is O(n²)).
> - **Key idea:** Trade space for time: store what you have seen in a hash structure → O(1) lookup, O(n) total.
> - **Learn first (15–20 min):** Big-O (O(1), O(log n), O(n), O(n log n), O(n²), O(2ⁿ)), space complexity, how a hash table works (hash → bucket, collisions, average O(1)).

- [✔] **217** · [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/) · 🟢 Easy
- [✔] **1** · [Two Sum](https://leetcode.com/problems/two-sum/) · 🟢 Easy

### Day 2 — Frequency Map (Counting)
> - **Pattern:** Frequency Map
> - **Spot it when:** Anagrams, “same characters”, counts of chars/numbers, grouping items by a common signature.
> - **Key idea:** Count with a map or int[26]. For grouping, build a canonical key (sorted string or count tuple).

- [✔] **242** · [Valid Anagram](https://leetcode.com/problems/valid-anagram/) · 🟢 Easy
- [ ] ⭐ **383** · [Ransom Note](https://leetcode.com/problems/ransom-note/) · 🟢 Easy
- [✔] **49** · [Group Anagrams](https://leetcode.com/problems/group-anagrams/) · 🟡 Medium

### Day 3 — HashSet — Existence & Sequences
> - **Pattern:** HashSet
> - **Spot it when:** Duplicates, intersections, membership checks, “consecutive numbers” in unsorted data.
> - **Key idea:** Put values in a set. For Longest Consecutive Sequence, only start counting at x when x−1 is NOT in the set → O(n).

- [✔] **349** · [Intersection of Two Arrays](https://leetcode.com/problems/intersection-of-two-arrays/) · 🟢 Easy
- [✔] ⭐ **202** · [Happy Number](https://leetcode.com/problems/happy-number/) · 🟢 Easy
- [✔] **128** · [Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence/) · 🟡 Medium

### Day 4 — Prefix Sum
> - **Pattern:** Prefix Sum
> - **Spot it when:** Repeated range-sum queries, “sum on left equals sum on right”, “product/sum of everything except itself”.
> - **Key idea:** prefix[i] = sum of first i elements → sum(l..r) = prefix[r+1] − prefix[l]. For “except self” combine prefix and suffix products.

- [ ] **1480** · [Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/) · 🟢 Easy
- [ ] **724** · [Find Pivot Index](https://leetcode.com/problems/find-pivot-index/) · 🟢 Easy
- [ ] **238** · [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/) · 🟡 Medium

### Day 5 — Prefix Sum + HashMap
> - **Pattern:** Prefix Sum + HashMap
> - **Spot it when:** Count/find subarrays with sum = k (or divisible by k) when negatives exist (so a sliding window fails).
> - **Key idea:** If prefix[j] − prefix[i] = k then prefix[i] = prefix[j] − k. Store counts of prefix sums seen so far (seed with {0:1}). 525: treat 0 as −1 and look for sum 0. 974: store prefix % k.

- [ ] **560** · [Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/) · 🟡 Medium
- [ ] **525** · [Contiguous Array](https://leetcode.com/problems/contiguous-array/) · 🟡 Medium
- [ ] ⭐ **974** · [Subarray Sums Divisible by K](https://leetcode.com/problems/subarray-sums-divisible-by-k/) · 🟡 Medium

### Day 6 — Matrix Traversal & In-place Manipulation
> - **Pattern:** Matrix / In-place
> - **Spot it when:** 2D grid with layers, boundaries, rotation, or marking cells in place.
> - **Key idea:** Spiral: shrink 4 boundaries. Rotate: transpose then reverse each row. Set Zeroes: use first row/column as markers → O(1) space.

- [ ] **54** · [Spiral Matrix](https://leetcode.com/problems/spiral-matrix/) · 🟡 Medium
- [ ] **48** · [Rotate Image](https://leetcode.com/problems/rotate-image/) · 🟡 Medium
- [ ] ⭐ **73** · [Set Matrix Zeroes](https://leetcode.com/problems/set-matrix-zeroes/) · 🟡 Medium

### Day 7 — 🔁 Revision & Weekly Test
> **Rule:** No new problems today. Revision is where patterns become permanent.

- [ ] **Re-solve from scratch** (no notes, max 25 min each):
  - [ ] **49** · [Group Anagrams](https://leetcode.com/problems/group-anagrams/) · 🟡 Medium
  - [ ] **128** · [Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence/) · 🟡 Medium
  - [ ] **238** · [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/) · 🟡 Medium
  - [ ] **560** · [Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/) · 🟡 Medium
- [ ] Redo every problem you added to the 🔴 **Redo Queue** this week
- [ ] **Blank-page test:** for each pattern of this week write the *trigger phrase*, the *template* and the *complexity* from memory
- [ ] **Weekly exit test:** I can explain why a hash lookup turns O(n²) into O(n), and write prefix-sum + HashMap for “subarray sum = k” from memory.
- [ ] ✅ **Week 1 complete**

## 📅 Week 2 — Two Pointers, Kadane & Sliding Window (Days 8–14)

### Day 8 — Two Pointers — Opposite Ends
> - **Pattern:** Two Pointers (Opposite Ends)
> - **Spot it when:** Sorted array or palindrome; find a pair with a target; squares of a sorted array.
> - **Key idea:** left = 0, right = n−1. Compare, then move the pointer that can still improve the answer. O(n) instead of O(n²).

- [ ] **125** · [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/) · 🟢 Easy
- [ ] ⭐ **977** · [Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/) · 🟢 Easy
- [ ] **167** · [Two Sum II - Input Array Is Sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/) · 🟡 Medium

### Day 9 — Two Pointers — Same Direction (Read/Write)
> - **Pattern:** Two Pointers (Read/Write)
> - **Spot it when:** Modify an array in place: remove, dedupe, move zeroes, partition, merge sorted arrays.
> - **Key idea:** fast scans, slow marks the write position. Sort Colors = 3 pointers (Dutch National Flag). Merge Sorted Array: fill from the back.

- [ ] **283** · [Move Zeroes](https://leetcode.com/problems/move-zeroes/) · 🟢 Easy
- [ ] **26** · [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) · 🟢 Easy
- [ ] ⭐ **88** · [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/) · 🟢 Easy
- [ ] **75** · [Sort Colors](https://leetcode.com/problems/sort-colors/) · 🟡 Medium

### Day 10 — Two Pointers on Sorted Data — Fix One, Scan Two
> - **Pattern:** Two Pointers + Sorting
> - **Spot it when:** Triplets / k-sum, “closest to target”, maximize area between two ends.
> - **Key idea:** Sort → fix i → two pointers on the rest; skip duplicates. Container: always move the shorter wall.

- [ ] **11** · [Container With Most Water](https://leetcode.com/problems/container-with-most-water/) · 🟡 Medium
- [ ] **15** · [3Sum](https://leetcode.com/problems/3sum/) · 🟡 Medium
- [ ] ⭐ **16** · [3Sum Closest](https://leetcode.com/problems/3sum-closest/) · 🟡 Medium

### Day 11 — Kadane / Running State
> - **Pattern:** Kadane's Algorithm / Running State
> - **Spot it when:** Max/min subarray sum or product; best profit in a single pass.
> - **Key idea:** At each index decide: extend the previous subarray or start fresh. Keep “best so far” separately. For products keep both max and min (negatives flip signs).

- [ ] **121** · [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) · 🟢 Easy
- [ ] **53** · [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/) · 🟡 Medium
- [ ] ⭐ **152** · [Maximum Product Subarray](https://leetcode.com/problems/maximum-product-subarray/) · 🟡 Medium

### Day 12 — Sliding Window — Fixed Size
> - **Pattern:** Sliding Window (Fixed)
> - **Spot it when:** Subarray/substring of fixed size k; permutations/anagrams inside a bigger string.
> - **Key idea:** Add the entering element, remove the leaving element, compare counts. Use int[26] frequency arrays. O(n).

- [ ] **643** · [Maximum Average Subarray I](https://leetcode.com/problems/maximum-average-subarray-i/) · 🟢 Easy
- [ ] **567** · [Permutation in String](https://leetcode.com/problems/permutation-in-string/) · 🟡 Medium
- [ ] ⭐ **438** · [Find All Anagrams in a String](https://leetcode.com/problems/find-all-anagrams-in-a-string/) · 🟡 Medium

### Day 13 — Sliding Window — Variable Size (Longest)
> - **Pattern:** Sliding Window (Variable – Longest)
> - **Spot it when:** “Longest substring/subarray with at most K … / without …” where validity can break.
> - **Key idea:** Expand right; while the window is invalid shrink from the left; update the max after fixing. Template: for right → add; while (invalid) remove left, left++; best = max(best, right−left+1).

- [ ] **3** · [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) · 🟡 Medium
- [ ] **424** · [Longest Repeating Character Replacement](https://leetcode.com/problems/longest-repeating-character-replacement/) · 🟡 Medium
- [ ] ⭐ **1004** · [Max Consecutive Ones III](https://leetcode.com/problems/max-consecutive-ones-iii/) · 🟡 Medium

### Day 14 — 🔁 Revision & Weekly Test
> **Rule:** No new problems today. Revision is where patterns become permanent.

- [ ] **Re-solve from scratch** (no notes, max 25 min each):
  - [ ] **15** · [3Sum](https://leetcode.com/problems/3sum/) · 🟡 Medium
  - [ ] **53** · [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/) · 🟡 Medium
  - [ ] **567** · [Permutation in String](https://leetcode.com/problems/permutation-in-string/) · 🟡 Medium
  - [ ] **3** · [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) · 🟡 Medium
- [ ] Redo every problem you added to the 🔴 **Redo Queue** this week
- [ ] **Blank-page test:** for each pattern of this week write the *trigger phrase*, the *template* and the *complexity* from memory
- [ ] **Weekly exit test:** I can tell Two Pointers vs Sliding Window vs Kadane from the problem statement, and write the variable-window template from memory.
- [ ] ✅ **Week 2 complete**

## 📅 Week 3 — Sliding Window (finish), Binary Search & Linked List (start) (Days 15–21)

### Day 15 — Sliding Window — Variable Size (Shortest / Need-Have)
> - **Pattern:** Sliding Window (Variable – Shortest)
> - **Spot it when:** “Minimum length subarray/substring that satisfies …”.
> - **Key idea:** Expand until valid, then shrink as much as possible while still valid, recording the minimum. For Minimum Window Substring track need/have counts.

- [ ] **209** · [Minimum Size Subarray Sum](https://leetcode.com/problems/minimum-size-subarray-sum/) · 🟡 Medium
- [ ] **904** · [Fruit Into Baskets](https://leetcode.com/problems/fruit-into-baskets/) · 🟡 Medium
- [ ] ⭐ **76** · [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/) · 🔴 Hard

### Day 16 — Binary Search — Classic
> - **Pattern:** Binary Search
> - **Spot it when:** Sorted data, or any search space that can be halved. Expected O(log n).
> - **Key idea:** lo, hi, mid = lo + (hi − lo)/2 (avoids overflow). Decide the loop invariant first. Search a 2D Matrix = binary search on a flattened index. Sqrt(x) = search on the answer range.
> - **Learn first (15–20 min):** The two templates: lo <= hi (exact search) and lo < hi (find boundary).

- [ ] **704** · [Binary Search](https://leetcode.com/problems/binary-search/) · 🟢 Easy
- [ ] **35** · [Search Insert Position](https://leetcode.com/problems/search-insert-position/) · 🟢 Easy
- [ ] ⭐ **69** · [Sqrt(x)](https://leetcode.com/problems/sqrtx/) · 🟢 Easy
- [ ] **74** · [Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix/) · 🟡 Medium

### Day 17 — Binary Search — Boundaries
> - **Pattern:** Binary Search (First/Last True)
> - **Spot it when:** First/last occurrence, first “true” in a false…false true…true sequence, peaks.
> - **Key idea:** Use the template “find the first index where condition is true”. Peak element: compare mid with mid+1 to know which side has a peak.

- [ ] **278** · [First Bad Version](https://leetcode.com/problems/first-bad-version/) · 🟢 Easy
- [ ] **34** · [Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/) · 🟡 Medium
- [ ] ⭐ **162** · [Find Peak Element](https://leetcode.com/problems/find-peak-element/) · 🟡 Medium

### Day 18 — Binary Search — Rotated Array
> - **Pattern:** Binary Search (Rotated Array)
> - **Spot it when:** Sorted array that was rotated.
> - **Key idea:** At least one half [lo..mid] or [mid..hi] is always sorted. Check whether the target lies in the sorted half; otherwise go to the other half.

- [ ] **153** · [Find Minimum in Rotated Sorted Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/) · 🟡 Medium
- [ ] **33** · [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/) · 🟡 Medium

### Day 19 — Binary Search on Answer
> - **Pattern:** Binary Search on Answer
> - **Spot it when:** “Minimum speed / capacity / largest-sum such that it is possible”. The answer is a number in a range and feasibility is monotonic.
> - **Key idea:** Write feasible(x) (usually a greedy simulation), then binary search the smallest x where feasible(x) is true.

- [ ] **875** · [Koko Eating Bananas](https://leetcode.com/problems/koko-eating-bananas/) · 🟡 Medium
- [ ] **1011** · [Capacity To Ship Packages Within D Days](https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/) · 🟡 Medium
- [ ] ⭐ **410** · [Split Array Largest Sum](https://leetcode.com/problems/split-array-largest-sum/) · 🔴 Hard

### Day 20 — Linked List — Dummy Node & Reversal
> - **Pattern:** Linked List (Reversal / Dummy Node)
> - **Spot it when:** Rewiring next pointers, deleting nodes, merging lists.
> - **Key idea:** Reversal: prev, curr, next. Merge: dummy head + tail pointer. A dummy node removes head edge cases. Draw the boxes before coding.

- [ ] **206** · [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/) · 🟢 Easy
- [ ] **21** · [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/) · 🟢 Easy
- [ ] ⭐ **203** · [Remove Linked List Elements](https://leetcode.com/problems/remove-linked-list-elements/) · 🟢 Easy

### Day 21 — 🔁 Revision & Weekly Test
> **Rule:** No new problems today. Revision is where patterns become permanent.

- [ ] **Re-solve from scratch** (no notes, max 25 min each):
  - [ ] **209** · [Minimum Size Subarray Sum](https://leetcode.com/problems/minimum-size-subarray-sum/) · 🟡 Medium
  - [ ] **34** · [Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/) · 🟡 Medium
  - [ ] **33** · [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/) · 🟡 Medium
  - [ ] **875** · [Koko Eating Bananas](https://leetcode.com/problems/koko-eating-bananas/) · 🟡 Medium
- [ ] Redo every problem you added to the 🔴 **Redo Queue** this week
- [ ] **Blank-page test:** for each pattern of this week write the *trigger phrase*, the *template* and the *complexity* from memory
- [ ] **Weekly exit test:** I can write binary search (exact, boundary, on-answer) without off-by-one bugs and explain what “monotonic feasibility” means.
- [ ] ✅ **Week 3 complete**

## 📅 Week 4 — Linked List & Stack (Days 22–28)

### Day 22 — Linked List — Fast & Slow Pointers
> - **Pattern:** Fast & Slow Pointers
> - **Spot it when:** Middle of list, cycle detection, start of cycle.
> - **Key idea:** slow moves 1, fast moves 2. If they meet → cycle. Reset one pointer to head and move both 1 step to find the cycle start (Floyd).

- [ ] **876** · [Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/) · 🟢 Easy
- [ ] **141** · [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/) · 🟢 Easy
- [ ] **142** · [Linked List Cycle II](https://leetcode.com/problems/linked-list-cycle-ii/) · 🟡 Medium

### Day 23 — Linked List — Gap Pointers & Combos
> - **Pattern:** Linked List (Gap Pointers + Reverse)
> - **Spot it when:** Nth node from end, intersection of two lists, palindrome check.
> - **Key idea:** Nth from end: move fast n steps ahead, then move both. Intersection: switch heads at the end (a+b = b+a). Palindrome = find middle + reverse second half + compare.

- [ ] ⭐ **160** · [Intersection of Two Linked Lists](https://leetcode.com/problems/intersection-of-two-linked-lists/) · 🟢 Easy
- [ ] **234** · [Palindrome Linked List](https://leetcode.com/problems/palindrome-linked-list/) · 🟢 Easy
- [ ] **19** · [Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/) · 🟡 Medium

### Day 24 — Linked List — Combining Patterns
> - **Pattern:** Linked List (Combined Techniques)
> - **Spot it when:** Problems that need 2–3 basic techniques together.
> - **Key idea:** 92: reverse a sub-part with a dummy. 2: digit by digit with carry. 143: middle → reverse second half → interleave merge.

- [ ] ⭐ **92** · [Reverse Linked List II](https://leetcode.com/problems/reverse-linked-list-ii/) · 🟡 Medium
- [ ] **2** · [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/) · 🟡 Medium
- [ ] **143** · [Reorder List](https://leetcode.com/problems/reorder-list/) · 🟡 Medium

### Day 25 — Stack — Basics
> - **Pattern:** Stack
> - **Spot it when:** Matching pairs/brackets, nested structure, undo/last-in-first-out, expression evaluation.
> - **Key idea:** Push opens, pop on matching close; stack must be empty at the end. Min Stack: store (value, min-so-far) together. Queue via two stacks: move elements only when the out-stack is empty.
> - **Learn first (15–20 min):** Java: prefer ArrayDeque over Stack/LinkedList. Learn push/pop/peek and offer/poll.

- [ ] **20** · [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) · 🟢 Easy
- [ ] ⭐ **232** · [Implement Queue using Stacks](https://leetcode.com/problems/implement-queue-using-stacks/) · 🟢 Easy
- [ ] **155** · [Min Stack](https://leetcode.com/problems/min-stack/) · 🟡 Medium
- [ ] ⭐ **150** · [Evaluate Reverse Polish Notation](https://leetcode.com/problems/evaluate-reverse-polish-notation/) · 🟡 Medium

### Day 26 — Monotonic Stack
> - **Pattern:** Monotonic Stack
> - **Spot it when:** “Next greater/smaller element”, “days until warmer”, “span”.
> - **Key idea:** Keep a stack of indices with decreasing values. While current > top → pop; current is the answer for the popped index. Circular array: loop 2n with i % n.

- [ ] **496** · [Next Greater Element I](https://leetcode.com/problems/next-greater-element-i/) · 🟢 Easy
- [ ] **739** · [Daily Temperatures](https://leetcode.com/problems/daily-temperatures/) · 🟡 Medium
- [ ] **503** · [Next Greater Element II](https://leetcode.com/problems/next-greater-element-ii/) · 🟡 Medium
- [ ] ⭐ **901** · [Online Stock Span](https://leetcode.com/problems/online-stock-span/) · 🟡 Medium

### Day 27 — Monotonic Stack — Advanced & Parsing
> - **Pattern:** Monotonic Stack / Stack Parsing
> - **Spot it when:** Nested encodings, largest area with bars, ordering by arrival time.
> - **Key idea:** Decode String: stack of (count, prevString). Car Fleet: sort by position, keep a stack of arrival times. Histogram: for each bar find the nearest smaller bar on both sides (increasing stack).

- [ ] **394** · [Decode String](https://leetcode.com/problems/decode-string/) · 🟡 Medium
- [ ] ⭐ **853** · [Car Fleet](https://leetcode.com/problems/car-fleet/) · 🟡 Medium
- [ ] **84** · [Largest Rectangle in Histogram](https://leetcode.com/problems/largest-rectangle-in-histogram/) · 🔴 Hard

### Day 28 — 🔁 Revision & Weekly Test
> **Rule:** No new problems today. Revision is where patterns become permanent.

- [ ] **Re-solve from scratch** (no notes, max 25 min each):
  - [ ] **19** · [Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/) · 🟡 Medium
  - [ ] **143** · [Reorder List](https://leetcode.com/problems/reorder-list/) · 🟡 Medium
  - [ ] **739** · [Daily Temperatures](https://leetcode.com/problems/daily-temperatures/) · 🟡 Medium
  - [ ] **394** · [Decode String](https://leetcode.com/problems/decode-string/) · 🟡 Medium
- [ ] Redo every problem you added to the 🔴 **Redo Queue** this week
- [ ] **Blank-page test:** for each pattern of this week write the *trigger phrase*, the *template* and the *complexity* from memory
- [ ] **Weekly exit test:** I can reverse a linked list, detect a cycle, and write a monotonic stack from memory.
- [ ] ✅ **Week 4 complete**

# Phase 2 — Recursion & Hierarchical Structures (Days 29–49)

**Focus:** Recursion → Trees → BST → Heap → Intervals → Backtracking → Trie.  
**Exit: recursion feels natural; you can write DFS/BFS on trees and the backtracking template from memory.**

## 📅 Week 5 — Recursion & Trees (Days 29–35)

### Day 29 — Recursion Basics
> - **Pattern:** Recursion
> - **Spot it when:** The problem is defined in terms of a smaller version of itself.
> - **Key idea:** Base case + recursive case + trust the recursion. Pow(x, n): halve the exponent (O(log n)). Max Depth: 1 + max(left, right). Understand the call stack.

- [ ] **509** · [Fibonacci Number](https://leetcode.com/problems/fibonacci-number/) · 🟢 Easy
- [ ] ⭐ **50** · [Pow(x, n)](https://leetcode.com/problems/powx-n/) · 🟡 Medium
- [ ] **104** · [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/) · 🟢 Easy

### Day 30 — Tree Traversals (DFS)
> - **Pattern:** Tree DFS Traversals
> - **Spot it when:** Visit every node in a specific order.
> - **Key idea:** Preorder (root-left-right), Inorder (left-root-right), Postorder (left-right-root). Write recursive first, then iterative with an explicit stack.

- [ ] **144** · [Binary Tree Preorder Traversal](https://leetcode.com/problems/binary-tree-preorder-traversal/) · 🟢 Easy
- [ ] **94** · [Binary Tree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/) · 🟢 Easy
- [ ] **145** · [Binary Tree Postorder Traversal](https://leetcode.com/problems/binary-tree-postorder-traversal/) · 🟢 Easy

### Day 31 — Tree DFS — Compare & Transform
> - **Pattern:** Tree DFS (Two-Tree Recursion)
> - **Spot it when:** Two trees to compare, mirror/invert, subtree check.
> - **Key idea:** Recurse on both trees at once: mirror = (a.left, b.right) and (a.right, b.left). Subtree check = at every node try isSameTree.

- [ ] **226** · [Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/) · 🟢 Easy
- [ ] **100** · [Same Tree](https://leetcode.com/problems/same-tree/) · 🟢 Easy
- [ ] **101** · [Symmetric Tree](https://leetcode.com/problems/symmetric-tree/) · 🟢 Easy
- [ ] ⭐ **572** · [Subtree of Another Tree](https://leetcode.com/problems/subtree-of-another-tree/) · 🟢 Easy

### Day 32 — Tree DFS — Bottom-Up vs Top-Down State
> - **Pattern:** Tree DFS (Bottom-Up / Top-Down)
> - **Spot it when:** Need heights/diameter/balance (info from children) or path state (info from parents).
> - **Key idea:** Bottom-up: return height and update a global answer (diameter) at each node. Top-down: pass max-so-far down as a parameter (Count Good Nodes).

- [ ] **543** · [Diameter of Binary Tree](https://leetcode.com/problems/diameter-of-binary-tree/) · 🟢 Easy
- [ ] **110** · [Balanced Binary Tree](https://leetcode.com/problems/balanced-binary-tree/) · 🟢 Easy
- [ ] ⭐ **112** · [Path Sum](https://leetcode.com/problems/path-sum/) · 🟢 Easy
- [ ] **1448** · [Count Good Nodes in Binary Tree](https://leetcode.com/problems/count-good-nodes-in-binary-tree/) · 🟡 Medium

### Day 33 — Tree BFS — Level Order
> - **Pattern:** Tree BFS
> - **Spot it when:** Level by level, right/left view, minimum depth, zigzag.
> - **Key idea:** Use a queue; for each level record size = queue.size() and process exactly that many nodes.

- [ ] **102** · [Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/) · 🟡 Medium
- [ ] ⭐ **111** · [Minimum Depth of Binary Tree](https://leetcode.com/problems/minimum-depth-of-binary-tree/) · 🟢 Easy
- [ ] **199** · [Binary Tree Right Side View](https://leetcode.com/problems/binary-tree-right-side-view/) · 🟡 Medium
- [ ] ⭐ **103** · [Binary Tree Zigzag Level Order Traversal](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/) · 🟡 Medium

### Day 34 — Binary Search Tree
> - **Pattern:** BST
> - **Spot it when:** Sorted-order property, “kth smallest”, validate BST, LCA in BST.
> - **Key idea:** Inorder of a BST is sorted. Validate by passing (low, high) bounds. LCA in BST: go left if both smaller, right if both larger, otherwise the current node is the LCA.

- [ ] ⭐ **108** · [Convert Sorted Array to Binary Search Tree](https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/) · 🟢 Easy
- [ ] **98** · [Validate Binary Search Tree](https://leetcode.com/problems/validate-binary-search-tree/) · 🟡 Medium
- [ ] **230** · [Kth Smallest Element in a BST](https://leetcode.com/problems/kth-smallest-element-in-a-bst/) · 🟡 Medium
- [ ] **235** · [Lowest Common Ancestor of a Binary Search Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/) · 🟡 Medium

### Day 35 — 🔁 Revision & Weekly Test
> **Rule:** No new problems today. Revision is where patterns become permanent.

- [ ] **Re-solve from scratch** (no notes, max 25 min each):
  - [ ] **102** · [Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/) · 🟡 Medium
  - [ ] **199** · [Binary Tree Right Side View](https://leetcode.com/problems/binary-tree-right-side-view/) · 🟡 Medium
  - [ ] **98** · [Validate Binary Search Tree](https://leetcode.com/problems/validate-binary-search-tree/) · 🟡 Medium
  - [ ] **543** · [Diameter of Binary Tree](https://leetcode.com/problems/diameter-of-binary-tree/) · 🟢 Easy
- [ ] Redo every problem you added to the 🔴 **Redo Queue** this week
- [ ] **Blank-page test:** for each pattern of this week write the *trigger phrase*, the *template* and the *complexity* from memory
- [ ] **Weekly exit test:** I can write tree DFS (top-down and bottom-up) and BFS, and validate a BST, from memory.
- [ ] ✅ **Week 5 complete**

## 📅 Week 6 — Advanced Trees, Heap & Intervals (Days 36–42)

### Day 36 — Trees — Advanced Recursion
> - **Pattern:** Tree DFS (LCA / Construction / Prefix Sum)
> - **Spot it when:** LCA in a general tree, building a tree from traversals, path sums that do not start at the root.
> - **Key idea:** 236: return the node if found in left/right; both non-null → current is LCA. 105: preorder gives the root, inorder splits (HashMap of inorder indices). 437: prefix sum + HashMap along the root-to-node path (undo on return).

- [ ] **236** · [Lowest Common Ancestor of a Binary Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/) · 🟡 Medium
- [ ] **105** · [Construct Binary Tree from Preorder and Inorder Traversal](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/) · 🟡 Medium
- [ ] ⭐ **437** · [Path Sum III](https://leetcode.com/problems/path-sum-iii/) · 🟡 Medium

### Day 37 — Trees — Hard Classics
> - **Pattern:** Tree DFS (Global Answer) / Serialization
> - **Spot it when:** Best path through any node; convert tree ↔ string.
> - **Key idea:** 124: return the best one-sided gain to the parent, update the global answer with left + right + node. 297: preorder with null markers (or BFS). 114: reverse postorder (right, left, root) with a prev pointer.

- [ ] ⭐ **114** · [Flatten Binary Tree to Linked List](https://leetcode.com/problems/flatten-binary-tree-to-linked-list/) · 🟡 Medium
- [ ] **124** · [Binary Tree Maximum Path Sum](https://leetcode.com/problems/binary-tree-maximum-path-sum/) · 🔴 Hard
- [ ] **297** · [Serialize and Deserialize Binary Tree](https://leetcode.com/problems/serialize-and-deserialize-binary-tree/) · 🔴 Hard

### Day 38 — Heap / Priority Queue — Top K
> - **Pattern:** Heap (Top K)
> - **Spot it when:** “K largest/smallest/most frequent”, running k-th element in a stream.
> - **Key idea:** Min-heap of size k for the k largest (root = kth largest) → O(n log k). Also learn Quickselect for 215 (average O(n)). 347: frequency map + heap (or bucket sort).
> - **Learn first (15–20 min):** Java: PriorityQueue (min-heap by default), Collections.reverseOrder() for a max-heap, custom comparators.

- [ ] ⭐ **1046** · [Last Stone Weight](https://leetcode.com/problems/last-stone-weight/) · 🟢 Easy
- [ ] **703** · [Kth Largest Element in a Stream](https://leetcode.com/problems/kth-largest-element-in-a-stream/) · 🟢 Easy
- [ ] **215** · [Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/) · 🟡 Medium
- [ ] **347** · [Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/) · 🟡 Medium

### Day 39 — Heap — Custom Comparators
> - **Pattern:** Heap + Comparator
> - **Spot it when:** Top-K with ordering rules (distance, frequency then alphabetical).
> - **Key idea:** Choose the heap type by what you want to evict. 973: max-heap of size k by distance. 692: comparator = frequency desc, then word asc.

- [ ] **973** · [K Closest Points to Origin](https://leetcode.com/problems/k-closest-points-to-origin/) · 🟡 Medium
- [ ] **692** · [Top K Frequent Words](https://leetcode.com/problems/top-k-frequent-words/) · 🟡 Medium
- [ ] ⭐ **451** · [Sort Characters By Frequency](https://leetcode.com/problems/sort-characters-by-frequency/) · 🟡 Medium

### Day 40 — Heap — Merge K Sorted & Two Heaps
> - **Pattern:** Heap (Merge K / Two Heaps)
> - **Spot it when:** Merge many sorted sequences; median of a data stream.
> - **Key idea:** 23: push the head of every list, pop the smallest, push its next. 295: max-heap for the lower half, min-heap for the upper half; keep sizes balanced (differ by ≤ 1).

- [ ] **23** · [Merge k Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/) · 🔴 Hard
- [ ] **295** · [Find Median from Data Stream](https://leetcode.com/problems/find-median-from-data-stream/) · 🔴 Hard

### Day 41 — Intervals — Sort & Merge
> - **Pattern:** Intervals (Sorting + Greedy)
> - **Spot it when:** Overlapping ranges, merge/insert, minimum removals.
> - **Key idea:** Sort by start; compare with the last merged interval. Non-overlapping / arrows: sort by end and greedily keep the interval that ends earliest.

- [ ] **56** · [Merge Intervals](https://leetcode.com/problems/merge-intervals/) · 🟡 Medium
- [ ] **57** · [Insert Interval](https://leetcode.com/problems/insert-interval/) · 🟡 Medium
- [ ] **435** · [Non-overlapping Intervals](https://leetcode.com/problems/non-overlapping-intervals/) · 🟡 Medium
- [ ] ⭐ **452** · [Minimum Number of Arrows to Burst Balloons](https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/) · 🟡 Medium

### Day 42 — 🔁 Revision & Weekly Test
> **Rule:** No new problems today. Revision is where patterns become permanent.

- [ ] **Re-solve from scratch** (no notes, max 25 min each):
  - [ ] **236** · [Lowest Common Ancestor of a Binary Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/) · 🟡 Medium
  - [ ] **347** · [Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/) · 🟡 Medium
  - [ ] **56** · [Merge Intervals](https://leetcode.com/problems/merge-intervals/) · 🟡 Medium
  - [ ] **295** · [Find Median from Data Stream](https://leetcode.com/problems/find-median-from-data-stream/) · 🔴 Hard
- [ ] Redo every problem you added to the 🔴 **Redo Queue** this week
- [ ] **Blank-page test:** for each pattern of this week write the *trigger phrase*, the *template* and the *complexity* from memory
- [ ] **Weekly exit test:** I can choose the right heap for Top-K, merge intervals, and explain Two Heaps for the running median.
- [ ] ✅ **Week 6 complete**

## 📅 Week 7 — Intervals, Backtracking & Trie (Days 43–49)

### Day 43 — Intervals II — Two Pointers & Sweep
> - **Pattern:** Intervals (Two Pointers / Heap)
> - **Spot it when:** Two sorted interval lists; “minimum rooms/groups needed”.
> - **Key idea:** 986: two pointers; intersection = [max(starts), min(ends)]; advance the one that ends first. 2406: sort by start + min-heap of end times (heap size = groups needed; same idea as Meeting Rooms II, which is premium).

- [ ] **986** · [Interval List Intersections](https://leetcode.com/problems/interval-list-intersections/) · 🟡 Medium
- [ ] **2406** · [Divide Intervals Into Minimum Number of Groups](https://leetcode.com/problems/divide-intervals-into-minimum-number-of-groups/) · 🟡 Medium
- [ ] ⭐ **621** · [Task Scheduler](https://leetcode.com/problems/task-scheduler/) · 🟡 Medium

### Day 44 — Backtracking — Subsets & Combinations
> - **Pattern:** Backtracking (Subsets)
> - **Spot it when:** “All possible subsets / combinations / choices”.
> - **Key idea:** choose → explore → un-choose. Pass a start index to avoid reuse. With duplicate inputs: sort and skip nums[i] == nums[i−1] at the same depth.

- [ ] **78** · [Subsets](https://leetcode.com/problems/subsets/) · 🟡 Medium
- [ ] ⭐ **77** · [Combinations](https://leetcode.com/problems/combinations/) · 🟡 Medium
- [ ] **90** · [Subsets II](https://leetcode.com/problems/subsets-ii/) · 🟡 Medium

### Day 45 — Backtracking — Permutations & Mapping
> - **Pattern:** Backtracking (Permutations)
> - **Spot it when:** All orderings; each position has multiple choices.
> - **Key idea:** Permutations: used[] array (or swap in place). Letter Combinations: recurse by digit index over the mapped letters. Recursion depth = length of one answer.

- [ ] **46** · [Permutations](https://leetcode.com/problems/permutations/) · 🟡 Medium
- [ ] ⭐ **47** · [Permutations II](https://leetcode.com/problems/permutations-ii/) · 🟡 Medium
- [ ] **17** · [Letter Combinations of a Phone Number](https://leetcode.com/problems/letter-combinations-of-a-phone-number/) · 🟡 Medium

### Day 46 — Backtracking — Combination Sum (Pruning)
> - **Pattern:** Backtracking (Pruning)
> - **Spot it when:** Pick numbers to reach a target; reuse allowed or not.
> - **Key idea:** Reuse allowed → recurse with the same index i. No reuse → i+1. Sort and prune when remaining < 0; skip duplicates at the same level.

- [ ] **39** · [Combination Sum](https://leetcode.com/problems/combination-sum/) · 🟡 Medium
- [ ] **40** · [Combination Sum II](https://leetcode.com/problems/combination-sum-ii/) · 🟡 Medium
- [ ] ⭐ **216** · [Combination Sum III](https://leetcode.com/problems/combination-sum-iii/) · 🟡 Medium

### Day 47 — Backtracking — Constraints & Grid
> - **Pattern:** Backtracking (Constraints / Grid)
> - **Spot it when:** Generate only valid answers (parentheses), path search on a grid, partitions.
> - **Key idea:** 22: add “(” if open < n, add “)” if close < open. 79: DFS on the grid, mark visited, un-mark on return (same grid-DFS idea returns on Day 50). 131: try every cut, recurse only if the piece is a palindrome. 51: track columns/diagonals in sets.

- [ ] **22** · [Generate Parentheses](https://leetcode.com/problems/generate-parentheses/) · 🟡 Medium
- [ ] **79** · [Word Search](https://leetcode.com/problems/word-search/) · 🟡 Medium
- [ ] **131** · [Palindrome Partitioning](https://leetcode.com/problems/palindrome-partitioning/) · 🟡 Medium
- [ ] ⭐ **51** · [N-Queens](https://leetcode.com/problems/n-queens/) · 🔴 Hard

### Day 48 — Trie (Prefix Tree)
> - **Pattern:** Trie
> - **Spot it when:** Prefix search, autocomplete, dictionary of words, wildcard search.
> - **Key idea:** Node = children[26] + isEnd. Insert/search are O(word length). Wildcard “.” → DFS over all children. Word Search II: build a trie of all words, DFS the grid once and prune with the trie.

- [ ] **208** · [Implement Trie (Prefix Tree)](https://leetcode.com/problems/implement-trie-prefix-tree/) · 🟡 Medium
- [ ] **211** · [Design Add and Search Words Data Structure](https://leetcode.com/problems/design-add-and-search-words-data-structure/) · 🟡 Medium
- [ ] ⭐ **212** · [Word Search II](https://leetcode.com/problems/word-search-ii/) · 🔴 Hard

### Day 49 — 🔁 Revision & Weekly Test
> **Rule:** No new problems today. Revision is where patterns become permanent.

- [ ] **Re-solve from scratch** (no notes, max 25 min each):
  - [ ] **78** · [Subsets](https://leetcode.com/problems/subsets/) · 🟡 Medium
  - [ ] **46** · [Permutations](https://leetcode.com/problems/permutations/) · 🟡 Medium
  - [ ] **79** · [Word Search](https://leetcode.com/problems/word-search/) · 🟡 Medium
  - [ ] **208** · [Implement Trie (Prefix Tree)](https://leetcode.com/problems/implement-trie-prefix-tree/) · 🟡 Medium
- [ ] Redo every problem you added to the 🔴 **Redo Queue** this week
- [ ] **Blank-page test:** for each pattern of this week write the *trigger phrase*, the *template* and the *complexity* from memory
- [ ] **Weekly exit test:** I can write the choose → explore → un-choose template and a Trie from memory.
- [ ] ✅ **Week 7 complete**

# Phase 3 — Graphs, Greedy & Bits (Days 50–63)

**Focus:** Grid/Graph DFS-BFS → Topological Sort → Union Find → Dijkstra → MST → Greedy → Bits → Design.  
**Exit: given a graph statement you can name the right algorithm.**

## 📅 Week 8 — Graphs — Traversal, Topological Sort & Union Find (Days 50–56)

### Day 50 — Graph — Grid DFS/BFS
> - **Pattern:** Graph (Grid DFS/BFS)
> - **Spot it when:** Islands, connected regions, flood fill on a matrix.
> - **Key idea:** Treat every cell as a node with 4 neighbors. Mark visited (or sink the cell). Number of components = number of DFS/BFS starts. dirs = {1,0},{-1,0},{0,1},{0,-1}.

- [ ] **733** · [Flood Fill](https://leetcode.com/problems/flood-fill/) · 🟢 Easy
- [ ] **200** · [Number of Islands](https://leetcode.com/problems/number-of-islands/) · 🟡 Medium
- [ ] ⭐ **695** · [Max Area of Island](https://leetcode.com/problems/max-area-of-island/) · 🟡 Medium

### Day 51 — Graph — Adjacency List & Connected Components
> - **Pattern:** Graph (Adjacency List DFS/BFS)
> - **Spot it when:** Nodes + edges given as a list; connected components; copying a graph.
> - **Key idea:** Build an adjacency list from edges. DFS/BFS with a visited set. Clone Graph: HashMap<oldNode, newNode> avoids infinite loops.
> - **Learn first (15–20 min):** Graph terms: directed/undirected, weighted, cycle, adjacency list vs adjacency matrix.

- [ ] ⭐ **1971** · [Find if Path Exists in Graph](https://leetcode.com/problems/find-if-path-exists-in-graph/) · 🟢 Easy
- [ ] **547** · [Number of Provinces](https://leetcode.com/problems/number-of-provinces/) · 🟡 Medium
- [ ] **133** · [Clone Graph](https://leetcode.com/problems/clone-graph/) · 🟡 Medium

### Day 52 — BFS — Shortest Path & Multi-Source BFS
> - **Pattern:** BFS (Shortest Path / Multi-Source)
> - **Spot it when:** “Minimum steps/minutes” in an unweighted graph or grid; spreading from many sources at once (rotting, fire, distance to nearest 0).
> - **Key idea:** BFS gives the shortest path when every edge costs 1. Multi-source: push ALL sources into the queue first; the level number is the time/distance.

- [ ] **1091** · [Shortest Path in Binary Matrix](https://leetcode.com/problems/shortest-path-in-binary-matrix/) · 🟡 Medium
- [ ] **994** · [Rotting Oranges](https://leetcode.com/problems/rotting-oranges/) · 🟡 Medium
- [ ] ⭐ **542** · [01 Matrix](https://leetcode.com/problems/01-matrix/) · 🟡 Medium

### Day 53 — Graph — Reverse Traversal & BFS on Implicit Graph
> - **Pattern:** Graph (Reverse DFS / Implicit BFS)
> - **Spot it when:** “Which cells can reach the border/ocean”, transformation sequences.
> - **Key idea:** 417: start from the oceans and move inward (think in reverse). 130: mark border-connected “O”s safe, flip the rest. 127: every word is a node, neighbors differ by 1 letter, BFS = shortest transformation.

- [ ] ⭐ **130** · [Surrounded Regions](https://leetcode.com/problems/surrounded-regions/) · 🟡 Medium
- [ ] **417** · [Pacific Atlantic Water Flow](https://leetcode.com/problems/pacific-atlantic-water-flow/) · 🟡 Medium
- [ ] **127** · [Word Ladder](https://leetcode.com/problems/word-ladder/) · 🔴 Hard

### Day 54 — Topological Sort & Cycle Detection
> - **Pattern:** Topological Sort (Kahn's) / Graph Coloring
> - **Spot it when:** Prerequisites, dependencies, ordering tasks, “is it possible to finish”.
> - **Key idea:** Kahn's algorithm: indegree array + queue; if processed < n → cycle. Bipartite check: 2-color with BFS/DFS.

- [ ] **207** · [Course Schedule](https://leetcode.com/problems/course-schedule/) · 🟡 Medium
- [ ] **210** · [Course Schedule II](https://leetcode.com/problems/course-schedule-ii/) · 🟡 Medium
- [ ] ⭐ **785** · [Is Graph Bipartite?](https://leetcode.com/problems/is-graph-bipartite/) · 🟡 Medium

### Day 55 — Union Find (Disjoint Set Union)
> - **Pattern:** Union Find
> - **Spot it when:** Dynamic connectivity, merging groups, cycle detection in an undirected graph.
> - **Key idea:** parent[] + find with path compression + union by rank/size. Redundant Connection: the first edge whose endpoints already share a root. Accounts Merge: union emails, group by root.

- [ ] ⭐ **990** · [Satisfiability of Equality Equations](https://leetcode.com/problems/satisfiability-of-equality-equations/) · 🟡 Medium
- [ ] **684** · [Redundant Connection](https://leetcode.com/problems/redundant-connection/) · 🟡 Medium
- [ ] **721** · [Accounts Merge](https://leetcode.com/problems/accounts-merge/) · 🟡 Medium

### Day 56 — 🔁 Revision & Weekly Test
> **Rule:** No new problems today. Revision is where patterns become permanent.

- [ ] **Re-solve from scratch** (no notes, max 25 min each):
  - [ ] **200** · [Number of Islands](https://leetcode.com/problems/number-of-islands/) · 🟡 Medium
  - [ ] **994** · [Rotting Oranges](https://leetcode.com/problems/rotting-oranges/) · 🟡 Medium
  - [ ] **207** · [Course Schedule](https://leetcode.com/problems/course-schedule/) · 🟡 Medium
  - [ ] **684** · [Redundant Connection](https://leetcode.com/problems/redundant-connection/) · 🟡 Medium
- [ ] Redo every problem you added to the 🔴 **Redo Queue** this week
- [ ] **Blank-page test:** for each pattern of this week write the *trigger phrase*, the *template* and the *complexity* from memory
- [ ] **Weekly exit test:** I can choose between DFS, BFS, Topological Sort and Union Find from a graph statement.
- [ ] ✅ **Week 8 complete**

## 📅 Week 9 — Weighted Graphs, Greedy, Bits & Design (Days 57–63)

### Day 57 — Dijkstra — Weighted Shortest Path
> - **Pattern:** Dijkstra
> - **Spot it when:** Shortest path with non-negative weights; minimize the max/min along a path.
> - **Key idea:** Min-heap of (dist, node); pop the smallest, relax neighbors, skip stale entries. Path With Minimum Effort: cost = max edge so far. Cheapest Flights K stops: state = (node, stops) or Bellman-Ford with K+1 rounds.

- [ ] **743** · [Network Delay Time](https://leetcode.com/problems/network-delay-time/) · 🟡 Medium
- [ ] **1631** · [Path With Minimum Effort](https://leetcode.com/problems/path-with-minimum-effort/) · 🟡 Medium
- [ ] ⭐ **787** · [Cheapest Flights Within K Stops](https://leetcode.com/problems/cheapest-flights-within-k-stops/) · 🟡 Medium

### Day 58 — Minimum Spanning Tree & Graph Modeling
> - **Pattern:** MST (Kruskal/Prim) / Weighted Graph DFS
> - **Spot it when:** Connect all nodes at minimum total cost; ratios/relations modeled as edges.
> - **Key idea:** 1584: Kruskal = sort all edges, add if DSU says different components (or Prim with a heap). 399: a/b = 2 → edge weights 2 and 1/2; answer = product along the DFS path.

- [ ] **1584** · [Min Cost to Connect All Points](https://leetcode.com/problems/min-cost-to-connect-all-points/) · 🟡 Medium
- [ ] **399** · [Evaluate Division](https://leetcode.com/problems/evaluate-division/) · 🟡 Medium

### Day 59 — Greedy — Local Best Choice
> - **Pattern:** Greedy
> - **Spot it when:** “Minimum number of …” / “can you reach …” where a local optimum leads to the global optimum.
> - **Key idea:** Jump Game: track the farthest reach. Jump Game II: BFS by levels using current end/farthest. Always ask: why can't a local choice hurt later? (exchange argument).

- [ ] **455** · [Assign Cookies](https://leetcode.com/problems/assign-cookies/) · 🟢 Easy
- [ ] **55** · [Jump Game](https://leetcode.com/problems/jump-game/) · 🟡 Medium
- [ ] **45** · [Jump Game II](https://leetcode.com/problems/jump-game-ii/) · 🟡 Medium
- [ ] ⭐ **134** · [Gas Station](https://leetcode.com/problems/gas-station/) · 🟡 Medium

### Day 60 — Greedy — Structure & Ordering
> - **Pattern:** Greedy (+ Stack / Sorting)
> - **Spot it when:** Partition by last occurrence, remove digits to minimize, group consecutive values.
> - **Key idea:** 763: record the last index of every char, extend the current partition end. 402: monotonic stack + greedy removals. 846: sort/TreeMap and always start from the smallest card.

- [ ] **763** · [Partition Labels](https://leetcode.com/problems/partition-labels/) · 🟡 Medium
- [ ] **402** · [Remove K Digits](https://leetcode.com/problems/remove-k-digits/) · 🟡 Medium
- [ ] ⭐ **846** · [Hand of Straights](https://leetcode.com/problems/hand-of-straights/) · 🟡 Medium

### Day 61 — Bit Manipulation
> - **Pattern:** Bit Manipulation
> - **Spot it when:** “Appears once while others twice”, counting set bits, no +/− operators.
> - **Key idea:** a ^ a = 0 and a ^ 0 = a → XOR cancels pairs. n & (n−1) removes the lowest set bit. dp[i] = dp[i>>1] + (i&1). Sum: XOR = sum without carry, (a&b)<<1 = carry.

- [ ] **136** · [Single Number](https://leetcode.com/problems/single-number/) · 🟢 Easy
- [ ] **191** · [Number of 1 Bits](https://leetcode.com/problems/number-of-1-bits/) · 🟢 Easy
- [ ] **338** · [Counting Bits](https://leetcode.com/problems/counting-bits/) · 🟢 Easy
- [ ] ⭐ **371** · [Sum of Two Integers](https://leetcode.com/problems/sum-of-two-integers/) · 🟡 Medium

### Day 62 — Design Data Structures
> - **Pattern:** Design (HashMap + X)
> - **Spot it when:** “Design a class with O(1) get/put/random”.
> - **Key idea:** Combine structures: LRU = HashMap + doubly linked list (move to front, evict tail). GetRandom O(1) = ArrayList + HashMap(value→index), swap with last on delete. Time-based store = HashMap<key, list of (time, value)> + binary search.

- [ ] **146** · [LRU Cache](https://leetcode.com/problems/lru-cache/) · 🟡 Medium
- [ ] **380** · [Insert Delete GetRandom O(1)](https://leetcode.com/problems/insert-delete-getrandom-o1/) · 🟡 Medium
- [ ] ⭐ **981** · [Time Based Key-Value Store](https://leetcode.com/problems/time-based-key-value-store/) · 🟡 Medium

### Day 63 — 🔁 Revision & Weekly Test
> **Rule:** No new problems today. Revision is where patterns become permanent.

- [ ] **Re-solve from scratch** (no notes, max 25 min each):
  - [ ] **743** · [Network Delay Time](https://leetcode.com/problems/network-delay-time/) · 🟡 Medium
  - [ ] **55** · [Jump Game](https://leetcode.com/problems/jump-game/) · 🟡 Medium
  - [ ] **402** · [Remove K Digits](https://leetcode.com/problems/remove-k-digits/) · 🟡 Medium
  - [ ] **146** · [LRU Cache](https://leetcode.com/problems/lru-cache/) · 🟡 Medium
- [ ] Redo every problem you added to the 🔴 **Redo Queue** this week
- [ ] **Blank-page test:** for each pattern of this week write the *trigger phrase*, the *template* and the *complexity* from memory
- [ ] **Weekly exit test:** I can write Dijkstra and Union Find from memory and explain why the greedy choice works for Jump Game.
- [ ] ✅ **Week 9 complete**

# Phase 4 — Dynamic Programming (Days 64–77)

**Focus:** Memoization → 1D DP → Knapsack → Strings → Grid → LIS → LCS → Edit Distance → State Machine.  
**Exit: you can name the DP type first and then write state + transition.**

## 📅 Week 10 — DP Foundations (Days 64–70)

### Day 64 — DP Intro — Recursion → Memoization → Tabulation
> - **Pattern:** DP (1D Basics)
> - **Spot it when:** The same subproblem is solved again and again; the optimal answer is built from smaller optimal answers.
> - **Key idea:** 5-step recipe: state → transition → base cases → order → answer. Write the recursive brute force, add memo, convert to bottom-up, then optimize space.

- [ ] **70** · [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/) · 🟢 Easy
- [ ] **746** · [Min Cost Climbing Stairs](https://leetcode.com/problems/min-cost-climbing-stairs/) · 🟢 Easy
- [ ] ⭐ **1137** · [N-th Tribonacci Number](https://leetcode.com/problems/n-th-tribonacci-number/) · 🟢 Easy

### Day 65 — 1D DP — Take / Skip
> - **Pattern:** DP (Take / Skip)
> - **Spot it when:** At each item you choose take or skip with a restriction (no adjacent houses, decode 1 or 2 digits).
> - **Key idea:** House Robber: dp[i] = max(dp[i−1], dp[i−2] + nums[i]). House Robber II (circular): run twice (exclude first / exclude last). Decode Ways: add dp[i−1] if the 1-digit is valid, add dp[i−2] if the 2-digit is valid.

- [ ] **198** · [House Robber](https://leetcode.com/problems/house-robber/) · 🟡 Medium
- [ ] ⭐ **213** · [House Robber II](https://leetcode.com/problems/house-robber-ii/) · 🟡 Medium
- [ ] **91** · [Decode Ways](https://leetcode.com/problems/decode-ways/) · 🟡 Medium

### Day 66 — Unbounded Knapsack (Coin Change)
> - **Pattern:** DP (Unbounded Knapsack)
> - **Spot it when:** Unlimited use of items to reach a target: minimum count or number of ways.
> - **Key idea:** Coin Change: dp[a] = min(dp[a−c] + 1). Coin Change II (count combinations): coins in the outer loop, amount in the inner loop (order does not matter). Perfect Squares = coin change with square numbers.

- [ ] **322** · [Coin Change](https://leetcode.com/problems/coin-change/) · 🟡 Medium
- [ ] **518** · [Coin Change II](https://leetcode.com/problems/coin-change-ii/) · 🟡 Medium
- [ ] ⭐ **279** · [Perfect Squares](https://leetcode.com/problems/perfect-squares/) · 🟡 Medium

### Day 67 — DP on Strings (1D) & Expand Around Center
> - **Pattern:** DP (Strings / Palindromes)
> - **Spot it when:** Segment a string into valid words; palindromic substrings.
> - **Key idea:** Word Break: dp[i] is true if some j < i has dp[j] true and s[j..i) is a word. Palindromes: expand around every center (odd and even) → O(n²) time, O(1) space.

- [ ] **139** · [Word Break](https://leetcode.com/problems/word-break/) · 🟡 Medium
- [ ] **5** · [Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/) · 🟡 Medium
- [ ] ⭐ **647** · [Palindromic Substrings](https://leetcode.com/problems/palindromic-substrings/) · 🟡 Medium

### Day 68 — Grid DP
> - **Pattern:** DP (Grid)
> - **Spot it when:** Paths / minimum cost from top-left to bottom-right moving only right/down.
> - **Key idea:** dp[i][j] = f(dp[i−1][j], dp[i][j−1]). Maximal Square: dp = 1 + min(top, left, top-left). Then compress to a single row.

- [ ] **62** · [Unique Paths](https://leetcode.com/problems/unique-paths/) · 🟡 Medium
- [ ] ⭐ **63** · [Unique Paths II](https://leetcode.com/problems/unique-paths-ii/) · 🟡 Medium
- [ ] **64** · [Minimum Path Sum](https://leetcode.com/problems/minimum-path-sum/) · 🟡 Medium
- [ ] **221** · [Maximal Square](https://leetcode.com/problems/maximal-square/) · 🟡 Medium

### Day 69 — 0/1 Knapsack (Subset Sum)
> - **Pattern:** DP (0/1 Knapsack)
> - **Spot it when:** Each item is used at most once; partition into equal sums; count ways to hit a target.
> - **Key idea:** dp[s] |= dp[s − x] iterating s backwards so each item is used once. Target Sum: count subsets with sum (total + target)/2. Combination Sum IV: order matters → target in the outer loop.

- [ ] **416** · [Partition Equal Subset Sum](https://leetcode.com/problems/partition-equal-subset-sum/) · 🟡 Medium
- [ ] **494** · [Target Sum](https://leetcode.com/problems/target-sum/) · 🟡 Medium
- [ ] ⭐ **377** · [Combination Sum IV](https://leetcode.com/problems/combination-sum-iv/) · 🟡 Medium

### Day 70 — 🔁 Revision & Weekly Test
> **Rule:** No new problems today. Revision is where patterns become permanent.

- [ ] **Re-solve from scratch** (no notes, max 25 min each):
  - [ ] **198** · [House Robber](https://leetcode.com/problems/house-robber/) · 🟡 Medium
  - [ ] **322** · [Coin Change](https://leetcode.com/problems/coin-change/) · 🟡 Medium
  - [ ] **139** · [Word Break](https://leetcode.com/problems/word-break/) · 🟡 Medium
  - [ ] **416** · [Partition Equal Subset Sum](https://leetcode.com/problems/partition-equal-subset-sum/) · 🟡 Medium
- [ ] Redo every problem you added to the 🔴 **Redo Queue** this week
- [ ] **Blank-page test:** for each pattern of this week write the *trigger phrase*, the *template* and the *complexity* from memory
- [ ] **Weekly exit test:** I can convert recursion → memo → tabulation for a 1D DP and tell knapsack from coin-change style problems.
- [ ] ✅ **Week 10 complete**

## 📅 Week 11 — DP Advanced (Days 71–77)

### Day 71 — LIS — Longest Increasing Subsequence
> - **Pattern:** DP (LIS) + Binary Search
> - **Spot it when:** Longest subsequence with an ordering condition.
> - **Key idea:** O(n²): dp[i] = 1 + max dp[j] for j < i and a[j] < a[i]. O(n log n): keep a “tails” array and binary-search the position. Increasing Triplet = LIS of length 3 with two variables.

- [ ] **334** · [Increasing Triplet Subsequence](https://leetcode.com/problems/increasing-triplet-subsequence/) · 🟡 Medium
- [ ] **300** · [Longest Increasing Subsequence](https://leetcode.com/problems/longest-increasing-subsequence/) · 🟡 Medium
- [ ] ⭐ **646** · [Maximum Length of Pair Chain](https://leetcode.com/problems/maximum-length-of-pair-chain/) · 🟡 Medium

### Day 72 — LCS — Two-String DP
> - **Pattern:** DP (LCS)
> - **Spot it when:** Compare two strings/sequences: common subsequence, deletions to make them equal.
> - **Key idea:** dp[i][j]: if s[i−1] == t[j−1] → dp[i−1][j−1] + 1 else max(dp[i−1][j], dp[i][j−1]). Delete Operation = n + m − 2·LCS. Uncrossed Lines is LCS in disguise.

- [ ] **1143** · [Longest Common Subsequence](https://leetcode.com/problems/longest-common-subsequence/) · 🟡 Medium
- [ ] **583** · [Delete Operation for Two Strings](https://leetcode.com/problems/delete-operation-for-two-strings/) · 🟡 Medium
- [ ] ⭐ **1035** · [Uncrossed Lines](https://leetcode.com/problems/uncrossed-lines/) · 🟡 Medium

### Day 73 — Edit Distance & String-Matching DP
> - **Pattern:** DP (2D Strings)
> - **Spot it when:** Transform one string into another; interleave two strings; count subsequences.
> - **Key idea:** 72: dp[i][j] = min(insert, delete, replace). 97: dp[i][j] = can s3[:i+j] be formed from s1[:i] and s2[:j]. 115: dp[i][j] = ways to form t[:j] from s[:i].

- [ ] **72** · [Edit Distance](https://leetcode.com/problems/edit-distance/) · 🟡 Medium
- [ ] **97** · [Interleaving String](https://leetcode.com/problems/interleaving-string/) · 🟡 Medium
- [ ] ⭐ **115** · [Distinct Subsequences](https://leetcode.com/problems/distinct-subsequences/) · 🔴 Hard

### Day 74 — State-Machine DP (Stocks)
> - **Pattern:** DP (State Machine)
> - **Spot it when:** Actions depend on a state (holding / not holding / cooldown).
> - **Key idea:** Define states and transitions: hold, sold, rest. 122: unlimited transactions (also greedy: sum of positive differences). 309: cooldown adds a state. 714: subtract the fee on sell.

- [ ] **122** · [Best Time to Buy and Sell Stock II](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/) · 🟡 Medium
- [ ] **309** · [Best Time to Buy and Sell Stock with Cooldown](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/) · 🟡 Medium
- [ ] ⭐ **714** · [Best Time to Buy and Sell Stock with Transaction Fee](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/) · 🟡 Medium

### Day 75 — DP on Triangle, Falling Path & Tree
> - **Pattern:** DP (Grid Variants / Tree DP)
> - **Spot it when:** Each cell depends on a few neighbors; tree DP returning two values.
> - **Key idea:** 120/931: dp from the bottom or from the previous row. 337: each node returns a pair (robbed, notRobbed).

- [ ] **120** · [Triangle](https://leetcode.com/problems/triangle/) · 🟡 Medium
- [ ] ⭐ **931** · [Minimum Falling Path Sum](https://leetcode.com/problems/minimum-falling-path-sum/) · 🟡 Medium
- [ ] **337** · [House Robber III](https://leetcode.com/problems/house-robber-iii/) · 🟡 Medium

### Day 76 — DP Recognition Day
> - **Pattern:** DP (Identify the Type First)
> - **Spot it when:** Decide the DP type before coding: 1D, grid, knapsack, LCS, LIS, state machine.
> - **Key idea:** 96: Catalan → dp[n] = Σ dp[i−1]·dp[n−i]. 343: dp[i] = max over splits. Then re-solve 2 older DP problems (e.g., 322 and 300) with NO notes and write your own DP recipe in your notes.

- [ ] **96** · [Unique Binary Search Trees](https://leetcode.com/problems/unique-binary-search-trees/) · 🟡 Medium
- [ ] **343** · [Integer Break](https://leetcode.com/problems/integer-break/) · 🟡 Medium

### Day 77 — 🔁 Revision & Weekly Test
> **Rule:** No new problems today. Revision is where patterns become permanent.

- [ ] **Re-solve from scratch** (no notes, max 25 min each):
  - [ ] **300** · [Longest Increasing Subsequence](https://leetcode.com/problems/longest-increasing-subsequence/) · 🟡 Medium
  - [ ] **1143** · [Longest Common Subsequence](https://leetcode.com/problems/longest-common-subsequence/) · 🟡 Medium
  - [ ] **72** · [Edit Distance](https://leetcode.com/problems/edit-distance/) · 🟡 Medium
  - [ ] **309** · [Best Time to Buy and Sell Stock with Cooldown](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/) · 🟡 Medium
- [ ] Redo every problem you added to the 🔴 **Redo Queue** this week
- [ ] **Blank-page test:** for each pattern of this week write the *trigger phrase*, the *template* and the *complexity* from memory
- [ ] **Weekly exit test:** I can name the DP type (LIS / LCS / knapsack / grid / state machine) before writing code.
- [ ] ✅ **Week 11 complete**

# Phase 5 — Integration, Hard Classics & Mocks (Days 78–90)

**Focus:** Hard classics → pattern-blind sets → timed mocks → final test.  
**Exit: you can identify patterns in unseen Medium problems within ~5 minutes.**

## 📅 Week 12 — Hard Classics & Pattern-Blind Practice (Days 78–84)

### Day 78 — Hard Classics — Two Pointers & Monotonic Deque
> - **Pattern:** Two Pointers / Monotonic Deque
> - **Spot it when:** Water trapped between bars; maximum in every window.
> - **Key idea:** 42: two pointers with leftMax/rightMax (also solvable with a monotonic stack). 239: deque of indices in decreasing value order; drop out-of-window indices from the front.

- [ ] **42** · [Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/) · 🔴 Hard
- [ ] **239** · [Sliding Window Maximum](https://leetcode.com/problems/sliding-window-maximum/) · 🔴 Hard

### Day 79 — Array Tricks — Voting, Cycle & Cyclic Placement
> - **Pattern:** Boyer-Moore / Floyd on Array / Cyclic Sort
> - **Spot it when:** O(1)-space tricks on arrays whose values lie in [1..n].
> - **Key idea:** 169: Boyer-Moore voting. 287: treat the array as a linked list (value → next index) and use Floyd. 41: place each value x at index x−1 (cyclic sort), then find the first mismatch.

- [ ] **169** · [Majority Element](https://leetcode.com/problems/majority-element/) · 🟢 Easy
- [ ] **287** · [Find the Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/) · 🟡 Medium
- [ ] ⭐ **41** · [First Missing Positive](https://leetcode.com/problems/first-missing-positive/) · 🔴 Hard

### Day 80 — Binary Search Capstones
> - **Pattern:** Binary Search (Value Range / 2D / Partition)
> - **Spot it when:** Search in 2D structures or binary search over a value range.
> - **Key idea:** 378: binary search on the value, count elements ≤ mid in the sorted matrix (or use a heap). 240: staircase search from the top-right. 4: binary search the partition of the smaller array.

- [ ] **378** · [Kth Smallest Element in a Sorted Matrix](https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/) · 🟡 Medium
- [ ] **240** · [Search a 2D Matrix II](https://leetcode.com/problems/search-a-2d-matrix-ii/) · 🟡 Medium
- [ ] ⭐ **4** · [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/) · 🔴 Hard

### Day 81 — Pattern-Blind Mixed Set A
> - **Pattern:** Mixed — guess before you open the spoiler
> - **Spot it when:** Unseen problems, no pattern label on purpose. Spend 5 minutes writing: pattern → data structure → complexity BEFORE coding.
> - **Key idea:** Use the trigger phrases from the Pattern Cheat Sheet at the bottom of this file.

- [ ] **189** · [Rotate Array](https://leetcode.com/problems/rotate-array/) · 🟡 Medium
- [ ] **227** · [Basic Calculator II](https://leetcode.com/problems/basic-calculator-ii/) · 🟡 Medium
- [ ] ⭐ **1249** · [Minimum Remove to Make Valid Parentheses](https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/) · 🟡 Medium

<details><summary>🔎 Pattern spoilers — open only AFTER you have guessed</summary>

- **189** Rotate Array → Array reversal trick (reverse all, reverse first k, reverse the rest) → O(1) space
- **227** Basic Calculator II → Stack with last operator (or two-pass with running value)
- **1249** Minimum Remove to Make Valid Parentheses → Stack of indices (or two-pass counting of unmatched brackets)

</details>

### Day 82 — Pattern-Blind Mixed Set B
> - **Pattern:** Mixed — guess before you open the spoiler
> - **Spot it when:** Unseen problems, no pattern label on purpose. Write pattern → data structure → complexity BEFORE coding.
> - **Key idea:** Ask: what changes? what must I remember? is there a monotonic property? is it a graph/tree/DP state?

- [ ] **148** · [Sort List](https://leetcode.com/problems/sort-list/) · 🟡 Medium
- [ ] **129** · [Sum Root to Leaf Numbers](https://leetcode.com/problems/sum-root-to-leaf-numbers/) · 🟡 Medium
- [ ] ⭐ **1094** · [Car Pooling](https://leetcode.com/problems/car-pooling/) · 🟡 Medium

<details><summary>🔎 Pattern spoilers — open only AFTER you have guessed</summary>

- **148** Sort List → Merge sort on a linked list (fast/slow to split + merge two sorted lists)
- **129** Sum Root to Leaf Numbers → Tree DFS, pass the number built so far down the recursion
- **1094** Car Pooling → Difference array / sweep line (or min-heap of drop-off times)

</details>

### Day 83 — Pattern-Blind Mixed Set C
> - **Pattern:** Mixed — guess before you open the spoiler
> - **Spot it when:** Unseen problems, no pattern label on purpose. Write pattern → data structure → complexity BEFORE coding.
> - **Key idea:** If you are stuck for 10 minutes, go through the cheat sheet trigger by trigger.

- [ ] **1319** · [Number of Operations to Make Network Connected](https://leetcode.com/problems/number-of-operations-to-make-network-connected/) · 🟡 Medium
- [ ] **93** · [Restore IP Addresses](https://leetcode.com/problems/restore-ip-addresses/) · 🟡 Medium
- [ ] ⭐ **516** · [Longest Palindromic Subsequence](https://leetcode.com/problems/longest-palindromic-subsequence/) · 🟡 Medium

<details><summary>🔎 Pattern spoilers — open only AFTER you have guessed</summary>

- **1319** Number of Operations to Make Network Connected → Union Find: count components; need at least (components − 1) spare edges
- **93** Restore IP Addresses → Backtracking with 4 segments and per-segment validity checks
- **516** Longest Palindromic Subsequence → LCS of s and reverse(s)

</details>

### Day 84 — 🔁 Revision & Weekly Test
> **Rule:** No new problems today. Revision is where patterns become permanent.

- [ ] **Re-solve from scratch** (no notes, max 25 min each):
  - [ ] **42** · [Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/) · 🔴 Hard
  - [ ] **239** · [Sliding Window Maximum](https://leetcode.com/problems/sliding-window-maximum/) · 🔴 Hard
  - [ ] **287** · [Find the Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/) · 🟡 Medium
  - [ ] **227** · [Basic Calculator II](https://leetcode.com/problems/basic-calculator-ii/) · 🟡 Medium
- [ ] Redo every problem you added to the 🔴 **Redo Queue** this week
- [ ] **Blank-page test:** for each pattern of this week write the *trigger phrase*, the *template* and the *complexity* from memory
- [ ] **Weekly exit test:** I can identify the pattern of an unseen Medium problem within 5 minutes.
- [ ] ✅ **Week 12 complete**

# 🏁 Final Week — Mock Interviews & Final Test (Days 85–90)

**Focus:** Simulate real interviews and measure your pattern recognition.

### Day 85 — Mock 1 — Arrays / Strings (Timed)
> - **Format:** Two unseen problems, 30 minutes each, no hints, talk out loud.
> - **Process:** Process: clarify → brute force → optimize → pattern → code → dry-run → complexity.

- [ ] **18** · [4Sum](https://leetcode.com/problems/4sum/) · 🟡 Medium
- [ ] **918** · [Maximum Sum Circular Subarray](https://leetcode.com/problems/maximum-sum-circular-subarray/) · 🟡 Medium
- [ ] Wrote notes + added anything I failed to the 🔴 Redo Queue

<details><summary>🔎 Pattern spoilers — open only AFTER you have attempted both</summary>

- **18** 4Sum → Sort + Two Pointers (k-sum generalization, skip duplicates)
- **918** Maximum Sum Circular Subarray → Kadane twice: max subarray vs (total − min subarray)

</details>

### Day 86 — Mock 2 — Linked List / Trees (Timed)
> - **Format:** Two unseen problems, 30 minutes each, no hints, talk out loud.
> - **Process:** Same process as Mock 1. Write the complexity before your final answer.

- [ ] **138** · [Copy List with Random Pointer](https://leetcode.com/problems/copy-list-with-random-pointer/) · 🟡 Medium
- [ ] **538** · [Convert BST to Greater Tree](https://leetcode.com/problems/convert-bst-to-greater-tree/) · 🟡 Medium
- [ ] Wrote notes + added anything I failed to the 🔴 Redo Queue

<details><summary>🔎 Pattern spoilers — open only AFTER you have attempted both</summary>

- **138** Copy List with Random Pointer → HashMap old→new node (or interleave copies in the list for O(1) space)
- **538** Convert BST to Greater Tree → Reverse inorder traversal with a running sum

</details>

### Day 87 — Mock 3 — Graph / Heap (Timed)
> - **Format:** Two unseen problems, 30 minutes each, no hints, talk out loud.
> - **Process:** Same process as Mock 1.

- [ ] **1462** · [Course Schedule IV](https://leetcode.com/problems/course-schedule-iv/) · 🟡 Medium
- [ ] **1642** · [Furthest Building You Can Reach](https://leetcode.com/problems/furthest-building-you-can-reach/) · 🟡 Medium
- [ ] Wrote notes + added anything I failed to the 🔴 Redo Queue

<details><summary>🔎 Pattern spoilers — open only AFTER you have attempted both</summary>

- **1462** Course Schedule IV → Topological sort + reachability sets (or Floyd–Warshall)
- **1642** Furthest Building You Can Reach → Greedy + min-heap of the smallest ladder jumps

</details>

### Day 88 — Mock 4 — Backtracking / DP (Timed)
> - **Format:** Two unseen problems, 30–35 minutes each, no hints. The second one is Hard — partial credit is fine.
> - **Process:** Same process as Mock 1. If you cannot finish the Hard, still write the brute force + the DP state.

- [ ] **698** · [Partition to K Equal Sum Subsets](https://leetcode.com/problems/partition-to-k-equal-sum-subsets/) · 🟡 Medium
- [ ] **1235** · [Maximum Profit in Job Scheduling](https://leetcode.com/problems/maximum-profit-in-job-scheduling/) · 🔴 Hard
- [ ] Wrote notes + added anything I failed to the 🔴 Redo Queue

<details><summary>🔎 Pattern spoilers — open only AFTER you have attempted both</summary>

- **698** Partition to K Equal Sum Subsets → Backtracking with pruning (or bitmask DP)
- **1235** Maximum Profit in Job Scheduling → Sort by end time + DP + binary search on previous compatible job

</details>

### Day 89 — 🎯 Pattern-Blind Test (no coding)
> Pick **15 problems** you already solved at random (use a random number generator on the problem numbers above).
> For each one read **only the statement** and, within **5 minutes**, write: *pattern → data structure → time/space complexity → edge cases*. Do **not** code.

- [ ] Round 1 — 5 problems (score: ___ / 5 patterns correct)
- [ ] Round 2 — 5 problems (score: ___ / 5)
- [ ] Round 3 — 5 problems (score: ___ / 5)
- [ ] Any pattern with a score below 80% goes into tomorrow's plan

### Day 90 — 🏆 Final Review & Next Steps
- [ ] Clear the entire 🔴 **Redo Queue** (re-solve every remaining item)
- [ ] Write your **personal one-page cheat sheet** (trigger → pattern → template) in your own words
- [ ] Rank your 5 weakest patterns and list 3 extra problems for each
- [ ] Decide your next 30 days: timed practice on company-tagged problems, weak-pattern drills, and 2 mock interviews per week
- [ ] ✅ **90-Day Roadmap complete**

---

## 🧠 Pattern Cheat Sheet (Trigger → Pattern → Tool)

| If the problem says / has… | Think… | Typical tool | Complexity |
|---|---|---|---|
| “Have I seen this before?”, duplicates, pair with target sum (unsorted) | Hashing | HashSet / HashMap | O(n) |
| Anagram, character counts, group by signature | Frequency Map | int[26] / HashMap | O(n) |
| Many range-sum queries; “except self” | Prefix / Suffix Sum | prefix[] array | O(n) |
| Count subarrays with sum = k (negatives allowed) | Prefix Sum + HashMap | HashMap<sum, count> | O(n) |
| Sorted array, pair/triplet, palindrome, in-place edit | Two Pointers | left/right or read/write | O(n) / O(n²) for k-sum |
| Max/min subarray, best profit in one pass | Kadane / Running State | 2 variables | O(n) |
| Contiguous subarray/substring, fixed length k | Sliding Window (Fixed) | counts + window | O(n) |
| Longest / shortest contiguous range with a condition | Sliding Window (Variable) | left/right + HashMap | O(n) |
| Sorted data or “halve the search space” | Binary Search | lo / hi / mid | O(log n) |
| “Minimum X such that it is possible” | Binary Search on Answer | feasible(x) | O(n log range) |
| Cycle, middle of list, kth from end | Fast & Slow / Gap Pointers | 2 pointers | O(n) |
| Brackets, nesting, undo | Stack | ArrayDeque | O(n) |
| Next greater / smaller element | Monotonic Stack | stack of indices | O(n) |
| Max of every window | Monotonic Deque | deque of indices | O(n) |
| Top K, kth largest, stream | Heap | PriorityQueue | O(n log k) |
| Median of a stream | Two Heaps | max-heap + min-heap | O(log n) per add |
| Overlapping ranges | Intervals | sort by start (or end) | O(n log n) |
| All subsets / permutations / combinations | Backtracking | recursion + path list | O(2ⁿ) / O(n!) |
| Prefix search, dictionary of words | Trie | children[26] + isEnd | O(L) per word |
| Info needed from children (height, diameter) | Tree DFS (Bottom-Up) | recursion + global answer | O(n) |
| Level-by-level, shortest depth | BFS | Queue | O(n) |
| Shortest path, unweighted / multi-source | BFS | Queue (all sources first) | O(V+E) |
| Islands, connected components | DFS / BFS / Union Find | visited set / DSU | O(V+E) |
| Prerequisites, ordering, cycle in directed graph | Topological Sort | indegree + queue | O(V+E) |
| Shortest path with weights | Dijkstra | min-heap | O(E log V) |
| Connect all nodes at min cost | MST (Kruskal/Prim) | sort edges + DSU | O(E log E) |
| Local best choice, “minimum number of …” | Greedy | sort / heap / running max | usually O(n log n) |
| Same subproblem repeats; count/min/max ways | Dynamic Programming | dp array + transition | depends on state |
| Unlimited items to reach a target | Unbounded Knapsack | 1D dp | O(n·target) |
| Each item once; subset sum | 0/1 Knapsack | 1D dp (backwards) | O(n·target) |
| Two strings compared | LCS / Edit Distance | 2D dp | O(n·m) |
| Longest increasing subsequence | LIS | dp or tails + binary search | O(n log n) |
| Actions depend on state (hold/rest) | State-Machine DP | few state variables | O(n) |
| Appears once, pairs cancel, powers of 2 | Bit Manipulation | XOR / shifts | O(n) / O(1) |
| Design O(1) get/put/random | Design | HashMap + list/linked list | O(1) |

---

## 📝 Notes Template (copy for every problem)

```md
### <LeetCode #> — <Title>
- Pattern:
- Why this pattern (trigger words):
- Brute force → optimized idea:
- Data structure used:
- Time / Space:
- Edge cases:
- Mistake I made:
- Confidence: 🟢 solved alone · 🟡 solved with hint · 🔴 needed solution
```

### 📂 Suggested Repo Structure

```
dsa-90-days/
├── README.md                 # this roadmap
├── notes/
│   ├── day-01-hashing.md
│   └── ...
├── solutions/
│   ├── 0001-two-sum.java     # or .py / .cpp
│   └── ...
└── cheatsheet.md             # your personal one-pager (Day 90)
```

---

## 🔴 Redo Queue

Add any problem where you needed the approach or the code. Re-solve them on the next revision day, then tick them off.

- [ ] #____ — ______________________ (reason: ____________)
- [ ] #____ — ______________________ (reason: ____________)
- [ ] #____ — ______________________ (reason: ____________)
- [ ] #____ — ______________________ (reason: ____________)
- [ ] #____ — ______________________ (reason: ____________)
- [ ] #____ — ______________________ (reason: ____________)
- [ ] #____ — ______________________ (reason: ____________)
- [ ] #____ — ______________________ (reason: ____________)
- [ ] #____ — ______________________ (reason: ____________)
- [ ] #____ — ______________________ (reason: ____________)
- [ ] #____ — ______________________ (reason: ____________)
- [ ] #____ — ______________________ (reason: ____________)
- [ ] #____ — ______________________ (reason: ____________)
- [ ] #____ — ______________________ (reason: ____________)
- [ ] #____ — ______________________ (reason: ____________)

---

## 📊 Progress Log

| Day | Date | Time spent | Solved alone / total | Weak spot noticed |
|---|---|---|---|---|
|  |  |  |  |  |
|  |  |  |  |  |
|  |  |  |  |  |
|  |  |  |  |  |
|  |  |  |  |  |

---

> **Remember:** the goal is not to finish 167 problems. The goal is: *new problem → identify the pattern → choose the data structure → write the solution → state the complexity.*
