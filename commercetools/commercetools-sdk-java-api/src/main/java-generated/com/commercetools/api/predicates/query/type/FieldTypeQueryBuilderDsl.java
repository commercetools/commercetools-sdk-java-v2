
package com.commercetools.api.predicates.query.type;

import com.commercetools.api.predicates.query.*;

public class FieldTypeQueryBuilderDsl {
    public FieldTypeQueryBuilderDsl() {
    }

    public static FieldTypeQueryBuilderDsl of() {
        return new FieldTypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<FieldTypeQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, FieldTypeQueryBuilderDsl::of));
    }
}
