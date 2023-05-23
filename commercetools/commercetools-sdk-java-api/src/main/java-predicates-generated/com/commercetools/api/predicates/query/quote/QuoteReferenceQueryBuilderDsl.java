
package com.commercetools.api.predicates.query.quote;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class QuoteReferenceQueryBuilderDsl {
    public QuoteReferenceQueryBuilderDsl() {
    }

    public static QuoteReferenceQueryBuilderDsl of() {
        return new QuoteReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QuoteReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, QuoteReferenceQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<QuoteReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, QuoteReferenceQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<QuoteReferenceQueryBuilderDsl> obj(
            Function<com.commercetools.api.predicates.query.quote.QuoteQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.quote.QuoteQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("obj"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.quote.QuoteQueryBuilderDsl.of())),
            QuoteReferenceQueryBuilderDsl::of);
    }

}
