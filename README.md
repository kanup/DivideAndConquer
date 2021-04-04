# DivideAndConquer
**Question:** 
You are lord Indra and you want to cause rain in a village. There n festivals when the villagers worship you, say festival i occurs on date ti. You want to cause rain on exactly k of these festivals. Each time it rains, the villagers become complacent and take the rain for granted. You don’t want this to happen ; so you want the minimum duration between two consecutive rains to be as long as possible (assume that you have to cause rain on the very first festival). Hence, you want to pick k out of the n festival days on which you wish it to rain, such that the minimum duration between any pair of rains is as long as possible. Give a polynomial time algorithm to achieve this.

**Runtime of Solution:**
The algorithm runs in O(nlogn) time. O(nlogn) time is taken by the binary search that searches for the minimum maximised distance for the given dates whereas O(n) is taken by the linear traversal pf the array that checks whether for a given minimum maximised distance given 'k' day/s is possible or not. 
