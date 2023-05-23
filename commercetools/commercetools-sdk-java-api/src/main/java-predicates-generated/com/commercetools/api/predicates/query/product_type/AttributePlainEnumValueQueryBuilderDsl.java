
package com.commercetools.api.predicates.query.product_type;

import com.commercetools.api.predicates.query.*;

public class AttributePlainEnumValueQueryBuilderDsl {
    public AttributePlainEnumValueQueryBuilderDsl() {
    }

    public static AttributePlainEnumValueQueryBuilderDsl of() {
        return new AttributePlainEnumValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AttributePlainEnumValueQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, AttributePlainEnumValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AttributePlainEnumValueQueryBuilderDsl> label() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("label")),
            p -> new CombinationQueryPredicate<>(p, AttributePlainEnumValueQueryBuilderDsl::of));
    }

}
