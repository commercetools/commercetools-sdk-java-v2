
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveProductSelectionChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RemoveProductSelectionChangeBuilder builder) {
        RemoveProductSelectionChange removeProductSelectionChange = builder.buildUnchecked();
        Assertions.assertThat(removeProductSelectionChange).isInstanceOf(RemoveProductSelectionChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", RemoveProductSelectionChange.builder().change("change") },
                new Object[] { "previousValue", RemoveProductSelectionChange.builder()
                        .previousValue(new com.commercetools.history.models.common.ProductSelectionSettingImpl()) } };
    }

    @Test
    public void change() {
        RemoveProductSelectionChange value = RemoveProductSelectionChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveProductSelectionChange value = RemoveProductSelectionChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.ProductSelectionSettingImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.ProductSelectionSettingImpl());
    }
}
