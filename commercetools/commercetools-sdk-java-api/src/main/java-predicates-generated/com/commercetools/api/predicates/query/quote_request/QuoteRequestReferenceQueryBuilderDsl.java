
package com.commercetools.api.predicates.query.quote_request;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class QuoteRequestReferenceQueryBuilderDsl {
    public QuoteRequestReferenceQueryBuilderDsl() {
    }

    public static QuoteRequestReferenceQueryBuilderDsl of() {
        return new QuoteRequestReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QuoteRequestReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestReferenceQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<QuoteRequestReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestReferenceQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<QuoteRequestReferenceQueryBuilderDsl> obj(
            Function<com.commercetools.api.predicates.query.quote_request.QuoteRequestQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.quote_request.QuoteRequestQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("obj"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.quote_request.QuoteRequestQueryBuilderDsl.of())),
            QuoteRequestReferenceQueryBuilderDsl::of);
    }

}
