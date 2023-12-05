
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
public class ApprovalRuleCreatedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApprovalRuleCreatedMessagePayloadBuilder builder) {
        ApprovalRuleCreatedMessagePayload approvalRuleCreatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleCreatedMessagePayload).isInstanceOf(ApprovalRuleCreatedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ApprovalRuleCreatedMessagePayload.builder()
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
