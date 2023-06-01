package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ExtensionUpdateActionsFailedErrorQueryBuilderDsl  {
    public ExtensionUpdateActionsFailedErrorQueryBuilderDsl() {
    }

    public static ExtensionUpdateActionsFailedErrorQueryBuilderDsl of() {
        return new ExtensionUpdateActionsFailedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ExtensionUpdateActionsFailedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, ExtensionUpdateActionsFailedErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ExtensionUpdateActionsFailedErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
        p -> new CombinationQueryPredicate<>(p, ExtensionUpdateActionsFailedErrorQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ExtensionUpdateActionsFailedErrorQueryBuilderDsl> localizedMessage(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("localizedMessage"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ExtensionUpdateActionsFailedErrorQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<ExtensionUpdateActionsFailedErrorQueryBuilderDsl> extensionExtraInfo() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("extensionExtraInfo")),
        p -> new CombinationQueryPredicate<>(p, ExtensionUpdateActionsFailedErrorQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ExtensionUpdateActionsFailedErrorQueryBuilderDsl> extensionErrors(
        Function<com.commercetools.api.predicates.query.error.ExtensionErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.ExtensionErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("extensionErrors"))
            .inner(fn.apply(com.commercetools.api.predicates.query.error.ExtensionErrorQueryBuilderDsl.of())),
            ExtensionUpdateActionsFailedErrorQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<ExtensionUpdateActionsFailedErrorQueryBuilderDsl> extensionErrors() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("extensionErrors")),
                p -> new CombinationQueryPredicate<>(p, ExtensionUpdateActionsFailedErrorQueryBuilderDsl::of));
    }
    
}
