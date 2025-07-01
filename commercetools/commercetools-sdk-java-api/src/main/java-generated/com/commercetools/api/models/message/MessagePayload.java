
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * MessagePayload
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MessagePayload messagePayload = MessagePayload.approvalFlowApprovedBuilder()
 *             associate(associateBuilder -> associateBuilder)
 *             order(orderBuilder -> orderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = MessagePayloadImpl.class, visible = true)
@JsonDeserialize(as = MessagePayloadImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface MessagePayload extends MessagePayloadMixin {

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    public MessagePayload copyDeep();

    /**
     * factory method to create a deep copy of MessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MessagePayload deepCopy(@Nullable final MessagePayload template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof MessagePayloadImpl)) {
            return template.copyDeep();
        }
        MessagePayloadImpl instance = new MessagePayloadImpl();
        return instance;
    }

    /**
     * builder for approvalFlowApproved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ApprovalFlowApprovedMessagePayloadBuilder approvalFlowApprovedBuilder() {
        return com.commercetools.api.models.message.ApprovalFlowApprovedMessagePayloadBuilder.of();
    }

    /**
     * builder for approvalFlowCompleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ApprovalFlowCompletedMessagePayloadBuilder approvalFlowCompletedBuilder() {
        return com.commercetools.api.models.message.ApprovalFlowCompletedMessagePayloadBuilder.of();
    }

    /**
     * builder for approvalFlowCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ApprovalFlowCreatedMessagePayloadBuilder approvalFlowCreatedBuilder() {
        return com.commercetools.api.models.message.ApprovalFlowCreatedMessagePayloadBuilder.of();
    }

    /**
     * builder for approvalFlowRejected subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ApprovalFlowRejectedMessagePayloadBuilder approvalFlowRejectedBuilder() {
        return com.commercetools.api.models.message.ApprovalFlowRejectedMessagePayloadBuilder.of();
    }

    /**
     * builder for approvalRuleApproversSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ApprovalRuleApproversSetMessagePayloadBuilder approvalRuleApproversSetBuilder() {
        return com.commercetools.api.models.message.ApprovalRuleApproversSetMessagePayloadBuilder.of();
    }

    /**
     * builder for approvalRuleCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ApprovalRuleCreatedMessagePayloadBuilder approvalRuleCreatedBuilder() {
        return com.commercetools.api.models.message.ApprovalRuleCreatedMessagePayloadBuilder.of();
    }

    /**
     * builder for approvalRuleDescriptionSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ApprovalRuleDescriptionSetMessagePayloadBuilder approvalRuleDescriptionSetBuilder() {
        return com.commercetools.api.models.message.ApprovalRuleDescriptionSetMessagePayloadBuilder.of();
    }

    /**
     * builder for approvalRuleKeySet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ApprovalRuleKeySetMessagePayloadBuilder approvalRuleKeySetBuilder() {
        return com.commercetools.api.models.message.ApprovalRuleKeySetMessagePayloadBuilder.of();
    }

    /**
     * builder for approvalRuleNameSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ApprovalRuleNameSetMessagePayloadBuilder approvalRuleNameSetBuilder() {
        return com.commercetools.api.models.message.ApprovalRuleNameSetMessagePayloadBuilder.of();
    }

    /**
     * builder for approvalRulePredicateSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ApprovalRulePredicateSetMessagePayloadBuilder approvalRulePredicateSetBuilder() {
        return com.commercetools.api.models.message.ApprovalRulePredicateSetMessagePayloadBuilder.of();
    }

    /**
     * builder for approvalRuleRequestersSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ApprovalRuleRequestersSetMessagePayloadBuilder approvalRuleRequestersSetBuilder() {
        return com.commercetools.api.models.message.ApprovalRuleRequestersSetMessagePayloadBuilder.of();
    }

    /**
     * builder for approvalRuleStatusSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ApprovalRuleStatusSetMessagePayloadBuilder approvalRuleStatusSetBuilder() {
        return com.commercetools.api.models.message.ApprovalRuleStatusSetMessagePayloadBuilder.of();
    }

    /**
     * builder for associateRoleBuyerAssignableChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.AssociateRoleBuyerAssignableChangedMessagePayloadBuilder associateRoleBuyerAssignableChangedBuilder() {
        return com.commercetools.api.models.message.AssociateRoleBuyerAssignableChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for associateRoleCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.AssociateRoleCreatedMessagePayloadBuilder associateRoleCreatedBuilder() {
        return com.commercetools.api.models.message.AssociateRoleCreatedMessagePayloadBuilder.of();
    }

    /**
     * builder for associateRoleDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.AssociateRoleDeletedMessagePayloadBuilder associateRoleDeletedBuilder() {
        return com.commercetools.api.models.message.AssociateRoleDeletedMessagePayloadBuilder.of();
    }

    /**
     * builder for associateRoleNameSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.AssociateRoleNameSetMessagePayloadBuilder associateRoleNameSetBuilder() {
        return com.commercetools.api.models.message.AssociateRoleNameSetMessagePayloadBuilder.of();
    }

    /**
     * builder for associateRolePermissionAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.AssociateRolePermissionAddedMessagePayloadBuilder associateRolePermissionAddedBuilder() {
        return com.commercetools.api.models.message.AssociateRolePermissionAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for associateRolePermissionRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.AssociateRolePermissionRemovedMessagePayloadBuilder associateRolePermissionRemovedBuilder() {
        return com.commercetools.api.models.message.AssociateRolePermissionRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for associateRolePermissionsSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.AssociateRolePermissionsSetMessagePayloadBuilder associateRolePermissionsSetBuilder() {
        return com.commercetools.api.models.message.AssociateRolePermissionsSetMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitAddressAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAddressAddedMessagePayloadBuilder businessUnitAddressAddedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAddressAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitAddressChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAddressChangedMessagePayloadBuilder businessUnitAddressChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAddressChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitAddressCustomFieldAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAddressCustomFieldAddedMessagePayloadBuilder businessUnitAddressCustomFieldAddedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAddressCustomFieldAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitAddressCustomFieldChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAddressCustomFieldChangedMessagePayloadBuilder businessUnitAddressCustomFieldChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAddressCustomFieldChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitAddressCustomFieldRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAddressCustomFieldRemovedMessagePayloadBuilder businessUnitAddressCustomFieldRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAddressCustomFieldRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitAddressCustomTypeRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAddressCustomTypeRemovedMessagePayloadBuilder businessUnitAddressCustomTypeRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAddressCustomTypeRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitAddressCustomTypeSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAddressCustomTypeSetMessagePayloadBuilder businessUnitAddressCustomTypeSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAddressCustomTypeSetMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitAddressRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAddressRemovedMessagePayloadBuilder businessUnitAddressRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAddressRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitApprovalRuleModeChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitApprovalRuleModeChangedMessagePayloadBuilder businessUnitApprovalRuleModeChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitApprovalRuleModeChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitAssociateAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAssociateAddedMessagePayloadBuilder businessUnitAssociateAddedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAssociateAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitAssociateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAssociateChangedMessagePayloadBuilder businessUnitAssociateChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAssociateChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitAssociateModeChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAssociateModeChangedMessagePayloadBuilder businessUnitAssociateModeChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAssociateModeChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitAssociateRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAssociateRemovedMessagePayloadBuilder businessUnitAssociateRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAssociateRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitAssociatesSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAssociatesSetMessagePayloadBuilder businessUnitAssociatesSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAssociatesSetMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitBillingAddressAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitBillingAddressAddedMessagePayloadBuilder businessUnitBillingAddressAddedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitBillingAddressAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitBillingAddressRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitBillingAddressRemovedMessagePayloadBuilder businessUnitBillingAddressRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitBillingAddressRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitContactEmailSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitContactEmailSetMessagePayloadBuilder businessUnitContactEmailSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitContactEmailSetMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitCreatedMessagePayloadBuilder businessUnitCreatedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitCreatedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitCustomFieldAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitCustomFieldAddedMessagePayloadBuilder businessUnitCustomFieldAddedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitCustomFieldAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitCustomFieldChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitCustomFieldChangedMessagePayloadBuilder businessUnitCustomFieldChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitCustomFieldChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitCustomFieldRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitCustomFieldRemovedMessagePayloadBuilder businessUnitCustomFieldRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitCustomFieldRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitCustomTypeRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitCustomTypeRemovedMessagePayloadBuilder businessUnitCustomTypeRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitCustomTypeRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitCustomTypeSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitCustomTypeSetMessagePayloadBuilder businessUnitCustomTypeSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitCustomTypeSetMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitDefaultBillingAddressSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitDefaultBillingAddressSetMessagePayloadBuilder businessUnitDefaultBillingAddressSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitDefaultBillingAddressSetMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitDefaultShippingAddressSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitDefaultShippingAddressSetMessagePayloadBuilder businessUnitDefaultShippingAddressSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitDefaultShippingAddressSetMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitDeletedMessagePayloadBuilder businessUnitDeletedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitDeletedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitNameChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitNameChangedMessagePayloadBuilder businessUnitNameChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitNameChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitParentChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitParentChangedMessagePayloadBuilder businessUnitParentChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitParentChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitShippingAddressAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitShippingAddressAddedMessagePayloadBuilder businessUnitShippingAddressAddedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitShippingAddressAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitShippingAddressRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitShippingAddressRemovedMessagePayloadBuilder businessUnitShippingAddressRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitShippingAddressRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitStatusChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitStatusChangedMessagePayloadBuilder businessUnitStatusChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitStatusChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitStoreAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitStoreAddedMessagePayloadBuilder businessUnitStoreAddedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitStoreAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitStoreModeChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitStoreModeChangedMessagePayloadBuilder businessUnitStoreModeChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitStoreModeChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitStoreRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitStoreRemovedMessagePayloadBuilder businessUnitStoreRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitStoreRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitStoresSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitStoresSetMessagePayloadBuilder businessUnitStoresSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitStoresSetMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitTopLevelUnitSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitTopLevelUnitSetMessagePayloadBuilder businessUnitTopLevelUnitSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitTopLevelUnitSetMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitTypeSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitTypeSetMessagePayloadBuilder businessUnitTypeSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitTypeSetMessagePayloadBuilder.of();
    }

    /**
     * builder for cartDiscountCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CartDiscountCreatedMessagePayloadBuilder cartDiscountCreatedBuilder() {
        return com.commercetools.api.models.message.CartDiscountCreatedMessagePayloadBuilder.of();
    }

    /**
     * builder for cartDiscountDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CartDiscountDeletedMessagePayloadBuilder cartDiscountDeletedBuilder() {
        return com.commercetools.api.models.message.CartDiscountDeletedMessagePayloadBuilder.of();
    }

    /**
     * builder for cartDiscountStoreAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CartDiscountStoreAddedMessagePayloadBuilder cartDiscountStoreAddedBuilder() {
        return com.commercetools.api.models.message.CartDiscountStoreAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for cartDiscountStoreRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CartDiscountStoreRemovedMessagePayloadBuilder cartDiscountStoreRemovedBuilder() {
        return com.commercetools.api.models.message.CartDiscountStoreRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for cartDiscountStoresSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CartDiscountStoresSetMessagePayloadBuilder cartDiscountStoresSetBuilder() {
        return com.commercetools.api.models.message.CartDiscountStoresSetMessagePayloadBuilder.of();
    }

    /**
     * builder for categoryCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CategoryCreatedMessagePayloadBuilder categoryCreatedBuilder() {
        return com.commercetools.api.models.message.CategoryCreatedMessagePayloadBuilder.of();
    }

    /**
     * builder for categorySlugChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CategorySlugChangedMessagePayloadBuilder categorySlugChangedBuilder() {
        return com.commercetools.api.models.message.CategorySlugChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for customLineItemStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomLineItemStateTransitionMessagePayloadBuilder customLineItemStateTransitionBuilder() {
        return com.commercetools.api.models.message.CustomLineItemStateTransitionMessagePayloadBuilder.of();
    }

    /**
     * builder for customerAddressAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerAddressAddedMessagePayloadBuilder customerAddressAddedBuilder() {
        return com.commercetools.api.models.message.CustomerAddressAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for customerAddressChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerAddressChangedMessagePayloadBuilder customerAddressChangedBuilder() {
        return com.commercetools.api.models.message.CustomerAddressChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for customerAddressCustomFieldAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerAddressCustomFieldAddedMessagePayloadBuilder customerAddressCustomFieldAddedBuilder() {
        return com.commercetools.api.models.message.CustomerAddressCustomFieldAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for customerAddressCustomFieldChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerAddressCustomFieldChangedMessagePayloadBuilder customerAddressCustomFieldChangedBuilder() {
        return com.commercetools.api.models.message.CustomerAddressCustomFieldChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for customerAddressCustomFieldRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerAddressCustomFieldRemovedMessagePayloadBuilder customerAddressCustomFieldRemovedBuilder() {
        return com.commercetools.api.models.message.CustomerAddressCustomFieldRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for customerAddressCustomTypeRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerAddressCustomTypeRemovedMessagePayloadBuilder customerAddressCustomTypeRemovedBuilder() {
        return com.commercetools.api.models.message.CustomerAddressCustomTypeRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for customerAddressCustomTypeSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerAddressCustomTypeSetMessagePayloadBuilder customerAddressCustomTypeSetBuilder() {
        return com.commercetools.api.models.message.CustomerAddressCustomTypeSetMessagePayloadBuilder.of();
    }

    /**
     * builder for customerAddressRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerAddressRemovedMessagePayloadBuilder customerAddressRemovedBuilder() {
        return com.commercetools.api.models.message.CustomerAddressRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for customerCompanyNameSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerCompanyNameSetMessagePayloadBuilder customerCompanyNameSetBuilder() {
        return com.commercetools.api.models.message.CustomerCompanyNameSetMessagePayloadBuilder.of();
    }

    /**
     * builder for customerCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerCreatedMessagePayloadBuilder customerCreatedBuilder() {
        return com.commercetools.api.models.message.CustomerCreatedMessagePayloadBuilder.of();
    }

    /**
     * builder for customerCustomFieldAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerCustomFieldAddedMessagePayloadBuilder customerCustomFieldAddedBuilder() {
        return com.commercetools.api.models.message.CustomerCustomFieldAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for customerCustomFieldChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerCustomFieldChangedMessagePayloadBuilder customerCustomFieldChangedBuilder() {
        return com.commercetools.api.models.message.CustomerCustomFieldChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for customerCustomFieldRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerCustomFieldRemovedMessagePayloadBuilder customerCustomFieldRemovedBuilder() {
        return com.commercetools.api.models.message.CustomerCustomFieldRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for customerCustomTypeRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerCustomTypeRemovedMessagePayloadBuilder customerCustomTypeRemovedBuilder() {
        return com.commercetools.api.models.message.CustomerCustomTypeRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for customerCustomTypeSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerCustomTypeSetMessagePayloadBuilder customerCustomTypeSetBuilder() {
        return com.commercetools.api.models.message.CustomerCustomTypeSetMessagePayloadBuilder.of();
    }

    /**
     * builder for customerDateOfBirthSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerDateOfBirthSetMessagePayloadBuilder customerDateOfBirthSetBuilder() {
        return com.commercetools.api.models.message.CustomerDateOfBirthSetMessagePayloadBuilder.of();
    }

    /**
     * builder for customerDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerDeletedMessagePayloadBuilder customerDeletedBuilder() {
        return com.commercetools.api.models.message.CustomerDeletedMessagePayloadBuilder.of();
    }

    /**
     * builder for customerEmailChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerEmailChangedMessagePayloadBuilder customerEmailChangedBuilder() {
        return com.commercetools.api.models.message.CustomerEmailChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for customerEmailTokenCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerEmailTokenCreatedMessagePayloadBuilder customerEmailTokenCreatedBuilder() {
        return com.commercetools.api.models.message.CustomerEmailTokenCreatedMessagePayloadBuilder.of();
    }

    /**
     * builder for customerEmailVerified subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerEmailVerifiedMessagePayloadBuilder customerEmailVerifiedBuilder() {
        return com.commercetools.api.models.message.CustomerEmailVerifiedMessagePayloadBuilder.of();
    }

    /**
     * builder for customerFirstNameSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerFirstNameSetMessagePayloadBuilder customerFirstNameSetBuilder() {
        return com.commercetools.api.models.message.CustomerFirstNameSetMessagePayloadBuilder.of();
    }

    /**
     * builder for customerGroupAssignmentAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerGroupAssignmentAddedMessagePayloadBuilder customerGroupAssignmentAddedBuilder() {
        return com.commercetools.api.models.message.CustomerGroupAssignmentAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for customerGroupAssignmentRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerGroupAssignmentRemovedMessagePayloadBuilder customerGroupAssignmentRemovedBuilder() {
        return com.commercetools.api.models.message.CustomerGroupAssignmentRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for customerGroupAssignmentsSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerGroupAssignmentsSetMessagePayloadBuilder customerGroupAssignmentsSetBuilder() {
        return com.commercetools.api.models.message.CustomerGroupAssignmentsSetMessagePayloadBuilder.of();
    }

    /**
     * builder for customerGroupCustomFieldAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerGroupCustomFieldAddedMessagePayloadBuilder customerGroupCustomFieldAddedBuilder() {
        return com.commercetools.api.models.message.CustomerGroupCustomFieldAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for customerGroupCustomFieldChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerGroupCustomFieldChangedMessagePayloadBuilder customerGroupCustomFieldChangedBuilder() {
        return com.commercetools.api.models.message.CustomerGroupCustomFieldChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for customerGroupCustomFieldRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerGroupCustomFieldRemovedMessagePayloadBuilder customerGroupCustomFieldRemovedBuilder() {
        return com.commercetools.api.models.message.CustomerGroupCustomFieldRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for customerGroupCustomTypeRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerGroupCustomTypeRemovedMessagePayloadBuilder customerGroupCustomTypeRemovedBuilder() {
        return com.commercetools.api.models.message.CustomerGroupCustomTypeRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for customerGroupCustomTypeSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerGroupCustomTypeSetMessagePayloadBuilder customerGroupCustomTypeSetBuilder() {
        return com.commercetools.api.models.message.CustomerGroupCustomTypeSetMessagePayloadBuilder.of();
    }

    /**
     * builder for customerGroupSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerGroupSetMessagePayloadBuilder customerGroupSetBuilder() {
        return com.commercetools.api.models.message.CustomerGroupSetMessagePayloadBuilder.of();
    }

    /**
     * builder for customerLastNameSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerLastNameSetMessagePayloadBuilder customerLastNameSetBuilder() {
        return com.commercetools.api.models.message.CustomerLastNameSetMessagePayloadBuilder.of();
    }

    /**
     * builder for customerPasswordTokenCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerPasswordTokenCreatedMessagePayloadBuilder customerPasswordTokenCreatedBuilder() {
        return com.commercetools.api.models.message.CustomerPasswordTokenCreatedMessagePayloadBuilder.of();
    }

    /**
     * builder for customerPasswordUpdated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerPasswordUpdatedMessagePayloadBuilder customerPasswordUpdatedBuilder() {
        return com.commercetools.api.models.message.CustomerPasswordUpdatedMessagePayloadBuilder.of();
    }

    /**
     * builder for customerTitleSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerTitleSetMessagePayloadBuilder customerTitleSetBuilder() {
        return com.commercetools.api.models.message.CustomerTitleSetMessagePayloadBuilder.of();
    }

    /**
     * builder for deliveryAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DeliveryAddedMessagePayloadBuilder deliveryAddedBuilder() {
        return com.commercetools.api.models.message.DeliveryAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for deliveryAddressSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DeliveryAddressSetMessagePayloadBuilder deliveryAddressSetBuilder() {
        return com.commercetools.api.models.message.DeliveryAddressSetMessagePayloadBuilder.of();
    }

    /**
     * builder for deliveryCustomFieldAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DeliveryCustomFieldAddedMessagePayloadBuilder deliveryCustomFieldAddedBuilder() {
        return com.commercetools.api.models.message.DeliveryCustomFieldAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for deliveryCustomFieldChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DeliveryCustomFieldChangedMessagePayloadBuilder deliveryCustomFieldChangedBuilder() {
        return com.commercetools.api.models.message.DeliveryCustomFieldChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for deliveryCustomFieldRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DeliveryCustomFieldRemovedMessagePayloadBuilder deliveryCustomFieldRemovedBuilder() {
        return com.commercetools.api.models.message.DeliveryCustomFieldRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for deliveryCustomTypeRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DeliveryCustomTypeRemovedMessagePayloadBuilder deliveryCustomTypeRemovedBuilder() {
        return com.commercetools.api.models.message.DeliveryCustomTypeRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for deliveryCustomTypeSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DeliveryCustomTypeSetMessagePayloadBuilder deliveryCustomTypeSetBuilder() {
        return com.commercetools.api.models.message.DeliveryCustomTypeSetMessagePayloadBuilder.of();
    }

    /**
     * builder for deliveryItemsUpdated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DeliveryItemsUpdatedMessagePayloadBuilder deliveryItemsUpdatedBuilder() {
        return com.commercetools.api.models.message.DeliveryItemsUpdatedMessagePayloadBuilder.of();
    }

    /**
     * builder for deliveryRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DeliveryRemovedMessagePayloadBuilder deliveryRemovedBuilder() {
        return com.commercetools.api.models.message.DeliveryRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for discountCodeCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DiscountCodeCreatedMessagePayloadBuilder discountCodeCreatedBuilder() {
        return com.commercetools.api.models.message.DiscountCodeCreatedMessagePayloadBuilder.of();
    }

    /**
     * builder for discountCodeDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DiscountCodeDeletedMessagePayloadBuilder discountCodeDeletedBuilder() {
        return com.commercetools.api.models.message.DiscountCodeDeletedMessagePayloadBuilder.of();
    }

    /**
     * builder for discountCodeKeySet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DiscountCodeKeySetMessagePayloadBuilder discountCodeKeySetBuilder() {
        return com.commercetools.api.models.message.DiscountCodeKeySetMessagePayloadBuilder.of();
    }

    /**
     * builder for discountGroupCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DiscountGroupCreatedMessagePayloadBuilder discountGroupCreatedBuilder() {
        return com.commercetools.api.models.message.DiscountGroupCreatedMessagePayloadBuilder.of();
    }

    /**
     * builder for discountGroupDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DiscountGroupDeletedMessagePayloadBuilder discountGroupDeletedBuilder() {
        return com.commercetools.api.models.message.DiscountGroupDeletedMessagePayloadBuilder.of();
    }

    /**
     * builder for discountGroupKeySet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DiscountGroupKeySetMessagePayloadBuilder discountGroupKeySetBuilder() {
        return com.commercetools.api.models.message.DiscountGroupKeySetMessagePayloadBuilder.of();
    }

    /**
     * builder for discountGroupSortOrderSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DiscountGroupSortOrderSetMessagePayloadBuilder discountGroupSortOrderSetBuilder() {
        return com.commercetools.api.models.message.DiscountGroupSortOrderSetMessagePayloadBuilder.of();
    }

    /**
     * builder for inventoryEntryCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.InventoryEntryCreatedMessagePayloadBuilder inventoryEntryCreatedBuilder() {
        return com.commercetools.api.models.message.InventoryEntryCreatedMessagePayloadBuilder.of();
    }

    /**
     * builder for inventoryEntryDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.InventoryEntryDeletedMessagePayloadBuilder inventoryEntryDeletedBuilder() {
        return com.commercetools.api.models.message.InventoryEntryDeletedMessagePayloadBuilder.of();
    }

    /**
     * builder for inventoryEntryQuantitySet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.InventoryEntryQuantitySetMessagePayloadBuilder inventoryEntryQuantitySetBuilder() {
        return com.commercetools.api.models.message.InventoryEntryQuantitySetMessagePayloadBuilder.of();
    }

    /**
     * builder for lineItemStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.LineItemStateTransitionMessagePayloadBuilder lineItemStateTransitionBuilder() {
        return com.commercetools.api.models.message.LineItemStateTransitionMessagePayloadBuilder.of();
    }

    /**
     * builder for orderBillingAddressSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderBillingAddressSetMessagePayloadBuilder orderBillingAddressSetBuilder() {
        return com.commercetools.api.models.message.OrderBillingAddressSetMessagePayloadBuilder.of();
    }

    /**
     * builder for orderBusinessUnitSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderBusinessUnitSetMessagePayloadBuilder orderBusinessUnitSetBuilder() {
        return com.commercetools.api.models.message.OrderBusinessUnitSetMessagePayloadBuilder.of();
    }

    /**
     * builder for orderCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCreatedMessagePayloadBuilder orderCreatedBuilder() {
        return com.commercetools.api.models.message.OrderCreatedMessagePayloadBuilder.of();
    }

    /**
     * builder for orderCustomFieldAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomFieldAddedMessagePayloadBuilder orderCustomFieldAddedBuilder() {
        return com.commercetools.api.models.message.OrderCustomFieldAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for orderCustomFieldChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomFieldChangedMessagePayloadBuilder orderCustomFieldChangedBuilder() {
        return com.commercetools.api.models.message.OrderCustomFieldChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for orderCustomFieldRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomFieldRemovedMessagePayloadBuilder orderCustomFieldRemovedBuilder() {
        return com.commercetools.api.models.message.OrderCustomFieldRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for orderCustomLineItemAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomLineItemAddedMessagePayloadBuilder orderCustomLineItemAddedBuilder() {
        return com.commercetools.api.models.message.OrderCustomLineItemAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for orderCustomLineItemDiscountSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessagePayloadBuilder orderCustomLineItemDiscountSetBuilder() {
        return com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessagePayloadBuilder.of();
    }

    /**
     * builder for orderCustomLineItemQuantityChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomLineItemQuantityChangedMessagePayloadBuilder orderCustomLineItemQuantityChangedBuilder() {
        return com.commercetools.api.models.message.OrderCustomLineItemQuantityChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for orderCustomLineItemRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomLineItemRemovedMessagePayloadBuilder orderCustomLineItemRemovedBuilder() {
        return com.commercetools.api.models.message.OrderCustomLineItemRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for orderCustomTypeRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomTypeRemovedMessagePayloadBuilder orderCustomTypeRemovedBuilder() {
        return com.commercetools.api.models.message.OrderCustomTypeRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for orderCustomTypeSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomTypeSetMessagePayloadBuilder orderCustomTypeSetBuilder() {
        return com.commercetools.api.models.message.OrderCustomTypeSetMessagePayloadBuilder.of();
    }

    /**
     * builder for orderCustomerEmailSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomerEmailSetMessagePayloadBuilder orderCustomerEmailSetBuilder() {
        return com.commercetools.api.models.message.OrderCustomerEmailSetMessagePayloadBuilder.of();
    }

    /**
     * builder for orderCustomerGroupSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomerGroupSetMessagePayloadBuilder orderCustomerGroupSetBuilder() {
        return com.commercetools.api.models.message.OrderCustomerGroupSetMessagePayloadBuilder.of();
    }

    /**
     * builder for orderCustomerSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomerSetMessagePayloadBuilder orderCustomerSetBuilder() {
        return com.commercetools.api.models.message.OrderCustomerSetMessagePayloadBuilder.of();
    }

    /**
     * builder for orderDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderDeletedMessagePayloadBuilder orderDeletedBuilder() {
        return com.commercetools.api.models.message.OrderDeletedMessagePayloadBuilder.of();
    }

    /**
     * builder for orderDiscountCodeAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderDiscountCodeAddedMessagePayloadBuilder orderDiscountCodeAddedBuilder() {
        return com.commercetools.api.models.message.OrderDiscountCodeAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for orderDiscountCodeRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderDiscountCodeRemovedMessagePayloadBuilder orderDiscountCodeRemovedBuilder() {
        return com.commercetools.api.models.message.OrderDiscountCodeRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for orderDiscountCodeStateSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderDiscountCodeStateSetMessagePayloadBuilder orderDiscountCodeStateSetBuilder() {
        return com.commercetools.api.models.message.OrderDiscountCodeStateSetMessagePayloadBuilder.of();
    }

    /**
     * builder for orderEditApplied subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderEditAppliedMessagePayloadBuilder orderEditAppliedBuilder() {
        return com.commercetools.api.models.message.OrderEditAppliedMessagePayloadBuilder.of();
    }

    /**
     * builder for orderImported subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderImportedMessagePayloadBuilder orderImportedBuilder() {
        return com.commercetools.api.models.message.OrderImportedMessagePayloadBuilder.of();
    }

    /**
     * builder for orderLineItemAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderLineItemAddedMessagePayloadBuilder orderLineItemAddedBuilder() {
        return com.commercetools.api.models.message.OrderLineItemAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for orderLineItemDiscountSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderLineItemDiscountSetMessagePayloadBuilder orderLineItemDiscountSetBuilder() {
        return com.commercetools.api.models.message.OrderLineItemDiscountSetMessagePayloadBuilder.of();
    }

    /**
     * builder for orderLineItemDistributionChannelSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderLineItemDistributionChannelSetMessagePayloadBuilder orderLineItemDistributionChannelSetBuilder() {
        return com.commercetools.api.models.message.OrderLineItemDistributionChannelSetMessagePayloadBuilder.of();
    }

    /**
     * builder for orderLineItemRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderLineItemRemovedMessagePayloadBuilder orderLineItemRemovedBuilder() {
        return com.commercetools.api.models.message.OrderLineItemRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for orderPaymentAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderPaymentAddedMessagePayloadBuilder orderPaymentAddedBuilder() {
        return com.commercetools.api.models.message.OrderPaymentAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for orderPaymentStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderPaymentStateChangedMessagePayloadBuilder orderPaymentStateChangedBuilder() {
        return com.commercetools.api.models.message.OrderPaymentStateChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for orderPurchaseOrderNumberSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderPurchaseOrderNumberSetMessagePayloadBuilder orderPurchaseOrderNumberSetBuilder() {
        return com.commercetools.api.models.message.OrderPurchaseOrderNumberSetMessagePayloadBuilder.of();
    }

    /**
     * builder for orderReturnShipmentStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderReturnShipmentStateChangedMessagePayloadBuilder orderReturnShipmentStateChangedBuilder() {
        return com.commercetools.api.models.message.OrderReturnShipmentStateChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for orderShipmentStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderShipmentStateChangedMessagePayloadBuilder orderShipmentStateChangedBuilder() {
        return com.commercetools.api.models.message.OrderShipmentStateChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for orderShippingAddressSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderShippingAddressSetMessagePayloadBuilder orderShippingAddressSetBuilder() {
        return com.commercetools.api.models.message.OrderShippingAddressSetMessagePayloadBuilder.of();
    }

    /**
     * builder for orderShippingInfoSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderShippingInfoSetMessagePayloadBuilder orderShippingInfoSetBuilder() {
        return com.commercetools.api.models.message.OrderShippingInfoSetMessagePayloadBuilder.of();
    }

    /**
     * builder for orderShippingRateInputSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderShippingRateInputSetMessagePayloadBuilder orderShippingRateInputSetBuilder() {
        return com.commercetools.api.models.message.OrderShippingRateInputSetMessagePayloadBuilder.of();
    }

    /**
     * builder for orderStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderStateChangedMessagePayloadBuilder orderStateChangedBuilder() {
        return com.commercetools.api.models.message.OrderStateChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for orderStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderStateTransitionMessagePayloadBuilder orderStateTransitionBuilder() {
        return com.commercetools.api.models.message.OrderStateTransitionMessagePayloadBuilder.of();
    }

    /**
     * builder for orderStoreSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderStoreSetMessagePayloadBuilder orderStoreSetBuilder() {
        return com.commercetools.api.models.message.OrderStoreSetMessagePayloadBuilder.of();
    }

    /**
     * builder for parcelAddedToDelivery subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ParcelAddedToDeliveryMessagePayloadBuilder parcelAddedToDeliveryBuilder() {
        return com.commercetools.api.models.message.ParcelAddedToDeliveryMessagePayloadBuilder.of();
    }

    /**
     * builder for parcelItemsUpdated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ParcelItemsUpdatedMessagePayloadBuilder parcelItemsUpdatedBuilder() {
        return com.commercetools.api.models.message.ParcelItemsUpdatedMessagePayloadBuilder.of();
    }

    /**
     * builder for parcelMeasurementsUpdated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ParcelMeasurementsUpdatedMessagePayloadBuilder parcelMeasurementsUpdatedBuilder() {
        return com.commercetools.api.models.message.ParcelMeasurementsUpdatedMessagePayloadBuilder.of();
    }

    /**
     * builder for parcelRemovedFromDelivery subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ParcelRemovedFromDeliveryMessagePayloadBuilder parcelRemovedFromDeliveryBuilder() {
        return com.commercetools.api.models.message.ParcelRemovedFromDeliveryMessagePayloadBuilder.of();
    }

    /**
     * builder for parcelTrackingDataUpdated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ParcelTrackingDataUpdatedMessagePayloadBuilder parcelTrackingDataUpdatedBuilder() {
        return com.commercetools.api.models.message.ParcelTrackingDataUpdatedMessagePayloadBuilder.of();
    }

    /**
     * builder for paymentCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentCreatedMessagePayloadBuilder paymentCreatedBuilder() {
        return com.commercetools.api.models.message.PaymentCreatedMessagePayloadBuilder.of();
    }

    /**
     * builder for paymentInteractionAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentInteractionAddedMessagePayloadBuilder paymentInteractionAddedBuilder() {
        return com.commercetools.api.models.message.PaymentInteractionAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for paymentInterfaceIdSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentInterfaceIdSetMessagePayloadBuilder paymentInterfaceIdSetBuilder() {
        return com.commercetools.api.models.message.PaymentInterfaceIdSetMessagePayloadBuilder.of();
    }

    /**
     * builder for paymentMethodCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodCreatedMessagePayloadBuilder paymentMethodCreatedBuilder() {
        return com.commercetools.api.models.message.PaymentMethodCreatedMessagePayloadBuilder.of();
    }

    /**
     * builder for paymentMethodCustomFieldAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodCustomFieldAddedMessagePayloadBuilder paymentMethodCustomFieldAddedBuilder() {
        return com.commercetools.api.models.message.PaymentMethodCustomFieldAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for paymentMethodCustomFieldChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodCustomFieldChangedMessagePayloadBuilder paymentMethodCustomFieldChangedBuilder() {
        return com.commercetools.api.models.message.PaymentMethodCustomFieldChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for paymentMethodCustomFieldRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodCustomFieldRemovedMessagePayloadBuilder paymentMethodCustomFieldRemovedBuilder() {
        return com.commercetools.api.models.message.PaymentMethodCustomFieldRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for paymentMethodCustomTypeRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodCustomTypeRemovedMessagePayloadBuilder paymentMethodCustomTypeRemovedBuilder() {
        return com.commercetools.api.models.message.PaymentMethodCustomTypeRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for paymentMethodCustomTypeSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodCustomTypeSetMessagePayloadBuilder paymentMethodCustomTypeSetBuilder() {
        return com.commercetools.api.models.message.PaymentMethodCustomTypeSetMessagePayloadBuilder.of();
    }

    /**
     * builder for paymentMethodDefaultSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodDefaultSetMessagePayloadBuilder paymentMethodDefaultSetBuilder() {
        return com.commercetools.api.models.message.PaymentMethodDefaultSetMessagePayloadBuilder.of();
    }

    /**
     * builder for paymentMethodDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodDeletedMessagePayloadBuilder paymentMethodDeletedBuilder() {
        return com.commercetools.api.models.message.PaymentMethodDeletedMessagePayloadBuilder.of();
    }

    /**
     * builder for paymentMethodInfoCustomFieldAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodInfoCustomFieldAddedMessagePayloadBuilder paymentMethodInfoCustomFieldAddedBuilder() {
        return com.commercetools.api.models.message.PaymentMethodInfoCustomFieldAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for paymentMethodInfoCustomFieldChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodInfoCustomFieldChangedMessagePayloadBuilder paymentMethodInfoCustomFieldChangedBuilder() {
        return com.commercetools.api.models.message.PaymentMethodInfoCustomFieldChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for paymentMethodInfoCustomFieldRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodInfoCustomFieldRemovedMessagePayloadBuilder paymentMethodInfoCustomFieldRemovedBuilder() {
        return com.commercetools.api.models.message.PaymentMethodInfoCustomFieldRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for paymentMethodInfoCustomTypeRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodInfoCustomTypeRemovedMessagePayloadBuilder paymentMethodInfoCustomTypeRemovedBuilder() {
        return com.commercetools.api.models.message.PaymentMethodInfoCustomTypeRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for paymentMethodInfoCustomTypeSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodInfoCustomTypeSetMessagePayloadBuilder paymentMethodInfoCustomTypeSetBuilder() {
        return com.commercetools.api.models.message.PaymentMethodInfoCustomTypeSetMessagePayloadBuilder.of();
    }

    /**
     * builder for paymentMethodInfoInterfaceAccountSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodInfoInterfaceAccountSetMessagePayloadBuilder paymentMethodInfoInterfaceAccountSetBuilder() {
        return com.commercetools.api.models.message.PaymentMethodInfoInterfaceAccountSetMessagePayloadBuilder.of();
    }

    /**
     * builder for paymentMethodInfoInterfaceSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodInfoInterfaceSetMessagePayloadBuilder paymentMethodInfoInterfaceSetBuilder() {
        return com.commercetools.api.models.message.PaymentMethodInfoInterfaceSetMessagePayloadBuilder.of();
    }

    /**
     * builder for paymentMethodInfoMethodSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodInfoMethodSetMessagePayloadBuilder paymentMethodInfoMethodSetBuilder() {
        return com.commercetools.api.models.message.PaymentMethodInfoMethodSetMessagePayloadBuilder.of();
    }

    /**
     * builder for paymentMethodInfoNameSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodInfoNameSetMessagePayloadBuilder paymentMethodInfoNameSetBuilder() {
        return com.commercetools.api.models.message.PaymentMethodInfoNameSetMessagePayloadBuilder.of();
    }

    /**
     * builder for paymentMethodInfoTokenSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodInfoTokenSetMessagePayloadBuilder paymentMethodInfoTokenSetBuilder() {
        return com.commercetools.api.models.message.PaymentMethodInfoTokenSetMessagePayloadBuilder.of();
    }

    /**
     * builder for paymentMethodInterfaceAccountSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodInterfaceAccountSetMessagePayloadBuilder paymentMethodInterfaceAccountSetBuilder() {
        return com.commercetools.api.models.message.PaymentMethodInterfaceAccountSetMessagePayloadBuilder.of();
    }

    /**
     * builder for paymentMethodKeySet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodKeySetMessagePayloadBuilder paymentMethodKeySetBuilder() {
        return com.commercetools.api.models.message.PaymentMethodKeySetMessagePayloadBuilder.of();
    }

    /**
     * builder for paymentMethodMethodSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodMethodSetMessagePayloadBuilder paymentMethodMethodSetBuilder() {
        return com.commercetools.api.models.message.PaymentMethodMethodSetMessagePayloadBuilder.of();
    }

    /**
     * builder for paymentMethodNameSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodNameSetMessagePayloadBuilder paymentMethodNameSetBuilder() {
        return com.commercetools.api.models.message.PaymentMethodNameSetMessagePayloadBuilder.of();
    }

    /**
     * builder for paymentMethodPaymentInterfaceSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodPaymentInterfaceSetMessagePayloadBuilder paymentMethodPaymentInterfaceSetBuilder() {
        return com.commercetools.api.models.message.PaymentMethodPaymentInterfaceSetMessagePayloadBuilder.of();
    }

    /**
     * builder for paymentMethodPaymentMethodStatusSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodPaymentMethodStatusSetMessagePayloadBuilder paymentMethodPaymentMethodStatusSetBuilder() {
        return com.commercetools.api.models.message.PaymentMethodPaymentMethodStatusSetMessagePayloadBuilder.of();
    }

    /**
     * builder for paymentStatusInterfaceCodeSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentStatusInterfaceCodeSetMessagePayloadBuilder paymentStatusInterfaceCodeSetBuilder() {
        return com.commercetools.api.models.message.PaymentStatusInterfaceCodeSetMessagePayloadBuilder.of();
    }

    /**
     * builder for paymentStatusStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentStatusStateTransitionMessagePayloadBuilder paymentStatusStateTransitionBuilder() {
        return com.commercetools.api.models.message.PaymentStatusStateTransitionMessagePayloadBuilder.of();
    }

    /**
     * builder for paymentTransactionAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentTransactionAddedMessagePayloadBuilder paymentTransactionAddedBuilder() {
        return com.commercetools.api.models.message.PaymentTransactionAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for paymentTransactionStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentTransactionStateChangedMessagePayloadBuilder paymentTransactionStateChangedBuilder() {
        return com.commercetools.api.models.message.PaymentTransactionStateChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for productAddedToCategory subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductAddedToCategoryMessagePayloadBuilder productAddedToCategoryBuilder() {
        return com.commercetools.api.models.message.ProductAddedToCategoryMessagePayloadBuilder.of();
    }

    /**
     * builder for productCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductCreatedMessagePayloadBuilder productCreatedBuilder() {
        return com.commercetools.api.models.message.ProductCreatedMessagePayloadBuilder.of();
    }

    /**
     * builder for productDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductDeletedMessagePayloadBuilder productDeletedBuilder() {
        return com.commercetools.api.models.message.ProductDeletedMessagePayloadBuilder.of();
    }

    /**
     * builder for productImageAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductImageAddedMessagePayloadBuilder productImageAddedBuilder() {
        return com.commercetools.api.models.message.ProductImageAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for productPriceAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceAddedMessagePayloadBuilder productPriceAddedBuilder() {
        return com.commercetools.api.models.message.ProductPriceAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for productPriceChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceChangedMessagePayloadBuilder productPriceChangedBuilder() {
        return com.commercetools.api.models.message.ProductPriceChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for productPriceCustomFieldAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceCustomFieldAddedMessagePayloadBuilder productPriceCustomFieldAddedBuilder() {
        return com.commercetools.api.models.message.ProductPriceCustomFieldAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for productPriceCustomFieldChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceCustomFieldChangedMessagePayloadBuilder productPriceCustomFieldChangedBuilder() {
        return com.commercetools.api.models.message.ProductPriceCustomFieldChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for productPriceCustomFieldRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceCustomFieldRemovedMessagePayloadBuilder productPriceCustomFieldRemovedBuilder() {
        return com.commercetools.api.models.message.ProductPriceCustomFieldRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for productPriceCustomFieldsRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceCustomFieldsRemovedMessagePayloadBuilder productPriceCustomFieldsRemovedBuilder() {
        return com.commercetools.api.models.message.ProductPriceCustomFieldsRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for productPriceCustomFieldsSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceCustomFieldsSetMessagePayloadBuilder productPriceCustomFieldsSetBuilder() {
        return com.commercetools.api.models.message.ProductPriceCustomFieldsSetMessagePayloadBuilder.of();
    }

    /**
     * builder for productPriceDiscountsSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceDiscountsSetMessagePayloadBuilder productPriceDiscountsSetBuilder() {
        return com.commercetools.api.models.message.ProductPriceDiscountsSetMessagePayloadBuilder.of();
    }

    /**
     * builder for productPriceExternalDiscountSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessagePayloadBuilder productPriceExternalDiscountSetBuilder() {
        return com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessagePayloadBuilder.of();
    }

    /**
     * builder for productPriceKeySet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceKeySetMessagePayloadBuilder productPriceKeySetBuilder() {
        return com.commercetools.api.models.message.ProductPriceKeySetMessagePayloadBuilder.of();
    }

    /**
     * builder for productPriceModeSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceModeSetMessagePayloadBuilder productPriceModeSetBuilder() {
        return com.commercetools.api.models.message.ProductPriceModeSetMessagePayloadBuilder.of();
    }

    /**
     * builder for productPriceRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceRemovedMessagePayloadBuilder productPriceRemovedBuilder() {
        return com.commercetools.api.models.message.ProductPriceRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for productPricesSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPricesSetMessagePayloadBuilder productPricesSetBuilder() {
        return com.commercetools.api.models.message.ProductPricesSetMessagePayloadBuilder.of();
    }

    /**
     * builder for productPublished subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPublishedMessagePayloadBuilder productPublishedBuilder() {
        return com.commercetools.api.models.message.ProductPublishedMessagePayloadBuilder.of();
    }

    /**
     * builder for productRemovedFromCategory subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductRemovedFromCategoryMessagePayloadBuilder productRemovedFromCategoryBuilder() {
        return com.commercetools.api.models.message.ProductRemovedFromCategoryMessagePayloadBuilder.of();
    }

    /**
     * builder for productRevertedStagedChanges subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductRevertedStagedChangesMessagePayloadBuilder productRevertedStagedChangesBuilder() {
        return com.commercetools.api.models.message.ProductRevertedStagedChangesMessagePayloadBuilder.of();
    }

    /**
     * builder for productSelectionCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductSelectionCreatedMessagePayloadBuilder productSelectionCreatedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionCreatedMessagePayloadBuilder.of();
    }

    /**
     * builder for productSelectionDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductSelectionDeletedMessagePayloadBuilder productSelectionDeletedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionDeletedMessagePayloadBuilder.of();
    }

    /**
     * builder for productSelectionProductAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductSelectionProductAddedMessagePayloadBuilder productSelectionProductAddedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionProductAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for productSelectionProductExcluded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductSelectionProductExcludedMessagePayloadBuilder productSelectionProductExcludedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionProductExcludedMessagePayloadBuilder.of();
    }

    /**
     * builder for productSelectionProductRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductSelectionProductRemovedMessagePayloadBuilder productSelectionProductRemovedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionProductRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for productSelectionVariantExclusionChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductSelectionVariantExclusionChangedMessagePayloadBuilder productSelectionVariantExclusionChangedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionVariantExclusionChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for productSelectionVariantSelectionChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductSelectionVariantSelectionChangedMessagePayloadBuilder productSelectionVariantSelectionChangedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionVariantSelectionChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for productSlugChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductSlugChangedMessagePayloadBuilder productSlugChangedBuilder() {
        return com.commercetools.api.models.message.ProductSlugChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for productStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductStateTransitionMessagePayloadBuilder productStateTransitionBuilder() {
        return com.commercetools.api.models.message.ProductStateTransitionMessagePayloadBuilder.of();
    }

    /**
     * builder for productTailoringCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductTailoringCreatedMessagePayloadBuilder productTailoringCreatedBuilder() {
        return com.commercetools.api.models.message.ProductTailoringCreatedMessagePayloadBuilder.of();
    }

    /**
     * builder for productTailoringDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductTailoringDeletedMessagePayloadBuilder productTailoringDeletedBuilder() {
        return com.commercetools.api.models.message.ProductTailoringDeletedMessagePayloadBuilder.of();
    }

    /**
     * builder for productTailoringDescriptionSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductTailoringDescriptionSetMessagePayloadBuilder productTailoringDescriptionSetBuilder() {
        return com.commercetools.api.models.message.ProductTailoringDescriptionSetMessagePayloadBuilder.of();
    }

    /**
     * builder for productTailoringImageAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductTailoringImageAddedMessagePayloadBuilder productTailoringImageAddedBuilder() {
        return com.commercetools.api.models.message.ProductTailoringImageAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for productTailoringImagesSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductTailoringImagesSetMessagePayloadBuilder productTailoringImagesSetBuilder() {
        return com.commercetools.api.models.message.ProductTailoringImagesSetMessagePayloadBuilder.of();
    }

    /**
     * builder for productTailoringNameSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductTailoringNameSetMessagePayloadBuilder productTailoringNameSetBuilder() {
        return com.commercetools.api.models.message.ProductTailoringNameSetMessagePayloadBuilder.of();
    }

    /**
     * builder for productTailoringPublished subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductTailoringPublishedMessagePayloadBuilder productTailoringPublishedBuilder() {
        return com.commercetools.api.models.message.ProductTailoringPublishedMessagePayloadBuilder.of();
    }

    /**
     * builder for productTailoringSlugSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductTailoringSlugSetMessagePayloadBuilder productTailoringSlugSetBuilder() {
        return com.commercetools.api.models.message.ProductTailoringSlugSetMessagePayloadBuilder.of();
    }

    /**
     * builder for productTailoringUnpublished subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductTailoringUnpublishedMessagePayloadBuilder productTailoringUnpublishedBuilder() {
        return com.commercetools.api.models.message.ProductTailoringUnpublishedMessagePayloadBuilder.of();
    }

    /**
     * builder for productUnpublished subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductUnpublishedMessagePayloadBuilder productUnpublishedBuilder() {
        return com.commercetools.api.models.message.ProductUnpublishedMessagePayloadBuilder.of();
    }

    /**
     * builder for productVariantAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductVariantAddedMessagePayloadBuilder productVariantAddedBuilder() {
        return com.commercetools.api.models.message.ProductVariantAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for productVariantDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductVariantDeletedMessagePayloadBuilder productVariantDeletedBuilder() {
        return com.commercetools.api.models.message.ProductVariantDeletedMessagePayloadBuilder.of();
    }

    /**
     * builder for productVariantTailoringAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductVariantTailoringAddedMessagePayloadBuilder productVariantTailoringAddedBuilder() {
        return com.commercetools.api.models.message.ProductVariantTailoringAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for productVariantTailoringRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductVariantTailoringRemovedMessagePayloadBuilder productVariantTailoringRemovedBuilder() {
        return com.commercetools.api.models.message.ProductVariantTailoringRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for quoteCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteCreatedMessagePayloadBuilder quoteCreatedBuilder() {
        return com.commercetools.api.models.message.QuoteCreatedMessagePayloadBuilder.of();
    }

    /**
     * builder for quoteCustomerChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteCustomerChangedMessagePayloadBuilder quoteCustomerChangedBuilder() {
        return com.commercetools.api.models.message.QuoteCustomerChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for quoteDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteDeletedMessagePayloadBuilder quoteDeletedBuilder() {
        return com.commercetools.api.models.message.QuoteDeletedMessagePayloadBuilder.of();
    }

    /**
     * builder for quoteRenegotiationRequested subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteRenegotiationRequestedMessagePayloadBuilder quoteRenegotiationRequestedBuilder() {
        return com.commercetools.api.models.message.QuoteRenegotiationRequestedMessagePayloadBuilder.of();
    }

    /**
     * builder for quoteRequestCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteRequestCreatedMessagePayloadBuilder quoteRequestCreatedBuilder() {
        return com.commercetools.api.models.message.QuoteRequestCreatedMessagePayloadBuilder.of();
    }

    /**
     * builder for quoteRequestCustomerChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteRequestCustomerChangedMessagePayloadBuilder quoteRequestCustomerChangedBuilder() {
        return com.commercetools.api.models.message.QuoteRequestCustomerChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for quoteRequestDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteRequestDeletedMessagePayloadBuilder quoteRequestDeletedBuilder() {
        return com.commercetools.api.models.message.QuoteRequestDeletedMessagePayloadBuilder.of();
    }

    /**
     * builder for quoteRequestStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteRequestStateChangedMessagePayloadBuilder quoteRequestStateChangedBuilder() {
        return com.commercetools.api.models.message.QuoteRequestStateChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for quoteRequestStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteRequestStateTransitionMessagePayloadBuilder quoteRequestStateTransitionBuilder() {
        return com.commercetools.api.models.message.QuoteRequestStateTransitionMessagePayloadBuilder.of();
    }

    /**
     * builder for quoteStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteStateChangedMessagePayloadBuilder quoteStateChangedBuilder() {
        return com.commercetools.api.models.message.QuoteStateChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for quoteStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteStateTransitionMessagePayloadBuilder quoteStateTransitionBuilder() {
        return com.commercetools.api.models.message.QuoteStateTransitionMessagePayloadBuilder.of();
    }

    /**
     * builder for returnInfoAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ReturnInfoAddedMessagePayloadBuilder returnInfoAddedBuilder() {
        return com.commercetools.api.models.message.ReturnInfoAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for returnInfoSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ReturnInfoSetMessagePayloadBuilder returnInfoSetBuilder() {
        return com.commercetools.api.models.message.ReturnInfoSetMessagePayloadBuilder.of();
    }

    /**
     * builder for reviewCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ReviewCreatedMessagePayloadBuilder reviewCreatedBuilder() {
        return com.commercetools.api.models.message.ReviewCreatedMessagePayloadBuilder.of();
    }

    /**
     * builder for reviewRatingSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ReviewRatingSetMessagePayloadBuilder reviewRatingSetBuilder() {
        return com.commercetools.api.models.message.ReviewRatingSetMessagePayloadBuilder.of();
    }

    /**
     * builder for reviewStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ReviewStateTransitionMessagePayloadBuilder reviewStateTransitionBuilder() {
        return com.commercetools.api.models.message.ReviewStateTransitionMessagePayloadBuilder.of();
    }

    /**
     * builder for shoppingListLineItemAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ShoppingListLineItemAddedMessagePayloadBuilder shoppingListLineItemAddedBuilder() {
        return com.commercetools.api.models.message.ShoppingListLineItemAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for shoppingListLineItemRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ShoppingListLineItemRemovedMessagePayloadBuilder shoppingListLineItemRemovedBuilder() {
        return com.commercetools.api.models.message.ShoppingListLineItemRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for shoppingListStoreSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ShoppingListStoreSetMessagePayloadBuilder shoppingListStoreSetBuilder() {
        return com.commercetools.api.models.message.ShoppingListStoreSetMessagePayloadBuilder.of();
    }

    /**
     * builder for stagedQuoteCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StagedQuoteCreatedMessagePayloadBuilder stagedQuoteCreatedBuilder() {
        return com.commercetools.api.models.message.StagedQuoteCreatedMessagePayloadBuilder.of();
    }

    /**
     * builder for stagedQuoteDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StagedQuoteDeletedMessagePayloadBuilder stagedQuoteDeletedBuilder() {
        return com.commercetools.api.models.message.StagedQuoteDeletedMessagePayloadBuilder.of();
    }

    /**
     * builder for stagedQuoteSellerCommentSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StagedQuoteSellerCommentSetMessagePayloadBuilder stagedQuoteSellerCommentSetBuilder() {
        return com.commercetools.api.models.message.StagedQuoteSellerCommentSetMessagePayloadBuilder.of();
    }

    /**
     * builder for stagedQuoteStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StagedQuoteStateChangedMessagePayloadBuilder stagedQuoteStateChangedBuilder() {
        return com.commercetools.api.models.message.StagedQuoteStateChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for stagedQuoteStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StagedQuoteStateTransitionMessagePayloadBuilder stagedQuoteStateTransitionBuilder() {
        return com.commercetools.api.models.message.StagedQuoteStateTransitionMessagePayloadBuilder.of();
    }

    /**
     * builder for stagedQuoteValidToSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StagedQuoteValidToSetMessagePayloadBuilder stagedQuoteValidToSetBuilder() {
        return com.commercetools.api.models.message.StagedQuoteValidToSetMessagePayloadBuilder.of();
    }

    /**
     * builder for standalonePriceActiveChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceActiveChangedMessagePayloadBuilder standalonePriceActiveChangedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceActiveChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for standalonePriceCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceCreatedMessagePayloadBuilder standalonePriceCreatedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceCreatedMessagePayloadBuilder.of();
    }

    /**
     * builder for standalonePriceDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceDeletedMessagePayloadBuilder standalonePriceDeletedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceDeletedMessagePayloadBuilder.of();
    }

    /**
     * builder for standalonePriceDiscountSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceDiscountSetMessagePayloadBuilder standalonePriceDiscountSetBuilder() {
        return com.commercetools.api.models.message.StandalonePriceDiscountSetMessagePayloadBuilder.of();
    }

    /**
     * builder for standalonePriceExternalDiscountSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceExternalDiscountSetMessagePayloadBuilder standalonePriceExternalDiscountSetBuilder() {
        return com.commercetools.api.models.message.StandalonePriceExternalDiscountSetMessagePayloadBuilder.of();
    }

    /**
     * builder for standalonePriceKeySet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceKeySetMessagePayloadBuilder standalonePriceKeySetBuilder() {
        return com.commercetools.api.models.message.StandalonePriceKeySetMessagePayloadBuilder.of();
    }

    /**
     * builder for standalonePriceStagedChangesApplied subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceStagedChangesAppliedMessagePayloadBuilder standalonePriceStagedChangesAppliedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceStagedChangesAppliedMessagePayloadBuilder.of();
    }

    /**
     * builder for standalonePriceStagedChangesRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceStagedChangesRemovedMessagePayloadBuilder standalonePriceStagedChangesRemovedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceStagedChangesRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for standalonePriceTierAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceTierAddedMessagePayloadBuilder standalonePriceTierAddedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceTierAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for standalonePriceTierRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceTierRemovedMessagePayloadBuilder standalonePriceTierRemovedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceTierRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for standalonePriceTiersSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceTiersSetMessagePayloadBuilder standalonePriceTiersSetBuilder() {
        return com.commercetools.api.models.message.StandalonePriceTiersSetMessagePayloadBuilder.of();
    }

    /**
     * builder for standalonePriceValidFromAndUntilSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceValidFromAndUntilSetMessagePayloadBuilder standalonePriceValidFromAndUntilSetBuilder() {
        return com.commercetools.api.models.message.StandalonePriceValidFromAndUntilSetMessagePayloadBuilder.of();
    }

    /**
     * builder for standalonePriceValidFromSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceValidFromSetMessagePayloadBuilder standalonePriceValidFromSetBuilder() {
        return com.commercetools.api.models.message.StandalonePriceValidFromSetMessagePayloadBuilder.of();
    }

    /**
     * builder for standalonePriceValidUntilSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceValidUntilSetMessagePayloadBuilder standalonePriceValidUntilSetBuilder() {
        return com.commercetools.api.models.message.StandalonePriceValidUntilSetMessagePayloadBuilder.of();
    }

    /**
     * builder for standalonePriceValueChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceValueChangedMessagePayloadBuilder standalonePriceValueChangedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceValueChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for storeCountriesChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StoreCountriesChangedMessagePayloadBuilder storeCountriesChangedBuilder() {
        return com.commercetools.api.models.message.StoreCountriesChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for storeCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StoreCreatedMessagePayloadBuilder storeCreatedBuilder() {
        return com.commercetools.api.models.message.StoreCreatedMessagePayloadBuilder.of();
    }

    /**
     * builder for storeDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StoreDeletedMessagePayloadBuilder storeDeletedBuilder() {
        return com.commercetools.api.models.message.StoreDeletedMessagePayloadBuilder.of();
    }

    /**
     * builder for storeDistributionChannelsChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StoreDistributionChannelsChangedMessagePayloadBuilder storeDistributionChannelsChangedBuilder() {
        return com.commercetools.api.models.message.StoreDistributionChannelsChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for storeLanguagesChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StoreLanguagesChangedMessagePayloadBuilder storeLanguagesChangedBuilder() {
        return com.commercetools.api.models.message.StoreLanguagesChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for storeNameSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StoreNameSetMessagePayloadBuilder storeNameSetBuilder() {
        return com.commercetools.api.models.message.StoreNameSetMessagePayloadBuilder.of();
    }

    /**
     * builder for storeProductSelectionsChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StoreProductSelectionsChangedMessagePayloadBuilder storeProductSelectionsChangedBuilder() {
        return com.commercetools.api.models.message.StoreProductSelectionsChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for storeSupplyChannelsChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StoreSupplyChannelsChangedMessagePayloadBuilder storeSupplyChannelsChangedBuilder() {
        return com.commercetools.api.models.message.StoreSupplyChannelsChangedMessagePayloadBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMessagePayload(Function<MessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<MessagePayload>";
            }
        };
    }
}
