
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeAttributeOrderByNameChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeAttributeOrderByNameChangeBuilder builder) {
        ChangeAttributeOrderByNameChange changeAttributeOrderByNameChange = builder.buildUnchecked();
        Assertions.assertThat(changeAttributeOrderByNameChange).isInstanceOf(ChangeAttributeOrderByNameChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeAttributeOrderByNameChange.builder().change("change") },
                new Object[] { "previousValue",
                        ChangeAttributeOrderByNameChange.builder()
                                .previousValue(Collections.singletonList("previousValue")) },
                new Object[] { "nextValue", ChangeAttributeOrderByNameChange.builder()
                        .nextValue(Collections.singletonList("nextValue")) } };
    }

    @Test
    public void change() {
        ChangeAttributeOrderByNameChange value = ChangeAttributeOrderByNameChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeAttributeOrderByNameChange value = ChangeAttributeOrderByNameChange.of();
        value.setPreviousValue(Collections.singletonList("previousValue"));
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(Collections.singletonList("previousValue"));
    }

    @Test
    public void nextValue() {
        ChangeAttributeOrderByNameChange value = ChangeAttributeOrderByNameChange.of();
        value.setNextValue(Collections.singletonList("nextValue"));
        Assertions.assertThat(value.getNextValue()).isEqualTo(Collections.singletonList("nextValue"));
    }
}
