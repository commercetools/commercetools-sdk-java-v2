
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
import jakarta.validation.constraints.NotNull;

/**
 * AttributeGroupChangeNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeGroupChangeNameAction attributeGroupChangeNameAction = AttributeGroupChangeNameAction.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeName")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeGroupChangeNameActionImpl.class)
public interface AttributeGroupChangeNameAction extends AttributeGroupUpdateAction {

    /**
     * discriminator value for AttributeGroupChangeNameAction
     */
    String CHANGE_NAME = "changeName";

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     * factory method
     * @return instance of AttributeGroupChangeNameAction
     */
    public static AttributeGroupChangeNameAction of() {
        return new AttributeGroupChangeNameActionImpl();
    }

    /**
     * factory method to create a shallow copy AttributeGroupChangeNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static AttributeGroupChangeNameAction of(final AttributeGroupChangeNameAction template) {
        AttributeGroupChangeNameActionImpl instance = new AttributeGroupChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public AttributeGroupChangeNameAction copyDeep();

    /**
     * factory method to create a deep copy of AttributeGroupChangeNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AttributeGroupChangeNameAction deepCopy(@Nullable final AttributeGroupChangeNameAction template) {
        if (template == null) {
            return null;
        }
        AttributeGroupChangeNameActionImpl instance = new AttributeGroupChangeNameActionImpl();
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        return instance;
    }

    /**
     * builder factory method for AttributeGroupChangeNameAction
     * @return builder
     */
    public static AttributeGroupChangeNameActionBuilder builder() {
        return AttributeGroupChangeNameActionBuilder.of();
    }

    /**
     * create builder for AttributeGroupChangeNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeGroupChangeNameActionBuilder builder(final AttributeGroupChangeNameAction template) {
        return AttributeGroupChangeNameActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAttributeGroupChangeNameAction(Function<AttributeGroupChangeNameAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AttributeGroupChangeNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeGroupChangeNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeGroupChangeNameAction>";
            }
        };
    }
}
