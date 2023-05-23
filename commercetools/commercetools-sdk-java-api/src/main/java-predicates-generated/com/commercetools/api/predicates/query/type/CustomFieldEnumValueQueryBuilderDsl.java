
package com.commercetools.api.predicates.query.type;

import com.commercetools.api.predicates.query.*;

public class CustomFieldEnumValueQueryBuilderDsl {
    public CustomFieldEnumValueQueryBuilderDsl() {
    }

    public static CustomFieldEnumValueQueryBuilderDsl of() {
        return new CustomFieldEnumValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomFieldEnumValueQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, CustomFieldEnumValueQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomFieldEnumValueQueryBuilderDsl> label() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("label")),
            p -> new CombinationQueryPredicate<>(p, CustomFieldEnumValueQueryBuilderDsl::of));
    }

}
