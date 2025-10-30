
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetInheritedStoresChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetInheritedStoresChangeBuilder builder) {
        SetInheritedStoresChange setInheritedStoresChange = builder.buildUnchecked();
        Assertions.assertThat(setInheritedStoresChange).isInstanceOf(SetInheritedStoresChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetInheritedStoresChange.builder().change("change") },
                new Object[] { "addedItems",
                        SetInheritedStoresChange.builder()
                                .addedItems(Collections.singletonList(
                                    new com.commercetools.history.models.common.KeyReferenceImpl())) },
                new Object[] { "removedItems",
                        SetInheritedStoresChange.builder()
                                .removedItems(Collections.singletonList(
                                    new com.commercetools.history.models.common.KeyReferenceImpl())) },
                new Object[] { "previousValue",
                        SetInheritedStoresChange.builder()
                                .previousValue(Collections.singletonList(
                                    new com.commercetools.history.models.common.KeyReferenceImpl())) },
                new Object[] { "nextValue",
                        SetInheritedStoresChange.builder()
                                .nextValue(Collections.singletonList(
                                    new com.commercetools.history.models.common.KeyReferenceImpl())) } };
    }

    @Test
    public void change() {
        SetInheritedStoresChange value = SetInheritedStoresChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void addedItems() {
        SetInheritedStoresChange value = SetInheritedStoresChange.of();
        value.setAddedItems(Collections.singletonList(new com.commercetools.history.models.common.KeyReferenceImpl()));
        Assertions.assertThat(value.getAddedItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.KeyReferenceImpl()));
    }

    @Test
    public void removedItems() {
        SetInheritedStoresChange value = SetInheritedStoresChange.of();
        value.setRemovedItems(
            Collections.singletonList(new com.commercetools.history.models.common.KeyReferenceImpl()));
        Assertions.assertThat(value.getRemovedItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.KeyReferenceImpl()));
    }

    @Test
    public void previousValue() {
        SetInheritedStoresChange value = SetInheritedStoresChange.of();
        value.setPreviousValue(
            Collections.singletonList(new com.commercetools.history.models.common.KeyReferenceImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.KeyReferenceImpl()));
    }

    @Test
    public void nextValue() {
        SetInheritedStoresChange value = SetInheritedStoresChange.of();
        value.setNextValue(Collections.singletonList(new com.commercetools.history.models.common.KeyReferenceImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.KeyReferenceImpl()));
    }
}
