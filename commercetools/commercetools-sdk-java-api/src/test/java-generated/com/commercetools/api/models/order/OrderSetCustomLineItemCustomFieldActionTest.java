
package com.commercetools.api.models.order;

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
public class OrderSetCustomLineItemCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderSetCustomLineItemCustomFieldActionBuilder builder) {
        OrderSetCustomLineItemCustomFieldAction orderSetCustomLineItemCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetCustomLineItemCustomFieldAction)
                .isInstanceOf(OrderSetCustomLineItemCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderSetCustomLineItemCustomFieldAction.builder().customLineItemId("customLineItemId") },
                new Object[] {
                        OrderSetCustomLineItemCustomFieldAction.builder().customLineItemKey("customLineItemKey") },
                new Object[] { OrderSetCustomLineItemCustomFieldAction.builder().name("name") },
                new Object[] { OrderSetCustomLineItemCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void customLineItemId() {
        OrderSetCustomLineItemCustomFieldAction value = OrderSetCustomLineItemCustomFieldAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        OrderSetCustomLineItemCustomFieldAction value = OrderSetCustomLineItemCustomFieldAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void name() {
        OrderSetCustomLineItemCustomFieldAction value = OrderSetCustomLineItemCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        OrderSetCustomLineItemCustomFieldAction value = OrderSetCustomLineItemCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
