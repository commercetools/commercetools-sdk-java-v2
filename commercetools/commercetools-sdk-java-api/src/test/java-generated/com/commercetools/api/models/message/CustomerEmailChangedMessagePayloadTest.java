
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
public class CustomerEmailChangedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerEmailChangedMessagePayloadBuilder builder) {
        CustomerEmailChangedMessagePayload customerEmailChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(customerEmailChangedMessagePayload)
                .isInstanceOf(CustomerEmailChangedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerEmailChangedMessagePayload.builder().email("email") } };
    }

    @Test
    public void email() {
        CustomerEmailChangedMessagePayload value = CustomerEmailChangedMessagePayload.of();
        value.setEmail("email");
        Assertions.assertThat(value.getEmail()).isEqualTo("email");
    }
}
