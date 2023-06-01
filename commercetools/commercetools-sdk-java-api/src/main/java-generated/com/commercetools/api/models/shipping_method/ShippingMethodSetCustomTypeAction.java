package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.shipping_method.ShippingMethodSetCustomTypeActionImpl;

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
 * ShippingMethodSetCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodSetCustomTypeAction shippingMethodSetCustomTypeAction = ShippingMethodSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ShippingMethodSetCustomTypeActionImpl.class)
public interface ShippingMethodSetCustomTypeAction extends ShippingMethodUpdateAction {

    /**
     * discriminator value for ShippingMethodSetCustomTypeAction
     */
    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the Type that extends the ShippingMethod with Custom Fields. If absent, any existing Type and Custom Fields are removed from the ShippingMethod.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();
    /**
     *  <p>Sets the Custom Fields fields for the ShippingMethod.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>Defines the Type that extends the ShippingMethod with Custom Fields. If absent, any existing Type and Custom Fields are removed from the ShippingMethod.</p>
     * @param type value to be set
     */
    
    public void setType(final TypeResourceIdentifier type);
    
    
    /**
     *  <p>Sets the Custom Fields fields for the ShippingMethod.</p>
     * @param fields value to be set
     */
    
    public void setFields(final FieldContainer fields);
    

    /**
     * factory method
     * @return instance of ShippingMethodSetCustomTypeAction
     */
    public static ShippingMethodSetCustomTypeAction of(){
        return new ShippingMethodSetCustomTypeActionImpl();
    }
    

    /**
     * factory method to create a shallow copy ShippingMethodSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodSetCustomTypeAction of(final ShippingMethodSetCustomTypeAction template) {
        ShippingMethodSetCustomTypeActionImpl instance = new ShippingMethodSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    /**
     * factory method to create a deep copy of ShippingMethodSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodSetCustomTypeAction deepCopy(@Nullable final ShippingMethodSetCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        ShippingMethodSetCustomTypeActionImpl instance = new ShippingMethodSetCustomTypeActionImpl();
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for ShippingMethodSetCustomTypeAction
     * @return builder
     */
    public static ShippingMethodSetCustomTypeActionBuilder builder() {
        return ShippingMethodSetCustomTypeActionBuilder.of();
    }
    
    /**
     * create builder for ShippingMethodSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodSetCustomTypeActionBuilder builder(final ShippingMethodSetCustomTypeAction template) {
        return ShippingMethodSetCustomTypeActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodSetCustomTypeAction(Function<ShippingMethodSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodSetCustomTypeAction>";
            }
        };
    }
}
