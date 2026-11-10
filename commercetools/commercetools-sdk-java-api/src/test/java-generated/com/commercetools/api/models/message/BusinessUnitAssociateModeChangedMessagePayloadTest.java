
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitAssociateModeChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitAssociateModeChangedMessagePayloadBuilder builder) {
        BusinessUnitAssociateModeChangedMessagePayload businessUnitAssociateModeChangedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitAssociateModeChangedMessagePayload)
                .isInstanceOf(BusinessUnitAssociateModeChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "associateMode",
                        BusinessUnitAssociateModeChangedMessagePayload.builder()
                                .associateMode(com.commercetools.api.models.business_unit.BusinessUnitAssociateMode
                                        .findEnum("Explicit")) },
                new Object[] { "oldAssociateMode",
                        BusinessUnitAssociateModeChangedMessagePayload.builder()
                                .oldAssociateMode(com.commercetools.api.models.business_unit.BusinessUnitAssociateMode
                                        .findEnum("Explicit")) } };
    }

    @Test
    public void associateMode() {
        BusinessUnitAssociateModeChangedMessagePayload value = BusinessUnitAssociateModeChangedMessagePayload.of();
        value.setAssociateMode(
            com.commercetools.api.models.business_unit.BusinessUnitAssociateMode.findEnum("Explicit"));
        Assertions.assertThat(value.getAssociateMode())
                .isEqualTo(com.commercetools.api.models.business_unit.BusinessUnitAssociateMode.findEnum("Explicit"));
    }

    @Test
    public void oldAssociateMode() {
        BusinessUnitAssociateModeChangedMessagePayload value = BusinessUnitAssociateModeChangedMessagePayload.of();
        value.setOldAssociateMode(
            com.commercetools.api.models.business_unit.BusinessUnitAssociateMode.findEnum("Explicit"));
        Assertions.assertThat(value.getOldAssociateMode())
                .isEqualTo(com.commercetools.api.models.business_unit.BusinessUnitAssociateMode.findEnum("Explicit"));
    }
}
