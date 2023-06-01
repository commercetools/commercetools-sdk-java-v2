package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ItemShippingTargetQueryBuilderDsl  {
    public ItemShippingTargetQueryBuilderDsl() {
    }

    public static ItemShippingTargetQueryBuilderDsl of() {
        return new ItemShippingTargetQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ItemShippingTargetQueryBuilderDsl> addressKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressKey")),
        p -> new CombinationQueryPredicate<>(p, ItemShippingTargetQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ItemShippingTargetQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
        p -> new CombinationQueryPredicate<>(p, ItemShippingTargetQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ItemShippingTargetQueryBuilderDsl> shippingMethodKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingMethodKey")),
        p -> new CombinationQueryPredicate<>(p, ItemShippingTargetQueryBuilderDsl::of));
    }
    
}
