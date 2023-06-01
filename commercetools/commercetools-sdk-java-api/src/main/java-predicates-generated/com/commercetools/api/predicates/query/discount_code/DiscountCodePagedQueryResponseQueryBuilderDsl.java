package com.commercetools.api.predicates.query.discount_code;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class DiscountCodePagedQueryResponseQueryBuilderDsl  {
    public DiscountCodePagedQueryResponseQueryBuilderDsl() {
    }

    public static DiscountCodePagedQueryResponseQueryBuilderDsl of() {
        return new DiscountCodePagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<DiscountCodePagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
        p -> new CombinationQueryPredicate<>(p, DiscountCodePagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<DiscountCodePagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
        p -> new CombinationQueryPredicate<>(p, DiscountCodePagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<DiscountCodePagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
        p -> new CombinationQueryPredicate<>(p, DiscountCodePagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<DiscountCodePagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
        p -> new CombinationQueryPredicate<>(p, DiscountCodePagedQueryResponseQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<DiscountCodePagedQueryResponseQueryBuilderDsl> results(
        Function<com.commercetools.api.predicates.query.discount_code.DiscountCodeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_code.DiscountCodeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("results"))
            .inner(fn.apply(com.commercetools.api.predicates.query.discount_code.DiscountCodeQueryBuilderDsl.of())),
            DiscountCodePagedQueryResponseQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<DiscountCodePagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
                p -> new CombinationQueryPredicate<>(p, DiscountCodePagedQueryResponseQueryBuilderDsl::of));
    }
    
}
