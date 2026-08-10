
package com.commercetools.api.predicates.query.mcp_server;

import com.commercetools.api.predicates.query.*;

public class McpServerTypeToolQueryBuilderDsl {
    public McpServerTypeToolQueryBuilderDsl() {
    }

    public static McpServerTypeToolQueryBuilderDsl of() {
        return new McpServerTypeToolQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<McpServerTypeToolQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, McpServerTypeToolQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<McpServerTypeToolQueryBuilderDsl> description() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("description")),
            p -> new CombinationQueryPredicate<>(p, McpServerTypeToolQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<McpServerTypeToolQueryBuilderDsl> operationType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("operationType")),
            p -> new CombinationQueryPredicate<>(p, McpServerTypeToolQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<McpServerTypeToolQueryBuilderDsl> groups() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("groups")),
            p -> new CombinationQueryPredicate<>(p, McpServerTypeToolQueryBuilderDsl::of));
    }

}
