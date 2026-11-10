
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSetParcelCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSetParcelCustomFieldActionBuilder builder) {
        OrderSetParcelCustomFieldAction orderSetParcelCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetParcelCustomFieldAction).isInstanceOf(OrderSetParcelCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "parcelId", OrderSetParcelCustomFieldAction.builder().parcelId("parcelId") },
                new Object[] { "parcelKey", OrderSetParcelCustomFieldAction.builder().parcelKey("parcelKey") },
                new Object[] { "name", OrderSetParcelCustomFieldAction.builder().name("name") },
                new Object[] { "value", OrderSetParcelCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void parcelId() {
        OrderSetParcelCustomFieldAction value = OrderSetParcelCustomFieldAction.of();
        value.setParcelId("parcelId");
        Assertions.assertThat(value.getParcelId()).isEqualTo("parcelId");
    }

    @Test
    public void parcelKey() {
        OrderSetParcelCustomFieldAction value = OrderSetParcelCustomFieldAction.of();
        value.setParcelKey("parcelKey");
        Assertions.assertThat(value.getParcelKey()).isEqualTo("parcelKey");
    }

    @Test
    public void name() {
        OrderSetParcelCustomFieldAction value = OrderSetParcelCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        OrderSetParcelCustomFieldAction value = OrderSetParcelCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
