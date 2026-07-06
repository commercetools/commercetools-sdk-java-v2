
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AddInterfaceInteractionChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AddInterfaceInteractionChangeBuilder builder) {
        AddInterfaceInteractionChange addInterfaceInteractionChange = builder.buildUnchecked();
        Assertions.assertThat(addInterfaceInteractionChange).isInstanceOf(AddInterfaceInteractionChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", AddInterfaceInteractionChange.builder().change("change") },
                new Object[] { "nextValue", AddInterfaceInteractionChange.builder()
                        .nextValue(new com.commercetools.history.models.common.CustomFieldsImpl()) } };
    }

    @Test
    public void change() {
        AddInterfaceInteractionChange value = AddInterfaceInteractionChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void nextValue() {
        AddInterfaceInteractionChange value = AddInterfaceInteractionChange.of();
        value.setNextValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }
}
