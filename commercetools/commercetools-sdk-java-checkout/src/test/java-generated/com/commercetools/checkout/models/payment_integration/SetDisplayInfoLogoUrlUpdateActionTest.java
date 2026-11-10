
package com.commercetools.checkout.models.payment_integration;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetDisplayInfoLogoUrlUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetDisplayInfoLogoUrlUpdateActionBuilder builder) {
        SetDisplayInfoLogoUrlUpdateAction setDisplayInfoLogoUrlUpdateAction = builder.buildUnchecked();
        Assertions.assertThat(setDisplayInfoLogoUrlUpdateAction).isInstanceOf(SetDisplayInfoLogoUrlUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "logoUrl", SetDisplayInfoLogoUrlUpdateAction.builder()
                .logoUrl(new com.commercetools.checkout.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void logoUrl() {
        SetDisplayInfoLogoUrlUpdateAction value = SetDisplayInfoLogoUrlUpdateAction.of();
        value.setLogoUrl(new com.commercetools.checkout.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLogoUrl())
                .isEqualTo(new com.commercetools.checkout.models.common.LocalizedStringImpl());
    }
}
