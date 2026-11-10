
package com.commercetools.api.predicates.query.variant;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class VariantSetAttributesActionQueryBuilderDsl {
    public VariantSetAttributesActionQueryBuilderDsl() {
    }

    public static VariantSetAttributesActionQueryBuilderDsl of() {
        return new VariantSetAttributesActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantSetAttributesActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, VariantSetAttributesActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantSetAttributesActionQueryBuilderDsl> attributes(
            Function<com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("attributes"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl.of())),
            VariantSetAttributesActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<VariantSetAttributesActionQueryBuilderDsl> attributes() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributes")),
            p -> new CombinationQueryPredicate<>(p, VariantSetAttributesActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<VariantSetAttributesActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, VariantSetAttributesActionQueryBuilderDsl::of));
    }

}
