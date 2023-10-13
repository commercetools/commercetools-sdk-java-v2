
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
public class OrderCustomFieldRemovedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderCustomFieldRemovedMessagePayloadBuilder builder) {
        OrderCustomFieldRemovedMessagePayload orderCustomFieldRemovedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderCustomFieldRemovedMessagePayload)
                .isInstanceOf(OrderCustomFieldRemovedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderCustomFieldRemovedMessagePayload.builder().name("name") } };
    }

    @Test
    public void name() {
        OrderCustomFieldRemovedMessagePayload value = OrderCustomFieldRemovedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
