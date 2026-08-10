
package com.commercetools.api.predicates.query.mcp_server;

import com.commercetools.api.predicates.query.*;

public class McpServerSetAuthenticationModeActionQueryBuilderDsl {
    public McpServerSetAuthenticationModeActionQueryBuilderDsl() {
    }

    public static McpServerSetAuthenticationModeActionQueryBuilderDsl of() {
        return new McpServerSetAuthenticationModeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<McpServerSetAuthenticationModeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, McpServerSetAuthenticationModeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<McpServerSetAuthenticationModeActionQueryBuilderDsl> authenticationMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("authenticationMode")),
            p -> new CombinationQueryPredicate<>(p, McpServerSetAuthenticationModeActionQueryBuilderDsl::of));
    }

}
