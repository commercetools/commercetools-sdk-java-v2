
package com.commercetools.api.predicates.query.mcp_server;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CommerceMcpServerConfigQueryBuilderDsl {
    public CommerceMcpServerConfigQueryBuilderDsl() {
    }

    public static CommerceMcpServerConfigQueryBuilderDsl of() {
        return new CommerceMcpServerConfigQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CommerceMcpServerConfigQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CommerceMcpServerConfigQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CommerceMcpServerConfigQueryBuilderDsl> majorVersion() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("majorVersion")),
            p -> new CombinationQueryPredicate<>(p, CommerceMcpServerConfigQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CommerceMcpServerConfigQueryBuilderDsl> url() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("url")),
            p -> new CombinationQueryPredicate<>(p, CommerceMcpServerConfigQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<CommerceMcpServerConfigQueryBuilderDsl> tools() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("tools")),
            p -> new CombinationQueryPredicate<>(p, CommerceMcpServerConfigQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CommerceMcpServerConfigQueryBuilderDsl> toolCustomizations(
            Function<com.commercetools.api.predicates.query.mcp_server.ToolCustomizationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.mcp_server.ToolCustomizationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("toolCustomizations"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.mcp_server.ToolCustomizationQueryBuilderDsl.of())),
            CommerceMcpServerConfigQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CommerceMcpServerConfigQueryBuilderDsl> toolCustomizations() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("toolCustomizations")),
            p -> new CombinationQueryPredicate<>(p, CommerceMcpServerConfigQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CommerceMcpServerConfigQueryBuilderDsl> jsonOutputFiltering(
            Function<com.commercetools.api.predicates.query.mcp_server.McpServerJsonOutputFilteringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.mcp_server.McpServerJsonOutputFilteringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("jsonOutputFiltering"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.mcp_server.McpServerJsonOutputFilteringQueryBuilderDsl
                            .of())),
            CommerceMcpServerConfigQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<CommerceMcpServerConfigQueryBuilderDsl> toolOutputFormatting() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("toolOutputFormatting")),
            p -> new CombinationQueryPredicate<>(p, CommerceMcpServerConfigQueryBuilderDsl::of));
    }

}
