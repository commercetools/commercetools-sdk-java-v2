
package com.commercetools.api.predicates.query.recurrence_policy;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RecurrencePolicyDraftQueryBuilderDsl {
    public RecurrencePolicyDraftQueryBuilderDsl() {
    }

    public static RecurrencePolicyDraftQueryBuilderDsl of() {
        return new RecurrencePolicyDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurrencePolicyDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, RecurrencePolicyDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurrencePolicyDraftQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            RecurrencePolicyDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurrencePolicyDraftQueryBuilderDsl> description(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("description"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            RecurrencePolicyDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurrencePolicyDraftQueryBuilderDsl> schedule(
            Function<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyScheduleDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyScheduleDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("schedule"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyScheduleDraftQueryBuilderDsl
                            .of())),
            RecurrencePolicyDraftQueryBuilderDsl::of);
    }

}
