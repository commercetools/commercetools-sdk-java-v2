package com.commercetools.api.predicates.query.product_type;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductTypeAddLocalizedEnumValueActionQueryBuilderDsl  {
    public ProductTypeAddLocalizedEnumValueActionQueryBuilderDsl() {
    }

    public static ProductTypeAddLocalizedEnumValueActionQueryBuilderDsl of() {
        return new ProductTypeAddLocalizedEnumValueActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTypeAddLocalizedEnumValueActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProductTypeAddLocalizedEnumValueActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductTypeAddLocalizedEnumValueActionQueryBuilderDsl> attributeName() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributeName")),
        p -> new CombinationQueryPredicate<>(p, ProductTypeAddLocalizedEnumValueActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductTypeAddLocalizedEnumValueActionQueryBuilderDsl> value(
        Function<com.commercetools.api.predicates.query.product_type.AttributeLocalizedEnumValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.AttributeLocalizedEnumValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("value"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product_type.AttributeLocalizedEnumValueQueryBuilderDsl.of())),
            ProductTypeAddLocalizedEnumValueActionQueryBuilderDsl::of);
    }
    
    
}
