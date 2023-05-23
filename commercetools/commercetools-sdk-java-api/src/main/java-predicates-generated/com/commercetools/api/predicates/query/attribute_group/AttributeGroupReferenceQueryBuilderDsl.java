
package com.commercetools.api.predicates.query.attribute_group;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class AttributeGroupReferenceQueryBuilderDsl {
    public AttributeGroupReferenceQueryBuilderDsl() {
    }

    public static AttributeGroupReferenceQueryBuilderDsl of() {
        return new AttributeGroupReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AttributeGroupReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, AttributeGroupReferenceQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AttributeGroupReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, AttributeGroupReferenceQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AttributeGroupReferenceQueryBuilderDsl> obj(
            Function<com.commercetools.api.predicates.query.attribute_group.AttributeGroupQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.attribute_group.AttributeGroupQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("obj"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.attribute_group.AttributeGroupQueryBuilderDsl.of())),
            AttributeGroupReferenceQueryBuilderDsl::of);
    }

}
