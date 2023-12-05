
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
public class BusinessUnitAssociateChangedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitAssociateChangedMessagePayloadBuilder builder) {
        BusinessUnitAssociateChangedMessagePayload businessUnitAssociateChangedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitAssociateChangedMessagePayload)
                .isInstanceOf(BusinessUnitAssociateChangedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { BusinessUnitAssociateChangedMessagePayload.builder()
                .associate(new com.commercetools.api.models.business_unit.AssociateImpl()) } };
    }

    @Test
    public void associate() {
        BusinessUnitAssociateChangedMessagePayload value = BusinessUnitAssociateChangedMessagePayload.of();
        value.setAssociate(new com.commercetools.api.models.business_unit.AssociateImpl());
        Assertions.assertThat(value.getAssociate())
                .isEqualTo(new com.commercetools.api.models.business_unit.AssociateImpl());
    }
}
