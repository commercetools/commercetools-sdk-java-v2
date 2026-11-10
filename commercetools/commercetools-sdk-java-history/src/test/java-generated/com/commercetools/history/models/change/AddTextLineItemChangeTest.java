
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AddTextLineItemChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AddTextLineItemChangeBuilder builder) {
        AddTextLineItemChange addTextLineItemChange = builder.buildUnchecked();
        Assertions.assertThat(addTextLineItemChange).isInstanceOf(AddTextLineItemChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", AddTextLineItemChange.builder().change("change") },
                new Object[] { "nextValue", AddTextLineItemChange.builder()
                        .nextValue(new com.commercetools.history.models.common.TextLineItemImpl()) } };
    }

    @Test
    public void change() {
        AddTextLineItemChange value = AddTextLineItemChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void nextValue() {
        AddTextLineItemChange value = AddTextLineItemChange.of();
        value.setNextValue(new com.commercetools.history.models.common.TextLineItemImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.TextLineItemImpl());
    }
}
