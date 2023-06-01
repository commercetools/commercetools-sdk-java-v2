package com.commercetools.api.predicates.query.product_discount;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductDiscountValueAbsoluteQueryBuilderDsl  {
    public ProductDiscountValueAbsoluteQueryBuilderDsl() {
    }

    public static ProductDiscountValueAbsoluteQueryBuilderDsl of() {
        return new ProductDiscountValueAbsoluteQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductDiscountValueAbsoluteQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, ProductDiscountValueAbsoluteQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductDiscountValueAbsoluteQueryBuilderDsl> money(
        Function<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("money"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl.of())),
            ProductDiscountValueAbsoluteQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<ProductDiscountValueAbsoluteQueryBuilderDsl> money() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("money")),
                p -> new CombinationQueryPredicate<>(p, ProductDiscountValueAbsoluteQueryBuilderDsl::of));
    }
    
}
