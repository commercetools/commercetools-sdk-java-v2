
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalRulePredicateSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalRulePredicateSetMessageBuilder builder) {
        ApprovalRulePredicateSetMessage approvalRulePredicateSetMessage = builder.buildUnchecked();
        Assertions.assertThat(approvalRulePredicateSetMessage).isInstanceOf(ApprovalRulePredicateSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "predicate", ApprovalRulePredicateSetMessage.builder().predicate("predicate") },
                new Object[] { "oldPredicate",
                        ApprovalRulePredicateSetMessage.builder().oldPredicate("oldPredicate") } };
    }

    @Test
    public void predicate() {
        ApprovalRulePredicateSetMessage value = ApprovalRulePredicateSetMessage.of();
        value.setPredicate("predicate");
        Assertions.assertThat(value.getPredicate()).isEqualTo("predicate");
    }

    @Test
    public void oldPredicate() {
        ApprovalRulePredicateSetMessage value = ApprovalRulePredicateSetMessage.of();
        value.setOldPredicate("oldPredicate");
        Assertions.assertThat(value.getOldPredicate()).isEqualTo("oldPredicate");
    }
}
