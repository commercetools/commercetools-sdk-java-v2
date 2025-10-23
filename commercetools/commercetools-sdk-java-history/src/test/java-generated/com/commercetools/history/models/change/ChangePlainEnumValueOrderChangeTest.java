
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangePlainEnumValueOrderChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangePlainEnumValueOrderChangeBuilder builder) {
        ChangePlainEnumValueOrderChange changePlainEnumValueOrderChange = builder.buildUnchecked();
        Assertions.assertThat(changePlainEnumValueOrderChange).isInstanceOf(ChangePlainEnumValueOrderChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangePlainEnumValueOrderChange.builder().change("change") },
                new Object[] { "previousValue",
                        ChangePlainEnumValueOrderChange.builder()
                                .previousValue(Collections.singletonList(
                                    new com.commercetools.history.models.common.AttributePlainEnumValueImpl())) },
                new Object[] { "nextValue",
                        ChangePlainEnumValueOrderChange.builder()
                                .nextValue(Collections.singletonList(
                                    new com.commercetools.history.models.common.AttributePlainEnumValueImpl())) },
                new Object[] { "attributeName",
                        ChangePlainEnumValueOrderChange.builder().attributeName("attributeName") } };
    }

    @Test
    public void change() {
        ChangePlainEnumValueOrderChange value = ChangePlainEnumValueOrderChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangePlainEnumValueOrderChange value = ChangePlainEnumValueOrderChange.of();
        value.setPreviousValue(
            Collections.singletonList(new com.commercetools.history.models.common.AttributePlainEnumValueImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.history.models.common.AttributePlainEnumValueImpl()));
    }

    @Test
    public void nextValue() {
        ChangePlainEnumValueOrderChange value = ChangePlainEnumValueOrderChange.of();
        value.setNextValue(
            Collections.singletonList(new com.commercetools.history.models.common.AttributePlainEnumValueImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.history.models.common.AttributePlainEnumValueImpl()));
    }

    @Test
    public void attributeName() {
        ChangePlainEnumValueOrderChange value = ChangePlainEnumValueOrderChange.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }
}
