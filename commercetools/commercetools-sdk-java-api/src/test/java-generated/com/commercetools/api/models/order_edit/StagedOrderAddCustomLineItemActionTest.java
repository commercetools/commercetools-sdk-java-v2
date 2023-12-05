
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
public class StagedOrderAddCustomLineItemActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderAddCustomLineItemActionBuilder builder) {
        StagedOrderAddCustomLineItemAction stagedOrderAddCustomLineItemAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderAddCustomLineItemAction)
                .isInstanceOf(StagedOrderAddCustomLineItemAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StagedOrderAddCustomLineItemAction.builder()
                        .money(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { StagedOrderAddCustomLineItemAction.builder()
                        .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { StagedOrderAddCustomLineItemAction.builder().key("key") },
                new Object[] { StagedOrderAddCustomLineItemAction.builder().quantity(8L) },
                new Object[] { StagedOrderAddCustomLineItemAction.builder().slug("slug") },
                new Object[] { StagedOrderAddCustomLineItemAction.builder()
                        .taxCategory(
                            new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl()) },
                new Object[] { StagedOrderAddCustomLineItemAction.builder()
                        .externalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl()) },
                new Object[] { StagedOrderAddCustomLineItemAction.builder()
                        .shippingDetails(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl()) },
                new Object[] { StagedOrderAddCustomLineItemAction.builder()
                        .priceMode(com.commercetools.api.models.cart.CustomLineItemPriceMode.findEnum("Standard")) },
                new Object[] { StagedOrderAddCustomLineItemAction.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void money() {
        StagedOrderAddCustomLineItemAction value = StagedOrderAddCustomLineItemAction.of();
        value.setMoney(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getMoney()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void name() {
        StagedOrderAddCustomLineItemAction value = StagedOrderAddCustomLineItemAction.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void key() {
        StagedOrderAddCustomLineItemAction value = StagedOrderAddCustomLineItemAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void quantity() {
        StagedOrderAddCustomLineItemAction value = StagedOrderAddCustomLineItemAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void slug() {
        StagedOrderAddCustomLineItemAction value = StagedOrderAddCustomLineItemAction.of();
        value.setSlug("slug");
        Assertions.assertThat(value.getSlug()).isEqualTo("slug");
    }

    @Test
    public void taxCategory() {
        StagedOrderAddCustomLineItemAction value = StagedOrderAddCustomLineItemAction.of();
        value.setTaxCategory(new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl());
        Assertions.assertThat(value.getTaxCategory())
                .isEqualTo(new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl());
    }

    @Test
    public void externalTaxRate() {
        StagedOrderAddCustomLineItemAction value = StagedOrderAddCustomLineItemAction.of();
        value.setExternalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
        Assertions.assertThat(value.getExternalTaxRate())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl());
    }

    @Test
    public void shippingDetails() {
        StagedOrderAddCustomLineItemAction value = StagedOrderAddCustomLineItemAction.of();
        value.setShippingDetails(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
        Assertions.assertThat(value.getShippingDetails())
                .isEqualTo(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
    }

    @Test
    public void priceMode() {
        StagedOrderAddCustomLineItemAction value = StagedOrderAddCustomLineItemAction.of();
        value.setPriceMode(com.commercetools.api.models.cart.CustomLineItemPriceMode.findEnum("Standard"));
        Assertions.assertThat(value.getPriceMode())
                .isEqualTo(com.commercetools.api.models.cart.CustomLineItemPriceMode.findEnum("Standard"));
    }

    @Test
    public void custom() {
        StagedOrderAddCustomLineItemAction value = StagedOrderAddCustomLineItemAction.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
