
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StoreCheckoutUrlTemplateSetMessageQueryBuilderDsl {
    public StoreCheckoutUrlTemplateSetMessageQueryBuilderDsl() {
    }

    public static StoreCheckoutUrlTemplateSetMessageQueryBuilderDsl of() {
        return new StoreCheckoutUrlTemplateSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreCheckoutUrlTemplateSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, StoreCheckoutUrlTemplateSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<StoreCheckoutUrlTemplateSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, StoreCheckoutUrlTemplateSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StoreCheckoutUrlTemplateSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, StoreCheckoutUrlTemplateSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StoreCheckoutUrlTemplateSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, StoreCheckoutUrlTemplateSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreCheckoutUrlTemplateSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            StoreCheckoutUrlTemplateSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StoreCheckoutUrlTemplateSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            StoreCheckoutUrlTemplateSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StoreCheckoutUrlTemplateSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, StoreCheckoutUrlTemplateSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreCheckoutUrlTemplateSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            StoreCheckoutUrlTemplateSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<StoreCheckoutUrlTemplateSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, StoreCheckoutUrlTemplateSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StoreCheckoutUrlTemplateSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StoreCheckoutUrlTemplateSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreCheckoutUrlTemplateSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            StoreCheckoutUrlTemplateSetMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<StoreCheckoutUrlTemplateSetMessageQueryBuilderDsl> checkoutUrlTemplate() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("checkoutUrlTemplate")),
            p -> new CombinationQueryPredicate<>(p, StoreCheckoutUrlTemplateSetMessageQueryBuilderDsl::of));
    }

}
