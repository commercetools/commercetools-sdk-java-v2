
package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

//public class CartQueryBuilderDsl {
//    public CartQueryBuilderDsl() {
//    }
//
//    public static CartQueryBuilderDsl of() {
//        return new CartQueryBuilderDsl();
//    }
//
//    public ComparisonPredicateBuilder<CartQueryBuilderDsl> id() {
//        return new ComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
//            p -> new CombinationQueryPredicate<>(p, CartQueryBuilderDsl::of));
//    }
//
//    public CombinationQueryPredicate<CartQueryBuilderDsl> lineItems(
//            Function<LineItemQueryBuilderDsl, CombinationQueryPredicate<LineItemQueryBuilderDsl>> fn) {
//        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
//                .parent(ConstantQueryPredicate.of().constant("lineItems"))
//                .inner(fn.apply(LineItemQueryBuilderDsl.of())),
//            CartQueryBuilderDsl::of);
//    }
//}
