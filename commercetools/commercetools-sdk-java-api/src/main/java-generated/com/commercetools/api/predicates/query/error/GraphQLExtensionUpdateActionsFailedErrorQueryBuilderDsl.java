
package com.commercetools.api.predicates.query.error;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class GraphQLExtensionUpdateActionsFailedErrorQueryBuilderDsl {
    public GraphQLExtensionUpdateActionsFailedErrorQueryBuilderDsl() {
    }

    public static GraphQLExtensionUpdateActionsFailedErrorQueryBuilderDsl of() {
        return new GraphQLExtensionUpdateActionsFailedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLExtensionUpdateActionsFailedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLExtensionUpdateActionsFailedErrorQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<GraphQLExtensionUpdateActionsFailedErrorQueryBuilderDsl> localizedMessage(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("localizedMessage"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            GraphQLExtensionUpdateActionsFailedErrorQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<GraphQLExtensionUpdateActionsFailedErrorQueryBuilderDsl> extensionExtraInfo() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("extensionExtraInfo")),
            p -> new CombinationQueryPredicate<>(p, GraphQLExtensionUpdateActionsFailedErrorQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<GraphQLExtensionUpdateActionsFailedErrorQueryBuilderDsl> extensionErrors(
            Function<com.commercetools.api.predicates.query.error.ExtensionErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.ExtensionErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("extensionErrors"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.error.ExtensionErrorQueryBuilderDsl.of())),
            GraphQLExtensionUpdateActionsFailedErrorQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<GraphQLExtensionUpdateActionsFailedErrorQueryBuilderDsl> extensionErrors() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("extensionErrors")),
            p -> new CombinationQueryPredicate<>(p, GraphQLExtensionUpdateActionsFailedErrorQueryBuilderDsl::of));
    }
}
