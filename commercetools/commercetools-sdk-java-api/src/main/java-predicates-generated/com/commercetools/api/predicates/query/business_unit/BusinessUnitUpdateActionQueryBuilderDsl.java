
package com.commercetools.api.predicates.query.business_unit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitUpdateActionQueryBuilderDsl {
    public BusinessUnitUpdateActionQueryBuilderDsl() {
    }

    public static BusinessUnitUpdateActionQueryBuilderDsl of() {
        return new BusinessUnitUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitUpdateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitUpdateActionQueryBuilderDsl> asAddAddress(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitAddAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitAddAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.business_unit.BusinessUnitAddAddressActionQueryBuilderDsl.of()),
            BusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitUpdateActionQueryBuilderDsl> asAddAssociate(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitAddAssociateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitAddAssociateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.business_unit.BusinessUnitAddAssociateActionQueryBuilderDsl.of()),
            BusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitUpdateActionQueryBuilderDsl> asAddBillingAddressId(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitAddBillingAddressIdActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitAddBillingAddressIdActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.business_unit.BusinessUnitAddBillingAddressIdActionQueryBuilderDsl
                    .of()),
            BusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitUpdateActionQueryBuilderDsl> asAddCustomerGroupAssignment(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitAddCustomerGroupAssignmentActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitAddCustomerGroupAssignmentActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.business_unit.BusinessUnitAddCustomerGroupAssignmentActionQueryBuilderDsl
                    .of()),
            BusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitUpdateActionQueryBuilderDsl> asAddShippingAddressId(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitAddShippingAddressIdActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitAddShippingAddressIdActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.business_unit.BusinessUnitAddShippingAddressIdActionQueryBuilderDsl
                    .of()),
            BusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitUpdateActionQueryBuilderDsl> asAddStore(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitAddStoreActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitAddStoreActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.business_unit.BusinessUnitAddStoreActionQueryBuilderDsl.of()),
            BusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitUpdateActionQueryBuilderDsl> asChangeAddress(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitChangeAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitChangeAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.business_unit.BusinessUnitChangeAddressActionQueryBuilderDsl.of()),
            BusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitUpdateActionQueryBuilderDsl> asChangeApprovalRuleMode(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitChangeApprovalRuleModeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitChangeApprovalRuleModeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.business_unit.BusinessUnitChangeApprovalRuleModeActionQueryBuilderDsl
                    .of()),
            BusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitUpdateActionQueryBuilderDsl> asChangeAssociate(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitChangeAssociateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitChangeAssociateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.business_unit.BusinessUnitChangeAssociateActionQueryBuilderDsl.of()),
            BusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitUpdateActionQueryBuilderDsl> asChangeAssociateMode(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitChangeAssociateModeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitChangeAssociateModeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.business_unit.BusinessUnitChangeAssociateModeActionQueryBuilderDsl
                    .of()),
            BusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitUpdateActionQueryBuilderDsl> asChangeName(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitChangeNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitChangeNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.business_unit.BusinessUnitChangeNameActionQueryBuilderDsl.of()),
            BusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitUpdateActionQueryBuilderDsl> asChangeParentUnit(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitChangeParentUnitActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitChangeParentUnitActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.business_unit.BusinessUnitChangeParentUnitActionQueryBuilderDsl
                    .of()),
            BusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitUpdateActionQueryBuilderDsl> asChangeStatus(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitChangeStatusActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitChangeStatusActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.business_unit.BusinessUnitChangeStatusActionQueryBuilderDsl.of()),
            BusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitUpdateActionQueryBuilderDsl> asRemoveAddress(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitRemoveAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitRemoveAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.business_unit.BusinessUnitRemoveAddressActionQueryBuilderDsl.of()),
            BusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitUpdateActionQueryBuilderDsl> asRemoveAssociate(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitRemoveAssociateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitRemoveAssociateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.business_unit.BusinessUnitRemoveAssociateActionQueryBuilderDsl.of()),
            BusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitUpdateActionQueryBuilderDsl> asRemoveBillingAddressId(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitRemoveBillingAddressIdActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitRemoveBillingAddressIdActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.business_unit.BusinessUnitRemoveBillingAddressIdActionQueryBuilderDsl
                    .of()),
            BusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitUpdateActionQueryBuilderDsl> asRemoveCustomerGroupAssignment(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitRemoveCustomerGroupAssignmentActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitRemoveCustomerGroupAssignmentActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.business_unit.BusinessUnitRemoveCustomerGroupAssignmentActionQueryBuilderDsl
                    .of()),
            BusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitUpdateActionQueryBuilderDsl> asRemoveShippingAddressId(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitRemoveShippingAddressIdActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitRemoveShippingAddressIdActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.business_unit.BusinessUnitRemoveShippingAddressIdActionQueryBuilderDsl
                    .of()),
            BusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitUpdateActionQueryBuilderDsl> asRemoveStore(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitRemoveStoreActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitRemoveStoreActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.business_unit.BusinessUnitRemoveStoreActionQueryBuilderDsl.of()),
            BusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitUpdateActionQueryBuilderDsl> asSetAddressCustomField(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitSetAddressCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitSetAddressCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.business_unit.BusinessUnitSetAddressCustomFieldActionQueryBuilderDsl
                    .of()),
            BusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitUpdateActionQueryBuilderDsl> asSetAddressCustomType(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitSetAddressCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitSetAddressCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.business_unit.BusinessUnitSetAddressCustomTypeActionQueryBuilderDsl
                    .of()),
            BusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitUpdateActionQueryBuilderDsl> asSetAssociates(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitSetAssociatesActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitSetAssociatesActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.business_unit.BusinessUnitSetAssociatesActionQueryBuilderDsl.of()),
            BusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitUpdateActionQueryBuilderDsl> asSetContactEmail(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitSetContactEmailActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitSetContactEmailActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.business_unit.BusinessUnitSetContactEmailActionQueryBuilderDsl.of()),
            BusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitUpdateActionQueryBuilderDsl> asSetCustomField(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitSetCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitSetCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.business_unit.BusinessUnitSetCustomFieldActionQueryBuilderDsl.of()),
            BusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitUpdateActionQueryBuilderDsl> asSetCustomType(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitSetCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitSetCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.business_unit.BusinessUnitSetCustomTypeActionQueryBuilderDsl.of()),
            BusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitUpdateActionQueryBuilderDsl> asSetCustomerGroupAssignments(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitSetCustomerGroupAssignmentsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitSetCustomerGroupAssignmentsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.business_unit.BusinessUnitSetCustomerGroupAssignmentsActionQueryBuilderDsl
                    .of()),
            BusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitUpdateActionQueryBuilderDsl> asSetDefaultBillingAddress(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitSetDefaultBillingAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitSetDefaultBillingAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.business_unit.BusinessUnitSetDefaultBillingAddressActionQueryBuilderDsl
                    .of()),
            BusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitUpdateActionQueryBuilderDsl> asSetDefaultShippingAddress(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitSetDefaultShippingAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitSetDefaultShippingAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.business_unit.BusinessUnitSetDefaultShippingAddressActionQueryBuilderDsl
                    .of()),
            BusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitUpdateActionQueryBuilderDsl> asSetStoreMode(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitSetStoreModeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitSetStoreModeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.business_unit.BusinessUnitSetStoreModeActionQueryBuilderDsl.of()),
            BusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitUpdateActionQueryBuilderDsl> asSetStores(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitSetStoresActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitSetStoresActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.business_unit.BusinessUnitSetStoresActionQueryBuilderDsl.of()),
            BusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitUpdateActionQueryBuilderDsl> asSetUnitType(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitSetUnitTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitSetUnitTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.business_unit.BusinessUnitSetUnitTypeActionQueryBuilderDsl.of()),
            BusinessUnitUpdateActionQueryBuilderDsl::of);
    }
}
