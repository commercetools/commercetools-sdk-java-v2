
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
public class CustomerGroupCustomFieldChangedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerGroupCustomFieldChangedMessagePayloadBuilder builder) {
        CustomerGroupCustomFieldChangedMessagePayload customerGroupCustomFieldChangedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(customerGroupCustomFieldChangedMessagePayload)
                .isInstanceOf(CustomerGroupCustomFieldChangedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerGroupCustomFieldChangedMessagePayload.builder().name("name") },
                new Object[] { CustomerGroupCustomFieldChangedMessagePayload.builder().value("value") },
                new Object[] { CustomerGroupCustomFieldChangedMessagePayload.builder().oldValue("oldValue") } };
    }

    @Test
    public void name() {
        CustomerGroupCustomFieldChangedMessagePayload value = CustomerGroupCustomFieldChangedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CustomerGroupCustomFieldChangedMessagePayload value = CustomerGroupCustomFieldChangedMessagePayload.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void oldValue() {
        CustomerGroupCustomFieldChangedMessagePayload value = CustomerGroupCustomFieldChangedMessagePayload.of();
        value.setOldValue("oldValue");
        Assertions.assertThat(value.getOldValue()).isEqualTo("oldValue");
    }
}
