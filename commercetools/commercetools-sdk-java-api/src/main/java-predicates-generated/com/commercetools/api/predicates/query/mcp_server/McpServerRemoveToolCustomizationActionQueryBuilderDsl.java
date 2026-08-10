
package com.commercetools.api.predicates.query.mcp_server;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class McpServerRemoveToolCustomizationActionQueryBuilderDsl {
    public McpServerRemoveToolCustomizationActionQueryBuilderDsl() {
    }

    public static McpServerRemoveToolCustomizationActionQueryBuilderDsl of() {
        return new McpServerRemoveToolCustomizationActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<McpServerRemoveToolCustomizationActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, McpServerRemoveToolCustomizationActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<McpServerRemoveToolCustomizationActionQueryBuilderDsl> toolCustomization(
            Function<com.commercetools.api.predicates.query.mcp_server.RemoveToolCustomizationTargetQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.mcp_server.RemoveToolCustomizationTargetQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("toolCustomization"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.mcp_server.RemoveToolCustomizationTargetQueryBuilderDsl
                            .of())),
            McpServerRemoveToolCustomizationActionQueryBuilderDsl::of);
    }

}
