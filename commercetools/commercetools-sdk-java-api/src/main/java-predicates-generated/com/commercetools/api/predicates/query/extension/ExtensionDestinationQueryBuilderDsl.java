package com.commercetools.api.predicates.query.extension;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ExtensionDestinationQueryBuilderDsl  {
    public ExtensionDestinationQueryBuilderDsl() {
    }

    public static ExtensionDestinationQueryBuilderDsl of() {
        return new ExtensionDestinationQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ExtensionDestinationQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, ExtensionDestinationQueryBuilderDsl::of));
    }
    
    public CombinationQueryPredicate<ExtensionDestinationQueryBuilderDsl> asAwsLambda(
        Function<com.commercetools.api.predicates.query.extension.AWSLambdaDestinationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.extension.AWSLambdaDestinationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.extension.AWSLambdaDestinationQueryBuilderDsl.of()),
            ExtensionDestinationQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ExtensionDestinationQueryBuilderDsl> asGoogleCloudFunction(
        Function<com.commercetools.api.predicates.query.extension.GoogleCloudFunctionDestinationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.extension.GoogleCloudFunctionDestinationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.extension.GoogleCloudFunctionDestinationQueryBuilderDsl.of()),
            ExtensionDestinationQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ExtensionDestinationQueryBuilderDsl> asHttp(
        Function<com.commercetools.api.predicates.query.extension.HttpDestinationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.extension.HttpDestinationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.extension.HttpDestinationQueryBuilderDsl.of()),
            ExtensionDestinationQueryBuilderDsl::of);
    }
}
