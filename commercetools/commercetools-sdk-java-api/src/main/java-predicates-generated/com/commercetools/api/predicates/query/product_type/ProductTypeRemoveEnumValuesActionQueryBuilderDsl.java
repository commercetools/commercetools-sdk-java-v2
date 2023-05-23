
package com.commercetools.api.predicates.query.product_type;

import com.commercetools.api.predicates.query.*;

public class ProductTypeRemoveEnumValuesActionQueryBuilderDsl {
    public ProductTypeRemoveEnumValuesActionQueryBuilderDsl() {
    }

    public static ProductTypeRemoveEnumValuesActionQueryBuilderDsl of() {
        return new ProductTypeRemoveEnumValuesActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTypeRemoveEnumValuesActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeRemoveEnumValuesActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTypeRemoveEnumValuesActionQueryBuilderDsl> attributeName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributeName")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeRemoveEnumValuesActionQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<ProductTypeRemoveEnumValuesActionQueryBuilderDsl> keys() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("keys")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeRemoveEnumValuesActionQueryBuilderDsl::of));
    }

}
