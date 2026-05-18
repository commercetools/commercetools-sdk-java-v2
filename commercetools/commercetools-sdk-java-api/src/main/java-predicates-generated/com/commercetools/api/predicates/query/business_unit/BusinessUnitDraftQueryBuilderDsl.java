
package com.commercetools.api.predicates.query.business_unit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitDraftQueryBuilderDsl {
    public BusinessUnitDraftQueryBuilderDsl() {
    }

    public static BusinessUnitDraftQueryBuilderDsl of() {
        return new BusinessUnitDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitDraftQueryBuilderDsl> status() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("status")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitDraftQueryBuilderDsl> stores(
            Function<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("stores"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl.of())),
            BusinessUnitDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<BusinessUnitDraftQueryBuilderDsl> stores() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("stores")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitDraftQueryBuilderDsl> storeMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("storeMode")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitDraftQueryBuilderDsl> unitType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("unitType")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitDraftQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitDraftQueryBuilderDsl> contactEmail() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("contactEmail")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitDraftQueryBuilderDsl> associateMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("associateMode")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitDraftQueryBuilderDsl> associates(
            Function<com.commercetools.api.predicates.query.business_unit.AssociateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.AssociateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("associates"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.business_unit.AssociateDraftQueryBuilderDsl.of())),
            BusinessUnitDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<BusinessUnitDraftQueryBuilderDsl> associates() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("associates")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitDraftQueryBuilderDsl> approvalRuleMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("approvalRuleMode")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitDraftQueryBuilderDsl> addresses(
            Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("addresses"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            BusinessUnitDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<BusinessUnitDraftQueryBuilderDsl> addresses() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addresses")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitDraftQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<BusinessUnitDraftQueryBuilderDsl> shippingAddresses() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingAddresses")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitDraftQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<BusinessUnitDraftQueryBuilderDsl> defaultShippingAddress() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("defaultShippingAddress")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitDraftQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<BusinessUnitDraftQueryBuilderDsl> billingAddresses() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("billingAddresses")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitDraftQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<BusinessUnitDraftQueryBuilderDsl> defaultBillingAddress() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("defaultBillingAddress")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitDraftQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            BusinessUnitDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitDraftQueryBuilderDsl> customerGroupAssignments(
            Function<com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customerGroupAssignments"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentDraftQueryBuilderDsl.of())),
            BusinessUnitDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<BusinessUnitDraftQueryBuilderDsl> customerGroupAssignments() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customerGroupAssignments")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitDraftQueryBuilderDsl> asCompany(
            Function<com.commercetools.api.predicates.query.business_unit.CompanyDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.CompanyDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.business_unit.CompanyDraftQueryBuilderDsl.of()),
            BusinessUnitDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitDraftQueryBuilderDsl> asDivision(
            Function<com.commercetools.api.predicates.query.business_unit.DivisionDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.DivisionDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.business_unit.DivisionDraftQueryBuilderDsl.of()),
            BusinessUnitDraftQueryBuilderDsl::of);
    }
}
