
package com.commercetools.api.predicates.query.staged_quote;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedQuoteSetCustomTypeActionQueryBuilderDsl {
    public StagedQuoteSetCustomTypeActionQueryBuilderDsl() {
    }

    public static StagedQuoteSetCustomTypeActionQueryBuilderDsl of() {
        return new StagedQuoteSetCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedQuoteSetCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteSetCustomTypeActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedQuoteSetCustomTypeActionQueryBuilderDsl> type(
            Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("type"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            StagedQuoteSetCustomTypeActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedQuoteSetCustomTypeActionQueryBuilderDsl> fields(
            Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            StagedQuoteSetCustomTypeActionQueryBuilderDsl::of);
    }

}
