
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
public class OrderImportLineItemStateActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderImportLineItemStateActionBuilder builder) {
        OrderImportLineItemStateAction orderImportLineItemStateAction = builder.buildUnchecked();
        Assertions.assertThat(orderImportLineItemStateAction).isInstanceOf(OrderImportLineItemStateAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderImportLineItemStateAction.builder().lineItemId("lineItemId") },
                new Object[] { OrderImportLineItemStateAction.builder().lineItemKey("lineItemKey") },
                new Object[] { OrderImportLineItemStateAction.builder()
                        .state(Collections.singletonList(new com.commercetools.api.models.order.ItemStateImpl())) } };
    }

    @Test
    public void lineItemId() {
        OrderImportLineItemStateAction value = OrderImportLineItemStateAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        OrderImportLineItemStateAction value = OrderImportLineItemStateAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void state() {
        OrderImportLineItemStateAction value = OrderImportLineItemStateAction.of();
        value.setState(Collections.singletonList(new com.commercetools.api.models.order.ItemStateImpl()));
        Assertions.assertThat(value.getState())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.ItemStateImpl()));
    }
}
