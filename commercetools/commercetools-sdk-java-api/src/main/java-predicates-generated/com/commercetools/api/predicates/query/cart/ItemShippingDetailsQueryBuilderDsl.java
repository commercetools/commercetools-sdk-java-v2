package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ItemShippingDetailsQueryBuilderDsl  {
    public ItemShippingDetailsQueryBuilderDsl() {
    }

    public static ItemShippingDetailsQueryBuilderDsl of() {
        return new ItemShippingDetailsQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ItemShippingDetailsQueryBuilderDsl> targets(
        Function<com.commercetools.api.predicates.query.cart.ItemShippingTargetQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ItemShippingTargetQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("targets"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.ItemShippingTargetQueryBuilderDsl.of())),
            ItemShippingDetailsQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<ItemShippingDetailsQueryBuilderDsl> targets() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("targets")),
                p -> new CombinationQueryPredicate<>(p, ItemShippingDetailsQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<ItemShippingDetailsQueryBuilderDsl> valid() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("valid")),
        p -> new CombinationQueryPredicate<>(p, ItemShippingDetailsQueryBuilderDsl::of));
    }
    
}
