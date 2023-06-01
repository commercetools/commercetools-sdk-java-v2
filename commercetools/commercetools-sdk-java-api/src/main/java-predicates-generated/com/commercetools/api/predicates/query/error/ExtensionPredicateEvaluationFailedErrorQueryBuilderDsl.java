package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ExtensionPredicateEvaluationFailedErrorQueryBuilderDsl  {
    public ExtensionPredicateEvaluationFailedErrorQueryBuilderDsl() {
    }

    public static ExtensionPredicateEvaluationFailedErrorQueryBuilderDsl of() {
        return new ExtensionPredicateEvaluationFailedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ExtensionPredicateEvaluationFailedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, ExtensionPredicateEvaluationFailedErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ExtensionPredicateEvaluationFailedErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
        p -> new CombinationQueryPredicate<>(p, ExtensionPredicateEvaluationFailedErrorQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ExtensionPredicateEvaluationFailedErrorQueryBuilderDsl> errorByExtension(
        Function<com.commercetools.api.predicates.query.error.ErrorByExtensionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.ErrorByExtensionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("errorByExtension"))
            .inner(fn.apply(com.commercetools.api.predicates.query.error.ErrorByExtensionQueryBuilderDsl.of())),
            ExtensionPredicateEvaluationFailedErrorQueryBuilderDsl::of);
    }
    
    
}
