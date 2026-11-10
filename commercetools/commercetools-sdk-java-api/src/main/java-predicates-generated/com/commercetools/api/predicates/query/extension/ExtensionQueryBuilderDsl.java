
package com.commercetools.api.predicates.query.extension;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ExtensionQueryBuilderDsl {
    public ExtensionQueryBuilderDsl() {
    }

    public static ExtensionQueryBuilderDsl of() {
        return new ExtensionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ExtensionQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ExtensionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ExtensionQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ExtensionQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ExtensionQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ExtensionQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ExtensionQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ExtensionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ExtensionQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ExtensionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ExtensionQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ExtensionQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ExtensionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ExtensionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ExtensionQueryBuilderDsl> destination(
            Function<com.commercetools.api.predicates.query.extension.ExtensionDestinationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.extension.ExtensionDestinationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("destination"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.extension.ExtensionDestinationQueryBuilderDsl.of())),
            ExtensionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ExtensionQueryBuilderDsl> triggers(
            Function<com.commercetools.api.predicates.query.extension.ExtensionTriggerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.extension.ExtensionTriggerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("triggers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.extension.ExtensionTriggerQueryBuilderDsl.of())),
            ExtensionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ExtensionQueryBuilderDsl> triggers() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("triggers")),
            p -> new CombinationQueryPredicate<>(p, ExtensionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ExtensionQueryBuilderDsl> timeoutInMs() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("timeoutInMs")),
            p -> new CombinationQueryPredicate<>(p, ExtensionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ExtensionQueryBuilderDsl> dependencies(
            Function<com.commercetools.api.predicates.query.extension.ExtensionReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.extension.ExtensionReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("dependencies"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.extension.ExtensionReferenceQueryBuilderDsl.of())),
            ExtensionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ExtensionQueryBuilderDsl> dependencies() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("dependencies")),
            p -> new CombinationQueryPredicate<>(p, ExtensionQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<ExtensionQueryBuilderDsl> expansionPaths() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("expansionPaths")),
            p -> new CombinationQueryPredicate<>(p, ExtensionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ExtensionQueryBuilderDsl> additionalContext(
            Function<com.commercetools.api.predicates.query.extension.ExtensionAdditionalContextQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.extension.ExtensionAdditionalContextQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("additionalContext"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.extension.ExtensionAdditionalContextQueryBuilderDsl.of())),
            ExtensionQueryBuilderDsl::of);
    }

}
