
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSetParcelCustomTypeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSetParcelCustomTypeActionBuilder builder) {
        OrderSetParcelCustomTypeAction orderSetParcelCustomTypeAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetParcelCustomTypeAction).isInstanceOf(OrderSetParcelCustomTypeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "parcelId", OrderSetParcelCustomTypeAction.builder().parcelId("parcelId") },
                new Object[] { "parcelKey", OrderSetParcelCustomTypeAction.builder().parcelKey("parcelKey") },
                new Object[] { "type",
                        OrderSetParcelCustomTypeAction.builder()
                                .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { "fields", OrderSetParcelCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void parcelId() {
        OrderSetParcelCustomTypeAction value = OrderSetParcelCustomTypeAction.of();
        value.setParcelId("parcelId");
        Assertions.assertThat(value.getParcelId()).isEqualTo("parcelId");
    }

    @Test
    public void parcelKey() {
        OrderSetParcelCustomTypeAction value = OrderSetParcelCustomTypeAction.of();
        value.setParcelKey("parcelKey");
        Assertions.assertThat(value.getParcelKey()).isEqualTo("parcelKey");
    }

    @Test
    public void type() {
        OrderSetParcelCustomTypeAction value = OrderSetParcelCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        OrderSetParcelCustomTypeAction value = OrderSetParcelCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
