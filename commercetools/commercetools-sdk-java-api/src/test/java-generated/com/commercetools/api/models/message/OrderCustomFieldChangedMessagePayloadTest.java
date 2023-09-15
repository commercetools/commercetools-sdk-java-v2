
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
public class OrderCustomFieldChangedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderCustomFieldChangedMessagePayloadBuilder builder) {
        OrderCustomFieldChangedMessagePayload orderCustomFieldChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderCustomFieldChangedMessagePayload)
                .isInstanceOf(OrderCustomFieldChangedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderCustomFieldChangedMessagePayload.builder().name("name") },
                new Object[] { OrderCustomFieldChangedMessagePayload.builder().value("value") },
                new Object[] { OrderCustomFieldChangedMessagePayload.builder().previousValue("previousValue") } };
    }

    @Test
    public void name() {
        OrderCustomFieldChangedMessagePayload value = OrderCustomFieldChangedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        OrderCustomFieldChangedMessagePayload value = OrderCustomFieldChangedMessagePayload.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void previousValue() {
        OrderCustomFieldChangedMessagePayload value = OrderCustomFieldChangedMessagePayload.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }
}
