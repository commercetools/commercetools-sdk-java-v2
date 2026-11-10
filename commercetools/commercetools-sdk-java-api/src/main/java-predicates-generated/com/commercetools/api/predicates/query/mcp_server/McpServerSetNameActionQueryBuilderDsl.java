
package com.commercetools.api.predicates.query.mcp_server;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class McpServerSetNameActionQueryBuilderDsl {
    public McpServerSetNameActionQueryBuilderDsl() {
    }

    public static McpServerSetNameActionQueryBuilderDsl of() {
        return new McpServerSetNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<McpServerSetNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, McpServerSetNameActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<McpServerSetNameActionQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            McpServerSetNameActionQueryBuilderDsl::of);
    }

}
