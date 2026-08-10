
package com.commercetools.api.predicates.query.mcp_server;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class McpServerUpdateQueryBuilderDsl {
    public McpServerUpdateQueryBuilderDsl() {
    }

    public static McpServerUpdateQueryBuilderDsl of() {
        return new McpServerUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<McpServerUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, McpServerUpdateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<McpServerUpdateQueryBuilderDsl> actions(
            Function<com.commercetools.api.predicates.query.mcp_server.McpServerUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.mcp_server.McpServerUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("actions"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.mcp_server.McpServerUpdateActionQueryBuilderDsl.of())),
            McpServerUpdateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<McpServerUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
            p -> new CombinationQueryPredicate<>(p, McpServerUpdateQueryBuilderDsl::of));
    }

}
