
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCartSetShippingMethodActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCartSetShippingMethodActionBuilder builder) {
        MyCartSetShippingMethodAction myCartSetShippingMethodAction = builder.buildUnchecked();
        Assertions.assertThat(myCartSetShippingMethodAction).isInstanceOf(MyCartSetShippingMethodAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "shippingMethod", MyCartSetShippingMethodAction.builder()
                        .shippingMethod(
                            new com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierImpl()) },
                new Object[] { "externalTaxRate", MyCartSetShippingMethodAction.builder()
                        .externalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl()) } };
    }

    @Test
    public void shippingMethod() {
        MyCartSetShippingMethodAction value = MyCartSetShippingMethodAction.of();
        value.setShippingMethod(
            new com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierImpl());
        Assertions.assertThat(value.getShippingMethod())
                .isEqualTo(new com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierImpl());
    }

    @Test
    public void externalTaxRate() {
        MyCartSetShippingMethodAction value = MyCartSetShippingMethodAction.of();
        value.setExternalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
        Assertions.assertThat(value.getExternalTaxRate())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
    }
}
