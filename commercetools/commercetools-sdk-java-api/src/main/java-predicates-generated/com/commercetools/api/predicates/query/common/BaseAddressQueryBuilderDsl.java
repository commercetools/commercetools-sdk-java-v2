package com.commercetools.api.predicates.query.common;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class BaseAddressQueryBuilderDsl  {
    public BaseAddressQueryBuilderDsl() {
    }

    public static BaseAddressQueryBuilderDsl of() {
        return new BaseAddressQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BaseAddressQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, BaseAddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BaseAddressQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, BaseAddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BaseAddressQueryBuilderDsl> country() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("country")),
        p -> new CombinationQueryPredicate<>(p, BaseAddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BaseAddressQueryBuilderDsl> title() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("title")),
        p -> new CombinationQueryPredicate<>(p, BaseAddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BaseAddressQueryBuilderDsl> salutation() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("salutation")),
        p -> new CombinationQueryPredicate<>(p, BaseAddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BaseAddressQueryBuilderDsl> firstName() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("firstName")),
        p -> new CombinationQueryPredicate<>(p, BaseAddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BaseAddressQueryBuilderDsl> lastName() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastName")),
        p -> new CombinationQueryPredicate<>(p, BaseAddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BaseAddressQueryBuilderDsl> streetName() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("streetName")),
        p -> new CombinationQueryPredicate<>(p, BaseAddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BaseAddressQueryBuilderDsl> streetNumber() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("streetNumber")),
        p -> new CombinationQueryPredicate<>(p, BaseAddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BaseAddressQueryBuilderDsl> additionalStreetInfo() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("additionalStreetInfo")),
        p -> new CombinationQueryPredicate<>(p, BaseAddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BaseAddressQueryBuilderDsl> postalCode() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("postalCode")),
        p -> new CombinationQueryPredicate<>(p, BaseAddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BaseAddressQueryBuilderDsl> city() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("city")),
        p -> new CombinationQueryPredicate<>(p, BaseAddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BaseAddressQueryBuilderDsl> region() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("region")),
        p -> new CombinationQueryPredicate<>(p, BaseAddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BaseAddressQueryBuilderDsl> state() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("state")),
        p -> new CombinationQueryPredicate<>(p, BaseAddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BaseAddressQueryBuilderDsl> company() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("company")),
        p -> new CombinationQueryPredicate<>(p, BaseAddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BaseAddressQueryBuilderDsl> department() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("department")),
        p -> new CombinationQueryPredicate<>(p, BaseAddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BaseAddressQueryBuilderDsl> building() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("building")),
        p -> new CombinationQueryPredicate<>(p, BaseAddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BaseAddressQueryBuilderDsl> apartment() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("apartment")),
        p -> new CombinationQueryPredicate<>(p, BaseAddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BaseAddressQueryBuilderDsl> pOBox() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("pOBox")),
        p -> new CombinationQueryPredicate<>(p, BaseAddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BaseAddressQueryBuilderDsl> phone() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("phone")),
        p -> new CombinationQueryPredicate<>(p, BaseAddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BaseAddressQueryBuilderDsl> mobile() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("mobile")),
        p -> new CombinationQueryPredicate<>(p, BaseAddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BaseAddressQueryBuilderDsl> email() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("email")),
        p -> new CombinationQueryPredicate<>(p, BaseAddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BaseAddressQueryBuilderDsl> fax() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fax")),
        p -> new CombinationQueryPredicate<>(p, BaseAddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BaseAddressQueryBuilderDsl> additionalAddressInfo() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("additionalAddressInfo")),
        p -> new CombinationQueryPredicate<>(p, BaseAddressQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BaseAddressQueryBuilderDsl> externalId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("externalId")),
        p -> new CombinationQueryPredicate<>(p, BaseAddressQueryBuilderDsl::of));
    }
    
    public CombinationQueryPredicate<BaseAddressQueryBuilderDsl> asAddress(
        Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of()),
            BaseAddressQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<BaseAddressQueryBuilderDsl> asAddressDraft(
        Function<com.commercetools.api.predicates.query.common.AddressDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.common.AddressDraftQueryBuilderDsl.of()),
            BaseAddressQueryBuilderDsl::of);
    }
}
