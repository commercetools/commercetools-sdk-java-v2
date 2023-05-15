
package com.commercetools.api.predicates.query.product_type;

import com.commercetools.api.predicates.query.*;

public class ProductTypeResourceIdentifierQueryBuilderDsl {
    public ProductTypeResourceIdentifierQueryBuilderDsl() {
    }

    public static ProductTypeResourceIdentifierQueryBuilderDsl of() {
        return new ProductTypeResourceIdentifierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTypeResourceIdentifierQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTypeResourceIdentifierQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTypeResourceIdentifierQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeResourceIdentifierQueryBuilderDsl::of));
    }
}
