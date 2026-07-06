
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeSlugChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeSlugChangeBuilder builder) {
        ChangeSlugChange changeSlugChange = builder.buildUnchecked();
        Assertions.assertThat(changeSlugChange).isInstanceOf(ChangeSlugChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeSlugChange.builder().change("change") },
                new Object[] { "previousValue",
                        ChangeSlugChange.builder()
                                .previousValue(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "nextValue",
                        ChangeSlugChange.builder()
                                .nextValue(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "catalogData", ChangeSlugChange.builder().catalogData("catalogData") } };
    }

    @Test
    public void change() {
        ChangeSlugChange value = ChangeSlugChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeSlugChange value = ChangeSlugChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void nextValue() {
        ChangeSlugChange value = ChangeSlugChange.of();
        value.setNextValue(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void catalogData() {
        ChangeSlugChange value = ChangeSlugChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }
}
