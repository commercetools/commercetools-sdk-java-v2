
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
public class OrderCustomFieldChangedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderCustomFieldChangedMessageBuilder builder) {
        OrderCustomFieldChangedMessage orderCustomFieldChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(orderCustomFieldChangedMessage).isInstanceOf(OrderCustomFieldChangedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderCustomFieldChangedMessage.builder().name("name") },
                new Object[] { OrderCustomFieldChangedMessage.builder().value("value") },
                new Object[] { OrderCustomFieldChangedMessage.builder().previousValue("previousValue") } };
    }

    @Test
    public void name() {
        OrderCustomFieldChangedMessage value = OrderCustomFieldChangedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        OrderCustomFieldChangedMessage value = OrderCustomFieldChangedMessage.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void previousValue() {
        OrderCustomFieldChangedMessage value = OrderCustomFieldChangedMessage.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }
}
