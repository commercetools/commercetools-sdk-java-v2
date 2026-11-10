
package com.commercetools.api.predicates.query.mcp_server;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ToolCustomizationQueryBuilderDsl {
    public ToolCustomizationQueryBuilderDsl() {
    }

    public static ToolCustomizationQueryBuilderDsl of() {
        return new ToolCustomizationQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ToolCustomizationQueryBuilderDsl> tool() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("tool")),
            p -> new CombinationQueryPredicate<>(p, ToolCustomizationQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ToolCustomizationQueryBuilderDsl> description() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("description")),
            p -> new CombinationQueryPredicate<>(p, ToolCustomizationQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ToolCustomizationQueryBuilderDsl> parameters(
            Function<com.commercetools.api.predicates.query.mcp_server.ParameterOverrideQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.mcp_server.ParameterOverrideQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("parameters"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.mcp_server.ParameterOverrideQueryBuilderDsl.of())),
            ToolCustomizationQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ToolCustomizationQueryBuilderDsl> parameters() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("parameters")),
            p -> new CombinationQueryPredicate<>(p, ToolCustomizationQueryBuilderDsl::of));
    }

}
