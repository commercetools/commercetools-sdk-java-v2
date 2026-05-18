
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetStoresChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetStoresChangeBuilder builder) {
        SetStoresChange setStoresChange = builder.buildUnchecked();
        Assertions.assertThat(setStoresChange).isInstanceOf(SetStoresChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetStoresChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetStoresChange.builder()
                                .previousValue(Collections
                                        .singletonList(new com.commercetools.history.models.common.ReferenceImpl())) },
                new Object[] { "nextValue",
                        SetStoresChange.builder()
                                .nextValue(Collections
                                        .singletonList(new com.commercetools.history.models.common.ReferenceImpl())) },
                new Object[] { "addedItems",
                        SetStoresChange.builder()
                                .addedItems(Collections.singletonList(
                                    new com.commercetools.history.models.common.KeyReferenceImpl())) },
                new Object[] { "removedItems",
                        SetStoresChange.builder()
                                .removedItems(Collections.singletonList(
                                    new com.commercetools.history.models.common.KeyReferenceImpl())) } };
    }

    @Test
    public void change() {
        SetStoresChange value = SetStoresChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetStoresChange value = SetStoresChange.of();
        value.setPreviousValue(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
    }

    @Test
    public void nextValue() {
        SetStoresChange value = SetStoresChange.of();
        value.setNextValue(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
    }

    @Test
    public void addedItems() {
        SetStoresChange value = SetStoresChange.of();
        value.setAddedItems(Collections.singletonList(new com.commercetools.history.models.common.KeyReferenceImpl()));
        Assertions.assertThat(value.getAddedItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.KeyReferenceImpl()));
    }

    @Test
    public void removedItems() {
        SetStoresChange value = SetStoresChange.of();
        value.setRemovedItems(
            Collections.singletonList(new com.commercetools.history.models.common.KeyReferenceImpl()));
        Assertions.assertThat(value.getRemovedItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.KeyReferenceImpl()));
    }
}
