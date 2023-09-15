
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
public class CustomerAddressCustomTypeRemovedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerAddressCustomTypeRemovedMessageBuilder builder) {
        CustomerAddressCustomTypeRemovedMessage customerAddressCustomTypeRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(customerAddressCustomTypeRemovedMessage)
                .isInstanceOf(CustomerAddressCustomTypeRemovedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CustomerAddressCustomTypeRemovedMessage.builder().previousTypeId("previousTypeId") } };
    }

    @Test
    public void previousTypeId() {
        CustomerAddressCustomTypeRemovedMessage value = CustomerAddressCustomTypeRemovedMessage.of();
        value.setPreviousTypeId("previousTypeId");
        Assertions.assertThat(value.getPreviousTypeId()).isEqualTo("previousTypeId");
    }
}
