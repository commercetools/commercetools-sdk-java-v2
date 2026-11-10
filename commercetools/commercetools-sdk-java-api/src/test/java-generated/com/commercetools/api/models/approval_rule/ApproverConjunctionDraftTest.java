
package com.commercetools.api.models.approval_rule;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApproverConjunctionDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApproverConjunctionDraftBuilder builder) {
        ApproverConjunctionDraft approverConjunctionDraft = builder.buildUnchecked();
        Assertions.assertThat(approverConjunctionDraft).isInstanceOf(ApproverConjunctionDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "and",
                ApproverConjunctionDraft.builder()
                        .and(Collections.singletonList(
                            new com.commercetools.api.models.approval_rule.ApproverDisjunctionDraftImpl())) } };
    }

    @Test
    public void and() {
        ApproverConjunctionDraft value = ApproverConjunctionDraft.of();
        value.setAnd(
            Collections.singletonList(new com.commercetools.api.models.approval_rule.ApproverDisjunctionDraftImpl()));
        Assertions.assertThat(value.getAnd())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.approval_rule.ApproverDisjunctionDraftImpl()));
    }
}
