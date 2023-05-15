
package com.commercetools.api.predicates.query.attribute_group;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class AttributeGroupAddAttributeActionQueryBuilderDsl {
    public AttributeGroupAddAttributeActionQueryBuilderDsl() {
    }

    public static AttributeGroupAddAttributeActionQueryBuilderDsl of() {
        return new AttributeGroupAddAttributeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AttributeGroupAddAttributeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, AttributeGroupAddAttributeActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AttributeGroupAddAttributeActionQueryBuilderDsl> attribute(
            Function<com.commercetools.api.predicates.query.attribute_group.AttributeReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.attribute_group.AttributeReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("attribute"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.attribute_group.AttributeReferenceQueryBuilderDsl.of())),
            AttributeGroupAddAttributeActionQueryBuilderDsl::of);
    }

}
