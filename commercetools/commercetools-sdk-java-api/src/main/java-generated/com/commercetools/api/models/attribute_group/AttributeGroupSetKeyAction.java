package com.commercetools.api.models.attribute_group;

import com.commercetools.api.models.attribute_group.AttributeGroupUpdateAction;
import com.commercetools.api.models.attribute_group.AttributeGroupSetKeyActionImpl;

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
 * AttributeGroupSetKeyAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeGroupSetKeyAction attributeGroupSetKeyAction = AttributeGroupSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = AttributeGroupSetKeyActionImpl.class)
public interface AttributeGroupSetKeyAction extends AttributeGroupUpdateAction {

    /**
     * discriminator value for AttributeGroupSetKeyAction
     */
    String SET_KEY = "setKey";

    /**
     *  <p>If <code>key</code> is absent or <code>null</code>, the existing key, if any, will be removed.</p>
     * @return key
     */
    
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>If <code>key</code> is absent or <code>null</code>, the existing key, if any, will be removed.</p>
     * @param key value to be set
     */
    
    public void setKey(final String key);
    

    /**
     * factory method
     * @return instance of AttributeGroupSetKeyAction
     */
    public static AttributeGroupSetKeyAction of(){
        return new AttributeGroupSetKeyActionImpl();
    }
    

    /**
     * factory method to create a shallow copy AttributeGroupSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static AttributeGroupSetKeyAction of(final AttributeGroupSetKeyAction template) {
        AttributeGroupSetKeyActionImpl instance = new AttributeGroupSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of AttributeGroupSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AttributeGroupSetKeyAction deepCopy(@Nullable final AttributeGroupSetKeyAction template) {
        if (template == null) {
            return null;
        }
        AttributeGroupSetKeyActionImpl instance = new AttributeGroupSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for AttributeGroupSetKeyAction
     * @return builder
     */
    public static AttributeGroupSetKeyActionBuilder builder() {
        return AttributeGroupSetKeyActionBuilder.of();
    }
    
    /**
     * create builder for AttributeGroupSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeGroupSetKeyActionBuilder builder(final AttributeGroupSetKeyAction template) {
        return AttributeGroupSetKeyActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAttributeGroupSetKeyAction(Function<AttributeGroupSetKeyAction, T> helper) {
        return helper.apply(this);
    }
    public static AttributeGroupSetKeyAction ofUnset() {
        return AttributeGroupSetKeyAction.of();
    }
    
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AttributeGroupSetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeGroupSetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeGroupSetKeyAction>";
            }
        };
    }
}
