package com;


import org.junit.Test;

/**
 * Description: author: 林钦 date: 2018/05/14
 */
public class UserTest {
    @Test
    public void select() throws Exception {

        int i = 0;
        for (int j = 0; j < 5; j++) {
            i++;
            i = getI(i);
            System.out.println(i);
            System.out.println(i);
        }


    }

    private int getI(int i) {
        i += 2;
        return i;
    }

}
