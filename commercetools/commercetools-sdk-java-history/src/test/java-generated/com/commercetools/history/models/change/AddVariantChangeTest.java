
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AddVariantChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AddVariantChangeBuilder builder) {
        AddVariantChange addVariantChange = builder.buildUnchecked();
        Assertions.assertThat(addVariantChange).isInstanceOf(AddVariantChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", AddVariantChange.builder().change("change") },
                new Object[] { "previousValue",
                        AddVariantChange.builder()
                                .previousValue(new com.commercetools.history.models.common.VariantImpl()) },
                new Object[] { "nextValue",
                        AddVariantChange.builder()
                                .nextValue(new com.commercetools.history.models.common.VariantImpl()) },
                new Object[] { "catalogData", AddVariantChange.builder().catalogData("catalogData") } };
    }

    @Test
    public void change() {
        AddVariantChange value = AddVariantChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        AddVariantChange value = AddVariantChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.VariantImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.VariantImpl());
    }

    @Test
    public void nextValue() {
        AddVariantChange value = AddVariantChange.of();
        value.setNextValue(new com.commercetools.history.models.common.VariantImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.VariantImpl());
    }

    @Test
    public void catalogData() {
        AddVariantChange value = AddVariantChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }
}
