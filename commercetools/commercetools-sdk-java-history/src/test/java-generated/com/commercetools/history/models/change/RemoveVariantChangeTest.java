
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveVariantChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RemoveVariantChangeBuilder builder) {
        RemoveVariantChange removeVariantChange = builder.buildUnchecked();
        Assertions.assertThat(removeVariantChange).isInstanceOf(RemoveVariantChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", RemoveVariantChange.builder().change("change") },
                new Object[] { "previousValue",
                        RemoveVariantChange.builder()
                                .previousValue(new com.commercetools.history.models.common.VariantImpl()) },
                new Object[] { "nextValue",
                        RemoveVariantChange.builder()
                                .nextValue(new com.commercetools.history.models.common.VariantImpl()) },
                new Object[] { "catalogData", RemoveVariantChange.builder().catalogData("catalogData") } };
    }

    @Test
    public void change() {
        RemoveVariantChange value = RemoveVariantChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveVariantChange value = RemoveVariantChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.VariantImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.VariantImpl());
    }

    @Test
    public void nextValue() {
        RemoveVariantChange value = RemoveVariantChange.of();
        value.setNextValue(new com.commercetools.history.models.common.VariantImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.VariantImpl());
    }

    @Test
    public void catalogData() {
        RemoveVariantChange value = RemoveVariantChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }
}
