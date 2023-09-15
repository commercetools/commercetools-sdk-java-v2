
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
public class CustomerCustomFieldAddedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerCustomFieldAddedMessageBuilder builder) {
        CustomerCustomFieldAddedMessage customerCustomFieldAddedMessage = builder.buildUnchecked();
        Assertions.assertThat(customerCustomFieldAddedMessage).isInstanceOf(CustomerCustomFieldAddedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerCustomFieldAddedMessage.builder().name("name") },
                new Object[] { CustomerCustomFieldAddedMessage.builder().value("value") } };
    }

    @Test
    public void name() {
        CustomerCustomFieldAddedMessage value = CustomerCustomFieldAddedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CustomerCustomFieldAddedMessage value = CustomerCustomFieldAddedMessage.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
