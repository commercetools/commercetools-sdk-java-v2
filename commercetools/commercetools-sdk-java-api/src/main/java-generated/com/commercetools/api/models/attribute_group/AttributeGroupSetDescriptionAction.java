
package com.commercetools.api.models.attribute_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 * AttributeGroupSetDescriptionAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeGroupSetDescriptionAction attributeGroupSetDescriptionAction = AttributeGroupSetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setDescription")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeGroupSetDescriptionActionImpl.class)
public interface AttributeGroupSetDescriptionAction extends AttributeGroupUpdateAction {

    /**
     * discriminator value for AttributeGroupSetDescriptionAction
     */
    String SET_DESCRIPTION = "setDescription";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     * factory method
     * @return instance of AttributeGroupSetDescriptionAction
     */
    public static AttributeGroupSetDescriptionAction of() {
        return new AttributeGroupSetDescriptionActionImpl();
    }

    /**
     * factory method to create a shallow copy AttributeGroupSetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static AttributeGroupSetDescriptionAction of(final AttributeGroupSetDescriptionAction template) {
        AttributeGroupSetDescriptionActionImpl instance = new AttributeGroupSetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    public AttributeGroupSetDescriptionAction copyDeep();

    /**
     * factory method to create a deep copy of AttributeGroupSetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AttributeGroupSetDescriptionAction deepCopy(
            @Nullable final AttributeGroupSetDescriptionAction template) {
        if (template == null) {
            return null;
        }
        AttributeGroupSetDescriptionActionImpl instance = new AttributeGroupSetDescriptionActionImpl();
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        return instance;
    }

    /**
     * builder factory method for AttributeGroupSetDescriptionAction
     * @return builder
     */
    public static AttributeGroupSetDescriptionActionBuilder builder() {
        return AttributeGroupSetDescriptionActionBuilder.of();
    }

    /**
     * create builder for AttributeGroupSetDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeGroupSetDescriptionActionBuilder builder(final AttributeGroupSetDescriptionAction template) {
        return AttributeGroupSetDescriptionActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAttributeGroupSetDescriptionAction(Function<AttributeGroupSetDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AttributeGroupSetDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeGroupSetDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeGroupSetDescriptionAction>";
            }
        };
    }
}
