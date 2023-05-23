
package com.commercetools.api.predicates.query.customer;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerQueryBuilderDsl {
    public CustomerQueryBuilderDsl() {
    }

    public static CustomerQueryBuilderDsl of() {
        return new CustomerQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, CustomerQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CustomerQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, CustomerQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CustomerQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, CustomerQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CustomerQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, CustomerQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, CustomerQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerQueryBuilderDsl> customerNumber() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customerNumber")),
            p -> new CombinationQueryPredicate<>(p, CustomerQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerQueryBuilderDsl> externalId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("externalId")),
            p -> new CombinationQueryPredicate<>(p, CustomerQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            CustomerQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CustomerQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            CustomerQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<CustomerQueryBuilderDsl> email() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("email")),
            p -> new CombinationQueryPredicate<>(p, CustomerQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerQueryBuilderDsl> password() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("password")),
            p -> new CombinationQueryPredicate<>(p, CustomerQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerQueryBuilderDsl> firstName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("firstName")),
            p -> new CombinationQueryPredicate<>(p, CustomerQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerQueryBuilderDsl> lastName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastName")),
            p -> new CombinationQueryPredicate<>(p, CustomerQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerQueryBuilderDsl> middleName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("middleName")),
            p -> new CombinationQueryPredicate<>(p, CustomerQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerQueryBuilderDsl> title() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("title")),
            p -> new CombinationQueryPredicate<>(p, CustomerQueryBuilderDsl::of));
    }

    public DateComparisonPredicateBuilder<CustomerQueryBuilderDsl> dateOfBirth() {
        return new DateComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("dateOfBirth")),
            p -> new CombinationQueryPredicate<>(p, CustomerQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerQueryBuilderDsl> companyName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("companyName")),
            p -> new CombinationQueryPredicate<>(p, CustomerQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerQueryBuilderDsl> vatId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("vatId")),
            p -> new CombinationQueryPredicate<>(p, CustomerQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerQueryBuilderDsl> addresses(
            Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("addresses"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            CustomerQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CustomerQueryBuilderDsl> addresses() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addresses")),
            p -> new CombinationQueryPredicate<>(p, CustomerQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerQueryBuilderDsl> defaultShippingAddressId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("defaultShippingAddressId")),
            p -> new CombinationQueryPredicate<>(p, CustomerQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<CustomerQueryBuilderDsl> shippingAddressIds() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingAddressIds")),
            p -> new CombinationQueryPredicate<>(p, CustomerQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerQueryBuilderDsl> defaultBillingAddressId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("defaultBillingAddressId")),
            p -> new CombinationQueryPredicate<>(p, CustomerQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<CustomerQueryBuilderDsl> billingAddressIds() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("billingAddressIds")),
            p -> new CombinationQueryPredicate<>(p, CustomerQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<CustomerQueryBuilderDsl> isEmailVerified() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("isEmailVerified")),
            p -> new CombinationQueryPredicate<>(p, CustomerQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerQueryBuilderDsl> customerGroup(
            Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customerGroup"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer_group.CustomerGroupReferenceQueryBuilderDsl.of())),
            CustomerQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CustomerQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            CustomerQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<CustomerQueryBuilderDsl> locale() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("locale")),
            p -> new CombinationQueryPredicate<>(p, CustomerQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerQueryBuilderDsl> salutation() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("salutation")),
            p -> new CombinationQueryPredicate<>(p, CustomerQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerQueryBuilderDsl> stores(
            Function<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("stores"))
                .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl.of())),
            CustomerQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CustomerQueryBuilderDsl> stores() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("stores")),
            p -> new CombinationQueryPredicate<>(p, CustomerQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerQueryBuilderDsl> authenticationMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("authenticationMode")),
            p -> new CombinationQueryPredicate<>(p, CustomerQueryBuilderDsl::of));
    }

}
