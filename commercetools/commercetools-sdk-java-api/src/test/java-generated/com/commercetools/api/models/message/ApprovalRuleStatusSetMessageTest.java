
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalRuleStatusSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalRuleStatusSetMessageBuilder builder) {
        ApprovalRuleStatusSetMessage approvalRuleStatusSetMessage = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleStatusSetMessage).isInstanceOf(ApprovalRuleStatusSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "status", ApprovalRuleStatusSetMessage.builder()
                        .status(com.commercetools.api.models.approval_rule.ApprovalRuleStatus.findEnum("Active")) },
                new Object[] { "oldStatus", ApprovalRuleStatusSetMessage.builder()
                        .oldStatus(
                            com.commercetools.api.models.approval_rule.ApprovalRuleStatus.findEnum("Active")) } };
    }

    @Test
    public void status() {
        ApprovalRuleStatusSetMessage value = ApprovalRuleStatusSetMessage.of();
        value.setStatus(com.commercetools.api.models.approval_rule.ApprovalRuleStatus.findEnum("Active"));
        Assertions.assertThat(value.getStatus())
                .isEqualTo(com.commercetools.api.models.approval_rule.ApprovalRuleStatus.findEnum("Active"));
    }

    @Test
    public void oldStatus() {
        ApprovalRuleStatusSetMessage value = ApprovalRuleStatusSetMessage.of();
        value.setOldStatus(com.commercetools.api.models.approval_rule.ApprovalRuleStatus.findEnum("Active"));
        Assertions.assertThat(value.getOldStatus())
                .isEqualTo(com.commercetools.api.models.approval_rule.ApprovalRuleStatus.findEnum("Active"));
    }
}
