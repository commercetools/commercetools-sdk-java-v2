
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AddOrderLineItemChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AddOrderLineItemChangeBuilder builder) {
        AddOrderLineItemChange addOrderLineItemChange = builder.buildUnchecked();
        Assertions.assertThat(addOrderLineItemChange).isInstanceOf(AddOrderLineItemChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", AddOrderLineItemChange.builder().change("change") },
                new Object[] { "previousValue",
                        AddOrderLineItemChange.builder()
                                .previousValue(new com.commercetools.history.models.common.LineItemImpl()) },
                new Object[] { "nextValue", AddOrderLineItemChange.builder()
                        .nextValue(new com.commercetools.history.models.common.LineItemImpl()) } };
    }

    @Test
    public void change() {
        AddOrderLineItemChange value = AddOrderLineItemChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        AddOrderLineItemChange value = AddOrderLineItemChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.LineItemImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.LineItemImpl());
    }

    @Test
    public void nextValue() {
        AddOrderLineItemChange value = AddOrderLineItemChange.of();
        value.setNextValue(new com.commercetools.history.models.common.LineItemImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.LineItemImpl());
    }
}
