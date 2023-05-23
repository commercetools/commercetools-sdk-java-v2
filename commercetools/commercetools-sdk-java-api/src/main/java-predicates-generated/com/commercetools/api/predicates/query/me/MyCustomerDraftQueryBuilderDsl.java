
package com.commercetools.api.predicates.query.me;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MyCustomerDraftQueryBuilderDsl {
    public MyCustomerDraftQueryBuilderDsl() {
    }

    public static MyCustomerDraftQueryBuilderDsl of() {
        return new MyCustomerDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCustomerDraftQueryBuilderDsl> email() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("email")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCustomerDraftQueryBuilderDsl> password() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("password")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCustomerDraftQueryBuilderDsl> firstName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("firstName")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCustomerDraftQueryBuilderDsl> lastName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastName")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCustomerDraftQueryBuilderDsl> middleName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("middleName")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCustomerDraftQueryBuilderDsl> title() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("title")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCustomerDraftQueryBuilderDsl> salutation() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("salutation")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerDraftQueryBuilderDsl::of));
    }

    public DateComparisonPredicateBuilder<MyCustomerDraftQueryBuilderDsl> dateOfBirth() {
        return new DateComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("dateOfBirth")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCustomerDraftQueryBuilderDsl> companyName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("companyName")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyCustomerDraftQueryBuilderDsl> vatId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("vatId")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyCustomerDraftQueryBuilderDsl> addresses(
            Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("addresses"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            MyCustomerDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<MyCustomerDraftQueryBuilderDsl> addresses() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addresses")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerDraftQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<MyCustomerDraftQueryBuilderDsl> defaultShippingAddress() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("defaultShippingAddress")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerDraftQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<MyCustomerDraftQueryBuilderDsl> defaultBillingAddress() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("defaultBillingAddress")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyCustomerDraftQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            MyCustomerDraftQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<MyCustomerDraftQueryBuilderDsl> locale() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("locale")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyCustomerDraftQueryBuilderDsl> stores(
            Function<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("stores"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl.of())),
            MyCustomerDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<MyCustomerDraftQueryBuilderDsl> stores() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("stores")),
            p -> new CombinationQueryPredicate<>(p, MyCustomerDraftQueryBuilderDsl::of));
    }

}
