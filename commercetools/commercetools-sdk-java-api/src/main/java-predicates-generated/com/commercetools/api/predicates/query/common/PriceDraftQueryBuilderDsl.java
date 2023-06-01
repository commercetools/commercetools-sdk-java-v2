package com.commercetools.api.predicates.query.common;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class PriceDraftQueryBuilderDsl  {
    public PriceDraftQueryBuilderDsl() {
    }

    public static PriceDraftQueryBuilderDsl of() {
        return new PriceDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PriceDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, PriceDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<PriceDraftQueryBuilderDsl> value(
        Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("value"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            PriceDraftQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<PriceDraftQueryBuilderDsl> country() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("country")),
        p -> new CombinationQueryPredicate<>(p, PriceDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<PriceDraftQueryBuilderDsl> customerGroup(
        Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("customerGroup"))
            .inner(fn.apply(com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl.of())),
            PriceDraftQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<PriceDraftQueryBuilderDsl> channel(
        Function<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("channel"))
            .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl.of())),
            PriceDraftQueryBuilderDsl::of);
    }
    
    public DateTimeComparisonPredicateBuilder<PriceDraftQueryBuilderDsl> validFrom() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validFrom")),
        p -> new CombinationQueryPredicate<>(p, PriceDraftQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<PriceDraftQueryBuilderDsl> validUntil() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validUntil")),
        p -> new CombinationQueryPredicate<>(p, PriceDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<PriceDraftQueryBuilderDsl> discounted(
        Function<com.commercetools.api.predicates.query.common.DiscountedPriceDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.DiscountedPriceDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("discounted"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.DiscountedPriceDraftQueryBuilderDsl.of())),
            PriceDraftQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<PriceDraftQueryBuilderDsl> tiers(
        Function<com.commercetools.api.predicates.query.common.PriceTierDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.PriceTierDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("tiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.PriceTierDraftQueryBuilderDsl.of())),
            PriceDraftQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<PriceDraftQueryBuilderDsl> tiers() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("tiers")),
                p -> new CombinationQueryPredicate<>(p, PriceDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<PriceDraftQueryBuilderDsl> custom(
        Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("custom"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            PriceDraftQueryBuilderDsl::of);
    }
    
    
}
