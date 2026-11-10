
package com.commercetools.api.predicates.query.mcp_server;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class McpServerConfigDraftQueryBuilderDsl {
    public McpServerConfigDraftQueryBuilderDsl() {
    }

    public static McpServerConfigDraftQueryBuilderDsl of() {
        return new McpServerConfigDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<McpServerConfigDraftQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, McpServerConfigDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<McpServerConfigDraftQueryBuilderDsl> asCommerceMcp(
            Function<com.commercetools.api.predicates.query.mcp_server.CommerceMcpServerConfigDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.mcp_server.CommerceMcpServerConfigDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.mcp_server.CommerceMcpServerConfigDraftQueryBuilderDsl.of()),
            McpServerConfigDraftQueryBuilderDsl::of);
    }
}
