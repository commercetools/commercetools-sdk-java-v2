
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApprovalRuleApproversSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApprovalRuleApproversSetMessagePayloadBuilder builder) {
        ApprovalRuleApproversSetMessagePayload approvalRuleApproversSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleApproversSetMessagePayload)
                .isInstanceOf(ApprovalRuleApproversSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "approvers",
                        ApprovalRuleApproversSetMessagePayload.builder()
                                .approvers(new com.commercetools.api.models.approval_rule.ApproverHierarchyImpl()) },
                new Object[] { "oldApprovers", ApprovalRuleApproversSetMessagePayload.builder()
                        .oldApprovers(new com.commercetools.api.models.approval_rule.ApproverHierarchyImpl()) } };
    }

    @Test
    public void approvers() {
        ApprovalRuleApproversSetMessagePayload value = ApprovalRuleApproversSetMessagePayload.of();
        value.setApprovers(new com.commercetools.api.models.approval_rule.ApproverHierarchyImpl());
        Assertions.assertThat(value.getApprovers())
                .isEqualTo(new com.commercetools.api.models.approval_rule.ApproverHierarchyImpl());
    }

    @Test
    public void oldApprovers() {
        ApprovalRuleApproversSetMessagePayload value = ApprovalRuleApproversSetMessagePayload.of();
        value.setOldApprovers(new com.commercetools.api.models.approval_rule.ApproverHierarchyImpl());
        Assertions.assertThat(value.getOldApprovers())
                .isEqualTo(new com.commercetools.api.models.approval_rule.ApproverHierarchyImpl());
    }
}
