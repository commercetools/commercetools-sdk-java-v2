
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
public class CustomLineItemDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomLineItemDraftBuilder builder) {
        CustomLineItemDraft customLineItemDraft = builder.buildUnchecked();
        Assertions.assertThat(customLineItemDraft).isInstanceOf(CustomLineItemDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CustomLineItemDraft.builder()
                        .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { CustomLineItemDraft.builder().key("key") },
                new Object[] { CustomLineItemDraft.builder().quantity(8L) },
                new Object[] {
                        CustomLineItemDraft.builder().money(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { CustomLineItemDraft.builder().slug("slug") },
                new Object[] { CustomLineItemDraft.builder()
                        .taxCategory(
                            new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl()) },
                new Object[] { CustomLineItemDraft.builder()
                        .externalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl()) },
                new Object[] { CustomLineItemDraft.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) },
                new Object[] { CustomLineItemDraft.builder()
                        .shippingDetails(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl()) },
                new Object[] { CustomLineItemDraft.builder()
                        .priceMode(com.commercetools.api.models.cart.CustomLineItemPriceMode.findEnum("Standard")) } };
    }

    @Test
    public void name() {
        CustomLineItemDraft value = CustomLineItemDraft.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void key() {
        CustomLineItemDraft value = CustomLineItemDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void quantity() {
        CustomLineItemDraft value = CustomLineItemDraft.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void money() {
        CustomLineItemDraft value = CustomLineItemDraft.of();
        value.setMoney(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getMoney()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void slug() {
        CustomLineItemDraft value = CustomLineItemDraft.of();
        value.setSlug("slug");
        Assertions.assertThat(value.getSlug()).isEqualTo("slug");
    }

    @Test
    public void taxCategory() {
        CustomLineItemDraft value = CustomLineItemDraft.of();
        value.setTaxCategory(new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl());
        Assertions.assertThat(value.getTaxCategory())
                .isEqualTo(new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl());
    }

    @Test
    public void externalTaxRate() {
        CustomLineItemDraft value = CustomLineItemDraft.of();
        value.setExternalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
        Assertions.assertThat(value.getExternalTaxRate())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
    }

    @Test
    public void custom() {
        CustomLineItemDraft value = CustomLineItemDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }

    @Test
    public void shippingDetails() {
        CustomLineItemDraft value = CustomLineItemDraft.of();
        value.setShippingDetails(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
        Assertions.assertThat(value.getShippingDetails())
                .isEqualTo(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
    }

    @Test
    public void priceMode() {
        CustomLineItemDraft value = CustomLineItemDraft.of();
        value.setPriceMode(com.commercetools.api.models.cart.CustomLineItemPriceMode.findEnum("Standard"));
        Assertions.assertThat(value.getPriceMode())
                .isEqualTo(com.commercetools.api.models.cart.CustomLineItemPriceMode.findEnum("Standard"));
    }
}
