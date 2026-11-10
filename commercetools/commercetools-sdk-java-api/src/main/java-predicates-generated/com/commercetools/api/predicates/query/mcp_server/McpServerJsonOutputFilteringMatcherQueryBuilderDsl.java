
package com.commercetools.api.predicates.query.mcp_server;

import com.commercetools.api.predicates.query.*;

public class McpServerJsonOutputFilteringMatcherQueryBuilderDsl {
    public McpServerJsonOutputFilteringMatcherQueryBuilderDsl() {
    }

    public static McpServerJsonOutputFilteringMatcherQueryBuilderDsl of() {
        return new McpServerJsonOutputFilteringMatcherQueryBuilderDsl();
    }

    public StringCollectionPredicateBuilder<McpServerJsonOutputFilteringMatcherQueryBuilderDsl> fieldPaths() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fieldPaths")),
            p -> new CombinationQueryPredicate<>(p, McpServerJsonOutputFilteringMatcherQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<McpServerJsonOutputFilteringMatcherQueryBuilderDsl> fieldNames() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fieldNames")),
            p -> new CombinationQueryPredicate<>(p, McpServerJsonOutputFilteringMatcherQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<McpServerJsonOutputFilteringMatcherQueryBuilderDsl> fieldNameContains() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fieldNameContains")),
            p -> new CombinationQueryPredicate<>(p, McpServerJsonOutputFilteringMatcherQueryBuilderDsl::of));
    }

}
