
package com.commercetools.importapi.models.products;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductImportTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductImportBuilder builder) {
        ProductImport productImport = builder.buildUnchecked();
        Assertions.assertThat(productImport).isInstanceOf(ProductImport.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ProductImport.builder().key("key") },
                new Object[] { "name",
                        ProductImport.builder()
                                .name(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { "productType", ProductImport.builder()
                        .productType(new com.commercetools.importapi.models.common.ProductTypeKeyReferenceImpl()) },
                new Object[] { "slug",
                        ProductImport.builder()
                                .slug(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { "description",
                        ProductImport.builder()
                                .description(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { "categories",
                        ProductImport.builder()
                                .categories(Collections.singletonList(
                                    new com.commercetools.importapi.models.common.CategoryKeyReferenceImpl())) },
                new Object[] { "attributes",
                        ProductImport.builder()
                                .attributes(Collections.singletonList(
                                    new com.commercetools.importapi.models.productvariants.AttributeImpl())) },
                new Object[] { "metaTitle",
                        ProductImport.builder()
                                .metaTitle(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { "metaDescription",
                        ProductImport.builder()
                                .metaDescription(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { "metaKeywords",
                        ProductImport.builder()
                                .metaKeywords(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { "taxCategory", ProductImport.builder()
                        .taxCategory(new com.commercetools.importapi.models.common.TaxCategoryKeyReferenceImpl()) },
                new Object[] { "searchKeywords",
                        ProductImport.builder()
                                .searchKeywords(new com.commercetools.importapi.models.products.SearchKeywordsImpl()) },
                new Object[] { "state",
                        ProductImport.builder()
                                .state(new com.commercetools.importapi.models.common.StateKeyReferenceImpl()) },
                new Object[] { "publish", ProductImport.builder().publish(true) },
                new Object[] { "priceMode", ProductImport.builder()
                        .priceMode(
                            com.commercetools.importapi.models.common.ProductPriceModeEnum.findEnum("Embedded")) } };
    }

    @Test
    public void key() {
        ProductImport value = ProductImport.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void name() {
        ProductImport value = ProductImport.of();
        value.setName(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }

    @Test
    public void productType() {
        ProductImport value = ProductImport.of();
        value.setProductType(new com.commercetools.importapi.models.common.ProductTypeKeyReferenceImpl());
        Assertions.assertThat(value.getProductType())
                .isEqualTo(new com.commercetools.importapi.models.common.ProductTypeKeyReferenceImpl());
    }

    @Test
    public void slug() {
        ProductImport value = ProductImport.of();
        value.setSlug(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getSlug())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }

    @Test
    public void description() {
        ProductImport value = ProductImport.of();
        value.setDescription(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }

    @Test
    public void categories() {
        ProductImport value = ProductImport.of();
        value.setCategories(
            Collections.singletonList(new com.commercetools.importapi.models.common.CategoryKeyReferenceImpl()));
        Assertions.assertThat(value.getCategories())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.importapi.models.common.CategoryKeyReferenceImpl()));
    }

    @Test
    public void attributes() {
        ProductImport value = ProductImport.of();
        value.setAttributes(
            Collections.singletonList(new com.commercetools.importapi.models.productvariants.AttributeImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.importapi.models.productvariants.AttributeImpl()));
    }

    @Test
    public void metaTitle() {
        ProductImport value = ProductImport.of();
        value.setMetaTitle(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaTitle())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }

    @Test
    public void metaDescription() {
        ProductImport value = ProductImport.of();
        value.setMetaDescription(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaDescription())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }

    @Test
    public void metaKeywords() {
        ProductImport value = ProductImport.of();
        value.setMetaKeywords(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaKeywords())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }

    @Test
    public void taxCategory() {
        ProductImport value = ProductImport.of();
        value.setTaxCategory(new com.commercetools.importapi.models.common.TaxCategoryKeyReferenceImpl());
        Assertions.assertThat(value.getTaxCategory())
                .isEqualTo(new com.commercetools.importapi.models.common.TaxCategoryKeyReferenceImpl());
    }

    @Test
    public void searchKeywords() {
        ProductImport value = ProductImport.of();
        value.setSearchKeywords(new com.commercetools.importapi.models.products.SearchKeywordsImpl());
        Assertions.assertThat(value.getSearchKeywords())
                .isEqualTo(new com.commercetools.importapi.models.products.SearchKeywordsImpl());
    }

    @Test
    public void state() {
        ProductImport value = ProductImport.of();
        value.setState(new com.commercetools.importapi.models.common.StateKeyReferenceImpl());
        Assertions.assertThat(value.getState())
                .isEqualTo(new com.commercetools.importapi.models.common.StateKeyReferenceImpl());
    }

    @Test
    public void publish() {
        ProductImport value = ProductImport.of();
        value.setPublish(true);
        Assertions.assertThat(value.getPublish()).isEqualTo(true);
    }

    @Test
    public void priceMode() {
        ProductImport value = ProductImport.of();
        value.setPriceMode(com.commercetools.importapi.models.common.ProductPriceModeEnum.findEnum("Embedded"));
        Assertions.assertThat(value.getPriceMode())
                .isEqualTo(com.commercetools.importapi.models.common.ProductPriceModeEnum.findEnum("Embedded"));
    }
}
