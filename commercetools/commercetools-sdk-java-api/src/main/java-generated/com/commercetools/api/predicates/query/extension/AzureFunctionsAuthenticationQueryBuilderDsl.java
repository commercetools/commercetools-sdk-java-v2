
package com.commercetools.api.predicates.query.extension;

import com.commercetools.api.predicates.query.*;

public class AzureFunctionsAuthenticationQueryBuilderDsl {
    public AzureFunctionsAuthenticationQueryBuilderDsl() {
    }

    public static AzureFunctionsAuthenticationQueryBuilderDsl of() {
        return new AzureFunctionsAuthenticationQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AzureFunctionsAuthenticationQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, AzureFunctionsAuthenticationQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AzureFunctionsAuthenticationQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, AzureFunctionsAuthenticationQueryBuilderDsl::of));
    }
}
