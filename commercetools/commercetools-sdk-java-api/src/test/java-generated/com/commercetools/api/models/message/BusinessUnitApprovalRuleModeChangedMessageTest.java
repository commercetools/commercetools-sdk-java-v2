
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitApprovalRuleModeChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitApprovalRuleModeChangedMessageBuilder builder) {
        BusinessUnitApprovalRuleModeChangedMessage businessUnitApprovalRuleModeChangedMessage = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitApprovalRuleModeChangedMessage)
                .isInstanceOf(BusinessUnitApprovalRuleModeChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "approvalRuleMode", BusinessUnitApprovalRuleModeChangedMessage.builder()
                        .approvalRuleMode(com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode
                                .findEnum("Explicit")) },
                new Object[] { "oldApprovalRuleMode", BusinessUnitApprovalRuleModeChangedMessage.builder()
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
