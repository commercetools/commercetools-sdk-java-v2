
package com.commercetools.api.models.business_unit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitChangeApprovalRuleModeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitChangeApprovalRuleModeActionBuilder builder) {
        BusinessUnitChangeApprovalRuleModeAction businessUnitChangeApprovalRuleModeAction = builder.buildUnchecked();
        Assertions.assertThat(businessUnitChangeApprovalRuleModeAction)
                .isInstanceOf(BusinessUnitChangeApprovalRuleModeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "approvalRuleMode", BusinessUnitChangeApprovalRuleModeAction.builder()
                .approvalRuleMode(
                    com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode.findEnum("Explicit")) } };
    }

    @Test
    public void approvalRuleMode() {
        BusinessUnitChangeApprovalRuleModeAction value = BusinessUnitChangeApprovalRuleModeAction.of();
        value.setApprovalRuleMode(
            com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode.findEnum("Explicit"));
        Assertions.assertThat(value.getApprovalRuleMode())
                .isEqualTo(
                    com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode.findEnum("Explicit"));
    }
}
