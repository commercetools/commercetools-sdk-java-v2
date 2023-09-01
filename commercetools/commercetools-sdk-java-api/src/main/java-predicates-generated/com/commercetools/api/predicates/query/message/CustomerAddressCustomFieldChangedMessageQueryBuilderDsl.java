
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerAddressCustomFieldChangedMessageQueryBuilderDsl {
    public CustomerAddressCustomFieldChangedMessageQueryBuilderDsl() {
    }

    public static CustomerAddressCustomFieldChangedMessageQueryBuilderDsl of() {
        return new CustomerAddressCustomFieldChangedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerAddressCustomFieldChangedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, CustomerAddressCustomFieldChangedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CustomerAddressCustomFieldChangedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, CustomerAddressCustomFieldChangedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CustomerAddressCustomFieldChangedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, CustomerAddressCustomFieldChangedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CustomerAddressCustomFieldChangedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, CustomerAddressCustomFieldChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerAddressCustomFieldChangedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            CustomerAddressCustomFieldChangedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CustomerAddressCustomFieldChangedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            CustomerAddressCustomFieldChangedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<CustomerAddressCustomFieldChangedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, CustomerAddressCustomFieldChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerAddressCustomFieldChangedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            CustomerAddressCustomFieldChangedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<CustomerAddressCustomFieldChangedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, CustomerAddressCustomFieldChangedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerAddressCustomFieldChangedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CustomerAddressCustomFieldChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerAddressCustomFieldChangedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            CustomerAddressCustomFieldChangedMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<CustomerAddressCustomFieldChangedMessageQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, CustomerAddressCustomFieldChangedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerAddressCustomFieldChangedMessageQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, CustomerAddressCustomFieldChangedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerAddressCustomFieldChangedMessageQueryBuilderDsl> previousValue() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("previousValue")),
            p -> new CombinationQueryPredicate<>(p, CustomerAddressCustomFieldChangedMessageQueryBuilderDsl::of));
    }

}
