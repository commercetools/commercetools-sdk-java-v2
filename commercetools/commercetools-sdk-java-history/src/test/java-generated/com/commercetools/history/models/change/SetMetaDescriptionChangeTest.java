
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetMetaDescriptionChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetMetaDescriptionChangeBuilder builder) {
        SetMetaDescriptionChange setMetaDescriptionChange = builder.buildUnchecked();
        Assertions.assertThat(setMetaDescriptionChange).isInstanceOf(SetMetaDescriptionChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetMetaDescriptionChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetMetaDescriptionChange.builder()
                                .previousValue(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "nextValue",
                        SetMetaDescriptionChange.builder()
                                .nextValue(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "catalogData", SetMetaDescriptionChange.builder().catalogData("catalogData") } };
    }

    @Test
    public void change() {
        SetMetaDescriptionChange value = SetMetaDescriptionChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetMetaDescriptionChange value = SetMetaDescriptionChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void nextValue() {
        SetMetaDescriptionChange value = SetMetaDescriptionChange.of();
        value.setNextValue(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void catalogData() {
        SetMetaDescriptionChange value = SetMetaDescriptionChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }
}
