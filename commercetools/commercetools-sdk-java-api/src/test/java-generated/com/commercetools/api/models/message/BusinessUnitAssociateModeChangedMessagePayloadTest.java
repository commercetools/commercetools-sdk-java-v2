
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
public class BusinessUnitAssociateModeChangedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitAssociateModeChangedMessagePayloadBuilder builder) {
        BusinessUnitAssociateModeChangedMessagePayload businessUnitAssociateModeChangedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitAssociateModeChangedMessagePayload)
                .isInstanceOf(BusinessUnitAssociateModeChangedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { BusinessUnitAssociateModeChangedMessagePayload.builder()
                        .associateMode(com.commercetools.api.models.business_unit.BusinessUnitAssociateMode
                                .findEnum("Explicit")) },
                new Object[] { BusinessUnitAssociateModeChangedMessagePayload.builder()
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
