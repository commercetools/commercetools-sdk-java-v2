
package com.commercetools.api.predicates.query.mcp_server;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CommerceMcpServerConfigDraftQueryBuilderDsl {
    public CommerceMcpServerConfigDraftQueryBuilderDsl() {
    }

    public static CommerceMcpServerConfigDraftQueryBuilderDsl of() {
        return new CommerceMcpServerConfigDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CommerceMcpServerConfigDraftQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CommerceMcpServerConfigDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CommerceMcpServerConfigDraftQueryBuilderDsl> majorVersion() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("majorVersion")),
            p -> new CombinationQueryPredicate<>(p, CommerceMcpServerConfigDraftQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<CommerceMcpServerConfigDraftQueryBuilderDsl> tools() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("tools")),
            p -> new CombinationQueryPredicate<>(p, CommerceMcpServerConfigDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CommerceMcpServerConfigDraftQueryBuilderDsl> toolCustomizations(
            Function<com.commercetools.api.predicates.query.mcp_server.ToolCustomizationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.mcp_server.ToolCustomizationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("toolCustomizations"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.mcp_server.ToolCustomizationQueryBuilderDsl.of())),
            CommerceMcpServerConfigDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CommerceMcpServerConfigDraftQueryBuilderDsl> toolCustomizations() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("toolCustomizations")),
            p -> new CombinationQueryPredicate<>(p, CommerceMcpServerConfigDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CommerceMcpServerConfigDraftQueryBuilderDsl> jsonOutputFiltering(
            Function<com.commercetools.api.predicates.query.mcp_server.McpServerJsonOutputFilteringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.mcp_server.McpServerJsonOutputFilteringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("jsonOutputFiltering"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.mcp_server.McpServerJsonOutputFilteringQueryBuilderDsl
                            .of())),
            CommerceMcpServerConfigDraftQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<CommerceMcpServerConfigDraftQueryBuilderDsl> toolOutputFormatting() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("toolOutputFormatting")),
            p -> new CombinationQueryPredicate<>(p, CommerceMcpServerConfigDraftQueryBuilderDsl::of));
    }

}
