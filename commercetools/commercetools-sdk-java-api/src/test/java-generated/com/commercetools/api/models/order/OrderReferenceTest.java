
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
public class OrderReferenceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderReferenceBuilder builder) {
        OrderReference orderReference = builder.buildUnchecked();
        Assertions.assertThat(orderReference).isInstanceOf(OrderReference.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderReference.builder().obj(new com.commercetools.api.models.order.OrderImpl()) },
                new Object[] { OrderReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        OrderReference value = OrderReference.of();
        value.setObj(new com.commercetools.api.models.order.OrderImpl());
        Assertions.assertThat(value.getObj()).isEqualTo(new com.commercetools.api.models.order.OrderImpl());
    }

    @Test
    public void id() {
        OrderReference value = OrderReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
