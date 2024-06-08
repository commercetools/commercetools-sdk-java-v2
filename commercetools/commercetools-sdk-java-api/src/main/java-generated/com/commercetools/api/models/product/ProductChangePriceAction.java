
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.PriceDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ProductChangePriceAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductChangePriceAction productChangePriceAction = ProductChangePriceAction.builder()
 *             .priceId("{priceId}")
 *             .price(priceBuilder -> priceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductChangePriceActionImpl.class)
public interface ProductChangePriceAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductChangePriceAction
     */
    String CHANGE_PRICE = "changePrice";

    /**
     *  <p>The <code>id</code> of the Embedded Price to update.</p>
     * @return priceId
     */
    @NotNull
    @JsonProperty("priceId")
    public String getPriceId();

    /**
     *  <p>Value to set.</p>
     * @return price
     */
    @NotNull
    @Valid
    @JsonProperty("price")
    public PriceDraft getPrice();

    /**
     *  <p>If <code>true</code>, only the staged Embedded Price is updated. If <code>false</code>, both the current and staged Embedded Price are updated.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>The <code>id</code> of the Embedded Price to update.</p>
     * @param priceId value to be set
     */

    public void setPriceId(final String priceId);

    /**
     *  <p>Value to set.</p>
     * @param price value to be set
     */

    public void setPrice(final PriceDraft price);

    /**
     *  <p>If <code>true</code>, only the staged Embedded Price is updated. If <code>false</code>, both the current and staged Embedded Price are updated.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductChangePriceAction
     */
    public static ProductChangePriceAction of() {
        return new ProductChangePriceActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductChangePriceAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductChangePriceAction of(final ProductChangePriceAction template) {
        ProductChangePriceActionImpl instance = new ProductChangePriceActionImpl();
        instance.setPriceId(template.getPriceId());
        instance.setPrice(template.getPrice());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductChangePriceAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductChangePriceAction deepCopy(@Nullable final ProductChangePriceAction template) {
        if (template == null) {
            return null;
        }
        ProductChangePriceActionImpl instance = new ProductChangePriceActionImpl();
        instance.setPriceId(template.getPriceId());
        instance.setPrice(com.commercetools.api.models.common.PriceDraft.deepCopy(template.getPrice()));
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductChangePriceAction
     * @return builder
     */
    public static ProductChangePriceActionBuilder builder() {
        return ProductChangePriceActionBuilder.of();
    }

    /**
     * create builder for ProductChangePriceAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductChangePriceActionBuilder builder(final ProductChangePriceAction template) {
        return ProductChangePriceActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductChangePriceAction(Function<ProductChangePriceAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductChangePriceAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductChangePriceAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductChangePriceAction>";
            }
        };
    }
}
