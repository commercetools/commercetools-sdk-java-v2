
package com.commercetools.api.predicates.query.type;

import com.commercetools.api.predicates.query.*;

public class CustomFieldDateTypeQueryBuilderDsl {
    public CustomFieldDateTypeQueryBuilderDsl() {
    }

    public static CustomFieldDateTypeQueryBuilderDsl of() {
        return new CustomFieldDateTypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomFieldDateTypeQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, CustomFieldDateTypeQueryBuilderDsl::of));
    }

}
