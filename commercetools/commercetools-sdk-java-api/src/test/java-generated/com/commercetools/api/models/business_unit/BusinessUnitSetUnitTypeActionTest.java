
package com.commercetools.api.models.business_unit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitSetUnitTypeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitSetUnitTypeActionBuilder builder) {
        BusinessUnitSetUnitTypeAction businessUnitSetUnitTypeAction = builder.buildUnchecked();
        Assertions.assertThat(businessUnitSetUnitTypeAction).isInstanceOf(BusinessUnitSetUnitTypeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "unitType", BusinessUnitSetUnitTypeAction.builder()
                        .unitType(com.commercetools.api.models.business_unit.BusinessUnitType.findEnum("Company")) },
                new Object[] { "parentUnit", BusinessUnitSetUnitTypeAction.builder()
                        .parentUnit(
                            new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl()) } };
    }

    @Test
    public void unitType() {
        BusinessUnitSetUnitTypeAction value = BusinessUnitSetUnitTypeAction.of();
        value.setUnitType(com.commercetools.api.models.business_unit.BusinessUnitType.findEnum("Company"));
        Assertions.assertThat(value.getUnitType())
                .isEqualTo(com.commercetools.api.models.business_unit.BusinessUnitType.findEnum("Company"));
    }

    @Test
    public void parentUnit() {
        BusinessUnitSetUnitTypeAction value = BusinessUnitSetUnitTypeAction.of();
        value.setParentUnit(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl());
        Assertions.assertThat(value.getParentUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl());
    }
}
