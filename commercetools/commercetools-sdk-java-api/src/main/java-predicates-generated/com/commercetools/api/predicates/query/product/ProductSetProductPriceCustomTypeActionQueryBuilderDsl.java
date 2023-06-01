package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductSetProductPriceCustomTypeActionQueryBuilderDsl  {
    public ProductSetProductPriceCustomTypeActionQueryBuilderDsl() {
    }

    public static ProductSetProductPriceCustomTypeActionQueryBuilderDsl of() {
        return new ProductSetProductPriceCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSetProductPriceCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProductSetProductPriceCustomTypeActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductSetProductPriceCustomTypeActionQueryBuilderDsl> priceId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("priceId")),
        p -> new CombinationQueryPredicate<>(p, ProductSetProductPriceCustomTypeActionQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<ProductSetProductPriceCustomTypeActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
        p -> new CombinationQueryPredicate<>(p, ProductSetProductPriceCustomTypeActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductSetProductPriceCustomTypeActionQueryBuilderDsl> type(
        Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("type"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            ProductSetProductPriceCustomTypeActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ProductSetProductPriceCustomTypeActionQueryBuilderDsl> fields(
        Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("fields"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            ProductSetProductPriceCustomTypeActionQueryBuilderDsl::of);
    }
    
    
}
