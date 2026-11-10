
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitParentChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitParentChangedMessagePayloadBuilder builder) {
        BusinessUnitParentChangedMessagePayload businessUnitParentChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(businessUnitParentChangedMessagePayload)
                .isInstanceOf(BusinessUnitParentChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "oldParentUnit", BusinessUnitParentChangedMessagePayload.builder()
                        .oldParentUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl()) },
                new Object[] { "newParentUnit",
                        BusinessUnitParentChangedMessagePayload.builder()
                                .newParentUnit(
                                    new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl()) } };
    }

    @Test
    public void oldParentUnit() {
        BusinessUnitParentChangedMessagePayload value = BusinessUnitParentChangedMessagePayload.of();
        value.setOldParentUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
        Assertions.assertThat(value.getOldParentUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
    }

    @Test
    public void newParentUnit() {
        BusinessUnitParentChangedMessagePayload value = BusinessUnitParentChangedMessagePayload.of();
        value.setNewParentUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
        Assertions.assertThat(value.getNewParentUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
    }
}
