
package com.commercetools.api.models.attribute_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * AttributeGroupUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeGroupUpdate attributeGroupUpdate = AttributeGroupUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeGroupUpdateImpl.class)
public interface AttributeGroupUpdate extends
        com.commercetools.api.models.ResourceUpdate<AttributeGroupUpdate, AttributeGroupUpdateAction, AttributeGroupUpdateBuilder> {

    /**
     *  <p>Expected version of the AttributeGroup on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the AttributeGroup.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<AttributeGroupUpdateAction> getActions();

    /**
     *  <p>Expected version of the AttributeGroup on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Update actions to be performed on the AttributeGroup.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final AttributeGroupUpdateAction... actions);

    /**
     *  <p>Update actions to be performed on the AttributeGroup.</p>
     * @param actions values to be set
     */

    public void setActions(final List<AttributeGroupUpdateAction> actions);

    /**
     * factory method
     * @return instance of AttributeGroupUpdate
     */
    public static AttributeGroupUpdate of() {
        return new AttributeGroupUpdateImpl();
    }

    /**
     * factory method to create a shallow copy AttributeGroupUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static AttributeGroupUpdate of(final AttributeGroupUpdate template) {
        AttributeGroupUpdateImpl instance = new AttributeGroupUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public AttributeGroupUpdate copyDeep();

    /**
     * factory method to create a deep copy of AttributeGroupUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AttributeGroupUpdate deepCopy(@Nullable final AttributeGroupUpdate template) {
        if (template == null) {
            return null;
        }
        AttributeGroupUpdateImpl instance = new AttributeGroupUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.attribute_group.AttributeGroupUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for AttributeGroupUpdate
     * @return builder
     */
    public static AttributeGroupUpdateBuilder builder() {
        return AttributeGroupUpdateBuilder.of();
    }

    /**
     * create builder for AttributeGroupUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeGroupUpdateBuilder builder(final AttributeGroupUpdate template) {
        return AttributeGroupUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAttributeGroupUpdate(Function<AttributeGroupUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AttributeGroupUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeGroupUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeGroupUpdate>";
            }
        };
    }
}
