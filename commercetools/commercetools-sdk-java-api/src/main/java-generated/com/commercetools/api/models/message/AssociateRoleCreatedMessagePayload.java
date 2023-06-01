package com.commercetools.api.models.message;

import com.commercetools.api.models.associate_role.AssociateRole;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.AssociateRoleCreatedMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>Generated after a successful Create AssociateRole request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRoleCreatedMessagePayload associateRoleCreatedMessagePayload = AssociateRoleCreatedMessagePayload.builder()
 *             .associateRole(associateRoleBuilder -> associateRoleBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = AssociateRoleCreatedMessagePayloadImpl.class)
public interface AssociateRoleCreatedMessagePayload extends MessagePayload {

    /**
     * discriminator value for AssociateRoleCreatedMessagePayload
     */
    String ASSOCIATE_ROLE_CREATED = "AssociateRoleCreated";

    /**
     *  <p>The AssociateRole that was created.</p>
     * @return associateRole
     */
    @NotNull
    @Valid
    @JsonProperty("associateRole")
    public AssociateRole getAssociateRole();

    /**
     *  <p>The AssociateRole that was created.</p>
     * @param associateRole value to be set
     */
    
    public void setAssociateRole(final AssociateRole associateRole);
    

    /**
     * factory method
     * @return instance of AssociateRoleCreatedMessagePayload
     */
    public static AssociateRoleCreatedMessagePayload of(){
        return new AssociateRoleCreatedMessagePayloadImpl();
    }
    

    /**
     * factory method to create a shallow copy AssociateRoleCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static AssociateRoleCreatedMessagePayload of(final AssociateRoleCreatedMessagePayload template) {
        AssociateRoleCreatedMessagePayloadImpl instance = new AssociateRoleCreatedMessagePayloadImpl();
        instance.setAssociateRole(template.getAssociateRole());
        return instance;
    }

    /**
     * factory method to create a deep copy of AssociateRoleCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssociateRoleCreatedMessagePayload deepCopy(@Nullable final AssociateRoleCreatedMessagePayload template) {
        if (template == null) {
            return null;
        }
        AssociateRoleCreatedMessagePayloadImpl instance = new AssociateRoleCreatedMessagePayloadImpl();
        instance.setAssociateRole(com.commercetools.api.models.associate_role.AssociateRole.deepCopy(template.getAssociateRole()));
        return instance;
    }

    /**
     * builder factory method for AssociateRoleCreatedMessagePayload
     * @return builder
     */
    public static AssociateRoleCreatedMessagePayloadBuilder builder() {
        return AssociateRoleCreatedMessagePayloadBuilder.of();
    }
    
    /**
     * create builder for AssociateRoleCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleCreatedMessagePayloadBuilder builder(final AssociateRoleCreatedMessagePayload template) {
        return AssociateRoleCreatedMessagePayloadBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssociateRoleCreatedMessagePayload(Function<AssociateRoleCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssociateRoleCreatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssociateRoleCreatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<AssociateRoleCreatedMessagePayload>";
            }
        };
    }
}
