
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
 *     AssociateRoleNameSetMessagePayload associateRoleNameSetMessagePayload = AssociateRoleNameSetMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("AssociateRoleNameSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AssociateRoleNameSetMessagePayloadImpl.class)
public interface AssociateRoleNameSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for AssociateRoleNameSetMessagePayload
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
     * @return instance of AssociateRoleNameSetMessagePayload
     */
    public static AssociateRoleNameSetMessagePayload of() {
        return new AssociateRoleNameSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy AssociateRoleNameSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static AssociateRoleNameSetMessagePayload of(final AssociateRoleNameSetMessagePayload template) {
        AssociateRoleNameSetMessagePayloadImpl instance = new AssociateRoleNameSetMessagePayloadImpl();
        instance.setName(template.getName());
        return instance;
    }

    public AssociateRoleNameSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of AssociateRoleNameSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssociateRoleNameSetMessagePayload deepCopy(
            @Nullable final AssociateRoleNameSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        AssociateRoleNameSetMessagePayloadImpl instance = new AssociateRoleNameSetMessagePayloadImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for AssociateRoleNameSetMessagePayload
     * @return builder
     */
    public static AssociateRoleNameSetMessagePayloadBuilder builder() {
        return AssociateRoleNameSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for AssociateRoleNameSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleNameSetMessagePayloadBuilder builder(final AssociateRoleNameSetMessagePayload template) {
        return AssociateRoleNameSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssociateRoleNameSetMessagePayload(Function<AssociateRoleNameSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssociateRoleNameSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssociateRoleNameSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<AssociateRoleNameSetMessagePayload>";
            }
        };
    }
}
