
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetReturnInfoChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetReturnInfoChangeBuilder builder) {
        SetReturnInfoChange setReturnInfoChange = builder.buildUnchecked();
        Assertions.assertThat(setReturnInfoChange).isInstanceOf(SetReturnInfoChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetReturnInfoChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetReturnInfoChange.builder()
                                .previousValue(new com.commercetools.history.models.common.ReturnInfoImpl()) },
                new Object[] { "nextValue", SetReturnInfoChange.builder()
                        .nextValue(new com.commercetools.history.models.common.ReturnInfoImpl()) } };
    }

    @Test
    public void change() {
        SetReturnInfoChange value = SetReturnInfoChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetReturnInfoChange value = SetReturnInfoChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.ReturnInfoImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.ReturnInfoImpl());
    }

    @Test
    public void nextValue() {
        SetReturnInfoChange value = SetReturnInfoChange.of();
        value.setNextValue(new com.commercetools.history.models.common.ReturnInfoImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.ReturnInfoImpl());
    }
}
