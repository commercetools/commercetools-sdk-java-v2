
package com.commercetools.api.predicates.query.type;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class TypePagedQueryResponseQueryBuilderDsl {
    public TypePagedQueryResponseQueryBuilderDsl() {
    }

    public static TypePagedQueryResponseQueryBuilderDsl of() {
        return new TypePagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<TypePagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, TypePagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<TypePagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
            p -> new CombinationQueryPredicate<>(p, TypePagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<TypePagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
            p -> new CombinationQueryPredicate<>(p, TypePagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<TypePagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
            p -> new CombinationQueryPredicate<>(p, TypePagedQueryResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<TypePagedQueryResponseQueryBuilderDsl> results(
            Function<com.commercetools.api.predicates.query.type.TypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("results"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.TypeQueryBuilderDsl.of())),
            TypePagedQueryResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<TypePagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
            p -> new CombinationQueryPredicate<>(p, TypePagedQueryResponseQueryBuilderDsl::of));
    }
}
