
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeSavedToLineItemChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeSavedToLineItemChangeBuilder builder) {
        ChangeSavedToLineItemChange changeSavedToLineItemChange = builder.buildUnchecked();
        Assertions.assertThat(changeSavedToLineItemChange).isInstanceOf(ChangeSavedToLineItemChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeSavedToLineItemChange.builder().change("change") },
                new Object[] { "previousValue", ChangeSavedToLineItemChange.builder().previousValue(true) },
                new Object[] { "nextValue", ChangeSavedToLineItemChange.builder().nextValue(true) }, new Object[] {
                        "attributeName", ChangeSavedToLineItemChange.builder().attributeName("attributeName") } };
    }

    @Test
    public void change() {
        ChangeSavedToLineItemChange value = ChangeSavedToLineItemChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeSavedToLineItemChange value = ChangeSavedToLineItemChange.of();
        value.setPreviousValue(true);
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(true);
    }

    @Test
    public void nextValue() {
        ChangeSavedToLineItemChange value = ChangeSavedToLineItemChange.of();
        value.setNextValue(true);
        Assertions.assertThat(value.getNextValue()).isEqualTo(true);
    }

    @Test
    public void attributeName() {
        ChangeSavedToLineItemChange value = ChangeSavedToLineItemChange.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }
}
