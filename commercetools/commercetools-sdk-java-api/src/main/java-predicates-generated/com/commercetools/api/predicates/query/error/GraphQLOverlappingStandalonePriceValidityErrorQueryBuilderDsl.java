
package com.commercetools.api.predicates.query.error;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class GraphQLOverlappingStandalonePriceValidityErrorQueryBuilderDsl {
    public GraphQLOverlappingStandalonePriceValidityErrorQueryBuilderDsl() {
    }

    public static GraphQLOverlappingStandalonePriceValidityErrorQueryBuilderDsl of() {
        return new GraphQLOverlappingStandalonePriceValidityErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLOverlappingStandalonePriceValidityErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLOverlappingStandalonePriceValidityErrorQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<GraphQLOverlappingStandalonePriceValidityErrorQueryBuilderDsl> conflictingStandalonePrice(
            Function<com.commercetools.api.predicates.query.standalone_price.StandalonePriceReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.standalone_price.StandalonePriceReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("conflictingStandalonePrice"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.standalone_price.StandalonePriceReferenceQueryBuilderDsl
                            .of())),
            GraphQLOverlappingStandalonePriceValidityErrorQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<GraphQLOverlappingStandalonePriceValidityErrorQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, GraphQLOverlappingStandalonePriceValidityErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLOverlappingStandalonePriceValidityErrorQueryBuilderDsl> currency() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("currency")),
            p -> new CombinationQueryPredicate<>(p, GraphQLOverlappingStandalonePriceValidityErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLOverlappingStandalonePriceValidityErrorQueryBuilderDsl> country() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("country")),
            p -> new CombinationQueryPredicate<>(p, GraphQLOverlappingStandalonePriceValidityErrorQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<GraphQLOverlappingStandalonePriceValidityErrorQueryBuilderDsl> customerGroup(
            Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customerGroup"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl
                            .of())),
            GraphQLOverlappingStandalonePriceValidityErrorQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLOverlappingStandalonePriceValidityErrorQueryBuilderDsl> channel(
            Function<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("channel"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl.of())),
            GraphQLOverlappingStandalonePriceValidityErrorQueryBuilderDsl::of);
    }

    public DateTimeComparisonPredicateBuilder<GraphQLOverlappingStandalonePriceValidityErrorQueryBuilderDsl> validFrom() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validFrom")),
            p -> new CombinationQueryPredicate<>(p, GraphQLOverlappingStandalonePriceValidityErrorQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<GraphQLOverlappingStandalonePriceValidityErrorQueryBuilderDsl> validUntil() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validUntil")),
            p -> new CombinationQueryPredicate<>(p, GraphQLOverlappingStandalonePriceValidityErrorQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<GraphQLOverlappingStandalonePriceValidityErrorQueryBuilderDsl> conflictingValidFrom() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("conflictingValidFrom")),
            p -> new CombinationQueryPredicate<>(p, GraphQLOverlappingStandalonePriceValidityErrorQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<GraphQLOverlappingStandalonePriceValidityErrorQueryBuilderDsl> conflictingValidUntil() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("conflictingValidUntil")),
            p -> new CombinationQueryPredicate<>(p, GraphQLOverlappingStandalonePriceValidityErrorQueryBuilderDsl::of));
    }

}
