
package com.commercetools.api.predicates.query.cart_discount;

import com.commercetools.api.predicates.query.*;

public class CartDiscountSetCustomFieldActionQueryBuilderDsl {
    public CartDiscountSetCustomFieldActionQueryBuilderDsl() {
    }

    public static CartDiscountSetCustomFieldActionQueryBuilderDsl of() {
        return new CartDiscountSetCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountSetCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountSetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartDiscountSetCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountSetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartDiscountSetCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountSetCustomFieldActionQueryBuilderDsl::of));
    }

}
