package com.commercetools.api.models.attribute_group;

import com.commercetools.api.models.attribute_group.AttributeGroupUpdateAction;
import com.commercetools.api.models.attribute_group.AttributeReference;
import com.commercetools.api.models.attribute_group.AttributeGroupRemoveAttributeActionImpl;

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
 * AttributeGroupRemoveAttributeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeGroupRemoveAttributeAction attributeGroupRemoveAttributeAction = AttributeGroupRemoveAttributeAction.builder()
 *             .attribute(attributeBuilder -> attributeBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = AttributeGroupRemoveAttributeActionImpl.class)
public interface AttributeGroupRemoveAttributeAction extends AttributeGroupUpdateAction {

    /**
     * discriminator value for AttributeGroupRemoveAttributeAction
     */
    String REMOVE_ATTRIBUTE = "removeAttribute";

    /**
     *  <p>Value to remove.</p>
     * @return attribute
     */
    @NotNull
    @Valid
    @JsonProperty("attribute")
    public AttributeReference getAttribute();

    /**
     *  <p>Value to remove.</p>
     * @param attribute value to be set
     */
    
    public void setAttribute(final AttributeReference attribute);
    

    /**
     * factory method
     * @return instance of AttributeGroupRemoveAttributeAction
     */
    public static AttributeGroupRemoveAttributeAction of(){
        return new AttributeGroupRemoveAttributeActionImpl();
    }
    

    /**
     * factory method to create a shallow copy AttributeGroupRemoveAttributeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static AttributeGroupRemoveAttributeAction of(final AttributeGroupRemoveAttributeAction template) {
        AttributeGroupRemoveAttributeActionImpl instance = new AttributeGroupRemoveAttributeActionImpl();
        instance.setAttribute(template.getAttribute());
        return instance;
    }

    /**
     * factory method to create a deep copy of AttributeGroupRemoveAttributeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AttributeGroupRemoveAttributeAction deepCopy(@Nullable final AttributeGroupRemoveAttributeAction template) {
        if (template == null) {
            return null;
        }
        AttributeGroupRemoveAttributeActionImpl instance = new AttributeGroupRemoveAttributeActionImpl();
        instance.setAttribute(com.commercetools.api.models.attribute_group.AttributeReference.deepCopy(template.getAttribute()));
        return instance;
    }

    /**
     * builder factory method for AttributeGroupRemoveAttributeAction
     * @return builder
     */
    public static AttributeGroupRemoveAttributeActionBuilder builder() {
        return AttributeGroupRemoveAttributeActionBuilder.of();
    }
    
    /**
     * create builder for AttributeGroupRemoveAttributeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeGroupRemoveAttributeActionBuilder builder(final AttributeGroupRemoveAttributeAction template) {
        return AttributeGroupRemoveAttributeActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAttributeGroupRemoveAttributeAction(Function<AttributeGroupRemoveAttributeAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AttributeGroupRemoveAttributeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeGroupRemoveAttributeAction>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeGroupRemoveAttributeAction>";
            }
        };
    }
}
