
package com.commercetools.api.models.approval_rule;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApproverHierarchyDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApproverHierarchyDraftBuilder builder) {
        ApproverHierarchyDraft approverHierarchyDraft = builder.buildUnchecked();
        Assertions.assertThat(approverHierarchyDraft).isInstanceOf(ApproverHierarchyDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "tiers",
                ApproverHierarchyDraft.builder()
                        .tiers(Collections.singletonList(
                            new com.commercetools.api.models.approval_rule.ApproverConjunctionDraftImpl())) } };
    }

    @Test
    public void tiers() {
        ApproverHierarchyDraft value = ApproverHierarchyDraft.of();
        value.setTiers(
            Collections.singletonList(new com.commercetools.api.models.approval_rule.ApproverConjunctionDraftImpl()));
        Assertions.assertThat(value.getTiers())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.approval_rule.ApproverConjunctionDraftImpl()));
    }
}
