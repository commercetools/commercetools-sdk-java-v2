
package com.commercetools.api.predicates.query.product_type;

import com.commercetools.api.predicates.query.*;

public class AttributeNumberTypeQueryBuilderDsl {
    public AttributeNumberTypeQueryBuilderDsl() {
    }

    public static AttributeNumberTypeQueryBuilderDsl of() {
        return new AttributeNumberTypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AttributeNumberTypeQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, AttributeNumberTypeQueryBuilderDsl::of));
    }
}
