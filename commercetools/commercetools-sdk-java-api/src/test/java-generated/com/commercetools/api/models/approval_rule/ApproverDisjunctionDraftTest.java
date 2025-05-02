
package com.commercetools.api.models.approval_rule;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApproverDisjunctionDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApproverDisjunctionDraftBuilder builder) {
        ApproverDisjunctionDraft approverDisjunctionDraft = builder.buildUnchecked();
        Assertions.assertThat(approverDisjunctionDraft).isInstanceOf(ApproverDisjunctionDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "or",
                ApproverDisjunctionDraft.builder()
                        .or(Collections.singletonList(
                            new com.commercetools.api.models.approval_rule.RuleApproverDraftImpl())) } };
    }

    @Test
    public void or() {
        ApproverDisjunctionDraft value = ApproverDisjunctionDraft.of();
        value.setOr(Collections.singletonList(new com.commercetools.api.models.approval_rule.RuleApproverDraftImpl()));
        Assertions.assertThat(value.getOr())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.approval_rule.RuleApproverDraftImpl()));
    }
}
