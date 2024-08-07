
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
public class CustomerAddressCustomFieldAddedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerAddressCustomFieldAddedMessageBuilder builder) {
        CustomerAddressCustomFieldAddedMessage customerAddressCustomFieldAddedMessage = builder.buildUnchecked();
        Assertions.assertThat(customerAddressCustomFieldAddedMessage)
                .isInstanceOf(CustomerAddressCustomFieldAddedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerAddressCustomFieldAddedMessage.builder().name("name") },
                new Object[] { CustomerAddressCustomFieldAddedMessage.builder().value("value") },
                new Object[] { CustomerAddressCustomFieldAddedMessage.builder().addressId("addressId") } };
    }

    @Test
    public void name() {
        CustomerAddressCustomFieldAddedMessage value = CustomerAddressCustomFieldAddedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CustomerAddressCustomFieldAddedMessage value = CustomerAddressCustomFieldAddedMessage.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void addressId() {
        CustomerAddressCustomFieldAddedMessage value = CustomerAddressCustomFieldAddedMessage.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }
}
