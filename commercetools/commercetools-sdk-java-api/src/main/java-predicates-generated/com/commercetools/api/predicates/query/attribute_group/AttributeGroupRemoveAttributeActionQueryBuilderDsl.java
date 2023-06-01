package com.commercetools.api.predicates.query.attribute_group;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class AttributeGroupRemoveAttributeActionQueryBuilderDsl  {
    public AttributeGroupRemoveAttributeActionQueryBuilderDsl() {
    }

    public static AttributeGroupRemoveAttributeActionQueryBuilderDsl of() {
        return new AttributeGroupRemoveAttributeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AttributeGroupRemoveAttributeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, AttributeGroupRemoveAttributeActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<AttributeGroupRemoveAttributeActionQueryBuilderDsl> attribute(
        Function<com.commercetools.api.predicates.query.attribute_group.AttributeReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.attribute_group.AttributeReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("attribute"))
            .inner(fn.apply(com.commercetools.api.predicates.query.attribute_group.AttributeReferenceQueryBuilderDsl.of())),
            AttributeGroupRemoveAttributeActionQueryBuilderDsl::of);
    }
    
    
}
