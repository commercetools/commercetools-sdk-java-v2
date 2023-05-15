
package com.commercetools.api.predicates.query.product_type;

import com.commercetools.api.predicates.query.*;

public class AttributeTypeQueryBuilderDsl {
    public AttributeTypeQueryBuilderDsl() {
    }

    public static AttributeTypeQueryBuilderDsl of() {
        return new AttributeTypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AttributeTypeQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, AttributeTypeQueryBuilderDsl::of));
    }
}
