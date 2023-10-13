
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
public class OrderSetCustomLineItemCustomTypeActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderSetCustomLineItemCustomTypeActionBuilder builder) {
        OrderSetCustomLineItemCustomTypeAction orderSetCustomLineItemCustomTypeAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetCustomLineItemCustomTypeAction)
                .isInstanceOf(OrderSetCustomLineItemCustomTypeAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderSetCustomLineItemCustomTypeAction.builder().customLineItemId("customLineItemId") },
                new Object[] {
                        OrderSetCustomLineItemCustomTypeAction.builder().customLineItemKey("customLineItemKey") },
                new Object[] { OrderSetCustomLineItemCustomTypeAction.builder()
                        .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { OrderSetCustomLineItemCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void customLineItemId() {
        OrderSetCustomLineItemCustomTypeAction value = OrderSetCustomLineItemCustomTypeAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        OrderSetCustomLineItemCustomTypeAction value = OrderSetCustomLineItemCustomTypeAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void type() {
        OrderSetCustomLineItemCustomTypeAction value = OrderSetCustomLineItemCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        OrderSetCustomLineItemCustomTypeAction value = OrderSetCustomLineItemCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
