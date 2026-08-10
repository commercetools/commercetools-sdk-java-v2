
package com.commercetools.api.predicates.query.mcp_server;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class McpServerPagedQueryResponseQueryBuilderDsl {
    public McpServerPagedQueryResponseQueryBuilderDsl() {
    }

    public static McpServerPagedQueryResponseQueryBuilderDsl of() {
        return new McpServerPagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<McpServerPagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, McpServerPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<McpServerPagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
            p -> new CombinationQueryPredicate<>(p, McpServerPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<McpServerPagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
            p -> new CombinationQueryPredicate<>(p, McpServerPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<McpServerPagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
            p -> new CombinationQueryPredicate<>(p, McpServerPagedQueryResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<McpServerPagedQueryResponseQueryBuilderDsl> results(
            Function<com.commercetools.api.predicates.query.mcp_server.McpServerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.mcp_server.McpServerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("results"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.mcp_server.McpServerQueryBuilderDsl.of())),
            McpServerPagedQueryResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<McpServerPagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
            p -> new CombinationQueryPredicate<>(p, McpServerPagedQueryResponseQueryBuilderDsl::of));
    }

}
