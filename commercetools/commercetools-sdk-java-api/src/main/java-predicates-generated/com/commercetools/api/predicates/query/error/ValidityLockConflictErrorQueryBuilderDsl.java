
package com.commercetools.api.predicates.query.error;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ValidityLockConflictErrorQueryBuilderDsl {
    public ValidityLockConflictErrorQueryBuilderDsl() {
    }

    public static ValidityLockConflictErrorQueryBuilderDsl of() {
        return new ValidityLockConflictErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ValidityLockConflictErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, ValidityLockConflictErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ValidityLockConflictErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, ValidityLockConflictErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ValidityLockConflictErrorQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, ValidityLockConflictErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ValidityLockConflictErrorQueryBuilderDsl> currency() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("currency")),
            p -> new CombinationQueryPredicate<>(p, ValidityLockConflictErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ValidityLockConflictErrorQueryBuilderDsl> country() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("country")),
            p -> new CombinationQueryPredicate<>(p, ValidityLockConflictErrorQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ValidityLockConflictErrorQueryBuilderDsl> customerGroup(
            Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customerGroup"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl
                            .of())),
            ValidityLockConflictErrorQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ValidityLockConflictErrorQueryBuilderDsl> channel(
            Function<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("channel"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl.of())),
            ValidityLockConflictErrorQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ValidityLockConflictErrorQueryBuilderDsl> recurrencePolicy(
            Function<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("recurrencePolicy"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyResourceIdentifierQueryBuilderDsl
                            .of())),
            ValidityLockConflictErrorQueryBuilderDsl::of);
    }

}
