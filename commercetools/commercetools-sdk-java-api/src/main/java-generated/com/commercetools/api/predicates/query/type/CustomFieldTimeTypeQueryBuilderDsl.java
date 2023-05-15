
package com.commercetools.api.predicates.query.type;

import com.commercetools.api.predicates.query.*;

public class CustomFieldTimeTypeQueryBuilderDsl {
    public CustomFieldTimeTypeQueryBuilderDsl() {
    }

    public static CustomFieldTimeTypeQueryBuilderDsl of() {
        return new CustomFieldTimeTypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomFieldTimeTypeQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, CustomFieldTimeTypeQueryBuilderDsl::of));
    }
}
