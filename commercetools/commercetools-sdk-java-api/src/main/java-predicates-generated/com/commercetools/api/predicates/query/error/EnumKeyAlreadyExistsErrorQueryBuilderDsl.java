package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class EnumKeyAlreadyExistsErrorQueryBuilderDsl  {
    public EnumKeyAlreadyExistsErrorQueryBuilderDsl() {
    }

    public static EnumKeyAlreadyExistsErrorQueryBuilderDsl of() {
        return new EnumKeyAlreadyExistsErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<EnumKeyAlreadyExistsErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, EnumKeyAlreadyExistsErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<EnumKeyAlreadyExistsErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
        p -> new CombinationQueryPredicate<>(p, EnumKeyAlreadyExistsErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<EnumKeyAlreadyExistsErrorQueryBuilderDsl> conflictingEnumKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("conflictingEnumKey")),
        p -> new CombinationQueryPredicate<>(p, EnumKeyAlreadyExistsErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<EnumKeyAlreadyExistsErrorQueryBuilderDsl> conflictingAttributeName() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("conflictingAttributeName")),
        p -> new CombinationQueryPredicate<>(p, EnumKeyAlreadyExistsErrorQueryBuilderDsl::of));
    }
    
}
