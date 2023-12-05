
package com.commercetools.api.models.product;

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
public class ProductDataTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductDataBuilder builder) {
        ProductData productData = builder.buildUnchecked();
        Assertions.assertThat(productData).isInstanceOf(ProductData.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        ProductData.builder().name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { ProductData.builder()
                        .categories(Collections
                                .singletonList(new com.commercetools.api.models.category.CategoryReferenceImpl())) },
                new Object[] { ProductData.builder()
                        .categoryOrderHints(new com.commercetools.api.models.product.CategoryOrderHintsImpl()) },
                new Object[] { ProductData.builder()
                        .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] {
                        ProductData.builder().slug(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { ProductData.builder()
                        .metaTitle(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { ProductData.builder()
                        .metaDescription(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { ProductData.builder()
                        .metaKeywords(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { ProductData.builder()
                        .masterVariant(new com.commercetools.api.models.product.ProductVariantImpl()) },
                new Object[] {
                        ProductData.builder()
                                .variants(Collections.singletonList(
                                    new com.commercetools.api.models.product.ProductVariantImpl())) },
                new Object[] { ProductData.builder()
                        .searchKeywords(new com.commercetools.api.models.product.SearchKeywordsImpl()) } };
    }

    @Test
    public void name() {
        ProductData value = ProductData.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void categories() {
        ProductData value = ProductData.of();
        value.setCategories(
            Collections.singletonList(new com.commercetools.api.models.category.CategoryReferenceImpl()));
        Assertions.assertThat(value.getCategories())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.category.CategoryReferenceImpl()));
    }

    @Test
    public void categoryOrderHints() {
        ProductData value = ProductData.of();
        value.setCategoryOrderHints(new com.commercetools.api.models.product.CategoryOrderHintsImpl());
        Assertions.assertThat(value.getCategoryOrderHints())
                .isEqualTo(new com.commercetools.api.models.product.CategoryOrderHintsImpl());
    }

    @Test
    public void description() {
        ProductData value = ProductData.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void slug() {
        ProductData value = ProductData.of();
        value.setSlug(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getSlug()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void metaTitle() {
        ProductData value = ProductData.of();
        value.setMetaTitle(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaTitle())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void metaDescription() {
        ProductData value = ProductData.of();
        value.setMetaDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void metaKeywords() {
        ProductData value = ProductData.of();
        value.setMetaKeywords(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaKeywords())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void masterVariant() {
        ProductData value = ProductData.of();
        value.setMasterVariant(new com.commercetools.api.models.product.ProductVariantImpl());
        Assertions.assertThat(value.getMasterVariant())
                .isEqualTo(new com.commercetools.api.models.product.ProductVariantImpl());
    }

    @Test
    public void variants() {
        ProductData value = ProductData.of();
        value.setVariants(Collections.singletonList(new com.commercetools.api.models.product.ProductVariantImpl()));
        Assertions.assertThat(value.getVariants())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.product.ProductVariantImpl()));
    }

    @Test
    public void searchKeywords() {
        ProductData value = ProductData.of();
        value.setSearchKeywords(new com.commercetools.api.models.product.SearchKeywordsImpl());
        Assertions.assertThat(value.getSearchKeywords())
                .isEqualTo(new com.commercetools.api.models.product.SearchKeywordsImpl());
    }
}
