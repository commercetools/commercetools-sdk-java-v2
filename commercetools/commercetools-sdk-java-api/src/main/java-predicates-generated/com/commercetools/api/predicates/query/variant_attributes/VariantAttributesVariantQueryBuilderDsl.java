
package com.commercetools.api.predicates.query.variant_attributes;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class VariantAttributesVariantQueryBuilderDsl {
    public VariantAttributesVariantQueryBuilderDsl() {
    }

    public static VariantAttributesVariantQueryBuilderDsl of() {
        return new VariantAttributesVariantQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantAttributesVariantQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, VariantAttributesVariantQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantAttributesVariantQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, VariantAttributesVariantQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantAttributesVariantQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, VariantAttributesVariantQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantAttributesVariantQueryBuilderDsl> availability(
            Function<com.commercetools.api.predicates.query.variant_attributes.VariantAttributesAvailabilityQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.variant_attributes.VariantAttributesAvailabilityQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("availability"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.variant_attributes.VariantAttributesAvailabilityQueryBuilderDsl
                            .of())),
            VariantAttributesVariantQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<VariantAttributesVariantQueryBuilderDsl> attributes(
            Function<com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("attributes"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl.of())),
            VariantAttributesVariantQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<VariantAttributesVariantQueryBuilderDsl> attributes() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributes")),
            p -> new CombinationQueryPredicate<>(p, VariantAttributesVariantQueryBuilderDsl::of));
    }

}
