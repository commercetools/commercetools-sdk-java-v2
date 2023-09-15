
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
public class CustomerPasswordUpdatedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerPasswordUpdatedMessageBuilder builder) {
        CustomerPasswordUpdatedMessage customerPasswordUpdatedMessage = builder.buildUnchecked();
        Assertions.assertThat(customerPasswordUpdatedMessage).isInstanceOf(CustomerPasswordUpdatedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerPasswordUpdatedMessage.builder().reset(true) } };
    }

    @Test
    public void reset() {
        CustomerPasswordUpdatedMessage value = CustomerPasswordUpdatedMessage.of();
        value.setReset(true);
        Assertions.assertThat(value.getReset()).isEqualTo(true);
    }
}
