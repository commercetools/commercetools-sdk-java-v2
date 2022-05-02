
package com.commercetools.importapi.product;

import static com.commercetools.importapi.category.CategoryFixtures.withCategory;
import static com.commercetools.importapi.product_type.ProductTypeFixtures.withProductType;
import static com.commercetools.importapi.tax_category.TaxCategoryFixtures.withTaxCategory;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.category.Category;
import com.commercetools.api.models.category.CategoryResourceIdentifierBuilder;
import com.commercetools.api.models.common.*;
import com.commercetools.api.models.product.*;
import com.commercetools.api.models.product_type.*;
import com.commercetools.api.models.tax_category.TaxCategory;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder;
import com.commercetools.importapi.utils.CommercetoolsTestUtils;

import io.vrap.rmf.base.client.ApiHttpResponse;

import org.junit.jupiter.api.Assertions;

public class ProductFixtures {

    public static void withProduct(final Consumer<Product> consumer) {
        withTaxCategory(
            taxCategory -> withCategory(category -> withProductType(createProductTypeDraft(), productType -> {
                Product product = createProduct(productType, category, taxCategory);
                try {
                    consumer.accept(product);
                }
                finally {
                    deleteProductById(product.getId(), product.getVersion());
                }
            })));
    }

    public static void withUpdateableProduct(final UnaryOperator<Product> operator) {
        withTaxCategory(
            taxCategory -> withCategory(category -> withProductType(createProductTypeDraft(), productType -> {
                Product product = createProduct(productType, category, taxCategory);
                try {
                    product = operator.apply(product);
                }
                finally {
                    deleteProductById(product.getId(), product.getVersion());
                }
            })));
    }

    public static ProductTypeDraft createProductTypeDraft() {
        return ProductTypeDraftBuilder.of()
                .key(CommercetoolsTestUtils.randomKey())
                .name(CommercetoolsTestUtils.randomString())
                .description(CommercetoolsTestUtils.randomString())
                .attributes(
                    AttributeDefinitionDraftBuilder.of()
                            .name("test-text")
                            .label(LocalizedStringBuilder.of().addValue("en", "test-text").build())
                            .isRequired(false)
                            .type(AttributeTextTypeBuilder.of().build())
                            .build(),
                    AttributeDefinitionDraftBuilder.of()
                            .name("test-number")
                            .label(LocalizedStringBuilder.of().addValue("en", "test-number").build())
                            .isRequired(false)
                            .type(AttributeNumberTypeBuilder.of().build())
                            .build(),
                    AttributeDefinitionDraftBuilder.of()
                            .name("test-integer")
                            .label(LocalizedStringBuilder.of().addValue("en", "test-integer").build())
                            .isRequired(false)
                            .type(AttributeNumberTypeBuilder.of().build())
                            .build(),
                    AttributeDefinitionDraftBuilder.of()
                            .name("test-enum")
                            .label(LocalizedStringBuilder.of().addValue("en", "test-enum").build())
                            .isRequired(false)
                            .type(AttributeEnumTypeBuilder.of()
                                    .values(AttributePlainEnumValueBuilder.of().key("test").label("test").build())
                                    .build())
                            .build(),
                    AttributeDefinitionDraftBuilder.of()
                            .name("test-set-text")
                            .label(LocalizedStringBuilder.of().addValue("en", "test-set-text").build())
                            .isRequired(false)
                            .type(
                                AttributeSetTypeBuilder.of().elementType(AttributeTextTypeBuilder.of().build()).build())
                            .build(),
                    AttributeDefinitionDraftBuilder.of()
                            .name("test-set-number")
                            .label(LocalizedStringBuilder.of().addValue("en", "test-set-number").build())
                            .isRequired(false)
                            .type(AttributeSetTypeBuilder.of()
                                    .elementType(AttributeNumberTypeBuilder.of().build())
                                    .build())
                            .build(),
                    AttributeDefinitionDraftBuilder.of()
                            .name("test-set-integer")
                            .label(LocalizedStringBuilder.of().addValue("en", "test-set-integer").build())
                            .isRequired(false)
                            .type(AttributeSetTypeBuilder.of()
                                    .elementType(AttributeNumberTypeBuilder.of().build())
                                    .build())
                            .build())
                .build();
    }

