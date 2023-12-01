
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
public class CustomerGroupCustomFieldAddedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerGroupCustomFieldAddedMessagePayloadBuilder builder) {
        CustomerGroupCustomFieldAddedMessagePayload customerGroupCustomFieldAddedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(customerGroupCustomFieldAddedMessagePayload)
                .isInstanceOf(CustomerGroupCustomFieldAddedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerGroupCustomFieldAddedMessagePayload.builder().name("name") },
                new Object[] { CustomerGroupCustomFieldAddedMessagePayload.builder().value("value") } };
    }

    @Test
    public void name() {
        CustomerGroupCustomFieldAddedMessagePayload value = CustomerGroupCustomFieldAddedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CustomerGroupCustomFieldAddedMessagePayload value = CustomerGroupCustomFieldAddedMessagePayload.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
