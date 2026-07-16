
package com.commercetools.api.predicates.query.mcp_server;

import com.commercetools.api.predicates.query.*;

public class McpServerRemoveToolActionQueryBuilderDsl {
    public McpServerRemoveToolActionQueryBuilderDsl() {
    }

    public static McpServerRemoveToolActionQueryBuilderDsl of() {
        return new McpServerRemoveToolActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<McpServerRemoveToolActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, McpServerRemoveToolActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<McpServerRemoveToolActionQueryBuilderDsl> tool() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("tool")),
            p -> new CombinationQueryPredicate<>(p, McpServerRemoveToolActionQueryBuilderDsl::of));
    }

}
