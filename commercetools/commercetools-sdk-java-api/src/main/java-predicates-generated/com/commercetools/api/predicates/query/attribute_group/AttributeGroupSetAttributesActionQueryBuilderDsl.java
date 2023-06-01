package com.commercetools.api.predicates.query.attribute_group;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class AttributeGroupSetAttributesActionQueryBuilderDsl  {
    public AttributeGroupSetAttributesActionQueryBuilderDsl() {
    }

    public static AttributeGroupSetAttributesActionQueryBuilderDsl of() {
        return new AttributeGroupSetAttributesActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AttributeGroupSetAttributesActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, AttributeGroupSetAttributesActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<AttributeGroupSetAttributesActionQueryBuilderDsl> attributes(
        Function<com.commercetools.api.predicates.query.attribute_group.AttributeReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.attribute_group.AttributeReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("attributes"))
            .inner(fn.apply(com.commercetools.api.predicates.query.attribute_group.AttributeReferenceQueryBuilderDsl.of())),
            AttributeGroupSetAttributesActionQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<AttributeGroupSetAttributesActionQueryBuilderDsl> attributes() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributes")),
                p -> new CombinationQueryPredicate<>(p, AttributeGroupSetAttributesActionQueryBuilderDsl::of));
    }
    
}
