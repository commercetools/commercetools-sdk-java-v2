
package com.commercetools.api.predicates.query.standalone_price;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StandalonePriceDraftQueryBuilderDsl {
    public StandalonePriceDraftQueryBuilderDsl() {
    }

    public static StandalonePriceDraftQueryBuilderDsl of() {
        return new StandalonePriceDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StandalonePriceDraftQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceDraftQueryBuilderDsl> value(
            Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("value"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            StandalonePriceDraftQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<StandalonePriceDraftQueryBuilderDsl> country() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("country")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceDraftQueryBuilderDsl> customerGroup(
            Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customerGroup"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl
                            .of())),
            StandalonePriceDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StandalonePriceDraftQueryBuilderDsl> channel(
            Function<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("channel"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl.of())),
            StandalonePriceDraftQueryBuilderDsl::of);
    }

    public DateTimeComparisonPredicateBuilder<StandalonePriceDraftQueryBuilderDsl> validFrom() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validFrom")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceDraftQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StandalonePriceDraftQueryBuilderDsl> validUntil() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validUntil")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceDraftQueryBuilderDsl> tiers(
            Function<com.commercetools.api.predicates.query.common.PriceTierDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.PriceTierDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("tiers"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.PriceTierDraftQueryBuilderDsl.of())),
            StandalonePriceDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StandalonePriceDraftQueryBuilderDsl> tiers() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("tiers")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceDraftQueryBuilderDsl> discounted(
            Function<com.commercetools.api.predicates.query.common.DiscountedPriceDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.DiscountedPriceDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("discounted"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.common.DiscountedPriceDraftQueryBuilderDsl.of())),
            StandalonePriceDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StandalonePriceDraftQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            StandalonePriceDraftQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<StandalonePriceDraftQueryBuilderDsl> active() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("active")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceDraftQueryBuilderDsl::of));
    }

}
