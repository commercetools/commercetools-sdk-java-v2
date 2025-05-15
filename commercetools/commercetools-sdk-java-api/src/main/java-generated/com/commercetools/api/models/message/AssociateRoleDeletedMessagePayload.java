
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Delete AssociateRole request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRoleDeletedMessagePayload associateRoleDeletedMessagePayload = AssociateRoleDeletedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("AssociateRoleDeleted")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AssociateRoleDeletedMessagePayloadImpl.class)
public interface AssociateRoleDeletedMessagePayload extends MessagePayload {

    /**
     * discriminator value for AssociateRoleDeletedMessagePayload
     */
    String ASSOCIATE_ROLE_DELETED = "AssociateRoleDeleted";

    /**
     * factory method
     * @return instance of AssociateRoleDeletedMessagePayload
     */
    public static AssociateRoleDeletedMessagePayload of() {
        return new AssociateRoleDeletedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy AssociateRoleDeletedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static AssociateRoleDeletedMessagePayload of(final AssociateRoleDeletedMessagePayload template) {
        AssociateRoleDeletedMessagePayloadImpl instance = new AssociateRoleDeletedMessagePayloadImpl();
        return instance;
    }

    public AssociateRoleDeletedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of AssociateRoleDeletedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssociateRoleDeletedMessagePayload deepCopy(
            @Nullable final AssociateRoleDeletedMessagePayload template) {
        if (template == null) {
            return null;
        }
        AssociateRoleDeletedMessagePayloadImpl instance = new AssociateRoleDeletedMessagePayloadImpl();
        return instance;
    }

    /**
     * builder factory method for AssociateRoleDeletedMessagePayload
     * @return builder
     */
    public static AssociateRoleDeletedMessagePayloadBuilder builder() {
        return AssociateRoleDeletedMessagePayloadBuilder.of();
    }

    /**
     * create builder for AssociateRoleDeletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleDeletedMessagePayloadBuilder builder(final AssociateRoleDeletedMessagePayload template) {
        return AssociateRoleDeletedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssociateRoleDeletedMessagePayload(Function<AssociateRoleDeletedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssociateRoleDeletedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssociateRoleDeletedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<AssociateRoleDeletedMessagePayload>";
            }
        };
    }
}
