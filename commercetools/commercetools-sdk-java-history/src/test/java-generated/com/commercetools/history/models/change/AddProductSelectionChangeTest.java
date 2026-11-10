
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AddProductSelectionChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AddProductSelectionChangeBuilder builder) {
        AddProductSelectionChange addProductSelectionChange = builder.buildUnchecked();
        Assertions.assertThat(addProductSelectionChange).isInstanceOf(AddProductSelectionChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", AddProductSelectionChange.builder().change("change") },
                new Object[] { "previousValue", AddProductSelectionChange.builder()
                        .previousValue(new com.commercetools.history.models.common.ProductSelectionSettingImpl()) },
                new Object[] { "nextValue", AddProductSelectionChange.builder()
                        .nextValue(new com.commercetools.history.models.common.ProductSelectionSettingImpl()) } };
    }

    @Test
    public void change() {
        AddProductSelectionChange value = AddProductSelectionChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        AddProductSelectionChange value = AddProductSelectionChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.ProductSelectionSettingImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.ProductSelectionSettingImpl());
    }

    @Test
    public void nextValue() {
        AddProductSelectionChange value = AddProductSelectionChange.of();
        value.setNextValue(new com.commercetools.history.models.common.ProductSelectionSettingImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.ProductSelectionSettingImpl());
    }
}
