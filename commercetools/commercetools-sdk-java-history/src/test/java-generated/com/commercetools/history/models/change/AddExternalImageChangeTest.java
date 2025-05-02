
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AddExternalImageChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AddExternalImageChangeBuilder builder) {
        AddExternalImageChange addExternalImageChange = builder.buildUnchecked();
        Assertions.assertThat(addExternalImageChange).isInstanceOf(AddExternalImageChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", AddExternalImageChange.builder().change("change") },
                new Object[] { "previousValue",
                        AddExternalImageChange.builder()
                                .previousValue(Collections
                                        .singletonList(new com.commercetools.history.models.common.ImageImpl())) },
                new Object[] { "nextValue",
                        AddExternalImageChange.builder()
                                .nextValue(Collections
                                        .singletonList(new com.commercetools.history.models.common.ImageImpl())) },
                new Object[] { "catalogData", AddExternalImageChange.builder().catalogData("catalogData") } };
    }

    @Test
    public void change() {
        AddExternalImageChange value = AddExternalImageChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        AddExternalImageChange value = AddExternalImageChange.of();
        value.setPreviousValue(Collections.singletonList(new com.commercetools.history.models.common.ImageImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ImageImpl()));
    }

    @Test
    public void nextValue() {
        AddExternalImageChange value = AddExternalImageChange.of();
        value.setNextValue(Collections.singletonList(new com.commercetools.history.models.common.ImageImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ImageImpl()));
    }

    @Test
    public void catalogData() {
        AddExternalImageChange value = AddExternalImageChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }
}
