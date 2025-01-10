
package com.commercetools.api.predicates.query.business_unit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitQueryBuilderDsl {
    public BusinessUnitQueryBuilderDsl() {
    }

    public static BusinessUnitQueryBuilderDsl of() {
        return new BusinessUnitQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<BusinessUnitQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<BusinessUnitQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<BusinessUnitQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            BusinessUnitQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            BusinessUnitQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<BusinessUnitQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitQueryBuilderDsl> status() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("status")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitQueryBuilderDsl> stores(
            Function<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("stores"))
                .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl.of())),
            BusinessUnitQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<BusinessUnitQueryBuilderDsl> stores() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("stores")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitQueryBuilderDsl> inheritedStores(
            Function<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("inheritedStores"))
                .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl.of())),
            BusinessUnitQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<BusinessUnitQueryBuilderDsl> inheritedStores() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("inheritedStores")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitQueryBuilderDsl> storeMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("storeMode")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitQueryBuilderDsl> unitType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("unitType")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitQueryBuilderDsl> contactEmail() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("contactEmail")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            BusinessUnitQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitQueryBuilderDsl> addresses(
            Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("addresses"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            BusinessUnitQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<BusinessUnitQueryBuilderDsl> addresses() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addresses")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<BusinessUnitQueryBuilderDsl> shippingAddressIds() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingAddressIds")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitQueryBuilderDsl> defaultShippingAddressId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("defaultShippingAddressId")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<BusinessUnitQueryBuilderDsl> billingAddressIds() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("billingAddressIds")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitQueryBuilderDsl> defaultBillingAddressId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("defaultBillingAddressId")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitQueryBuilderDsl> associateMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("associateMode")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitQueryBuilderDsl> associates(
            Function<com.commercetools.api.predicates.query.business_unit.AssociateQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.AssociateQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("associates"))
                .inner(fn.apply(com.commercetools.api.predicates.query.business_unit.AssociateQueryBuilderDsl.of())),
            BusinessUnitQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<BusinessUnitQueryBuilderDsl> associates() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("associates")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitQueryBuilderDsl> inheritedAssociates(
            Function<com.commercetools.api.predicates.query.business_unit.InheritedAssociateQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.InheritedAssociateQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("inheritedAssociates"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.business_unit.InheritedAssociateQueryBuilderDsl.of())),
            BusinessUnitQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<BusinessUnitQueryBuilderDsl> inheritedAssociates() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("inheritedAssociates")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitQueryBuilderDsl> parentUnit(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("parentUnit"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl.of())),
            BusinessUnitQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitQueryBuilderDsl> topLevelUnit(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("topLevelUnit"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl.of())),
            BusinessUnitQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<BusinessUnitQueryBuilderDsl> approvalRuleMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("approvalRuleMode")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitQueryBuilderDsl> asCompany(
            Function<com.commercetools.api.predicates.query.business_unit.CompanyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.CompanyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.business_unit.CompanyQueryBuilderDsl.of()),
            BusinessUnitQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitQueryBuilderDsl> asDivision(
            Function<com.commercetools.api.predicates.query.business_unit.DivisionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.DivisionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.business_unit.DivisionQueryBuilderDsl.of()),
            BusinessUnitQueryBuilderDsl::of);
    }
}
