
package com.commercetools.api.predicates.query.product_selection;

import com.commercetools.api.predicates.query.*;

public class ProductSelectionSetCustomFieldActionQueryBuilderDsl {
    public ProductSelectionSetCustomFieldActionQueryBuilderDsl() {
    }

    public static ProductSelectionSetCustomFieldActionQueryBuilderDsl of() {
        return new ProductSelectionSetCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSelectionSetCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionSetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSelectionSetCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionSetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSelectionSetCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionSetCustomFieldActionQueryBuilderDsl::of));
    }

}
