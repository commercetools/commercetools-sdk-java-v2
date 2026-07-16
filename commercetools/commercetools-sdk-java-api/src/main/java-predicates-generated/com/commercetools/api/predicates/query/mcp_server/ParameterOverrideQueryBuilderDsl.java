
package com.commercetools.api.predicates.query.mcp_server;

import com.commercetools.api.predicates.query.*;

public class ParameterOverrideQueryBuilderDsl {
    public ParameterOverrideQueryBuilderDsl() {
    }

    public static ParameterOverrideQueryBuilderDsl of() {
        return new ParameterOverrideQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ParameterOverrideQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, ParameterOverrideQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ParameterOverrideQueryBuilderDsl> description() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("description")),
            p -> new CombinationQueryPredicate<>(p, ParameterOverrideQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ParameterOverrideQueryBuilderDsl> _const() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("const")),
            p -> new CombinationQueryPredicate<>(p, ParameterOverrideQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ParameterOverrideQueryBuilderDsl> _default() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("default")),
            p -> new CombinationQueryPredicate<>(p, ParameterOverrideQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ParameterOverrideQueryBuilderDsl> allowedTypes() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("allowedTypes")),
            p -> new CombinationQueryPredicate<>(p, ParameterOverrideQueryBuilderDsl::of));
    }

}
