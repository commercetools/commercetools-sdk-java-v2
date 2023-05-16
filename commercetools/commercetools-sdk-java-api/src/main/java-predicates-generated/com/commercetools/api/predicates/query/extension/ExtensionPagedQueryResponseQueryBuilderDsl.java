
package com.commercetools.api.predicates.query.extension;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ExtensionPagedQueryResponseQueryBuilderDsl {
    public ExtensionPagedQueryResponseQueryBuilderDsl() {
    }

    public static ExtensionPagedQueryResponseQueryBuilderDsl of() {
        return new ExtensionPagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ExtensionPagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, ExtensionPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ExtensionPagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
            p -> new CombinationQueryPredicate<>(p, ExtensionPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ExtensionPagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
            p -> new CombinationQueryPredicate<>(p, ExtensionPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ExtensionPagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
            p -> new CombinationQueryPredicate<>(p, ExtensionPagedQueryResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ExtensionPagedQueryResponseQueryBuilderDsl> results(
            Function<com.commercetools.api.predicates.query.extension.ExtensionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.extension.ExtensionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("results"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.extension.ExtensionQueryBuilderDsl.of())),
            ExtensionPagedQueryResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ExtensionPagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
            p -> new CombinationQueryPredicate<>(p, ExtensionPagedQueryResponseQueryBuilderDsl::of));
    }

}
