
package com.commercetools.api.predicates.query.quote_request;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class QuoteRequestUpdateQueryBuilderDsl {
    public QuoteRequestUpdateQueryBuilderDsl() {
    }

    public static QuoteRequestUpdateQueryBuilderDsl of() {
        return new QuoteRequestUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<QuoteRequestUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestUpdateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<QuoteRequestUpdateQueryBuilderDsl> actions(
            Function<com.commercetools.api.predicates.query.quote_request.QuoteRequestUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.quote_request.QuoteRequestUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("actions"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.quote_request.QuoteRequestUpdateActionQueryBuilderDsl.of())),
            QuoteRequestUpdateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<QuoteRequestUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestUpdateQueryBuilderDsl::of));
    }
}
