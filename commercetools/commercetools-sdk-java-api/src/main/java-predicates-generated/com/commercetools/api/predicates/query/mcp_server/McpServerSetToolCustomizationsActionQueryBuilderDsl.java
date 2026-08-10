
package com.commercetools.api.predicates.query.mcp_server;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class McpServerSetToolCustomizationsActionQueryBuilderDsl {
    public McpServerSetToolCustomizationsActionQueryBuilderDsl() {
    }

    public static McpServerSetToolCustomizationsActionQueryBuilderDsl of() {
        return new McpServerSetToolCustomizationsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<McpServerSetToolCustomizationsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, McpServerSetToolCustomizationsActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<McpServerSetToolCustomizationsActionQueryBuilderDsl> toolCustomizations(
            Function<com.commercetools.api.predicates.query.mcp_server.ToolCustomizationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.mcp_server.ToolCustomizationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("toolCustomizations"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.mcp_server.ToolCustomizationQueryBuilderDsl.of())),
            McpServerSetToolCustomizationsActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<McpServerSetToolCustomizationsActionQueryBuilderDsl> toolCustomizations() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("toolCustomizations")),
            p -> new CombinationQueryPredicate<>(p, McpServerSetToolCustomizationsActionQueryBuilderDsl::of));
    }

}
