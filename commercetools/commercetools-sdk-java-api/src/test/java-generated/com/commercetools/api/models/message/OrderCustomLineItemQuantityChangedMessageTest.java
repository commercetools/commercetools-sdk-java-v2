
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
public class OrderCustomLineItemQuantityChangedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderCustomLineItemQuantityChangedMessageBuilder builder) {
        OrderCustomLineItemQuantityChangedMessage orderCustomLineItemQuantityChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(orderCustomLineItemQuantityChangedMessage)
                .isInstanceOf(OrderCustomLineItemQuantityChangedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        OrderCustomLineItemQuantityChangedMessage.builder().customLineItemId("customLineItemId") },
                new Object[] {
                        OrderCustomLineItemQuantityChangedMessage.builder().customLineItemKey("customLineItemKey") },
                new Object[] { OrderCustomLineItemQuantityChangedMessage.builder().quantity(8L) },
                new Object[] { OrderCustomLineItemQuantityChangedMessage.builder().oldQuantity(2L) } };
    }

    @Test
    public void customLineItemId() {
        OrderCustomLineItemQuantityChangedMessage value = OrderCustomLineItemQuantityChangedMessage.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        OrderCustomLineItemQuantityChangedMessage value = OrderCustomLineItemQuantityChangedMessage.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void quantity() {
        OrderCustomLineItemQuantityChangedMessage value = OrderCustomLineItemQuantityChangedMessage.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void oldQuantity() {
        OrderCustomLineItemQuantityChangedMessage value = OrderCustomLineItemQuantityChangedMessage.of();
        value.setOldQuantity(2L);
        Assertions.assertThat(value.getOldQuantity()).isEqualTo(2L);
    }
}
