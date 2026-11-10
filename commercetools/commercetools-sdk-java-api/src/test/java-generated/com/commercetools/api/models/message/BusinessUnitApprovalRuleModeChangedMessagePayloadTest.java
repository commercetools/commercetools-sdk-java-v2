
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitApprovalRuleModeChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitApprovalRuleModeChangedMessagePayloadBuilder builder) {
        BusinessUnitApprovalRuleModeChangedMessagePayload businessUnitApprovalRuleModeChangedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitApprovalRuleModeChangedMessagePayload)
                .isInstanceOf(BusinessUnitApprovalRuleModeChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "approvalRuleMode", BusinessUnitApprovalRuleModeChangedMessagePayload.builder()
                        .approvalRuleMode(com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode
                                .findEnum("Explicit")) },
                new Object[] { "oldApprovalRuleMode", BusinessUnitApprovalRuleModeChangedMessagePayload.builder()
                        .oldApprovalRuleMode(com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode
                                .findEnum("Explicit")) } };
    }

    @Test
    public void approvalRuleMode() {
        BusinessUnitApprovalRuleModeChangedMessagePayload value = BusinessUnitApprovalRuleModeChangedMessagePayload
                .of();
        value.setApprovalRuleMode(
            com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode.findEnum("Explicit"));
        Assertions.assertThat(value.getApprovalRuleMode())
                .isEqualTo(
                    com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode.findEnum("Explicit"));
    }

    @Test
    public void oldApprovalRuleMode() {
        BusinessUnitApprovalRuleModeChangedMessagePayload value = BusinessUnitApprovalRuleModeChangedMessagePayload
                .of();
        value.setOldApprovalRuleMode(
            com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode.findEnum("Explicit"));
        Assertions.assertThat(value.getOldApprovalRuleMode())
                .isEqualTo(
                    com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode.findEnum("Explicit"));
    }
}
