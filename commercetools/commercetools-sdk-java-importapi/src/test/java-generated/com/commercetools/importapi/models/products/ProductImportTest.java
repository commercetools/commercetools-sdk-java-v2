
package com.commercetools.importapi.models.products;

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
public class ProductImportTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductImportBuilder builder) {
        ProductImport productImport = builder.buildUnchecked();
        Assertions.assertThat(productImport).isInstanceOf(ProductImport.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductImport.builder().key("key") },
                new Object[] { ProductImport.builder()
                        .name(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { ProductImport.builder()
                        .productType(new com.commercetools.importapi.models.common.ProductTypeKeyReferenceImpl()) },
                new Object[] { ProductImport.builder()
                        .slug(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { ProductImport.builder()
                        .description(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { ProductImport.builder()
                        .categories(Collections.singletonList(
                            new com.commercetools.importapi.models.common.CategoryKeyReferenceImpl())) },
                new Object[] { ProductImport.builder()
                        .metaTitle(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { ProductImport.builder()
                        .metaDescription(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { ProductImport.builder()
                        .metaKeywords(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { ProductImport.builder()
                        .taxCategory(new com.commercetools.importapi.models.common.TaxCategoryKeyReferenceImpl()) },
                new Object[] { ProductImport.builder()
                        .searchKeywords(new com.commercetools.importapi.models.products.SearchKeywordsImpl()) },
                new Object[] { ProductImport.builder()
                        .state(new com.commercetools.importapi.models.common.StateKeyReferenceImpl()) },
                new Object[] { ProductImport.builder().publish(true) },
                new Object[] { ProductImport.builder()
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
