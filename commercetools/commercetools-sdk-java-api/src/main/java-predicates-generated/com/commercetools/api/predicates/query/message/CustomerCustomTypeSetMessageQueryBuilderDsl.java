
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerCustomTypeSetMessageQueryBuilderDsl {
    public CustomerCustomTypeSetMessageQueryBuilderDsl() {
    }

    public static CustomerCustomTypeSetMessageQueryBuilderDsl of() {
        return new CustomerCustomTypeSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerCustomTypeSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, CustomerCustomTypeSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CustomerCustomTypeSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, CustomerCustomTypeSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CustomerCustomTypeSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, CustomerCustomTypeSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CustomerCustomTypeSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, CustomerCustomTypeSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerCustomTypeSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            CustomerCustomTypeSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CustomerCustomTypeSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            CustomerCustomTypeSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<CustomerCustomTypeSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, CustomerCustomTypeSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerCustomTypeSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            CustomerCustomTypeSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<CustomerCustomTypeSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, CustomerCustomTypeSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerCustomTypeSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CustomerCustomTypeSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerCustomTypeSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            CustomerCustomTypeSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CustomerCustomTypeSetMessageQueryBuilderDsl> customFields(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("customFields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            CustomerCustomTypeSetMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<CustomerCustomTypeSetMessageQueryBuilderDsl> previousTypeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("previousTypeId")),
            p -> new CombinationQueryPredicate<>(p, CustomerCustomTypeSetMessageQueryBuilderDsl::of));
    }

}
