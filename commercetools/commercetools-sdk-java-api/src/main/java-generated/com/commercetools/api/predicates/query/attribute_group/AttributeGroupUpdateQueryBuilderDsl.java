
package com.commercetools.api.predicates.query.attribute_group;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class AttributeGroupUpdateQueryBuilderDsl {
    public AttributeGroupUpdateQueryBuilderDsl() {
    }

    public static AttributeGroupUpdateQueryBuilderDsl of() {
        return new AttributeGroupUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<AttributeGroupUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, AttributeGroupUpdateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AttributeGroupUpdateQueryBuilderDsl> actions(
            Function<com.commercetools.api.predicates.query.attribute_group.AttributeGroupUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.attribute_group.AttributeGroupUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("actions"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.attribute_group.AttributeGroupUpdateActionQueryBuilderDsl
                            .of())),
            AttributeGroupUpdateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<AttributeGroupUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
            p -> new CombinationQueryPredicate<>(p, AttributeGroupUpdateQueryBuilderDsl::of));
    }
}
