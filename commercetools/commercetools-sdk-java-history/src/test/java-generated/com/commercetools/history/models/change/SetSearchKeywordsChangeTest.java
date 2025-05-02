
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetSearchKeywordsChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetSearchKeywordsChangeBuilder builder) {
        SetSearchKeywordsChange setSearchKeywordsChange = builder.buildUnchecked();
        Assertions.assertThat(setSearchKeywordsChange).isInstanceOf(SetSearchKeywordsChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetSearchKeywordsChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetSearchKeywordsChange.builder()
                                .previousValue(new com.commercetools.history.models.common.SearchKeywordsImpl()) },
                new Object[] { "nextValue",
                        SetSearchKeywordsChange.builder()
                                .nextValue(new com.commercetools.history.models.common.SearchKeywordsImpl()) },
                new Object[] { "catalogData", SetSearchKeywordsChange.builder().catalogData("catalogData") } };
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
