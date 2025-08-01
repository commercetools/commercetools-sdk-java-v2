
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

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asApprovalFlowApproved(
            Function<com.commercetools.api.predicates.query.message.ApprovalFlowApprovedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ApprovalFlowApprovedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ApprovalFlowApprovedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asApprovalFlowCompleted(
            Function<com.commercetools.api.predicates.query.message.ApprovalFlowCompletedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ApprovalFlowCompletedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ApprovalFlowCompletedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asApprovalFlowCreated(
            Function<com.commercetools.api.predicates.query.message.ApprovalFlowCreatedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ApprovalFlowCreatedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ApprovalFlowCreatedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asApprovalFlowRejected(
            Function<com.commercetools.api.predicates.query.message.ApprovalFlowRejectedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ApprovalFlowRejectedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ApprovalFlowRejectedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asApprovalRuleApproversSet(
            Function<com.commercetools.api.predicates.query.message.ApprovalRuleApproversSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ApprovalRuleApproversSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ApprovalRuleApproversSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asApprovalRuleCreated(
            Function<com.commercetools.api.predicates.query.message.ApprovalRuleCreatedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ApprovalRuleCreatedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ApprovalRuleCreatedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asApprovalRuleDescriptionSet(
            Function<com.commercetools.api.predicates.query.message.ApprovalRuleDescriptionSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ApprovalRuleDescriptionSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ApprovalRuleDescriptionSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asApprovalRuleKeySet(
            Function<com.commercetools.api.predicates.query.message.ApprovalRuleKeySetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ApprovalRuleKeySetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ApprovalRuleKeySetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asApprovalRuleNameSet(
            Function<com.commercetools.api.predicates.query.message.ApprovalRuleNameSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ApprovalRuleNameSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ApprovalRuleNameSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asApprovalRulePredicateSet(
            Function<com.commercetools.api.predicates.query.message.ApprovalRulePredicateSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ApprovalRulePredicateSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ApprovalRulePredicateSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asApprovalRuleRequestersSet(
            Function<com.commercetools.api.predicates.query.message.ApprovalRuleRequestersSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ApprovalRuleRequestersSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ApprovalRuleRequestersSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asApprovalRuleStatusSet(
            Function<com.commercetools.api.predicates.query.message.ApprovalRuleStatusSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ApprovalRuleStatusSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ApprovalRuleStatusSetMessageQueryBuilderDsl.of()),
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
            Function<com.commercetools.api.predicates.query.message.AssociateRoleNameSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.AssociateRoleNameSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.AssociateRoleNameSetMessageQueryBuilderDsl.of()),
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

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asBusinessUnitAddressCustomFieldAdded(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitAddressCustomFieldAddedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitAddressCustomFieldAddedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitAddressCustomFieldAddedMessageQueryBuilderDsl
                    .of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asBusinessUnitAddressCustomFieldChanged(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitAddressCustomFieldChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitAddressCustomFieldChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitAddressCustomFieldChangedMessageQueryBuilderDsl
                    .of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asBusinessUnitAddressCustomFieldRemoved(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitAddressCustomFieldRemovedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitAddressCustomFieldRemovedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitAddressCustomFieldRemovedMessageQueryBuilderDsl
                    .of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asBusinessUnitAddressCustomTypeRemoved(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitAddressCustomTypeRemovedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitAddressCustomTypeRemovedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitAddressCustomTypeRemovedMessageQueryBuilderDsl
                    .of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asBusinessUnitAddressCustomTypeSet(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitAddressCustomTypeSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitAddressCustomTypeSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitAddressCustomTypeSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asBusinessUnitAddressRemoved(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitAddressRemovedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitAddressRemovedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.BusinessUnitAddressRemovedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asBusinessUnitApprovalRuleModeChanged(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitApprovalRuleModeChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitApprovalRuleModeChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitApprovalRuleModeChangedMessageQueryBuilderDsl
                    .of()),
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

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asBusinessUnitCustomFieldAdded(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitCustomFieldAddedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitCustomFieldAddedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.BusinessUnitCustomFieldAddedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asBusinessUnitCustomFieldChanged(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitCustomFieldChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitCustomFieldChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitCustomFieldChangedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asBusinessUnitCustomFieldRemoved(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitCustomFieldRemovedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitCustomFieldRemovedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitCustomFieldRemovedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asBusinessUnitCustomTypeRemoved(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitCustomTypeRemovedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitCustomTypeRemovedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.BusinessUnitCustomTypeRemovedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asBusinessUnitCustomTypeSet(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitCustomTypeSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitCustomTypeSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.BusinessUnitCustomTypeSetMessageQueryBuilderDsl.of()),
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

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asBusinessUnitParentChanged(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitParentChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitParentChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.BusinessUnitParentChangedMessageQueryBuilderDsl.of()),
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

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asBusinessUnitTopLevelUnitSet(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitTopLevelUnitSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitTopLevelUnitSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.BusinessUnitTopLevelUnitSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asBusinessUnitTypeSet(
            Function<com.commercetools.api.predicates.query.message.BusinessUnitTypeSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.BusinessUnitTypeSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.BusinessUnitTypeSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCartDiscountCreated(
            Function<com.commercetools.api.predicates.query.message.CartDiscountCreatedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CartDiscountCreatedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.CartDiscountCreatedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCartDiscountDeleted(
            Function<com.commercetools.api.predicates.query.message.CartDiscountDeletedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CartDiscountDeletedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.CartDiscountDeletedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCartDiscountStoreAdded(
            Function<com.commercetools.api.predicates.query.message.CartDiscountStoreAddedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CartDiscountStoreAddedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.CartDiscountStoreAddedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCartDiscountStoreRemoved(
            Function<com.commercetools.api.predicates.query.message.CartDiscountStoreRemovedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CartDiscountStoreRemovedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.CartDiscountStoreRemovedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCartDiscountStoresSet(
            Function<com.commercetools.api.predicates.query.message.CartDiscountStoresSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CartDiscountStoresSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.CartDiscountStoresSetMessageQueryBuilderDsl.of()),
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

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCustomerAddressCustomFieldAdded(
            Function<com.commercetools.api.predicates.query.message.CustomerAddressCustomFieldAddedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerAddressCustomFieldAddedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.CustomerAddressCustomFieldAddedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCustomerAddressCustomFieldChanged(
            Function<com.commercetools.api.predicates.query.message.CustomerAddressCustomFieldChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerAddressCustomFieldChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.CustomerAddressCustomFieldChangedMessageQueryBuilderDsl
                    .of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCustomerAddressCustomFieldRemoved(
            Function<com.commercetools.api.predicates.query.message.CustomerAddressCustomFieldRemovedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerAddressCustomFieldRemovedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.CustomerAddressCustomFieldRemovedMessageQueryBuilderDsl
                    .of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCustomerAddressCustomTypeRemoved(
            Function<com.commercetools.api.predicates.query.message.CustomerAddressCustomTypeRemovedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerAddressCustomTypeRemovedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.CustomerAddressCustomTypeRemovedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCustomerAddressCustomTypeSet(
            Function<com.commercetools.api.predicates.query.message.CustomerAddressCustomTypeSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerAddressCustomTypeSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.CustomerAddressCustomTypeSetMessageQueryBuilderDsl.of()),
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

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCustomerCustomFieldAdded(
            Function<com.commercetools.api.predicates.query.message.CustomerCustomFieldAddedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerCustomFieldAddedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.CustomerCustomFieldAddedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCustomerCustomFieldChanged(
            Function<com.commercetools.api.predicates.query.message.CustomerCustomFieldChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerCustomFieldChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.CustomerCustomFieldChangedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCustomerCustomFieldRemoved(
            Function<com.commercetools.api.predicates.query.message.CustomerCustomFieldRemovedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerCustomFieldRemovedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.CustomerCustomFieldRemovedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCustomerCustomTypeRemoved(
            Function<com.commercetools.api.predicates.query.message.CustomerCustomTypeRemovedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerCustomTypeRemovedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.CustomerCustomTypeRemovedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCustomerCustomTypeSet(
            Function<com.commercetools.api.predicates.query.message.CustomerCustomTypeSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerCustomTypeSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.CustomerCustomTypeSetMessageQueryBuilderDsl.of()),
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

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCustomerEmailTokenCreated(
            Function<com.commercetools.api.predicates.query.message.CustomerEmailTokenCreatedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerEmailTokenCreatedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.CustomerEmailTokenCreatedMessageQueryBuilderDsl.of()),
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

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCustomerGroupAssignmentAdded(
            Function<com.commercetools.api.predicates.query.message.CustomerGroupAssignmentAddedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerGroupAssignmentAddedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.CustomerGroupAssignmentAddedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCustomerGroupAssignmentRemoved(
            Function<com.commercetools.api.predicates.query.message.CustomerGroupAssignmentRemovedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerGroupAssignmentRemovedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.CustomerGroupAssignmentRemovedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCustomerGroupAssignmentsSet(
            Function<com.commercetools.api.predicates.query.message.CustomerGroupAssignmentsSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerGroupAssignmentsSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.CustomerGroupAssignmentsSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCustomerGroupCustomFieldAdded(
            Function<com.commercetools.api.predicates.query.message.CustomerGroupCustomFieldAddedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerGroupCustomFieldAddedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.CustomerGroupCustomFieldAddedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCustomerGroupCustomFieldChanged(
            Function<com.commercetools.api.predicates.query.message.CustomerGroupCustomFieldChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerGroupCustomFieldChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.CustomerGroupCustomFieldChangedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCustomerGroupCustomFieldRemoved(
            Function<com.commercetools.api.predicates.query.message.CustomerGroupCustomFieldRemovedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerGroupCustomFieldRemovedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.CustomerGroupCustomFieldRemovedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCustomerGroupCustomTypeRemoved(
            Function<com.commercetools.api.predicates.query.message.CustomerGroupCustomTypeRemovedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerGroupCustomTypeRemovedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.CustomerGroupCustomTypeRemovedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCustomerGroupCustomTypeSet(
            Function<com.commercetools.api.predicates.query.message.CustomerGroupCustomTypeSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerGroupCustomTypeSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.CustomerGroupCustomTypeSetMessageQueryBuilderDsl.of()),
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

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asCustomerPasswordTokenCreated(
            Function<com.commercetools.api.predicates.query.message.CustomerPasswordTokenCreatedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.CustomerPasswordTokenCreatedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.CustomerPasswordTokenCreatedMessageQueryBuilderDsl.of()),
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

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asDiscountCodeCreated(
            Function<com.commercetools.api.predicates.query.message.DiscountCodeCreatedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.DiscountCodeCreatedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.DiscountCodeCreatedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asDiscountCodeDeleted(
            Function<com.commercetools.api.predicates.query.message.DiscountCodeDeletedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.DiscountCodeDeletedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.DiscountCodeDeletedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asDiscountCodeKeySet(
            Function<com.commercetools.api.predicates.query.message.DiscountCodeKeySetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.DiscountCodeKeySetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.DiscountCodeKeySetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asDiscountGroupCreated(
            Function<com.commercetools.api.predicates.query.message.DiscountGroupCreatedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.DiscountGroupCreatedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.DiscountGroupCreatedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asDiscountGroupDeleted(
            Function<com.commercetools.api.predicates.query.message.DiscountGroupDeletedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.DiscountGroupDeletedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.DiscountGroupDeletedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asDiscountGroupKeySet(
            Function<com.commercetools.api.predicates.query.message.DiscountGroupKeySetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.DiscountGroupKeySetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.DiscountGroupKeySetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asDiscountGroupSortOrderSet(
            Function<com.commercetools.api.predicates.query.message.DiscountGroupSortOrderSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.DiscountGroupSortOrderSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.DiscountGroupSortOrderSetMessageQueryBuilderDsl.of()),
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

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asPaymentInterfaceIdSet(
            Function<com.commercetools.api.predicates.query.message.PaymentInterfaceIdSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentInterfaceIdSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.PaymentInterfaceIdSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asPaymentMethodCreated(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodCreatedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodCreatedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.PaymentMethodCreatedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asPaymentMethodCustomFieldAdded(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodCustomFieldAddedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodCustomFieldAddedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentMethodCustomFieldAddedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asPaymentMethodCustomFieldChanged(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodCustomFieldChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodCustomFieldChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentMethodCustomFieldChangedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asPaymentMethodCustomFieldRemoved(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodCustomFieldRemovedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodCustomFieldRemovedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentMethodCustomFieldRemovedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asPaymentMethodCustomTypeRemoved(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodCustomTypeRemovedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodCustomTypeRemovedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentMethodCustomTypeRemovedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asPaymentMethodCustomTypeSet(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodCustomTypeSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodCustomTypeSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.PaymentMethodCustomTypeSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asPaymentMethodDefaultSet(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodDefaultSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodDefaultSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.PaymentMethodDefaultSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asPaymentMethodDeleted(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodDeletedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodDeletedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.PaymentMethodDeletedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asPaymentMethodInfoCustomFieldAdded(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodInfoCustomFieldAddedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodInfoCustomFieldAddedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentMethodInfoCustomFieldAddedMessageQueryBuilderDsl
                    .of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asPaymentMethodInfoCustomFieldChanged(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodInfoCustomFieldChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodInfoCustomFieldChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentMethodInfoCustomFieldChangedMessageQueryBuilderDsl
                    .of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asPaymentMethodInfoCustomFieldRemoved(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodInfoCustomFieldRemovedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodInfoCustomFieldRemovedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentMethodInfoCustomFieldRemovedMessageQueryBuilderDsl
                    .of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asPaymentMethodInfoCustomTypeRemoved(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodInfoCustomTypeRemovedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodInfoCustomTypeRemovedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentMethodInfoCustomTypeRemovedMessageQueryBuilderDsl
                    .of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asPaymentMethodInfoCustomTypeSet(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodInfoCustomTypeSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodInfoCustomTypeSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentMethodInfoCustomTypeSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asPaymentMethodInfoInterfaceAccountSet(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodInfoInterfaceAccountSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodInfoInterfaceAccountSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentMethodInfoInterfaceAccountSetMessageQueryBuilderDsl
                    .of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asPaymentMethodInfoInterfaceSet(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodInfoInterfaceSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodInfoInterfaceSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentMethodInfoInterfaceSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asPaymentMethodInfoMethodSet(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodInfoMethodSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodInfoMethodSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.PaymentMethodInfoMethodSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asPaymentMethodInfoNameSet(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodInfoNameSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodInfoNameSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.PaymentMethodInfoNameSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asPaymentMethodInfoTokenSet(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodInfoTokenSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodInfoTokenSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.PaymentMethodInfoTokenSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asPaymentMethodInterfaceAccountSet(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodInterfaceAccountSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodInterfaceAccountSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentMethodInterfaceAccountSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asPaymentMethodKeySet(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodKeySetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodKeySetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.PaymentMethodKeySetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asPaymentMethodMethodSet(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodMethodSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodMethodSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.PaymentMethodMethodSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asPaymentMethodNameSet(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodNameSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodNameSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.PaymentMethodNameSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asPaymentMethodPaymentInterfaceSet(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodPaymentInterfaceSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodPaymentInterfaceSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentMethodPaymentInterfaceSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asPaymentMethodPaymentMethodStatusSet(
            Function<com.commercetools.api.predicates.query.message.PaymentMethodPaymentMethodStatusSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.PaymentMethodPaymentMethodStatusSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.PaymentMethodPaymentMethodStatusSetMessageQueryBuilderDsl
                    .of()),
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

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductPriceCustomFieldAdded(
            Function<com.commercetools.api.predicates.query.message.ProductPriceCustomFieldAddedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductPriceCustomFieldAddedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ProductPriceCustomFieldAddedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductPriceCustomFieldChanged(
            Function<com.commercetools.api.predicates.query.message.ProductPriceCustomFieldChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductPriceCustomFieldChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ProductPriceCustomFieldChangedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductPriceCustomFieldRemoved(
            Function<com.commercetools.api.predicates.query.message.ProductPriceCustomFieldRemovedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductPriceCustomFieldRemovedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ProductPriceCustomFieldRemovedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductPriceCustomFieldsRemoved(
            Function<com.commercetools.api.predicates.query.message.ProductPriceCustomFieldsRemovedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductPriceCustomFieldsRemovedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ProductPriceCustomFieldsRemovedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductPriceCustomFieldsSet(
            Function<com.commercetools.api.predicates.query.message.ProductPriceCustomFieldsSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductPriceCustomFieldsSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ProductPriceCustomFieldsSetMessageQueryBuilderDsl.of()),
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

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductTailoringCreated(
            Function<com.commercetools.api.predicates.query.message.ProductTailoringCreatedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductTailoringCreatedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ProductTailoringCreatedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductTailoringDeleted(
            Function<com.commercetools.api.predicates.query.message.ProductTailoringDeletedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductTailoringDeletedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ProductTailoringDeletedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductTailoringDescriptionSet(
            Function<com.commercetools.api.predicates.query.message.ProductTailoringDescriptionSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductTailoringDescriptionSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ProductTailoringDescriptionSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductTailoringImageAdded(
            Function<com.commercetools.api.predicates.query.message.ProductTailoringImageAddedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductTailoringImageAddedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ProductTailoringImageAddedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductTailoringImagesSet(
            Function<com.commercetools.api.predicates.query.message.ProductTailoringImagesSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductTailoringImagesSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ProductTailoringImagesSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductTailoringNameSet(
            Function<com.commercetools.api.predicates.query.message.ProductTailoringNameSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductTailoringNameSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ProductTailoringNameSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductTailoringPublished(
            Function<com.commercetools.api.predicates.query.message.ProductTailoringPublishedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductTailoringPublishedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ProductTailoringPublishedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductTailoringSlugSet(
            Function<com.commercetools.api.predicates.query.message.ProductTailoringSlugSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductTailoringSlugSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ProductTailoringSlugSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductTailoringUnpublished(
            Function<com.commercetools.api.predicates.query.message.ProductTailoringUnpublishedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductTailoringUnpublishedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ProductTailoringUnpublishedMessageQueryBuilderDsl.of()),
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

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductVariantTailoringAdded(
            Function<com.commercetools.api.predicates.query.message.ProductVariantTailoringAddedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductVariantTailoringAddedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ProductVariantTailoringAddedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asProductVariantTailoringRemoved(
            Function<com.commercetools.api.predicates.query.message.ProductVariantTailoringRemovedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductVariantTailoringRemovedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.ProductVariantTailoringRemovedMessageQueryBuilderDsl.of()),
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

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asQuoteRenegotiationRequested(
            Function<com.commercetools.api.predicates.query.message.QuoteRenegotiationRequestedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.QuoteRenegotiationRequestedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.QuoteRenegotiationRequestedMessageQueryBuilderDsl.of()),
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

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asRecurringOrderCreated(
            Function<com.commercetools.api.predicates.query.message.RecurringOrderCreatedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.RecurringOrderCreatedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.RecurringOrderCreatedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asRecurringOrderCustomFieldAdded(
            Function<com.commercetools.api.predicates.query.message.RecurringOrderCustomFieldAddedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.RecurringOrderCustomFieldAddedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.RecurringOrderCustomFieldAddedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asRecurringOrderCustomFieldChanged(
            Function<com.commercetools.api.predicates.query.message.RecurringOrderCustomFieldChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.RecurringOrderCustomFieldChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.RecurringOrderCustomFieldChangedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asRecurringOrderCustomFieldRemoved(
            Function<com.commercetools.api.predicates.query.message.RecurringOrderCustomFieldRemovedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.RecurringOrderCustomFieldRemovedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.RecurringOrderCustomFieldRemovedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asRecurringOrderCustomTypeRemoved(
            Function<com.commercetools.api.predicates.query.message.RecurringOrderCustomTypeRemovedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.RecurringOrderCustomTypeRemovedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.RecurringOrderCustomTypeRemovedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asRecurringOrderCustomTypeSet(
            Function<com.commercetools.api.predicates.query.message.RecurringOrderCustomTypeSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.RecurringOrderCustomTypeSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.RecurringOrderCustomTypeSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asRecurringOrderDeleted(
            Function<com.commercetools.api.predicates.query.message.RecurringOrderDeletedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.RecurringOrderDeletedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.RecurringOrderDeletedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asRecurringOrderExpiresAtSet(
            Function<com.commercetools.api.predicates.query.message.RecurringOrderExpiresAtSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.RecurringOrderExpiresAtSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.RecurringOrderExpiresAtSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asRecurringOrderKeySet(
            Function<com.commercetools.api.predicates.query.message.RecurringOrderKeySetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.RecurringOrderKeySetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.RecurringOrderKeySetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asRecurringOrderScheduleSet(
            Function<com.commercetools.api.predicates.query.message.RecurringOrderScheduleSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.RecurringOrderScheduleSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.RecurringOrderScheduleSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asRecurringOrderStartsAtSet(
            Function<com.commercetools.api.predicates.query.message.RecurringOrderStartsAtSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.RecurringOrderStartsAtSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.RecurringOrderStartsAtSetMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asRecurringOrderStateChanged(
            Function<com.commercetools.api.predicates.query.message.RecurringOrderStateChangedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.RecurringOrderStateChangedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.RecurringOrderStateChangedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asRecurringOrderStateTransition(
            Function<com.commercetools.api.predicates.query.message.RecurringOrderStateTransitionMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.RecurringOrderStateTransitionMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.RecurringOrderStateTransitionMessageQueryBuilderDsl.of()),
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

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asShoppingListMessage(
            Function<com.commercetools.api.predicates.query.message.ShoppingListMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ShoppingListMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.ShoppingListMessageQueryBuilderDsl.of()),
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

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asStandalonePriceStagedChangesRemoved(
            Function<com.commercetools.api.predicates.query.message.StandalonePriceStagedChangesRemovedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StandalonePriceStagedChangesRemovedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.message.StandalonePriceStagedChangesRemovedMessageQueryBuilderDsl
                    .of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asStandalonePriceTierAdded(
            Function<com.commercetools.api.predicates.query.message.StandalonePriceTierAddedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StandalonePriceTierAddedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.StandalonePriceTierAddedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asStandalonePriceTierRemoved(
            Function<com.commercetools.api.predicates.query.message.StandalonePriceTierRemovedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StandalonePriceTierRemovedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.StandalonePriceTierRemovedMessageQueryBuilderDsl.of()),
            MessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MessageQueryBuilderDsl> asStandalonePriceTiersSet(
            Function<com.commercetools.api.predicates.query.message.StandalonePriceTiersSetMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.StandalonePriceTiersSetMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.message.StandalonePriceTiersSetMessageQueryBuilderDsl.of()),
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
