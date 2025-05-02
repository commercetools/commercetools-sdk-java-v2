
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalRulePredicateSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalRulePredicateSetMessagePayloadBuilder builder) {
        ApprovalRulePredicateSetMessagePayload approvalRulePredicateSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(approvalRulePredicateSetMessagePayload)
                .isInstanceOf(ApprovalRulePredicateSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "predicate", ApprovalRulePredicateSetMessagePayload.builder().predicate("predicate") },
                new Object[] { "oldPredicate",
                        ApprovalRulePredicateSetMessagePayload.builder().oldPredicate("oldPredicate") } };
    }

    @Test
    public void predicate() {
        ApprovalRulePredicateSetMessagePayload value = ApprovalRulePredicateSetMessagePayload.of();
        value.setPredicate("predicate");
        Assertions.assertThat(value.getPredicate()).isEqualTo("predicate");
    }

    @Test
    public void oldPredicate() {
        ApprovalRulePredicateSetMessagePayload value = ApprovalRulePredicateSetMessagePayload.of();
        value.setOldPredicate("oldPredicate");
        Assertions.assertThat(value.getOldPredicate()).isEqualTo("oldPredicate");
    }
}
