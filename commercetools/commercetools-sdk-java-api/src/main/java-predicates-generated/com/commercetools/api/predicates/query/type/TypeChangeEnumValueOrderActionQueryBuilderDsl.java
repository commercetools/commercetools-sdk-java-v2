package com.commercetools.api.predicates.query.type;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class TypeChangeEnumValueOrderActionQueryBuilderDsl  {
    public TypeChangeEnumValueOrderActionQueryBuilderDsl() {
    }

    public static TypeChangeEnumValueOrderActionQueryBuilderDsl of() {
        return new TypeChangeEnumValueOrderActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TypeChangeEnumValueOrderActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, TypeChangeEnumValueOrderActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<TypeChangeEnumValueOrderActionQueryBuilderDsl> fieldName() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fieldName")),
        p -> new CombinationQueryPredicate<>(p, TypeChangeEnumValueOrderActionQueryBuilderDsl::of));
    }
    public StringCollectionPredicateBuilder<TypeChangeEnumValueOrderActionQueryBuilderDsl> keys() {
        return new StringCollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("keys")),
        p -> new CombinationQueryPredicate<>(p, TypeChangeEnumValueOrderActionQueryBuilderDsl::of));
    }
    
}
