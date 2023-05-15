
package com.commercetools.api.predicates.query.attribute_group;

import com.commercetools.api.predicates.query.*;

public class AttributeGroupSetKeyActionQueryBuilderDsl {
    public AttributeGroupSetKeyActionQueryBuilderDsl() {
    }

    public static AttributeGroupSetKeyActionQueryBuilderDsl of() {
        return new AttributeGroupSetKeyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AttributeGroupSetKeyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, AttributeGroupSetKeyActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AttributeGroupSetKeyActionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, AttributeGroupSetKeyActionQueryBuilderDsl::of));
    }
}
