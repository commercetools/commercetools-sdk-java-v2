
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
public class CustomerAddressCustomFieldChangedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerAddressCustomFieldChangedMessageBuilder builder) {
        CustomerAddressCustomFieldChangedMessage customerAddressCustomFieldChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(customerAddressCustomFieldChangedMessage)
                .isInstanceOf(CustomerAddressCustomFieldChangedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerAddressCustomFieldChangedMessage.builder().name("name") },
                new Object[] { CustomerAddressCustomFieldChangedMessage.builder().value("value") },
                new Object[] { CustomerAddressCustomFieldChangedMessage.builder().previousValue("previousValue") } };
    }

    @Test
    public void name() {
        CustomerAddressCustomFieldChangedMessage value = CustomerAddressCustomFieldChangedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CustomerAddressCustomFieldChangedMessage value = CustomerAddressCustomFieldChangedMessage.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void previousValue() {
        CustomerAddressCustomFieldChangedMessage value = CustomerAddressCustomFieldChangedMessage.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }
}
