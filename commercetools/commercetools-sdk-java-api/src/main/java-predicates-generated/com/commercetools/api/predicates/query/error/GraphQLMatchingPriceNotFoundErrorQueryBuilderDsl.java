
package com.commercetools.api.predicates.query.error;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class GraphQLMatchingPriceNotFoundErrorQueryBuilderDsl {
    public GraphQLMatchingPriceNotFoundErrorQueryBuilderDsl() {
    }

    public static GraphQLMatchingPriceNotFoundErrorQueryBuilderDsl of() {
        return new GraphQLMatchingPriceNotFoundErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLMatchingPriceNotFoundErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLMatchingPriceNotFoundErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLMatchingPriceNotFoundErrorQueryBuilderDsl> productId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("productId")),
            p -> new CombinationQueryPredicate<>(p, GraphQLMatchingPriceNotFoundErrorQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<GraphQLMatchingPriceNotFoundErrorQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, GraphQLMatchingPriceNotFoundErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLMatchingPriceNotFoundErrorQueryBuilderDsl> currency() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("currency")),
            p -> new CombinationQueryPredicate<>(p, GraphQLMatchingPriceNotFoundErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLMatchingPriceNotFoundErrorQueryBuilderDsl> country() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("country")),
            p -> new CombinationQueryPredicate<>(p, GraphQLMatchingPriceNotFoundErrorQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<GraphQLMatchingPriceNotFoundErrorQueryBuilderDsl> customerGroup(
            Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customerGroup"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl.of())),
            GraphQLMatchingPriceNotFoundErrorQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLMatchingPriceNotFoundErrorQueryBuilderDsl> channel(
            Function<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("channel"))
                .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl.of())),
            GraphQLMatchingPriceNotFoundErrorQueryBuilderDsl::of);
    }

}
