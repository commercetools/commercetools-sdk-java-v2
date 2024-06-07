
package com.commercetools.api.models.associate_role;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssociateRoleDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRoleDraft associateRoleDraft = AssociateRoleDraft.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AssociateRoleDraftImpl.class)
public interface AssociateRoleDraft extends io.vrap.rmf.base.client.Draft<AssociateRoleDraft> {

    /**
     *  <p>User-defined unique and immutable identifier for the AssociateRole.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Name of the AssociateRole.</p>
     * @return name
     */

    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Whether the AssociateRole can be assigned to an Associate by a buyer.</p>
     * @return buyerAssignable
     */

    @JsonProperty("buyerAssignable")
    public Boolean getBuyerAssignable();

    /**
     *  <p>List of Permissions for the AssociateRole.</p>
     * @return permissions
     */

    @JsonProperty("permissions")
    public List<Permission> getPermissions();

    /**
     *  <p>Custom Fields for the AssociateRole.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>User-defined unique and immutable identifier for the AssociateRole.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Name of the AssociateRole.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>Whether the AssociateRole can be assigned to an Associate by a buyer.</p>
     * @param buyerAssignable value to be set
     */

    public void setBuyerAssignable(final Boolean buyerAssignable);

    /**
     *  <p>List of Permissions for the AssociateRole.</p>
     * @param permissions values to be set
     */

    @JsonIgnore
    public void setPermissions(final Permission... permissions);

    /**
     *  <p>List of Permissions for the AssociateRole.</p>
     * @param permissions values to be set
     */

    public void setPermissions(final List<Permission> permissions);

    /**
     *  <p>Custom Fields for the AssociateRole.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     * factory method
     * @return instance of AssociateRoleDraft
     */
    public static AssociateRoleDraft of() {
        return new AssociateRoleDraftImpl();
    }

    /**
     * factory method to create a shallow copy AssociateRoleDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static AssociateRoleDraft of(final AssociateRoleDraft template) {
        AssociateRoleDraftImpl instance = new AssociateRoleDraftImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setBuyerAssignable(template.getBuyerAssignable());
        instance.setPermissions(template.getPermissions());
        instance.setCustom(template.getCustom());
        return instance;
    }

    /**
     * factory method to create a deep copy of AssociateRoleDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssociateRoleDraft deepCopy(@Nullable final AssociateRoleDraft template) {
        if (template == null) {
            return null;
        }
        AssociateRoleDraftImpl instance = new AssociateRoleDraftImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setBuyerAssignable(template.getBuyerAssignable());
        instance.setPermissions(Optional.ofNullable(template.getPermissions()).map(ArrayList::new).orElse(null));
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for AssociateRoleDraft
     * @return builder
     */
    public static AssociateRoleDraftBuilder builder() {
        return AssociateRoleDraftBuilder.of();
    }

    /**
     * create builder for AssociateRoleDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleDraftBuilder builder(final AssociateRoleDraft template) {
        return AssociateRoleDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssociateRoleDraft(Function<AssociateRoleDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssociateRoleDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssociateRoleDraft>() {
            @Override
            public String toString() {
                return "TypeReference<AssociateRoleDraft>";
            }
        };
    }
}
