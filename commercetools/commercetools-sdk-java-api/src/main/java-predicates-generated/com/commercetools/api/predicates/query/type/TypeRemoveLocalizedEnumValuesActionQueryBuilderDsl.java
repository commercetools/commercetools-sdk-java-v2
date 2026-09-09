
package com.commercetools.api.predicates.query.type;

import com.commercetools.api.predicates.query.*;

public class TypeRemoveLocalizedEnumValuesActionQueryBuilderDsl {
    public TypeRemoveLocalizedEnumValuesActionQueryBuilderDsl() {
    }

    public static TypeRemoveLocalizedEnumValuesActionQueryBuilderDsl of() {
        return new TypeRemoveLocalizedEnumValuesActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TypeRemoveLocalizedEnumValuesActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, TypeRemoveLocalizedEnumValuesActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<TypeRemoveLocalizedEnumValuesActionQueryBuilderDsl> fieldName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fieldName")),
            p -> new CombinationQueryPredicate<>(p, TypeRemoveLocalizedEnumValuesActionQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<TypeRemoveLocalizedEnumValuesActionQueryBuilderDsl> keys() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("keys")),
            p -> new CombinationQueryPredicate<>(p, TypeRemoveLocalizedEnumValuesActionQueryBuilderDsl::of));
    }

}
