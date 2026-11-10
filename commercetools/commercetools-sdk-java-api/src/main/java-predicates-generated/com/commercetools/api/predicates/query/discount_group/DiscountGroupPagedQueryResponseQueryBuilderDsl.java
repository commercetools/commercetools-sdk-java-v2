
package com.commercetools.api.predicates.query.discount_group;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DiscountGroupPagedQueryResponseQueryBuilderDsl {
    public DiscountGroupPagedQueryResponseQueryBuilderDsl() {
    }

    public static DiscountGroupPagedQueryResponseQueryBuilderDsl of() {
        return new DiscountGroupPagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<DiscountGroupPagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<DiscountGroupPagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<DiscountGroupPagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<DiscountGroupPagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupPagedQueryResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DiscountGroupPagedQueryResponseQueryBuilderDsl> results(
            Function<com.commercetools.api.predicates.query.discount_group.DiscountGroupQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_group.DiscountGroupQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("results"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.discount_group.DiscountGroupQueryBuilderDsl.of())),
            DiscountGroupPagedQueryResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<DiscountGroupPagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupPagedQueryResponseQueryBuilderDsl::of));
    }

}
