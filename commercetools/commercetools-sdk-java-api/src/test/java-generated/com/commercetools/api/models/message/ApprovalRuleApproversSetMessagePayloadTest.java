
package com.commercetools.api.models.message;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class ApprovalRuleApproversSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApprovalRuleApproversSetMessagePayloadBuilder builder) {
        ApprovalRuleApproversSetMessagePayload approvalRuleApproversSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleApproversSetMessagePayload)
                .isInstanceOf(ApprovalRuleApproversSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ApprovalRuleApproversSetMessagePayload.builder()
                        .approvers(new com.commercetools.api.models.approval_rule.ApproverHierarchyImpl()) },
                new Object[] { ApprovalRuleApproversSetMessagePayload.builder()
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
