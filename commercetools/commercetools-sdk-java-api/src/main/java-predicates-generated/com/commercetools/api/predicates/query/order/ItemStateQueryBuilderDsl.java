package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ItemStateQueryBuilderDsl  {
    public ItemStateQueryBuilderDsl() {
    }

    public static ItemStateQueryBuilderDsl of() {
        return new ItemStateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ItemStateQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
        p -> new CombinationQueryPredicate<>(p, ItemStateQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ItemStateQueryBuilderDsl> state(
        Function<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("state"))
            .inner(fn.apply(com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl.of())),
            ItemStateQueryBuilderDsl::of);
    }
    
    
}
