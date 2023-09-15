
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
public class BusinessUnitAddressCustomFieldChangedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitAddressCustomFieldChangedMessagePayloadBuilder builder) {
        BusinessUnitAddressCustomFieldChangedMessagePayload businessUnitAddressCustomFieldChangedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitAddressCustomFieldChangedMessagePayload)
                .isInstanceOf(BusinessUnitAddressCustomFieldChangedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { BusinessUnitAddressCustomFieldChangedMessagePayload.builder().name("name") },
                new Object[] { BusinessUnitAddressCustomFieldChangedMessagePayload.builder().value("value") },
                new Object[] { BusinessUnitAddressCustomFieldChangedMessagePayload.builder().oldValue("oldValue") } };
    }

    @Test
    public void name() {
        BusinessUnitAddressCustomFieldChangedMessagePayload value = BusinessUnitAddressCustomFieldChangedMessagePayload
                .of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        BusinessUnitAddressCustomFieldChangedMessagePayload value = BusinessUnitAddressCustomFieldChangedMessagePayload
                .of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void oldValue() {
        BusinessUnitAddressCustomFieldChangedMessagePayload value = BusinessUnitAddressCustomFieldChangedMessagePayload
                .of();
        value.setOldValue("oldValue");
        Assertions.assertThat(value.getOldValue()).isEqualTo("oldValue");
    }
}
