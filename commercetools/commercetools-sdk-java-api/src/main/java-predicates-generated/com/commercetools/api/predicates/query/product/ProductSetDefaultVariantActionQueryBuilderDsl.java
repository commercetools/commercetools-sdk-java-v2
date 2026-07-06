
package com.commercetools.api.predicates.query.product;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSetDefaultVariantActionQueryBuilderDsl {
    public ProductSetDefaultVariantActionQueryBuilderDsl() {
    }

    public static ProductSetDefaultVariantActionQueryBuilderDsl of() {
        return new ProductSetDefaultVariantActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSetDefaultVariantActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductSetDefaultVariantActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSetDefaultVariantActionQueryBuilderDsl> variant(
            Function<com.commercetools.api.predicates.query.variant.VariantResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.variant.VariantResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("variant"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.variant.VariantResourceIdentifierQueryBuilderDsl.of())),
            ProductSetDefaultVariantActionQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ProductSetDefaultVariantActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductSetDefaultVariantActionQueryBuilderDsl::of));
    }

}
