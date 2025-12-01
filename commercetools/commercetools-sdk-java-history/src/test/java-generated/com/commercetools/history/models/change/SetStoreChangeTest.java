
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetStoreChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetStoreChangeBuilder builder) {
        SetStoreChange setStoreChange = builder.buildUnchecked();
        Assertions.assertThat(setStoreChange).isInstanceOf(SetStoreChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetStoreChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetStoreChange.builder()
                                .previousValue(new com.commercetools.history.models.common.KeyReferenceImpl()) },
                new Object[] { "nextValue", SetStoreChange.builder()
                        .nextValue(new com.commercetools.history.models.common.KeyReferenceImpl()) } };
    }

    @Test
    public void change() {
        SetStoreChange value = SetStoreChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetStoreChange value = SetStoreChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.KeyReferenceImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.KeyReferenceImpl());
    }

    @Test
    public void nextValue() {
        SetStoreChange value = SetStoreChange.of();
        value.setNextValue(new com.commercetools.history.models.common.KeyReferenceImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.KeyReferenceImpl());
    }
}
