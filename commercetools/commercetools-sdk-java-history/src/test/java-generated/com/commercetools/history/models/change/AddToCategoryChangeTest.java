
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AddToCategoryChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AddToCategoryChangeBuilder builder) {
        AddToCategoryChange addToCategoryChange = builder.buildUnchecked();
        Assertions.assertThat(addToCategoryChange).isInstanceOf(AddToCategoryChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", AddToCategoryChange.builder().change("change") },
                new Object[] { "previousValue",
                        AddToCategoryChange.builder()
                                .previousValue(Collections
                                        .singletonList(new com.commercetools.history.models.common.ReferenceImpl())) },
                new Object[] { "nextValue",
                        AddToCategoryChange.builder()
                                .nextValue(Collections
                                        .singletonList(new com.commercetools.history.models.common.ReferenceImpl())) },
                new Object[] { "category", AddToCategoryChange.builder()
                        .category(new com.commercetools.history.models.common.ReferenceImpl()) } };
    }

    @Test
    public void change() {
        AddToCategoryChange value = AddToCategoryChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        AddToCategoryChange value = AddToCategoryChange.of();
        value.setPreviousValue(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
    }

    @Test
    public void nextValue() {
        AddToCategoryChange value = AddToCategoryChange.of();
        value.setNextValue(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
    }

    @Test
    public void category() {
        AddToCategoryChange value = AddToCategoryChange.of();
        value.setCategory(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getCategory())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }
}
