
package com.commercetools.api.models.order_edit;

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
public class OrderEditReferenceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderEditReferenceBuilder builder) {
        OrderEditReference orderEditReference = builder.buildUnchecked();
        Assertions.assertThat(orderEditReference).isInstanceOf(OrderEditReference.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        OrderEditReference.builder().obj(new com.commercetools.api.models.order_edit.OrderEditImpl()) },
                new Object[] { OrderEditReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        OrderEditReference value = OrderEditReference.of();
        value.setObj(new com.commercetools.api.models.order_edit.OrderEditImpl());
        Assertions.assertThat(value.getObj()).isEqualTo(new com.commercetools.api.models.order_edit.OrderEditImpl());
    }

    @Test
    public void id() {
        OrderEditReference value = OrderEditReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
