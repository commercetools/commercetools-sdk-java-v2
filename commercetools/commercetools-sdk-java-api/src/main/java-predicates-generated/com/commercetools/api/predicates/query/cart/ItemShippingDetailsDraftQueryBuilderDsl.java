
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ItemShippingDetailsDraftQueryBuilderDsl {
    public ItemShippingDetailsDraftQueryBuilderDsl() {
    }

    public static ItemShippingDetailsDraftQueryBuilderDsl of() {
        return new ItemShippingDetailsDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ItemShippingDetailsDraftQueryBuilderDsl> targets(
            Function<com.commercetools.api.predicates.query.cart.ItemShippingTargetQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ItemShippingTargetQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("targets"))
                .inner(fn.apply(com.commercetools.api.predicates.query.cart.ItemShippingTargetQueryBuilderDsl.of())),
            ItemShippingDetailsDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ItemShippingDetailsDraftQueryBuilderDsl> targets() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("targets")),
            p -> new CombinationQueryPredicate<>(p, ItemShippingDetailsDraftQueryBuilderDsl::of));
    }

}
