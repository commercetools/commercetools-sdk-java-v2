
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerBillingAddressAddedMessageQueryBuilderDsl {
    public CustomerBillingAddressAddedMessageQueryBuilderDsl() {
    }

    public static CustomerBillingAddressAddedMessageQueryBuilderDsl of() {
        return new CustomerBillingAddressAddedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerBillingAddressAddedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, CustomerBillingAddressAddedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CustomerBillingAddressAddedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, CustomerBillingAddressAddedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CustomerBillingAddressAddedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, CustomerBillingAddressAddedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CustomerBillingAddressAddedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, CustomerBillingAddressAddedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerBillingAddressAddedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            CustomerBillingAddressAddedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CustomerBillingAddressAddedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            CustomerBillingAddressAddedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<CustomerBillingAddressAddedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, CustomerBillingAddressAddedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerBillingAddressAddedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            CustomerBillingAddressAddedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<CustomerBillingAddressAddedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, CustomerBillingAddressAddedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerBillingAddressAddedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CustomerBillingAddressAddedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerBillingAddressAddedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            CustomerBillingAddressAddedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CustomerBillingAddressAddedMessageQueryBuilderDsl> address(
            Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("address"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            CustomerBillingAddressAddedMessageQueryBuilderDsl::of);
    }

}
