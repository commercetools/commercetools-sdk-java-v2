package com.commercetools.api.predicates.query.common;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class AddressDraftQueryBuilderDsl  {
    public AddressDraftQueryBuilderDsl() {
    }

    public static AddressDraftQueryBuilderDsl of() {
        return new AddressDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AddressDraftQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, AddressDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, AddressDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressDraftQueryBuilderDsl> country() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("country")),
        p -> new CombinationQueryPredicate<>(p, AddressDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressDraftQueryBuilderDsl> title() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("title")),
        p -> new CombinationQueryPredicate<>(p, AddressDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressDraftQueryBuilderDsl> salutation() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("salutation")),
        p -> new CombinationQueryPredicate<>(p, AddressDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressDraftQueryBuilderDsl> firstName() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("firstName")),
        p -> new CombinationQueryPredicate<>(p, AddressDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressDraftQueryBuilderDsl> lastName() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastName")),
        p -> new CombinationQueryPredicate<>(p, AddressDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressDraftQueryBuilderDsl> streetName() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("streetName")),
        p -> new CombinationQueryPredicate<>(p, AddressDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressDraftQueryBuilderDsl> streetNumber() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("streetNumber")),
        p -> new CombinationQueryPredicate<>(p, AddressDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressDraftQueryBuilderDsl> additionalStreetInfo() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("additionalStreetInfo")),
        p -> new CombinationQueryPredicate<>(p, AddressDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressDraftQueryBuilderDsl> postalCode() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("postalCode")),
        p -> new CombinationQueryPredicate<>(p, AddressDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressDraftQueryBuilderDsl> city() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("city")),
        p -> new CombinationQueryPredicate<>(p, AddressDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressDraftQueryBuilderDsl> region() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("region")),
        p -> new CombinationQueryPredicate<>(p, AddressDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressDraftQueryBuilderDsl> state() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("state")),
        p -> new CombinationQueryPredicate<>(p, AddressDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressDraftQueryBuilderDsl> company() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("company")),
        p -> new CombinationQueryPredicate<>(p, AddressDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressDraftQueryBuilderDsl> department() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("department")),
        p -> new CombinationQueryPredicate<>(p, AddressDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressDraftQueryBuilderDsl> building() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("building")),
        p -> new CombinationQueryPredicate<>(p, AddressDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressDraftQueryBuilderDsl> apartment() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("apartment")),
        p -> new CombinationQueryPredicate<>(p, AddressDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressDraftQueryBuilderDsl> pOBox() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("pOBox")),
        p -> new CombinationQueryPredicate<>(p, AddressDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressDraftQueryBuilderDsl> phone() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("phone")),
        p -> new CombinationQueryPredicate<>(p, AddressDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressDraftQueryBuilderDsl> mobile() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("mobile")),
        p -> new CombinationQueryPredicate<>(p, AddressDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressDraftQueryBuilderDsl> email() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("email")),
        p -> new CombinationQueryPredicate<>(p, AddressDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressDraftQueryBuilderDsl> fax() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fax")),
        p -> new CombinationQueryPredicate<>(p, AddressDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressDraftQueryBuilderDsl> additionalAddressInfo() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("additionalAddressInfo")),
        p -> new CombinationQueryPredicate<>(p, AddressDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressDraftQueryBuilderDsl> externalId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("externalId")),
        p -> new CombinationQueryPredicate<>(p, AddressDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<AddressDraftQueryBuilderDsl> custom(
        Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("custom"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            AddressDraftQueryBuilderDsl::of);
    }
    
    
}
