
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetInheritedAssociatesChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetInheritedAssociatesChangeBuilder builder) {
        SetInheritedAssociatesChange setInheritedAssociatesChange = builder.buildUnchecked();
        Assertions.assertThat(setInheritedAssociatesChange).isInstanceOf(SetInheritedAssociatesChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetInheritedAssociatesChange.builder().change("change") },
                new Object[] { "addedItems",
                        SetInheritedAssociatesChange.builder()
                                .addedItems(Collections.singletonList(
                                    new com.commercetools.history.models.common.InheritedAssociateImpl())) },
                new Object[] { "removedItems",
                        SetInheritedAssociatesChange.builder()
                                .removedItems(Collections.singletonList(
                                    new com.commercetools.history.models.common.InheritedAssociateImpl())) },
                new Object[] { "previousValue",
                        SetInheritedAssociatesChange.builder()
                                .previousValue(Collections.singletonList(
                                    new com.commercetools.history.models.common.InheritedAssociateImpl())) },
                new Object[] { "nextValue",
                        SetInheritedAssociatesChange.builder()
                                .nextValue(Collections.singletonList(
                                    new com.commercetools.history.models.common.InheritedAssociateImpl())) } };
    }

    @Test
    public void change() {
        SetInheritedAssociatesChange value = SetInheritedAssociatesChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void addedItems() {
        SetInheritedAssociatesChange value = SetInheritedAssociatesChange.of();
        value.setAddedItems(
            Collections.singletonList(new com.commercetools.history.models.common.InheritedAssociateImpl()));
        Assertions.assertThat(value.getAddedItems())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.history.models.common.InheritedAssociateImpl()));
    }

    @Test
    public void removedItems() {
        SetInheritedAssociatesChange value = SetInheritedAssociatesChange.of();
        value.setRemovedItems(
            Collections.singletonList(new com.commercetools.history.models.common.InheritedAssociateImpl()));
        Assertions.assertThat(value.getRemovedItems())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.history.models.common.InheritedAssociateImpl()));
    }

    @Test
    public void previousValue() {
        SetInheritedAssociatesChange value = SetInheritedAssociatesChange.of();
        value.setPreviousValue(
            Collections.singletonList(new com.commercetools.history.models.common.InheritedAssociateImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.history.models.common.InheritedAssociateImpl()));
    }

    @Test
    public void nextValue() {
        SetInheritedAssociatesChange value = SetInheritedAssociatesChange.of();
        value.setNextValue(
            Collections.singletonList(new com.commercetools.history.models.common.InheritedAssociateImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.history.models.common.InheritedAssociateImpl()));
    }
}
