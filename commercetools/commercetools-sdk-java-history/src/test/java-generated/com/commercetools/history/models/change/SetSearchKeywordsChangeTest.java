
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
public class SetSearchKeywordsChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetSearchKeywordsChangeBuilder builder) {
        SetSearchKeywordsChange setSearchKeywordsChange = builder.buildUnchecked();
        Assertions.assertThat(setSearchKeywordsChange).isInstanceOf(SetSearchKeywordsChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetSearchKeywordsChange.builder().change("change") },
                new Object[] { SetSearchKeywordsChange.builder()
                        .previousValue(new com.commercetools.history.models.common.SearchKeywordsImpl()) },
                new Object[] { SetSearchKeywordsChange.builder()
                        .nextValue(new com.commercetools.history.models.common.SearchKeywordsImpl()) },
                new Object[] { SetSearchKeywordsChange.builder().catalogData("catalogData") } };
    }

    @Test
    public void change() {
        SetSearchKeywordsChange value = SetSearchKeywordsChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetSearchKeywordsChange value = SetSearchKeywordsChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.SearchKeywordsImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.SearchKeywordsImpl());
    }

    @Test
    public void nextValue() {
        SetSearchKeywordsChange value = SetSearchKeywordsChange.of();
        value.setNextValue(new com.commercetools.history.models.common.SearchKeywordsImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.SearchKeywordsImpl());
    }

    @Test
    public void catalogData() {
        SetSearchKeywordsChange value = SetSearchKeywordsChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }
}
