package com.commercetools.api.predicates.query.cart_discount;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartDiscountValueRelativeDraftQueryBuilderDsl  {
    public CartDiscountValueRelativeDraftQueryBuilderDsl() {
    }

    public static CartDiscountValueRelativeDraftQueryBuilderDsl of() {
        return new CartDiscountValueRelativeDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountValueRelativeDraftQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, CartDiscountValueRelativeDraftQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<CartDiscountValueRelativeDraftQueryBuilderDsl> permyriad() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("permyriad")),
        p -> new CombinationQueryPredicate<>(p, CartDiscountValueRelativeDraftQueryBuilderDsl::of));
    }
    
}
