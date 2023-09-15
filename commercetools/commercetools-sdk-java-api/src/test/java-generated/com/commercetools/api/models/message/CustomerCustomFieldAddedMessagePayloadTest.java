
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
public class CustomerCustomFieldAddedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerCustomFieldAddedMessagePayloadBuilder builder) {
        CustomerCustomFieldAddedMessagePayload customerCustomFieldAddedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(customerCustomFieldAddedMessagePayload)
                .isInstanceOf(CustomerCustomFieldAddedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerCustomFieldAddedMessagePayload.builder().name("name") },
                new Object[] { CustomerCustomFieldAddedMessagePayload.builder().value("value") } };
    }

    @Test
    public void name() {
        CustomerCustomFieldAddedMessagePayload value = CustomerCustomFieldAddedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CustomerCustomFieldAddedMessagePayload value = CustomerCustomFieldAddedMessagePayload.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
