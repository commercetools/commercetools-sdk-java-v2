package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductSetProductPriceCustomFieldActionQueryBuilderDsl  {
    public ProductSetProductPriceCustomFieldActionQueryBuilderDsl() {
    }

    public static ProductSetProductPriceCustomFieldActionQueryBuilderDsl of() {
        return new ProductSetProductPriceCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSetProductPriceCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProductSetProductPriceCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductSetProductPriceCustomFieldActionQueryBuilderDsl> priceId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("priceId")),
        p -> new CombinationQueryPredicate<>(p, ProductSetProductPriceCustomFieldActionQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<ProductSetProductPriceCustomFieldActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
        p -> new CombinationQueryPredicate<>(p, ProductSetProductPriceCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductSetProductPriceCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, ProductSetProductPriceCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductSetProductPriceCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
        p -> new CombinationQueryPredicate<>(p, ProductSetProductPriceCustomFieldActionQueryBuilderDsl::of));
    }
    
}
