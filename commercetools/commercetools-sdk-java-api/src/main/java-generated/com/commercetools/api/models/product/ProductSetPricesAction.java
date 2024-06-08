
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.PriceDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Either <code>variantId</code> or <code>sku</code> is required.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetPricesAction productSetPricesAction = ProductSetPricesAction.builder()
 *             .plusPrices(pricesBuilder -> pricesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSetPricesActionImpl.class)
public interface ProductSetPricesAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductSetPricesAction
     */
    String SET_PRICES = "setPrices";

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     * @return variantId
     */

    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>The Embedded Prices to set. Each Price must have its unique Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @return prices
     */
    @NotNull
    @Valid
    @JsonProperty("prices")
    public List<PriceDraft> getPrices();

    /**
     *  <p>If <code>true</code>, only the staged ProductVariant is updated. If <code>false</code>, both the current and staged ProductVariant are updated.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Long variantId);

    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>The Embedded Prices to set. Each Price must have its unique Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param prices values to be set
     */

    @JsonIgnore
    public void setPrices(final PriceDraft... prices);

    /**
     *  <p>The Embedded Prices to set. Each Price must have its unique Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param prices values to be set
     */

    public void setPrices(final List<PriceDraft> prices);

    /**
     *  <p>If <code>true</code>, only the staged ProductVariant is updated. If <code>false</code>, both the current and staged ProductVariant are updated.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductSetPricesAction
     */
    public static ProductSetPricesAction of() {
        return new ProductSetPricesActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSetPricesAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSetPricesAction of(final ProductSetPricesAction template) {
        ProductSetPricesActionImpl instance = new ProductSetPricesActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setPrices(template.getPrices());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSetPricesAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSetPricesAction deepCopy(@Nullable final ProductSetPricesAction template) {
        if (template == null) {
            return null;
        }
        ProductSetPricesActionImpl instance = new ProductSetPricesActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setPrices(Optional.ofNullable(template.getPrices())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.PriceDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductSetPricesAction
     * @return builder
     */
    public static ProductSetPricesActionBuilder builder() {
        return ProductSetPricesActionBuilder.of();
    }

    /**
     * create builder for ProductSetPricesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetPricesActionBuilder builder(final ProductSetPricesAction template) {
        return ProductSetPricesActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSetPricesAction(Function<ProductSetPricesAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetPricesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetPricesAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetPricesAction>";
            }
        };
    }
}
