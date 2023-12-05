
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
public class CustomerCustomTypeRemovedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerCustomTypeRemovedMessagePayloadBuilder builder) {
        CustomerCustomTypeRemovedMessagePayload customerCustomTypeRemovedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(customerCustomTypeRemovedMessagePayload)
                .isInstanceOf(CustomerCustomTypeRemovedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CustomerCustomTypeRemovedMessagePayload.builder().previousTypeId("previousTypeId") } };
    }

    @Test
    public void previousTypeId() {
        CustomerCustomTypeRemovedMessagePayload value = CustomerCustomTypeRemovedMessagePayload.of();
        value.setPreviousTypeId("previousTypeId");
        Assertions.assertThat(value.getPreviousTypeId()).isEqualTo("previousTypeId");
    }
}
