
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

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asApprovalFlowApproved(
            Function<com.commercetools.api.predicates.query.message.ApprovalFlowApprovedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ApprovalFlowApprovedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ApprovalFlowApprovedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asApprovalFlowCompleted(
            Function<com.commercetools.api.predicates.query.message.ApprovalFlowCompletedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ApprovalFlowCompletedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ApprovalFlowCompletedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asApprovalFlowCreated(
            Function<com.commercetools.api.predicates.query.message.ApprovalFlowCreatedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ApprovalFlowCreatedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ApprovalFlowCreatedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asApprovalFlowRejected(
            Function<com.commercetools.api.predicates.query.message.ApprovalFlowRejectedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ApprovalFlowRejectedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ApprovalFlowRejectedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asApprovalRuleApproversSet(
            Function<com.commercetools.api.predicates.query.message.ApprovalRuleApproversSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ApprovalRuleApproversSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ApprovalRuleApproversSetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asApprovalRuleCreated(
            Function<com.commercetools.api.predicates.query.message.ApprovalRuleCreatedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ApprovalRuleCreatedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ApprovalRuleCreatedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asApprovalRuleDescriptionSet(
            Function<com.commercetools.api.predicates.query.message.ApprovalRuleDescriptionSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ApprovalRuleDescriptionSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ApprovalRuleDescriptionSetMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asApprovalRuleKeySet(
            Function<com.commercetools.api.predicates.query.message.ApprovalRuleKeySetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ApprovalRuleKeySetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ApprovalRuleKeySetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asApprovalRuleNameSet(
            Function<com.commercetools.api.predicates.query.message.ApprovalRuleNameSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ApprovalRuleNameSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ApprovalRuleNameSetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asApprovalRulePredicateSet(
            Function<com.commercetools.api.predicates.query.message.ApprovalRulePredicateSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ApprovalRulePredicateSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ApprovalRulePredicateSetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asApprovalRuleRequestersSet(
            Function<com.commercetools.api.predicates.query.message.ApprovalRuleRequestersSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ApprovalRuleRequestersSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ApprovalRuleRequestersSetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asApprovalRuleStatusSet(
            Function<com.commercetools.api.predicates.query.message.ApprovalRuleStatusSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ApprovalRuleStatusSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ApprovalRuleStatusSetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
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
            Function<com.commercetools.api.predicates.query.message.AssociateRoleNameSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.AssociateRoleNameSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.AssociateRoleNameSetMessagePayloadQueryBuilderDsl.of()),
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

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asBusinessUnitAddressCustomFieldAdded(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitAddressCustomFieldAddedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitAddressCustomFieldAddedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitAddressCustomFieldAddedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asBusinessUnitAddressCustomFieldChanged(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitAddressCustomFieldChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitAddressCustomFieldChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitAddressCustomFieldChangedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asBusinessUnitAddressCustomFieldRemoved(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitAddressCustomFieldRemovedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitAddressCustomFieldRemovedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitAddressCustomFieldRemovedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asBusinessUnitAddressCustomTypeRemoved(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitAddressCustomTypeRemovedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitAddressCustomTypeRemovedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitAddressCustomTypeRemovedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asBusinessUnitAddressCustomTypeSet(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitAddressCustomTypeSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitAddressCustomTypeSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitAddressCustomTypeSetMessagePayloadQueryBuilderDsl
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

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asBusinessUnitApprovalRuleModeChanged(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitApprovalRuleModeChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitApprovalRuleModeChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitApprovalRuleModeChangedMessagePayloadQueryBuilderDsl
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

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asBusinessUnitCustomFieldAdded(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitCustomFieldAddedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitCustomFieldAddedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitCustomFieldAddedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asBusinessUnitCustomFieldChanged(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitCustomFieldChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitCustomFieldChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitCustomFieldChangedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asBusinessUnitCustomFieldRemoved(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitCustomFieldRemovedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitCustomFieldRemovedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitCustomFieldRemovedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asBusinessUnitCustomTypeRemoved(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitCustomTypeRemovedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitCustomTypeRemovedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitCustomTypeRemovedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asBusinessUnitCustomTypeSet(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitCustomTypeSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitCustomTypeSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitCustomTypeSetMessagePayloadQueryBuilderDsl.of()),
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

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asBusinessUnitParentChanged(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitParentChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitParentChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitParentChangedMessagePayloadQueryBuilderDsl.of()),
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

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asBusinessUnitTopLevelUnitSet(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitTopLevelUnitSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitTopLevelUnitSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitTopLevelUnitSetMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asBusinessUnitTypeSet(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitTypeSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitTypeSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.BusinessUnitTypeSetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCartDiscountCreated(
            Function<com.commercetools.api.predicates.query.message.CartDiscountCreatedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CartDiscountCreatedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.CartDiscountCreatedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCartDiscountDeleted(
            Function<com.commercetools.api.predicates.query.message.CartDiscountDeletedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CartDiscountDeletedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.CartDiscountDeletedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCartDiscountStoreAdded(
            Function<com.commercetools.api.predicates.query.message.CartDiscountStoreAddedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CartDiscountStoreAddedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.CartDiscountStoreAddedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCartDiscountStoreRemoved(
            Function<com.commercetools.api.predicates.query.message.CartDiscountStoreRemovedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CartDiscountStoreRemovedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.CartDiscountStoreRemovedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCartDiscountStoresSet(
            Function<com.commercetools.api.predicates.query.message.CartDiscountStoresSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CartDiscountStoresSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.CartDiscountStoresSetMessagePayloadQueryBuilderDsl.of()),
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

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCustomerAddressCustomFieldAdded(
            Function<com.commercetools.api.predicates.query.message.CustomerAddressCustomFieldAddedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerAddressCustomFieldAddedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.CustomerAddressCustomFieldAddedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCustomerAddressCustomFieldChanged(
            Function<com.commercetools.api.predicates.query.message.CustomerAddressCustomFieldChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerAddressCustomFieldChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.CustomerAddressCustomFieldChangedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCustomerAddressCustomFieldRemoved(
            Function<com.commercetools.api.predicates.query.message.CustomerAddressCustomFieldRemovedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerAddressCustomFieldRemovedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.CustomerAddressCustomFieldRemovedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCustomerAddressCustomTypeRemoved(
            Function<com.commercetools.api.predicates.query.message.CustomerAddressCustomTypeRemovedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerAddressCustomTypeRemovedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.CustomerAddressCustomTypeRemovedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCustomerAddressCustomTypeSet(
            Function<com.commercetools.api.predicates.query.message.CustomerAddressCustomTypeSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerAddressCustomTypeSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.CustomerAddressCustomTypeSetMessagePayloadQueryBuilderDsl
                    .of()),
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

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCustomerCustomFieldAdded(
            Function<com.commercetools.api.predicates.query.message.CustomerCustomFieldAddedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerCustomFieldAddedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.CustomerCustomFieldAddedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCustomerCustomFieldChanged(
            Function<com.commercetools.api.predicates.query.message.CustomerCustomFieldChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerCustomFieldChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.CustomerCustomFieldChangedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCustomerCustomFieldRemoved(
            Function<com.commercetools.api.predicates.query.message.CustomerCustomFieldRemovedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerCustomFieldRemovedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.CustomerCustomFieldRemovedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCustomerCustomTypeRemoved(
            Function<com.commercetools.api.predicates.query.message.CustomerCustomTypeRemovedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerCustomTypeRemovedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.CustomerCustomTypeRemovedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCustomerCustomTypeSet(
            Function<com.commercetools.api.predicates.query.message.CustomerCustomTypeSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerCustomTypeSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.CustomerCustomTypeSetMessagePayloadQueryBuilderDsl.of()),
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

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCustomerEmailTokenCreated(
            Function<com.commercetools.api.predicates.query.message.CustomerEmailTokenCreatedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerEmailTokenCreatedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.CustomerEmailTokenCreatedMessagePayloadQueryBuilderDsl.of()),
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

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCustomerGroupAssignmentAdded(
            Function<com.commercetools.api.predicates.query.message.CustomerGroupAssignmentAddedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerGroupAssignmentAddedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.CustomerGroupAssignmentAddedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCustomerGroupAssignmentRemoved(
            Function<com.commercetools.api.predicates.query.message.CustomerGroupAssignmentRemovedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerGroupAssignmentRemovedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.CustomerGroupAssignmentRemovedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCustomerGroupAssignmentsSet(
            Function<com.commercetools.api.predicates.query.message.CustomerGroupAssignmentsSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerGroupAssignmentsSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.CustomerGroupAssignmentsSetMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCustomerGroupCustomFieldAdded(
            Function<com.commercetools.api.predicates.query.message.CustomerGroupCustomFieldAddedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerGroupCustomFieldAddedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.CustomerGroupCustomFieldAddedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCustomerGroupCustomFieldChanged(
            Function<com.commercetools.api.predicates.query.message.CustomerGroupCustomFieldChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerGroupCustomFieldChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.CustomerGroupCustomFieldChangedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCustomerGroupCustomFieldRemoved(
            Function<com.commercetools.api.predicates.query.message.CustomerGroupCustomFieldRemovedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerGroupCustomFieldRemovedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.CustomerGroupCustomFieldRemovedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCustomerGroupCustomTypeRemoved(
            Function<com.commercetools.api.predicates.query.message.CustomerGroupCustomTypeRemovedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerGroupCustomTypeRemovedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.CustomerGroupCustomTypeRemovedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCustomerGroupCustomTypeSet(
            Function<com.commercetools.api.predicates.query.message.CustomerGroupCustomTypeSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerGroupCustomTypeSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.CustomerGroupCustomTypeSetMessagePayloadQueryBuilderDsl
                    .of()),
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

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asCustomerPasswordTokenCreated(
            Function<com.commercetools.api.predicates.query.message.CustomerPasswordTokenCreatedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerPasswordTokenCreatedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.CustomerPasswordTokenCreatedMessagePayloadQueryBuilderDsl
                    .of()),
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

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asDiscountCodeCreated(
            Function<com.commercetools.api.predicates.query.message.DiscountCodeCreatedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.DiscountCodeCreatedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.DiscountCodeCreatedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asDiscountCodeDeleted(
            Function<com.commercetools.api.predicates.query.message.DiscountCodeDeletedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.DiscountCodeDeletedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.DiscountCodeDeletedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asDiscountCodeKeySet(
            Function<com.commercetools.api.predicates.query.message.DiscountCodeKeySetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.DiscountCodeKeySetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.DiscountCodeKeySetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asDiscountGroupCreated(
            Function<com.commercetools.api.predicates.query.message.DiscountGroupCreatedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.DiscountGroupCreatedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.DiscountGroupCreatedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asDiscountGroupDeleted(
            Function<com.commercetools.api.predicates.query.message.DiscountGroupDeletedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.DiscountGroupDeletedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.DiscountGroupDeletedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asDiscountGroupKeySet(
            Function<com.commercetools.api.predicates.query.message.DiscountGroupKeySetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.DiscountGroupKeySetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.DiscountGroupKeySetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asDiscountGroupSortOrderSet(
            Function<com.commercetools.api.predicates.query.message.DiscountGroupSortOrderSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.DiscountGroupSortOrderSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.DiscountGroupSortOrderSetMessagePayloadQueryBuilderDsl.of()),
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

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asPaymentInterfaceIdSet(
            Function<com.commercetools.api.predicates.query.message.PaymentInterfaceIdSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentInterfaceIdSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.PaymentInterfaceIdSetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asPaymentMethodCreated(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodCreatedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodCreatedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.PaymentMethodCreatedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asPaymentMethodCustomFieldAdded(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodCustomFieldAddedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodCustomFieldAddedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentMethodCustomFieldAddedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asPaymentMethodCustomFieldChanged(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodCustomFieldChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodCustomFieldChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentMethodCustomFieldChangedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asPaymentMethodCustomFieldRemoved(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodCustomFieldRemovedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodCustomFieldRemovedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentMethodCustomFieldRemovedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asPaymentMethodCustomTypeRemoved(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodCustomTypeRemovedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodCustomTypeRemovedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentMethodCustomTypeRemovedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asPaymentMethodCustomTypeSet(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodCustomTypeSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodCustomTypeSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentMethodCustomTypeSetMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asPaymentMethodDefaultSet(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodDefaultSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodDefaultSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentMethodDefaultSetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asPaymentMethodDeleted(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodDeletedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodDeletedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.PaymentMethodDeletedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asPaymentMethodInfoCustomFieldAdded(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodInfoCustomFieldAddedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodInfoCustomFieldAddedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentMethodInfoCustomFieldAddedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asPaymentMethodInfoCustomFieldChanged(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodInfoCustomFieldChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodInfoCustomFieldChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentMethodInfoCustomFieldChangedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asPaymentMethodInfoCustomFieldRemoved(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodInfoCustomFieldRemovedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodInfoCustomFieldRemovedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentMethodInfoCustomFieldRemovedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asPaymentMethodInfoCustomTypeRemoved(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodInfoCustomTypeRemovedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodInfoCustomTypeRemovedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentMethodInfoCustomTypeRemovedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asPaymentMethodInfoCustomTypeSet(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodInfoCustomTypeSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodInfoCustomTypeSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentMethodInfoCustomTypeSetMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asPaymentMethodInfoInterfaceAccountSet(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodInfoInterfaceAccountSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodInfoInterfaceAccountSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentMethodInfoInterfaceAccountSetMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asPaymentMethodInfoInterfaceSet(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodInfoInterfaceSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodInfoInterfaceSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentMethodInfoInterfaceSetMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asPaymentMethodInfoMethodSet(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodInfoMethodSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodInfoMethodSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentMethodInfoMethodSetMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asPaymentMethodInfoNameSet(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodInfoNameSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodInfoNameSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentMethodInfoNameSetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asPaymentMethodInfoTokenSet(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodInfoTokenSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodInfoTokenSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentMethodInfoTokenSetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asPaymentMethodInterfaceAccountSet(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodInterfaceAccountSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodInterfaceAccountSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentMethodInterfaceAccountSetMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asPaymentMethodKeySet(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodKeySetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodKeySetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.PaymentMethodKeySetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asPaymentMethodMethodSet(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodMethodSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodMethodSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentMethodMethodSetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asPaymentMethodNameSet(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodNameSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodNameSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.PaymentMethodNameSetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asPaymentMethodPaymentInterfaceSet(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodPaymentInterfaceSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodPaymentInterfaceSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentMethodPaymentInterfaceSetMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asPaymentMethodPaymentMethodStatusSet(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodPaymentMethodStatusSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodPaymentMethodStatusSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentMethodPaymentMethodStatusSetMessagePayloadQueryBuilderDsl
                    .of()),
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

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductPriceCustomFieldAdded(
            Function<com.commercetools.api.predicates.query.message.ProductPriceCustomFieldAddedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductPriceCustomFieldAddedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ProductPriceCustomFieldAddedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductPriceCustomFieldChanged(
            Function<com.commercetools.api.predicates.query.message.ProductPriceCustomFieldChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductPriceCustomFieldChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ProductPriceCustomFieldChangedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductPriceCustomFieldRemoved(
            Function<com.commercetools.api.predicates.query.message.ProductPriceCustomFieldRemovedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductPriceCustomFieldRemovedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ProductPriceCustomFieldRemovedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductPriceCustomFieldsRemoved(
            Function<com.commercetools.api.predicates.query.message.ProductPriceCustomFieldsRemovedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductPriceCustomFieldsRemovedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ProductPriceCustomFieldsRemovedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductPriceCustomFieldsSet(
            Function<com.commercetools.api.predicates.query.message.ProductPriceCustomFieldsSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductPriceCustomFieldsSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ProductPriceCustomFieldsSetMessagePayloadQueryBuilderDsl
                    .of()),
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

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductTailoringCreated(
            Function<com.commercetools.api.predicates.query.message.ProductTailoringCreatedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductTailoringCreatedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ProductTailoringCreatedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductTailoringDeleted(
            Function<com.commercetools.api.predicates.query.message.ProductTailoringDeletedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductTailoringDeletedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ProductTailoringDeletedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductTailoringDescriptionSet(
            Function<com.commercetools.api.predicates.query.message.ProductTailoringDescriptionSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductTailoringDescriptionSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ProductTailoringDescriptionSetMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductTailoringImageAdded(
            Function<com.commercetools.api.predicates.query.message.ProductTailoringImageAddedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductTailoringImageAddedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ProductTailoringImageAddedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductTailoringImagesSet(
            Function<com.commercetools.api.predicates.query.message.ProductTailoringImagesSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductTailoringImagesSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ProductTailoringImagesSetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductTailoringNameSet(
            Function<com.commercetools.api.predicates.query.message.ProductTailoringNameSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductTailoringNameSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ProductTailoringNameSetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductTailoringPublished(
            Function<com.commercetools.api.predicates.query.message.ProductTailoringPublishedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductTailoringPublishedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ProductTailoringPublishedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductTailoringSlugSet(
            Function<com.commercetools.api.predicates.query.message.ProductTailoringSlugSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductTailoringSlugSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ProductTailoringSlugSetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductTailoringUnpublished(
            Function<com.commercetools.api.predicates.query.message.ProductTailoringUnpublishedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductTailoringUnpublishedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ProductTailoringUnpublishedMessagePayloadQueryBuilderDsl
                    .of()),
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

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductVariantTailoringAdded(
            Function<com.commercetools.api.predicates.query.message.ProductVariantTailoringAddedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductVariantTailoringAddedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ProductVariantTailoringAddedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asProductVariantTailoringRemoved(
            Function<com.commercetools.api.predicates.query.message.ProductVariantTailoringRemovedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductVariantTailoringRemovedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ProductVariantTailoringRemovedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asQuoteCreated(
            Function<com.commercetools.api.predicates.query.message.QuoteCreatedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.QuoteCreatedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.QuoteCreatedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asQuoteCustomerChanged(
            Function<com.commercetools.api.predicates.query.message.QuoteCustomerChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.QuoteCustomerChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.QuoteCustomerChangedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asQuoteDeleted(
            Function<com.commercetools.api.predicates.query.message.QuoteDeletedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.QuoteDeletedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.QuoteDeletedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asQuoteRenegotiationRequested(
            Function<com.commercetools.api.predicates.query.message.QuoteRenegotiationRequestedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.QuoteRenegotiationRequestedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.QuoteRenegotiationRequestedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asQuoteRequestCreated(
            Function<com.commercetools.api.predicates.query.message.QuoteRequestCreatedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.QuoteRequestCreatedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.QuoteRequestCreatedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asQuoteRequestCustomerChanged(
            Function<com.commercetools.api.predicates.query.message.QuoteRequestCustomerChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.QuoteRequestCustomerChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.QuoteRequestCustomerChangedMessagePayloadQueryBuilderDsl
                    .of()),
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

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asRecurringOrderCreated(
            Function<com.commercetools.api.predicates.query.message.RecurringOrderCreatedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.RecurringOrderCreatedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.RecurringOrderCreatedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asRecurringOrderCustomFieldAdded(
            Function<com.commercetools.api.predicates.query.message.RecurringOrderCustomFieldAddedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.RecurringOrderCustomFieldAddedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.RecurringOrderCustomFieldAddedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asRecurringOrderCustomFieldChanged(
            Function<com.commercetools.api.predicates.query.message.RecurringOrderCustomFieldChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.RecurringOrderCustomFieldChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.RecurringOrderCustomFieldChangedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asRecurringOrderCustomFieldRemoved(
            Function<com.commercetools.api.predicates.query.message.RecurringOrderCustomFieldRemovedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.RecurringOrderCustomFieldRemovedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.RecurringOrderCustomFieldRemovedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asRecurringOrderCustomTypeRemoved(
            Function<com.commercetools.api.predicates.query.message.RecurringOrderCustomTypeRemovedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.RecurringOrderCustomTypeRemovedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.RecurringOrderCustomTypeRemovedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asRecurringOrderCustomTypeSet(
            Function<com.commercetools.api.predicates.query.message.RecurringOrderCustomTypeSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.RecurringOrderCustomTypeSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.RecurringOrderCustomTypeSetMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asRecurringOrderDeleted(
            Function<com.commercetools.api.predicates.query.message.RecurringOrderDeletedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.RecurringOrderDeletedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.RecurringOrderDeletedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asRecurringOrderExpiresAtSet(
            Function<com.commercetools.api.predicates.query.message.RecurringOrderExpiresAtSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.RecurringOrderExpiresAtSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.RecurringOrderExpiresAtSetMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asRecurringOrderKeySet(
            Function<com.commercetools.api.predicates.query.message.RecurringOrderKeySetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.RecurringOrderKeySetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.RecurringOrderKeySetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asRecurringOrderScheduleSet(
            Function<com.commercetools.api.predicates.query.message.RecurringOrderScheduleSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.RecurringOrderScheduleSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.RecurringOrderScheduleSetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asRecurringOrderStartsAtSet(
            Function<com.commercetools.api.predicates.query.message.RecurringOrderStartsAtSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.RecurringOrderStartsAtSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.RecurringOrderStartsAtSetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asRecurringOrderStateChanged(
            Function<com.commercetools.api.predicates.query.message.RecurringOrderStateChangedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.RecurringOrderStateChangedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.RecurringOrderStateChangedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asRecurringOrderStateTransition(
            Function<com.commercetools.api.predicates.query.message.RecurringOrderStateTransitionMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.RecurringOrderStateTransitionMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.RecurringOrderStateTransitionMessagePayloadQueryBuilderDsl
                    .of()),
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

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asShoppingListMessagePayload(
            Function<com.commercetools.api.predicates.query.message.ShoppingListMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ShoppingListMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ShoppingListMessagePayloadQueryBuilderDsl.of()),
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

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asStandalonePriceStagedChangesRemoved(
            Function<com.commercetools.api.predicates.query.message.StandalonePriceStagedChangesRemovedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StandalonePriceStagedChangesRemovedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.StandalonePriceStagedChangesRemovedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asStandalonePriceTierAdded(
            Function<com.commercetools.api.predicates.query.message.StandalonePriceTierAddedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StandalonePriceTierAddedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.StandalonePriceTierAddedMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asStandalonePriceTierRemoved(
            Function<com.commercetools.api.predicates.query.message.StandalonePriceTierRemovedMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StandalonePriceTierRemovedMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.StandalonePriceTierRemovedMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asStandalonePriceTiersSet(
            Function<com.commercetools.api.predicates.query.message.StandalonePriceTiersSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StandalonePriceTiersSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.StandalonePriceTiersSetMessagePayloadQueryBuilderDsl.of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asStandalonePriceValidFromAndUntilSet(
            Function<com.commercetools.api.predicates.query.message.StandalonePriceValidFromAndUntilSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StandalonePriceValidFromAndUntilSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.StandalonePriceValidFromAndUntilSetMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asStandalonePriceValidFromSet(
            Function<com.commercetools.api.predicates.query.message.StandalonePriceValidFromSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StandalonePriceValidFromSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.StandalonePriceValidFromSetMessagePayloadQueryBuilderDsl
                    .of()),
            MessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessagePayloadQueryBuilderDsl> asStandalonePriceValidUntilSet(
            Function<com.commercetools.api.predicates.query.message.StandalonePriceValidUntilSetMessagePayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StandalonePriceValidUntilSetMessagePayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.StandalonePriceValidUntilSetMessagePayloadQueryBuilderDsl
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
