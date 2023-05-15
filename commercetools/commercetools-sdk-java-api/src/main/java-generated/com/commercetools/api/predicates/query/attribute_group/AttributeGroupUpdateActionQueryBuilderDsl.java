
package com.commercetools.api.predicates.query.attribute_group;

import com.commercetools.api.predicates.query.*;

public class AttributeGroupUpdateActionQueryBuilderDsl {
    public AttributeGroupUpdateActionQueryBuilderDsl() {
    }

    public static AttributeGroupUpdateActionQueryBuilderDsl of() {
        return new AttributeGroupUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AttributeGroupUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, AttributeGroupUpdateActionQueryBuilderDsl::of));
    }
}
