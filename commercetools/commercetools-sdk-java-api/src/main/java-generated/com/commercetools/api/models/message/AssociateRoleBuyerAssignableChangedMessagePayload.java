
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
 *     AssociateRoleBuyerAssignableChangedMessagePayload associateRoleBuyerAssignableChangedMessagePayload = AssociateRoleBuyerAssignableChangedMessagePayload.builder()
 *             .buyerAssignable(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AssociateRoleBuyerAssignableChangedMessagePayloadImpl.class)
public interface AssociateRoleBuyerAssignableChangedMessagePayload extends MessagePayload {

    /**
     * discriminator value for AssociateRoleBuyerAssignableChangedMessagePayload
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
     * @return instance of AssociateRoleBuyerAssignableChangedMessagePayload
     */
    public static AssociateRoleBuyerAssignableChangedMessagePayload of() {
        return new AssociateRoleBuyerAssignableChangedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy AssociateRoleBuyerAssignableChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static AssociateRoleBuyerAssignableChangedMessagePayload of(
            final AssociateRoleBuyerAssignableChangedMessagePayload template) {
        AssociateRoleBuyerAssignableChangedMessagePayloadImpl instance = new AssociateRoleBuyerAssignableChangedMessagePayloadImpl();
        instance.setBuyerAssignable(template.getBuyerAssignable());
        return instance;
    }

    /**
     * factory method to create a deep copy of AssociateRoleBuyerAssignableChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssociateRoleBuyerAssignableChangedMessagePayload deepCopy(
            @Nullable final AssociateRoleBuyerAssignableChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        AssociateRoleBuyerAssignableChangedMessagePayloadImpl instance = new AssociateRoleBuyerAssignableChangedMessagePayloadImpl();
        instance.setBuyerAssignable(template.getBuyerAssignable());
        return instance;
    }

    /**
     * builder factory method for AssociateRoleBuyerAssignableChangedMessagePayload
     * @return builder
     */
    public static AssociateRoleBuyerAssignableChangedMessagePayloadBuilder builder() {
        return AssociateRoleBuyerAssignableChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for AssociateRoleBuyerAssignableChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleBuyerAssignableChangedMessagePayloadBuilder builder(
            final AssociateRoleBuyerAssignableChangedMessagePayload template) {
        return AssociateRoleBuyerAssignableChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssociateRoleBuyerAssignableChangedMessagePayload(
            Function<AssociateRoleBuyerAssignableChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssociateRoleBuyerAssignableChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssociateRoleBuyerAssignableChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<AssociateRoleBuyerAssignableChangedMessagePayload>";
            }
        };
    }
}
