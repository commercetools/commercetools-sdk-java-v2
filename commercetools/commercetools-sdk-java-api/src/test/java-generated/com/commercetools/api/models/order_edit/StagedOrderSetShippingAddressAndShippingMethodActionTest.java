
package com.commercetools.api.models.order_edit;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class StagedOrderSetShippingAddressAndShippingMethodActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderSetShippingAddressAndShippingMethodActionBuilder builder) {
        StagedOrderSetShippingAddressAndShippingMethodAction stagedOrderSetShippingAddressAndShippingMethodAction = builder
                .buildUnchecked();
        Assertions.assertThat(stagedOrderSetShippingAddressAndShippingMethodAction)
                .isInstanceOf(StagedOrderSetShippingAddressAndShippingMethodAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StagedOrderSetShippingAddressAndShippingMethodAction.builder()
                        .address(new com.commercetools.api.models.common.BaseAddressImpl()) },
                new Object[] { StagedOrderSetShippingAddressAndShippingMethodAction.builder()
                        .shippingMethod(
                            new com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierImpl()) },
                new Object[] { StagedOrderSetShippingAddressAndShippingMethodAction.builder()
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
