package computer.science.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BalancedBracketsTest {

    private String balancedParenthesis;
    private static boolean output;
    BalancedBrackets objBalanced = new BalancedBrackets();

        public BalancedBracketsTest(String balancedParenthesis, boolean output) {
        this.balancedParenthesis = balancedParenthesis;
        this.output = output;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> conditionsToTest() {
        String completeParenthesis = "(1)";
        String openParenthesis = "(1";
        String closeParenthesis = "1)";
        String closeOpenParenthesis = "(1)(";
        String emptySentence = "";

        String completeBrackets = "[]";

        String mismatchedBrackets = "{<[)]}";

        Object[][] outputs = {
                {completeParenthesis, true},
                {emptySentence, true},
                {openParenthesis, false},
                {closeParenthesis, false},
                {closeOpenParenthesis, false},
                {completeBrackets, true},
                {mismatchedBrackets, false}
        };

        return Arrays.asList(outputs);
    }

    @Test
    public void testBalancedBrackets() {
        assertEquals(output, objBalanced.balancedBrackets(balancedParenthesis));
    }
}
