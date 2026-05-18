
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetAssociatesChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetAssociatesChangeBuilder builder) {
        SetAssociatesChange setAssociatesChange = builder.buildUnchecked();
        Assertions.assertThat(setAssociatesChange).isInstanceOf(SetAssociatesChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetAssociatesChange.builder().change("change") },
                new Object[] { "addedItems",
                        SetAssociatesChange.builder()
                                .addedItems(Collections
                                        .singletonList(new com.commercetools.history.models.common.AssociateImpl())) },
                new Object[] { "removedItems",
                        SetAssociatesChange.builder()
                                .removedItems(Collections
                                        .singletonList(new com.commercetools.history.models.common.AssociateImpl())) },
                new Object[] { "previousValue",
                        SetAssociatesChange.builder()
                                .previousValue(Collections
                                        .singletonList(new com.commercetools.history.models.common.AssociateImpl())) },
                new Object[] { "nextValue", SetAssociatesChange.builder()
                        .nextValue(
                            Collections.singletonList(new com.commercetools.history.models.common.AssociateImpl())) } };
    }

    @Test
    public void change() {
        SetAssociatesChange value = SetAssociatesChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void addedItems() {
        SetAssociatesChange value = SetAssociatesChange.of();
        value.setAddedItems(Collections.singletonList(new com.commercetools.history.models.common.AssociateImpl()));
        Assertions.assertThat(value.getAddedItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.AssociateImpl()));
    }

    @Test
    public void removedItems() {
        SetAssociatesChange value = SetAssociatesChange.of();
        value.setRemovedItems(Collections.singletonList(new com.commercetools.history.models.common.AssociateImpl()));
        Assertions.assertThat(value.getRemovedItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.AssociateImpl()));
    }

    @Test
    public void previousValue() {
        SetAssociatesChange value = SetAssociatesChange.of();
        value.setPreviousValue(Collections.singletonList(new com.commercetools.history.models.common.AssociateImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.AssociateImpl()));
    }

    @Test
    public void nextValue() {
        SetAssociatesChange value = SetAssociatesChange.of();
        value.setNextValue(Collections.singletonList(new com.commercetools.history.models.common.AssociateImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.AssociateImpl()));
    }
}
