
package com.commercetools.api.predicates.query.product_type;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductTypeChangeLocalizedEnumValueLabelActionQueryBuilderDsl {
    public ProductTypeChangeLocalizedEnumValueLabelActionQueryBuilderDsl() {
    }

    public static ProductTypeChangeLocalizedEnumValueLabelActionQueryBuilderDsl of() {
        return new ProductTypeChangeLocalizedEnumValueLabelActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTypeChangeLocalizedEnumValueLabelActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeChangeLocalizedEnumValueLabelActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTypeChangeLocalizedEnumValueLabelActionQueryBuilderDsl> attributeName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributeName")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeChangeLocalizedEnumValueLabelActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTypeChangeLocalizedEnumValueLabelActionQueryBuilderDsl> newValue(
            Function<com.commercetools.api.predicates.query.product_type.AttributeLocalizedEnumValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.AttributeLocalizedEnumValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("newValue"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_type.AttributeLocalizedEnumValueQueryBuilderDsl
                            .of())),
            ProductTypeChangeLocalizedEnumValueLabelActionQueryBuilderDsl::of);
    }

}
