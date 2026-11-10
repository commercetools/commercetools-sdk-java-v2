
package com.commercetools.api.predicates.query.mcp_server;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class McpServerConfigQueryBuilderDsl {
    public McpServerConfigQueryBuilderDsl() {
    }

    public static McpServerConfigQueryBuilderDsl of() {
        return new McpServerConfigQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<McpServerConfigQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, McpServerConfigQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<McpServerConfigQueryBuilderDsl> asCommerceMcp(
            Function<com.commercetools.api.predicates.query.mcp_server.CommerceMcpServerConfigQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.mcp_server.CommerceMcpServerConfigQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.mcp_server.CommerceMcpServerConfigQueryBuilderDsl.of()),
            McpServerConfigQueryBuilderDsl::of);
    }
}
