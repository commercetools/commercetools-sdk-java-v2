package com.commercetools.api.predicates.query.shipping_method;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ShippingMethodPagedQueryResponseQueryBuilderDsl  {
    public ShippingMethodPagedQueryResponseQueryBuilderDsl() {
    }

    public static ShippingMethodPagedQueryResponseQueryBuilderDsl of() {
        return new ShippingMethodPagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ShippingMethodPagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
        p -> new CombinationQueryPredicate<>(p, ShippingMethodPagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ShippingMethodPagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
        p -> new CombinationQueryPredicate<>(p, ShippingMethodPagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ShippingMethodPagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
        p -> new CombinationQueryPredicate<>(p, ShippingMethodPagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ShippingMethodPagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
        p -> new CombinationQueryPredicate<>(p, ShippingMethodPagedQueryResponseQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ShippingMethodPagedQueryResponseQueryBuilderDsl> results(
        Function<com.commercetools.api.predicates.query.shipping_method.ShippingMethodQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingMethodQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("results"))
            .inner(fn.apply(com.commercetools.api.predicates.query.shipping_method.ShippingMethodQueryBuilderDsl.of())),
            ShippingMethodPagedQueryResponseQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<ShippingMethodPagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
                p -> new CombinationQueryPredicate<>(p, ShippingMethodPagedQueryResponseQueryBuilderDsl::of));
    }
    
}
