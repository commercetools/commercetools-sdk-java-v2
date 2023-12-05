
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
public class OrderSetReturnItemCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderSetReturnItemCustomFieldActionBuilder builder) {
        OrderSetReturnItemCustomFieldAction orderSetReturnItemCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetReturnItemCustomFieldAction)
                .isInstanceOf(OrderSetReturnItemCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderSetReturnItemCustomFieldAction.builder().returnItemId("returnItemId") },
                new Object[] { OrderSetReturnItemCustomFieldAction.builder().returnItemKey("returnItemKey") },
                new Object[] { OrderSetReturnItemCustomFieldAction.builder().name("name") },
                new Object[] { OrderSetReturnItemCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void returnItemId() {
        OrderSetReturnItemCustomFieldAction value = OrderSetReturnItemCustomFieldAction.of();
        value.setReturnItemId("returnItemId");
        Assertions.assertThat(value.getReturnItemId()).isEqualTo("returnItemId");
    }

    @Test
    public void returnItemKey() {
        OrderSetReturnItemCustomFieldAction value = OrderSetReturnItemCustomFieldAction.of();
        value.setReturnItemKey("returnItemKey");
        Assertions.assertThat(value.getReturnItemKey()).isEqualTo("returnItemKey");
    }

    @Test
    public void name() {
        OrderSetReturnItemCustomFieldAction value = OrderSetReturnItemCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        OrderSetReturnItemCustomFieldAction value = OrderSetReturnItemCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
