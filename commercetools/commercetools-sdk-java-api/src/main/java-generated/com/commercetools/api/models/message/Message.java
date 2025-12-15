
package com.commercetools.api.models.message;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Base representation of a Message containing common fields to all <span>Message Types</span>.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Message message = Message.approvalFlowApprovedBuilder()
 *             id("{id}")
 *             version(0.3)
 *             createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             sequenceNumber(0.3)
 *             resource(resourceBuilder -> resourceBuilder)
 *             resourceVersion(0.3)
 *             associate(associateBuilder -> associateBuilder)
 *             order(orderBuilder -> orderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = MessageImpl.class, visible = true)
@JsonDeserialize(as = MessageImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface Message extends BaseResource, com.commercetools.api.models.DomainResource<Message> {

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>IDs and references that created the Message.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @return sequenceNumber
     */
    @NotNull
    @JsonProperty("sequenceNumber")
    public Long getSequenceNumber();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the resource on which the change or action was performed.</p>
     * @return resource
     */
    @NotNull
    @Valid
    @JsonProperty("resource")
    public Reference getResource();

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @return resourceVersion
     */
    @NotNull
    @JsonProperty("resourceVersion")
    public Long getResourceVersion();

    /**
     *  <p><span>Message Type</span> of the Message.</p>
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @return resourceUserProvidedIdentifiers
     */
    @Valid
    @JsonProperty("resourceUserProvidedIdentifiers")
    public UserProvidedIdentifiers getResourceUserProvidedIdentifiers();

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @param sequenceNumber value to be set
     */

    public void setSequenceNumber(final Long sequenceNumber);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the resource on which the change or action was performed.</p>
     * @param resource value to be set
     */

    public void setResource(final Reference resource);

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @param resourceVersion value to be set
     */

    public void setResourceVersion(final Long resourceVersion);

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param resourceUserProvidedIdentifiers value to be set
     */

    public void setResourceUserProvidedIdentifiers(final UserProvidedIdentifiers resourceUserProvidedIdentifiers);

    public Message copyDeep();

    /**
     * factory method to create a deep copy of Message
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Message deepCopy(@Nullable final Message template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof MessageImpl)) {
            return template.copyDeep();
        }
        MessageImpl instance = new MessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        return instance;
    }

    /**
     * builder for approvalFlowApproved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ApprovalFlowApprovedMessageBuilder approvalFlowApprovedBuilder() {
        return com.commercetools.api.models.message.ApprovalFlowApprovedMessageBuilder.of();
    }

    /**
     * builder for approvalFlowCompleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ApprovalFlowCompletedMessageBuilder approvalFlowCompletedBuilder() {
        return com.commercetools.api.models.message.ApprovalFlowCompletedMessageBuilder.of();
    }

    /**
     * builder for approvalFlowCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ApprovalFlowCreatedMessageBuilder approvalFlowCreatedBuilder() {
        return com.commercetools.api.models.message.ApprovalFlowCreatedMessageBuilder.of();
    }

    /**
     * builder for approvalFlowRejected subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ApprovalFlowRejectedMessageBuilder approvalFlowRejectedBuilder() {
        return com.commercetools.api.models.message.ApprovalFlowRejectedMessageBuilder.of();
    }

    /**
     * builder for approvalRuleApproversSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ApprovalRuleApproversSetMessageBuilder approvalRuleApproversSetBuilder() {
        return com.commercetools.api.models.message.ApprovalRuleApproversSetMessageBuilder.of();
    }

    /**
     * builder for approvalRuleCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ApprovalRuleCreatedMessageBuilder approvalRuleCreatedBuilder() {
        return com.commercetools.api.models.message.ApprovalRuleCreatedMessageBuilder.of();
    }

    /**
     * builder for approvalRuleDescriptionSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ApprovalRuleDescriptionSetMessageBuilder approvalRuleDescriptionSetBuilder() {
        return com.commercetools.api.models.message.ApprovalRuleDescriptionSetMessageBuilder.of();
    }

    /**
     * builder for approvalRuleKeySet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ApprovalRuleKeySetMessageBuilder approvalRuleKeySetBuilder() {
        return com.commercetools.api.models.message.ApprovalRuleKeySetMessageBuilder.of();
    }

    /**
     * builder for approvalRuleNameSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ApprovalRuleNameSetMessageBuilder approvalRuleNameSetBuilder() {
        return com.commercetools.api.models.message.ApprovalRuleNameSetMessageBuilder.of();
    }

    /**
     * builder for approvalRulePredicateSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ApprovalRulePredicateSetMessageBuilder approvalRulePredicateSetBuilder() {
        return com.commercetools.api.models.message.ApprovalRulePredicateSetMessageBuilder.of();
    }

    /**
     * builder for approvalRuleRequestersSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ApprovalRuleRequestersSetMessageBuilder approvalRuleRequestersSetBuilder() {
        return com.commercetools.api.models.message.ApprovalRuleRequestersSetMessageBuilder.of();
    }

    /**
     * builder for approvalRuleStatusSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ApprovalRuleStatusSetMessageBuilder approvalRuleStatusSetBuilder() {
        return com.commercetools.api.models.message.ApprovalRuleStatusSetMessageBuilder.of();
    }

    /**
     * builder for associateRoleBuyerAssignableChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.AssociateRoleBuyerAssignableChangedMessageBuilder associateRoleBuyerAssignableChangedBuilder() {
        return com.commercetools.api.models.message.AssociateRoleBuyerAssignableChangedMessageBuilder.of();
    }

    /**
     * builder for associateRoleCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.AssociateRoleCreatedMessageBuilder associateRoleCreatedBuilder() {
        return com.commercetools.api.models.message.AssociateRoleCreatedMessageBuilder.of();
    }

    /**
     * builder for associateRoleDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.AssociateRoleDeletedMessageBuilder associateRoleDeletedBuilder() {
        return com.commercetools.api.models.message.AssociateRoleDeletedMessageBuilder.of();
    }

    /**
     * builder for associateRoleNameSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.AssociateRoleNameSetMessageBuilder associateRoleNameSetBuilder() {
        return com.commercetools.api.models.message.AssociateRoleNameSetMessageBuilder.of();
    }

    /**
     * builder for associateRolePermissionAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.AssociateRolePermissionAddedMessageBuilder associateRolePermissionAddedBuilder() {
        return com.commercetools.api.models.message.AssociateRolePermissionAddedMessageBuilder.of();
    }

    /**
     * builder for associateRolePermissionRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.AssociateRolePermissionRemovedMessageBuilder associateRolePermissionRemovedBuilder() {
        return com.commercetools.api.models.message.AssociateRolePermissionRemovedMessageBuilder.of();
    }

    /**
     * builder for associateRolePermissionsSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.AssociateRolePermissionsSetMessageBuilder associateRolePermissionsSetBuilder() {
        return com.commercetools.api.models.message.AssociateRolePermissionsSetMessageBuilder.of();
    }

    /**
     * builder for businessUnitAddressAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAddressAddedMessageBuilder businessUnitAddressAddedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAddressAddedMessageBuilder.of();
    }

    /**
     * builder for businessUnitAddressChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAddressChangedMessageBuilder businessUnitAddressChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAddressChangedMessageBuilder.of();
    }

    /**
     * builder for businessUnitAddressCustomFieldAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAddressCustomFieldAddedMessageBuilder businessUnitAddressCustomFieldAddedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAddressCustomFieldAddedMessageBuilder.of();
    }

    /**
     * builder for businessUnitAddressCustomFieldChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAddressCustomFieldChangedMessageBuilder businessUnitAddressCustomFieldChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAddressCustomFieldChangedMessageBuilder.of();
    }

    /**
     * builder for businessUnitAddressCustomFieldRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAddressCustomFieldRemovedMessageBuilder businessUnitAddressCustomFieldRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAddressCustomFieldRemovedMessageBuilder.of();
    }

    /**
     * builder for businessUnitAddressCustomTypeRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAddressCustomTypeRemovedMessageBuilder businessUnitAddressCustomTypeRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAddressCustomTypeRemovedMessageBuilder.of();
    }

    /**
     * builder for businessUnitAddressCustomTypeSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAddressCustomTypeSetMessageBuilder businessUnitAddressCustomTypeSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAddressCustomTypeSetMessageBuilder.of();
    }

    /**
     * builder for businessUnitAddressRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAddressRemovedMessageBuilder businessUnitAddressRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAddressRemovedMessageBuilder.of();
    }

    /**
     * builder for businessUnitApprovalRuleModeChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitApprovalRuleModeChangedMessageBuilder businessUnitApprovalRuleModeChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitApprovalRuleModeChangedMessageBuilder.of();
    }

    /**
     * builder for businessUnitAssociateAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAssociateAddedMessageBuilder businessUnitAssociateAddedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAssociateAddedMessageBuilder.of();
    }

    /**
     * builder for businessUnitAssociateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAssociateChangedMessageBuilder businessUnitAssociateChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAssociateChangedMessageBuilder.of();
    }

    /**
     * builder for businessUnitAssociateModeChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAssociateModeChangedMessageBuilder businessUnitAssociateModeChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAssociateModeChangedMessageBuilder.of();
    }

    /**
     * builder for businessUnitAssociateRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAssociateRemovedMessageBuilder businessUnitAssociateRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAssociateRemovedMessageBuilder.of();
    }

    /**
     * builder for businessUnitAssociatesSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAssociatesSetMessageBuilder businessUnitAssociatesSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAssociatesSetMessageBuilder.of();
    }

    /**
     * builder for businessUnitBillingAddressAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitBillingAddressAddedMessageBuilder businessUnitBillingAddressAddedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitBillingAddressAddedMessageBuilder.of();
    }

    /**
     * builder for businessUnitBillingAddressRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitBillingAddressRemovedMessageBuilder businessUnitBillingAddressRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitBillingAddressRemovedMessageBuilder.of();
    }

    /**
     * builder for businessUnitContactEmailSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitContactEmailSetMessageBuilder businessUnitContactEmailSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitContactEmailSetMessageBuilder.of();
    }

    /**
     * builder for businessUnitCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitCreatedMessageBuilder businessUnitCreatedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitCreatedMessageBuilder.of();
    }

    /**
     * builder for businessUnitCustomFieldAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitCustomFieldAddedMessageBuilder businessUnitCustomFieldAddedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitCustomFieldAddedMessageBuilder.of();
    }

    /**
     * builder for businessUnitCustomFieldChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitCustomFieldChangedMessageBuilder businessUnitCustomFieldChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitCustomFieldChangedMessageBuilder.of();
    }

    /**
     * builder for businessUnitCustomFieldRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitCustomFieldRemovedMessageBuilder businessUnitCustomFieldRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitCustomFieldRemovedMessageBuilder.of();
    }

    /**
     * builder for businessUnitCustomTypeRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitCustomTypeRemovedMessageBuilder businessUnitCustomTypeRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitCustomTypeRemovedMessageBuilder.of();
    }

    /**
     * builder for businessUnitCustomTypeSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitCustomTypeSetMessageBuilder businessUnitCustomTypeSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitCustomTypeSetMessageBuilder.of();
    }

    /**
     * builder for businessUnitCustomerGroupAssignmentAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitCustomerGroupAssignmentAddedMessageBuilder businessUnitCustomerGroupAssignmentAddedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitCustomerGroupAssignmentAddedMessageBuilder.of();
    }

    /**
     * builder for businessUnitCustomerGroupAssignmentRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitCustomerGroupAssignmentRemovedMessageBuilder businessUnitCustomerGroupAssignmentRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitCustomerGroupAssignmentRemovedMessageBuilder.of();
    }

    /**
     * builder for businessUnitCustomerGroupAssignmentsSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitCustomerGroupAssignmentsSetMessageBuilder businessUnitCustomerGroupAssignmentsSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitCustomerGroupAssignmentsSetMessageBuilder.of();
    }

    /**
     * builder for businessUnitDefaultBillingAddressSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitDefaultBillingAddressSetMessageBuilder businessUnitDefaultBillingAddressSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitDefaultBillingAddressSetMessageBuilder.of();
    }

    /**
     * builder for businessUnitDefaultShippingAddressSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitDefaultShippingAddressSetMessageBuilder businessUnitDefaultShippingAddressSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitDefaultShippingAddressSetMessageBuilder.of();
    }

    /**
     * builder for businessUnitDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitDeletedMessageBuilder businessUnitDeletedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitDeletedMessageBuilder.of();
    }

    /**
     * builder for businessUnitNameChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitNameChangedMessageBuilder businessUnitNameChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitNameChangedMessageBuilder.of();
    }

    /**
     * builder for businessUnitParentChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitParentChangedMessageBuilder businessUnitParentChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitParentChangedMessageBuilder.of();
    }

    /**
     * builder for businessUnitShippingAddressAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitShippingAddressAddedMessageBuilder businessUnitShippingAddressAddedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitShippingAddressAddedMessageBuilder.of();
    }

    /**
     * builder for businessUnitShippingAddressRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitShippingAddressRemovedMessageBuilder businessUnitShippingAddressRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitShippingAddressRemovedMessageBuilder.of();
    }

    /**
     * builder for businessUnitStatusChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitStatusChangedMessageBuilder businessUnitStatusChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitStatusChangedMessageBuilder.of();
    }

    /**
     * builder for businessUnitStoreAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitStoreAddedMessageBuilder businessUnitStoreAddedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitStoreAddedMessageBuilder.of();
    }

    /**
     * builder for businessUnitStoreModeChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitStoreModeChangedMessageBuilder businessUnitStoreModeChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitStoreModeChangedMessageBuilder.of();
    }

    /**
     * builder for businessUnitStoreRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitStoreRemovedMessageBuilder businessUnitStoreRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitStoreRemovedMessageBuilder.of();
    }

    /**
     * builder for businessUnitStoresSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitStoresSetMessageBuilder businessUnitStoresSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitStoresSetMessageBuilder.of();
    }

    /**
     * builder for businessUnitTopLevelUnitSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitTopLevelUnitSetMessageBuilder businessUnitTopLevelUnitSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitTopLevelUnitSetMessageBuilder.of();
    }

    /**
     * builder for businessUnitTypeSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitTypeSetMessageBuilder businessUnitTypeSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitTypeSetMessageBuilder.of();
    }

    /**
     * builder for cartDiscountCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CartDiscountCreatedMessageBuilder cartDiscountCreatedBuilder() {
        return com.commercetools.api.models.message.CartDiscountCreatedMessageBuilder.of();
    }

    /**
     * builder for cartDiscountDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CartDiscountDeletedMessageBuilder cartDiscountDeletedBuilder() {
        return com.commercetools.api.models.message.CartDiscountDeletedMessageBuilder.of();
    }

    /**
     * builder for cartDiscountStoreAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CartDiscountStoreAddedMessageBuilder cartDiscountStoreAddedBuilder() {
        return com.commercetools.api.models.message.CartDiscountStoreAddedMessageBuilder.of();
    }

    /**
     * builder for cartDiscountStoreRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CartDiscountStoreRemovedMessageBuilder cartDiscountStoreRemovedBuilder() {
        return com.commercetools.api.models.message.CartDiscountStoreRemovedMessageBuilder.of();
    }

    /**
     * builder for cartDiscountStoresSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CartDiscountStoresSetMessageBuilder cartDiscountStoresSetBuilder() {
        return com.commercetools.api.models.message.CartDiscountStoresSetMessageBuilder.of();
    }

    /**
     * builder for cartFrozen subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CartFrozenMessageBuilder cartFrozenBuilder() {
        return com.commercetools.api.models.message.CartFrozenMessageBuilder.of();
    }

    /**
     * builder for cartUnfrozen subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CartUnfrozenMessageBuilder cartUnfrozenBuilder() {
        return com.commercetools.api.models.message.CartUnfrozenMessageBuilder.of();
    }

    /**
     * builder for categoryCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CategoryCreatedMessageBuilder categoryCreatedBuilder() {
        return com.commercetools.api.models.message.CategoryCreatedMessageBuilder.of();
    }

    /**
     * builder for categorySlugChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CategorySlugChangedMessageBuilder categorySlugChangedBuilder() {
        return com.commercetools.api.models.message.CategorySlugChangedMessageBuilder.of();
    }

    /**
     * builder for customLineItemStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomLineItemStateTransitionMessageBuilder customLineItemStateTransitionBuilder() {
        return com.commercetools.api.models.message.CustomLineItemStateTransitionMessageBuilder.of();
    }

    /**
     * builder for customerAddressAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerAddressAddedMessageBuilder customerAddressAddedBuilder() {
        return com.commercetools.api.models.message.CustomerAddressAddedMessageBuilder.of();
    }

    /**
     * builder for customerAddressChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerAddressChangedMessageBuilder customerAddressChangedBuilder() {
        return com.commercetools.api.models.message.CustomerAddressChangedMessageBuilder.of();
    }

    /**
     * builder for customerAddressCustomFieldAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerAddressCustomFieldAddedMessageBuilder customerAddressCustomFieldAddedBuilder() {
        return com.commercetools.api.models.message.CustomerAddressCustomFieldAddedMessageBuilder.of();
    }

    /**
     * builder for customerAddressCustomFieldChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerAddressCustomFieldChangedMessageBuilder customerAddressCustomFieldChangedBuilder() {
        return com.commercetools.api.models.message.CustomerAddressCustomFieldChangedMessageBuilder.of();
    }

    /**
     * builder for customerAddressCustomFieldRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerAddressCustomFieldRemovedMessageBuilder customerAddressCustomFieldRemovedBuilder() {
        return com.commercetools.api.models.message.CustomerAddressCustomFieldRemovedMessageBuilder.of();
    }

    /**
     * builder for customerAddressCustomTypeRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerAddressCustomTypeRemovedMessageBuilder customerAddressCustomTypeRemovedBuilder() {
        return com.commercetools.api.models.message.CustomerAddressCustomTypeRemovedMessageBuilder.of();
    }

    /**
     * builder for customerAddressCustomTypeSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerAddressCustomTypeSetMessageBuilder customerAddressCustomTypeSetBuilder() {
        return com.commercetools.api.models.message.CustomerAddressCustomTypeSetMessageBuilder.of();
    }

    /**
     * builder for customerAddressRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerAddressRemovedMessageBuilder customerAddressRemovedBuilder() {
        return com.commercetools.api.models.message.CustomerAddressRemovedMessageBuilder.of();
    }

    /**
     * builder for customerBillingAddressAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerBillingAddressAddedMessageBuilder customerBillingAddressAddedBuilder() {
        return com.commercetools.api.models.message.CustomerBillingAddressAddedMessageBuilder.of();
    }

    /**
     * builder for customerBillingAddressRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerBillingAddressRemovedMessageBuilder customerBillingAddressRemovedBuilder() {
        return com.commercetools.api.models.message.CustomerBillingAddressRemovedMessageBuilder.of();
    }

    /**
     * builder for customerCompanyNameSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerCompanyNameSetMessageBuilder customerCompanyNameSetBuilder() {
        return com.commercetools.api.models.message.CustomerCompanyNameSetMessageBuilder.of();
    }

    /**
     * builder for customerCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerCreatedMessageBuilder customerCreatedBuilder() {
        return com.commercetools.api.models.message.CustomerCreatedMessageBuilder.of();
    }

    /**
     * builder for customerCustomFieldAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerCustomFieldAddedMessageBuilder customerCustomFieldAddedBuilder() {
        return com.commercetools.api.models.message.CustomerCustomFieldAddedMessageBuilder.of();
    }

    /**
     * builder for customerCustomFieldChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerCustomFieldChangedMessageBuilder customerCustomFieldChangedBuilder() {
        return com.commercetools.api.models.message.CustomerCustomFieldChangedMessageBuilder.of();
    }

    /**
     * builder for customerCustomFieldRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerCustomFieldRemovedMessageBuilder customerCustomFieldRemovedBuilder() {
        return com.commercetools.api.models.message.CustomerCustomFieldRemovedMessageBuilder.of();
    }

    /**
     * builder for customerCustomTypeRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerCustomTypeRemovedMessageBuilder customerCustomTypeRemovedBuilder() {
        return com.commercetools.api.models.message.CustomerCustomTypeRemovedMessageBuilder.of();
    }

    /**
     * builder for customerCustomTypeSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerCustomTypeSetMessageBuilder customerCustomTypeSetBuilder() {
        return com.commercetools.api.models.message.CustomerCustomTypeSetMessageBuilder.of();
    }

    /**
     * builder for customerDateOfBirthSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerDateOfBirthSetMessageBuilder customerDateOfBirthSetBuilder() {
        return com.commercetools.api.models.message.CustomerDateOfBirthSetMessageBuilder.of();
    }

    /**
     * builder for customerDefaultBillingAddressSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerDefaultBillingAddressSetMessageBuilder customerDefaultBillingAddressSetBuilder() {
        return com.commercetools.api.models.message.CustomerDefaultBillingAddressSetMessageBuilder.of();
    }

    /**
     * builder for customerDefaultShippingAddressSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerDefaultShippingAddressSetMessageBuilder customerDefaultShippingAddressSetBuilder() {
        return com.commercetools.api.models.message.CustomerDefaultShippingAddressSetMessageBuilder.of();
    }

    /**
     * builder for customerDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerDeletedMessageBuilder customerDeletedBuilder() {
        return com.commercetools.api.models.message.CustomerDeletedMessageBuilder.of();
    }

    /**
     * builder for customerEmailChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerEmailChangedMessageBuilder customerEmailChangedBuilder() {
        return com.commercetools.api.models.message.CustomerEmailChangedMessageBuilder.of();
    }

    /**
     * builder for customerEmailTokenCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerEmailTokenCreatedMessageBuilder customerEmailTokenCreatedBuilder() {
        return com.commercetools.api.models.message.CustomerEmailTokenCreatedMessageBuilder.of();
    }

    /**
     * builder for customerEmailVerified subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerEmailVerifiedMessageBuilder customerEmailVerifiedBuilder() {
        return com.commercetools.api.models.message.CustomerEmailVerifiedMessageBuilder.of();
    }

    /**
     * builder for customerExternalIdSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerExternalIdSetMessageBuilder customerExternalIdSetBuilder() {
        return com.commercetools.api.models.message.CustomerExternalIdSetMessageBuilder.of();
    }

    /**
     * builder for customerFirstNameSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerFirstNameSetMessageBuilder customerFirstNameSetBuilder() {
        return com.commercetools.api.models.message.CustomerFirstNameSetMessageBuilder.of();
    }

    /**
     * builder for customerGroupAssignmentAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerGroupAssignmentAddedMessageBuilder customerGroupAssignmentAddedBuilder() {
        return com.commercetools.api.models.message.CustomerGroupAssignmentAddedMessageBuilder.of();
    }

    /**
     * builder for customerGroupAssignmentRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerGroupAssignmentRemovedMessageBuilder customerGroupAssignmentRemovedBuilder() {
        return com.commercetools.api.models.message.CustomerGroupAssignmentRemovedMessageBuilder.of();
    }

    /**
     * builder for customerGroupAssignmentsSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerGroupAssignmentsSetMessageBuilder customerGroupAssignmentsSetBuilder() {
        return com.commercetools.api.models.message.CustomerGroupAssignmentsSetMessageBuilder.of();
    }

    /**
     * builder for customerGroupCustomFieldAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerGroupCustomFieldAddedMessageBuilder customerGroupCustomFieldAddedBuilder() {
        return com.commercetools.api.models.message.CustomerGroupCustomFieldAddedMessageBuilder.of();
    }

    /**
     * builder for customerGroupCustomFieldChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerGroupCustomFieldChangedMessageBuilder customerGroupCustomFieldChangedBuilder() {
        return com.commercetools.api.models.message.CustomerGroupCustomFieldChangedMessageBuilder.of();
    }

    /**
     * builder for customerGroupCustomFieldRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerGroupCustomFieldRemovedMessageBuilder customerGroupCustomFieldRemovedBuilder() {
        return com.commercetools.api.models.message.CustomerGroupCustomFieldRemovedMessageBuilder.of();
    }

    /**
     * builder for customerGroupCustomTypeRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerGroupCustomTypeRemovedMessageBuilder customerGroupCustomTypeRemovedBuilder() {
        return com.commercetools.api.models.message.CustomerGroupCustomTypeRemovedMessageBuilder.of();
    }

    /**
     * builder for customerGroupCustomTypeSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerGroupCustomTypeSetMessageBuilder customerGroupCustomTypeSetBuilder() {
        return com.commercetools.api.models.message.CustomerGroupCustomTypeSetMessageBuilder.of();
    }

    /**
     * builder for customerGroupSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerGroupSetMessageBuilder customerGroupSetBuilder() {
        return com.commercetools.api.models.message.CustomerGroupSetMessageBuilder.of();
    }

    /**
     * builder for customerLastNameSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerLastNameSetMessageBuilder customerLastNameSetBuilder() {
        return com.commercetools.api.models.message.CustomerLastNameSetMessageBuilder.of();
    }

    /**
     * builder for customerPasswordTokenCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerPasswordTokenCreatedMessageBuilder customerPasswordTokenCreatedBuilder() {
        return com.commercetools.api.models.message.CustomerPasswordTokenCreatedMessageBuilder.of();
    }

    /**
     * builder for customerPasswordUpdated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerPasswordUpdatedMessageBuilder customerPasswordUpdatedBuilder() {
        return com.commercetools.api.models.message.CustomerPasswordUpdatedMessageBuilder.of();
    }

    /**
     * builder for customerShippingAddressAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerShippingAddressAddedMessageBuilder customerShippingAddressAddedBuilder() {
        return com.commercetools.api.models.message.CustomerShippingAddressAddedMessageBuilder.of();
    }

    /**
     * builder for customerShippingAddressRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerShippingAddressRemovedMessageBuilder customerShippingAddressRemovedBuilder() {
        return com.commercetools.api.models.message.CustomerShippingAddressRemovedMessageBuilder.of();
    }

    /**
     * builder for customerStoresSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerStoresSetMessageBuilder customerStoresSetBuilder() {
        return com.commercetools.api.models.message.CustomerStoresSetMessageBuilder.of();
    }

    /**
     * builder for customerTitleSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerTitleSetMessageBuilder customerTitleSetBuilder() {
        return com.commercetools.api.models.message.CustomerTitleSetMessageBuilder.of();
    }

    /**
     * builder for deliveryAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DeliveryAddedMessageBuilder deliveryAddedBuilder() {
        return com.commercetools.api.models.message.DeliveryAddedMessageBuilder.of();
    }

    /**
     * builder for deliveryAddressSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DeliveryAddressSetMessageBuilder deliveryAddressSetBuilder() {
        return com.commercetools.api.models.message.DeliveryAddressSetMessageBuilder.of();
    }

    /**
     * builder for deliveryCustomFieldAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DeliveryCustomFieldAddedMessageBuilder deliveryCustomFieldAddedBuilder() {
        return com.commercetools.api.models.message.DeliveryCustomFieldAddedMessageBuilder.of();
    }

    /**
     * builder for deliveryCustomFieldChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DeliveryCustomFieldChangedMessageBuilder deliveryCustomFieldChangedBuilder() {
        return com.commercetools.api.models.message.DeliveryCustomFieldChangedMessageBuilder.of();
    }

    /**
     * builder for deliveryCustomFieldRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DeliveryCustomFieldRemovedMessageBuilder deliveryCustomFieldRemovedBuilder() {
        return com.commercetools.api.models.message.DeliveryCustomFieldRemovedMessageBuilder.of();
    }

    /**
     * builder for deliveryCustomTypeRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DeliveryCustomTypeRemovedMessageBuilder deliveryCustomTypeRemovedBuilder() {
        return com.commercetools.api.models.message.DeliveryCustomTypeRemovedMessageBuilder.of();
    }

    /**
     * builder for deliveryCustomTypeSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DeliveryCustomTypeSetMessageBuilder deliveryCustomTypeSetBuilder() {
        return com.commercetools.api.models.message.DeliveryCustomTypeSetMessageBuilder.of();
    }

    /**
     * builder for deliveryItemsUpdated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DeliveryItemsUpdatedMessageBuilder deliveryItemsUpdatedBuilder() {
        return com.commercetools.api.models.message.DeliveryItemsUpdatedMessageBuilder.of();
    }

    /**
     * builder for deliveryRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DeliveryRemovedMessageBuilder deliveryRemovedBuilder() {
        return com.commercetools.api.models.message.DeliveryRemovedMessageBuilder.of();
    }

    /**
     * builder for discountCodeCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DiscountCodeCreatedMessageBuilder discountCodeCreatedBuilder() {
        return com.commercetools.api.models.message.DiscountCodeCreatedMessageBuilder.of();
    }

    /**
     * builder for discountCodeDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DiscountCodeDeletedMessageBuilder discountCodeDeletedBuilder() {
        return com.commercetools.api.models.message.DiscountCodeDeletedMessageBuilder.of();
    }

    /**
     * builder for discountCodeKeySet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DiscountCodeKeySetMessageBuilder discountCodeKeySetBuilder() {
        return com.commercetools.api.models.message.DiscountCodeKeySetMessageBuilder.of();
    }

    /**
     * builder for discountGroupCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DiscountGroupCreatedMessageBuilder discountGroupCreatedBuilder() {
        return com.commercetools.api.models.message.DiscountGroupCreatedMessageBuilder.of();
    }

    /**
     * builder for discountGroupDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DiscountGroupDeletedMessageBuilder discountGroupDeletedBuilder() {
        return com.commercetools.api.models.message.DiscountGroupDeletedMessageBuilder.of();
    }

    /**
     * builder for discountGroupIsActiveSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DiscountGroupIsActiveSetMessageBuilder discountGroupIsActiveSetBuilder() {
        return com.commercetools.api.models.message.DiscountGroupIsActiveSetMessageBuilder.of();
    }

    /**
     * builder for discountGroupKeySet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DiscountGroupKeySetMessageBuilder discountGroupKeySetBuilder() {
        return com.commercetools.api.models.message.DiscountGroupKeySetMessageBuilder.of();
    }

    /**
     * builder for discountGroupSortOrderSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DiscountGroupSortOrderSetMessageBuilder discountGroupSortOrderSetBuilder() {
        return com.commercetools.api.models.message.DiscountGroupSortOrderSetMessageBuilder.of();
    }

    /**
     * builder for inventoryEntryCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.InventoryEntryCreatedMessageBuilder inventoryEntryCreatedBuilder() {
        return com.commercetools.api.models.message.InventoryEntryCreatedMessageBuilder.of();
    }

    /**
     * builder for inventoryEntryDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.InventoryEntryDeletedMessageBuilder inventoryEntryDeletedBuilder() {
        return com.commercetools.api.models.message.InventoryEntryDeletedMessageBuilder.of();
    }

    /**
     * builder for inventoryEntryQuantitySet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.InventoryEntryQuantitySetMessageBuilder inventoryEntryQuantitySetBuilder() {
        return com.commercetools.api.models.message.InventoryEntryQuantitySetMessageBuilder.of();
    }

    /**
     * builder for lineItemStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.LineItemStateTransitionMessageBuilder lineItemStateTransitionBuilder() {
        return com.commercetools.api.models.message.LineItemStateTransitionMessageBuilder.of();
    }

    /**
     * builder for orderBillingAddressSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderBillingAddressSetMessageBuilder orderBillingAddressSetBuilder() {
        return com.commercetools.api.models.message.OrderBillingAddressSetMessageBuilder.of();
    }

    /**
     * builder for orderBusinessUnitSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderBusinessUnitSetMessageBuilder orderBusinessUnitSetBuilder() {
        return com.commercetools.api.models.message.OrderBusinessUnitSetMessageBuilder.of();
    }

    /**
     * builder for orderCreatedFromRecurringOrder subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCreatedFromRecurringOrderMessageBuilder orderCreatedFromRecurringOrderBuilder() {
        return com.commercetools.api.models.message.OrderCreatedFromRecurringOrderMessageBuilder.of();
    }

    /**
     * builder for orderCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCreatedMessageBuilder orderCreatedBuilder() {
        return com.commercetools.api.models.message.OrderCreatedMessageBuilder.of();
    }

    /**
     * builder for orderCustomFieldAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomFieldAddedMessageBuilder orderCustomFieldAddedBuilder() {
        return com.commercetools.api.models.message.OrderCustomFieldAddedMessageBuilder.of();
    }

    /**
     * builder for orderCustomFieldChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomFieldChangedMessageBuilder orderCustomFieldChangedBuilder() {
        return com.commercetools.api.models.message.OrderCustomFieldChangedMessageBuilder.of();
    }

    /**
     * builder for orderCustomFieldRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomFieldRemovedMessageBuilder orderCustomFieldRemovedBuilder() {
        return com.commercetools.api.models.message.OrderCustomFieldRemovedMessageBuilder.of();
    }

    /**
     * builder for orderCustomLineItemAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomLineItemAddedMessageBuilder orderCustomLineItemAddedBuilder() {
        return com.commercetools.api.models.message.OrderCustomLineItemAddedMessageBuilder.of();
    }

    /**
     * builder for orderCustomLineItemDiscountSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessageBuilder orderCustomLineItemDiscountSetBuilder() {
        return com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessageBuilder.of();
    }

    /**
     * builder for orderCustomLineItemQuantityChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomLineItemQuantityChangedMessageBuilder orderCustomLineItemQuantityChangedBuilder() {
        return com.commercetools.api.models.message.OrderCustomLineItemQuantityChangedMessageBuilder.of();
    }

    /**
     * builder for orderCustomLineItemRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomLineItemRemovedMessageBuilder orderCustomLineItemRemovedBuilder() {
        return com.commercetools.api.models.message.OrderCustomLineItemRemovedMessageBuilder.of();
    }

    /**
     * builder for orderCustomTypeRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomTypeRemovedMessageBuilder orderCustomTypeRemovedBuilder() {
        return com.commercetools.api.models.message.OrderCustomTypeRemovedMessageBuilder.of();
    }

    /**
     * builder for orderCustomTypeSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomTypeSetMessageBuilder orderCustomTypeSetBuilder() {
        return com.commercetools.api.models.message.OrderCustomTypeSetMessageBuilder.of();
    }

    /**
     * builder for orderCustomerEmailSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomerEmailSetMessageBuilder orderCustomerEmailSetBuilder() {
        return com.commercetools.api.models.message.OrderCustomerEmailSetMessageBuilder.of();
    }

    /**
     * builder for orderCustomerGroupSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomerGroupSetMessageBuilder orderCustomerGroupSetBuilder() {
        return com.commercetools.api.models.message.OrderCustomerGroupSetMessageBuilder.of();
    }

    /**
     * builder for orderCustomerSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomerSetMessageBuilder orderCustomerSetBuilder() {
        return com.commercetools.api.models.message.OrderCustomerSetMessageBuilder.of();
    }

    /**
     * builder for orderDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderDeletedMessageBuilder orderDeletedBuilder() {
        return com.commercetools.api.models.message.OrderDeletedMessageBuilder.of();
    }

    /**
     * builder for orderDiscountCodeAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderDiscountCodeAddedMessageBuilder orderDiscountCodeAddedBuilder() {
        return com.commercetools.api.models.message.OrderDiscountCodeAddedMessageBuilder.of();
    }

    /**
     * builder for orderDiscountCodeRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderDiscountCodeRemovedMessageBuilder orderDiscountCodeRemovedBuilder() {
        return com.commercetools.api.models.message.OrderDiscountCodeRemovedMessageBuilder.of();
    }

    /**
     * builder for orderDiscountCodeStateSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderDiscountCodeStateSetMessageBuilder orderDiscountCodeStateSetBuilder() {
        return com.commercetools.api.models.message.OrderDiscountCodeStateSetMessageBuilder.of();
    }

    /**
     * builder for orderEditApplied subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderEditAppliedMessageBuilder orderEditAppliedBuilder() {
        return com.commercetools.api.models.message.OrderEditAppliedMessageBuilder.of();
    }

    /**
     * builder for orderImported subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderImportedMessageBuilder orderImportedBuilder() {
        return com.commercetools.api.models.message.OrderImportedMessageBuilder.of();
    }

    /**
     * builder for orderLineItemAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderLineItemAddedMessageBuilder orderLineItemAddedBuilder() {
        return com.commercetools.api.models.message.OrderLineItemAddedMessageBuilder.of();
    }

    /**
     * builder for orderLineItemDiscountSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderLineItemDiscountSetMessageBuilder orderLineItemDiscountSetBuilder() {
        return com.commercetools.api.models.message.OrderLineItemDiscountSetMessageBuilder.of();
    }

    /**
     * builder for orderLineItemDistributionChannelSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderLineItemDistributionChannelSetMessageBuilder orderLineItemDistributionChannelSetBuilder() {
        return com.commercetools.api.models.message.OrderLineItemDistributionChannelSetMessageBuilder.of();
    }

    /**
     * builder for orderLineItemRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderLineItemRemovedMessageBuilder orderLineItemRemovedBuilder() {
        return com.commercetools.api.models.message.OrderLineItemRemovedMessageBuilder.of();
    }

    /**
     * builder for orderPaymentAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderPaymentAddedMessageBuilder orderPaymentAddedBuilder() {
        return com.commercetools.api.models.message.OrderPaymentAddedMessageBuilder.of();
    }

    /**
     * builder for orderPaymentRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderPaymentRemovedMessageBuilder orderPaymentRemovedBuilder() {
        return com.commercetools.api.models.message.OrderPaymentRemovedMessageBuilder.of();
    }

    /**
     * builder for orderPaymentStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderPaymentStateChangedMessageBuilder orderPaymentStateChangedBuilder() {
        return com.commercetools.api.models.message.OrderPaymentStateChangedMessageBuilder.of();
    }

    /**
     * builder for orderPurchaseOrderNumberSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderPurchaseOrderNumberSetMessageBuilder orderPurchaseOrderNumberSetBuilder() {
        return com.commercetools.api.models.message.OrderPurchaseOrderNumberSetMessageBuilder.of();
    }

    /**
     * builder for orderReturnShipmentStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderReturnShipmentStateChangedMessageBuilder orderReturnShipmentStateChangedBuilder() {
        return com.commercetools.api.models.message.OrderReturnShipmentStateChangedMessageBuilder.of();
    }

    /**
     * builder for orderShipmentStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderShipmentStateChangedMessageBuilder orderShipmentStateChangedBuilder() {
        return com.commercetools.api.models.message.OrderShipmentStateChangedMessageBuilder.of();
    }

    /**
     * builder for orderShippingAddressSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderShippingAddressSetMessageBuilder orderShippingAddressSetBuilder() {
        return com.commercetools.api.models.message.OrderShippingAddressSetMessageBuilder.of();
    }

    /**
     * builder for orderShippingInfoSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderShippingInfoSetMessageBuilder orderShippingInfoSetBuilder() {
        return com.commercetools.api.models.message.OrderShippingInfoSetMessageBuilder.of();
    }

    /**
     * builder for orderShippingRateInputSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderShippingRateInputSetMessageBuilder orderShippingRateInputSetBuilder() {
        return com.commercetools.api.models.message.OrderShippingRateInputSetMessageBuilder.of();
    }

    /**
     * builder for orderStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderStateChangedMessageBuilder orderStateChangedBuilder() {
        return com.commercetools.api.models.message.OrderStateChangedMessageBuilder.of();
    }

    /**
     * builder for orderStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderStateTransitionMessageBuilder orderStateTransitionBuilder() {
        return com.commercetools.api.models.message.OrderStateTransitionMessageBuilder.of();
    }

    /**
     * builder for orderStoreSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderStoreSetMessageBuilder orderStoreSetBuilder() {
        return com.commercetools.api.models.message.OrderStoreSetMessageBuilder.of();
    }

    /**
     * builder for parcelAddedToDelivery subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ParcelAddedToDeliveryMessageBuilder parcelAddedToDeliveryBuilder() {
        return com.commercetools.api.models.message.ParcelAddedToDeliveryMessageBuilder.of();
    }

    /**
     * builder for parcelItemsUpdated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ParcelItemsUpdatedMessageBuilder parcelItemsUpdatedBuilder() {
        return com.commercetools.api.models.message.ParcelItemsUpdatedMessageBuilder.of();
    }

    /**
     * builder for parcelMeasurementsUpdated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ParcelMeasurementsUpdatedMessageBuilder parcelMeasurementsUpdatedBuilder() {
        return com.commercetools.api.models.message.ParcelMeasurementsUpdatedMessageBuilder.of();
    }

    /**
     * builder for parcelRemovedFromDelivery subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ParcelRemovedFromDeliveryMessageBuilder parcelRemovedFromDeliveryBuilder() {
        return com.commercetools.api.models.message.ParcelRemovedFromDeliveryMessageBuilder.of();
    }

    /**
     * builder for parcelTrackingDataUpdated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ParcelTrackingDataUpdatedMessageBuilder parcelTrackingDataUpdatedBuilder() {
        return com.commercetools.api.models.message.ParcelTrackingDataUpdatedMessageBuilder.of();
    }

    /**
     * builder for paymentCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentCreatedMessageBuilder paymentCreatedBuilder() {
        return com.commercetools.api.models.message.PaymentCreatedMessageBuilder.of();
    }

    /**
     * builder for paymentInteractionAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentInteractionAddedMessageBuilder paymentInteractionAddedBuilder() {
        return com.commercetools.api.models.message.PaymentInteractionAddedMessageBuilder.of();
    }

    /**
     * builder for paymentInterfaceIdSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentInterfaceIdSetMessageBuilder paymentInterfaceIdSetBuilder() {
        return com.commercetools.api.models.message.PaymentInterfaceIdSetMessageBuilder.of();
    }

    /**
     * builder for paymentMethodCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodCreatedMessageBuilder paymentMethodCreatedBuilder() {
        return com.commercetools.api.models.message.PaymentMethodCreatedMessageBuilder.of();
    }

    /**
     * builder for paymentMethodCustomFieldAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodCustomFieldAddedMessageBuilder paymentMethodCustomFieldAddedBuilder() {
        return com.commercetools.api.models.message.PaymentMethodCustomFieldAddedMessageBuilder.of();
    }

    /**
     * builder for paymentMethodCustomFieldChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodCustomFieldChangedMessageBuilder paymentMethodCustomFieldChangedBuilder() {
        return com.commercetools.api.models.message.PaymentMethodCustomFieldChangedMessageBuilder.of();
    }

    /**
     * builder for paymentMethodCustomFieldRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodCustomFieldRemovedMessageBuilder paymentMethodCustomFieldRemovedBuilder() {
        return com.commercetools.api.models.message.PaymentMethodCustomFieldRemovedMessageBuilder.of();
    }

    /**
     * builder for paymentMethodCustomTypeRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodCustomTypeRemovedMessageBuilder paymentMethodCustomTypeRemovedBuilder() {
        return com.commercetools.api.models.message.PaymentMethodCustomTypeRemovedMessageBuilder.of();
    }

    /**
     * builder for paymentMethodCustomTypeSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodCustomTypeSetMessageBuilder paymentMethodCustomTypeSetBuilder() {
        return com.commercetools.api.models.message.PaymentMethodCustomTypeSetMessageBuilder.of();
    }

    /**
     * builder for paymentMethodDefaultSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodDefaultSetMessageBuilder paymentMethodDefaultSetBuilder() {
        return com.commercetools.api.models.message.PaymentMethodDefaultSetMessageBuilder.of();
    }

    /**
     * builder for paymentMethodDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodDeletedMessageBuilder paymentMethodDeletedBuilder() {
        return com.commercetools.api.models.message.PaymentMethodDeletedMessageBuilder.of();
    }

    /**
     * builder for paymentMethodInfoCustomFieldAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodInfoCustomFieldAddedMessageBuilder paymentMethodInfoCustomFieldAddedBuilder() {
        return com.commercetools.api.models.message.PaymentMethodInfoCustomFieldAddedMessageBuilder.of();
    }

    /**
     * builder for paymentMethodInfoCustomFieldChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodInfoCustomFieldChangedMessageBuilder paymentMethodInfoCustomFieldChangedBuilder() {
        return com.commercetools.api.models.message.PaymentMethodInfoCustomFieldChangedMessageBuilder.of();
    }

    /**
     * builder for paymentMethodInfoCustomFieldRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodInfoCustomFieldRemovedMessageBuilder paymentMethodInfoCustomFieldRemovedBuilder() {
        return com.commercetools.api.models.message.PaymentMethodInfoCustomFieldRemovedMessageBuilder.of();
    }

    /**
     * builder for paymentMethodInfoCustomTypeRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodInfoCustomTypeRemovedMessageBuilder paymentMethodInfoCustomTypeRemovedBuilder() {
        return com.commercetools.api.models.message.PaymentMethodInfoCustomTypeRemovedMessageBuilder.of();
    }

    /**
     * builder for paymentMethodInfoCustomTypeSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodInfoCustomTypeSetMessageBuilder paymentMethodInfoCustomTypeSetBuilder() {
        return com.commercetools.api.models.message.PaymentMethodInfoCustomTypeSetMessageBuilder.of();
    }

    /**
     * builder for paymentMethodInfoInterfaceAccountSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodInfoInterfaceAccountSetMessageBuilder paymentMethodInfoInterfaceAccountSetBuilder() {
        return com.commercetools.api.models.message.PaymentMethodInfoInterfaceAccountSetMessageBuilder.of();
    }

    /**
     * builder for paymentMethodInfoInterfaceSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodInfoInterfaceSetMessageBuilder paymentMethodInfoInterfaceSetBuilder() {
        return com.commercetools.api.models.message.PaymentMethodInfoInterfaceSetMessageBuilder.of();
    }

    /**
     * builder for paymentMethodInfoMethodSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodInfoMethodSetMessageBuilder paymentMethodInfoMethodSetBuilder() {
        return com.commercetools.api.models.message.PaymentMethodInfoMethodSetMessageBuilder.of();
    }

    /**
     * builder for paymentMethodInfoNameSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodInfoNameSetMessageBuilder paymentMethodInfoNameSetBuilder() {
        return com.commercetools.api.models.message.PaymentMethodInfoNameSetMessageBuilder.of();
    }

    /**
     * builder for paymentMethodInfoTokenSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodInfoTokenSetMessageBuilder paymentMethodInfoTokenSetBuilder() {
        return com.commercetools.api.models.message.PaymentMethodInfoTokenSetMessageBuilder.of();
    }

    /**
     * builder for paymentMethodInterfaceAccountSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodInterfaceAccountSetMessageBuilder paymentMethodInterfaceAccountSetBuilder() {
        return com.commercetools.api.models.message.PaymentMethodInterfaceAccountSetMessageBuilder.of();
    }

    /**
     * builder for paymentMethodKeySet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodKeySetMessageBuilder paymentMethodKeySetBuilder() {
        return com.commercetools.api.models.message.PaymentMethodKeySetMessageBuilder.of();
    }

    /**
     * builder for paymentMethodMethodSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodMethodSetMessageBuilder paymentMethodMethodSetBuilder() {
        return com.commercetools.api.models.message.PaymentMethodMethodSetMessageBuilder.of();
    }

    /**
     * builder for paymentMethodNameSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodNameSetMessageBuilder paymentMethodNameSetBuilder() {
        return com.commercetools.api.models.message.PaymentMethodNameSetMessageBuilder.of();
    }

    /**
     * builder for paymentMethodPaymentInterfaceSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodPaymentInterfaceSetMessageBuilder paymentMethodPaymentInterfaceSetBuilder() {
        return com.commercetools.api.models.message.PaymentMethodPaymentInterfaceSetMessageBuilder.of();
    }

    /**
     * builder for paymentMethodPaymentMethodStatusSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentMethodPaymentMethodStatusSetMessageBuilder paymentMethodPaymentMethodStatusSetBuilder() {
        return com.commercetools.api.models.message.PaymentMethodPaymentMethodStatusSetMessageBuilder.of();
    }

    /**
     * builder for paymentStatusInterfaceCodeSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentStatusInterfaceCodeSetMessageBuilder paymentStatusInterfaceCodeSetBuilder() {
        return com.commercetools.api.models.message.PaymentStatusInterfaceCodeSetMessageBuilder.of();
    }

    /**
     * builder for paymentStatusStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentStatusStateTransitionMessageBuilder paymentStatusStateTransitionBuilder() {
        return com.commercetools.api.models.message.PaymentStatusStateTransitionMessageBuilder.of();
    }

    /**
     * builder for paymentTransactionAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentTransactionAddedMessageBuilder paymentTransactionAddedBuilder() {
        return com.commercetools.api.models.message.PaymentTransactionAddedMessageBuilder.of();
    }

    /**
     * builder for paymentTransactionInterfaceIdSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentTransactionInterfaceIdSetMessageBuilder paymentTransactionInterfaceIdSetBuilder() {
        return com.commercetools.api.models.message.PaymentTransactionInterfaceIdSetMessageBuilder.of();
    }

    /**
     * builder for paymentTransactionStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentTransactionStateChangedMessageBuilder paymentTransactionStateChangedBuilder() {
        return com.commercetools.api.models.message.PaymentTransactionStateChangedMessageBuilder.of();
    }

    /**
     * builder for productAddedToCategory subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductAddedToCategoryMessageBuilder productAddedToCategoryBuilder() {
        return com.commercetools.api.models.message.ProductAddedToCategoryMessageBuilder.of();
    }

    /**
     * builder for productCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductCreatedMessageBuilder productCreatedBuilder() {
        return com.commercetools.api.models.message.ProductCreatedMessageBuilder.of();
    }

    /**
     * builder for productDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductDeletedMessageBuilder productDeletedBuilder() {
        return com.commercetools.api.models.message.ProductDeletedMessageBuilder.of();
    }

    /**
     * builder for productImageAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductImageAddedMessageBuilder productImageAddedBuilder() {
        return com.commercetools.api.models.message.ProductImageAddedMessageBuilder.of();
    }

    /**
     * builder for productPriceAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceAddedMessageBuilder productPriceAddedBuilder() {
        return com.commercetools.api.models.message.ProductPriceAddedMessageBuilder.of();
    }

    /**
     * builder for productPriceChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceChangedMessageBuilder productPriceChangedBuilder() {
        return com.commercetools.api.models.message.ProductPriceChangedMessageBuilder.of();
    }

    /**
     * builder for productPriceCustomFieldAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceCustomFieldAddedMessageBuilder productPriceCustomFieldAddedBuilder() {
        return com.commercetools.api.models.message.ProductPriceCustomFieldAddedMessageBuilder.of();
    }

    /**
     * builder for productPriceCustomFieldChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceCustomFieldChangedMessageBuilder productPriceCustomFieldChangedBuilder() {
        return com.commercetools.api.models.message.ProductPriceCustomFieldChangedMessageBuilder.of();
    }

    /**
     * builder for productPriceCustomFieldRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceCustomFieldRemovedMessageBuilder productPriceCustomFieldRemovedBuilder() {
        return com.commercetools.api.models.message.ProductPriceCustomFieldRemovedMessageBuilder.of();
    }

    /**
     * builder for productPriceCustomFieldsRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceCustomFieldsRemovedMessageBuilder productPriceCustomFieldsRemovedBuilder() {
        return com.commercetools.api.models.message.ProductPriceCustomFieldsRemovedMessageBuilder.of();
    }

    /**
     * builder for productPriceCustomFieldsSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceCustomFieldsSetMessageBuilder productPriceCustomFieldsSetBuilder() {
        return com.commercetools.api.models.message.ProductPriceCustomFieldsSetMessageBuilder.of();
    }

    /**
     * builder for productPriceDiscountsSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceDiscountsSetMessageBuilder productPriceDiscountsSetBuilder() {
        return com.commercetools.api.models.message.ProductPriceDiscountsSetMessageBuilder.of();
    }

    /**
     * builder for productPriceExternalDiscountSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessageBuilder productPriceExternalDiscountSetBuilder() {
        return com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessageBuilder.of();
    }

    /**
     * builder for productPriceKeySet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceKeySetMessageBuilder productPriceKeySetBuilder() {
        return com.commercetools.api.models.message.ProductPriceKeySetMessageBuilder.of();
    }

    /**
     * builder for productPriceModeSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceModeSetMessageBuilder productPriceModeSetBuilder() {
        return com.commercetools.api.models.message.ProductPriceModeSetMessageBuilder.of();
    }

    /**
     * builder for productPriceRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceRemovedMessageBuilder productPriceRemovedBuilder() {
        return com.commercetools.api.models.message.ProductPriceRemovedMessageBuilder.of();
    }

    /**
     * builder for productPricesSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPricesSetMessageBuilder productPricesSetBuilder() {
        return com.commercetools.api.models.message.ProductPricesSetMessageBuilder.of();
    }

    /**
     * builder for productPublished subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPublishedMessageBuilder productPublishedBuilder() {
        return com.commercetools.api.models.message.ProductPublishedMessageBuilder.of();
    }

    /**
     * builder for productRemovedFromCategory subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductRemovedFromCategoryMessageBuilder productRemovedFromCategoryBuilder() {
        return com.commercetools.api.models.message.ProductRemovedFromCategoryMessageBuilder.of();
    }

    /**
     * builder for productRevertedStagedChanges subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductRevertedStagedChangesMessageBuilder productRevertedStagedChangesBuilder() {
        return com.commercetools.api.models.message.ProductRevertedStagedChangesMessageBuilder.of();
    }

    /**
     * builder for productSelectionCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductSelectionCreatedMessageBuilder productSelectionCreatedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionCreatedMessageBuilder.of();
    }

    /**
     * builder for productSelectionDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductSelectionDeletedMessageBuilder productSelectionDeletedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionDeletedMessageBuilder.of();
    }

    /**
     * builder for productSelectionProductAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductSelectionProductAddedMessageBuilder productSelectionProductAddedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionProductAddedMessageBuilder.of();
    }

    /**
     * builder for productSelectionProductExcluded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductSelectionProductExcludedMessageBuilder productSelectionProductExcludedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionProductExcludedMessageBuilder.of();
    }

    /**
     * builder for productSelectionProductRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductSelectionProductRemovedMessageBuilder productSelectionProductRemovedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionProductRemovedMessageBuilder.of();
    }

    /**
     * builder for productSelectionVariantExclusionChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductSelectionVariantExclusionChangedMessageBuilder productSelectionVariantExclusionChangedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionVariantExclusionChangedMessageBuilder.of();
    }

    /**
     * builder for productSelectionVariantSelectionChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductSelectionVariantSelectionChangedMessageBuilder productSelectionVariantSelectionChangedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionVariantSelectionChangedMessageBuilder.of();
    }

    /**
     * builder for productSlugChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductSlugChangedMessageBuilder productSlugChangedBuilder() {
        return com.commercetools.api.models.message.ProductSlugChangedMessageBuilder.of();
    }

    /**
     * builder for productStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductStateTransitionMessageBuilder productStateTransitionBuilder() {
        return com.commercetools.api.models.message.ProductStateTransitionMessageBuilder.of();
    }

    /**
     * builder for productTailoringCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductTailoringCreatedMessageBuilder productTailoringCreatedBuilder() {
        return com.commercetools.api.models.message.ProductTailoringCreatedMessageBuilder.of();
    }

    /**
     * builder for productTailoringDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductTailoringDeletedMessageBuilder productTailoringDeletedBuilder() {
        return com.commercetools.api.models.message.ProductTailoringDeletedMessageBuilder.of();
    }

    /**
     * builder for productTailoringDescriptionSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductTailoringDescriptionSetMessageBuilder productTailoringDescriptionSetBuilder() {
        return com.commercetools.api.models.message.ProductTailoringDescriptionSetMessageBuilder.of();
    }

    /**
     * builder for productTailoringImageAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductTailoringImageAddedMessageBuilder productTailoringImageAddedBuilder() {
        return com.commercetools.api.models.message.ProductTailoringImageAddedMessageBuilder.of();
    }

    /**
     * builder for productTailoringImagesSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductTailoringImagesSetMessageBuilder productTailoringImagesSetBuilder() {
        return com.commercetools.api.models.message.ProductTailoringImagesSetMessageBuilder.of();
    }

    /**
     * builder for productTailoringNameSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductTailoringNameSetMessageBuilder productTailoringNameSetBuilder() {
        return com.commercetools.api.models.message.ProductTailoringNameSetMessageBuilder.of();
    }

    /**
     * builder for productTailoringPublished subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductTailoringPublishedMessageBuilder productTailoringPublishedBuilder() {
        return com.commercetools.api.models.message.ProductTailoringPublishedMessageBuilder.of();
    }

    /**
     * builder for productTailoringSlugSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductTailoringSlugSetMessageBuilder productTailoringSlugSetBuilder() {
        return com.commercetools.api.models.message.ProductTailoringSlugSetMessageBuilder.of();
    }

    /**
     * builder for productTailoringUnpublished subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductTailoringUnpublishedMessageBuilder productTailoringUnpublishedBuilder() {
        return com.commercetools.api.models.message.ProductTailoringUnpublishedMessageBuilder.of();
    }

    /**
     * builder for productUnpublished subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductUnpublishedMessageBuilder productUnpublishedBuilder() {
        return com.commercetools.api.models.message.ProductUnpublishedMessageBuilder.of();
    }

    /**
     * builder for productVariantAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductVariantAddedMessageBuilder productVariantAddedBuilder() {
        return com.commercetools.api.models.message.ProductVariantAddedMessageBuilder.of();
    }

    /**
     * builder for productVariantDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductVariantDeletedMessageBuilder productVariantDeletedBuilder() {
        return com.commercetools.api.models.message.ProductVariantDeletedMessageBuilder.of();
    }

    /**
     * builder for productVariantTailoringAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductVariantTailoringAddedMessageBuilder productVariantTailoringAddedBuilder() {
        return com.commercetools.api.models.message.ProductVariantTailoringAddedMessageBuilder.of();
    }

    /**
     * builder for productVariantTailoringRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductVariantTailoringRemovedMessageBuilder productVariantTailoringRemovedBuilder() {
        return com.commercetools.api.models.message.ProductVariantTailoringRemovedMessageBuilder.of();
    }

    /**
     * builder for quoteCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteCreatedMessageBuilder quoteCreatedBuilder() {
        return com.commercetools.api.models.message.QuoteCreatedMessageBuilder.of();
    }

    /**
     * builder for quoteCustomerChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteCustomerChangedMessageBuilder quoteCustomerChangedBuilder() {
        return com.commercetools.api.models.message.QuoteCustomerChangedMessageBuilder.of();
    }

    /**
     * builder for quoteDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteDeletedMessageBuilder quoteDeletedBuilder() {
        return com.commercetools.api.models.message.QuoteDeletedMessageBuilder.of();
    }

    /**
     * builder for quoteRenegotiationRequested subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteRenegotiationRequestedMessageBuilder quoteRenegotiationRequestedBuilder() {
        return com.commercetools.api.models.message.QuoteRenegotiationRequestedMessageBuilder.of();
    }

    /**
     * builder for quoteRequestCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteRequestCreatedMessageBuilder quoteRequestCreatedBuilder() {
        return com.commercetools.api.models.message.QuoteRequestCreatedMessageBuilder.of();
    }

    /**
     * builder for quoteRequestCustomerChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteRequestCustomerChangedMessageBuilder quoteRequestCustomerChangedBuilder() {
        return com.commercetools.api.models.message.QuoteRequestCustomerChangedMessageBuilder.of();
    }

    /**
     * builder for quoteRequestDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteRequestDeletedMessageBuilder quoteRequestDeletedBuilder() {
        return com.commercetools.api.models.message.QuoteRequestDeletedMessageBuilder.of();
    }

    /**
     * builder for quoteRequestStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteRequestStateChangedMessageBuilder quoteRequestStateChangedBuilder() {
        return com.commercetools.api.models.message.QuoteRequestStateChangedMessageBuilder.of();
    }

    /**
     * builder for quoteRequestStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteRequestStateTransitionMessageBuilder quoteRequestStateTransitionBuilder() {
        return com.commercetools.api.models.message.QuoteRequestStateTransitionMessageBuilder.of();
    }

    /**
     * builder for quoteStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteStateChangedMessageBuilder quoteStateChangedBuilder() {
        return com.commercetools.api.models.message.QuoteStateChangedMessageBuilder.of();
    }

    /**
     * builder for quoteStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteStateTransitionMessageBuilder quoteStateTransitionBuilder() {
        return com.commercetools.api.models.message.QuoteStateTransitionMessageBuilder.of();
    }

    /**
     * builder for recurringOrderCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.RecurringOrderCreatedMessageBuilder recurringOrderCreatedBuilder() {
        return com.commercetools.api.models.message.RecurringOrderCreatedMessageBuilder.of();
    }

    /**
     * builder for recurringOrderCustomFieldAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.RecurringOrderCustomFieldAddedMessageBuilder recurringOrderCustomFieldAddedBuilder() {
        return com.commercetools.api.models.message.RecurringOrderCustomFieldAddedMessageBuilder.of();
    }

    /**
     * builder for recurringOrderCustomFieldChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.RecurringOrderCustomFieldChangedMessageBuilder recurringOrderCustomFieldChangedBuilder() {
        return com.commercetools.api.models.message.RecurringOrderCustomFieldChangedMessageBuilder.of();
    }

    /**
     * builder for recurringOrderCustomFieldRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.RecurringOrderCustomFieldRemovedMessageBuilder recurringOrderCustomFieldRemovedBuilder() {
        return com.commercetools.api.models.message.RecurringOrderCustomFieldRemovedMessageBuilder.of();
    }

    /**
     * builder for recurringOrderCustomTypeRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.RecurringOrderCustomTypeRemovedMessageBuilder recurringOrderCustomTypeRemovedBuilder() {
        return com.commercetools.api.models.message.RecurringOrderCustomTypeRemovedMessageBuilder.of();
    }

    /**
     * builder for recurringOrderCustomTypeSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.RecurringOrderCustomTypeSetMessageBuilder recurringOrderCustomTypeSetBuilder() {
        return com.commercetools.api.models.message.RecurringOrderCustomTypeSetMessageBuilder.of();
    }

    /**
     * builder for recurringOrderDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.RecurringOrderDeletedMessageBuilder recurringOrderDeletedBuilder() {
        return com.commercetools.api.models.message.RecurringOrderDeletedMessageBuilder.of();
    }

    /**
     * builder for recurringOrderExpiresAtSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.RecurringOrderExpiresAtSetMessageBuilder recurringOrderExpiresAtSetBuilder() {
        return com.commercetools.api.models.message.RecurringOrderExpiresAtSetMessageBuilder.of();
    }

    /**
     * builder for recurringOrderFailed subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.RecurringOrderFailedMessageBuilder recurringOrderFailedBuilder() {
        return com.commercetools.api.models.message.RecurringOrderFailedMessageBuilder.of();
    }

    /**
     * builder for recurringOrderKeySet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.RecurringOrderKeySetMessageBuilder recurringOrderKeySetBuilder() {
        return com.commercetools.api.models.message.RecurringOrderKeySetMessageBuilder.of();
    }

    /**
     * builder for recurringOrderScheduleSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.RecurringOrderScheduleSetMessageBuilder recurringOrderScheduleSetBuilder() {
        return com.commercetools.api.models.message.RecurringOrderScheduleSetMessageBuilder.of();
    }

    /**
     * builder for recurringOrderStartsAtSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.RecurringOrderStartsAtSetMessageBuilder recurringOrderStartsAtSetBuilder() {
        return com.commercetools.api.models.message.RecurringOrderStartsAtSetMessageBuilder.of();
    }

    /**
     * builder for recurringOrderStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.RecurringOrderStateChangedMessageBuilder recurringOrderStateChangedBuilder() {
        return com.commercetools.api.models.message.RecurringOrderStateChangedMessageBuilder.of();
    }

    /**
     * builder for recurringOrderStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.RecurringOrderStateTransitionMessageBuilder recurringOrderStateTransitionBuilder() {
        return com.commercetools.api.models.message.RecurringOrderStateTransitionMessageBuilder.of();
    }

    /**
     * builder for returnInfoAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ReturnInfoAddedMessageBuilder returnInfoAddedBuilder() {
        return com.commercetools.api.models.message.ReturnInfoAddedMessageBuilder.of();
    }

    /**
     * builder for returnInfoSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ReturnInfoSetMessageBuilder returnInfoSetBuilder() {
        return com.commercetools.api.models.message.ReturnInfoSetMessageBuilder.of();
    }

    /**
     * builder for reviewCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ReviewCreatedMessageBuilder reviewCreatedBuilder() {
        return com.commercetools.api.models.message.ReviewCreatedMessageBuilder.of();
    }

    /**
     * builder for reviewRatingSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ReviewRatingSetMessageBuilder reviewRatingSetBuilder() {
        return com.commercetools.api.models.message.ReviewRatingSetMessageBuilder.of();
    }

    /**
     * builder for reviewStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ReviewStateTransitionMessageBuilder reviewStateTransitionBuilder() {
        return com.commercetools.api.models.message.ReviewStateTransitionMessageBuilder.of();
    }

    /**
     * builder for shoppingListLineItemAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ShoppingListLineItemAddedMessageBuilder shoppingListLineItemAddedBuilder() {
        return com.commercetools.api.models.message.ShoppingListLineItemAddedMessageBuilder.of();
    }

    /**
     * builder for shoppingListLineItemRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ShoppingListLineItemRemovedMessageBuilder shoppingListLineItemRemovedBuilder() {
        return com.commercetools.api.models.message.ShoppingListLineItemRemovedMessageBuilder.of();
    }

    /**
     * builder for stagedQuoteCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StagedQuoteCreatedMessageBuilder stagedQuoteCreatedBuilder() {
        return com.commercetools.api.models.message.StagedQuoteCreatedMessageBuilder.of();
    }

    /**
     * builder for stagedQuoteDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StagedQuoteDeletedMessageBuilder stagedQuoteDeletedBuilder() {
        return com.commercetools.api.models.message.StagedQuoteDeletedMessageBuilder.of();
    }

    /**
     * builder for stagedQuoteSellerCommentSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StagedQuoteSellerCommentSetMessageBuilder stagedQuoteSellerCommentSetBuilder() {
        return com.commercetools.api.models.message.StagedQuoteSellerCommentSetMessageBuilder.of();
    }

    /**
     * builder for stagedQuoteStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StagedQuoteStateChangedMessageBuilder stagedQuoteStateChangedBuilder() {
        return com.commercetools.api.models.message.StagedQuoteStateChangedMessageBuilder.of();
    }

    /**
     * builder for stagedQuoteStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StagedQuoteStateTransitionMessageBuilder stagedQuoteStateTransitionBuilder() {
        return com.commercetools.api.models.message.StagedQuoteStateTransitionMessageBuilder.of();
    }

    /**
     * builder for stagedQuoteValidToSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StagedQuoteValidToSetMessageBuilder stagedQuoteValidToSetBuilder() {
        return com.commercetools.api.models.message.StagedQuoteValidToSetMessageBuilder.of();
    }

    /**
     * builder for standalonePriceActiveChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceActiveChangedMessageBuilder standalonePriceActiveChangedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceActiveChangedMessageBuilder.of();
    }

    /**
     * builder for standalonePriceCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceCreatedMessageBuilder standalonePriceCreatedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceCreatedMessageBuilder.of();
    }

    /**
     * builder for standalonePriceDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceDeletedMessageBuilder standalonePriceDeletedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceDeletedMessageBuilder.of();
    }

    /**
     * builder for standalonePriceDiscountSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceDiscountSetMessageBuilder standalonePriceDiscountSetBuilder() {
        return com.commercetools.api.models.message.StandalonePriceDiscountSetMessageBuilder.of();
    }

    /**
     * builder for standalonePriceExternalDiscountSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceExternalDiscountSetMessageBuilder standalonePriceExternalDiscountSetBuilder() {
        return com.commercetools.api.models.message.StandalonePriceExternalDiscountSetMessageBuilder.of();
    }

    /**
     * builder for standalonePriceKeySet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceKeySetMessageBuilder standalonePriceKeySetBuilder() {
        return com.commercetools.api.models.message.StandalonePriceKeySetMessageBuilder.of();
    }

    /**
     * builder for standalonePriceStagedChangesApplied subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceStagedChangesAppliedMessageBuilder standalonePriceStagedChangesAppliedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceStagedChangesAppliedMessageBuilder.of();
    }

    /**
     * builder for standalonePriceStagedChangesRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceStagedChangesRemovedMessageBuilder standalonePriceStagedChangesRemovedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceStagedChangesRemovedMessageBuilder.of();
    }

    /**
     * builder for standalonePriceTierAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceTierAddedMessageBuilder standalonePriceTierAddedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceTierAddedMessageBuilder.of();
    }

    /**
     * builder for standalonePriceTierRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceTierRemovedMessageBuilder standalonePriceTierRemovedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceTierRemovedMessageBuilder.of();
    }

    /**
     * builder for standalonePriceTiersSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceTiersSetMessageBuilder standalonePriceTiersSetBuilder() {
        return com.commercetools.api.models.message.StandalonePriceTiersSetMessageBuilder.of();
    }

    /**
     * builder for standalonePriceValidFromAndUntilSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceValidFromAndUntilSetMessageBuilder standalonePriceValidFromAndUntilSetBuilder() {
        return com.commercetools.api.models.message.StandalonePriceValidFromAndUntilSetMessageBuilder.of();
    }

    /**
     * builder for standalonePriceValidFromSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceValidFromSetMessageBuilder standalonePriceValidFromSetBuilder() {
        return com.commercetools.api.models.message.StandalonePriceValidFromSetMessageBuilder.of();
    }

    /**
     * builder for standalonePriceValidUntilSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceValidUntilSetMessageBuilder standalonePriceValidUntilSetBuilder() {
        return com.commercetools.api.models.message.StandalonePriceValidUntilSetMessageBuilder.of();
    }

    /**
     * builder for standalonePriceValueChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceValueChangedMessageBuilder standalonePriceValueChangedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceValueChangedMessageBuilder.of();
    }

    /**
     * builder for storeCountriesChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StoreCountriesChangedMessageBuilder storeCountriesChangedBuilder() {
        return com.commercetools.api.models.message.StoreCountriesChangedMessageBuilder.of();
    }

    /**
     * builder for storeCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StoreCreatedMessageBuilder storeCreatedBuilder() {
        return com.commercetools.api.models.message.StoreCreatedMessageBuilder.of();
    }

    /**
     * builder for storeDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StoreDeletedMessageBuilder storeDeletedBuilder() {
        return com.commercetools.api.models.message.StoreDeletedMessageBuilder.of();
    }

    /**
     * builder for storeDistributionChannelsChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StoreDistributionChannelsChangedMessageBuilder storeDistributionChannelsChangedBuilder() {
        return com.commercetools.api.models.message.StoreDistributionChannelsChangedMessageBuilder.of();
    }

    /**
     * builder for storeLanguagesChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StoreLanguagesChangedMessageBuilder storeLanguagesChangedBuilder() {
        return com.commercetools.api.models.message.StoreLanguagesChangedMessageBuilder.of();
    }

    /**
     * builder for storeNameSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StoreNameSetMessageBuilder storeNameSetBuilder() {
        return com.commercetools.api.models.message.StoreNameSetMessageBuilder.of();
    }

    /**
     * builder for storeProductSelectionsChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StoreProductSelectionsChangedMessageBuilder storeProductSelectionsChangedBuilder() {
        return com.commercetools.api.models.message.StoreProductSelectionsChangedMessageBuilder.of();
    }

    /**
     * builder for storeSupplyChannelsChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StoreSupplyChannelsChangedMessageBuilder storeSupplyChannelsChangedBuilder() {
        return com.commercetools.api.models.message.StoreSupplyChannelsChangedMessageBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMessage(Function<Message, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Message> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Message>() {
            @Override
            public String toString() {
                return "TypeReference<Message>";
            }
        };
    }
}
