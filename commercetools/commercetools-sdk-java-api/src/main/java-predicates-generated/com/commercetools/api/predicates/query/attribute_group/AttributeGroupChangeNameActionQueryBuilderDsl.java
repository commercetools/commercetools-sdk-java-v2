package com.commercetools.api.predicates.query.attribute_group;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class AttributeGroupChangeNameActionQueryBuilderDsl  {
    public AttributeGroupChangeNameActionQueryBuilderDsl() {
    }

    public static AttributeGroupChangeNameActionQueryBuilderDsl of() {
        return new AttributeGroupChangeNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AttributeGroupChangeNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, AttributeGroupChangeNameActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<AttributeGroupChangeNameActionQueryBuilderDsl> name(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("name"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            AttributeGroupChangeNameActionQueryBuilderDsl::of);
    }
    
    
}
