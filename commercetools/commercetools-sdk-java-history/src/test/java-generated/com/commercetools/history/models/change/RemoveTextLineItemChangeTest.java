
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveTextLineItemChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RemoveTextLineItemChangeBuilder builder) {
        RemoveTextLineItemChange removeTextLineItemChange = builder.buildUnchecked();
        Assertions.assertThat(removeTextLineItemChange).isInstanceOf(RemoveTextLineItemChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", RemoveTextLineItemChange.builder().change("change") },
                new Object[] { "previousValue",
                        RemoveTextLineItemChange.builder()
                                .previousValue(new com.commercetools.history.models.common.TextLineItemImpl()) },
                new Object[] { "nextValue", RemoveTextLineItemChange.builder()
                        .nextValue(new com.commercetools.history.models.common.TextLineItemImpl()) } };
    }

    @Test
    public void change() {
        RemoveTextLineItemChange value = RemoveTextLineItemChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveTextLineItemChange value = RemoveTextLineItemChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.TextLineItemImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.TextLineItemImpl());
    }

    @Test
    public void nextValue() {
        RemoveTextLineItemChange value = RemoveTextLineItemChange.of();
        value.setNextValue(new com.commercetools.history.models.common.TextLineItemImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.TextLineItemImpl());
    }
}
