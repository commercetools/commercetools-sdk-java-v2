
package com.commercetools.api.predicates.query.variant_attributes;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class VariantAttributesAttributeMetadataQueryBuilderDsl {
    public VariantAttributesAttributeMetadataQueryBuilderDsl() {
    }

    public static VariantAttributesAttributeMetadataQueryBuilderDsl of() {
        return new VariantAttributesAttributeMetadataQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantAttributesAttributeMetadataQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, VariantAttributesAttributeMetadataQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantAttributesAttributeMetadataQueryBuilderDsl> label(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("label"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            VariantAttributesAttributeMetadataQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<VariantAttributesAttributeMetadataQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, VariantAttributesAttributeMetadataQueryBuilderDsl::of));
    }

}
