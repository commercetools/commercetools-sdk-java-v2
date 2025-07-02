
package com.commercetools.api.models.business_unit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitChangeAssociateModeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitChangeAssociateModeActionBuilder builder) {
        BusinessUnitChangeAssociateModeAction businessUnitChangeAssociateModeAction = builder.buildUnchecked();
        Assertions.assertThat(businessUnitChangeAssociateModeAction)
                .isInstanceOf(BusinessUnitChangeAssociateModeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "associateMode",
                        BusinessUnitChangeAssociateModeAction.builder()
                                .associateMode(com.commercetools.api.models.business_unit.BusinessUnitAssociateMode
                                        .findEnum("Explicit")) },
                new Object[] { "makeInheritedAssociatesExplicit",
                        BusinessUnitChangeAssociateModeAction.builder().makeInheritedAssociatesExplicit(true) } };
    }

    @Test
    public void associateMode() {
        BusinessUnitChangeAssociateModeAction value = BusinessUnitChangeAssociateModeAction.of();
        value.setAssociateMode(
            com.commercetools.api.models.business_unit.BusinessUnitAssociateMode.findEnum("Explicit"));
        Assertions.assertThat(value.getAssociateMode())
                .isEqualTo(com.commercetools.api.models.business_unit.BusinessUnitAssociateMode.findEnum("Explicit"));
    }

    @Test
    public void makeInheritedAssociatesExplicit() {
        BusinessUnitChangeAssociateModeAction value = BusinessUnitChangeAssociateModeAction.of();
        value.setMakeInheritedAssociatesExplicit(true);
        Assertions.assertThat(value.getMakeInheritedAssociatesExplicit()).isEqualTo(true);
    }
}
