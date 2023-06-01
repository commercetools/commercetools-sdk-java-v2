package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyBusinessUnitDraftQueryBuilderDsl  {
    public MyBusinessUnitDraftQueryBuilderDsl() {
    }

    public static MyBusinessUnitDraftQueryBuilderDsl of() {
        return new MyBusinessUnitDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyBusinessUnitDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, MyBusinessUnitDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyBusinessUnitDraftQueryBuilderDsl> unitType() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("unitType")),
        p -> new CombinationQueryPredicate<>(p, MyBusinessUnitDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyBusinessUnitDraftQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, MyBusinessUnitDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyBusinessUnitDraftQueryBuilderDsl> contactEmail() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("contactEmail")),
        p -> new CombinationQueryPredicate<>(p, MyBusinessUnitDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<MyBusinessUnitDraftQueryBuilderDsl> custom(
        Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("custom"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            MyBusinessUnitDraftQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<MyBusinessUnitDraftQueryBuilderDsl> addresses(
        Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("addresses"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            MyBusinessUnitDraftQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<MyBusinessUnitDraftQueryBuilderDsl> addresses() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addresses")),
                p -> new CombinationQueryPredicate<>(p, MyBusinessUnitDraftQueryBuilderDsl::of));
    }
    public StringCollectionPredicateBuilder<MyBusinessUnitDraftQueryBuilderDsl> shippingAddresses() {
        return new StringCollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingAddresses")),
        p -> new CombinationQueryPredicate<>(p, MyBusinessUnitDraftQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<MyBusinessUnitDraftQueryBuilderDsl> defaultShippingAddress() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("defaultShippingAddress")),
        p -> new CombinationQueryPredicate<>(p, MyBusinessUnitDraftQueryBuilderDsl::of));
    }
    public StringCollectionPredicateBuilder<MyBusinessUnitDraftQueryBuilderDsl> billingAddresses() {
        return new StringCollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("billingAddresses")),
        p -> new CombinationQueryPredicate<>(p, MyBusinessUnitDraftQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<MyBusinessUnitDraftQueryBuilderDsl> defaultBillingAddress() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("defaultBillingAddress")),
        p -> new CombinationQueryPredicate<>(p, MyBusinessUnitDraftQueryBuilderDsl::of));
    }
    
    public CombinationQueryPredicate<MyBusinessUnitDraftQueryBuilderDsl> asCompany(
        Function<com.commercetools.api.predicates.query.me.MyCompanyDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyCompanyDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyCompanyDraftQueryBuilderDsl.of()),
            MyBusinessUnitDraftQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<MyBusinessUnitDraftQueryBuilderDsl> asDivision(
        Function<com.commercetools.api.predicates.query.me.MyDivisionDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyDivisionDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyDivisionDraftQueryBuilderDsl.of()),
            MyBusinessUnitDraftQueryBuilderDsl::of);
    }
}
