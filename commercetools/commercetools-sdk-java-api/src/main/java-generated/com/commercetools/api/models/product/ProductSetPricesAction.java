
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.PriceDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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

    String SET_PRICES = "setPrices";

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     */

    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>The Embedded Prices to set. Each Price must have its unique Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     */
    @NotNull
    @Valid
    @JsonProperty("prices")
    public List<PriceDraft> getPrices();

    /**
     *  <p>If <code>true</code>, only the staged ProductVariant is updated. If <code>false</code>, both the current and staged ProductVariant are updated.</p>
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    public void setVariantId(final Long variantId);

    public void setSku(final String sku);

    @JsonIgnore
    public void setPrices(final PriceDraft... prices);

    public void setPrices(final List<PriceDraft> prices);

    public void setStaged(final Boolean staged);

    public static ProductSetPricesAction of() {
        return new ProductSetPricesActionImpl();
    }

    public static ProductSetPricesAction of(final ProductSetPricesAction template) {
        ProductSetPricesActionImpl instance = new ProductSetPricesActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setPrices(template.getPrices());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductSetPricesActionBuilder builder() {
        return ProductSetPricesActionBuilder.of();
    }

    public static ProductSetPricesActionBuilder builder(final ProductSetPricesAction template) {
        return ProductSetPricesActionBuilder.of(template);
    }

    default <T> T withProductSetPricesAction(Function<ProductSetPricesAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetPricesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetPricesAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetPricesAction>";
            }
        };
    }
}
