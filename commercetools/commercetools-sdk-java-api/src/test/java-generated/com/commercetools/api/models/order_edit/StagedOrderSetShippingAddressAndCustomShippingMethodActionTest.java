
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
public class StagedOrderSetShippingAddressAndCustomShippingMethodActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder builder) {
        StagedOrderSetShippingAddressAndCustomShippingMethodAction stagedOrderSetShippingAddressAndCustomShippingMethodAction = builder
                .buildUnchecked();
        Assertions.assertThat(stagedOrderSetShippingAddressAndCustomShippingMethodAction)
                .isInstanceOf(StagedOrderSetShippingAddressAndCustomShippingMethodAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StagedOrderSetShippingAddressAndCustomShippingMethodAction.builder()
                        .address(new com.commercetools.api.models.common.BaseAddressImpl()) },
                new Object[] { StagedOrderSetShippingAddressAndCustomShippingMethodAction.builder()
                        .shippingMethodName("shippingMethodName") },
                new Object[] { StagedOrderSetShippingAddressAndCustomShippingMethodAction.builder()
                        .shippingRate(new com.commercetools.api.models.shipping_method.ShippingRateDraftImpl()) },
                new Object[] { StagedOrderSetShippingAddressAndCustomShippingMethodAction.builder()
                        .taxCategory(
                            new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl()) },
                new Object[] { StagedOrderSetShippingAddressAndCustomShippingMethodAction.builder()
                        .externalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl()) } };
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
}
