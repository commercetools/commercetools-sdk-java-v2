
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
public class CustomerAddressCustomFieldRemovedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerAddressCustomFieldRemovedMessageBuilder builder) {
        CustomerAddressCustomFieldRemovedMessage customerAddressCustomFieldRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(customerAddressCustomFieldRemovedMessage)
                .isInstanceOf(CustomerAddressCustomFieldRemovedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerAddressCustomFieldRemovedMessage.builder().name("name") },
                new Object[] { CustomerAddressCustomFieldRemovedMessage.builder().addressId("addressId") } };
    }

    @Test
    public void name() {
        CustomerAddressCustomFieldRemovedMessage value = CustomerAddressCustomFieldRemovedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void addressId() {
        CustomerAddressCustomFieldRemovedMessage value = CustomerAddressCustomFieldRemovedMessage.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }
}
