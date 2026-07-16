
package com.commercetools.api.predicates.query.mcp_server;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class McpServerJsonOutputFilteringQueryBuilderDsl {
    public McpServerJsonOutputFilteringQueryBuilderDsl() {
    }

    public static McpServerJsonOutputFilteringQueryBuilderDsl of() {
        return new McpServerJsonOutputFilteringQueryBuilderDsl();
    }

    public CombinationQueryPredicate<McpServerJsonOutputFilteringQueryBuilderDsl> redact(
            Function<com.commercetools.api.predicates.query.mcp_server.McpServerJsonOutputFilteringMatcherQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.mcp_server.McpServerJsonOutputFilteringMatcherQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("redact"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.mcp_server.McpServerJsonOutputFilteringMatcherQueryBuilderDsl
                            .of())),
            McpServerJsonOutputFilteringQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<McpServerJsonOutputFilteringQueryBuilderDsl> drop(
            Function<com.commercetools.api.predicates.query.mcp_server.McpServerJsonOutputFilteringMatcherQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.mcp_server.McpServerJsonOutputFilteringMatcherQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("drop"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.mcp_server.McpServerJsonOutputFilteringMatcherQueryBuilderDsl
                            .of())),
            McpServerJsonOutputFilteringQueryBuilderDsl::of);
    }

    public StringCollectionPredicateBuilder<McpServerJsonOutputFilteringQueryBuilderDsl> fieldPathsToKeep() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fieldPathsToKeep")),
            p -> new CombinationQueryPredicate<>(p, McpServerJsonOutputFilteringQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<McpServerJsonOutputFilteringQueryBuilderDsl> redactedWith() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("redactedWith")),
            p -> new CombinationQueryPredicate<>(p, McpServerJsonOutputFilteringQueryBuilderDsl::of));
    }

}
