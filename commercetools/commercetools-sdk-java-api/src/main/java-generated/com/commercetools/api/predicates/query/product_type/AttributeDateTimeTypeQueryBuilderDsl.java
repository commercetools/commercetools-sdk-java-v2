
package com.commercetools.api.predicates.query.product_type;

import com.commercetools.api.predicates.query.*;

public class AttributeDateTimeTypeQueryBuilderDsl {
    public AttributeDateTimeTypeQueryBuilderDsl() {
    }

    public static AttributeDateTimeTypeQueryBuilderDsl of() {
        return new AttributeDateTimeTypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AttributeDateTimeTypeQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, AttributeDateTimeTypeQueryBuilderDsl::of));
    }
}
