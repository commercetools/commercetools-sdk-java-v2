
package com.commercetools.api.predicates.query.type;

import com.commercetools.api.predicates.query.*;

public class CustomFieldBooleanTypeQueryBuilderDsl {
    public CustomFieldBooleanTypeQueryBuilderDsl() {
    }

    public static CustomFieldBooleanTypeQueryBuilderDsl of() {
        return new CustomFieldBooleanTypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomFieldBooleanTypeQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, CustomFieldBooleanTypeQueryBuilderDsl::of));
    }

}
