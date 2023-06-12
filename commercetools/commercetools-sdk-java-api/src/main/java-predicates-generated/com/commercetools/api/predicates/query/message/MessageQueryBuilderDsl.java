
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MessageQueryBuilderDsl {
    public MessageQueryBuilderDsl() {
    }

    public static MessageQueryBuilderDsl of() {
        return new MessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, MessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<MessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, MessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<MessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, MessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<MessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, MessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            MessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<MessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, MessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            MessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<MessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, MessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, MessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asAssociateRoleBuyerAssignableChanged(
            Function<com.commercetools.api.predicates.query.message.AssociateRoleBuyerAssignableChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.AssociateRoleBuyerAssignableChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.AssociateRoleBuyerAssignableChangedMessageQueryBuilderDsl
                    .of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asAssociateRoleCreated(
            Function<com.commercetools.api.predicates.query.message.AssociateRoleCreatedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.AssociateRoleCreatedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.AssociateRoleCreatedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asAssociateRoleDeleted(
            Function<com.commercetools.api.predicates.query.message.AssociateRoleDeletedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.AssociateRoleDeletedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.AssociateRoleDeletedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asAssociateRoleNameSet(
            Function<com.commercetools.api.predicates.query.message.AssociateRoleNameChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.AssociateRoleNameChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.AssociateRoleNameChangedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asAssociateRolePermissionAdded(
            Function<com.commercetools.api.predicates.query.message.AssociateRolePermissionAddedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.AssociateRolePermissionAddedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.AssociateRolePermissionAddedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asAssociateRolePermissionRemoved(
            Function<com.commercetools.api.predicates.query.message.AssociateRolePermissionRemovedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.AssociateRolePermissionRemovedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.AssociateRolePermissionRemovedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asAssociateRolePermissionsSet(
            Function<com.commercetools.api.predicates.query.message.AssociateRolePermissionsSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.AssociateRolePermissionsSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.AssociateRolePermissionsSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asBusinessUnitAddressAdded(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitAddressAddedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitAddressAddedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.BusinessUnitAddressAddedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asBusinessUnitAddressChanged(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitAddressChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitAddressChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.BusinessUnitAddressChangedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asBusinessUnitAddressRemoved(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitAddressRemovedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitAddressRemovedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.BusinessUnitAddressRemovedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asBusinessUnitAssociateAdded(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitAssociateAddedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitAssociateAddedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.BusinessUnitAssociateAddedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asBusinessUnitAssociateChanged(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitAssociateChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitAssociateChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.BusinessUnitAssociateChangedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asBusinessUnitAssociateModeChanged(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitAssociateModeChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitAssociateModeChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitAssociateModeChangedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asBusinessUnitAssociateRemoved(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitAssociateRemovedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitAssociateRemovedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.BusinessUnitAssociateRemovedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asBusinessUnitAssociatesSet(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitAssociatesSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitAssociatesSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.BusinessUnitAssociatesSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asBusinessUnitBillingAddressAdded(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitBillingAddressAddedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitBillingAddressAddedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitBillingAddressAddedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asBusinessUnitBillingAddressRemoved(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitBillingAddressRemovedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitBillingAddressRemovedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitBillingAddressRemovedMessageQueryBuilderDsl
                    .of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asBusinessUnitContactEmailSet(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitContactEmailSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitContactEmailSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.BusinessUnitContactEmailSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asBusinessUnitCreated(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitCreatedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitCreatedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.BusinessUnitCreatedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asBusinessUnitDefaultBillingAddressSet(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitDefaultBillingAddressSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitDefaultBillingAddressSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitDefaultBillingAddressSetMessageQueryBuilderDsl
                    .of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asBusinessUnitDefaultShippingAddressSet(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitDefaultShippingAddressSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitDefaultShippingAddressSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitDefaultShippingAddressSetMessageQueryBuilderDsl
                    .of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asBusinessUnitDeleted(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitDeletedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitDeletedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.BusinessUnitDeletedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asBusinessUnitNameChanged(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitNameChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitNameChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.BusinessUnitNameChangedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asBusinessUnitParentUnitChanged(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitParentUnitChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitParentUnitChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitParentUnitChangedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asBusinessUnitShippingAddressAdded(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitShippingAddressAddedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitShippingAddressAddedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitShippingAddressAddedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asBusinessUnitShippingAddressRemoved(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitShippingAddressRemovedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitShippingAddressRemovedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitShippingAddressRemovedMessageQueryBuilderDsl
                    .of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asBusinessUnitStatusChanged(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitStatusChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitStatusChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.BusinessUnitStatusChangedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asBusinessUnitStoreAdded(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitStoreAddedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitStoreAddedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.BusinessUnitStoreAddedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asBusinessUnitStoreModeChanged(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitStoreModeChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitStoreModeChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.BusinessUnitStoreModeChangedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asBusinessUnitStoreRemoved(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitStoreRemovedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitStoreRemovedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.BusinessUnitStoreRemovedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asBusinessUnitStoresSet(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitStoresSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitStoresSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.BusinessUnitStoresSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCategoryCreated(
            Function<com.commercetools.api.predicates.query.message.CategoryCreatedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CategoryCreatedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.CategoryCreatedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCategorySlugChanged(
            Function<com.commercetools.api.predicates.query.message.CategorySlugChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CategorySlugChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.CategorySlugChangedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCustomerAddressAdded(
            Function<com.commercetools.api.predicates.query.message.CustomerAddressAddedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerAddressAddedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.CustomerAddressAddedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCustomerAddressChanged(
            Function<com.commercetools.api.predicates.query.message.CustomerAddressChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerAddressChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.CustomerAddressChangedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCustomerAddressRemoved(
            Function<com.commercetools.api.predicates.query.message.CustomerAddressRemovedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerAddressRemovedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.CustomerAddressRemovedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCustomerCompanyNameSet(
            Function<com.commercetools.api.predicates.query.message.CustomerCompanyNameSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerCompanyNameSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.CustomerCompanyNameSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCustomerCreated(
            Function<com.commercetools.api.predicates.query.message.CustomerCreatedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerCreatedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.CustomerCreatedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCustomerDateOfBirthSet(
            Function<com.commercetools.api.predicates.query.message.CustomerDateOfBirthSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerDateOfBirthSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.CustomerDateOfBirthSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCustomerDeleted(
            Function<com.commercetools.api.predicates.query.message.CustomerDeletedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerDeletedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.CustomerDeletedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCustomerEmailChanged(
            Function<com.commercetools.api.predicates.query.message.CustomerEmailChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerEmailChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.CustomerEmailChangedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCustomerEmailVerified(
            Function<com.commercetools.api.predicates.query.message.CustomerEmailVerifiedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerEmailVerifiedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.CustomerEmailVerifiedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCustomerFirstNameSet(
            Function<com.commercetools.api.predicates.query.message.CustomerFirstNameSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerFirstNameSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.CustomerFirstNameSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCustomerGroupSet(
            Function<com.commercetools.api.predicates.query.message.CustomerGroupSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerGroupSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.CustomerGroupSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCustomerLastNameSet(
            Function<com.commercetools.api.predicates.query.message.CustomerLastNameSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerLastNameSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.CustomerLastNameSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCustomerPasswordUpdated(
            Function<com.commercetools.api.predicates.query.message.CustomerPasswordUpdatedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerPasswordUpdatedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.CustomerPasswordUpdatedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCustomerTitleSet(
            Function<com.commercetools.api.predicates.query.message.CustomerTitleSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerTitleSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.CustomerTitleSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asInventoryEntryCreated(
            Function<com.commercetools.api.predicates.query.message.InventoryEntryCreatedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.InventoryEntryCreatedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.InventoryEntryCreatedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asInventoryEntryDeleted(
            Function<com.commercetools.api.predicates.query.message.InventoryEntryDeletedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.InventoryEntryDeletedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.InventoryEntryDeletedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asInventoryEntryQuantitySet(
            Function<com.commercetools.api.predicates.query.message.InventoryEntryQuantitySetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.InventoryEntryQuantitySetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.InventoryEntryQuantitySetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asOrderMessage(
            Function<com.commercetools.api.predicates.query.message.OrderMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.OrderMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asOrderPaymentAdded(
            Function<com.commercetools.api.predicates.query.message.OrderPaymentAddedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.OrderPaymentAddedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.OrderPaymentAddedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asPaymentCreated(
            Function<com.commercetools.api.predicates.query.message.PaymentCreatedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentCreatedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.PaymentCreatedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asPaymentInteractionAdded(
            Function<com.commercetools.api.predicates.query.message.PaymentInteractionAddedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentInteractionAddedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.PaymentInteractionAddedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asPaymentStatusInterfaceCodeSet(
            Function<com.commercetools.api.predicates.query.message.PaymentStatusInterfaceCodeSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentStatusInterfaceCodeSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentStatusInterfaceCodeSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asPaymentStatusStateTransition(
            Function<com.commercetools.api.predicates.query.message.PaymentStatusStateTransitionMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentStatusStateTransitionMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.PaymentStatusStateTransitionMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asPaymentTransactionAdded(
            Function<com.commercetools.api.predicates.query.message.PaymentTransactionAddedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentTransactionAddedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.PaymentTransactionAddedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asPaymentTransactionStateChanged(
            Function<com.commercetools.api.predicates.query.message.PaymentTransactionStateChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentTransactionStateChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentTransactionStateChangedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductAddedToCategory(
            Function<com.commercetools.api.predicates.query.message.ProductAddedToCategoryMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductAddedToCategoryMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ProductAddedToCategoryMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductCreated(
            Function<com.commercetools.api.predicates.query.message.ProductCreatedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductCreatedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ProductCreatedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductDeleted(
            Function<com.commercetools.api.predicates.query.message.ProductDeletedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductDeletedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ProductDeletedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductImageAdded(
            Function<com.commercetools.api.predicates.query.message.ProductImageAddedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductImageAddedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ProductImageAddedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductPriceAdded(
            Function<com.commercetools.api.predicates.query.message.ProductPriceAddedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductPriceAddedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ProductPriceAddedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductPriceChanged(
            Function<com.commercetools.api.predicates.query.message.ProductPriceChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductPriceChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ProductPriceChangedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductPriceDiscountsSet(
            Function<com.commercetools.api.predicates.query.message.ProductPriceDiscountsSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductPriceDiscountsSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ProductPriceDiscountsSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductPriceExternalDiscountSet(
            Function<com.commercetools.api.predicates.query.message.ProductPriceExternalDiscountSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductPriceExternalDiscountSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ProductPriceExternalDiscountSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductPriceKeySet(
            Function<com.commercetools.api.predicates.query.message.ProductPriceKeySetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductPriceKeySetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ProductPriceKeySetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductPriceModeSet(
            Function<com.commercetools.api.predicates.query.message.ProductPriceModeSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductPriceModeSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ProductPriceModeSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductPriceRemoved(
            Function<com.commercetools.api.predicates.query.message.ProductPriceRemovedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductPriceRemovedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ProductPriceRemovedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductPricesSet(
            Function<com.commercetools.api.predicates.query.message.ProductPricesSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductPricesSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ProductPricesSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductPublished(
            Function<com.commercetools.api.predicates.query.message.ProductPublishedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductPublishedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ProductPublishedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductRemovedFromCategory(
            Function<com.commercetools.api.predicates.query.message.ProductRemovedFromCategoryMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductRemovedFromCategoryMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ProductRemovedFromCategoryMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductRevertedStagedChanges(
            Function<com.commercetools.api.predicates.query.message.ProductRevertedStagedChangesMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductRevertedStagedChangesMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ProductRevertedStagedChangesMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductSelectionCreated(
            Function<com.commercetools.api.predicates.query.message.ProductSelectionCreatedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductSelectionCreatedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ProductSelectionCreatedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductSelectionDeleted(
            Function<com.commercetools.api.predicates.query.message.ProductSelectionDeletedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductSelectionDeletedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ProductSelectionDeletedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductSelectionProductAdded(
            Function<com.commercetools.api.predicates.query.message.ProductSelectionProductAddedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductSelectionProductAddedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ProductSelectionProductAddedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductSelectionProductExcluded(
            Function<com.commercetools.api.predicates.query.message.ProductSelectionProductExcludedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductSelectionProductExcludedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ProductSelectionProductExcludedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductSelectionProductRemoved(
            Function<com.commercetools.api.predicates.query.message.ProductSelectionProductRemovedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductSelectionProductRemovedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ProductSelectionProductRemovedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductSelectionVariantExclusionChanged(
            Function<com.commercetools.api.predicates.query.message.ProductSelectionVariantExclusionChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductSelectionVariantExclusionChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ProductSelectionVariantExclusionChangedMessageQueryBuilderDsl
                    .of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductSelectionVariantSelectionChanged(
            Function<com.commercetools.api.predicates.query.message.ProductSelectionVariantSelectionChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductSelectionVariantSelectionChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ProductSelectionVariantSelectionChangedMessageQueryBuilderDsl
                    .of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductSlugChanged(
            Function<com.commercetools.api.predicates.query.message.ProductSlugChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductSlugChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ProductSlugChangedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductStateTransition(
            Function<com.commercetools.api.predicates.query.message.ProductStateTransitionMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductStateTransitionMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ProductStateTransitionMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductUnpublished(
            Function<com.commercetools.api.predicates.query.message.ProductUnpublishedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductUnpublishedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ProductUnpublishedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductVariantAdded(
            Function<com.commercetools.api.predicates.query.message.ProductVariantAddedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductVariantAddedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ProductVariantAddedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductVariantDeleted(
            Function<com.commercetools.api.predicates.query.message.ProductVariantDeletedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductVariantDeletedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ProductVariantDeletedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asQuoteCreated(
            Function<com.commercetools.api.predicates.query.message.QuoteCreatedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.QuoteCreatedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.QuoteCreatedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asQuoteCustomerChanged(
            Function<com.commercetools.api.predicates.query.message.QuoteCustomerChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.QuoteCustomerChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.QuoteCustomerChangedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asQuoteDeleted(
            Function<com.commercetools.api.predicates.query.message.QuoteDeletedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.QuoteDeletedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.QuoteDeletedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asQuoteRequestCreated(
            Function<com.commercetools.api.predicates.query.message.QuoteRequestCreatedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.QuoteRequestCreatedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.QuoteRequestCreatedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asQuoteRequestCustomerChanged(
            Function<com.commercetools.api.predicates.query.message.QuoteRequestCustomerChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.QuoteRequestCustomerChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.QuoteRequestCustomerChangedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asQuoteRequestDeleted(
            Function<com.commercetools.api.predicates.query.message.QuoteRequestDeletedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.QuoteRequestDeletedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.QuoteRequestDeletedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asQuoteRequestStateChanged(
            Function<com.commercetools.api.predicates.query.message.QuoteRequestStateChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.QuoteRequestStateChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.QuoteRequestStateChangedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asQuoteRequestStateTransition(
            Function<com.commercetools.api.predicates.query.message.QuoteRequestStateTransitionMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.QuoteRequestStateTransitionMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.QuoteRequestStateTransitionMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asQuoteStateChanged(
            Function<com.commercetools.api.predicates.query.message.QuoteStateChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.QuoteStateChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.QuoteStateChangedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asQuoteStateTransition(
            Function<com.commercetools.api.predicates.query.message.QuoteStateTransitionMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.QuoteStateTransitionMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.QuoteStateTransitionMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asReviewCreated(
            Function<com.commercetools.api.predicates.query.message.ReviewCreatedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ReviewCreatedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ReviewCreatedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asReviewRatingSet(
            Function<com.commercetools.api.predicates.query.message.ReviewRatingSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ReviewRatingSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ReviewRatingSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asReviewStateTransition(
            Function<com.commercetools.api.predicates.query.message.ReviewStateTransitionMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ReviewStateTransitionMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ReviewStateTransitionMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asStagedQuoteCreated(
            Function<com.commercetools.api.predicates.query.message.StagedQuoteCreatedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StagedQuoteCreatedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.StagedQuoteCreatedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asStagedQuoteDeleted(
            Function<com.commercetools.api.predicates.query.message.StagedQuoteDeletedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StagedQuoteDeletedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.StagedQuoteDeletedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asStagedQuoteSellerCommentSet(
            Function<com.commercetools.api.predicates.query.message.StagedQuoteSellerCommentSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StagedQuoteSellerCommentSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.StagedQuoteSellerCommentSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asStagedQuoteStateChanged(
            Function<com.commercetools.api.predicates.query.message.StagedQuoteStateChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StagedQuoteStateChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.StagedQuoteStateChangedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asStagedQuoteStateTransition(
            Function<com.commercetools.api.predicates.query.message.StagedQuoteStateTransitionMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StagedQuoteStateTransitionMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.StagedQuoteStateTransitionMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asStagedQuoteValidToSet(
            Function<com.commercetools.api.predicates.query.message.StagedQuoteValidToSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StagedQuoteValidToSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.StagedQuoteValidToSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asStandalonePriceActiveChanged(
            Function<com.commercetools.api.predicates.query.message.StandalonePriceActiveChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StandalonePriceActiveChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.StandalonePriceActiveChangedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asStandalonePriceCreated(
            Function<com.commercetools.api.predicates.query.message.StandalonePriceCreatedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StandalonePriceCreatedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.StandalonePriceCreatedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asStandalonePriceDeleted(
            Function<com.commercetools.api.predicates.query.message.StandalonePriceDeletedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StandalonePriceDeletedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.StandalonePriceDeletedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asStandalonePriceDiscountSet(
            Function<com.commercetools.api.predicates.query.message.StandalonePriceDiscountSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StandalonePriceDiscountSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.StandalonePriceDiscountSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asStandalonePriceExternalDiscountSet(
            Function<com.commercetools.api.predicates.query.message.StandalonePriceExternalDiscountSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StandalonePriceExternalDiscountSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.StandalonePriceExternalDiscountSetMessageQueryBuilderDsl
                    .of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asStandalonePriceKeySet(
            Function<com.commercetools.api.predicates.query.message.StandalonePriceKeySetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StandalonePriceKeySetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.StandalonePriceKeySetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asStandalonePriceStagedChangesApplied(
            Function<com.commercetools.api.predicates.query.message.StandalonePriceStagedChangesAppliedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StandalonePriceStagedChangesAppliedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.StandalonePriceStagedChangesAppliedMessageQueryBuilderDsl
                    .of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asStandalonePriceValidFromAndUntilSet(
            Function<com.commercetools.api.predicates.query.message.StandalonePriceValidFromAndUntilSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StandalonePriceValidFromAndUntilSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.StandalonePriceValidFromAndUntilSetMessageQueryBuilderDsl
                    .of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asStandalonePriceValidFromSet(
            Function<com.commercetools.api.predicates.query.message.StandalonePriceValidFromSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StandalonePriceValidFromSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.StandalonePriceValidFromSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asStandalonePriceValidUntilSet(
            Function<com.commercetools.api.predicates.query.message.StandalonePriceValidUntilSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StandalonePriceValidUntilSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.StandalonePriceValidUntilSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asStandalonePriceValueChanged(
            Function<com.commercetools.api.predicates.query.message.StandalonePriceValueChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StandalonePriceValueChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.StandalonePriceValueChangedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asStoreCountriesChanged(
            Function<com.commercetools.api.predicates.query.message.StoreCountriesChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StoreCountriesChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.StoreCountriesChangedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asStoreCreated(
            Function<com.commercetools.api.predicates.query.message.StoreCreatedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StoreCreatedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.StoreCreatedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asStoreDeleted(
            Function<com.commercetools.api.predicates.query.message.StoreDeletedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StoreDeletedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.StoreDeletedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asStoreDistributionChannelsChanged(
            Function<com.commercetools.api.predicates.query.message.StoreDistributionChannelsChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StoreDistributionChannelsChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.StoreDistributionChannelsChangedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asStoreLanguagesChanged(
            Function<com.commercetools.api.predicates.query.message.StoreLanguagesChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StoreLanguagesChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.StoreLanguagesChangedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asStoreNameSet(
            Function<com.commercetools.api.predicates.query.message.StoreNameSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StoreNameSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.StoreNameSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asStoreProductSelectionsChanged(
            Function<com.commercetools.api.predicates.query.message.StoreProductSelectionsChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StoreProductSelectionsChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.StoreProductSelectionsChangedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asStoreSupplyChannelsChanged(
            Function<com.commercetools.api.predicates.query.message.StoreSupplyChannelsChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StoreSupplyChannelsChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.StoreSupplyChannelsChangedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }
}
