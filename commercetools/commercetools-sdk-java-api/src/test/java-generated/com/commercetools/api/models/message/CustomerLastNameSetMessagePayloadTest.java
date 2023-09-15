
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
public class CustomerLastNameSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerLastNameSetMessagePayloadBuilder builder) {
        CustomerLastNameSetMessagePayload customerLastNameSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(customerLastNameSetMessagePayload).isInstanceOf(CustomerLastNameSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerLastNameSetMessagePayload.builder().lastName("lastName") } };
    }

    @Test
    public void lastName() {
        CustomerLastNameSetMessagePayload value = CustomerLastNameSetMessagePayload.of();
        value.setLastName("lastName");
        Assertions.assertThat(value.getLastName()).isEqualTo("lastName");
    }
}
