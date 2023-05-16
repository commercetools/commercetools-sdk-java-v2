
package com.commercetools.api.predicates.query.business_unit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DivisionQueryBuilderDsl {
    public DivisionQueryBuilderDsl() {
    }

    public static DivisionQueryBuilderDsl of() {
        return new DivisionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DivisionQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, DivisionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<DivisionQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, DivisionQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<DivisionQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, DivisionQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<DivisionQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, DivisionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DivisionQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            DivisionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DivisionQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            DivisionQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<DivisionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, DivisionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DivisionQueryBuilderDsl> status() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("status")),
            p -> new CombinationQueryPredicate<>(p, DivisionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DivisionQueryBuilderDsl> stores(
            Function<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("stores"))
                .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl.of())),
            DivisionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<DivisionQueryBuilderDsl> stores() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("stores")),
            p -> new CombinationQueryPredicate<>(p, DivisionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DivisionQueryBuilderDsl> storeMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("storeMode")),
            p -> new CombinationQueryPredicate<>(p, DivisionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DivisionQueryBuilderDsl> unitType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("unitType")),
            p -> new CombinationQueryPredicate<>(p, DivisionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DivisionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, DivisionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DivisionQueryBuilderDsl> contactEmail() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("contactEmail")),
            p -> new CombinationQueryPredicate<>(p, DivisionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DivisionQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            DivisionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DivisionQueryBuilderDsl> addresses(
            Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("addresses"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            DivisionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<DivisionQueryBuilderDsl> addresses() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addresses")),
            p -> new CombinationQueryPredicate<>(p, DivisionQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<DivisionQueryBuilderDsl> shippingAddressIds() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingAddressIds")),
            p -> new CombinationQueryPredicate<>(p, DivisionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DivisionQueryBuilderDsl> defaultShippingAddressId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("defaultShippingAddressId")),
            p -> new CombinationQueryPredicate<>(p, DivisionQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<DivisionQueryBuilderDsl> billingAddressIds() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("billingAddressIds")),
            p -> new CombinationQueryPredicate<>(p, DivisionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DivisionQueryBuilderDsl> defaultBillingAddressId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("defaultBillingAddressId")),
            p -> new CombinationQueryPredicate<>(p, DivisionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DivisionQueryBuilderDsl> associateMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("associateMode")),
            p -> new CombinationQueryPredicate<>(p, DivisionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DivisionQueryBuilderDsl> associates(
            Function<com.commercetools.api.predicates.query.business_unit.AssociateQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.AssociateQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("associates"))
                .inner(fn.apply(com.commercetools.api.predicates.query.business_unit.AssociateQueryBuilderDsl.of())),
            DivisionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<DivisionQueryBuilderDsl> associates() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("associates")),
            p -> new CombinationQueryPredicate<>(p, DivisionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DivisionQueryBuilderDsl> inheritedAssociates(
            Function<com.commercetools.api.predicates.query.business_unit.InheritedAssociateQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.InheritedAssociateQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("inheritedAssociates"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.business_unit.InheritedAssociateQueryBuilderDsl.of())),
            DivisionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<DivisionQueryBuilderDsl> inheritedAssociates() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("inheritedAssociates")),
            p -> new CombinationQueryPredicate<>(p, DivisionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DivisionQueryBuilderDsl> parentUnit(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("parentUnit"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl.of())),
            DivisionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DivisionQueryBuilderDsl> topLevelUnit(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("topLevelUnit"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl.of())),
            DivisionQueryBuilderDsl::of);
    }

}
