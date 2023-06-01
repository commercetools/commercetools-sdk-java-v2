package com.commercetools.api.predicates.query.product_type;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductTypeRemoveAttributeDefinitionActionQueryBuilderDsl  {
    public ProductTypeRemoveAttributeDefinitionActionQueryBuilderDsl() {
    }

    public static ProductTypeRemoveAttributeDefinitionActionQueryBuilderDsl of() {
        return new ProductTypeRemoveAttributeDefinitionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTypeRemoveAttributeDefinitionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProductTypeRemoveAttributeDefinitionActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductTypeRemoveAttributeDefinitionActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, ProductTypeRemoveAttributeDefinitionActionQueryBuilderDsl::of));
    }
    
}
