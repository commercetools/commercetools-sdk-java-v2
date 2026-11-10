
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalRuleCreatedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalRuleCreatedMessagePayloadBuilder builder) {
        ApprovalRuleCreatedMessagePayload approvalRuleCreatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleCreatedMessagePayload).isInstanceOf(ApprovalRuleCreatedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "approvalRule", ApprovalRuleCreatedMessagePayload.builder()
                .approvalRule(new com.commercetools.api.models.approval_rule.ApprovalRuleImpl()) } };
    }

    @Test
    public void approvalRule() {
        ApprovalRuleCreatedMessagePayload value = ApprovalRuleCreatedMessagePayload.of();
        value.setApprovalRule(new com.commercetools.api.models.approval_rule.ApprovalRuleImpl());
        Assertions.assertThat(value.getApprovalRule())
                .isEqualTo(new com.commercetools.api.models.approval_rule.ApprovalRuleImpl());
    }
}
