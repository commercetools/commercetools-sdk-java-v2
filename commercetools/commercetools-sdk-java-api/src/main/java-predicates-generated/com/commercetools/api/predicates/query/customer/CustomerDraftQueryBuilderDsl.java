
package com.commercetools.api.predicates.query.customer;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerDraftQueryBuilderDsl {
    public CustomerDraftQueryBuilderDsl() {
    }

    public static CustomerDraftQueryBuilderDsl of() {
        return new CustomerDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, CustomerDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerDraftQueryBuilderDsl> customerNumber() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customerNumber")),
            p -> new CombinationQueryPredicate<>(p, CustomerDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerDraftQueryBuilderDsl> externalId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("externalId")),
            p -> new CombinationQueryPredicate<>(p, CustomerDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerDraftQueryBuilderDsl> email() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("email")),
            p -> new CombinationQueryPredicate<>(p, CustomerDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerDraftQueryBuilderDsl> password() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("password")),
            p -> new CombinationQueryPredicate<>(p, CustomerDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerDraftQueryBuilderDsl> firstName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("firstName")),
            p -> new CombinationQueryPredicate<>(p, CustomerDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerDraftQueryBuilderDsl> lastName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastName")),
            p -> new CombinationQueryPredicate<>(p, CustomerDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerDraftQueryBuilderDsl> middleName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("middleName")),
            p -> new CombinationQueryPredicate<>(p, CustomerDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerDraftQueryBuilderDsl> title() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("title")),
            p -> new CombinationQueryPredicate<>(p, CustomerDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerDraftQueryBuilderDsl> anonymousCartId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("anonymousCartId")),
            p -> new CombinationQueryPredicate<>(p, CustomerDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerDraftQueryBuilderDsl> anonymousCart(
            Function<com.commercetools.api.predicates.query.cart.CartResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("anonymousCart"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.cart.CartResourceIdentifierQueryBuilderDsl.of())),
            CustomerDraftQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<CustomerDraftQueryBuilderDsl> anonymousId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("anonymousId")),
            p -> new CombinationQueryPredicate<>(p, CustomerDraftQueryBuilderDsl::of));
    }

    public DateComparisonPredicateBuilder<CustomerDraftQueryBuilderDsl> dateOfBirth() {
        return new DateComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("dateOfBirth")),
            p -> new CombinationQueryPredicate<>(p, CustomerDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerDraftQueryBuilderDsl> companyName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("companyName")),
            p -> new CombinationQueryPredicate<>(p, CustomerDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerDraftQueryBuilderDsl> vatId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("vatId")),
            p -> new CombinationQueryPredicate<>(p, CustomerDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerDraftQueryBuilderDsl> addresses(
            Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("addresses"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            CustomerDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CustomerDraftQueryBuilderDsl> addresses() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addresses")),
            p -> new CombinationQueryPredicate<>(p, CustomerDraftQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CustomerDraftQueryBuilderDsl> defaultShippingAddress() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("defaultShippingAddress")),
            p -> new CombinationQueryPredicate<>(p, CustomerDraftQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<CustomerDraftQueryBuilderDsl> shippingAddresses() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingAddresses")),
            p -> new CombinationQueryPredicate<>(p, CustomerDraftQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CustomerDraftQueryBuilderDsl> defaultBillingAddress() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("defaultBillingAddress")),
            p -> new CombinationQueryPredicate<>(p, CustomerDraftQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<CustomerDraftQueryBuilderDsl> billingAddresses() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("billingAddresses")),
            p -> new CombinationQueryPredicate<>(p, CustomerDraftQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<CustomerDraftQueryBuilderDsl> isEmailVerified() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("isEmailVerified")),
            p -> new CombinationQueryPredicate<>(p, CustomerDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerDraftQueryBuilderDsl> customerGroup(
            Function<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customerGroup"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer_group.CustomerGroupResourceIdentifierQueryBuilderDsl
                            .of())),
            CustomerDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CustomerDraftQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            CustomerDraftQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<CustomerDraftQueryBuilderDsl> locale() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("locale")),
            p -> new CombinationQueryPredicate<>(p, CustomerDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerDraftQueryBuilderDsl> salutation() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("salutation")),
            p -> new CombinationQueryPredicate<>(p, CustomerDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerDraftQueryBuilderDsl> stores(
            Function<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("stores"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl.of())),
            CustomerDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CustomerDraftQueryBuilderDsl> stores() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("stores")),
            p -> new CombinationQueryPredicate<>(p, CustomerDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerDraftQueryBuilderDsl> authenticationMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("authenticationMode")),
            p -> new CombinationQueryPredicate<>(p, CustomerDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerDraftQueryBuilderDsl> customerGroupAssignments(
            Function<com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customerGroupAssignments"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentDraftQueryBuilderDsl.of())),
            CustomerDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CustomerDraftQueryBuilderDsl> customerGroupAssignments() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customerGroupAssignments")),
            p -> new CombinationQueryPredicate<>(p, CustomerDraftQueryBuilderDsl::of));
    }

}
