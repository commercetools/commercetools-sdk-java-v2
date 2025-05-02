
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeTextLineItemsOrderChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeTextLineItemsOrderChangeBuilder builder) {
        ChangeTextLineItemsOrderChange changeTextLineItemsOrderChange = builder.buildUnchecked();
        Assertions.assertThat(changeTextLineItemsOrderChange).isInstanceOf(ChangeTextLineItemsOrderChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeTextLineItemsOrderChange.builder().change("change") },
                new Object[] { "previousValue",
                        ChangeTextLineItemsOrderChange.builder()
                                .previousValue(Collections.singletonList(
                                    new com.commercetools.history.models.change_value.TextLineItemValueImpl())) },
                new Object[] { "nextValue",
                        ChangeTextLineItemsOrderChange.builder()
                                .nextValue(Collections.singletonList(
                                    new com.commercetools.history.models.change_value.TextLineItemValueImpl())) } };
    }

    @Test
    public void change() {
        ChangeTextLineItemsOrderChange value = ChangeTextLineItemsOrderChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeTextLineItemsOrderChange value = ChangeTextLineItemsOrderChange.of();
        value.setPreviousValue(
            Collections.singletonList(new com.commercetools.history.models.change_value.TextLineItemValueImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.history.models.change_value.TextLineItemValueImpl()));
    }

    @Test
    public void nextValue() {
        ChangeTextLineItemsOrderChange value = ChangeTextLineItemsOrderChange.of();
        value.setNextValue(
            Collections.singletonList(new com.commercetools.history.models.change_value.TextLineItemValueImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.history.models.change_value.TextLineItemValueImpl()));
    }
}
