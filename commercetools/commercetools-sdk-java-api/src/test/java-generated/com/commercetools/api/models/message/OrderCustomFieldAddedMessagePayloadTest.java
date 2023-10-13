
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
public class OrderCustomFieldAddedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderCustomFieldAddedMessagePayloadBuilder builder) {
        OrderCustomFieldAddedMessagePayload orderCustomFieldAddedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderCustomFieldAddedMessagePayload)
                .isInstanceOf(OrderCustomFieldAddedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderCustomFieldAddedMessagePayload.builder().name("name") },
                new Object[] { OrderCustomFieldAddedMessagePayload.builder().value("value") } };
    }

    @Test
    public void name() {
        OrderCustomFieldAddedMessagePayload value = OrderCustomFieldAddedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        OrderCustomFieldAddedMessagePayload value = OrderCustomFieldAddedMessagePayload.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
