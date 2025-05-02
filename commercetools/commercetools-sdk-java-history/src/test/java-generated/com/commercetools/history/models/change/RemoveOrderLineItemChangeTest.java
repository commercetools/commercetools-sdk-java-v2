
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveOrderLineItemChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RemoveOrderLineItemChangeBuilder builder) {
        RemoveOrderLineItemChange removeOrderLineItemChange = builder.buildUnchecked();
        Assertions.assertThat(removeOrderLineItemChange).isInstanceOf(RemoveOrderLineItemChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", RemoveOrderLineItemChange.builder().change("change") },
                new Object[] { "previousValue",
                        RemoveOrderLineItemChange.builder()
                                .previousValue(new com.commercetools.history.models.common.LineItemImpl()) },
                new Object[] { "nextValue", RemoveOrderLineItemChange.builder()
                        .nextValue(new com.commercetools.history.models.common.LineItemImpl()) } };
    }

    @Test
    public void change() {
        RemoveOrderLineItemChange value = RemoveOrderLineItemChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveOrderLineItemChange value = RemoveOrderLineItemChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.LineItemImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.LineItemImpl());
    }

    @Test
    public void nextValue() {
        RemoveOrderLineItemChange value = RemoveOrderLineItemChange.of();
        value.setNextValue(new com.commercetools.history.models.common.LineItemImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.LineItemImpl());
    }
}
