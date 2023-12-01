
package com.commercetools.api.models.approval_rule;

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
public class ApprovalRuleSetApproversActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApprovalRuleSetApproversActionBuilder builder) {
        ApprovalRuleSetApproversAction approvalRuleSetApproversAction = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleSetApproversAction).isInstanceOf(ApprovalRuleSetApproversAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ApprovalRuleSetApproversAction.builder()
                .approvers(new com.commercetools.api.models.approval_rule.ApproverHierarchyDraftImpl()) } };
    }

    @Test
    public void approvers() {
        ApprovalRuleSetApproversAction value = ApprovalRuleSetApproversAction.of();
        value.setApprovers(new com.commercetools.api.models.approval_rule.ApproverHierarchyDraftImpl());
        Assertions.assertThat(value.getApprovers())
                .isEqualTo(new com.commercetools.api.models.approval_rule.ApproverHierarchyDraftImpl());
    }
}
