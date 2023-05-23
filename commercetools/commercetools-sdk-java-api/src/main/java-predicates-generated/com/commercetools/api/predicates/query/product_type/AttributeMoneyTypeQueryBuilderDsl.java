
package com.commercetools.api.predicates.query.product_type;

import com.commercetools.api.predicates.query.*;

public class AttributeMoneyTypeQueryBuilderDsl {
    public AttributeMoneyTypeQueryBuilderDsl() {
    }

    public static AttributeMoneyTypeQueryBuilderDsl of() {
        return new AttributeMoneyTypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AttributeMoneyTypeQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, AttributeMoneyTypeQueryBuilderDsl::of));
    }

}
