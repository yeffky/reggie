package com.itheima;

import org.junit.jupiter.api.Test;

public class UploadFileTest {
    @Test
    public void test() {
        String fileName = "hello.jpg";
        System.out.println(fileName.substring(fileName.lastIndexOf('.')));
    }

    @Test
    public void testBytes() {
        int[] bytes = new int[1024];
        setValue(bytes);
        System.out.println(bytes[0]);
    }

    public void setValue(int[] bytes) {
        bytes[0] = 1;
    }

    interface test <E>{
        void func(E[] items);
    }

    public static <E> void map(E[] items, test<E> test) {
        test.func(items);
    }

    @Test
    public void sortItem() {
        Integer[] array = {5,3,4,5,2,3,4};
        map(array, (items -> {
            for(int i = 0; i < items.length; i++)
                for (int j = 0; j < items.length - 1 - i; j++)
                    if (items[j] > items[j + 1]) {
                        Integer temp;
                        temp = items[j + 1];
                        items[j + 1] = items[j];
                        items[j] = temp;
                    }

            for (Integer item : items) System.out.println(item);
        }));
    }

    public <T> void swap(T o1, T o2) {
        T temp;
        temp = o1;
        o1 = o2;
        o2 = temp;
    }

}
