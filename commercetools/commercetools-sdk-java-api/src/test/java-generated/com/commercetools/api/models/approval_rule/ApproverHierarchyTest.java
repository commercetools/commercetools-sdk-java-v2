
package com.commercetools.api.models.approval_rule;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApproverHierarchyTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApproverHierarchyBuilder builder) {
        ApproverHierarchy approverHierarchy = builder.buildUnchecked();
        Assertions.assertThat(approverHierarchy).isInstanceOf(ApproverHierarchy.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "tiers",
                ApproverHierarchy.builder()
                        .tiers(Collections.singletonList(
                            new com.commercetools.api.models.approval_rule.ApproverConjunctionImpl())) } };
    }

    @Test
    public void tiers() {
        ApproverHierarchy value = ApproverHierarchy.of();
        value.setTiers(
            Collections.singletonList(new com.commercetools.api.models.approval_rule.ApproverConjunctionImpl()));
        Assertions.assertThat(value.getTiers())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.approval_rule.ApproverConjunctionImpl()));
    }
}
