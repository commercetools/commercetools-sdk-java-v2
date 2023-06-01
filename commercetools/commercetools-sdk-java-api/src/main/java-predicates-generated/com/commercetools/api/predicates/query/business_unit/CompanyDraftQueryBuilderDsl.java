package com.commercetools.api.predicates.query.business_unit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CompanyDraftQueryBuilderDsl  {
    public CompanyDraftQueryBuilderDsl() {
    }

    public static CompanyDraftQueryBuilderDsl of() {
        return new CompanyDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CompanyDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, CompanyDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CompanyDraftQueryBuilderDsl> status() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("status")),
        p -> new CombinationQueryPredicate<>(p, CompanyDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CompanyDraftQueryBuilderDsl> stores(
        Function<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("stores"))
            .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl.of())),
            CompanyDraftQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<CompanyDraftQueryBuilderDsl> stores() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("stores")),
                p -> new CombinationQueryPredicate<>(p, CompanyDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CompanyDraftQueryBuilderDsl> storeMode() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("storeMode")),
        p -> new CombinationQueryPredicate<>(p, CompanyDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CompanyDraftQueryBuilderDsl> unitType() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("unitType")),
        p -> new CombinationQueryPredicate<>(p, CompanyDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CompanyDraftQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, CompanyDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CompanyDraftQueryBuilderDsl> contactEmail() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("contactEmail")),
        p -> new CombinationQueryPredicate<>(p, CompanyDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CompanyDraftQueryBuilderDsl> associateMode() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("associateMode")),
        p -> new CombinationQueryPredicate<>(p, CompanyDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CompanyDraftQueryBuilderDsl> associates(
        Function<com.commercetools.api.predicates.query.business_unit.AssociateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.AssociateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("associates"))
            .inner(fn.apply(com.commercetools.api.predicates.query.business_unit.AssociateDraftQueryBuilderDsl.of())),
            CompanyDraftQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<CompanyDraftQueryBuilderDsl> associates() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("associates")),
                p -> new CombinationQueryPredicate<>(p, CompanyDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CompanyDraftQueryBuilderDsl> addresses(
        Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("addresses"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            CompanyDraftQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<CompanyDraftQueryBuilderDsl> addresses() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addresses")),
                p -> new CombinationQueryPredicate<>(p, CompanyDraftQueryBuilderDsl::of));
    }
    public StringCollectionPredicateBuilder<CompanyDraftQueryBuilderDsl> shippingAddresses() {
        return new StringCollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingAddresses")),
        p -> new CombinationQueryPredicate<>(p, CompanyDraftQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<CompanyDraftQueryBuilderDsl> defaultShippingAddress() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("defaultShippingAddress")),
        p -> new CombinationQueryPredicate<>(p, CompanyDraftQueryBuilderDsl::of));
    }
    public StringCollectionPredicateBuilder<CompanyDraftQueryBuilderDsl> billingAddresses() {
        return new StringCollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("billingAddresses")),
        p -> new CombinationQueryPredicate<>(p, CompanyDraftQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<CompanyDraftQueryBuilderDsl> defaultBillingAddress() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("defaultBillingAddress")),
        p -> new CombinationQueryPredicate<>(p, CompanyDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CompanyDraftQueryBuilderDsl> custom(
        Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("custom"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            CompanyDraftQueryBuilderDsl::of);
    }
    
    
}
