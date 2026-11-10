
package com.commercetools.api.models.approval_rule;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalRuleSetStatusActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalRuleSetStatusActionBuilder builder) {
        ApprovalRuleSetStatusAction approvalRuleSetStatusAction = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleSetStatusAction).isInstanceOf(ApprovalRuleSetStatusAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "status", ApprovalRuleSetStatusAction.builder()
                .status(com.commercetools.api.models.approval_rule.ApprovalRuleStatus.findEnum("Active")) } };
    }

    @Test
    public void status() {
        ApprovalRuleSetStatusAction value = ApprovalRuleSetStatusAction.of();
        value.setStatus(com.commercetools.api.models.approval_rule.ApprovalRuleStatus.findEnum("Active"));
        Assertions.assertThat(value.getStatus())
                .isEqualTo(com.commercetools.api.models.approval_rule.ApprovalRuleStatus.findEnum("Active"));
    }
}
