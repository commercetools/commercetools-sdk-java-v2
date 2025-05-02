
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AddPropertyChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AddPropertyChangeBuilder builder) {
        AddPropertyChange addPropertyChange = builder.buildUnchecked();
        Assertions.assertThat(addPropertyChange).isInstanceOf(AddPropertyChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", AddPropertyChange.builder().change("change") },
                new Object[] { "nextValue", AddPropertyChange.builder().nextValue("nextValue") },
                new Object[] { "path", AddPropertyChange.builder().path("path") } };
    }

    @Test
    public void change() {
        AddPropertyChange value = AddPropertyChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void nextValue() {
        AddPropertyChange value = AddPropertyChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }

    @Test
    public void path() {
        AddPropertyChange value = AddPropertyChange.of();
        value.setPath("path");
        Assertions.assertThat(value.getPath()).isEqualTo("path");
    }
}
