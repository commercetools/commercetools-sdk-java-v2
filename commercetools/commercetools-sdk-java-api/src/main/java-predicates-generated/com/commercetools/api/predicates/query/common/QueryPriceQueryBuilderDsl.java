
package com.commercetools.api.predicates.query.common;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class QueryPriceQueryBuilderDsl {
    public QueryPriceQueryBuilderDsl() {
    }

    public static QueryPriceQueryBuilderDsl of() {
        return new QueryPriceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QueryPriceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, QueryPriceQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<QueryPriceQueryBuilderDsl> value(
            Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("value"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            QueryPriceQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<QueryPriceQueryBuilderDsl> country() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("country")),
            p -> new CombinationQueryPredicate<>(p, QueryPriceQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<QueryPriceQueryBuilderDsl> customerGroup(
            Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customerGroup"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl.of())),
            QueryPriceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<QueryPriceQueryBuilderDsl> channel(
            Function<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("channel"))
                .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl.of())),
            QueryPriceQueryBuilderDsl::of);
    }

    public DateTimeComparisonPredicateBuilder<QueryPriceQueryBuilderDsl> validFrom() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validFrom")),
            p -> new CombinationQueryPredicate<>(p, QueryPriceQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<QueryPriceQueryBuilderDsl> validUntil() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validUntil")),
            p -> new CombinationQueryPredicate<>(p, QueryPriceQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<QueryPriceQueryBuilderDsl> discounted(
            Function<com.commercetools.api.predicates.query.common.DiscountedPriceDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.DiscountedPriceDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("discounted"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.common.DiscountedPriceDraftQueryBuilderDsl.of())),
            QueryPriceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<QueryPriceQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            QueryPriceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<QueryPriceQueryBuilderDsl> tiers(
            Function<com.commercetools.api.predicates.query.common.PriceTierDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.PriceTierDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("tiers"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.PriceTierDraftQueryBuilderDsl.of())),
            QueryPriceQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<QueryPriceQueryBuilderDsl> tiers() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("tiers")),
            p -> new CombinationQueryPredicate<>(p, QueryPriceQueryBuilderDsl::of));
    }

}
