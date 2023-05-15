
package com.commercetools.api.predicates.query.type;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomFieldLocalizedEnumTypeQueryBuilderDsl {
    public CustomFieldLocalizedEnumTypeQueryBuilderDsl() {
    }

    public static CustomFieldLocalizedEnumTypeQueryBuilderDsl of() {
        return new CustomFieldLocalizedEnumTypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomFieldLocalizedEnumTypeQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, CustomFieldLocalizedEnumTypeQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomFieldLocalizedEnumTypeQueryBuilderDsl> values(
            Function<com.commercetools.api.predicates.query.type.CustomFieldLocalizedEnumValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldLocalizedEnumValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("values"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.type.CustomFieldLocalizedEnumValueQueryBuilderDsl.of())),
            CustomFieldLocalizedEnumTypeQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CustomFieldLocalizedEnumTypeQueryBuilderDsl> values() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("values")),
            p -> new CombinationQueryPredicate<>(p, CustomFieldLocalizedEnumTypeQueryBuilderDsl::of));
    }
}
