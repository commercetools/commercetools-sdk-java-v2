
package com.commercetools.api.predicates.query.error;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class VariantValuesQueryBuilderDsl {
    public VariantValuesQueryBuilderDsl() {
    }

    public static VariantValuesQueryBuilderDsl of() {
        return new VariantValuesQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantValuesQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, VariantValuesQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantValuesQueryBuilderDsl> prices(
            Function<com.commercetools.api.predicates.query.common.PriceDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.PriceDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("prices"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.PriceDraftQueryBuilderDsl.of())),
            VariantValuesQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<VariantValuesQueryBuilderDsl> prices() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("prices")),
            p -> new CombinationQueryPredicate<>(p, VariantValuesQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantValuesQueryBuilderDsl> attributes(
            Function<com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("attributes"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl.of())),
            VariantValuesQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<VariantValuesQueryBuilderDsl> attributes() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributes")),
            p -> new CombinationQueryPredicate<>(p, VariantValuesQueryBuilderDsl::of));
    }

}
