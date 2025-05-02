
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalRuleApproversSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalRuleApproversSetMessageBuilder builder) {
        ApprovalRuleApproversSetMessage approvalRuleApproversSetMessage = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleApproversSetMessage).isInstanceOf(ApprovalRuleApproversSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "approvers",
                        ApprovalRuleApproversSetMessage.builder()
                                .approvers(new com.commercetools.api.models.approval_rule.ApproverHierarchyImpl()) },
                new Object[] { "oldApprovers", ApprovalRuleApproversSetMessage.builder()
                        .oldApprovers(new com.commercetools.api.models.approval_rule.ApproverHierarchyImpl()) } };
    }

    @Test
    public void approvers() {
        ApprovalRuleApproversSetMessage value = ApprovalRuleApproversSetMessage.of();
        value.setApprovers(new com.commercetools.api.models.approval_rule.ApproverHierarchyImpl());
        Assertions.assertThat(value.getApprovers())
                .isEqualTo(new com.commercetools.api.models.approval_rule.ApproverHierarchyImpl());
    }

    @Test
    public void oldApprovers() {
        ApprovalRuleApproversSetMessage value = ApprovalRuleApproversSetMessage.of();
        value.setOldApprovers(new com.commercetools.api.models.approval_rule.ApproverHierarchyImpl());
        Assertions.assertThat(value.getOldApprovers())
                .isEqualTo(new com.commercetools.api.models.approval_rule.ApproverHierarchyImpl());
    }
}
