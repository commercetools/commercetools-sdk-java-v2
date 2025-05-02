
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalRuleCreatedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalRuleCreatedMessageBuilder builder) {
        ApprovalRuleCreatedMessage approvalRuleCreatedMessage = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleCreatedMessage).isInstanceOf(ApprovalRuleCreatedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "approvalRule", ApprovalRuleCreatedMessage.builder()
                .approvalRule(new com.commercetools.api.models.approval_rule.ApprovalRuleImpl()) } };
    }

    @Test
    public void approvalRule() {
        ApprovalRuleCreatedMessage value = ApprovalRuleCreatedMessage.of();
        value.setApprovalRule(new com.commercetools.api.models.approval_rule.ApprovalRuleImpl());
        Assertions.assertThat(value.getApprovalRule())
                .isEqualTo(new com.commercetools.api.models.approval_rule.ApprovalRuleImpl());
    }
}
