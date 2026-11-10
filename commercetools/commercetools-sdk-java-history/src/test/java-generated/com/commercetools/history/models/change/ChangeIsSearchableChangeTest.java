
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeIsSearchableChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeIsSearchableChangeBuilder builder) {
        ChangeIsSearchableChange changeIsSearchableChange = builder.buildUnchecked();
        Assertions.assertThat(changeIsSearchableChange).isInstanceOf(ChangeIsSearchableChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeIsSearchableChange.builder().change("change") },
                new Object[] { "previousValue", ChangeIsSearchableChange.builder().previousValue(true) },
                new Object[] { "nextValue", ChangeIsSearchableChange.builder().nextValue(true) },
                new Object[] { "attributeName", ChangeIsSearchableChange.builder().attributeName("attributeName") } };
    }

    @Test
    public void change() {
        ChangeIsSearchableChange value = ChangeIsSearchableChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeIsSearchableChange value = ChangeIsSearchableChange.of();
        value.setPreviousValue(true);
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(true);
    }

    @Test
    public void nextValue() {
        ChangeIsSearchableChange value = ChangeIsSearchableChange.of();
        value.setNextValue(true);
        Assertions.assertThat(value.getNextValue()).isEqualTo(true);
    }

    @Test
    public void attributeName() {
        ChangeIsSearchableChange value = ChangeIsSearchableChange.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }
}
