
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveImageChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RemoveImageChangeBuilder builder) {
        RemoveImageChange removeImageChange = builder.buildUnchecked();
        Assertions.assertThat(removeImageChange).isInstanceOf(RemoveImageChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", RemoveImageChange.builder().change("change") },
                new Object[] { "previousValue",
                        RemoveImageChange.builder()
                                .previousValue(Collections
                                        .singletonList(new com.commercetools.history.models.common.ImageImpl())) },
                new Object[] { "nextValue",
                        RemoveImageChange.builder()
                                .nextValue(Collections
                                        .singletonList(new com.commercetools.history.models.common.ImageImpl())) },
                new Object[] { "catalogData", RemoveImageChange.builder().catalogData("catalogData") },
                new Object[] { "variant", RemoveImageChange.builder().variant("variant") } };
    }

    @Test
    public void change() {
        RemoveImageChange value = RemoveImageChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveImageChange value = RemoveImageChange.of();
        value.setPreviousValue(Collections.singletonList(new com.commercetools.history.models.common.ImageImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ImageImpl()));
    }

    @Test
    public void nextValue() {
        RemoveImageChange value = RemoveImageChange.of();
        value.setNextValue(Collections.singletonList(new com.commercetools.history.models.common.ImageImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ImageImpl()));
    }

    @Test
    public void catalogData() {
        RemoveImageChange value = RemoveImageChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }

    @Test
    public void variant() {
        RemoveImageChange value = RemoveImageChange.of();
        value.setVariant("variant");
        Assertions.assertThat(value.getVariant()).isEqualTo("variant");
    }
}
