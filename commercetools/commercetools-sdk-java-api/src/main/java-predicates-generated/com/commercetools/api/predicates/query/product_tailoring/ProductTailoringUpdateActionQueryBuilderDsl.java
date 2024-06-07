
package com.commercetools.api.predicates.query.product_tailoring;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductTailoringUpdateActionQueryBuilderDsl {
    public ProductTailoringUpdateActionQueryBuilderDsl() {
    }

    public static ProductTailoringUpdateActionQueryBuilderDsl of() {
        return new ProductTailoringUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTailoringUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringUpdateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTailoringUpdateActionQueryBuilderDsl> asPublish(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringPublishActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringPublishActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_tailoring.ProductTailoringPublishActionQueryBuilderDsl.of()),
            ProductTailoringUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringUpdateActionQueryBuilderDsl> asSetDescription(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetDescriptionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetDescriptionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetDescriptionActionQueryBuilderDsl
                    .of()),
            ProductTailoringUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringUpdateActionQueryBuilderDsl> asSetMetaAttributes(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetMetaAttributesActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetMetaAttributesActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetMetaAttributesActionQueryBuilderDsl
                    .of()),
            ProductTailoringUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringUpdateActionQueryBuilderDsl> asSetMetaDescription(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetMetaDescriptionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetMetaDescriptionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetMetaDescriptionActionQueryBuilderDsl
                    .of()),
            ProductTailoringUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringUpdateActionQueryBuilderDsl> asSetMetaKeywords(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetMetaKeywordsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetMetaKeywordsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetMetaKeywordsActionQueryBuilderDsl
                    .of()),
            ProductTailoringUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringUpdateActionQueryBuilderDsl> asSetMetaTitle(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetMetaTitleActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetMetaTitleActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetMetaTitleActionQueryBuilderDsl
                    .of()),
            ProductTailoringUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringUpdateActionQueryBuilderDsl> asSetName(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetNameActionQueryBuilderDsl.of()),
            ProductTailoringUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringUpdateActionQueryBuilderDsl> asSetSlug(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetSlugActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetSlugActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetSlugActionQueryBuilderDsl.of()),
            ProductTailoringUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringUpdateActionQueryBuilderDsl> asUnpublish(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringUnpublishActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringUnpublishActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_tailoring.ProductTailoringUnpublishActionQueryBuilderDsl
                    .of()),
            ProductTailoringUpdateActionQueryBuilderDsl::of);
    }
}
