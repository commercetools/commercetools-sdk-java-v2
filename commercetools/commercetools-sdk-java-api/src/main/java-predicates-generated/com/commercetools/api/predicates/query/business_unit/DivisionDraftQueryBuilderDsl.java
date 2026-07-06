
package com.commercetools.api.predicates.query.business_unit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DivisionDraftQueryBuilderDsl {
    public DivisionDraftQueryBuilderDsl() {
    }

    public static DivisionDraftQueryBuilderDsl of() {
        return new DivisionDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DivisionDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, DivisionDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DivisionDraftQueryBuilderDsl> status() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("status")),
            p -> new CombinationQueryPredicate<>(p, DivisionDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DivisionDraftQueryBuilderDsl> stores(
            Function<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("stores"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl.of())),
            DivisionDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<DivisionDraftQueryBuilderDsl> stores() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("stores")),
            p -> new CombinationQueryPredicate<>(p, DivisionDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DivisionDraftQueryBuilderDsl> storeMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("storeMode")),
            p -> new CombinationQueryPredicate<>(p, DivisionDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DivisionDraftQueryBuilderDsl> unitType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("unitType")),
            p -> new CombinationQueryPredicate<>(p, DivisionDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DivisionDraftQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, DivisionDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DivisionDraftQueryBuilderDsl> contactEmail() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("contactEmail")),
            p -> new CombinationQueryPredicate<>(p, DivisionDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DivisionDraftQueryBuilderDsl> associateMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("associateMode")),
            p -> new CombinationQueryPredicate<>(p, DivisionDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DivisionDraftQueryBuilderDsl> associates(
            Function<com.commercetools.api.predicates.query.business_unit.AssociateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.AssociateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("associates"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.business_unit.AssociateDraftQueryBuilderDsl.of())),
            DivisionDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<DivisionDraftQueryBuilderDsl> associates() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("associates")),
            p -> new CombinationQueryPredicate<>(p, DivisionDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DivisionDraftQueryBuilderDsl> approvalRuleMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("approvalRuleMode")),
            p -> new CombinationQueryPredicate<>(p, DivisionDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DivisionDraftQueryBuilderDsl> addresses(
            Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("addresses"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            DivisionDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<DivisionDraftQueryBuilderDsl> addresses() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addresses")),
            p -> new CombinationQueryPredicate<>(p, DivisionDraftQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<DivisionDraftQueryBuilderDsl> shippingAddresses() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingAddresses")),
            p -> new CombinationQueryPredicate<>(p, DivisionDraftQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<DivisionDraftQueryBuilderDsl> defaultShippingAddress() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("defaultShippingAddress")),
            p -> new CombinationQueryPredicate<>(p, DivisionDraftQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<DivisionDraftQueryBuilderDsl> billingAddresses() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("billingAddresses")),
            p -> new CombinationQueryPredicate<>(p, DivisionDraftQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<DivisionDraftQueryBuilderDsl> defaultBillingAddress() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("defaultBillingAddress")),
            p -> new CombinationQueryPredicate<>(p, DivisionDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DivisionDraftQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            DivisionDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DivisionDraftQueryBuilderDsl> customerGroupAssignments(
            Function<com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customerGroupAssignments"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer.CustomerGroupAssignmentDraftQueryBuilderDsl.of())),
            DivisionDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<DivisionDraftQueryBuilderDsl> customerGroupAssignments() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customerGroupAssignments")),
            p -> new CombinationQueryPredicate<>(p, DivisionDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DivisionDraftQueryBuilderDsl> parentUnit(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("parentUnit"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl
                            .of())),
            DivisionDraftQueryBuilderDsl::of);
    }

}
