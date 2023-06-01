package com.commercetools.api.predicates.query.product_type;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductTypeAddPlainEnumValueActionQueryBuilderDsl  {
    public ProductTypeAddPlainEnumValueActionQueryBuilderDsl() {
    }

    public static ProductTypeAddPlainEnumValueActionQueryBuilderDsl of() {
        return new ProductTypeAddPlainEnumValueActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTypeAddPlainEnumValueActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProductTypeAddPlainEnumValueActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductTypeAddPlainEnumValueActionQueryBuilderDsl> attributeName() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributeName")),
        p -> new CombinationQueryPredicate<>(p, ProductTypeAddPlainEnumValueActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductTypeAddPlainEnumValueActionQueryBuilderDsl> value(
        Function<com.commercetools.api.predicates.query.product_type.AttributePlainEnumValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.AttributePlainEnumValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("value"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product_type.AttributePlainEnumValueQueryBuilderDsl.of())),
            ProductTypeAddPlainEnumValueActionQueryBuilderDsl::of);
    }
    
    
}
