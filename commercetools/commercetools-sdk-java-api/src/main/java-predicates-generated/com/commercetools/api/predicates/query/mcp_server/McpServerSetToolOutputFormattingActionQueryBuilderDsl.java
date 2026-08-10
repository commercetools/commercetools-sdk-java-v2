
package com.commercetools.api.predicates.query.mcp_server;

import com.commercetools.api.predicates.query.*;

public class McpServerSetToolOutputFormattingActionQueryBuilderDsl {
    public McpServerSetToolOutputFormattingActionQueryBuilderDsl() {
    }

    public static McpServerSetToolOutputFormattingActionQueryBuilderDsl of() {
        return new McpServerSetToolOutputFormattingActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<McpServerSetToolOutputFormattingActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, McpServerSetToolOutputFormattingActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<McpServerSetToolOutputFormattingActionQueryBuilderDsl> toolOutputFormatting() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("toolOutputFormatting")),
            p -> new CombinationQueryPredicate<>(p, McpServerSetToolOutputFormattingActionQueryBuilderDsl::of));
    }

}
