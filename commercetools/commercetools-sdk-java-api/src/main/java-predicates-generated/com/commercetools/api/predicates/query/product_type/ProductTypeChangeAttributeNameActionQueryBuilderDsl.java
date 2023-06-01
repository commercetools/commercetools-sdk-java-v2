package com.commercetools.api.predicates.query.product_type;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductTypeChangeAttributeNameActionQueryBuilderDsl  {
    public ProductTypeChangeAttributeNameActionQueryBuilderDsl() {
    }

    public static ProductTypeChangeAttributeNameActionQueryBuilderDsl of() {
        return new ProductTypeChangeAttributeNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTypeChangeAttributeNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProductTypeChangeAttributeNameActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductTypeChangeAttributeNameActionQueryBuilderDsl> attributeName() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributeName")),
        p -> new CombinationQueryPredicate<>(p, ProductTypeChangeAttributeNameActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductTypeChangeAttributeNameActionQueryBuilderDsl> newAttributeName() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("newAttributeName")),
        p -> new CombinationQueryPredicate<>(p, ProductTypeChangeAttributeNameActionQueryBuilderDsl::of));
    }
    
}
