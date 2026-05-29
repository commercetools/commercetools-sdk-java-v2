
package com.commercetools.importapi.models.product_tailoring;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTailoringImportTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTailoringImportBuilder builder) {
        ProductTailoringImport productTailoringImport = builder.buildUnchecked();
        Assertions.assertThat(productTailoringImport).isInstanceOf(ProductTailoringImport.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ProductTailoringImport.builder().key("key") },
                new Object[] { "store",
                        ProductTailoringImport.builder()
                                .store(new com.commercetools.importapi.models.common.StoreKeyReferenceImpl()) },
                new Object[] { "product",
                        ProductTailoringImport.builder()
                                .product(new com.commercetools.importapi.models.common.ProductKeyReferenceImpl()) },
                new Object[] { "name",
                        ProductTailoringImport.builder()
                                .name(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { "description",
                        ProductTailoringImport.builder()
                                .description(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { "metaTitle",
                        ProductTailoringImport.builder()
                                .metaTitle(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { "metaDescription",
                        ProductTailoringImport.builder()
                                .metaDescription(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { "metaKeywords",
                        ProductTailoringImport.builder()
                                .metaKeywords(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { "slug",
                        ProductTailoringImport.builder()
                                .slug(new com.commercetools.importapi.models.common.LocalizedStringImpl()) },
                new Object[] { "publish", ProductTailoringImport.builder().publish(true) },
                new Object[] { "variants", ProductTailoringImport.builder()
                        .variants(Collections.singletonList(
                            new com.commercetools.importapi.models.product_tailoring.ProductVariantTailoringImportImpl())) },
                new Object[] { "attributes",
                        ProductTailoringImport.builder()
                                .attributes(Collections.singletonList(
                                    new com.commercetools.importapi.models.productvariants.AttributeImpl())) } };
    }

    @Test
    public void key() {
        ProductTailoringImport value = ProductTailoringImport.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void store() {
        ProductTailoringImport value = ProductTailoringImport.of();
        value.setStore(new com.commercetools.importapi.models.common.StoreKeyReferenceImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.importapi.models.common.StoreKeyReferenceImpl());
    }

    @Test
    public void product() {
        ProductTailoringImport value = ProductTailoringImport.of();
        value.setProduct(new com.commercetools.importapi.models.common.ProductKeyReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.importapi.models.common.ProductKeyReferenceImpl());
    }

    @Test
    public void name() {
        ProductTailoringImport value = ProductTailoringImport.of();
        value.setName(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }

    @Test
    public void description() {
        ProductTailoringImport value = ProductTailoringImport.of();
        value.setDescription(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }

    @Test
    public void metaTitle() {
        ProductTailoringImport value = ProductTailoringImport.of();
        value.setMetaTitle(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaTitle())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }

    @Test
    public void metaDescription() {
        ProductTailoringImport value = ProductTailoringImport.of();
        value.setMetaDescription(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaDescription())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }

    @Test
    public void metaKeywords() {
        ProductTailoringImport value = ProductTailoringImport.of();
        value.setMetaKeywords(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getMetaKeywords())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }

    @Test
    public void slug() {
        ProductTailoringImport value = ProductTailoringImport.of();
        value.setSlug(new com.commercetools.importapi.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getSlug())
                .isEqualTo(new com.commercetools.importapi.models.common.LocalizedStringImpl());
    }

    @Test
    public void publish() {
        ProductTailoringImport value = ProductTailoringImport.of();
        value.setPublish(true);
        Assertions.assertThat(value.getPublish()).isEqualTo(true);
    }

    @Test
    public void variants() {
        ProductTailoringImport value = ProductTailoringImport.of();
        value.setVariants(Collections.singletonList(
            new com.commercetools.importapi.models.product_tailoring.ProductVariantTailoringImportImpl()));
        Assertions.assertThat(value.getVariants())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.importapi.models.product_tailoring.ProductVariantTailoringImportImpl()));
    }

    @Test
    public void attributes() {
        ProductTailoringImport value = ProductTailoringImport.of();
        value.setAttributes(
            Collections.singletonList(new com.commercetools.importapi.models.productvariants.AttributeImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.importapi.models.productvariants.AttributeImpl()));
    }
}
