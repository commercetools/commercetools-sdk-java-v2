
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
public class OrderEditAppliedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderEditAppliedMessageBuilder builder) {
        OrderEditAppliedMessage orderEditAppliedMessage = builder.buildUnchecked();
        Assertions.assertThat(orderEditAppliedMessage).isInstanceOf(OrderEditAppliedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderEditAppliedMessage.builder()
                        .edit(new com.commercetools.api.models.order_edit.OrderEditImpl()) },
                new Object[] { OrderEditAppliedMessage.builder()
                        .result(new com.commercetools.api.models.order_edit.OrderEditAppliedImpl()) } };
    }

    @Test
    public void edit() {
        OrderEditAppliedMessage value = OrderEditAppliedMessage.of();
        value.setEdit(new com.commercetools.api.models.order_edit.OrderEditImpl());
        Assertions.assertThat(value.getEdit()).isEqualTo(new com.commercetools.api.models.order_edit.OrderEditImpl());
    }

    @Test
    public void result() {
        OrderEditAppliedMessage value = OrderEditAppliedMessage.of();
        value.setResult(new com.commercetools.api.models.order_edit.OrderEditAppliedImpl());
        Assertions.assertThat(value.getResult())
                .isEqualTo(new com.commercetools.api.models.order_edit.OrderEditAppliedImpl());
    }
}
