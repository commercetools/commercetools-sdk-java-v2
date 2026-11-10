
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveCustomLineItemChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RemoveCustomLineItemChangeBuilder builder) {
        RemoveCustomLineItemChange removeCustomLineItemChange = builder.buildUnchecked();
        Assertions.assertThat(removeCustomLineItemChange).isInstanceOf(RemoveCustomLineItemChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", RemoveCustomLineItemChange.builder().change("change") },
                new Object[] { "previousValue",
                        RemoveCustomLineItemChange.builder()
                                .previousValue(new com.commercetools.history.models.common.CustomLineItemImpl()) },
                new Object[] { "nextValue", RemoveCustomLineItemChange.builder()
                        .nextValue(new com.commercetools.history.models.common.CustomLineItemImpl()) } };
    }

    @Test
    public void change() {
        RemoveCustomLineItemChange value = RemoveCustomLineItemChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveCustomLineItemChange value = RemoveCustomLineItemChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.CustomLineItemImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomLineItemImpl());
    }

    @Test
    public void nextValue() {
        RemoveCustomLineItemChange value = RemoveCustomLineItemChange.of();
        value.setNextValue(new com.commercetools.history.models.common.CustomLineItemImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomLineItemImpl());
    }
}
