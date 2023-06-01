package com.commercetools.api.predicates.query.product_type;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductTypeChangePlainEnumValueLabelActionQueryBuilderDsl  {
    public ProductTypeChangePlainEnumValueLabelActionQueryBuilderDsl() {
    }

    public static ProductTypeChangePlainEnumValueLabelActionQueryBuilderDsl of() {
        return new ProductTypeChangePlainEnumValueLabelActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTypeChangePlainEnumValueLabelActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProductTypeChangePlainEnumValueLabelActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductTypeChangePlainEnumValueLabelActionQueryBuilderDsl> attributeName() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributeName")),
        p -> new CombinationQueryPredicate<>(p, ProductTypeChangePlainEnumValueLabelActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductTypeChangePlainEnumValueLabelActionQueryBuilderDsl> newValue(
        Function<com.commercetools.api.predicates.query.product_type.AttributePlainEnumValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.AttributePlainEnumValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("newValue"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product_type.AttributePlainEnumValueQueryBuilderDsl.of())),
            ProductTypeChangePlainEnumValueLabelActionQueryBuilderDsl::of);
    }
    
    
}
