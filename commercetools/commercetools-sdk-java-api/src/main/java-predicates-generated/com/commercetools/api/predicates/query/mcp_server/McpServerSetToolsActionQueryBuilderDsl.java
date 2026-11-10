
package com.commercetools.api.predicates.query.mcp_server;

import com.commercetools.api.predicates.query.*;

public class McpServerSetToolsActionQueryBuilderDsl {
    public McpServerSetToolsActionQueryBuilderDsl() {
    }

    public static McpServerSetToolsActionQueryBuilderDsl of() {
        return new McpServerSetToolsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<McpServerSetToolsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, McpServerSetToolsActionQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<McpServerSetToolsActionQueryBuilderDsl> tools() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("tools")),
            p -> new CombinationQueryPredicate<>(p, McpServerSetToolsActionQueryBuilderDsl::of));
    }

}
