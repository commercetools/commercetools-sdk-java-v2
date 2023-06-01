package com.commercetools.api.predicates.query.business_unit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CompanyQueryBuilderDsl  {
    public CompanyQueryBuilderDsl() {
    }

    public static CompanyQueryBuilderDsl of() {
        return new CompanyQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CompanyQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, CompanyQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<CompanyQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, CompanyQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<CompanyQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, CompanyQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<CompanyQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, CompanyQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CompanyQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            CompanyQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<CompanyQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            CompanyQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<CompanyQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, CompanyQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CompanyQueryBuilderDsl> status() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("status")),
        p -> new CombinationQueryPredicate<>(p, CompanyQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CompanyQueryBuilderDsl> stores(
        Function<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("stores"))
            .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl.of())),
            CompanyQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<CompanyQueryBuilderDsl> stores() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("stores")),
                p -> new CombinationQueryPredicate<>(p, CompanyQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CompanyQueryBuilderDsl> storeMode() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("storeMode")),
        p -> new CombinationQueryPredicate<>(p, CompanyQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CompanyQueryBuilderDsl> unitType() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("unitType")),
        p -> new CombinationQueryPredicate<>(p, CompanyQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CompanyQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, CompanyQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CompanyQueryBuilderDsl> contactEmail() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("contactEmail")),
        p -> new CombinationQueryPredicate<>(p, CompanyQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CompanyQueryBuilderDsl> custom(
        Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("custom"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            CompanyQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<CompanyQueryBuilderDsl> addresses(
        Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("addresses"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            CompanyQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<CompanyQueryBuilderDsl> addresses() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addresses")),
                p -> new CombinationQueryPredicate<>(p, CompanyQueryBuilderDsl::of));
    }
    public StringCollectionPredicateBuilder<CompanyQueryBuilderDsl> shippingAddressIds() {
        return new StringCollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingAddressIds")),
        p -> new CombinationQueryPredicate<>(p, CompanyQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CompanyQueryBuilderDsl> defaultShippingAddressId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("defaultShippingAddressId")),
        p -> new CombinationQueryPredicate<>(p, CompanyQueryBuilderDsl::of));
    }
    public StringCollectionPredicateBuilder<CompanyQueryBuilderDsl> billingAddressIds() {
        return new StringCollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("billingAddressIds")),
        p -> new CombinationQueryPredicate<>(p, CompanyQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CompanyQueryBuilderDsl> defaultBillingAddressId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("defaultBillingAddressId")),
        p -> new CombinationQueryPredicate<>(p, CompanyQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CompanyQueryBuilderDsl> associateMode() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("associateMode")),
        p -> new CombinationQueryPredicate<>(p, CompanyQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CompanyQueryBuilderDsl> associates(
        Function<com.commercetools.api.predicates.query.business_unit.AssociateQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.AssociateQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("associates"))
            .inner(fn.apply(com.commercetools.api.predicates.query.business_unit.AssociateQueryBuilderDsl.of())),
            CompanyQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<CompanyQueryBuilderDsl> associates() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("associates")),
                p -> new CombinationQueryPredicate<>(p, CompanyQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CompanyQueryBuilderDsl> inheritedAssociates(
        Function<com.commercetools.api.predicates.query.business_unit.InheritedAssociateQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.InheritedAssociateQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("inheritedAssociates"))
            .inner(fn.apply(com.commercetools.api.predicates.query.business_unit.InheritedAssociateQueryBuilderDsl.of())),
            CompanyQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<CompanyQueryBuilderDsl> inheritedAssociates() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("inheritedAssociates")),
                p -> new CombinationQueryPredicate<>(p, CompanyQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CompanyQueryBuilderDsl> parentUnit(
        Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("parentUnit"))
            .inner(fn.apply(com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl.of())),
            CompanyQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<CompanyQueryBuilderDsl> topLevelUnit(
        Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("topLevelUnit"))
            .inner(fn.apply(com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl.of())),
            CompanyQueryBuilderDsl::of);
    }
    
    
}
