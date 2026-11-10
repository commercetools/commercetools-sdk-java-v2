
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AddCustomLineItemChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AddCustomLineItemChangeBuilder builder) {
        AddCustomLineItemChange addCustomLineItemChange = builder.buildUnchecked();
        Assertions.assertThat(addCustomLineItemChange).isInstanceOf(AddCustomLineItemChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", AddCustomLineItemChange.builder().change("change") },
                new Object[] { "previousValue",
                        AddCustomLineItemChange.builder()
                                .previousValue(new com.commercetools.history.models.common.CustomLineItemImpl()) },
                new Object[] { "nextValue", AddCustomLineItemChange.builder()
                        .nextValue(new com.commercetools.history.models.common.CustomLineItemImpl()) } };
    }

    @Test
    public void change() {
        AddCustomLineItemChange value = AddCustomLineItemChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        AddCustomLineItemChange value = AddCustomLineItemChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.CustomLineItemImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomLineItemImpl());
    }

    @Test
    public void nextValue() {
        AddCustomLineItemChange value = AddCustomLineItemChange.of();
        value.setNextValue(new com.commercetools.history.models.common.CustomLineItemImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomLineItemImpl());
    }
}
