
package com.commercetools.api.predicates.query.mcp_server;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class McpServerUpdateActionQueryBuilderDsl {
    public McpServerUpdateActionQueryBuilderDsl() {
    }

    public static McpServerUpdateActionQueryBuilderDsl of() {
        return new McpServerUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<McpServerUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, McpServerUpdateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<McpServerUpdateActionQueryBuilderDsl> asAddTool(
            Function<com.commercetools.api.predicates.query.mcp_server.McpServerAddToolActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.mcp_server.McpServerAddToolActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.mcp_server.McpServerAddToolActionQueryBuilderDsl.of()),
            McpServerUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<McpServerUpdateActionQueryBuilderDsl> asAddToolCustomization(
            Function<com.commercetools.api.predicates.query.mcp_server.McpServerAddToolCustomizationActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.mcp_server.McpServerAddToolCustomizationActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.mcp_server.McpServerAddToolCustomizationActionQueryBuilderDsl.of()),
            McpServerUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<McpServerUpdateActionQueryBuilderDsl> asRemoveTool(
            Function<com.commercetools.api.predicates.query.mcp_server.McpServerRemoveToolActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.mcp_server.McpServerRemoveToolActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.mcp_server.McpServerRemoveToolActionQueryBuilderDsl.of()),
            McpServerUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<McpServerUpdateActionQueryBuilderDsl> asRemoveToolCustomization(
            Function<com.commercetools.api.predicates.query.mcp_server.McpServerRemoveToolCustomizationActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.mcp_server.McpServerRemoveToolCustomizationActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.mcp_server.McpServerRemoveToolCustomizationActionQueryBuilderDsl
                    .of()),
            McpServerUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<McpServerUpdateActionQueryBuilderDsl> asSetAuthenticationMode(
            Function<com.commercetools.api.predicates.query.mcp_server.McpServerSetAuthenticationModeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.mcp_server.McpServerSetAuthenticationModeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.mcp_server.McpServerSetAuthenticationModeActionQueryBuilderDsl.of()),
            McpServerUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<McpServerUpdateActionQueryBuilderDsl> asSetDescription(
            Function<com.commercetools.api.predicates.query.mcp_server.McpServerSetDescriptionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.mcp_server.McpServerSetDescriptionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.mcp_server.McpServerSetDescriptionActionQueryBuilderDsl.of()),
            McpServerUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<McpServerUpdateActionQueryBuilderDsl> asSetJsonOutputFiltering(
            Function<com.commercetools.api.predicates.query.mcp_server.McpServerSetJsonOutputFilteringActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.mcp_server.McpServerSetJsonOutputFilteringActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.mcp_server.McpServerSetJsonOutputFilteringActionQueryBuilderDsl
                    .of()),
            McpServerUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<McpServerUpdateActionQueryBuilderDsl> asSetName(
            Function<com.commercetools.api.predicates.query.mcp_server.McpServerSetNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.mcp_server.McpServerSetNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.mcp_server.McpServerSetNameActionQueryBuilderDsl.of()),
            McpServerUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<McpServerUpdateActionQueryBuilderDsl> asSetState(
            Function<com.commercetools.api.predicates.query.mcp_server.McpServerSetStateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.mcp_server.McpServerSetStateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.mcp_server.McpServerSetStateActionQueryBuilderDsl.of()),
            McpServerUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<McpServerUpdateActionQueryBuilderDsl> asSetToolCustomizations(
            Function<com.commercetools.api.predicates.query.mcp_server.McpServerSetToolCustomizationsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.mcp_server.McpServerSetToolCustomizationsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.mcp_server.McpServerSetToolCustomizationsActionQueryBuilderDsl.of()),
            McpServerUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<McpServerUpdateActionQueryBuilderDsl> asSetToolOutputFormatting(
            Function<com.commercetools.api.predicates.query.mcp_server.McpServerSetToolOutputFormattingActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.mcp_server.McpServerSetToolOutputFormattingActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.mcp_server.McpServerSetToolOutputFormattingActionQueryBuilderDsl
                    .of()),
            McpServerUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<McpServerUpdateActionQueryBuilderDsl> asSetTools(
            Function<com.commercetools.api.predicates.query.mcp_server.McpServerSetToolsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.mcp_server.McpServerSetToolsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.mcp_server.McpServerSetToolsActionQueryBuilderDsl.of()),
            McpServerUpdateActionQueryBuilderDsl::of);
    }
}
