package com.commercetools.api.predicates.query.type;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class TypeChangeLocalizedEnumValueOrderActionQueryBuilderDsl  {
    public TypeChangeLocalizedEnumValueOrderActionQueryBuilderDsl() {
    }

    public static TypeChangeLocalizedEnumValueOrderActionQueryBuilderDsl of() {
        return new TypeChangeLocalizedEnumValueOrderActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TypeChangeLocalizedEnumValueOrderActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, TypeChangeLocalizedEnumValueOrderActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<TypeChangeLocalizedEnumValueOrderActionQueryBuilderDsl> fieldName() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fieldName")),
        p -> new CombinationQueryPredicate<>(p, TypeChangeLocalizedEnumValueOrderActionQueryBuilderDsl::of));
    }
    public StringCollectionPredicateBuilder<TypeChangeLocalizedEnumValueOrderActionQueryBuilderDsl> keys() {
        return new StringCollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("keys")),
        p -> new CombinationQueryPredicate<>(p, TypeChangeLocalizedEnumValueOrderActionQueryBuilderDsl::of));
    }
    
}
