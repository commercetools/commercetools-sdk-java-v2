
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
public class CustomerPasswordUpdatedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerPasswordUpdatedMessagePayloadBuilder builder) {
        CustomerPasswordUpdatedMessagePayload customerPasswordUpdatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(customerPasswordUpdatedMessagePayload)
                .isInstanceOf(CustomerPasswordUpdatedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerPasswordUpdatedMessagePayload.builder().reset(true) } };
    }

    @Test
    public void reset() {
        CustomerPasswordUpdatedMessagePayload value = CustomerPasswordUpdatedMessagePayload.of();
        value.setReset(true);
        Assertions.assertThat(value.getReset()).isEqualTo(true);
    }
}
