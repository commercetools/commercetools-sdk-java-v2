
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * ProductRemovePriceAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductRemovePriceAction productRemovePriceAction = ProductRemovePriceAction.builder()
 *             .priceId("{priceId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("removePrice")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductRemovePriceActionImpl.class)
public interface ProductRemovePriceAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductRemovePriceAction
     */
    String REMOVE_PRICE = "removePrice";

    /**
     *  <p>The <code>id</code> of the Embedded Price to remove.</p>
     * @return priceId
     */
    @NotNull
    @JsonProperty("priceId")
    public String getPriceId();

    /**
     *  <p>If <code>true</code>, only the staged Embedded Price is removed. If <code>false</code>, both the current and staged Embedded Price are removed.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>The <code>id</code> of the Embedded Price to remove.</p>
     * @param priceId value to be set
     */

    public void setPriceId(final String priceId);

    /**
     *  <p>If <code>true</code>, only the staged Embedded Price is removed. If <code>false</code>, both the current and staged Embedded Price are removed.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductRemovePriceAction
     */
    public static ProductRemovePriceAction of() {
        return new ProductRemovePriceActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductRemovePriceAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductRemovePriceAction of(final ProductRemovePriceAction template) {
        ProductRemovePriceActionImpl instance = new ProductRemovePriceActionImpl();
        instance.setPriceId(template.getPriceId());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public ProductRemovePriceAction copyDeep();

    /**
     * factory method to create a deep copy of ProductRemovePriceAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductRemovePriceAction deepCopy(@Nullable final ProductRemovePriceAction template) {
        if (template == null) {
            return null;
        }
        ProductRemovePriceActionImpl instance = new ProductRemovePriceActionImpl();
        instance.setPriceId(template.getPriceId());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductRemovePriceAction
     * @return builder
     */
    public static ProductRemovePriceActionBuilder builder() {
        return ProductRemovePriceActionBuilder.of();
    }

    /**
     * create builder for ProductRemovePriceAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductRemovePriceActionBuilder builder(final ProductRemovePriceAction template) {
        return ProductRemovePriceActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductRemovePriceAction(Function<ProductRemovePriceAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductRemovePriceAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductRemovePriceAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductRemovePriceAction>";
            }
        };
    }
}
