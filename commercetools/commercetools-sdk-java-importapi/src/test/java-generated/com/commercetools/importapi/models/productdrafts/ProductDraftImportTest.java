
package com.commercetools.importapi.models.productdrafts;

import java.util.Collections;

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
public class ProductDraftImportTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductDraftImportBuilder builder) {
        ProductDraftImport productDraftImport = builder.buildUnchecked();
        Assertions.assertThat(productDraftImport).isInstanceOf(ProductDraftImport.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductDraftImport.builder()
                        .productType(new com.commercetools.importapi.models.common.ProductTypeKeyReferenceImpl()) },
                new Object[] { ProductDraftImport.builder()
                        .name(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { ProductDraftImport.builder()
                        .slug(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { ProductDraftImport.builder()
                        .description(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { ProductDraftImport.builder()
                        .categories(Collections.singletonList(
                            new com.commercetools.importapi.models.common.CategoryKeyReferenceImpl())) },
                new Object[] { ProductDraftImport.builder()
                        .metaTitle(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { ProductDraftImport.builder()
                        .metaDescription(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { ProductDraftImport.builder()
                        .metaKeywords(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { ProductDraftImport.builder()
                        .masterVariant(
                            new com.commercetools.importapi.models.productdrafts.ProductVariantDraftImportImpl()) },
                new Object[] { ProductDraftImport.builder()
                        .variants(Collections.singletonList(
                            new com.commercetools.importapi.models.productdrafts.ProductVariantDraftImportImpl())) },
                new Object[] { ProductDraftImport.builder()
                        .taxCategory(new com.commercetools.importapi.models.common.TaxCategoryKeyReferenceImpl()) },
                new Object[] { ProductDraftImport.builder()
                        .searchKeywords(new com.commercetools.importapi.models.products.SearchKeywordsImpl()) },
                new Object[] { ProductDraftImport.builder()
                        .state(new com.commercetools.importapi.models.common.StateKeyReferenceImpl()) },
                new Object[] { ProductDraftImport.builder().publish(true) },
                new Object[] { ProductDraftImport.builder()
                        .priceMode(
                            com.commercetools.importapi.models.common.ProductPriceModeEnum.findEnum("Embedded")) } };
    }

    @Test
    public void productType() {
        ProductDraftImport value = ProductDraftImport.of();
        value.setProductType(new com.commercetools.importapi.models.common.ProductTypeKeyReferenceImpl());
        Assertions.assertThat(value.getProductType())
                .isEqualTo(new com.commercetools.importapi.models.common.ProductTypeKeyReferenceImpl());
    }

    @Test
    public void name() {
        ProductDraftImport value = ProductDraftImport.of();
        value.setName(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }

    @Test
    public void slug() {
        ProductDraftImport value = ProductDraftImport.of();
        value.setSlug(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getSlug())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }

    @Test
    public void description() {
        ProductDraftImport value = ProductDraftImport.of();
        value.setDescription(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }

    @Test
    public void categories() {
        ProductDraftImport value = ProductDraftImport.of();
        value.setCategories(
            Collections.singletonList(new com.commercetools.importapi.models.common.CategoryKeyReferenceImpl()));
        Assertions.assertThat(value.getCategories())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.importapi.models.common.CategoryKeyReferenceImpl()));
    }

    @Test
    public void metaTitle() {
        ProductDraftImport value = ProductDraftImport.of();
        value.setMetaTitle(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaTitle())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }

    @Test
    public void metaDescription() {
        ProductDraftImport value = ProductDraftImport.of();
        value.setMetaDescription(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaDescription())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }

    @Test
    public void metaKeywords() {
        ProductDraftImport value = ProductDraftImport.of();
        value.setMetaKeywords(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaKeywords())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }

    @Test
    public void masterVariant() {
        ProductDraftImport value = ProductDraftImport.of();
        value.setMasterVariant(new com.commercetools.importapi.models.productdrafts.ProductVariantDraftImportImpl());
        Assertions.assertThat(value.getMasterVariant())
                .isEqualTo(new com.commercetools.importapi.models.productdrafts.ProductVariantDraftImportImpl());
    }

    @Test
    public void variants() {
        ProductDraftImport value = ProductDraftImport.of();
        value.setVariants(Collections
                .singletonList(new com.commercetools.importapi.models.productdrafts.ProductVariantDraftImportImpl()));
        Assertions.assertThat(value.getVariants())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.importapi.models.productdrafts.ProductVariantDraftImportImpl()));
    }

    @Test
    public void taxCategory() {
        ProductDraftImport value = ProductDraftImport.of();
        value.setTaxCategory(new com.commercetools.importapi.models.common.TaxCategoryKeyReferenceImpl());
        Assertions.assertThat(value.getTaxCategory())
                .isEqualTo(new com.commercetools.importapi.models.common.TaxCategoryKeyReferenceImpl());
    }

    @Test
    public void searchKeywords() {
        ProductDraftImport value = ProductDraftImport.of();
        value.setSearchKeywords(new com.commercetools.importapi.models.products.SearchKeywordsImpl());
        Assertions.assertThat(value.getSearchKeywords())
                .isEqualTo(new com.commercetools.importapi.models.products.SearchKeywordsImpl());
    }

    @Test
    public void state() {
        ProductDraftImport value = ProductDraftImport.of();
        value.setState(new com.commercetools.importapi.models.common.StateKeyReferenceImpl());
        Assertions.assertThat(value.getState())
                .isEqualTo(new com.commercetools.importapi.models.common.StateKeyReferenceImpl());
    }

    @Test
    public void publish() {
        ProductDraftImport value = ProductDraftImport.of();
        value.setPublish(true);
        Assertions.assertThat(value.getPublish()).isEqualTo(true);
    }

    @Test
    public void priceMode() {
        ProductDraftImport value = ProductDraftImport.of();
        value.setPriceMode(com.commercetools.importapi.models.common.ProductPriceModeEnum.findEnum("Embedded"));
        Assertions.assertThat(value.getPriceMode())
                .isEqualTo(com.commercetools.importapi.models.common.ProductPriceModeEnum.findEnum("Embedded"));
    }
}
