
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeAssetOrderChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeAssetOrderChangeBuilder builder) {
        ChangeAssetOrderChange changeAssetOrderChange = builder.buildUnchecked();
        Assertions.assertThat(changeAssetOrderChange).isInstanceOf(ChangeAssetOrderChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeAssetOrderChange.builder().change("change") },
                new Object[] { "previousValue",
                        ChangeAssetOrderChange.builder()
                                .previousValue(Collections.singletonList(
                                    new com.commercetools.history.models.common.LocalizedStringImpl())) },
                new Object[] { "nextValue",
                        ChangeAssetOrderChange.builder()
                                .nextValue(Collections.singletonList(
                                    new com.commercetools.history.models.common.LocalizedStringImpl())) } };
    }

    @Test
    public void change() {
        ChangeAssetOrderChange value = ChangeAssetOrderChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeAssetOrderChange value = ChangeAssetOrderChange.of();
        value.setPreviousValue(
            Collections.singletonList(new com.commercetools.history.models.common.LocalizedStringImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.history.models.common.LocalizedStringImpl()));
    }

    @Test
    public void nextValue() {
        ChangeAssetOrderChange value = ChangeAssetOrderChange.of();
        value.setNextValue(
            Collections.singletonList(new com.commercetools.history.models.common.LocalizedStringImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.history.models.common.LocalizedStringImpl()));
    }
}
