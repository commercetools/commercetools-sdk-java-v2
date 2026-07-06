
package com.commercetools.api.predicates.query.error;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class GraphQLExactLockConflictErrorQueryBuilderDsl {
    public GraphQLExactLockConflictErrorQueryBuilderDsl() {
    }

    public static GraphQLExactLockConflictErrorQueryBuilderDsl of() {
        return new GraphQLExactLockConflictErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLExactLockConflictErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLExactLockConflictErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLExactLockConflictErrorQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, GraphQLExactLockConflictErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLExactLockConflictErrorQueryBuilderDsl> currency() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("currency")),
            p -> new CombinationQueryPredicate<>(p, GraphQLExactLockConflictErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLExactLockConflictErrorQueryBuilderDsl> country() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("country")),
            p -> new CombinationQueryPredicate<>(p, GraphQLExactLockConflictErrorQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<GraphQLExactLockConflictErrorQueryBuilderDsl> customerGroup(
            Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customerGroup"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl
                            .of())),
            GraphQLExactLockConflictErrorQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLExactLockConflictErrorQueryBuilderDsl> channel(
            Function<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("channel"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl.of())),
            GraphQLExactLockConflictErrorQueryBuilderDsl::of);
    }

    public DateTimeComparisonPredicateBuilder<GraphQLExactLockConflictErrorQueryBuilderDsl> validFrom() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validFrom")),
            p -> new CombinationQueryPredicate<>(p, GraphQLExactLockConflictErrorQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<GraphQLExactLockConflictErrorQueryBuilderDsl> validUntil() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validUntil")),
            p -> new CombinationQueryPredicate<>(p, GraphQLExactLockConflictErrorQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<GraphQLExactLockConflictErrorQueryBuilderDsl> recurrencePolicy(
            Function<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("recurrencePolicy"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyReferenceQueryBuilderDsl
                            .of())),
            GraphQLExactLockConflictErrorQueryBuilderDsl::of);
    }

}
