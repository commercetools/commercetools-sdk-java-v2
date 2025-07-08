
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderAddCustomLineItemActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderAddCustomLineItemActionBuilder builder) {
        StagedOrderAddCustomLineItemAction stagedOrderAddCustomLineItemAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderAddCustomLineItemAction)
                .isInstanceOf(StagedOrderAddCustomLineItemAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "money",
                        StagedOrderAddCustomLineItemAction.builder()
                                .money(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { "name",
                        StagedOrderAddCustomLineItemAction.builder()
                                .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "key", StagedOrderAddCustomLineItemAction.builder().key("key") },
                new Object[] { "quantity", StagedOrderAddCustomLineItemAction.builder().quantity(8L) },
                new Object[] { "slug", StagedOrderAddCustomLineItemAction.builder().slug("slug") },
                new Object[] { "taxCategory", StagedOrderAddCustomLineItemAction.builder()
                        .taxCategory(
                            new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl()) },
                new Object[] { "externalTaxRate",
                        StagedOrderAddCustomLineItemAction.builder()
                                .externalTaxRate(new com.commercetools.api.models.cart.ExternalTaxRateDraftImpl()) },
                new Object[] { "shippingDetails", StagedOrderAddCustomLineItemAction.builder()
                        .shippingDetails(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl()) },
                new Object[] { "priceMode", StagedOrderAddCustomLineItemAction.builder()
                        .priceMode(com.commercetools.api.models.cart.CustomLineItemPriceMode.findEnum("Standard")) },
                new Object[] { "custom",
                        StagedOrderAddCustomLineItemAction.builder()
                                .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) },
                new Object[] { "recurrenceInfo", StagedOrderAddCustomLineItemAction.builder()
                        .recurrenceInfo(
                            new com.commercetools.api.models.recurring_order.CustomLineItemRecurrenceInfoDraftImpl()) } };
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

    @Test
    public void recurrenceInfo() {
        StagedOrderAddCustomLineItemAction value = StagedOrderAddCustomLineItemAction.of();
        value.setRecurrenceInfo(
            new com.commercetools.api.models.recurring_order.CustomLineItemRecurrenceInfoDraftImpl());
        Assertions.assertThat(value.getRecurrenceInfo())
                .isEqualTo(new com.commercetools.api.models.recurring_order.CustomLineItemRecurrenceInfoDraftImpl());
    }
}
