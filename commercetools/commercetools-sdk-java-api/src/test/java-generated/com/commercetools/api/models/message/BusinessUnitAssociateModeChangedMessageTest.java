
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitAssociateModeChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitAssociateModeChangedMessageBuilder builder) {
        BusinessUnitAssociateModeChangedMessage businessUnitAssociateModeChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(businessUnitAssociateModeChangedMessage)
                .isInstanceOf(BusinessUnitAssociateModeChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "associateMode",
                        BusinessUnitAssociateModeChangedMessage.builder()
                                .associateMode(com.commercetools.api.models.business_unit.BusinessUnitAssociateMode
                                        .findEnum("Explicit")) },
                new Object[] { "oldAssociateMode",
                        BusinessUnitAssociateModeChangedMessage.builder()
                                .oldAssociateMode(com.commercetools.api.models.business_unit.BusinessUnitAssociateMode
                                        .findEnum("Explicit")) } };
    }

    @Test
    public void associateMode() {
        BusinessUnitAssociateModeChangedMessage value = BusinessUnitAssociateModeChangedMessage.of();
        value.setAssociateMode(
            com.commercetools.api.models.business_unit.BusinessUnitAssociateMode.findEnum("Explicit"));
        Assertions.assertThat(value.getAssociateMode())
                .isEqualTo(com.commercetools.api.models.business_unit.BusinessUnitAssociateMode.findEnum("Explicit"));
    }

    @Test
    public void oldAssociateMode() {
        BusinessUnitAssociateModeChangedMessage value = BusinessUnitAssociateModeChangedMessage.of();
        value.setOldAssociateMode(
            com.commercetools.api.models.business_unit.BusinessUnitAssociateMode.findEnum("Explicit"));
        Assertions.assertThat(value.getOldAssociateMode())
                .isEqualTo(com.commercetools.api.models.business_unit.BusinessUnitAssociateMode.findEnum("Explicit"));
    }
}