    public static Product createProduct(ProductType productType, Category category, TaxCategory taxCategory) {
        String randomKey = CommercetoolsTestUtils.randomKey();

        Map<String, String> orderHint = new HashMap<>();
        orderHint.put(category.getId(), "0.5");

        PriceDraft priceDraft = PriceDraftBuilder.of()
                .value(CentPrecisionMoneyDraftBuilder.of().centAmount(100L).currencyCode("EUR").build())
                .country("DE")
                .validFrom(ZonedDateTime.now())
                .validUntil(ZonedDateTime.now().plus(1, ChronoUnit.HOURS))
                .tiers(Arrays.asList(PriceTierDraftBuilder.of()
                        .minimumQuantity(10L)
                        .value(CentPrecisionMoneyDraftBuilder.of().centAmount(100L).currencyCode("EUR").build())
                        .build()))
                .build();

        ProductVariantDraft productVariantDraft = ProductVariantDraftBuilder.of()
                .sku(CommercetoolsTestUtils.randomString())
                .key(CommercetoolsTestUtils.randomKey())
                .prices(Arrays.asList(priceDraft))
                .images(Arrays.asList(ImageBuilder.of()
                        .url("http://www.google.com")
                        .dimensions(ImageDimensionsBuilder.of().w(100).h(100).build())
                        .label(CommercetoolsTestUtils.randomString())
                        .build()))
                .assets(Arrays.asList(AssetDraftBuilder.of()
                        .key(CommercetoolsTestUtils.randomKey())
                        .sources(Arrays.asList(AssetSourceBuilder.of()
                                .uri("http://www.google.com")
                                .key(CommercetoolsTestUtils.randomKey())
                                .dimensions(AssetDimensionsBuilder.of().h(10).w(10).build())
                                .contentType("application/json")
                                .build()))
                        .name(CommercetoolsTestUtils.randomLocalizedString())
                        .build()))
                .attributes(AttributeBuilder.of().name("test-text").value("foo").build(),
                    AttributeBuilder.of().name("test-number").value(10.0).build(),
                    AttributeBuilder.of().name("test-integer").value(10).build(),
                    AttributeBuilder.of().name("test-enum").value("test").build(),
                    AttributeBuilder.of().name("test-set-text").value(Collections.singletonList("foo")).build(),
                    AttributeBuilder.of().name("test-set-integer").value(Collections.singletonList(11)).build(),
                    AttributeBuilder.of().name("test-set-number").value(Collections.singletonList(11.0)).build())
                .build();

        ProductDraft productDraft = ProductDraftBuilder.of()
                .key(randomKey)
                .name(CommercetoolsTestUtils.randomLocalizedString())
                .productType(ProductTypeResourceIdentifierBuilder.of().id(productType.getId()).build())
                .slug(CommercetoolsTestUtils.randomLocalizedString())
                .description(CommercetoolsTestUtils.randomLocalizedString())
                .categories(Arrays.asList(CategoryResourceIdentifierBuilder.of().id(category.getId()).build()))
                .categoryOrderHints(CategoryOrderHintsBuilder.of().values(orderHint).build())
                .metaTitle(CommercetoolsTestUtils.randomLocalizedString())
                .metaDescription(CommercetoolsTestUtils.randomLocalizedString())
                .metaKeywords(CommercetoolsTestUtils.randomLocalizedString())
                .masterVariant(productVariantDraft)
                .taxCategory(TaxCategoryResourceIdentifierBuilder.of().id(taxCategory.getId()).build())
                .publish(false)
                .build();

        Product product = CommercetoolsTestUtils.getProjectApiRoot()
                .products()
                .post(productDraft)
                .executeBlocking()
                .getBody();
        Assertions.assertNotNull(product);
        Assertions.assertEquals(product.getKey(), productDraft.getKey());

        return product;
    }

    public static Product deleteProduct(Product product) {
        Product rProduct = null;
        try {
            rProduct = CompletableFuture.completedFuture(product).thenComposeAsync(product1 -> {
                if (product1.getMasterData().getPublished()) {
                    return CommercetoolsTestUtils.getProjectApiRoot()
                            .products()
                            .withId(product1.getId())
                            .post(ProductUpdateBuilder.of()
                                    .version(product1.getVersion())
                                    .actions(ProductUnpublishAction.of())
                                    .build())
                            .execute()
                            .thenApply(ApiHttpResponse::getBody);
                }
                return CompletableFuture.completedFuture(product1);
            })
                    .thenComposeAsync(product1 -> CommercetoolsTestUtils.getProjectApiRoot()
                            .products()
                            .withId(product1.getId())
                            .delete()
                            .withVersion(product1.getVersion())
                            .execute())
                    .get()
                    .getBody();
        }
        catch (Exception ignored) {
        }

        Assertions.assertNotNull(rProduct);
        Assertions.assertEquals(rProduct.getId(), product.getId());
        return rProduct;
    }

    public static Product deleteProductById(final String id, final Long version) {
        Product product = null;
        try {
            product = CommercetoolsTestUtils.getProjectApiRoot()
                    .products()
                    .withId(id)
                    .get()
                    .execute()
                    .thenComposeAsync(productApiHttpResponse -> {
                        Product product1 = productApiHttpResponse.getBody();
                        if (product1.getMasterData().getPublished()) {
                            return CommercetoolsTestUtils.getProjectApiRoot()
                                    .products()
                                    .withId(product1.getId())
                                    .post(ProductUpdateBuilder.of()
                                            .version(product1.getVersion())
                                            .actions(ProductUnpublishAction.of())
                                            .build())
                                    .execute();
                        }
                        return CompletableFuture.completedFuture(productApiHttpResponse);
                    })
                    .thenComposeAsync(productApiHttpResponse -> CommercetoolsTestUtils.getProjectApiRoot()
                            .products()
                            .withId(productApiHttpResponse.getBody().getId())
                            .delete()
                            .withVersion(productApiHttpResponse.getBody().getVersion())
                            .execute())
                    .get()
                    .getBody();
        }
        catch (Exception e) {
        }

        return product;
    }

    public static Product deleteProductByKey(final String key, final Long version) {
        Product product = CommercetoolsTestUtils.getProjectApiRoot()
                .products()
                .withKey(key)
                .delete()
                .withVersion(version)
                .executeBlocking()
                .getBody();
        Assertions.assertNotNull(product);
        Assertions.assertEquals(product.getKey(), key);
        return product;
    }

}
