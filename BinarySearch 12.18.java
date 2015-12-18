	int binarysearch(int low, int high, int[] matrix) {
		//0,1,2,3,4 mid = 0 + 5/2 = 2;
		//0,1,2,3 mid = 0 + 4/ 2 = 2;
		while (low < high) {
		int mid = low + (high - low) / 2;
		if (matrix[mid] == 1) {
			high = mid;
		} else {
			low = mid + 1;
		}
		}
		return low;
	}
Binary Search 有一些非常有意思的性质，其实遵守某个规则的话不会有你自己YY的那些corner case出现。
1.high是unreachable的
2.你会发现mid >= low 
如果high - low = 2 high - 2 low
    high = low
    但是high > low
    所以mid < high
    因此如果mid是结果，往左边找的时候极端情况low = high - 1，那么low + 1 = 当前mid，get
    如果mid不是，那么往右走，极端情况 low = high - 1，那么low + 1也就是数组长度了。
这样写的确是非常简单而且自然的。
