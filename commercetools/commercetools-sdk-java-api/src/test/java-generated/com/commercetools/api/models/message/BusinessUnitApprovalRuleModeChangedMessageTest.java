
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
public class BusinessUnitApprovalRuleModeChangedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitApprovalRuleModeChangedMessageBuilder builder) {
        BusinessUnitApprovalRuleModeChangedMessage businessUnitApprovalRuleModeChangedMessage = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitApprovalRuleModeChangedMessage)
                .isInstanceOf(BusinessUnitApprovalRuleModeChangedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { BusinessUnitApprovalRuleModeChangedMessage.builder()
                        .approvalRuleMode(com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode
                                .findEnum("Explicit")) },
                new Object[] { BusinessUnitApprovalRuleModeChangedMessage.builder()
                        .oldApprovalRuleMode(com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode
                                .findEnum("Explicit")) } };
    }

    @Test
    public void approvalRuleMode() {
        BusinessUnitApprovalRuleModeChangedMessage value = BusinessUnitApprovalRuleModeChangedMessage.of();
        value.setApprovalRuleMode(
            com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode.findEnum("Explicit"));
        Assertions.assertThat(value.getApprovalRuleMode())
                .isEqualTo(
                    com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode.findEnum("Explicit"));
    }

    @Test
    public void oldApprovalRuleMode() {
        BusinessUnitApprovalRuleModeChangedMessage value = BusinessUnitApprovalRuleModeChangedMessage.of();
        value.setOldApprovalRuleMode(
            com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode.findEnum("Explicit"));
        Assertions.assertThat(value.getOldApprovalRuleMode())
                .isEqualTo(
                    com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode.findEnum("Explicit"));
    }
}
