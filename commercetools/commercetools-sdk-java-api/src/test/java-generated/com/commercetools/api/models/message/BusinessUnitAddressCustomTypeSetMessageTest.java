
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
public class BusinessUnitAddressCustomTypeSetMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitAddressCustomTypeSetMessageBuilder builder) {
        BusinessUnitAddressCustomTypeSetMessage businessUnitAddressCustomTypeSetMessage = builder.buildUnchecked();
        Assertions.assertThat(businessUnitAddressCustomTypeSetMessage)
                .isInstanceOf(BusinessUnitAddressCustomTypeSetMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { BusinessUnitAddressCustomTypeSetMessage.builder()
                        .customFields(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { BusinessUnitAddressCustomTypeSetMessage.builder().oldTypeId("oldTypeId") },
                new Object[] { BusinessUnitAddressCustomTypeSetMessage.builder().addressId("addressId") } };
    }

    @Test
    public void customFields() {
        BusinessUnitAddressCustomTypeSetMessage value = BusinessUnitAddressCustomTypeSetMessage.of();
        value.setCustomFields(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustomFields())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void oldTypeId() {
        BusinessUnitAddressCustomTypeSetMessage value = BusinessUnitAddressCustomTypeSetMessage.of();
        value.setOldTypeId("oldTypeId");
        Assertions.assertThat(value.getOldTypeId()).isEqualTo("oldTypeId");
    }

    @Test
    public void addressId() {
        BusinessUnitAddressCustomTypeSetMessage value = BusinessUnitAddressCustomTypeSetMessage.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }
}
