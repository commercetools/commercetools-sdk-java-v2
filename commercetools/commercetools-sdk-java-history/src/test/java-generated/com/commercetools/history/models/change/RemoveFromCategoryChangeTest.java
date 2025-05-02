
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveFromCategoryChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RemoveFromCategoryChangeBuilder builder) {
        RemoveFromCategoryChange removeFromCategoryChange = builder.buildUnchecked();
        Assertions.assertThat(removeFromCategoryChange).isInstanceOf(RemoveFromCategoryChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", RemoveFromCategoryChange.builder().change("change") },
                new Object[] { "previousValue",
                        RemoveFromCategoryChange.builder()
                                .previousValue(Collections
                                        .singletonList(new com.commercetools.history.models.common.ReferenceImpl())) },
                new Object[] { "nextValue",
                        RemoveFromCategoryChange.builder()
                                .nextValue(Collections
                                        .singletonList(new com.commercetools.history.models.common.ReferenceImpl())) },
                new Object[] { "category", RemoveFromCategoryChange.builder()
                        .category(new com.commercetools.history.models.common.ReferenceImpl()) } };
    }

    @Test
    public void change() {
        RemoveFromCategoryChange value = RemoveFromCategoryChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveFromCategoryChange value = RemoveFromCategoryChange.of();
        value.setPreviousValue(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
    }

    @Test
    public void nextValue() {
        RemoveFromCategoryChange value = RemoveFromCategoryChange.of();
        value.setNextValue(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
    }

    @Test
    public void category() {
        RemoveFromCategoryChange value = RemoveFromCategoryChange.of();
        value.setCategory(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getCategory())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }
}
