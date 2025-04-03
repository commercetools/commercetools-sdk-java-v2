
package com.commercetools.api.models.business_unit;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class BusinessUnitSetUnitTypeActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitSetUnitTypeActionBuilder builder) {
        BusinessUnitSetUnitTypeAction businessUnitSetUnitTypeAction = builder.buildUnchecked();
        Assertions.assertThat(businessUnitSetUnitTypeAction).isInstanceOf(BusinessUnitSetUnitTypeAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { BusinessUnitSetUnitTypeAction.builder()
                        .unitType(com.commercetools.api.models.business_unit.BusinessUnitType.findEnum("Company")) },
                new Object[] { BusinessUnitSetUnitTypeAction.builder()
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
