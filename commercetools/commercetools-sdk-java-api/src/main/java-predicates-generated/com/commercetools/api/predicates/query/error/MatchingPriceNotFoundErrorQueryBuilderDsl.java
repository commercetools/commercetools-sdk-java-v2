
package com.commercetools.api.predicates.query.error;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MatchingPriceNotFoundErrorQueryBuilderDsl {
    public MatchingPriceNotFoundErrorQueryBuilderDsl() {
    }

    public static MatchingPriceNotFoundErrorQueryBuilderDsl of() {
        return new MatchingPriceNotFoundErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MatchingPriceNotFoundErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, MatchingPriceNotFoundErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MatchingPriceNotFoundErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, MatchingPriceNotFoundErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MatchingPriceNotFoundErrorQueryBuilderDsl> productId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("productId")),
            p -> new CombinationQueryPredicate<>(p, MatchingPriceNotFoundErrorQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<MatchingPriceNotFoundErrorQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, MatchingPriceNotFoundErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MatchingPriceNotFoundErrorQueryBuilderDsl> currency() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("currency")),
            p -> new CombinationQueryPredicate<>(p, MatchingPriceNotFoundErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MatchingPriceNotFoundErrorQueryBuilderDsl> country() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("country")),
            p -> new CombinationQueryPredicate<>(p, MatchingPriceNotFoundErrorQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MatchingPriceNotFoundErrorQueryBuilderDsl> customerGroup(
            Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customerGroup"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl.of())),
            MatchingPriceNotFoundErrorQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MatchingPriceNotFoundErrorQueryBuilderDsl> channel(
            Function<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("channel"))
                .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl.of())),
            MatchingPriceNotFoundErrorQueryBuilderDsl::of);
    }

}
