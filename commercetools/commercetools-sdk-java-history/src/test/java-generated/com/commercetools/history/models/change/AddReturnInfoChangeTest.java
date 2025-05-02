
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AddReturnInfoChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AddReturnInfoChangeBuilder builder) {
        AddReturnInfoChange addReturnInfoChange = builder.buildUnchecked();
        Assertions.assertThat(addReturnInfoChange).isInstanceOf(AddReturnInfoChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", AddReturnInfoChange.builder().change("change") },
                new Object[] { "nextValue", AddReturnInfoChange.builder()
                        .nextValue(new com.commercetools.history.models.common.ReturnInfoImpl()) } };
    }

    @Test
    public void change() {
        AddReturnInfoChange value = AddReturnInfoChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void nextValue() {
        AddReturnInfoChange value = AddReturnInfoChange.of();
        value.setNextValue(new com.commercetools.history.models.common.ReturnInfoImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.ReturnInfoImpl());
    }
}
