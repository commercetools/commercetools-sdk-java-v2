package com.commercetools.api.predicates.query.type;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class TypeAddLocalizedEnumValueActionQueryBuilderDsl  {
    public TypeAddLocalizedEnumValueActionQueryBuilderDsl() {
    }

    public static TypeAddLocalizedEnumValueActionQueryBuilderDsl of() {
        return new TypeAddLocalizedEnumValueActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TypeAddLocalizedEnumValueActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, TypeAddLocalizedEnumValueActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<TypeAddLocalizedEnumValueActionQueryBuilderDsl> fieldName() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fieldName")),
        p -> new CombinationQueryPredicate<>(p, TypeAddLocalizedEnumValueActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<TypeAddLocalizedEnumValueActionQueryBuilderDsl> value(
        Function<com.commercetools.api.predicates.query.type.CustomFieldLocalizedEnumValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldLocalizedEnumValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("value"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldLocalizedEnumValueQueryBuilderDsl.of())),
            TypeAddLocalizedEnumValueActionQueryBuilderDsl::of);
    }
    
    
}
