
package com.commercetools.api.predicates.query.extension;

import com.commercetools.api.predicates.query.*;

public class GoogleCloudFunctionDestinationQueryBuilderDsl {
    public GoogleCloudFunctionDestinationQueryBuilderDsl() {
    }

    public static GoogleCloudFunctionDestinationQueryBuilderDsl of() {
        return new GoogleCloudFunctionDestinationQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GoogleCloudFunctionDestinationQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, GoogleCloudFunctionDestinationQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GoogleCloudFunctionDestinationQueryBuilderDsl> url() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("url")),
            p -> new CombinationQueryPredicate<>(p, GoogleCloudFunctionDestinationQueryBuilderDsl::of));
    }
}
