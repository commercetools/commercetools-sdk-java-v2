
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
public class ApprovalRuleApproversSetMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApprovalRuleApproversSetMessageBuilder builder) {
        ApprovalRuleApproversSetMessage approvalRuleApproversSetMessage = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleApproversSetMessage).isInstanceOf(ApprovalRuleApproversSetMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ApprovalRuleApproversSetMessage.builder()
                        .approvers(new com.commercetools.api.models.approval_rule.ApproverHierarchyImpl()) },
                new Object[] { ApprovalRuleApproversSetMessage.builder()
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
