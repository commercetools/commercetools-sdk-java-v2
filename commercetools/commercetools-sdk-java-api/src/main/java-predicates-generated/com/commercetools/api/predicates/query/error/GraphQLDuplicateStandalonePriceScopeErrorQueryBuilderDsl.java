
package com.commercetools.api.predicates.query.error;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class GraphQLDuplicateStandalonePriceScopeErrorQueryBuilderDsl {
    public GraphQLDuplicateStandalonePriceScopeErrorQueryBuilderDsl() {
    }

    public static GraphQLDuplicateStandalonePriceScopeErrorQueryBuilderDsl of() {
        return new GraphQLDuplicateStandalonePriceScopeErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLDuplicateStandalonePriceScopeErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLDuplicateStandalonePriceScopeErrorQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<GraphQLDuplicateStandalonePriceScopeErrorQueryBuilderDsl> conflictingStandalonePrice(
            Function<com.commercetools.api.predicates.query.standalone_price.StandalonePriceReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.standalone_price.StandalonePriceReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("conflictingStandalonePrice"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.standalone_price.StandalonePriceReferenceQueryBuilderDsl
                            .of())),
            GraphQLDuplicateStandalonePriceScopeErrorQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<GraphQLDuplicateStandalonePriceScopeErrorQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, GraphQLDuplicateStandalonePriceScopeErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLDuplicateStandalonePriceScopeErrorQueryBuilderDsl> currency() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("currency")),
            p -> new CombinationQueryPredicate<>(p, GraphQLDuplicateStandalonePriceScopeErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLDuplicateStandalonePriceScopeErrorQueryBuilderDsl> country() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("country")),
            p -> new CombinationQueryPredicate<>(p, GraphQLDuplicateStandalonePriceScopeErrorQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<GraphQLDuplicateStandalonePriceScopeErrorQueryBuilderDsl> customerGroup(
            Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customerGroup"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl
                            .of())),
            GraphQLDuplicateStandalonePriceScopeErrorQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLDuplicateStandalonePriceScopeErrorQueryBuilderDsl> channel(
            Function<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("channel"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl.of())),
            GraphQLDuplicateStandalonePriceScopeErrorQueryBuilderDsl::of);
    }

    public DateTimeComparisonPredicateBuilder<GraphQLDuplicateStandalonePriceScopeErrorQueryBuilderDsl> validFrom() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validFrom")),
            p -> new CombinationQueryPredicate<>(p, GraphQLDuplicateStandalonePriceScopeErrorQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<GraphQLDuplicateStandalonePriceScopeErrorQueryBuilderDsl> validUntil() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validUntil")),
            p -> new CombinationQueryPredicate<>(p, GraphQLDuplicateStandalonePriceScopeErrorQueryBuilderDsl::of));
    }

}
