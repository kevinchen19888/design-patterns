package com.kevin.adapter;

/**
 * 适配器类
 *
 * @author kevin
 */
public class OperationAdapter implements ScoreOperation {
    private BinarySearch search;

    public OperationAdapter(BinarySearch search) {
        this.search = search;
    }

    @Override
    public int search(int[] arr, int key) {
        return search.binarySearch(arr, key);
    }
}
