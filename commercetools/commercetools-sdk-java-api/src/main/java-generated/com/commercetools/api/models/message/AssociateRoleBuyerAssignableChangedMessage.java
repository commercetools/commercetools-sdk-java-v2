
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
 *  <p>Generated after a successful Change BuyerAssignable update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRoleBuyerAssignableChangedMessage associateRoleBuyerAssignableChangedMessage = AssociateRoleBuyerAssignableChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .buyerAssignable(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("AssociateRoleBuyerAssignableChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AssociateRoleBuyerAssignableChangedMessageImpl.class)
public interface AssociateRoleBuyerAssignableChangedMessage extends Message {

    /**
     * discriminator value for AssociateRoleBuyerAssignableChangedMessage
     */
    String ASSOCIATE_ROLE_BUYER_ASSIGNABLE_CHANGED = "AssociateRoleBuyerAssignableChanged";

    /**
     *  <p>The new value of the <code>buyerAssignable</code> field of the AssociateRole.</p>
     * @return buyerAssignable
     */
    @NotNull
    @JsonProperty("buyerAssignable")
    public Boolean getBuyerAssignable();

    /**
     *  <p>The new value of the <code>buyerAssignable</code> field of the AssociateRole.</p>
     * @param buyerAssignable value to be set
     */

    public void setBuyerAssignable(final Boolean buyerAssignable);

    /**
     * factory method
     * @return instance of AssociateRoleBuyerAssignableChangedMessage
     */
    public static AssociateRoleBuyerAssignableChangedMessage of() {
        return new AssociateRoleBuyerAssignableChangedMessageImpl();
    }

    /**
     * factory method to create a shallow copy AssociateRoleBuyerAssignableChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static AssociateRoleBuyerAssignableChangedMessage of(
            final AssociateRoleBuyerAssignableChangedMessage template) {
        AssociateRoleBuyerAssignableChangedMessageImpl instance = new AssociateRoleBuyerAssignableChangedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setBuyerAssignable(template.getBuyerAssignable());
        return instance;
    }

    public AssociateRoleBuyerAssignableChangedMessage copyDeep();

    /**
     * factory method to create a deep copy of AssociateRoleBuyerAssignableChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssociateRoleBuyerAssignableChangedMessage deepCopy(
            @Nullable final AssociateRoleBuyerAssignableChangedMessage template) {
        if (template == null) {
            return null;
        }
        AssociateRoleBuyerAssignableChangedMessageImpl instance = new AssociateRoleBuyerAssignableChangedMessageImpl();
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
        instance.setBuyerAssignable(template.getBuyerAssignable());
        return instance;
    }

    /**
     * builder factory method for AssociateRoleBuyerAssignableChangedMessage
     * @return builder
     */
    public static AssociateRoleBuyerAssignableChangedMessageBuilder builder() {
        return AssociateRoleBuyerAssignableChangedMessageBuilder.of();
    }

    /**
     * create builder for AssociateRoleBuyerAssignableChangedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleBuyerAssignableChangedMessageBuilder builder(
            final AssociateRoleBuyerAssignableChangedMessage template) {
        return AssociateRoleBuyerAssignableChangedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssociateRoleBuyerAssignableChangedMessage(
            Function<AssociateRoleBuyerAssignableChangedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssociateRoleBuyerAssignableChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssociateRoleBuyerAssignableChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<AssociateRoleBuyerAssignableChangedMessage>";
            }
        };
    }
}
