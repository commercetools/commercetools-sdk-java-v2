
package com.commercetools.api.models.approval_rule;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApproverDisjunctionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApproverDisjunctionBuilder builder) {
        ApproverDisjunction approverDisjunction = builder.buildUnchecked();
        Assertions.assertThat(approverDisjunction).isInstanceOf(ApproverDisjunction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "or", ApproverDisjunction.builder()
                .or(Collections.singletonList(new com.commercetools.api.models.approval_rule.RuleApproverImpl())) } };
    }

    @Test
    public void or() {
        ApproverDisjunction value = ApproverDisjunction.of();
        value.setOr(Collections.singletonList(new com.commercetools.api.models.approval_rule.RuleApproverImpl()));
        Assertions.assertThat(value.getOr())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.approval_rule.RuleApproverImpl()));
    }
}
