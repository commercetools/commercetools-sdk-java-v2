
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitTypeSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitTypeSetMessageBuilder builder) {
        BusinessUnitTypeSetMessage businessUnitTypeSetMessage = builder.buildUnchecked();
        Assertions.assertThat(businessUnitTypeSetMessage).isInstanceOf(BusinessUnitTypeSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "parentUnit", BusinessUnitTypeSetMessage.builder()
                        .parentUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl()) },
                new Object[] { "oldParentUnit", BusinessUnitTypeSetMessage.builder()
                        .oldParentUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl()) },
                new Object[] { "unitType", BusinessUnitTypeSetMessage.builder()
                        .unitType(com.commercetools.api.models.business_unit.BusinessUnitType.findEnum("Company")) },
                new Object[] { "oldUnitType", BusinessUnitTypeSetMessage.builder()
                        .oldUnitType(
                            com.commercetools.api.models.business_unit.BusinessUnitType.findEnum("Company")) } };
    }

    @Test
    public void parentUnit() {
        BusinessUnitTypeSetMessage value = BusinessUnitTypeSetMessage.of();
        value.setParentUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
        Assertions.assertThat(value.getParentUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
    }

    @Test
    public void oldParentUnit() {
        BusinessUnitTypeSetMessage value = BusinessUnitTypeSetMessage.of();
        value.setOldParentUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
        Assertions.assertThat(value.getOldParentUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
    }

    @Test
    public void unitType() {
        BusinessUnitTypeSetMessage value = BusinessUnitTypeSetMessage.of();
        value.setUnitType(com.commercetools.api.models.business_unit.BusinessUnitType.findEnum("Company"));
        Assertions.assertThat(value.getUnitType())
                .isEqualTo(com.commercetools.api.models.business_unit.BusinessUnitType.findEnum("Company"));
    }

    @Test
    public void oldUnitType() {
        BusinessUnitTypeSetMessage value = BusinessUnitTypeSetMessage.of();
        value.setOldUnitType(com.commercetools.api.models.business_unit.BusinessUnitType.findEnum("Company"));
        Assertions.assertThat(value.getOldUnitType())
                .isEqualTo(com.commercetools.api.models.business_unit.BusinessUnitType.findEnum("Company"));
    }
}
