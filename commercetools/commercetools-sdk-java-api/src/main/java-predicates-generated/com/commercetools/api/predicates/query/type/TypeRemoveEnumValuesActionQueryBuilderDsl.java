
package com.commercetools.api.predicates.query.type;

import com.commercetools.api.predicates.query.*;

public class TypeRemoveEnumValuesActionQueryBuilderDsl {
    public TypeRemoveEnumValuesActionQueryBuilderDsl() {
    }

    public static TypeRemoveEnumValuesActionQueryBuilderDsl of() {
        return new TypeRemoveEnumValuesActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TypeRemoveEnumValuesActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, TypeRemoveEnumValuesActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<TypeRemoveEnumValuesActionQueryBuilderDsl> fieldName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fieldName")),
            p -> new CombinationQueryPredicate<>(p, TypeRemoveEnumValuesActionQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<TypeRemoveEnumValuesActionQueryBuilderDsl> keys() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("keys")),
            p -> new CombinationQueryPredicate<>(p, TypeRemoveEnumValuesActionQueryBuilderDsl::of));
    }

}
