
package com.commercetools.api.predicates.query.mcp_server;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class McpServerSetDescriptionActionQueryBuilderDsl {
    public McpServerSetDescriptionActionQueryBuilderDsl() {
    }

    public static McpServerSetDescriptionActionQueryBuilderDsl of() {
        return new McpServerSetDescriptionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<McpServerSetDescriptionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, McpServerSetDescriptionActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<McpServerSetDescriptionActionQueryBuilderDsl> description(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("description"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            McpServerSetDescriptionActionQueryBuilderDsl::of);
    }

}
