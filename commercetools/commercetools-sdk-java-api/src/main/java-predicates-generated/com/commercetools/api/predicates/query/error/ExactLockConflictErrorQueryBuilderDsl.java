
package com.commercetools.api.predicates.query.error;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ExactLockConflictErrorQueryBuilderDsl {
    public ExactLockConflictErrorQueryBuilderDsl() {
    }

    public static ExactLockConflictErrorQueryBuilderDsl of() {
        return new ExactLockConflictErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ExactLockConflictErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, ExactLockConflictErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ExactLockConflictErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, ExactLockConflictErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ExactLockConflictErrorQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, ExactLockConflictErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ExactLockConflictErrorQueryBuilderDsl> currency() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("currency")),
            p -> new CombinationQueryPredicate<>(p, ExactLockConflictErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ExactLockConflictErrorQueryBuilderDsl> country() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("country")),
            p -> new CombinationQueryPredicate<>(p, ExactLockConflictErrorQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ExactLockConflictErrorQueryBuilderDsl> customerGroup(
            Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customerGroup"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl
                            .of())),
            ExactLockConflictErrorQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ExactLockConflictErrorQueryBuilderDsl> channel(
            Function<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("channel"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl.of())),
            ExactLockConflictErrorQueryBuilderDsl::of);
    }

    public DateTimeComparisonPredicateBuilder<ExactLockConflictErrorQueryBuilderDsl> validFrom() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validFrom")),
            p -> new CombinationQueryPredicate<>(p, ExactLockConflictErrorQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ExactLockConflictErrorQueryBuilderDsl> validUntil() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validUntil")),
            p -> new CombinationQueryPredicate<>(p, ExactLockConflictErrorQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ExactLockConflictErrorQueryBuilderDsl> recurrencePolicy(
            Function<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("recurrencePolicy"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyReferenceQueryBuilderDsl
                            .of())),
            ExactLockConflictErrorQueryBuilderDsl::of);
    }

}
