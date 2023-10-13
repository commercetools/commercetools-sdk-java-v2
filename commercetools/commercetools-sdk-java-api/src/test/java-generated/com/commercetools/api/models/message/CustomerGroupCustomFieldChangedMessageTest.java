
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
public class CustomerGroupCustomFieldChangedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerGroupCustomFieldChangedMessageBuilder builder) {
        CustomerGroupCustomFieldChangedMessage customerGroupCustomFieldChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(customerGroupCustomFieldChangedMessage)
                .isInstanceOf(CustomerGroupCustomFieldChangedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerGroupCustomFieldChangedMessage.builder().name("name") },
                new Object[] { CustomerGroupCustomFieldChangedMessage.builder().value("value") },
                new Object[] { CustomerGroupCustomFieldChangedMessage.builder().oldValue("oldValue") } };
    }

    @Test
    public void name() {
        CustomerGroupCustomFieldChangedMessage value = CustomerGroupCustomFieldChangedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CustomerGroupCustomFieldChangedMessage value = CustomerGroupCustomFieldChangedMessage.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void oldValue() {
        CustomerGroupCustomFieldChangedMessage value = CustomerGroupCustomFieldChangedMessage.of();
        value.setOldValue("oldValue");
        Assertions.assertThat(value.getOldValue()).isEqualTo("oldValue");
    }
}
