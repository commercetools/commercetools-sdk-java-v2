
package com.commercetools.api.models.attribute_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * AttributeGroupAddAttributeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeGroupAddAttributeAction attributeGroupAddAttributeAction = AttributeGroupAddAttributeAction.builder()
 *             .attribute(attributeBuilder -> attributeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeGroupAddAttributeActionImpl.class)
public interface AttributeGroupAddAttributeAction extends AttributeGroupUpdateAction {

    /**
     * discriminator value for AttributeGroupAddAttributeAction
     */
    String ADD_ATTRIBUTE = "addAttribute";

    /**
     *  <p>Value to add.</p>
     * @return attribute
     */
    @NotNull
    @Valid
    @JsonProperty("attribute")
    public AttributeReference getAttribute();

    /**
     *  <p>Value to add.</p>
     * @param attribute value to be set
     */

    public void setAttribute(final AttributeReference attribute);

    /**
     * factory method
     * @return instance of AttributeGroupAddAttributeAction
     */
    public static AttributeGroupAddAttributeAction of() {
        return new AttributeGroupAddAttributeActionImpl();
    }

    /**
     * factory method to create a shallow copy AttributeGroupAddAttributeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static AttributeGroupAddAttributeAction of(final AttributeGroupAddAttributeAction template) {
        AttributeGroupAddAttributeActionImpl instance = new AttributeGroupAddAttributeActionImpl();
        instance.setAttribute(template.getAttribute());
        return instance;
    }

    /**
     * factory method to create a deep copy of AttributeGroupAddAttributeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AttributeGroupAddAttributeAction deepCopy(@Nullable final AttributeGroupAddAttributeAction template) {
        if (template == null) {
            return null;
        }
        AttributeGroupAddAttributeActionImpl instance = new AttributeGroupAddAttributeActionImpl();
        instance.setAttribute(
            com.commercetools.api.models.attribute_group.AttributeReference.deepCopy(template.getAttribute()));
        return instance;
    }

    /**
     * builder factory method for AttributeGroupAddAttributeAction
     * @return builder
     */
    public static AttributeGroupAddAttributeActionBuilder builder() {
        return AttributeGroupAddAttributeActionBuilder.of();
    }

    /**
     * create builder for AttributeGroupAddAttributeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeGroupAddAttributeActionBuilder builder(final AttributeGroupAddAttributeAction template) {
        return AttributeGroupAddAttributeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAttributeGroupAddAttributeAction(Function<AttributeGroupAddAttributeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AttributeGroupAddAttributeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeGroupAddAttributeAction>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeGroupAddAttributeAction>";
            }
        };
    }
}
