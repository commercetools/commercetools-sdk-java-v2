
package com.commercetools.api.predicates.query.product;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductDraftQueryBuilderDsl {
    public ProductDraftQueryBuilderDsl() {
    }

    public static ProductDraftQueryBuilderDsl of() {
        return new ProductDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ProductDraftQueryBuilderDsl> productType(
            Function<com.commercetools.api.predicates.query.product_type.ProductTypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.ProductTypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("productType"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_type.ProductTypeResourceIdentifierQueryBuilderDsl
                            .of())),
            ProductDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductDraftQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductDraftQueryBuilderDsl> slug(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("slug"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductDraftQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ProductDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ProductDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductDraftQueryBuilderDsl> description(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("description"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductDraftQueryBuilderDsl> categories(
            Function<com.commercetools.api.predicates.query.category.CategoryResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategoryResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("categories"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.category.CategoryResourceIdentifierQueryBuilderDsl.of())),
            ProductDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductDraftQueryBuilderDsl> categories() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("categories")),
            p -> new CombinationQueryPredicate<>(p, ProductDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductDraftQueryBuilderDsl> categoryOrderHints(
            Function<com.commercetools.api.predicates.query.product.CategoryOrderHintsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.CategoryOrderHintsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("categoryOrderHints"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.product.CategoryOrderHintsQueryBuilderDsl.of())),
            ProductDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductDraftQueryBuilderDsl> metaTitle(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("metaTitle"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductDraftQueryBuilderDsl> metaDescription(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("metaDescription"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductDraftQueryBuilderDsl> metaKeywords(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("metaKeywords"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductDraftQueryBuilderDsl> masterVariant(
            Function<com.commercetools.api.predicates.query.product.ProductVariantDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductVariantDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("masterVariant"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.product.ProductVariantDraftQueryBuilderDsl.of())),
            ProductDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductDraftQueryBuilderDsl> variants(
            Function<com.commercetools.api.predicates.query.product.ProductVariantDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductVariantDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("variants"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.product.ProductVariantDraftQueryBuilderDsl.of())),
            ProductDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductDraftQueryBuilderDsl> variants() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variants")),
            p -> new CombinationQueryPredicate<>(p, ProductDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductDraftQueryBuilderDsl> taxCategory(
            Function<com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("taxCategory"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl
                            .of())),
            ProductDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductDraftQueryBuilderDsl> searchKeywords(
            Function<com.commercetools.api.predicates.query.product.SearchKeywordsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.SearchKeywordsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("searchKeywords"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.product.SearchKeywordsQueryBuilderDsl.of())),
            ProductDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductDraftQueryBuilderDsl> state(
            Function<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("state"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl.of())),
            ProductDraftQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ProductDraftQueryBuilderDsl> publish() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("publish")),
            p -> new CombinationQueryPredicate<>(p, ProductDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductDraftQueryBuilderDsl> priceMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("priceMode")),
            p -> new CombinationQueryPredicate<>(p, ProductDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductDraftQueryBuilderDsl> attributes(
            Function<com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("attributes"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl.of())),
            ProductDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductDraftQueryBuilderDsl> attributes() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributes")),
            p -> new CombinationQueryPredicate<>(p, ProductDraftQueryBuilderDsl::of));
    }

}
