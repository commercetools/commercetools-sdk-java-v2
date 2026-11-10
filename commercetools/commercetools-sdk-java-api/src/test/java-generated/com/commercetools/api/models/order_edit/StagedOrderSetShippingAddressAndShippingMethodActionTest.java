
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetShippingAddressAndShippingMethodActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetShippingAddressAndShippingMethodActionBuilder builder) {
        StagedOrderSetShippingAddressAndShippingMethodAction stagedOrderSetShippingAddressAndShippingMethodAction = builder
                .buildUnchecked();
        Assertions.assertThat(stagedOrderSetShippingAddressAndShippingMethodAction)
                .isInstanceOf(StagedOrderSetShippingAddressAndShippingMethodAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "address",
                        StagedOrderSetShippingAddressAndShippingMethodAction.builder()
                                .address(new com.commercetools.api.models.common.BaseAddressImpl()) },
                new Object[] { "shippingMethod", StagedOrderSetShippingAddressAndShippingMethodAction.builder()
                        .shippingMethod(
                            new com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierImpl()) },
                new Object[] { "externalTaxRate", StagedOrderSetShippingAddressAndShippingMethodAction.builder()
                        .externalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl()) } };
    }

    @Test
    public void address() {
        StagedOrderSetShippingAddressAndShippingMethodAction value = StagedOrderSetShippingAddressAndShippingMethodAction
                .of();
        value.setAddress(new com.commercetools.api.models.common.BaseAddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.BaseAddressImpl());
    }

    @Test
    public void shippingMethod() {
        StagedOrderSetShippingAddressAndShippingMethodAction value = StagedOrderSetShippingAddressAndShippingMethodAction
                .of();
        value.setShippingMethod(
            new com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierImpl());
        Assertions.assertThat(value.getShippingMethod())
                .isEqualTo(new com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierImpl());
    }

    @Test
    public void externalTaxRate() {
        StagedOrderSetShippingAddressAndShippingMethodAction value = StagedOrderSetShippingAddressAndShippingMethodAction
                .of();
        value.setExternalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
        Assertions.assertThat(value.getExternalTaxRate())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
    }
}
