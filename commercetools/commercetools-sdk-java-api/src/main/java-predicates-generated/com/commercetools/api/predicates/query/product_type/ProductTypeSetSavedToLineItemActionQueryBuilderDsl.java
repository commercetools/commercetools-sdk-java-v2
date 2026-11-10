
package com.commercetools.api.predicates.query.product_type;

import com.commercetools.api.predicates.query.*;

public class ProductTypeSetSavedToLineItemActionQueryBuilderDsl {
    public ProductTypeSetSavedToLineItemActionQueryBuilderDsl() {
    }

    public static ProductTypeSetSavedToLineItemActionQueryBuilderDsl of() {
        return new ProductTypeSetSavedToLineItemActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTypeSetSavedToLineItemActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeSetSavedToLineItemActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTypeSetSavedToLineItemActionQueryBuilderDsl> attributeName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributeName")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeSetSavedToLineItemActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductTypeSetSavedToLineItemActionQueryBuilderDsl> savedToLineItem() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("savedToLineItem")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeSetSavedToLineItemActionQueryBuilderDsl::of));
    }

}
