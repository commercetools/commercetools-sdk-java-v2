package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductSetPriceKeyActionImpl;

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
 *  <p>Sets the key of an Embedded Price. Produces the ProductPriceKeySet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetPriceKeyAction productSetPriceKeyAction = ProductSetPriceKeyAction.builder()
 *             .priceId("{priceId}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ProductSetPriceKeyActionImpl.class)
public interface ProductSetPriceKeyAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductSetPriceKeyAction
     */
    String SET_PRICE_KEY = "setPriceKey";

    /**
     *  <p>The <code>id</code> of the Price to set the key.</p>
     * @return priceId
     */
    @NotNull
    @JsonProperty("priceId")
    public String getPriceId();
    /**
     *  <p>If <code>true</code>, only the staged Embedded Price is updated. If <code>false</code>, both the current and staged Embedded Price are updated.</p>
     * @return staged
     */
    
    @JsonProperty("staged")
    public Boolean getStaged();
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return key
     */
    
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>The <code>id</code> of the Price to set the key.</p>
     * @param priceId value to be set
     */
    
    public void setPriceId(final String priceId);
    
    
    /**
     *  <p>If <code>true</code>, only the staged Embedded Price is updated. If <code>false</code>, both the current and staged Embedded Price are updated.</p>
     * @param staged value to be set
     */
    
    public void setStaged(final Boolean staged);
    
    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param key value to be set
     */
    
    public void setKey(final String key);
    

    /**
     * factory method
     * @return instance of ProductSetPriceKeyAction
     */
    public static ProductSetPriceKeyAction of(){
        return new ProductSetPriceKeyActionImpl();
    }
    

    /**
     * factory method to create a shallow copy ProductSetPriceKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSetPriceKeyAction of(final ProductSetPriceKeyAction template) {
        ProductSetPriceKeyActionImpl instance = new ProductSetPriceKeyActionImpl();
        instance.setPriceId(template.getPriceId());
        instance.setStaged(template.getStaged());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSetPriceKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSetPriceKeyAction deepCopy(@Nullable final ProductSetPriceKeyAction template) {
        if (template == null) {
            return null;
        }
        ProductSetPriceKeyActionImpl instance = new ProductSetPriceKeyActionImpl();
        instance.setPriceId(template.getPriceId());
        instance.setStaged(template.getStaged());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for ProductSetPriceKeyAction
     * @return builder
     */
    public static ProductSetPriceKeyActionBuilder builder() {
        return ProductSetPriceKeyActionBuilder.of();
    }
    
    /**
     * create builder for ProductSetPriceKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetPriceKeyActionBuilder builder(final ProductSetPriceKeyAction template) {
        return ProductSetPriceKeyActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSetPriceKeyAction(Function<ProductSetPriceKeyAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetPriceKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetPriceKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetPriceKeyAction>";
            }
        };
    }
}
