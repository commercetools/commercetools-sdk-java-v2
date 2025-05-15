
package com.commercetools.api.models.attribute_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * AttributeGroupUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeGroupUpdateAction attributeGroupUpdateAction = AttributeGroupUpdateAction.addAttributeBuilder()
 *             attribute(attributeBuilder -> attributeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = AttributeGroupUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = AttributeGroupUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface AttributeGroupUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<AttributeGroupUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public AttributeGroupUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of AttributeGroupUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AttributeGroupUpdateAction deepCopy(@Nullable final AttributeGroupUpdateAction template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof AttributeGroupUpdateActionImpl)) {
            return template.copyDeep();
        }
        AttributeGroupUpdateActionImpl instance = new AttributeGroupUpdateActionImpl();
        return instance;
    }

    /**
     * builder for addAttribute subtype
     * @return builder
     */
    public static com.commercetools.api.models.attribute_group.AttributeGroupAddAttributeActionBuilder addAttributeBuilder() {
        return com.commercetools.api.models.attribute_group.AttributeGroupAddAttributeActionBuilder.of();
    }

    /**
     * builder for changeName subtype
     * @return builder
     */
    public static com.commercetools.api.models.attribute_group.AttributeGroupChangeNameActionBuilder changeNameBuilder() {
        return com.commercetools.api.models.attribute_group.AttributeGroupChangeNameActionBuilder.of();
    }

    /**
     * builder for removeAttribute subtype
     * @return builder
     */
    public static com.commercetools.api.models.attribute_group.AttributeGroupRemoveAttributeActionBuilder removeAttributeBuilder() {
        return com.commercetools.api.models.attribute_group.AttributeGroupRemoveAttributeActionBuilder.of();
    }

    /**
     * builder for setAttributes subtype
     * @return builder
     */
    public static com.commercetools.api.models.attribute_group.AttributeGroupSetAttributesActionBuilder setAttributesBuilder() {
        return com.commercetools.api.models.attribute_group.AttributeGroupSetAttributesActionBuilder.of();
    }

    /**
     * builder for setDescription subtype
     * @return builder
     */
    public static com.commercetools.api.models.attribute_group.AttributeGroupSetDescriptionActionBuilder setDescriptionBuilder() {
        return com.commercetools.api.models.attribute_group.AttributeGroupSetDescriptionActionBuilder.of();
    }

    /**
     * builder for setKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.attribute_group.AttributeGroupSetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.attribute_group.AttributeGroupSetKeyActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAttributeGroupUpdateAction(Function<AttributeGroupUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AttributeGroupUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeGroupUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeGroupUpdateAction>";
            }
        };
    }
}
