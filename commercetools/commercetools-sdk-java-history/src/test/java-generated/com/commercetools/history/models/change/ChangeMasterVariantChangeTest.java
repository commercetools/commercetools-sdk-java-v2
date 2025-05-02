
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeMasterVariantChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeMasterVariantChangeBuilder builder) {
        ChangeMasterVariantChange changeMasterVariantChange = builder.buildUnchecked();
        Assertions.assertThat(changeMasterVariantChange).isInstanceOf(ChangeMasterVariantChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeMasterVariantChange.builder().change("change") },
                new Object[] { "previousValue",
                        ChangeMasterVariantChange.builder()
                                .previousValue(new com.commercetools.history.models.common.VariantImpl()) },
                new Object[] { "nextValue",
                        ChangeMasterVariantChange.builder()
                                .nextValue(new com.commercetools.history.models.common.VariantImpl()) },
                new Object[] { "catalogData", ChangeMasterVariantChange.builder().catalogData("catalogData") } };
    }

    @Test
    public void change() {
        ChangeMasterVariantChange value = ChangeMasterVariantChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeMasterVariantChange value = ChangeMasterVariantChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.VariantImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.VariantImpl());
    }

    @Test
    public void nextValue() {
        ChangeMasterVariantChange value = ChangeMasterVariantChange.of();
        value.setNextValue(new com.commercetools.history.models.common.VariantImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.VariantImpl());
    }

    @Test
    public void catalogData() {
        ChangeMasterVariantChange value = ChangeMasterVariantChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }
}
