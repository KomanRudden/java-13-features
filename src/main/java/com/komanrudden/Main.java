package com.komanrudden;

import com.komanrudden.features.SwitchExpressions;
import com.komanrudden.features.TextBlocks;

public class Main {
    public static void main(String[] args) {
        TextBlocks tb = new TextBlocks();
        tb.demoTextBlocks();
        tb.demoNewStringMethods();
        SwitchExpressions se = new SwitchExpressions();
        se.demoSwitchExpression("THREE");
    }
}
