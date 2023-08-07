
package com.commercetools.history.models.label;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssociateRoleLabel
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRoleLabel associateRoleLabel = AssociateRoleLabel.builder()
 *             .key("{key}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AssociateRoleLabelImpl.class)
public interface AssociateRoleLabel extends Label {

    /**
     * discriminator value for AssociateRoleLabel
     */
    String ASSOCIATE_ROLE_LABEL = "AssociateRoleLabel";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>User-defined unique identifier of the Associate Role.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Name of the Associate Role.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>User-defined unique identifier of the Associate Role.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Name of the Associate Role.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     * factory method
     * @return instance of AssociateRoleLabel
     */
    public static AssociateRoleLabel of() {
        return new AssociateRoleLabelImpl();
    }

    /**
     * factory method to create a shallow copy AssociateRoleLabel
     * @param template instance to be copied
     * @return copy instance
     */
    public static AssociateRoleLabel of(final AssociateRoleLabel template) {
        AssociateRoleLabelImpl instance = new AssociateRoleLabelImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        return instance;
    }

    /**
     * factory method to create a deep copy of AssociateRoleLabel
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssociateRoleLabel deepCopy(@Nullable final AssociateRoleLabel template) {
        if (template == null) {
            return null;
        }
        AssociateRoleLabelImpl instance = new AssociateRoleLabelImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for AssociateRoleLabel
     * @return builder
     */
    public static AssociateRoleLabelBuilder builder() {
        return AssociateRoleLabelBuilder.of();
    }

    /**
     * create builder for AssociateRoleLabel instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleLabelBuilder builder(final AssociateRoleLabel template) {
        return AssociateRoleLabelBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssociateRoleLabel(Function<AssociateRoleLabel, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssociateRoleLabel> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssociateRoleLabel>() {
            @Override
            public String toString() {
                return "TypeReference<AssociateRoleLabel>";
            }
        };
    }
}
