
package com.commercetools.api.predicates.query.shipping_method;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShippingMethodChangeTaxCategoryActionQueryBuilderDsl {
    public ShippingMethodChangeTaxCategoryActionQueryBuilderDsl() {
    }

    public static ShippingMethodChangeTaxCategoryActionQueryBuilderDsl of() {
        return new ShippingMethodChangeTaxCategoryActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShippingMethodChangeTaxCategoryActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodChangeTaxCategoryActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShippingMethodChangeTaxCategoryActionQueryBuilderDsl> taxCategory(
            Function<com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("taxCategory"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl
                            .of())),
            ShippingMethodChangeTaxCategoryActionQueryBuilderDsl::of);
    }

}
