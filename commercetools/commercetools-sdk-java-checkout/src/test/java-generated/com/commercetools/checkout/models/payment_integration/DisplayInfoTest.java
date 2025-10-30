
package com.commercetools.checkout.models.payment_integration;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DisplayInfoTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DisplayInfoBuilder builder) {
        DisplayInfo displayInfo = builder.buildUnchecked();
        Assertions.assertThat(displayInfo).isInstanceOf(DisplayInfo.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "label",
                        DisplayInfo.builder()
                                .label(new com.commercetools.checkout.models.common.LocalizedStringImpl()) },
                new Object[] { "logoUrl",
                        DisplayInfo.builder()
                                .logoUrl(new com.commercetools.checkout.models.common.LocalizedUrlImpl()) },
                new Object[] { "description",
                        DisplayInfo.builder()
                                .description(new com.commercetools.checkout.models.common.LocalizedStringImpl()) },
                new Object[] { "payButtonText", DisplayInfo.builder()
                        .payButtonText(new com.commercetools.checkout.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void label() {
        DisplayInfo value = DisplayInfo.of();
        value.setLabel(new com.commercetools.checkout.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLabel())
                .isEqualTo(new com.commercetools.checkout.models.common.LocalizedStringImpl());
    }

    @Test
    public void logoUrl() {
        DisplayInfo value = DisplayInfo.of();
        value.setLogoUrl(new com.commercetools.checkout.models.common.LocalizedUrlImpl());
        Assertions.assertThat(value.getLogoUrl())
                .isEqualTo(new com.commercetools.checkout.models.common.LocalizedUrlImpl());
    }

    @Test
    public void description() {
        DisplayInfo value = DisplayInfo.of();
        value.setDescription(new com.commercetools.checkout.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.checkout.models.common.LocalizedStringImpl());
    }

    @Test
    public void payButtonText() {
        DisplayInfo value = DisplayInfo.of();
        value.setPayButtonText(new com.commercetools.checkout.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getPayButtonText())
                .isEqualTo(new com.commercetools.checkout.models.common.LocalizedStringImpl());
    }
}
