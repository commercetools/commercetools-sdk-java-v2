
package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

public class AttributeQueryBuilderDsl implements AttributeQueryBuilderMixin {
    public AttributeQueryBuilderDsl() {
    }

    public static AttributeQueryBuilderDsl of() {
        return new AttributeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AttributeQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, AttributeQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AttributeQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, AttributeQueryBuilderDsl::of));
    }

}
