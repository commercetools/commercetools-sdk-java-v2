
package com.commercetools.api.models.attribute_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.attribute_group.AttributeGroupAddAttributeActionImpl.class, name = AttributeGroupAddAttributeAction.ADD_ATTRIBUTE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.attribute_group.AttributeGroupChangeNameActionImpl.class, name = AttributeGroupChangeNameAction.CHANGE_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.attribute_group.AttributeGroupRemoveAttributeActionImpl.class, name = AttributeGroupRemoveAttributeAction.REMOVE_ATTRIBUTE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.attribute_group.AttributeGroupSetAttributesActionImpl.class, name = AttributeGroupSetAttributesAction.SET_ATTRIBUTES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.attribute_group.AttributeGroupSetDescriptionActionImpl.class, name = AttributeGroupSetDescriptionAction.SET_DESCRIPTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.attribute_group.AttributeGroupSetKeyActionImpl.class, name = AttributeGroupSetKeyAction.SET_KEY) })
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

    public static com.commercetools.api.models.attribute_group.AttributeGroupAddAttributeActionBuilder addAttributeBuilder() {
        return com.commercetools.api.models.attribute_group.AttributeGroupAddAttributeActionBuilder.of();
    }

    public static com.commercetools.api.models.attribute_group.AttributeGroupChangeNameActionBuilder changeNameBuilder() {
        return com.commercetools.api.models.attribute_group.AttributeGroupChangeNameActionBuilder.of();
    }

    public static com.commercetools.api.models.attribute_group.AttributeGroupRemoveAttributeActionBuilder removeAttributeBuilder() {
        return com.commercetools.api.models.attribute_group.AttributeGroupRemoveAttributeActionBuilder.of();
    }

    public static com.commercetools.api.models.attribute_group.AttributeGroupSetAttributesActionBuilder setAttributesBuilder() {
        return com.commercetools.api.models.attribute_group.AttributeGroupSetAttributesActionBuilder.of();
    }

    public static com.commercetools.api.models.attribute_group.AttributeGroupSetDescriptionActionBuilder setDescriptionBuilder() {
        return com.commercetools.api.models.attribute_group.AttributeGroupSetDescriptionActionBuilder.of();
    }

    public static com.commercetools.api.models.attribute_group.AttributeGroupSetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.attribute_group.AttributeGroupSetKeyActionBuilder.of();
    }

    default <T> T withAttributeGroupUpdateAction(Function<AttributeGroupUpdateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AttributeGroupUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeGroupUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeGroupUpdateAction>";
            }
        };
    }
}
