
package com.commercetools.api.predicates.query.type;

import com.commercetools.api.predicates.query.*;

public class CustomFieldDateTimeTypeQueryBuilderDsl {
    public CustomFieldDateTimeTypeQueryBuilderDsl() {
    }

    public static CustomFieldDateTimeTypeQueryBuilderDsl of() {
        return new CustomFieldDateTimeTypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomFieldDateTimeTypeQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, CustomFieldDateTimeTypeQueryBuilderDsl::of));
    }
}
