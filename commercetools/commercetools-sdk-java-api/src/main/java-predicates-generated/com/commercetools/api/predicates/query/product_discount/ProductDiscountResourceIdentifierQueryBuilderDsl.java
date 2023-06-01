package com.commercetools.api.predicates.query.product_discount;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductDiscountResourceIdentifierQueryBuilderDsl  {
    public ProductDiscountResourceIdentifierQueryBuilderDsl() {
    }

    public static ProductDiscountResourceIdentifierQueryBuilderDsl of() {
        return new ProductDiscountResourceIdentifierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductDiscountResourceIdentifierQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
        p -> new CombinationQueryPredicate<>(p, ProductDiscountResourceIdentifierQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductDiscountResourceIdentifierQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, ProductDiscountResourceIdentifierQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductDiscountResourceIdentifierQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, ProductDiscountResourceIdentifierQueryBuilderDsl::of));
    }
    
}
