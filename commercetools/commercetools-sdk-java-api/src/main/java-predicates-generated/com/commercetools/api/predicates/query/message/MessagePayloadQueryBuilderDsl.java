
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MessagePayloadQueryBuilderDsl {
    public MessagePayloadQueryBuilderDsl() {
    }

    public static MessagePayloadQueryBuilderDsl of() {
        return new MessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, MessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asAssociateRoleBuyerAssignableChanged(
            Function<com.commercetools.api.predicates.query.message.AssociateRoleBuyerAssignableChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.AssociateRoleBuyerAssignableChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.AssociateRoleBuyerAssignableChangedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asAssociateRoleCreated(
            Function<com.commercetools.api.predicates.query.message.AssociateRoleCreatedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.AssociateRoleCreatedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.AssociateRoleCreatedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asAssociateRoleDeleted(
            Function<com.commercetools.api.predicates.query.message.AssociateRoleDeletedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.AssociateRoleDeletedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.AssociateRoleDeletedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asAssociateRoleNameSet(
            Function<com.commercetools.api.predicates.query.message.AssociateRoleNameChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.AssociateRoleNameChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.AssociateRoleNameChangedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asAssociateRolePermissionAdded(
            Function<com.commercetools.api.predicates.query.message.AssociateRolePermissionAddedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.AssociateRolePermissionAddedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.AssociateRolePermissionAddedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asAssociateRolePermissionRemoved(
            Function<com.commercetools.api.predicates.query.message.AssociateRolePermissionRemovedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.AssociateRolePermissionRemovedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.AssociateRolePermissionRemovedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asAssociateRolePermissionsSet(
            Function<com.commercetools.api.predicates.query.message.AssociateRolePermissionsSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.AssociateRolePermissionsSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.AssociateRolePermissionsSetMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asBusinessUnitAddressAdded(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitAddressAddedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitAddressAddedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitAddressAddedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asBusinessUnitAddressChanged(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitAddressChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitAddressChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitAddressChangedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asBusinessUnitAddressRemoved(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitAddressRemovedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitAddressRemovedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitAddressRemovedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asBusinessUnitAssociateAdded(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitAssociateAddedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitAssociateAddedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitAssociateAddedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asBusinessUnitAssociateChanged(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitAssociateChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitAssociateChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitAssociateChangedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asBusinessUnitAssociateModeChanged(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitAssociateModeChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitAssociateModeChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitAssociateModeChangedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asBusinessUnitAssociateRemoved(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitAssociateRemovedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitAssociateRemovedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitAssociateRemovedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asBusinessUnitAssociatesSet(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitAssociatesSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitAssociatesSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitAssociatesSetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asBusinessUnitBillingAddressAdded(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitBillingAddressAddedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitBillingAddressAddedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitBillingAddressAddedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asBusinessUnitBillingAddressRemoved(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitBillingAddressRemovedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitBillingAddressRemovedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitBillingAddressRemovedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asBusinessUnitContactEmailSet(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitContactEmailSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitContactEmailSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitContactEmailSetMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asBusinessUnitCreated(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitCreatedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitCreatedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.BusinessUnitCreatedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asBusinessUnitDefaultBillingAddressSet(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitDefaultBillingAddressSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitDefaultBillingAddressSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitDefaultBillingAddressSetMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asBusinessUnitDefaultShippingAddressSet(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitDefaultShippingAddressSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitDefaultShippingAddressSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitDefaultShippingAddressSetMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asBusinessUnitDeleted(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitDeletedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitDeletedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.BusinessUnitDeletedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asBusinessUnitNameChanged(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitNameChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitNameChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitNameChangedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asBusinessUnitParentUnitChanged(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitParentUnitChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitParentUnitChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitParentUnitChangedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asBusinessUnitShippingAddressAdded(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitShippingAddressAddedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitShippingAddressAddedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitShippingAddressAddedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asBusinessUnitShippingAddressRemoved(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitShippingAddressRemovedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitShippingAddressRemovedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitShippingAddressRemovedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asBusinessUnitStatusChanged(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitStatusChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitStatusChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitStatusChangedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asBusinessUnitStoreAdded(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitStoreAddedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitStoreAddedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitStoreAddedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asBusinessUnitStoreModeChanged(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitStoreModeChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitStoreModeChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitStoreModeChangedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asBusinessUnitStoreRemoved(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitStoreRemovedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitStoreRemovedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitStoreRemovedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asBusinessUnitStoresSet(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitStoresSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitStoresSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.BusinessUnitStoresSetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCategoryCreated(
            Function<com.commercetools.api.predicates.query.message.CategoryCreatedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CategoryCreatedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.CategoryCreatedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCategorySlugChanged(
            Function<com.commercetools.api.predicates.query.message.CategorySlugChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CategorySlugChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.CategorySlugChangedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCustomerAddressAdded(
            Function<com.commercetools.api.predicates.query.message.CustomerAddressAddedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerAddressAddedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.CustomerAddressAddedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCustomerAddressChanged(
            Function<com.commercetools.api.predicates.query.message.CustomerAddressChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerAddressChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.CustomerAddressChangedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCustomerAddressRemoved(
            Function<com.commercetools.api.predicates.query.message.CustomerAddressRemovedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerAddressRemovedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.CustomerAddressRemovedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCustomerCompanyNameSet(
            Function<com.commercetools.api.predicates.query.message.CustomerCompanyNameSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerCompanyNameSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.CustomerCompanyNameSetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCustomerCreated(
            Function<com.commercetools.api.predicates.query.message.CustomerCreatedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerCreatedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.CustomerCreatedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCustomerDateOfBirthSet(
            Function<com.commercetools.api.predicates.query.message.CustomerDateOfBirthSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerDateOfBirthSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.CustomerDateOfBirthSetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCustomerDeleted(
            Function<com.commercetools.api.predicates.query.message.CustomerDeletedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerDeletedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.CustomerDeletedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCustomerEmailChanged(
            Function<com.commercetools.api.predicates.query.message.CustomerEmailChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerEmailChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.CustomerEmailChangedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCustomerEmailVerified(
            Function<com.commercetools.api.predicates.query.message.CustomerEmailVerifiedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerEmailVerifiedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.CustomerEmailVerifiedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCustomerFirstNameSet(
            Function<com.commercetools.api.predicates.query.message.CustomerFirstNameSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerFirstNameSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.CustomerFirstNameSetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCustomerGroupSet(
            Function<com.commercetools.api.predicates.query.message.CustomerGroupSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerGroupSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.CustomerGroupSetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCustomerLastNameSet(
            Function<com.commercetools.api.predicates.query.message.CustomerLastNameSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerLastNameSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.CustomerLastNameSetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCustomerPasswordUpdated(
            Function<com.commercetools.api.predicates.query.message.CustomerPasswordUpdatedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerPasswordUpdatedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.CustomerPasswordUpdatedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCustomerTitleSet(
            Function<com.commercetools.api.predicates.query.message.CustomerTitleSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerTitleSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.CustomerTitleSetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asInventoryEntryCreated(
            Function<com.commercetools.api.predicates.query.message.InventoryEntryCreatedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.InventoryEntryCreatedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.InventoryEntryCreatedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asInventoryEntryDeleted(
            Function<com.commercetools.api.predicates.query.message.InventoryEntryDeletedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.InventoryEntryDeletedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.InventoryEntryDeletedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asInventoryEntryQuantitySet(
            Function<com.commercetools.api.predicates.query.message.InventoryEntryQuantitySetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.InventoryEntryQuantitySetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.InventoryEntryQuantitySetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asOrderMessagePayload(
            Function<com.commercetools.api.predicates.query.message.OrderMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.OrderMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asOrderPaymentAdded(
            Function<com.commercetools.api.predicates.query.message.OrderPaymentAddedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderPaymentAddedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.OrderPaymentAddedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asPaymentCreated(
            Function<com.commercetools.api.predicates.query.message.PaymentCreatedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentCreatedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.PaymentCreatedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asPaymentInteractionAdded(
            Function<com.commercetools.api.predicates.query.message.PaymentInteractionAddedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentInteractionAddedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentInteractionAddedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asPaymentStatusInterfaceCodeSet(
            Function<com.commercetools.api.predicates.query.message.PaymentStatusInterfaceCodeSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentStatusInterfaceCodeSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentStatusInterfaceCodeSetMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asPaymentStatusStateTransition(
            Function<com.commercetools.api.predicates.query.message.PaymentStatusStateTransitionMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentStatusStateTransitionMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentStatusStateTransitionMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asPaymentTransactionAdded(
            Function<com.commercetools.api.predicates.query.message.PaymentTransactionAddedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentTransactionAddedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentTransactionAddedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asPaymentTransactionStateChanged(
            Function<com.commercetools.api.predicates.query.message.PaymentTransactionStateChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentTransactionStateChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentTransactionStateChangedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductAddedToCategory(
            Function<com.commercetools.api.predicates.query.message.ProductAddedToCategoryMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductAddedToCategoryMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ProductAddedToCategoryMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductCreated(
            Function<com.commercetools.api.predicates.query.message.ProductCreatedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductCreatedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ProductCreatedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductDeleted(
            Function<com.commercetools.api.predicates.query.message.ProductDeletedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductDeletedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ProductDeletedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductImageAdded(
            Function<com.commercetools.api.predicates.query.message.ProductImageAddedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductImageAddedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ProductImageAddedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductPriceAdded(
            Function<com.commercetools.api.predicates.query.message.ProductPriceAddedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductPriceAddedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ProductPriceAddedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductPriceChanged(
            Function<com.commercetools.api.predicates.query.message.ProductPriceChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductPriceChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ProductPriceChangedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductPriceDiscountsSet(
            Function<com.commercetools.api.predicates.query.message.ProductPriceDiscountsSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductPriceDiscountsSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ProductPriceDiscountsSetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductPriceExternalDiscountSet(
            Function<com.commercetools.api.predicates.query.message.ProductPriceExternalDiscountSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductPriceExternalDiscountSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ProductPriceExternalDiscountSetMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductPriceKeySet(
            Function<com.commercetools.api.predicates.query.message.ProductPriceKeySetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductPriceKeySetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ProductPriceKeySetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductPriceModeSet(
            Function<com.commercetools.api.predicates.query.message.ProductPriceModeSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductPriceModeSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ProductPriceModeSetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductPriceRemoved(
            Function<com.commercetools.api.predicates.query.message.ProductPriceRemovedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductPriceRemovedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ProductPriceRemovedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductPricesSet(
            Function<com.commercetools.api.predicates.query.message.ProductPricesSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductPricesSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ProductPricesSetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductPublished(
            Function<com.commercetools.api.predicates.query.message.ProductPublishedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductPublishedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ProductPublishedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductRemovedFromCategory(
            Function<com.commercetools.api.predicates.query.message.ProductRemovedFromCategoryMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductRemovedFromCategoryMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ProductRemovedFromCategoryMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductRevertedStagedChanges(
            Function<com.commercetools.api.predicates.query.message.ProductRevertedStagedChangesMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductRevertedStagedChangesMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ProductRevertedStagedChangesMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductSelectionCreated(
            Function<com.commercetools.api.predicates.query.message.ProductSelectionCreatedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductSelectionCreatedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ProductSelectionCreatedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductSelectionDeleted(
            Function<com.commercetools.api.predicates.query.message.ProductSelectionDeletedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductSelectionDeletedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ProductSelectionDeletedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductSelectionProductAdded(
            Function<com.commercetools.api.predicates.query.message.ProductSelectionProductAddedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductSelectionProductAddedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ProductSelectionProductAddedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductSelectionProductExcluded(
            Function<com.commercetools.api.predicates.query.message.ProductSelectionProductExcludedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductSelectionProductExcludedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ProductSelectionProductExcludedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductSelectionProductRemoved(
            Function<com.commercetools.api.predicates.query.message.ProductSelectionProductRemovedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductSelectionProductRemovedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ProductSelectionProductRemovedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductSelectionVariantExclusionChanged(
            Function<com.commercetools.api.predicates.query.message.ProductSelectionVariantExclusionChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductSelectionVariantExclusionChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ProductSelectionVariantExclusionChangedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductSelectionVariantSelectionChanged(
            Function<com.commercetools.api.predicates.query.message.ProductSelectionVariantSelectionChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductSelectionVariantSelectionChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ProductSelectionVariantSelectionChangedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductSlugChanged(
            Function<com.commercetools.api.predicates.query.message.ProductSlugChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductSlugChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ProductSlugChangedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductStateTransition(
            Function<com.commercetools.api.predicates.query.message.ProductStateTransitionMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductStateTransitionMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ProductStateTransitionMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductUnpublished(
            Function<com.commercetools.api.predicates.query.message.ProductUnpublishedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductUnpublishedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ProductUnpublishedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductVariantAdded(
            Function<com.commercetools.api.predicates.query.message.ProductVariantAddedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductVariantAddedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ProductVariantAddedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductVariantDeleted(
            Function<com.commercetools.api.predicates.query.message.ProductVariantDeletedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductVariantDeletedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ProductVariantDeletedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asQuoteCreated(
            Function<com.commercetools.api.predicates.query.message.QuoteCreatedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.QuoteCreatedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.QuoteCreatedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asQuoteDeleted(
            Function<com.commercetools.api.predicates.query.message.QuoteDeletedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.QuoteDeletedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.QuoteDeletedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asQuoteRequestCreated(
            Function<com.commercetools.api.predicates.query.message.QuoteRequestCreatedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.QuoteRequestCreatedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.QuoteRequestCreatedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asQuoteRequestDeleted(
            Function<com.commercetools.api.predicates.query.message.QuoteRequestDeletedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.QuoteRequestDeletedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.QuoteRequestDeletedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asQuoteRequestStateChanged(
            Function<com.commercetools.api.predicates.query.message.QuoteRequestStateChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.QuoteRequestStateChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.QuoteRequestStateChangedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asQuoteRequestStateTransition(
            Function<com.commercetools.api.predicates.query.message.QuoteRequestStateTransitionMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.QuoteRequestStateTransitionMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.QuoteRequestStateTransitionMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asQuoteStateChanged(
            Function<com.commercetools.api.predicates.query.message.QuoteStateChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.QuoteStateChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.QuoteStateChangedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asQuoteStateTransition(
            Function<com.commercetools.api.predicates.query.message.QuoteStateTransitionMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.QuoteStateTransitionMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.QuoteStateTransitionMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asReviewCreated(
            Function<com.commercetools.api.predicates.query.message.ReviewCreatedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ReviewCreatedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ReviewCreatedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asReviewRatingSet(
            Function<com.commercetools.api.predicates.query.message.ReviewRatingSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ReviewRatingSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ReviewRatingSetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asReviewStateTransition(
            Function<com.commercetools.api.predicates.query.message.ReviewStateTransitionMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ReviewStateTransitionMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ReviewStateTransitionMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asShoppingListStoreSet(
            Function<com.commercetools.api.predicates.query.message.ShoppingListStoreSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ShoppingListStoreSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ShoppingListStoreSetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asStagedQuoteCreated(
            Function<com.commercetools.api.predicates.query.message.StagedQuoteCreatedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StagedQuoteCreatedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.StagedQuoteCreatedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asStagedQuoteDeleted(
            Function<com.commercetools.api.predicates.query.message.StagedQuoteDeletedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StagedQuoteDeletedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.StagedQuoteDeletedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asStagedQuoteSellerCommentSet(
            Function<com.commercetools.api.predicates.query.message.StagedQuoteSellerCommentSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StagedQuoteSellerCommentSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.StagedQuoteSellerCommentSetMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asStagedQuoteStateChanged(
            Function<com.commercetools.api.predicates.query.message.StagedQuoteStateChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StagedQuoteStateChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.StagedQuoteStateChangedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asStagedQuoteStateTransition(
            Function<com.commercetools.api.predicates.query.message.StagedQuoteStateTransitionMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StagedQuoteStateTransitionMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.StagedQuoteStateTransitionMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asStagedQuoteValidToSet(
            Function<com.commercetools.api.predicates.query.message.StagedQuoteValidToSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StagedQuoteValidToSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.StagedQuoteValidToSetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asStandalonePriceActiveChanged(
            Function<com.commercetools.api.predicates.query.message.StandalonePriceActiveChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StandalonePriceActiveChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.StandalonePriceActiveChangedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asStandalonePriceCreated(
            Function<com.commercetools.api.predicates.query.message.StandalonePriceCreatedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StandalonePriceCreatedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.StandalonePriceCreatedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asStandalonePriceDeleted(
            Function<com.commercetools.api.predicates.query.message.StandalonePriceDeletedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StandalonePriceDeletedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.StandalonePriceDeletedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asStandalonePriceDiscountSet(
            Function<com.commercetools.api.predicates.query.message.StandalonePriceDiscountSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StandalonePriceDiscountSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.StandalonePriceDiscountSetMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asStandalonePriceExternalDiscountSet(
            Function<com.commercetools.api.predicates.query.message.StandalonePriceExternalDiscountSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StandalonePriceExternalDiscountSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.StandalonePriceExternalDiscountSetMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asStandalonePriceKeySet(
            Function<com.commercetools.api.predicates.query.message.StandalonePriceKeySetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StandalonePriceKeySetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.StandalonePriceKeySetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asStandalonePriceStagedChangesApplied(
            Function<com.commercetools.api.predicates.query.message.StandalonePriceStagedChangesAppliedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StandalonePriceStagedChangesAppliedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.StandalonePriceStagedChangesAppliedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asStandalonePriceValueChanged(
            Function<com.commercetools.api.predicates.query.message.StandalonePriceValueChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StandalonePriceValueChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.StandalonePriceValueChangedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asStoreCountriesChanged(
            Function<com.commercetools.api.predicates.query.message.StoreCountriesChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StoreCountriesChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.StoreCountriesChangedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asStoreCreated(
            Function<com.commercetools.api.predicates.query.message.StoreCreatedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StoreCreatedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.StoreCreatedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asStoreDeleted(
            Function<com.commercetools.api.predicates.query.message.StoreDeletedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StoreDeletedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.StoreDeletedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asStoreDistributionChannelsChanged(
            Function<com.commercetools.api.predicates.query.message.StoreDistributionChannelsChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StoreDistributionChannelsChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.StoreDistributionChannelsChangedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asStoreLanguagesChanged(
            Function<com.commercetools.api.predicates.query.message.StoreLanguagesChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StoreLanguagesChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.StoreLanguagesChangedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asStoreNameSet(
            Function<com.commercetools.api.predicates.query.message.StoreNameSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StoreNameSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.StoreNameSetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asStoreProductSelectionsChanged(
            Function<com.commercetools.api.predicates.query.message.StoreProductSelectionsChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StoreProductSelectionsChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.StoreProductSelectionsChangedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asStoreSupplyChannelsChanged(
            Function<com.commercetools.api.predicates.query.message.StoreSupplyChannelsChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StoreSupplyChannelsChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.StoreSupplyChannelsChangedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }
}
