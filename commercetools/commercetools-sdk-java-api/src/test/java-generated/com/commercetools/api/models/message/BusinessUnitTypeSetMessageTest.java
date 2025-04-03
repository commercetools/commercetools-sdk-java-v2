
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
public class BusinessUnitTypeSetMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitTypeSetMessageBuilder builder) {
        BusinessUnitTypeSetMessage businessUnitTypeSetMessage = builder.buildUnchecked();
        Assertions.assertThat(businessUnitTypeSetMessage).isInstanceOf(BusinessUnitTypeSetMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { BusinessUnitTypeSetMessage.builder()
                        .parentUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl()) },
                new Object[] { BusinessUnitTypeSetMessage.builder()
                        .oldParentUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl()) },
                new Object[] { BusinessUnitTypeSetMessage.builder()
                        .unitType(com.commercetools.api.models.business_unit.BusinessUnitType.findEnum("Company")) },
                new Object[] { BusinessUnitTypeSetMessage.builder()
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
