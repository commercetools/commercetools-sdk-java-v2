
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderPagedSearchResponseQueryBuilderDsl {
    public OrderPagedSearchResponseQueryBuilderDsl() {
    }

    public static OrderPagedSearchResponseQueryBuilderDsl of() {
        return new OrderPagedSearchResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<OrderPagedSearchResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
            p -> new CombinationQueryPredicate<>(p, OrderPagedSearchResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<OrderPagedSearchResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
            p -> new CombinationQueryPredicate<>(p, OrderPagedSearchResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<OrderPagedSearchResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, OrderPagedSearchResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderPagedSearchResponseQueryBuilderDsl> hits(
            Function<com.commercetools.api.predicates.query.order.HitQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.HitQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("hits"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.HitQueryBuilderDsl.of())),
            OrderPagedSearchResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<OrderPagedSearchResponseQueryBuilderDsl> hits() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("hits")),
            p -> new CombinationQueryPredicate<>(p, OrderPagedSearchResponseQueryBuilderDsl::of));
    }

}
