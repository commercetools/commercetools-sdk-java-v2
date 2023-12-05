
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
public class ApprovalRuleCreatedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApprovalRuleCreatedMessageBuilder builder) {
        ApprovalRuleCreatedMessage approvalRuleCreatedMessage = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleCreatedMessage).isInstanceOf(ApprovalRuleCreatedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ApprovalRuleCreatedMessage.builder()
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
