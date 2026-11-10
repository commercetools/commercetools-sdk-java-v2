
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RemovePropertyChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RemovePropertyChangeBuilder builder) {
        RemovePropertyChange removePropertyChange = builder.buildUnchecked();
        Assertions.assertThat(removePropertyChange).isInstanceOf(RemovePropertyChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", RemovePropertyChange.builder().change("change") },
                new Object[] { "previousValue", RemovePropertyChange.builder().previousValue("previousValue") },
                new Object[] { "path", RemovePropertyChange.builder().path("path") } };
    }

    @Test
    public void change() {
        RemovePropertyChange value = RemovePropertyChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemovePropertyChange value = RemovePropertyChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void path() {
        RemovePropertyChange value = RemovePropertyChange.of();
        value.setPath("path");
        Assertions.assertThat(value.getPath()).isEqualTo("path");
    }
}
