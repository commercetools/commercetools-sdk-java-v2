
package com.commercetools.api.predicates.query.error;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class GraphQLOverlappingPriceValidityErrorQueryBuilderDsl {
    public GraphQLOverlappingPriceValidityErrorQueryBuilderDsl() {
    }

    public static GraphQLOverlappingPriceValidityErrorQueryBuilderDsl of() {
        return new GraphQLOverlappingPriceValidityErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLOverlappingPriceValidityErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLOverlappingPriceValidityErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLOverlappingPriceValidityErrorQueryBuilderDsl> conflictingPrice() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("conflictingPrice")),
            p -> new CombinationQueryPredicate<>(p, GraphQLOverlappingPriceValidityErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLOverlappingPriceValidityErrorQueryBuilderDsl> currency() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("currency")),
            p -> new CombinationQueryPredicate<>(p, GraphQLOverlappingPriceValidityErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLOverlappingPriceValidityErrorQueryBuilderDsl> country() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("country")),
            p -> new CombinationQueryPredicate<>(p, GraphQLOverlappingPriceValidityErrorQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<GraphQLOverlappingPriceValidityErrorQueryBuilderDsl> customerGroup(
            Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customerGroup"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl
                            .of())),
            GraphQLOverlappingPriceValidityErrorQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLOverlappingPriceValidityErrorQueryBuilderDsl> channel(
            Function<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("channel"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl.of())),
            GraphQLOverlappingPriceValidityErrorQueryBuilderDsl::of);
    }

    public DateTimeComparisonPredicateBuilder<GraphQLOverlappingPriceValidityErrorQueryBuilderDsl> validFrom() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validFrom")),
            p -> new CombinationQueryPredicate<>(p, GraphQLOverlappingPriceValidityErrorQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<GraphQLOverlappingPriceValidityErrorQueryBuilderDsl> validUntil() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validUntil")),
            p -> new CombinationQueryPredicate<>(p, GraphQLOverlappingPriceValidityErrorQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<GraphQLOverlappingPriceValidityErrorQueryBuilderDsl> conflictingValidFrom() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("conflictingValidFrom")),
            p -> new CombinationQueryPredicate<>(p, GraphQLOverlappingPriceValidityErrorQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<GraphQLOverlappingPriceValidityErrorQueryBuilderDsl> conflictingValidUntil() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("conflictingValidUntil")),
            p -> new CombinationQueryPredicate<>(p, GraphQLOverlappingPriceValidityErrorQueryBuilderDsl::of));
    }

}
