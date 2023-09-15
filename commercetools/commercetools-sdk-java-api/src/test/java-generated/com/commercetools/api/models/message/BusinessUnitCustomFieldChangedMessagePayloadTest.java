
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
public class BusinessUnitCustomFieldChangedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitCustomFieldChangedMessagePayloadBuilder builder) {
        BusinessUnitCustomFieldChangedMessagePayload businessUnitCustomFieldChangedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitCustomFieldChangedMessagePayload)
                .isInstanceOf(BusinessUnitCustomFieldChangedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { BusinessUnitCustomFieldChangedMessagePayload.builder().name("name") },
                new Object[] { BusinessUnitCustomFieldChangedMessagePayload.builder().value("value") },
                new Object[] { BusinessUnitCustomFieldChangedMessagePayload.builder().oldValue("oldValue") } };
    }

    @Test
    public void name() {
        BusinessUnitCustomFieldChangedMessagePayload value = BusinessUnitCustomFieldChangedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        BusinessUnitCustomFieldChangedMessagePayload value = BusinessUnitCustomFieldChangedMessagePayload.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void oldValue() {
        BusinessUnitCustomFieldChangedMessagePayload value = BusinessUnitCustomFieldChangedMessagePayload.of();
        value.setOldValue("oldValue");
        Assertions.assertThat(value.getOldValue()).isEqualTo("oldValue");
    }
}
