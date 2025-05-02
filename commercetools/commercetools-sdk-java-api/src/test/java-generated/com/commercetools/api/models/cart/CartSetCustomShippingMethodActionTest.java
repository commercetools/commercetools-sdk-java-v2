
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetCustomShippingMethodActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetCustomShippingMethodActionBuilder builder) {
        CartSetCustomShippingMethodAction cartSetCustomShippingMethodAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetCustomShippingMethodAction).isInstanceOf(CartSetCustomShippingMethodAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "shippingMethodName",
                        CartSetCustomShippingMethodAction.builder().shippingMethodName("shippingMethodName") },
                new Object[] { "shippingRate", CartSetCustomShippingMethodAction.builder()
                        .shippingRate(new com.commercetools.api.models.shipping_method.ShippingRateDraftImpl()) },
                new Object[] { "taxCategory", CartSetCustomShippingMethodAction.builder()
                        .taxCategory(
                            new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl()) },
                new Object[] { "externalTaxRate",
                        CartSetCustomShippingMethodAction.builder()
                                .externalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl()) },
                new Object[] { "custom", CartSetCustomShippingMethodAction.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void shippingMethodName() {
        CartSetCustomShippingMethodAction value = CartSetCustomShippingMethodAction.of();
        value.setShippingMethodName("shippingMethodName");
        Assertions.assertThat(value.getShippingMethodName()).isEqualTo("shippingMethodName");
    }

    @Test
    public void shippingRate() {
        CartSetCustomShippingMethodAction value = CartSetCustomShippingMethodAction.of();
        value.setShippingRate(new com.commercetools.api.models.shipping_method.ShippingRateDraftImpl());
        Assertions.assertThat(value.getShippingRate())
                .isEqualTo(new com.commercetools.api.models.shipping_method.ShippingRateDraftImpl());
    }

    @Test
    public void taxCategory() {
        CartSetCustomShippingMethodAction value = CartSetCustomShippingMethodAction.of();
        value.setTaxCategory(new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl());
        Assertions.assertThat(value.getTaxCategory())
                .isEqualTo(new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl());
    }

    @Test
    public void externalTaxRate() {
        CartSetCustomShippingMethodAction value = CartSetCustomShippingMethodAction.of();
        value.setExternalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
        Assertions.assertThat(value.getExternalTaxRate())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
    }

    @Test
    public void custom() {
        CartSetCustomShippingMethodAction value = CartSetCustomShippingMethodAction.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
