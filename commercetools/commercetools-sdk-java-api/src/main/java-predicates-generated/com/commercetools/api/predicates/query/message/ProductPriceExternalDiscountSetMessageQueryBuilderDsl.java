
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductPriceExternalDiscountSetMessageQueryBuilderDsl {
    public ProductPriceExternalDiscountSetMessageQueryBuilderDsl() {
    }

    public static ProductPriceExternalDiscountSetMessageQueryBuilderDsl of() {
        return new ProductPriceExternalDiscountSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductPriceExternalDiscountSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceExternalDiscountSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductPriceExternalDiscountSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceExternalDiscountSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductPriceExternalDiscountSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceExternalDiscountSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductPriceExternalDiscountSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceExternalDiscountSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductPriceExternalDiscountSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ProductPriceExternalDiscountSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductPriceExternalDiscountSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ProductPriceExternalDiscountSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ProductPriceExternalDiscountSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceExternalDiscountSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductPriceExternalDiscountSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ProductPriceExternalDiscountSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ProductPriceExternalDiscountSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceExternalDiscountSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductPriceExternalDiscountSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceExternalDiscountSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductPriceExternalDiscountSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ProductPriceExternalDiscountSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ProductPriceExternalDiscountSetMessageQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceExternalDiscountSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductPriceExternalDiscountSetMessageQueryBuilderDsl> variantKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantKey")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceExternalDiscountSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductPriceExternalDiscountSetMessageQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceExternalDiscountSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductPriceExternalDiscountSetMessageQueryBuilderDsl> priceId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("priceId")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceExternalDiscountSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductPriceExternalDiscountSetMessageQueryBuilderDsl> discounted(
            Function<com.commercetools.api.predicates.query.common.DiscountedPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.DiscountedPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("discounted"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.DiscountedPriceQueryBuilderDsl.of())),
            ProductPriceExternalDiscountSetMessageQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ProductPriceExternalDiscountSetMessageQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceExternalDiscountSetMessageQueryBuilderDsl::of));
    }

}
