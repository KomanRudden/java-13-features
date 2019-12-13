package com.komanrudden.features;

public class SwitchExpressions {
    public void demoSwitchExpression(String demo) {
        //multi-label case statement, no need for break or yield keywords
        int result = switch(demo) {
            case "ONE" -> 1;
            case "TWO", "THREE", "FOUR" -> 234;
            default -> 5;
        };
        System.out.println("THREE was sent in and " + result + " was printed");
    }
}
