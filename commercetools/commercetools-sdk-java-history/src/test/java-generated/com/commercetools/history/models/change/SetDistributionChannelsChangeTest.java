
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetDistributionChannelsChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetDistributionChannelsChangeBuilder builder) {
        SetDistributionChannelsChange setDistributionChannelsChange = builder.buildUnchecked();
        Assertions.assertThat(setDistributionChannelsChange).isInstanceOf(SetDistributionChannelsChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetDistributionChannelsChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetDistributionChannelsChange.builder()
                                .previousValue(Collections
                                        .singletonList(new com.commercetools.history.models.common.ReferenceImpl())) },
                new Object[] { "nextValue",
                        SetDistributionChannelsChange.builder()
                                .nextValue(Collections
                                        .singletonList(new com.commercetools.history.models.common.ReferenceImpl())) },
                new Object[] { "addedItems",
                        SetDistributionChannelsChange.builder()
                                .addedItems(Collections
                                        .singletonList(new com.commercetools.history.models.common.ReferenceImpl())) },
                new Object[] { "removedItems", SetDistributionChannelsChange.builder()
                        .removedItems(
                            Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl())) } };
    }

    @Test
    public void change() {
        SetDistributionChannelsChange value = SetDistributionChannelsChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetDistributionChannelsChange value = SetDistributionChannelsChange.of();
        value.setPreviousValue(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
    }

    @Test
    public void nextValue() {
        SetDistributionChannelsChange value = SetDistributionChannelsChange.of();
        value.setNextValue(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
    }

    @Test
    public void addedItems() {
        SetDistributionChannelsChange value = SetDistributionChannelsChange.of();
        value.setAddedItems(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
        Assertions.assertThat(value.getAddedItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
    }

    @Test
    public void removedItems() {
        SetDistributionChannelsChange value = SetDistributionChannelsChange.of();
        value.setRemovedItems(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
        Assertions.assertThat(value.getRemovedItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ReferenceImpl()));
    }
}
