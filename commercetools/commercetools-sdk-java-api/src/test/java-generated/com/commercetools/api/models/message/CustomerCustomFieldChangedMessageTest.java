
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
public class CustomerCustomFieldChangedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerCustomFieldChangedMessageBuilder builder) {
        CustomerCustomFieldChangedMessage customerCustomFieldChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(customerCustomFieldChangedMessage).isInstanceOf(CustomerCustomFieldChangedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerCustomFieldChangedMessage.builder().name("name") },
                new Object[] { CustomerCustomFieldChangedMessage.builder().value("value") },
                new Object[] { CustomerCustomFieldChangedMessage.builder().previousValue("previousValue") } };
    }

    @Test
    public void name() {
        CustomerCustomFieldChangedMessage value = CustomerCustomFieldChangedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CustomerCustomFieldChangedMessage value = CustomerCustomFieldChangedMessage.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void previousValue() {
        CustomerCustomFieldChangedMessage value = CustomerCustomFieldChangedMessage.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }
}
