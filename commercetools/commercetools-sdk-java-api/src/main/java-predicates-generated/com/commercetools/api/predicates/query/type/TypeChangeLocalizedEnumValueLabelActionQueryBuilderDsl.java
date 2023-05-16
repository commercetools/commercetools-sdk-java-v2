
package com.commercetools.api.predicates.query.type;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class TypeChangeLocalizedEnumValueLabelActionQueryBuilderDsl {
    public TypeChangeLocalizedEnumValueLabelActionQueryBuilderDsl() {
    }

    public static TypeChangeLocalizedEnumValueLabelActionQueryBuilderDsl of() {
        return new TypeChangeLocalizedEnumValueLabelActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TypeChangeLocalizedEnumValueLabelActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, TypeChangeLocalizedEnumValueLabelActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<TypeChangeLocalizedEnumValueLabelActionQueryBuilderDsl> fieldName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fieldName")),
            p -> new CombinationQueryPredicate<>(p, TypeChangeLocalizedEnumValueLabelActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<TypeChangeLocalizedEnumValueLabelActionQueryBuilderDsl> value(
            Function<com.commercetools.api.predicates.query.type.CustomFieldLocalizedEnumValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldLocalizedEnumValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("value"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.type.CustomFieldLocalizedEnumValueQueryBuilderDsl.of())),
            TypeChangeLocalizedEnumValueLabelActionQueryBuilderDsl::of);
    }

}
