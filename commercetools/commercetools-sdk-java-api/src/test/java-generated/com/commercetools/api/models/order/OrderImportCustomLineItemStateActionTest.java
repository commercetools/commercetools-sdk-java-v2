
package com.commercetools.api.models.order;

import java.util.Collections;

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
public class OrderImportCustomLineItemStateActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderImportCustomLineItemStateActionBuilder builder) {
        OrderImportCustomLineItemStateAction orderImportCustomLineItemStateAction = builder.buildUnchecked();
        Assertions.assertThat(orderImportCustomLineItemStateAction)
                .isInstanceOf(OrderImportCustomLineItemStateAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderImportCustomLineItemStateAction.builder().customLineItemId("customLineItemId") },
                new Object[] { OrderImportCustomLineItemStateAction.builder().customLineItemKey("customLineItemKey") },
                new Object[] { OrderImportCustomLineItemStateAction.builder()
                        .state(Collections.singletonList(new com.commercetools.api.models.order.ItemStateImpl())) } };
    }

    @Test
    public void customLineItemId() {
        OrderImportCustomLineItemStateAction value = OrderImportCustomLineItemStateAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        OrderImportCustomLineItemStateAction value = OrderImportCustomLineItemStateAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void state() {
        OrderImportCustomLineItemStateAction value = OrderImportCustomLineItemStateAction.of();
        value.setState(Collections.singletonList(new com.commercetools.api.models.order.ItemStateImpl()));
        Assertions.assertThat(value.getState())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.ItemStateImpl()));
    }
}
