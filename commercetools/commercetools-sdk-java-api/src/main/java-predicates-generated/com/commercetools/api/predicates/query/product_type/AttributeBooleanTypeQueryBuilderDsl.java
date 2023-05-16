
package com.commercetools.api.predicates.query.product_type;

import com.commercetools.api.predicates.query.*;

public class AttributeBooleanTypeQueryBuilderDsl {
    public AttributeBooleanTypeQueryBuilderDsl() {
    }

    public static AttributeBooleanTypeQueryBuilderDsl of() {
        return new AttributeBooleanTypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AttributeBooleanTypeQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, AttributeBooleanTypeQueryBuilderDsl::of));
    }

}
