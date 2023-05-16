
package com.commercetools.api.predicates.query.type;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomFieldLocalizedEnumValueQueryBuilderDsl {
    public CustomFieldLocalizedEnumValueQueryBuilderDsl() {
    }

    public static CustomFieldLocalizedEnumValueQueryBuilderDsl of() {
        return new CustomFieldLocalizedEnumValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomFieldLocalizedEnumValueQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, CustomFieldLocalizedEnumValueQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomFieldLocalizedEnumValueQueryBuilderDsl> label(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("label"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            CustomFieldLocalizedEnumValueQueryBuilderDsl::of);
    }

}
