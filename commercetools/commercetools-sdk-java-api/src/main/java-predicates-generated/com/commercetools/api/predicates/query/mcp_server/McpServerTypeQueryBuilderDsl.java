
package com.commercetools.api.predicates.query.mcp_server;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class McpServerTypeQueryBuilderDsl {
    public McpServerTypeQueryBuilderDsl() {
    }

    public static McpServerTypeQueryBuilderDsl of() {
        return new McpServerTypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<McpServerTypeQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, McpServerTypeQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<McpServerTypeQueryBuilderDsl> majorVersion() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("majorVersion")),
            p -> new CombinationQueryPredicate<>(p, McpServerTypeQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<McpServerTypeQueryBuilderDsl> tools(
            Function<com.commercetools.api.predicates.query.mcp_server.McpServerTypeToolQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.mcp_server.McpServerTypeToolQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("tools"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.mcp_server.McpServerTypeToolQueryBuilderDsl.of())),
            McpServerTypeQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<McpServerTypeQueryBuilderDsl> tools() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("tools")),
            p -> new CombinationQueryPredicate<>(p, McpServerTypeQueryBuilderDsl::of));
    }

}
