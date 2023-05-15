
package com.commercetools.api.predicates.query.cart_discount;

import com.commercetools.api.predicates.query.*;

public class CartDiscountValueDraftQueryBuilderDsl {
    public CartDiscountValueDraftQueryBuilderDsl() {
    }

    public static CartDiscountValueDraftQueryBuilderDsl of() {
        return new CartDiscountValueDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountValueDraftQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountValueDraftQueryBuilderDsl::of));
    }
}
