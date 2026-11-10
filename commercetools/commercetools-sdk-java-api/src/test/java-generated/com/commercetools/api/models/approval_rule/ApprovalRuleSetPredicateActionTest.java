
package com.commercetools.api.models.approval_rule;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalRuleSetPredicateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalRuleSetPredicateActionBuilder builder) {
        ApprovalRuleSetPredicateAction approvalRuleSetPredicateAction = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleSetPredicateAction).isInstanceOf(ApprovalRuleSetPredicateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "predicate", ApprovalRuleSetPredicateAction.builder().predicate("predicate") } };
    }

    @Test
    public void predicate() {
        ApprovalRuleSetPredicateAction value = ApprovalRuleSetPredicateAction.of();
        value.setPredicate("predicate");
        Assertions.assertThat(value.getPredicate()).isEqualTo("predicate");
    }
}
