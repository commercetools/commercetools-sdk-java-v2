
package com.commercetools.api.predicates.query.product_type;

import com.commercetools.api.predicates.query.*;

public class AttributeDateTypeQueryBuilderDsl {
    public AttributeDateTypeQueryBuilderDsl() {
    }

    public static AttributeDateTypeQueryBuilderDsl of() {
        return new AttributeDateTypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AttributeDateTypeQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, AttributeDateTypeQueryBuilderDsl::of));
    }
}
