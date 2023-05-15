
package com.commercetools.api.predicates.query.product_discount;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductDiscountQueryBuilderDsl {
    public ProductDiscountQueryBuilderDsl() {
    }

    public static ProductDiscountQueryBuilderDsl of() {
        return new ProductDiscountQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductDiscountQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductDiscountQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductDiscountQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductDiscountQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductDiscountQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ProductDiscountQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductDiscountQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ProductDiscountQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductDiscountQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductDiscountQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ProductDiscountQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductDiscountQueryBuilderDsl> description(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("description"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductDiscountQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductDiscountQueryBuilderDsl> value(
            Function<com.commercetools.api.predicates.query.product_discount.ProductDiscountValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_discount.ProductDiscountValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("value"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_discount.ProductDiscountValueQueryBuilderDsl.of())),
            ProductDiscountQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ProductDiscountQueryBuilderDsl> predicate() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("predicate")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductDiscountQueryBuilderDsl> sortOrder() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sortOrder")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductDiscountQueryBuilderDsl> isActive() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("isActive")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductDiscountQueryBuilderDsl> references(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("references"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ProductDiscountQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductDiscountQueryBuilderDsl> references() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("references")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductDiscountQueryBuilderDsl> validFrom() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validFrom")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductDiscountQueryBuilderDsl> validUntil() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validUntil")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountQueryBuilderDsl::of));
    }
}
