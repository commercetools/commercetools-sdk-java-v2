package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductDataQueryBuilderDsl  {
    public ProductDataQueryBuilderDsl() {
    }

    public static ProductDataQueryBuilderDsl of() {
        return new ProductDataQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ProductDataQueryBuilderDsl> name(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("name"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductDataQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ProductDataQueryBuilderDsl> categories(
        Function<com.commercetools.api.predicates.query.category.CategoryReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategoryReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("categories"))
            .inner(fn.apply(com.commercetools.api.predicates.query.category.CategoryReferenceQueryBuilderDsl.of())),
            ProductDataQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<ProductDataQueryBuilderDsl> categories() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("categories")),
                p -> new CombinationQueryPredicate<>(p, ProductDataQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductDataQueryBuilderDsl> categoryOrderHints(
        Function<com.commercetools.api.predicates.query.product.CategoryOrderHintsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.CategoryOrderHintsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("categoryOrderHints"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product.CategoryOrderHintsQueryBuilderDsl.of())),
            ProductDataQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ProductDataQueryBuilderDsl> description(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("description"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductDataQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ProductDataQueryBuilderDsl> slug(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("slug"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductDataQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ProductDataQueryBuilderDsl> metaTitle(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("metaTitle"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductDataQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ProductDataQueryBuilderDsl> metaDescription(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("metaDescription"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductDataQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ProductDataQueryBuilderDsl> metaKeywords(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("metaKeywords"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductDataQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ProductDataQueryBuilderDsl> masterVariant(
        Function<com.commercetools.api.predicates.query.product.ProductVariantQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductVariantQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("masterVariant"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductVariantQueryBuilderDsl.of())),
            ProductDataQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ProductDataQueryBuilderDsl> variants(
        Function<com.commercetools.api.predicates.query.product.ProductVariantQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductVariantQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("variants"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductVariantQueryBuilderDsl.of())),
            ProductDataQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<ProductDataQueryBuilderDsl> variants() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variants")),
                p -> new CombinationQueryPredicate<>(p, ProductDataQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductDataQueryBuilderDsl> searchKeywords(
        Function<com.commercetools.api.predicates.query.product.SearchKeywordsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.SearchKeywordsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("searchKeywords"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product.SearchKeywordsQueryBuilderDsl.of())),
            ProductDataQueryBuilderDsl::of);
    }
    
    
}
