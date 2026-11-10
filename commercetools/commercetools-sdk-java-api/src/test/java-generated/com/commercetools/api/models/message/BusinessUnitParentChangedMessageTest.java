
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitParentChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitParentChangedMessageBuilder builder) {
        BusinessUnitParentChangedMessage businessUnitParentChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(businessUnitParentChangedMessage).isInstanceOf(BusinessUnitParentChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "oldParentUnit", BusinessUnitParentChangedMessage.builder()
                        .oldParentUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl()) },
                new Object[] { "newParentUnit",
                        BusinessUnitParentChangedMessage.builder()
                                .newParentUnit(
                                    new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl()) } };
    }

    @Test
    public void oldParentUnit() {
        BusinessUnitParentChangedMessage value = BusinessUnitParentChangedMessage.of();
        value.setOldParentUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
        Assertions.assertThat(value.getOldParentUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
    }

    @Test
    public void newParentUnit() {
        BusinessUnitParentChangedMessage value = BusinessUnitParentChangedMessage.of();
        value.setNewParentUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
        Assertions.assertThat(value.getNewParentUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
    }
}
