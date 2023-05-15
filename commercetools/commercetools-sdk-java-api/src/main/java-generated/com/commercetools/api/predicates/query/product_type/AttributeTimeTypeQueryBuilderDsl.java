
package com.commercetools.api.predicates.query.product_type;

import com.commercetools.api.predicates.query.*;

public class AttributeTimeTypeQueryBuilderDsl {
    public AttributeTimeTypeQueryBuilderDsl() {
    }

    public static AttributeTimeTypeQueryBuilderDsl of() {
        return new AttributeTimeTypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AttributeTimeTypeQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, AttributeTimeTypeQueryBuilderDsl::of));
    }
}
