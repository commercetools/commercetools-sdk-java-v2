package com.commercetools.api.models.discount_code;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.discount_code.DiscountCodeUpdateAction;
import com.commercetools.api.models.discount_code.DiscountCodeSetNameActionImpl;

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
 * DiscountCodeSetNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeSetNameAction discountCodeSetNameAction = DiscountCodeSetNameAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = DiscountCodeSetNameActionImpl.class)
public interface DiscountCodeSetNameAction extends DiscountCodeUpdateAction {

    /**
     * discriminator value for DiscountCodeSetNameAction
     */
    String SET_NAME = "setName";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return name
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param name value to be set
     */
    
    public void setName(final LocalizedString name);
    

    /**
     * factory method
     * @return instance of DiscountCodeSetNameAction
     */
    public static DiscountCodeSetNameAction of(){
        return new DiscountCodeSetNameActionImpl();
    }
    

    /**
     * factory method to create a shallow copy DiscountCodeSetNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountCodeSetNameAction of(final DiscountCodeSetNameAction template) {
        DiscountCodeSetNameActionImpl instance = new DiscountCodeSetNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * factory method to create a deep copy of DiscountCodeSetNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountCodeSetNameAction deepCopy(@Nullable final DiscountCodeSetNameAction template) {
        if (template == null) {
            return null;
        }
        DiscountCodeSetNameActionImpl instance = new DiscountCodeSetNameActionImpl();
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        return instance;
    }

    /**
     * builder factory method for DiscountCodeSetNameAction
     * @return builder
     */
    public static DiscountCodeSetNameActionBuilder builder() {
        return DiscountCodeSetNameActionBuilder.of();
    }
    
    /**
     * create builder for DiscountCodeSetNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeSetNameActionBuilder builder(final DiscountCodeSetNameAction template) {
        return DiscountCodeSetNameActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountCodeSetNameAction(Function<DiscountCodeSetNameAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeSetNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeSetNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeSetNameAction>";
            }
        };
    }
}
