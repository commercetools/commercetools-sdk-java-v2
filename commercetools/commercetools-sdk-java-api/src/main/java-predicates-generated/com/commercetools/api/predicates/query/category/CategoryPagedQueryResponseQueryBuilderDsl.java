package com.commercetools.api.predicates.query.category;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CategoryPagedQueryResponseQueryBuilderDsl  {
    public CategoryPagedQueryResponseQueryBuilderDsl() {
    }

    public static CategoryPagedQueryResponseQueryBuilderDsl of() {
        return new CategoryPagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<CategoryPagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
        p -> new CombinationQueryPredicate<>(p, CategoryPagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<CategoryPagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
        p -> new CombinationQueryPredicate<>(p, CategoryPagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<CategoryPagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
        p -> new CombinationQueryPredicate<>(p, CategoryPagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<CategoryPagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
        p -> new CombinationQueryPredicate<>(p, CategoryPagedQueryResponseQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CategoryPagedQueryResponseQueryBuilderDsl> results(
        Function<com.commercetools.api.predicates.query.category.CategoryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategoryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("results"))
            .inner(fn.apply(com.commercetools.api.predicates.query.category.CategoryQueryBuilderDsl.of())),
            CategoryPagedQueryResponseQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<CategoryPagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
                p -> new CombinationQueryPredicate<>(p, CategoryPagedQueryResponseQueryBuilderDsl::of));
    }
    
}
