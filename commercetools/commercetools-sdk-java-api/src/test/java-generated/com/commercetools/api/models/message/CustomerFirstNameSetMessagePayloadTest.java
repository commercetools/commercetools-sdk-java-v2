
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
public class CustomerFirstNameSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerFirstNameSetMessagePayloadBuilder builder) {
        CustomerFirstNameSetMessagePayload customerFirstNameSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(customerFirstNameSetMessagePayload)
                .isInstanceOf(CustomerFirstNameSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerFirstNameSetMessagePayload.builder().firstName("firstName") } };
    }

    @Test
    public void firstName() {
        CustomerFirstNameSetMessagePayload value = CustomerFirstNameSetMessagePayload.of();
        value.setFirstName("firstName");
        Assertions.assertThat(value.getFirstName()).isEqualTo("firstName");
    }
}
