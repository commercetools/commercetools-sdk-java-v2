
package com.commercetools.api.predicates.query.error;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ExtensionBadResponseErrorQueryBuilderDsl {
    public ExtensionBadResponseErrorQueryBuilderDsl() {
    }

    public static ExtensionBadResponseErrorQueryBuilderDsl of() {
        return new ExtensionBadResponseErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ExtensionBadResponseErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, ExtensionBadResponseErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ExtensionBadResponseErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, ExtensionBadResponseErrorQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ExtensionBadResponseErrorQueryBuilderDsl> localizedMessage(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("localizedMessage"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ExtensionBadResponseErrorQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ExtensionBadResponseErrorQueryBuilderDsl> extensionExtraInfo() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("extensionExtraInfo")),
            p -> new CombinationQueryPredicate<>(p, ExtensionBadResponseErrorQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ExtensionBadResponseErrorQueryBuilderDsl> extensionErrors(
            Function<com.commercetools.api.predicates.query.error.ExtensionErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.ExtensionErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("extensionErrors"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.error.ExtensionErrorQueryBuilderDsl.of())),
            ExtensionBadResponseErrorQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ExtensionBadResponseErrorQueryBuilderDsl> extensionErrors() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("extensionErrors")),
            p -> new CombinationQueryPredicate<>(p, ExtensionBadResponseErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ExtensionBadResponseErrorQueryBuilderDsl> extensionBody() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("extensionBody")),
            p -> new CombinationQueryPredicate<>(p, ExtensionBadResponseErrorQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ExtensionBadResponseErrorQueryBuilderDsl> extensionStatusCode() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("extensionStatusCode")),
            p -> new CombinationQueryPredicate<>(p, ExtensionBadResponseErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ExtensionBadResponseErrorQueryBuilderDsl> extensionId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("extensionId")),
            p -> new CombinationQueryPredicate<>(p, ExtensionBadResponseErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ExtensionBadResponseErrorQueryBuilderDsl> extensionKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("extensionKey")),
            p -> new CombinationQueryPredicate<>(p, ExtensionBadResponseErrorQueryBuilderDsl::of));
    }

}
