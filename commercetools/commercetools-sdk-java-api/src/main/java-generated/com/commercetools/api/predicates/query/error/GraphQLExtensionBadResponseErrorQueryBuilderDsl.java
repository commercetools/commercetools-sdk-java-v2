
package com.commercetools.api.predicates.query.error;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class GraphQLExtensionBadResponseErrorQueryBuilderDsl {
    public GraphQLExtensionBadResponseErrorQueryBuilderDsl() {
    }

    public static GraphQLExtensionBadResponseErrorQueryBuilderDsl of() {
        return new GraphQLExtensionBadResponseErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLExtensionBadResponseErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLExtensionBadResponseErrorQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<GraphQLExtensionBadResponseErrorQueryBuilderDsl> localizedMessage(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("localizedMessage"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            GraphQLExtensionBadResponseErrorQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<GraphQLExtensionBadResponseErrorQueryBuilderDsl> extensionExtraInfo() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("extensionExtraInfo")),
            p -> new CombinationQueryPredicate<>(p, GraphQLExtensionBadResponseErrorQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<GraphQLExtensionBadResponseErrorQueryBuilderDsl> extensionErrors(
            Function<com.commercetools.api.predicates.query.error.ExtensionErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.ExtensionErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("extensionErrors"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.error.ExtensionErrorQueryBuilderDsl.of())),
            GraphQLExtensionBadResponseErrorQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<GraphQLExtensionBadResponseErrorQueryBuilderDsl> extensionErrors() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("extensionErrors")),
            p -> new CombinationQueryPredicate<>(p, GraphQLExtensionBadResponseErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLExtensionBadResponseErrorQueryBuilderDsl> extensionBody() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("extensionBody")),
            p -> new CombinationQueryPredicate<>(p, GraphQLExtensionBadResponseErrorQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<GraphQLExtensionBadResponseErrorQueryBuilderDsl> extensionStatusCode() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("extensionStatusCode")),
            p -> new CombinationQueryPredicate<>(p, GraphQLExtensionBadResponseErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLExtensionBadResponseErrorQueryBuilderDsl> extensionId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("extensionId")),
            p -> new CombinationQueryPredicate<>(p, GraphQLExtensionBadResponseErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLExtensionBadResponseErrorQueryBuilderDsl> extensionKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("extensionKey")),
            p -> new CombinationQueryPredicate<>(p, GraphQLExtensionBadResponseErrorQueryBuilderDsl::of));
    }
}
