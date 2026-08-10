
package com.commercetools.api.predicates.query.mcp_server;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class McpServerSetJsonOutputFilteringActionQueryBuilderDsl {
    public McpServerSetJsonOutputFilteringActionQueryBuilderDsl() {
    }

    public static McpServerSetJsonOutputFilteringActionQueryBuilderDsl of() {
        return new McpServerSetJsonOutputFilteringActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<McpServerSetJsonOutputFilteringActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, McpServerSetJsonOutputFilteringActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<McpServerSetJsonOutputFilteringActionQueryBuilderDsl> jsonOutputFiltering(
            Function<com.commercetools.api.predicates.query.mcp_server.McpServerJsonOutputFilteringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.mcp_server.McpServerJsonOutputFilteringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("jsonOutputFiltering"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.mcp_server.McpServerJsonOutputFilteringQueryBuilderDsl
                            .of())),
            McpServerSetJsonOutputFilteringActionQueryBuilderDsl::of);
    }

}
