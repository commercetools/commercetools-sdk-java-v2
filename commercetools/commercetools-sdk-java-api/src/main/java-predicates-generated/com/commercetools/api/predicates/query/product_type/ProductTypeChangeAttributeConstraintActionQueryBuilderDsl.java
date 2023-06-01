package com.commercetools.api.predicates.query.product_type;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductTypeChangeAttributeConstraintActionQueryBuilderDsl  {
    public ProductTypeChangeAttributeConstraintActionQueryBuilderDsl() {
    }

    public static ProductTypeChangeAttributeConstraintActionQueryBuilderDsl of() {
        return new ProductTypeChangeAttributeConstraintActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTypeChangeAttributeConstraintActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProductTypeChangeAttributeConstraintActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductTypeChangeAttributeConstraintActionQueryBuilderDsl> attributeName() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributeName")),
        p -> new CombinationQueryPredicate<>(p, ProductTypeChangeAttributeConstraintActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductTypeChangeAttributeConstraintActionQueryBuilderDsl> newValue() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("newValue")),
        p -> new CombinationQueryPredicate<>(p, ProductTypeChangeAttributeConstraintActionQueryBuilderDsl::of));
    }
    
}
