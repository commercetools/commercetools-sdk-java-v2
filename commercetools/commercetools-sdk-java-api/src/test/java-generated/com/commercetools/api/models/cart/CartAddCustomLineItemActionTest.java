
package com.commercetools.api.models.cart;

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
public class CartAddCustomLineItemActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartAddCustomLineItemActionBuilder builder) {
        CartAddCustomLineItemAction cartAddCustomLineItemAction = builder.buildUnchecked();
        Assertions.assertThat(cartAddCustomLineItemAction).isInstanceOf(CartAddCustomLineItemAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CartAddCustomLineItemAction.builder()
                        .money(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { CartAddCustomLineItemAction.builder()
                        .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { CartAddCustomLineItemAction.builder().key("key") },
                new Object[] { CartAddCustomLineItemAction.builder().quantity(8L) },
                new Object[] { CartAddCustomLineItemAction.builder().slug("slug") },
                new Object[] { CartAddCustomLineItemAction.builder()
                        .taxCategory(
                            new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl()) },
                new Object[] { CartAddCustomLineItemAction.builder()
                        .externalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl()) },
                new Object[] { CartAddCustomLineItemAction.builder()
                        .shippingDetails(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl()) },
                new Object[] { CartAddCustomLineItemAction.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) },
                new Object[] { CartAddCustomLineItemAction.builder()
                        .priceMode(com.commercetools.api.models.cart.CustomLineItemPriceMode.findEnum("Standard")) } };
    }

    @Test
    public void money() {
        CartAddCustomLineItemAction value = CartAddCustomLineItemAction.of();
        value.setMoney(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getMoney()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void name() {
        CartAddCustomLineItemAction value = CartAddCustomLineItemAction.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void key() {
        CartAddCustomLineItemAction value = CartAddCustomLineItemAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void quantity() {
        CartAddCustomLineItemAction value = CartAddCustomLineItemAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void slug() {
        CartAddCustomLineItemAction value = CartAddCustomLineItemAction.of();
        value.setSlug("slug");
        Assertions.assertThat(value.getSlug()).isEqualTo("slug");
    }

    @Test
    public void taxCategory() {
        CartAddCustomLineItemAction value = CartAddCustomLineItemAction.of();
        value.setTaxCategory(new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl());
        Assertions.assertThat(value.getTaxCategory())
                .isEqualTo(new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl());
    }

    @Test
    public void externalTaxRate() {
        CartAddCustomLineItemAction value = CartAddCustomLineItemAction.of();
        value.setExternalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
        Assertions.assertThat(value.getExternalTaxRate())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
    }

    @Test
    public void shippingDetails() {
        CartAddCustomLineItemAction value = CartAddCustomLineItemAction.of();
        value.setShippingDetails(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
        Assertions.assertThat(value.getShippingDetails())
                .isEqualTo(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
    }

    @Test
    public void custom() {
        CartAddCustomLineItemAction value = CartAddCustomLineItemAction.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }

    @Test
    public void priceMode() {
        CartAddCustomLineItemAction value = CartAddCustomLineItemAction.of();
        value.setPriceMode(com.commercetools.api.models.cart.CustomLineItemPriceMode.findEnum("Standard"));
        Assertions.assertThat(value.getPriceMode())
                .isEqualTo(com.commercetools.api.models.cart.CustomLineItemPriceMode.findEnum("Standard"));
    }
}
