
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeProductSelectionActiveChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeProductSelectionActiveChangeBuilder builder) {
        ChangeProductSelectionActiveChange changeProductSelectionActiveChange = builder.buildUnchecked();
        Assertions.assertThat(changeProductSelectionActiveChange)
                .isInstanceOf(ChangeProductSelectionActiveChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", ChangeProductSelectionActiveChange.builder().change("change") },
                new Object[] { "productSelection",
                        ChangeProductSelectionActiveChange.builder()
                                .productSelection(new com.commercetools.history.models.common.ReferenceImpl()) },
                new Object[] { "previousValue", ChangeProductSelectionActiveChange.builder().previousValue(true) },
                new Object[] { "nextValue", ChangeProductSelectionActiveChange.builder().nextValue(true) } };
    }

    @Test
    public void change() {
        ChangeProductSelectionActiveChange value = ChangeProductSelectionActiveChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void productSelection() {
        ChangeProductSelectionActiveChange value = ChangeProductSelectionActiveChange.of();
        value.setProductSelection(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getProductSelection())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }

    @Test
    public void previousValue() {
        ChangeProductSelectionActiveChange value = ChangeProductSelectionActiveChange.of();
        value.setPreviousValue(true);
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(true);
    }

    @Test
    public void nextValue() {
        ChangeProductSelectionActiveChange value = ChangeProductSelectionActiveChange.of();
        value.setNextValue(true);
        Assertions.assertThat(value.getNextValue()).isEqualTo(true);
    }
}
