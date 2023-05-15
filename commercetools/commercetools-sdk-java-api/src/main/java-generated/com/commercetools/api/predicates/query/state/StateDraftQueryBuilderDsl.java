
package com.commercetools.api.predicates.query.state;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StateDraftQueryBuilderDsl {
    public StateDraftQueryBuilderDsl() {
    }

    public static StateDraftQueryBuilderDsl of() {
        return new StateDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StateDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, StateDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StateDraftQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StateDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StateDraftQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            StateDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StateDraftQueryBuilderDsl> description(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("description"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            StateDraftQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<StateDraftQueryBuilderDsl> initial() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("initial")),
            p -> new CombinationQueryPredicate<>(p, StateDraftQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<StateDraftQueryBuilderDsl> roles() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("roles")),
            p -> new CombinationQueryPredicate<>(p, StateDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StateDraftQueryBuilderDsl> transitions(
            Function<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("transitions"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl.of())),
            StateDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StateDraftQueryBuilderDsl> transitions() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("transitions")),
            p -> new CombinationQueryPredicate<>(p, StateDraftQueryBuilderDsl::of));
    }
}
