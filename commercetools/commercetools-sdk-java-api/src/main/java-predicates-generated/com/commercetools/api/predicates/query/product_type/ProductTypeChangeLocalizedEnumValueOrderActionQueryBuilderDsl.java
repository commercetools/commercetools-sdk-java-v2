package com.commercetools.api.predicates.query.product_type;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductTypeChangeLocalizedEnumValueOrderActionQueryBuilderDsl  {
    public ProductTypeChangeLocalizedEnumValueOrderActionQueryBuilderDsl() {
    }

    public static ProductTypeChangeLocalizedEnumValueOrderActionQueryBuilderDsl of() {
        return new ProductTypeChangeLocalizedEnumValueOrderActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTypeChangeLocalizedEnumValueOrderActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProductTypeChangeLocalizedEnumValueOrderActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductTypeChangeLocalizedEnumValueOrderActionQueryBuilderDsl> attributeName() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributeName")),
        p -> new CombinationQueryPredicate<>(p, ProductTypeChangeLocalizedEnumValueOrderActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductTypeChangeLocalizedEnumValueOrderActionQueryBuilderDsl> values(
        Function<com.commercetools.api.predicates.query.product_type.AttributeLocalizedEnumValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.AttributeLocalizedEnumValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("values"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product_type.AttributeLocalizedEnumValueQueryBuilderDsl.of())),
            ProductTypeChangeLocalizedEnumValueOrderActionQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<ProductTypeChangeLocalizedEnumValueOrderActionQueryBuilderDsl> values() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("values")),
                p -> new CombinationQueryPredicate<>(p, ProductTypeChangeLocalizedEnumValueOrderActionQueryBuilderDsl::of));
    }
    
}
