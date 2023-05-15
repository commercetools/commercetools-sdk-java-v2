
package com.commercetools.api.predicates.query.type;

import com.commercetools.api.predicates.query.*;

public class CustomFieldReferenceTypeQueryBuilderDsl {
    public CustomFieldReferenceTypeQueryBuilderDsl() {
    }

    public static CustomFieldReferenceTypeQueryBuilderDsl of() {
        return new CustomFieldReferenceTypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomFieldReferenceTypeQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, CustomFieldReferenceTypeQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomFieldReferenceTypeQueryBuilderDsl> referenceTypeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("referenceTypeId")),
            p -> new CombinationQueryPredicate<>(p, CustomFieldReferenceTypeQueryBuilderDsl::of));
    }
}
