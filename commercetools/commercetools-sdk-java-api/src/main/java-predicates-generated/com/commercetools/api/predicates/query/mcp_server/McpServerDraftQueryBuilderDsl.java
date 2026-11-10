
package com.commercetools.api.predicates.query.mcp_server;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class McpServerDraftQueryBuilderDsl {
    public McpServerDraftQueryBuilderDsl() {
    }

    public static McpServerDraftQueryBuilderDsl of() {
        return new McpServerDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<McpServerDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, McpServerDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<McpServerDraftQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            McpServerDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<McpServerDraftQueryBuilderDsl> description(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("description"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            McpServerDraftQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<McpServerDraftQueryBuilderDsl> authenticationMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("authenticationMode")),
            p -> new CombinationQueryPredicate<>(p, McpServerDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<McpServerDraftQueryBuilderDsl> state() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("state")),
            p -> new CombinationQueryPredicate<>(p, McpServerDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<McpServerDraftQueryBuilderDsl> mcpServer(
            Function<com.commercetools.api.predicates.query.mcp_server.McpServerConfigDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.mcp_server.McpServerConfigDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("mcpServer"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.mcp_server.McpServerConfigDraftQueryBuilderDsl.of())),
            McpServerDraftQueryBuilderDsl::of);
    }

}
