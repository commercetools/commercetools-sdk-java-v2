
package com.commercetools.api.models.message;

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
public class BusinessUnitTypeSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitTypeSetMessagePayloadBuilder builder) {
        BusinessUnitTypeSetMessagePayload businessUnitTypeSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(businessUnitTypeSetMessagePayload).isInstanceOf(BusinessUnitTypeSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { BusinessUnitTypeSetMessagePayload.builder()
                        .parentUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl()) },
                new Object[] { BusinessUnitTypeSetMessagePayload.builder()
                        .oldParentUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl()) },
                new Object[] { BusinessUnitTypeSetMessagePayload.builder()
                        .unitType(com.commercetools.api.models.business_unit.BusinessUnitType.findEnum("Company")) },
                new Object[] { BusinessUnitTypeSetMessagePayload.builder()
                        .oldUnitType(
                            com.commercetools.api.models.business_unit.BusinessUnitType.findEnum("Company")) } };
    }

    @Test
    public void parentUnit() {
        BusinessUnitTypeSetMessagePayload value = BusinessUnitTypeSetMessagePayload.of();
        value.setParentUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
        Assertions.assertThat(value.getParentUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
    }

    @Test
    public void oldParentUnit() {
        BusinessUnitTypeSetMessagePayload value = BusinessUnitTypeSetMessagePayload.of();
        value.setOldParentUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
        Assertions.assertThat(value.getOldParentUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
    }

    @Test
    public void unitType() {
        BusinessUnitTypeSetMessagePayload value = BusinessUnitTypeSetMessagePayload.of();
        value.setUnitType(com.commercetools.api.models.business_unit.BusinessUnitType.findEnum("Company"));
        Assertions.assertThat(value.getUnitType())
                .isEqualTo(com.commercetools.api.models.business_unit.BusinessUnitType.findEnum("Company"));
    }

    @Test
    public void oldUnitType() {
        BusinessUnitTypeSetMessagePayload value = BusinessUnitTypeSetMessagePayload.of();
        value.setOldUnitType(com.commercetools.api.models.business_unit.BusinessUnitType.findEnum("Company"));
        Assertions.assertThat(value.getOldUnitType())
                .isEqualTo(com.commercetools.api.models.business_unit.BusinessUnitType.findEnum("Company"));
    }
}
