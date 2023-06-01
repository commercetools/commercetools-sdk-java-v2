package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class DuplicateFieldWithConflictingResourceErrorQueryBuilderDsl  {
    public DuplicateFieldWithConflictingResourceErrorQueryBuilderDsl() {
    }

    public static DuplicateFieldWithConflictingResourceErrorQueryBuilderDsl of() {
        return new DuplicateFieldWithConflictingResourceErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DuplicateFieldWithConflictingResourceErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, DuplicateFieldWithConflictingResourceErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<DuplicateFieldWithConflictingResourceErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
        p -> new CombinationQueryPredicate<>(p, DuplicateFieldWithConflictingResourceErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<DuplicateFieldWithConflictingResourceErrorQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
        p -> new CombinationQueryPredicate<>(p, DuplicateFieldWithConflictingResourceErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<DuplicateFieldWithConflictingResourceErrorQueryBuilderDsl> duplicateValue() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("duplicateValue")),
        p -> new CombinationQueryPredicate<>(p, DuplicateFieldWithConflictingResourceErrorQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<DuplicateFieldWithConflictingResourceErrorQueryBuilderDsl> conflictingResource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("conflictingResource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            DuplicateFieldWithConflictingResourceErrorQueryBuilderDsl::of);
    }
    
    
}
