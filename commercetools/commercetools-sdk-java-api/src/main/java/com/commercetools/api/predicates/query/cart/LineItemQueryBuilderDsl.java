
package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

//public class LineItemQueryBuilderDsl {
//
//    public LineItemQueryBuilderDsl() {
//    }
//
//    public static LineItemQueryBuilderDsl of() {
//        return new LineItemQueryBuilderDsl();
//    }
//
//    public ComparisonPredicateBuilder<LineItemQueryBuilderDsl> id() {
//        return new ComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
//            p -> new CombinationQueryPredicate<>(p, LineItemQueryBuilderDsl::of));
//    }
//
//    public CombinationQueryPredicate<LineItemQueryBuilderDsl> totalPrice(
//            Function<CentPrecisionMoneyQueryBuilderDsl, CombinationQueryPredicate<CentPrecisionMoneyQueryBuilderDsl>> fn) {
//        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
//                .parent(ConstantQueryPredicate.of().constant("totalPrice"))
//                .inner(fn.apply(CentPrecisionMoneyQueryBuilderDsl.of())),
//                LineItemQueryBuilderDsl::of);
//    }
//}
