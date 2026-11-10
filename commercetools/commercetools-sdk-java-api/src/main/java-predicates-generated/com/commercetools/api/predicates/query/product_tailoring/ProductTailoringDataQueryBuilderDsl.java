
package com.commercetools.api.predicates.query.product_tailoring;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductTailoringDataQueryBuilderDsl {
    public ProductTailoringDataQueryBuilderDsl() {
    }

    public static ProductTailoringDataQueryBuilderDsl of() {
        return new ProductTailoringDataQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ProductTailoringDataQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductTailoringDataQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringDataQueryBuilderDsl> description(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("description"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductTailoringDataQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringDataQueryBuilderDsl> metaTitle(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("metaTitle"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductTailoringDataQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringDataQueryBuilderDsl> metaDescription(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("metaDescription"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductTailoringDataQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringDataQueryBuilderDsl> metaKeywords(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("metaKeywords"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductTailoringDataQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringDataQueryBuilderDsl> slug(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("slug"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductTailoringDataQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringDataQueryBuilderDsl> variants(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductVariantTailoringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductVariantTailoringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("variants"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_tailoring.ProductVariantTailoringQueryBuilderDsl
                            .of())),
            ProductTailoringDataQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductTailoringDataQueryBuilderDsl> variants() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variants")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringDataQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTailoringDataQueryBuilderDsl> attributes(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringAttributeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringAttributeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("attributes"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_tailoring.ProductTailoringAttributeQueryBuilderDsl
                            .of())),
            ProductTailoringDataQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductTailoringDataQueryBuilderDsl> attributes() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributes")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringDataQueryBuilderDsl::of));
    }

}
