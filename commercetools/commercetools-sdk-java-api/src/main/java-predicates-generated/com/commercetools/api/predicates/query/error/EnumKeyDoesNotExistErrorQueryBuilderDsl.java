package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class EnumKeyDoesNotExistErrorQueryBuilderDsl  {
    public EnumKeyDoesNotExistErrorQueryBuilderDsl() {
    }

    public static EnumKeyDoesNotExistErrorQueryBuilderDsl of() {
        return new EnumKeyDoesNotExistErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<EnumKeyDoesNotExistErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, EnumKeyDoesNotExistErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<EnumKeyDoesNotExistErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
        p -> new CombinationQueryPredicate<>(p, EnumKeyDoesNotExistErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<EnumKeyDoesNotExistErrorQueryBuilderDsl> conflictingEnumKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("conflictingEnumKey")),
        p -> new CombinationQueryPredicate<>(p, EnumKeyDoesNotExistErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<EnumKeyDoesNotExistErrorQueryBuilderDsl> conflictingAttributeName() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("conflictingAttributeName")),
        p -> new CombinationQueryPredicate<>(p, EnumKeyDoesNotExistErrorQueryBuilderDsl::of));
    }
    
}
