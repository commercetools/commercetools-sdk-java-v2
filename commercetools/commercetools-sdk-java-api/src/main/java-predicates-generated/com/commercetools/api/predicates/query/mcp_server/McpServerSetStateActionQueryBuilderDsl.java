
package com.commercetools.api.predicates.query.mcp_server;

import com.commercetools.api.predicates.query.*;

public class McpServerSetStateActionQueryBuilderDsl {
    public McpServerSetStateActionQueryBuilderDsl() {
    }

    public static McpServerSetStateActionQueryBuilderDsl of() {
        return new McpServerSetStateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<McpServerSetStateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, McpServerSetStateActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<McpServerSetStateActionQueryBuilderDsl> state() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("state")),
            p -> new CombinationQueryPredicate<>(p, McpServerSetStateActionQueryBuilderDsl::of));
    }

}
