
package com.commercetools.api.predicates.query.mcp_server;

import com.commercetools.api.predicates.query.*;

public class McpServerAddToolActionQueryBuilderDsl {
    public McpServerAddToolActionQueryBuilderDsl() {
    }

    public static McpServerAddToolActionQueryBuilderDsl of() {
        return new McpServerAddToolActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<McpServerAddToolActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, McpServerAddToolActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<McpServerAddToolActionQueryBuilderDsl> tool() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("tool")),
            p -> new CombinationQueryPredicate<>(p, McpServerAddToolActionQueryBuilderDsl::of));
    }

}
