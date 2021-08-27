package com.kotlin.leran.function.lambda;

public class JavaAnonymous {
    public static void main(String[] args) {
        showOnBord("牙膏", 3, new DiscountWord() {
            public String getDiscountWord(String goodsName, int hour) {
                int year = 2021;
                return String.format("距离%d年，%s促销还剩%d小时", year, goodsName, hour);
            }
        });

        showOnBord("洗衣液", 2, (String goodsName, int hour) -> {
            int year = 2021;
            return String.format("距离%d年，%s促销还剩%d小时", year, goodsName, hour);
        });
    }

    private interface DiscountWord {
        String getDiscountWord(String goodsName, int hour);
    }

    private static void showOnBord(String goodsName, int hour, DiscountWord discountWord) {
        System.out.println(discountWord.getDiscountWord(goodsName, hour));
    }
}
