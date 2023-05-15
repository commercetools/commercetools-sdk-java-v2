
package com.commercetools.api.predicates.query.product_selection;

import com.commercetools.api.predicates.query.*;

public class ProductSelectionResourceIdentifierQueryBuilderDsl {
    public ProductSelectionResourceIdentifierQueryBuilderDsl() {
    }

    public static ProductSelectionResourceIdentifierQueryBuilderDsl of() {
        return new ProductSelectionResourceIdentifierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSelectionResourceIdentifierQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSelectionResourceIdentifierQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSelectionResourceIdentifierQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionResourceIdentifierQueryBuilderDsl::of));
    }
}
