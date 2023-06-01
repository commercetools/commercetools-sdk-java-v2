package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingMethodChangeIsDefaultActionImpl;

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
 * ShippingMethodChangeIsDefaultAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodChangeIsDefaultAction shippingMethodChangeIsDefaultAction = ShippingMethodChangeIsDefaultAction.builder()
 *             .isDefault(true)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ShippingMethodChangeIsDefaultActionImpl.class)
public interface ShippingMethodChangeIsDefaultAction extends ShippingMethodUpdateAction {

    /**
     * discriminator value for ShippingMethodChangeIsDefaultAction
     */
    String CHANGE_IS_DEFAULT = "changeIsDefault";

    /**
     *  <p>Value to set. Only one ShippingMethod can be default in a Project.</p>
     * @return isDefault
     */
    @NotNull
    @JsonProperty("isDefault")
    public Boolean getIsDefault();

    /**
     *  <p>Value to set. Only one ShippingMethod can be default in a Project.</p>
     * @param isDefault value to be set
     */
    
    public void setIsDefault(final Boolean isDefault);
    

    /**
     * factory method
     * @return instance of ShippingMethodChangeIsDefaultAction
     */
    public static ShippingMethodChangeIsDefaultAction of(){
        return new ShippingMethodChangeIsDefaultActionImpl();
    }
    

    /**
     * factory method to create a shallow copy ShippingMethodChangeIsDefaultAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodChangeIsDefaultAction of(final ShippingMethodChangeIsDefaultAction template) {
        ShippingMethodChangeIsDefaultActionImpl instance = new ShippingMethodChangeIsDefaultActionImpl();
        instance.setIsDefault(template.getIsDefault());
        return instance;
    }

    /**
     * factory method to create a deep copy of ShippingMethodChangeIsDefaultAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodChangeIsDefaultAction deepCopy(@Nullable final ShippingMethodChangeIsDefaultAction template) {
        if (template == null) {
            return null;
        }
        ShippingMethodChangeIsDefaultActionImpl instance = new ShippingMethodChangeIsDefaultActionImpl();
        instance.setIsDefault(template.getIsDefault());
        return instance;
    }

    /**
     * builder factory method for ShippingMethodChangeIsDefaultAction
     * @return builder
     */
    public static ShippingMethodChangeIsDefaultActionBuilder builder() {
        return ShippingMethodChangeIsDefaultActionBuilder.of();
    }
    
    /**
     * create builder for ShippingMethodChangeIsDefaultAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodChangeIsDefaultActionBuilder builder(final ShippingMethodChangeIsDefaultAction template) {
        return ShippingMethodChangeIsDefaultActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodChangeIsDefaultAction(Function<ShippingMethodChangeIsDefaultAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodChangeIsDefaultAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodChangeIsDefaultAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodChangeIsDefaultAction>";
            }
        };
    }
}
