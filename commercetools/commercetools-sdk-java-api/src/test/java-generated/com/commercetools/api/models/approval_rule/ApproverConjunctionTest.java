
package com.commercetools.api.models.approval_rule;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApproverConjunctionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApproverConjunctionBuilder builder) {
        ApproverConjunction approverConjunction = builder.buildUnchecked();
        Assertions.assertThat(approverConjunction).isInstanceOf(ApproverConjunction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "and",
                ApproverConjunction.builder()
                        .and(Collections.singletonList(
                            new com.commercetools.api.models.approval_rule.ApproverDisjunctionImpl())) } };
    }

    @Test
    public void and() {
        ApproverConjunction value = ApproverConjunction.of();
        value.setAnd(
            Collections.singletonList(new com.commercetools.api.models.approval_rule.ApproverDisjunctionImpl()));
        Assertions.assertThat(value.getAnd())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.approval_rule.ApproverDisjunctionImpl()));
    }
}
