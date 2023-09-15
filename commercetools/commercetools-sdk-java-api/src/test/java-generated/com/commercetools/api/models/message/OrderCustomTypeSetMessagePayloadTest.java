
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
public class OrderCustomTypeSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderCustomTypeSetMessagePayloadBuilder builder) {
        OrderCustomTypeSetMessagePayload orderCustomTypeSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderCustomTypeSetMessagePayload).isInstanceOf(OrderCustomTypeSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderCustomTypeSetMessagePayload.builder()
                        .customFields(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { OrderCustomTypeSetMessagePayload.builder().previousTypeId("previousTypeId") } };
    }

    @Test
    public void customFields() {
        OrderCustomTypeSetMessagePayload value = OrderCustomTypeSetMessagePayload.of();
        value.setCustomFields(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustomFields())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void previousTypeId() {
        OrderCustomTypeSetMessagePayload value = OrderCustomTypeSetMessagePayload.of();
        value.setPreviousTypeId("previousTypeId");
        Assertions.assertThat(value.getPreviousTypeId()).isEqualTo("previousTypeId");
    }
}
