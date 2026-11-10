
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalRuleStatusSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalRuleStatusSetMessagePayloadBuilder builder) {
        ApprovalRuleStatusSetMessagePayload approvalRuleStatusSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleStatusSetMessagePayload)
                .isInstanceOf(ApprovalRuleStatusSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "status", ApprovalRuleStatusSetMessagePayload.builder()
                        .status(com.commercetools.api.models.approval_rule.ApprovalRuleStatus.findEnum("Active")) },
                new Object[] { "oldStatus", ApprovalRuleStatusSetMessagePayload.builder()
                        .oldStatus(
                            com.commercetools.api.models.approval_rule.ApprovalRuleStatus.findEnum("Active")) } };
    }

    @Test
    public void status() {
        ApprovalRuleStatusSetMessagePayload value = ApprovalRuleStatusSetMessagePayload.of();
        value.setStatus(com.commercetools.api.models.approval_rule.ApprovalRuleStatus.findEnum("Active"));
        Assertions.assertThat(value.getStatus())
                .isEqualTo(com.commercetools.api.models.approval_rule.ApprovalRuleStatus.findEnum("Active"));
    }

    @Test
    public void oldStatus() {
        ApprovalRuleStatusSetMessagePayload value = ApprovalRuleStatusSetMessagePayload.of();
        value.setOldStatus(com.commercetools.api.models.approval_rule.ApprovalRuleStatus.findEnum("Active"));
        Assertions.assertThat(value.getOldStatus())
                .isEqualTo(com.commercetools.api.models.approval_rule.ApprovalRuleStatus.findEnum("Active"));
    }
}
