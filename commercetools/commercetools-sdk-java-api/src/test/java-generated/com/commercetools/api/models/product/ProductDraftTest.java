
package com.commercetools.api.models.product;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductDraftBuilder builder) {
        ProductDraft productDraft = builder.buildUnchecked();
        Assertions.assertThat(productDraft).isInstanceOf(ProductDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "productType", ProductDraft.builder()
                .productType(new com.commercetools.api.models.product_type.ProductTypeResourceIdentifierImpl()) },
                new Object[] { "name",
                        ProductDraft.builder().name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "slug",
                        ProductDraft.builder().slug(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "key", ProductDraft.builder().key("key") },
                new Object[] { "description",
                        ProductDraft.builder()
                                .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "categories",
                        ProductDraft.builder()
                                .categories(Collections.singletonList(
                                    new com.commercetools.api.models.category.CategoryResourceIdentifierImpl())) },
                new Object[] { "categoryOrderHints", ProductDraft.builder()
                        .categoryOrderHints(new com.commercetools.api.models.product.CategoryOrderHintsImpl()) },
                new Object[] { "metaTitle",
                        ProductDraft.builder()
                                .metaTitle(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "metaDescription",
                        ProductDraft.builder()
                                .metaDescription(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "metaKeywords",
                        ProductDraft.builder()
                                .metaKeywords(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "masterVariant",
                        ProductDraft.builder()
                                .masterVariant(new com.commercetools.api.models.product.ProductVariantDraftImpl()) },
                new Object[] { "variants",
                        ProductDraft.builder()
                                .variants(Collections.singletonList(
                                    new com.commercetools.api.models.product.ProductVariantDraftImpl())) },
                new Object[] { "taxCategory", ProductDraft.builder()
                        .taxCategory(
                            new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl()) },
                new Object[] { "searchKeywords",
                        ProductDraft.builder()
                                .searchKeywords(new com.commercetools.api.models.product.SearchKeywordsImpl()) },
                new Object[] { "state",
                        ProductDraft.builder()
                                .state(new com.commercetools.api.models.state.StateResourceIdentifierImpl()) },
                new Object[] { "publish", ProductDraft.builder().publish(true) },
                new Object[] { "priceMode", ProductDraft.builder()
                        .priceMode(com.commercetools.api.models.product.ProductPriceModeEnum.findEnum("Embedded")) },
                new Object[] { "attributes", ProductDraft.builder()
                        .attributes(
                            Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl())) } };
    }

    @Test
    public void productType() {
        ProductDraft value = ProductDraft.of();
        value.setProductType(new com.commercetools.api.models.product_type.ProductTypeResourceIdentifierImpl());
        Assertions.assertThat(value.getProductType())
                .isEqualTo(new com.commercetools.api.models.product_type.ProductTypeResourceIdentifierImpl());
    }

    @Test
    public void name() {
        ProductDraft value = ProductDraft.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void slug() {
        ProductDraft value = ProductDraft.of();
        value.setSlug(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getSlug()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void key() {
        ProductDraft value = ProductDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void description() {
        ProductDraft value = ProductDraft.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void categories() {
        ProductDraft value = ProductDraft.of();
        value.setCategories(
            Collections.singletonList(new com.commercetools.api.models.category.CategoryResourceIdentifierImpl()));
        Assertions.assertThat(value.getCategories())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.category.CategoryResourceIdentifierImpl()));
    }

    @Test
    public void categoryOrderHints() {
        ProductDraft value = ProductDraft.of();
        value.setCategoryOrderHints(new com.commercetools.api.models.product.CategoryOrderHintsImpl());
        Assertions.assertThat(value.getCategoryOrderHints())
                .isEqualTo(new com.commercetools.api.models.product.CategoryOrderHintsImpl());
    }

    @Test
    public void metaTitle() {
        ProductDraft value = ProductDraft.of();
        value.setMetaTitle(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaTitle())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void metaDescription() {
        ProductDraft value = ProductDraft.of();
        value.setMetaDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void metaKeywords() {
        ProductDraft value = ProductDraft.of();
        value.setMetaKeywords(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaKeywords())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void masterVariant() {
        ProductDraft value = ProductDraft.of();
        value.setMasterVariant(new com.commercetools.api.models.product.ProductVariantDraftImpl());
        Assertions.assertThat(value.getMasterVariant())
                .isEqualTo(new com.commercetools.api.models.product.ProductVariantDraftImpl());
    }

    @Test
    public void variants() {
        ProductDraft value = ProductDraft.of();
        value.setVariants(
            Collections.singletonList(new com.commercetools.api.models.product.ProductVariantDraftImpl()));
        Assertions.assertThat(value.getVariants())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.product.ProductVariantDraftImpl()));
    }

    @Test
    public void taxCategory() {
        ProductDraft value = ProductDraft.of();
        value.setTaxCategory(new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl());
        Assertions.assertThat(value.getTaxCategory())
                .isEqualTo(new com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl());
    }

    @Test
    public void searchKeywords() {
        ProductDraft value = ProductDraft.of();
        value.setSearchKeywords(new com.commercetools.api.models.product.SearchKeywordsImpl());
        Assertions.assertThat(value.getSearchKeywords())
                .isEqualTo(new com.commercetools.api.models.product.SearchKeywordsImpl());
    }

    @Test
    public void state() {
        ProductDraft value = ProductDraft.of();
        value.setState(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
        Assertions.assertThat(value.getState())
                .isEqualTo(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
    }

    @Test
    public void publish() {
        ProductDraft value = ProductDraft.of();
        value.setPublish(true);
        Assertions.assertThat(value.getPublish()).isEqualTo(true);
    }

    @Test
    public void priceMode() {
        ProductDraft value = ProductDraft.of();
        value.setPriceMode(com.commercetools.api.models.product.ProductPriceModeEnum.findEnum("Embedded"));
        Assertions.assertThat(value.getPriceMode())
                .isEqualTo(com.commercetools.api.models.product.ProductPriceModeEnum.findEnum("Embedded"));
    }

    @Test
    public void attributes() {
        ProductDraft value = ProductDraft.of();
        value.setAttributes(Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl()));
    }
}
