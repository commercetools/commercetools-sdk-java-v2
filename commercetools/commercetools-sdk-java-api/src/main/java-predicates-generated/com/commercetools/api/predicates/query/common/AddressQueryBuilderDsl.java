package com.commercetools.api.predicates.query.common;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class AddressQueryBuilderDsl  {
    public AddressQueryBuilderDsl() {
    }

    public static AddressQueryBuilderDsl of() {
        return new AddressQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AddressQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, AddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, AddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressQueryBuilderDsl> country() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("country")),
        p -> new CombinationQueryPredicate<>(p, AddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressQueryBuilderDsl> title() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("title")),
        p -> new CombinationQueryPredicate<>(p, AddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressQueryBuilderDsl> salutation() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("salutation")),
        p -> new CombinationQueryPredicate<>(p, AddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressQueryBuilderDsl> firstName() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("firstName")),
        p -> new CombinationQueryPredicate<>(p, AddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressQueryBuilderDsl> lastName() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastName")),
        p -> new CombinationQueryPredicate<>(p, AddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressQueryBuilderDsl> streetName() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("streetName")),
        p -> new CombinationQueryPredicate<>(p, AddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressQueryBuilderDsl> streetNumber() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("streetNumber")),
        p -> new CombinationQueryPredicate<>(p, AddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressQueryBuilderDsl> additionalStreetInfo() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("additionalStreetInfo")),
        p -> new CombinationQueryPredicate<>(p, AddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressQueryBuilderDsl> postalCode() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("postalCode")),
        p -> new CombinationQueryPredicate<>(p, AddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressQueryBuilderDsl> city() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("city")),
        p -> new CombinationQueryPredicate<>(p, AddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressQueryBuilderDsl> region() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("region")),
        p -> new CombinationQueryPredicate<>(p, AddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressQueryBuilderDsl> state() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("state")),
        p -> new CombinationQueryPredicate<>(p, AddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressQueryBuilderDsl> company() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("company")),
        p -> new CombinationQueryPredicate<>(p, AddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressQueryBuilderDsl> department() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("department")),
        p -> new CombinationQueryPredicate<>(p, AddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressQueryBuilderDsl> building() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("building")),
        p -> new CombinationQueryPredicate<>(p, AddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressQueryBuilderDsl> apartment() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("apartment")),
        p -> new CombinationQueryPredicate<>(p, AddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressQueryBuilderDsl> pOBox() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("pOBox")),
        p -> new CombinationQueryPredicate<>(p, AddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressQueryBuilderDsl> phone() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("phone")),
        p -> new CombinationQueryPredicate<>(p, AddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressQueryBuilderDsl> mobile() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("mobile")),
        p -> new CombinationQueryPredicate<>(p, AddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressQueryBuilderDsl> email() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("email")),
        p -> new CombinationQueryPredicate<>(p, AddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressQueryBuilderDsl> fax() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fax")),
        p -> new CombinationQueryPredicate<>(p, AddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressQueryBuilderDsl> additionalAddressInfo() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("additionalAddressInfo")),
        p -> new CombinationQueryPredicate<>(p, AddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AddressQueryBuilderDsl> externalId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("externalId")),
        p -> new CombinationQueryPredicate<>(p, AddressQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<AddressQueryBuilderDsl> custom(
        Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("custom"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            AddressQueryBuilderDsl::of);
    }
    
    
}
