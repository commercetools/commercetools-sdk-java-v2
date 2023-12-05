
package com.commercetools.history.models.change;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class SetCategoryOrderHintChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetCategoryOrderHintChangeBuilder builder) {
        SetCategoryOrderHintChange setCategoryOrderHintChange = builder.buildUnchecked();
        Assertions.assertThat(setCategoryOrderHintChange).isInstanceOf(SetCategoryOrderHintChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetCategoryOrderHintChange.builder().change("change") },
                new Object[] { SetCategoryOrderHintChange.builder()
                        .previousValue(new com.commercetools.history.models.common.CategoryOrderHintsImpl()) },
                new Object[] { SetCategoryOrderHintChange.builder()
                        .nextValue(new com.commercetools.history.models.common.CategoryOrderHintsImpl()) },
                new Object[] { SetCategoryOrderHintChange.builder().catalogData("catalogData") },
                new Object[] { SetCategoryOrderHintChange.builder().categoryId("categoryId") } };
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
