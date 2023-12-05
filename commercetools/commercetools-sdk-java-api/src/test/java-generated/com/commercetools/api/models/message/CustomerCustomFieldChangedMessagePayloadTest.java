
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
public class CustomerCustomFieldChangedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerCustomFieldChangedMessagePayloadBuilder builder) {
        CustomerCustomFieldChangedMessagePayload customerCustomFieldChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(customerCustomFieldChangedMessagePayload)
                .isInstanceOf(CustomerCustomFieldChangedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerCustomFieldChangedMessagePayload.builder().name("name") },
                new Object[] { CustomerCustomFieldChangedMessagePayload.builder().value("value") },
                new Object[] { CustomerCustomFieldChangedMessagePayload.builder().previousValue("previousValue") } };
    }

    @Test
    public void name() {
        CustomerCustomFieldChangedMessagePayload value = CustomerCustomFieldChangedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CustomerCustomFieldChangedMessagePayload value = CustomerCustomFieldChangedMessagePayload.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void previousValue() {
        CustomerCustomFieldChangedMessagePayload value = CustomerCustomFieldChangedMessagePayload.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }
}
