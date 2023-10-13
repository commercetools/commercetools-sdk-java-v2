
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
public class CustomerCustomFieldRemovedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerCustomFieldRemovedMessagePayloadBuilder builder) {
        CustomerCustomFieldRemovedMessagePayload customerCustomFieldRemovedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(customerCustomFieldRemovedMessagePayload)
                .isInstanceOf(CustomerCustomFieldRemovedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerCustomFieldRemovedMessagePayload.builder().name("name") } };
    }

    @Test
    public void name() {
        CustomerCustomFieldRemovedMessagePayload value = CustomerCustomFieldRemovedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
