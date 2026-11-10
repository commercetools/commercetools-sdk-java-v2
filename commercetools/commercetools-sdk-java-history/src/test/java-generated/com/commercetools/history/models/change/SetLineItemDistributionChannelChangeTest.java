
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetLineItemDistributionChannelChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetLineItemDistributionChannelChangeBuilder builder) {
        SetLineItemDistributionChannelChange setLineItemDistributionChannelChange = builder.buildUnchecked();
        Assertions.assertThat(setLineItemDistributionChannelChange)
                .isInstanceOf(SetLineItemDistributionChannelChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", SetLineItemDistributionChannelChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetLineItemDistributionChannelChange.builder()
                                .previousValue(new com.commercetools.history.models.common.ReferenceImpl()) },
                new Object[] { "nextValue",
                        SetLineItemDistributionChannelChange.builder()
                                .nextValue(new com.commercetools.history.models.common.ReferenceImpl()) },
                new Object[] { "lineItem",
                        SetLineItemDistributionChannelChange.builder()
                                .lineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "variant", SetLineItemDistributionChannelChange.builder().variant("variant") } };
    }

    @Test
    public void change() {
        SetLineItemDistributionChannelChange value = SetLineItemDistributionChannelChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetLineItemDistributionChannelChange value = SetLineItemDistributionChannelChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }

    @Test
    public void nextValue() {
        SetLineItemDistributionChannelChange value = SetLineItemDistributionChannelChange.of();
        value.setNextValue(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }

    @Test
    public void lineItem() {
        SetLineItemDistributionChannelChange value = SetLineItemDistributionChannelChange.of();
        value.setLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void variant() {
        SetLineItemDistributionChannelChange value = SetLineItemDistributionChannelChange.of();
        value.setVariant("variant");
        Assertions.assertThat(value.getVariant()).isEqualTo("variant");
    }
}
