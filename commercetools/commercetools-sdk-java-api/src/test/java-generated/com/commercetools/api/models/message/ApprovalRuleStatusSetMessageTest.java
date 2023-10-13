
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
public class ApprovalRuleStatusSetMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApprovalRuleStatusSetMessageBuilder builder) {
        ApprovalRuleStatusSetMessage approvalRuleStatusSetMessage = builder.buildUnchecked();
        Assertions.assertThat(approvalRuleStatusSetMessage).isInstanceOf(ApprovalRuleStatusSetMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ApprovalRuleStatusSetMessage.builder()
                        .status(com.commercetools.api.models.approval_rule.ApprovalRuleStatus.findEnum("Active")) },
                new Object[] { ApprovalRuleStatusSetMessage.builder()
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
