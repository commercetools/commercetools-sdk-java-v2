
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
 *  <p>Generated after a successful Set Name update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRoleNameChangedMessagePayload associateRoleNameChangedMessagePayload = AssociateRoleNameChangedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AssociateRoleNameChangedMessagePayloadImpl.class)
public interface AssociateRoleNameChangedMessagePayload extends MessagePayload {

    /**
     * discriminator value for AssociateRoleNameChangedMessagePayload
     */
    String ASSOCIATE_ROLE_NAME_SET = "AssociateRoleNameSet";

    /**
     *  <p>Updated name of the AssociateRole.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Updated name of the AssociateRole.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     * factory method
     * @return instance of AssociateRoleNameChangedMessagePayload
     */
    public static AssociateRoleNameChangedMessagePayload of() {
        return new AssociateRoleNameChangedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy AssociateRoleNameChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static AssociateRoleNameChangedMessagePayload of(final AssociateRoleNameChangedMessagePayload template) {
        AssociateRoleNameChangedMessagePayloadImpl instance = new AssociateRoleNameChangedMessagePayloadImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * factory method to create a deep copy of AssociateRoleNameChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssociateRoleNameChangedMessagePayload deepCopy(
            @Nullable final AssociateRoleNameChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        AssociateRoleNameChangedMessagePayloadImpl instance = new AssociateRoleNameChangedMessagePayloadImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for AssociateRoleNameChangedMessagePayload
     * @return builder
     */
    public static AssociateRoleNameChangedMessagePayloadBuilder builder() {
        return AssociateRoleNameChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for AssociateRoleNameChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleNameChangedMessagePayloadBuilder builder(
            final AssociateRoleNameChangedMessagePayload template) {
        return AssociateRoleNameChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssociateRoleNameChangedMessagePayload(
            Function<AssociateRoleNameChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssociateRoleNameChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssociateRoleNameChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<AssociateRoleNameChangedMessagePayload>";
            }
        };
    }
}
