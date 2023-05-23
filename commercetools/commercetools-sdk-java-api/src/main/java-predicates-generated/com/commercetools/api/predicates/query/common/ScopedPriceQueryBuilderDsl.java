
package com.commercetools.api.predicates.query.common;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ScopedPriceQueryBuilderDsl {
    public ScopedPriceQueryBuilderDsl() {
    }

    public static ScopedPriceQueryBuilderDsl of() {
        return new ScopedPriceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ScopedPriceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ScopedPriceQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ScopedPriceQueryBuilderDsl> value(
            Function<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("value"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl.of())),
            ScopedPriceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ScopedPriceQueryBuilderDsl> currentValue(
            Function<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("currentValue"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl.of())),
            ScopedPriceQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ScopedPriceQueryBuilderDsl> country() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("country")),
            p -> new CombinationQueryPredicate<>(p, ScopedPriceQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ScopedPriceQueryBuilderDsl> customerGroup(
            Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customerGroup"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl.of())),
            ScopedPriceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ScopedPriceQueryBuilderDsl> channel(
            Function<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("channel"))
                .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl.of())),
            ScopedPriceQueryBuilderDsl::of);
    }

    public DateTimeComparisonPredicateBuilder<ScopedPriceQueryBuilderDsl> validFrom() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validFrom")),
            p -> new CombinationQueryPredicate<>(p, ScopedPriceQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ScopedPriceQueryBuilderDsl> validUntil() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validUntil")),
            p -> new CombinationQueryPredicate<>(p, ScopedPriceQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ScopedPriceQueryBuilderDsl> discounted(
            Function<com.commercetools.api.predicates.query.common.DiscountedPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.DiscountedPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("discounted"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.DiscountedPriceQueryBuilderDsl.of())),
            ScopedPriceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ScopedPriceQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            ScopedPriceQueryBuilderDsl::of);
    }

}
