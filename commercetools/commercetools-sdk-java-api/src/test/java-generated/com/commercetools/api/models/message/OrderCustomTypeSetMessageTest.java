
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
public class OrderCustomTypeSetMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderCustomTypeSetMessageBuilder builder) {
        OrderCustomTypeSetMessage orderCustomTypeSetMessage = builder.buildUnchecked();
        Assertions.assertThat(orderCustomTypeSetMessage).isInstanceOf(OrderCustomTypeSetMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderCustomTypeSetMessage.builder()
                        .customFields(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { OrderCustomTypeSetMessage.builder().previousTypeId("previousTypeId") } };
    }

    @Test
    public void customFields() {
        OrderCustomTypeSetMessage value = OrderCustomTypeSetMessage.of();
        value.setCustomFields(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustomFields())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void previousTypeId() {
        OrderCustomTypeSetMessage value = OrderCustomTypeSetMessage.of();
        value.setPreviousTypeId("previousTypeId");
        Assertions.assertThat(value.getPreviousTypeId()).isEqualTo("previousTypeId");
    }
}
