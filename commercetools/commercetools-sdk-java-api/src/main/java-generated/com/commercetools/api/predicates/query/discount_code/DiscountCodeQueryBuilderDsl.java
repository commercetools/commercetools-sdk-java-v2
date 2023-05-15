
package com.commercetools.api.predicates.query.discount_code;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DiscountCodeQueryBuilderDsl {
    public DiscountCodeQueryBuilderDsl() {
    }

    public static DiscountCodeQueryBuilderDsl of() {
        return new DiscountCodeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountCodeQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<DiscountCodeQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<DiscountCodeQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<DiscountCodeQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DiscountCodeQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            DiscountCodeQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DiscountCodeQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            DiscountCodeQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DiscountCodeQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            DiscountCodeQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DiscountCodeQueryBuilderDsl> description(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("description"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            DiscountCodeQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<DiscountCodeQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DiscountCodeQueryBuilderDsl> cartDiscounts(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("cartDiscounts"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.cart_discount.CartDiscountReferenceQueryBuilderDsl.of())),
            DiscountCodeQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<DiscountCodeQueryBuilderDsl> cartDiscounts() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("cartDiscounts")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DiscountCodeQueryBuilderDsl> cartPredicate() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("cartPredicate")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<DiscountCodeQueryBuilderDsl> isActive() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("isActive")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DiscountCodeQueryBuilderDsl> references(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("references"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            DiscountCodeQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<DiscountCodeQueryBuilderDsl> references() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("references")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<DiscountCodeQueryBuilderDsl> maxApplications() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("maxApplications")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<DiscountCodeQueryBuilderDsl> maxApplicationsPerCustomer() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("maxApplicationsPerCustomer")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DiscountCodeQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            DiscountCodeQueryBuilderDsl::of);
    }

    public StringCollectionPredicateBuilder<DiscountCodeQueryBuilderDsl> groups() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("groups")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<DiscountCodeQueryBuilderDsl> validFrom() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validFrom")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<DiscountCodeQueryBuilderDsl> validUntil() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validUntil")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<DiscountCodeQueryBuilderDsl> applicationVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("applicationVersion")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeQueryBuilderDsl::of));
    }
}
