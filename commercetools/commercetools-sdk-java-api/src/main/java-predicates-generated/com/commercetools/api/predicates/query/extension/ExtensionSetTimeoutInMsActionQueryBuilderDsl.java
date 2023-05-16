
package com.commercetools.api.predicates.query.extension;

import com.commercetools.api.predicates.query.*;

public class ExtensionSetTimeoutInMsActionQueryBuilderDsl {
    public ExtensionSetTimeoutInMsActionQueryBuilderDsl() {
    }

    public static ExtensionSetTimeoutInMsActionQueryBuilderDsl of() {
        return new ExtensionSetTimeoutInMsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ExtensionSetTimeoutInMsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ExtensionSetTimeoutInMsActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ExtensionSetTimeoutInMsActionQueryBuilderDsl> timeoutInMs() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("timeoutInMs")),
            p -> new CombinationQueryPredicate<>(p, ExtensionSetTimeoutInMsActionQueryBuilderDsl::of));
    }

}
