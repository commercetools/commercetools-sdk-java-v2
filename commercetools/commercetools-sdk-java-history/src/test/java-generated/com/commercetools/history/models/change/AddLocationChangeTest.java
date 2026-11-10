
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AddLocationChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AddLocationChangeBuilder builder) {
        AddLocationChange addLocationChange = builder.buildUnchecked();
        Assertions.assertThat(addLocationChange).isInstanceOf(AddLocationChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", AddLocationChange.builder().change("change") }, new Object[] {
                "nextValue",
                AddLocationChange.builder().nextValue(new com.commercetools.history.models.common.LocationImpl()) } };
    }

    @Test
    public void change() {
        AddLocationChange value = AddLocationChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void nextValue() {
        AddLocationChange value = AddLocationChange.of();
        value.setNextValue(new com.commercetools.history.models.common.LocationImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.LocationImpl());
    }
}
