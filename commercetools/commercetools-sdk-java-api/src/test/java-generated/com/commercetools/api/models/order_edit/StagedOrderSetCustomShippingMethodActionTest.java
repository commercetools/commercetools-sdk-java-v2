
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetCustomShippingMethodActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetCustomShippingMethodActionBuilder builder) {
        StagedOrderSetCustomShippingMethodAction stagedOrderSetCustomShippingMethodAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetCustomShippingMethodAction)
                .isInstanceOf(StagedOrderSetCustomShippingMethodAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "shippingMethodName",
                        StagedOrderSetCustomShippingMethodAction.builder().shippingMethodName("shippingMethodName") },
                new Object[] { "shippingRate", StagedOrderSetCustomShippingMethodAction.builder()
                        .shippingRate(new com.commercetools.api.models.shipping_method.ShippingRateDraftImpl()) },
                new Object[] { "taxCategory", StagedOrderSetCustomShippingMethodAction.builder()
                        .taxCategory(
                            new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl()) },
                new Object[] { "externalTaxRate",
                        StagedOrderSetCustomShippingMethodAction.builder()
                                .externalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl()) },
                new Object[] { "custom", StagedOrderSetCustomShippingMethodAction.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void shippingMethodName() {
        StagedOrderSetCustomShippingMethodAction value = StagedOrderSetCustomShippingMethodAction.of();
        value.setShippingMethodName("shippingMethodName");
        Assertions.assertThat(value.getShippingMethodName()).isEqualTo("shippingMethodName");
    }

    @Test
    public void shippingRate() {
        StagedOrderSetCustomShippingMethodAction value = StagedOrderSetCustomShippingMethodAction.of();
        value.setShippingRate(new com.commercetools.api.models.shipping_method.ShippingRateDraftImpl());
        Assertions.assertThat(value.getShippingRate())
                .isEqualTo(new com.commercetools.api.models.shipping_method.ShippingRateDraftImpl());
    }

    @Test
    public void taxCategory() {
        StagedOrderSetCustomShippingMethodAction value = StagedOrderSetCustomShippingMethodAction.of();
        value.setTaxCategory(new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl());
        Assertions.assertThat(value.getTaxCategory())
                .isEqualTo(new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl());
    }

    @Test
    public void externalTaxRate() {
        StagedOrderSetCustomShippingMethodAction value = StagedOrderSetCustomShippingMethodAction.of();
        value.setExternalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
        Assertions.assertThat(value.getExternalTaxRate())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
    }

    @Test
    public void custom() {
        StagedOrderSetCustomShippingMethodAction value = StagedOrderSetCustomShippingMethodAction.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
