
package com.commercetools.api.predicates.query.attribute_group;

import com.commercetools.api.predicates.query.*;

public class AttributeReferenceQueryBuilderDsl {
    public AttributeReferenceQueryBuilderDsl() {
    }

    public static AttributeReferenceQueryBuilderDsl of() {
        return new AttributeReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AttributeReferenceQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, AttributeReferenceQueryBuilderDsl::of));
    }
}
