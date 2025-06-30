
package com.commercetools.api.predicates.query.cart_discount;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartDiscountSetDiscountGroupActionQueryBuilderDsl {
    public CartDiscountSetDiscountGroupActionQueryBuilderDsl() {
    }

    public static CartDiscountSetDiscountGroupActionQueryBuilderDsl of() {
        return new CartDiscountSetDiscountGroupActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountSetDiscountGroupActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountSetDiscountGroupActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartDiscountSetDiscountGroupActionQueryBuilderDsl> discountGroup(
            Function<com.commercetools.api.predicates.query.discount_group.DiscountGroupResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_group.DiscountGroupResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("discountGroup"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.discount_group.DiscountGroupResourceIdentifierQueryBuilderDsl
                            .of())),
            CartDiscountSetDiscountGroupActionQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<CartDiscountSetDiscountGroupActionQueryBuilderDsl> sortOrder() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sortOrder")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountSetDiscountGroupActionQueryBuilderDsl::of));
    }

}
