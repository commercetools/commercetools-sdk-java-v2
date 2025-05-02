
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetCategoryOrderHintChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetCategoryOrderHintChangeBuilder builder) {
        SetCategoryOrderHintChange setCategoryOrderHintChange = builder.buildUnchecked();
        Assertions.assertThat(setCategoryOrderHintChange).isInstanceOf(SetCategoryOrderHintChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetCategoryOrderHintChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetCategoryOrderHintChange.builder()
                                .previousValue(new com.commercetools.history.models.common.CategoryOrderHintsImpl()) },
                new Object[] { "nextValue",
                        SetCategoryOrderHintChange.builder()
                                .nextValue(new com.commercetools.history.models.common.CategoryOrderHintsImpl()) },
                new Object[] { "catalogData", SetCategoryOrderHintChange.builder().catalogData("catalogData") },
                new Object[] { "categoryId", SetCategoryOrderHintChange.builder().categoryId("categoryId") } };
    }

    @Test
    public void change() {
        SetCategoryOrderHintChange value = SetCategoryOrderHintChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetCategoryOrderHintChange value = SetCategoryOrderHintChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.CategoryOrderHintsImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.CategoryOrderHintsImpl());
    }

    @Test
    public void nextValue() {
        SetCategoryOrderHintChange value = SetCategoryOrderHintChange.of();
        value.setNextValue(new com.commercetools.history.models.common.CategoryOrderHintsImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.CategoryOrderHintsImpl());
    }

    @Test
    public void catalogData() {
        SetCategoryOrderHintChange value = SetCategoryOrderHintChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }

    @Test
    public void categoryId() {
        SetCategoryOrderHintChange value = SetCategoryOrderHintChange.of();
        value.setCategoryId("categoryId");
        Assertions.assertThat(value.getCategoryId()).isEqualTo("categoryId");
    }
}
