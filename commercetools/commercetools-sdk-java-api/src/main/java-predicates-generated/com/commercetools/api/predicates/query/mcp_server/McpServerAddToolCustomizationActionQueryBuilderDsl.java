
package com.commercetools.api.predicates.query.mcp_server;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class McpServerAddToolCustomizationActionQueryBuilderDsl {
    public McpServerAddToolCustomizationActionQueryBuilderDsl() {
    }

    public static McpServerAddToolCustomizationActionQueryBuilderDsl of() {
        return new McpServerAddToolCustomizationActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<McpServerAddToolCustomizationActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, McpServerAddToolCustomizationActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<McpServerAddToolCustomizationActionQueryBuilderDsl> toolCustomization(
            Function<com.commercetools.api.predicates.query.mcp_server.ToolCustomizationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.mcp_server.ToolCustomizationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("toolCustomization"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.mcp_server.ToolCustomizationQueryBuilderDsl.of())),
            McpServerAddToolCustomizationActionQueryBuilderDsl::of);
    }

}
