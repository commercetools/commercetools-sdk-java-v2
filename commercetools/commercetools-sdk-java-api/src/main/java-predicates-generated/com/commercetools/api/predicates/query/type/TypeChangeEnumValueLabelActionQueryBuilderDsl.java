
package com.commercetools.api.predicates.query.type;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class TypeChangeEnumValueLabelActionQueryBuilderDsl {
    public TypeChangeEnumValueLabelActionQueryBuilderDsl() {
    }

    public static TypeChangeEnumValueLabelActionQueryBuilderDsl of() {
        return new TypeChangeEnumValueLabelActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TypeChangeEnumValueLabelActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, TypeChangeEnumValueLabelActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<TypeChangeEnumValueLabelActionQueryBuilderDsl> fieldName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fieldName")),
            p -> new CombinationQueryPredicate<>(p, TypeChangeEnumValueLabelActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<TypeChangeEnumValueLabelActionQueryBuilderDsl> value(
            Function<com.commercetools.api.predicates.query.type.CustomFieldEnumValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldEnumValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("value"))
                .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldEnumValueQueryBuilderDsl.of())),
            TypeChangeEnumValueLabelActionQueryBuilderDsl::of);
    }

}
