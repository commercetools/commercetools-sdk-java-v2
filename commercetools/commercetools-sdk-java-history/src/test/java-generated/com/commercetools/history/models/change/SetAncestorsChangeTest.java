
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetAncestorsChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetAncestorsChangeBuilder builder) {
        SetAncestorsChange setAncestorsChange = builder.buildUnchecked();
        Assertions.assertThat(setAncestorsChange).isInstanceOf(SetAncestorsChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetAncestorsChange.builder().change("change") },
                new Object[] { "addedItems",
                        SetAncestorsChange.builder()
                                .addedItems(Collections
                                        .singletonList(new com.commercetools.history.models.common.ReferenceImpl())) },
                new Object[] { "removedItems",
                        SetAncestorsChange.builder()
                                .removedItems(Collections
                                        .singletonList(new com.commercetools.history.models.common.ReferenceImpl())) },
                new Object[] { "previousValue",
                        SetAncestorsChange.builder()
                                .previousValue(Collections
                                        .singletonList(new com.commercetools.history.models.common.ReferenceImpl())) },
                new Object[] { "nextValue", SetAncestorsChange.builder()
                        .nextValue(
                            Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl())) } };
    }

    @Test
    public void change() {
        SetAncestorsChange value = SetAncestorsChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void addedItems() {
        SetAncestorsChange value = SetAncestorsChange.of();
        value.setAddedItems(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
        Assertions.assertThat(value.getAddedItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
    }

    @Test
    public void removedItems() {
        SetAncestorsChange value = SetAncestorsChange.of();
        value.setRemovedItems(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
        Assertions.assertThat(value.getRemovedItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
    }

    @Test
    public void previousValue() {
        SetAncestorsChange value = SetAncestorsChange.of();
        value.setPreviousValue(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
    }

    @Test
    public void nextValue() {
        SetAncestorsChange value = SetAncestorsChange.of();
        value.setNextValue(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
    }
}
