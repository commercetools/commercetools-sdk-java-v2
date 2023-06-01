package com.commercetools.api.models.attribute_group;

import com.commercetools.api.models.attribute_group.AttributeGroupUpdateAction;
import com.commercetools.api.models.attribute_group.AttributeReference;
import com.commercetools.api.models.attribute_group.AttributeGroupSetAttributesActionImpl;

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
 * AttributeGroupSetAttributesAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeGroupSetAttributesAction attributeGroupSetAttributesAction = AttributeGroupSetAttributesAction.builder()
 *             .plusAttributes(attributesBuilder -> attributesBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = AttributeGroupSetAttributesActionImpl.class)
public interface AttributeGroupSetAttributesAction extends AttributeGroupUpdateAction {

    /**
     * discriminator value for AttributeGroupSetAttributesAction
     */
    String SET_ATTRIBUTES = "setAttributes";

    /**
     *  <p>New unique values to set.</p>
     * @return attributes
     */
    @NotNull
    @Valid
    @JsonProperty("attributes")
    public List<AttributeReference> getAttributes();

    /**
     *  <p>New unique values to set.</p>
     * @param attributes values to be set
     */
    
    @JsonIgnore
    public void setAttributes(final AttributeReference ...attributes);
    /**
     *  <p>New unique values to set.</p>
     * @param attributes values to be set
     */
    
    public void setAttributes(final List<AttributeReference> attributes);

    /**
     * factory method
     * @return instance of AttributeGroupSetAttributesAction
     */
    public static AttributeGroupSetAttributesAction of(){
        return new AttributeGroupSetAttributesActionImpl();
    }
    

    /**
     * factory method to create a shallow copy AttributeGroupSetAttributesAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static AttributeGroupSetAttributesAction of(final AttributeGroupSetAttributesAction template) {
        AttributeGroupSetAttributesActionImpl instance = new AttributeGroupSetAttributesActionImpl();
        instance.setAttributes(template.getAttributes());
        return instance;
    }

    /**
     * factory method to create a deep copy of AttributeGroupSetAttributesAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AttributeGroupSetAttributesAction deepCopy(@Nullable final AttributeGroupSetAttributesAction template) {
        if (template == null) {
            return null;
        }
        AttributeGroupSetAttributesActionImpl instance = new AttributeGroupSetAttributesActionImpl();
        instance.setAttributes(Optional.ofNullable(template.getAttributes())
                .map(t -> t.stream().map(com.commercetools.api.models.attribute_group.AttributeReference::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for AttributeGroupSetAttributesAction
     * @return builder
     */
    public static AttributeGroupSetAttributesActionBuilder builder() {
        return AttributeGroupSetAttributesActionBuilder.of();
    }
    
    /**
     * create builder for AttributeGroupSetAttributesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeGroupSetAttributesActionBuilder builder(final AttributeGroupSetAttributesAction template) {
        return AttributeGroupSetAttributesActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAttributeGroupSetAttributesAction(Function<AttributeGroupSetAttributesAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AttributeGroupSetAttributesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeGroupSetAttributesAction>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeGroupSetAttributesAction>";
            }
        };
    }
}
