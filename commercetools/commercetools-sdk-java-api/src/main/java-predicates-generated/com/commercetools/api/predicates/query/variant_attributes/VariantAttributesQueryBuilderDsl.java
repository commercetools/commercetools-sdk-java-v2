
package com.commercetools.api.predicates.query.variant_attributes;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class VariantAttributesQueryBuilderDsl {
    public VariantAttributesQueryBuilderDsl() {
    }

    public static VariantAttributesQueryBuilderDsl of() {
        return new VariantAttributesQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantAttributesQueryBuilderDsl> productId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("productId")),
            p -> new CombinationQueryPredicate<>(p, VariantAttributesQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantAttributesQueryBuilderDsl> productKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("productKey")),
            p -> new CombinationQueryPredicate<>(p, VariantAttributesQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantAttributesQueryBuilderDsl> attributes(
            Function<com.commercetools.api.predicates.query.variant_attributes.VariantAttributesAttributeMetadataQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.variant_attributes.VariantAttributesAttributeMetadataQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("attributes"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.variant_attributes.VariantAttributesAttributeMetadataQueryBuilderDsl
                            .of())),
            VariantAttributesQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<VariantAttributesQueryBuilderDsl> attributes() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributes")),
            p -> new CombinationQueryPredicate<>(p, VariantAttributesQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantAttributesQueryBuilderDsl> variants(
            Function<com.commercetools.api.predicates.query.variant_attributes.VariantAttributesVariantQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.variant_attributes.VariantAttributesVariantQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("variants"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.variant_attributes.VariantAttributesVariantQueryBuilderDsl
                            .of())),
            VariantAttributesQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<VariantAttributesQueryBuilderDsl> variants() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variants")),
            p -> new CombinationQueryPredicate<>(p, VariantAttributesQueryBuilderDsl::of));
    }

}
