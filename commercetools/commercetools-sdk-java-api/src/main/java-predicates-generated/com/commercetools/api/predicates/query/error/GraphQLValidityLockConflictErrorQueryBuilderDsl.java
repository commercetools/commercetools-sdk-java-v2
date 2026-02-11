
package com.commercetools.api.predicates.query.error;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class GraphQLValidityLockConflictErrorQueryBuilderDsl {
    public GraphQLValidityLockConflictErrorQueryBuilderDsl() {
    }

    public static GraphQLValidityLockConflictErrorQueryBuilderDsl of() {
        return new GraphQLValidityLockConflictErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLValidityLockConflictErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLValidityLockConflictErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLValidityLockConflictErrorQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, GraphQLValidityLockConflictErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLValidityLockConflictErrorQueryBuilderDsl> currency() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("currency")),
            p -> new CombinationQueryPredicate<>(p, GraphQLValidityLockConflictErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLValidityLockConflictErrorQueryBuilderDsl> country() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("country")),
            p -> new CombinationQueryPredicate<>(p, GraphQLValidityLockConflictErrorQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<GraphQLValidityLockConflictErrorQueryBuilderDsl> customerGroup(
            Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customerGroup"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl
                            .of())),
            GraphQLValidityLockConflictErrorQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLValidityLockConflictErrorQueryBuilderDsl> channel(
            Function<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("channel"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl.of())),
            GraphQLValidityLockConflictErrorQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLValidityLockConflictErrorQueryBuilderDsl> recurrencePolicy(
            Function<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("recurrencePolicy"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyResourceIdentifierQueryBuilderDsl
                            .of())),
            GraphQLValidityLockConflictErrorQueryBuilderDsl::of);
    }

}
