
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeParentUnitChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeParentUnitChangeBuilder builder) {
        ChangeParentUnitChange changeParentUnitChange = builder.buildUnchecked();
        Assertions.assertThat(changeParentUnitChange).isInstanceOf(ChangeParentUnitChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeParentUnitChange.builder().change("change") },
                new Object[] { "previousValue",
                        ChangeParentUnitChange.builder()
                                .previousValue(new com.commercetools.history.models.common.KeyReferenceImpl()) },
                new Object[] { "nextValue", ChangeParentUnitChange.builder()
                        .nextValue(new com.commercetools.history.models.common.KeyReferenceImpl()) } };
    }

    @Test
    public void change() {
        ChangeParentUnitChange value = ChangeParentUnitChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeParentUnitChange value = ChangeParentUnitChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.KeyReferenceImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.KeyReferenceImpl());
    }

    @Test
    public void nextValue() {
        ChangeParentUnitChange value = ChangeParentUnitChange.of();
        value.setNextValue(new com.commercetools.history.models.common.KeyReferenceImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.KeyReferenceImpl());
    }
}
