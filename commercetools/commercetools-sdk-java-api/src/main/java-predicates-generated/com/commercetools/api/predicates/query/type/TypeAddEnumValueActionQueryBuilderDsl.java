package com.commercetools.api.predicates.query.type;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class TypeAddEnumValueActionQueryBuilderDsl  {
    public TypeAddEnumValueActionQueryBuilderDsl() {
    }

    public static TypeAddEnumValueActionQueryBuilderDsl of() {
        return new TypeAddEnumValueActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TypeAddEnumValueActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, TypeAddEnumValueActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<TypeAddEnumValueActionQueryBuilderDsl> fieldName() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fieldName")),
        p -> new CombinationQueryPredicate<>(p, TypeAddEnumValueActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<TypeAddEnumValueActionQueryBuilderDsl> value(
        Function<com.commercetools.api.predicates.query.type.CustomFieldEnumValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldEnumValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("value"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldEnumValueQueryBuilderDsl.of())),
            TypeAddEnumValueActionQueryBuilderDsl::of);
    }
    
    
}
