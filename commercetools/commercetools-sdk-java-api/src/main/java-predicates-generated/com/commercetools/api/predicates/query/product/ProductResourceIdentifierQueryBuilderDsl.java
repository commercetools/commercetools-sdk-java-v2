package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductResourceIdentifierQueryBuilderDsl  {
    public ProductResourceIdentifierQueryBuilderDsl() {
    }

    public static ProductResourceIdentifierQueryBuilderDsl of() {
        return new ProductResourceIdentifierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductResourceIdentifierQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
        p -> new CombinationQueryPredicate<>(p, ProductResourceIdentifierQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductResourceIdentifierQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, ProductResourceIdentifierQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductResourceIdentifierQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, ProductResourceIdentifierQueryBuilderDsl::of));
    }
    
}
