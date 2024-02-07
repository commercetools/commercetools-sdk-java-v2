
package com.commercetools.api.predicates.query.discount_code;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DiscountCodeDraftQueryBuilderDsl {
    public DiscountCodeDraftQueryBuilderDsl() {
    }

    public static DiscountCodeDraftQueryBuilderDsl of() {
        return new DiscountCodeDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountCodeDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DiscountCodeDraftQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            DiscountCodeDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DiscountCodeDraftQueryBuilderDsl> description(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("description"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            DiscountCodeDraftQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<DiscountCodeDraftQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DiscountCodeDraftQueryBuilderDsl> cartDiscounts(
            Function<com.commercetools.api.predicates.query.cart_discount.CartDiscountResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart_discount.CartDiscountResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("cartDiscounts"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.cart_discount.CartDiscountResourceIdentifierQueryBuilderDsl
                            .of())),
            DiscountCodeDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<DiscountCodeDraftQueryBuilderDsl> cartDiscounts() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("cartDiscounts")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DiscountCodeDraftQueryBuilderDsl> cartPredicate() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("cartPredicate")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeDraftQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<DiscountCodeDraftQueryBuilderDsl> isActive() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("isActive")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeDraftQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<DiscountCodeDraftQueryBuilderDsl> maxApplications() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("maxApplications")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeDraftQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<DiscountCodeDraftQueryBuilderDsl> maxApplicationsPerCustomer() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("maxApplicationsPerCustomer")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DiscountCodeDraftQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            DiscountCodeDraftQueryBuilderDsl::of);
    }

    public StringCollectionPredicateBuilder<DiscountCodeDraftQueryBuilderDsl> groups() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("groups")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeDraftQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<DiscountCodeDraftQueryBuilderDsl> validFrom() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validFrom")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeDraftQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<DiscountCodeDraftQueryBuilderDsl> validUntil() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validUntil")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeDraftQueryBuilderDsl::of));
    }

}
