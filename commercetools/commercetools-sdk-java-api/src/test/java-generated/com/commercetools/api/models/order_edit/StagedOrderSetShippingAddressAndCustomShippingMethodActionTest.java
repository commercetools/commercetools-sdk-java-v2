
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetShippingAddressAndCustomShippingMethodActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder builder) {
        StagedOrderSetShippingAddressAndCustomShippingMethodAction stagedOrderSetShippingAddressAndCustomShippingMethodAction = builder
                .buildUnchecked();
        Assertions.assertThat(stagedOrderSetShippingAddressAndCustomShippingMethodAction)
                .isInstanceOf(StagedOrderSetShippingAddressAndCustomShippingMethodAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "address",
                        StagedOrderSetShippingAddressAndCustomShippingMethodAction.builder()
                                .address(new com.commercetools.api.models.common.BaseAddressImpl()) },
                new Object[] { "shippingMethodName",
                        StagedOrderSetShippingAddressAndCustomShippingMethodAction.builder()
                                .shippingMethodName("shippingMethodName") },
                new Object[] { "shippingRate", StagedOrderSetShippingAddressAndCustomShippingMethodAction.builder()
                        .shippingRate(new com.commercetools.api.models.shipping_method.ShippingRateDraftImpl()) },
                new Object[] { "taxCategory", StagedOrderSetShippingAddressAndCustomShippingMethodAction.builder()
                        .taxCategory(
                            new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl()) },
                new Object[] { "externalTaxRate",
                        StagedOrderSetShippingAddressAndCustomShippingMethodAction.builder()
                                .externalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl()) },
                new Object[] { "custom", StagedOrderSetShippingAddressAndCustomShippingMethodAction.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void address() {
        StagedOrderSetShippingAddressAndCustomShippingMethodAction value = StagedOrderSetShippingAddressAndCustomShippingMethodAction
                .of();
        value.setAddress(new com.commercetools.api.models.common.BaseAddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.BaseAddressImpl());
    }

    @Test
    public void shippingMethodName() {
        StagedOrderSetShippingAddressAndCustomShippingMethodAction value = StagedOrderSetShippingAddressAndCustomShippingMethodAction
                .of();
        value.setShippingMethodName("shippingMethodName");
        Assertions.assertThat(value.getShippingMethodName()).isEqualTo("shippingMethodName");
    }

    @Test
    public void shippingRate() {
        StagedOrderSetShippingAddressAndCustomShippingMethodAction value = StagedOrderSetShippingAddressAndCustomShippingMethodAction
                .of();
        value.setShippingRate(new com.commercetools.api.models.shipping_method.ShippingRateDraftImpl());
        Assertions.assertThat(value.getShippingRate())
                .isEqualTo(new com.commercetools.api.models.shipping_method.ShippingRateDraftImpl());
    }

    @Test
    public void taxCategory() {
        StagedOrderSetShippingAddressAndCustomShippingMethodAction value = StagedOrderSetShippingAddressAndCustomShippingMethodAction
                .of();
        value.setTaxCategory(new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl());
        Assertions.assertThat(value.getTaxCategory())
                .isEqualTo(new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl());
    }

    @Test
    public void externalTaxRate() {
        StagedOrderSetShippingAddressAndCustomShippingMethodAction value = StagedOrderSetShippingAddressAndCustomShippingMethodAction
                .of();
        value.setExternalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
        Assertions.assertThat(value.getExternalTaxRate())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
    }

    @Test
    public void custom() {
        StagedOrderSetShippingAddressAndCustomShippingMethodAction value = StagedOrderSetShippingAddressAndCustomShippingMethodAction
                .of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
