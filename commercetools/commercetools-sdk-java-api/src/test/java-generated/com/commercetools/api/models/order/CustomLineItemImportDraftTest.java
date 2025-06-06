
package com.commercetools.api.models.order;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomLineItemImportDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomLineItemImportDraftBuilder builder) {
        CustomLineItemImportDraft customLineItemImportDraft = builder.buildUnchecked();
        Assertions.assertThat(customLineItemImportDraft).isInstanceOf(CustomLineItemImportDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name",
                        CustomLineItemImportDraft.builder()
                                .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "key", CustomLineItemImportDraft.builder().key("key") },
                new Object[] { "slug", CustomLineItemImportDraft.builder().slug("slug") },
                new Object[] { "quantity", CustomLineItemImportDraft.builder().quantity(8L) },
                new Object[] { "money",
                        CustomLineItemImportDraft.builder()
                                .money(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { "taxRate",
                        CustomLineItemImportDraft.builder()
                                .taxRate(new com.commercetools.api.models.tax_category.TaxRateImpl()) },
                new Object[] { "taxCategory", CustomLineItemImportDraft.builder()
                        .taxCategory(
                            new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl()) },
                new Object[] { "priceMode", CustomLineItemImportDraft.builder()
                        .priceMode(com.commercetools.api.models.cart.CustomLineItemPriceMode.findEnum("Standard")) },
                new Object[] { "shippingDetails", CustomLineItemImportDraft.builder()
                        .shippingDetails(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl()) },
                new Object[] { "state",
                        CustomLineItemImportDraft.builder()
                                .state(Collections
                                        .singletonList(new com.commercetools.api.models.order.ItemStateImpl())) },
                new Object[] { "custom", CustomLineItemImportDraft.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void name() {
        CustomLineItemImportDraft value = CustomLineItemImportDraft.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void key() {
        CustomLineItemImportDraft value = CustomLineItemImportDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void slug() {
        CustomLineItemImportDraft value = CustomLineItemImportDraft.of();
        value.setSlug("slug");
        Assertions.assertThat(value.getSlug()).isEqualTo("slug");
    }

    @Test
    public void quantity() {
        CustomLineItemImportDraft value = CustomLineItemImportDraft.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void money() {
        CustomLineItemImportDraft value = CustomLineItemImportDraft.of();
        value.setMoney(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getMoney()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void taxRate() {
        CustomLineItemImportDraft value = CustomLineItemImportDraft.of();
        value.setTaxRate(new com.commercetools.api.models.tax_category.TaxRateImpl());
        Assertions.assertThat(value.getTaxRate())
                .isEqualTo(new com.commercetools.api.models.tax_category.TaxRateImpl());
    }

    @Test
    public void taxCategory() {
        CustomLineItemImportDraft value = CustomLineItemImportDraft.of();
        value.setTaxCategory(new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl());
        Assertions.assertThat(value.getTaxCategory())
                .isEqualTo(new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl());
    }

    @Test
    public void priceMode() {
        CustomLineItemImportDraft value = CustomLineItemImportDraft.of();
        value.setPriceMode(com.commercetools.api.models.cart.CustomLineItemPriceMode.findEnum("Standard"));
        Assertions.assertThat(value.getPriceMode())
                .isEqualTo(com.commercetools.api.models.cart.CustomLineItemPriceMode.findEnum("Standard"));
    }

    @Test
    public void shippingDetails() {
        CustomLineItemImportDraft value = CustomLineItemImportDraft.of();
        value.setShippingDetails(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
        Assertions.assertThat(value.getShippingDetails())
                .isEqualTo(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
    }

    @Test
    public void state() {
        CustomLineItemImportDraft value = CustomLineItemImportDraft.of();
        value.setState(Collections.singletonList(new com.commercetools.api.models.order.ItemStateImpl()));
        Assertions.assertThat(value.getState())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.ItemStateImpl()));
    }

    @Test
    public void custom() {
        CustomLineItemImportDraft value = CustomLineItemImportDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
