
package com.commercetools.api.predicates.query.product_tailoring;

import com.commercetools.api.predicates.query.*;

public class ProductTailoringResourceIdentifierQueryBuilderDsl {
    public ProductTailoringResourceIdentifierQueryBuilderDsl() {
    }

    public static ProductTailoringResourceIdentifierQueryBuilderDsl of() {
        return new ProductTailoringResourceIdentifierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTailoringResourceIdentifierQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTailoringResourceIdentifierQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTailoringResourceIdentifierQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringResourceIdentifierQueryBuilderDsl::of));
    }

}
