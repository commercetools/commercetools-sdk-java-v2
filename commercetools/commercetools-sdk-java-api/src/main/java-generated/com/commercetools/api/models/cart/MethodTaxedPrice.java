
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MethodTaxedPrice
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MethodTaxedPrice methodTaxedPrice = MethodTaxedPrice.builder()
 *             .shippingMethodKey("{shippingMethodKey}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MethodTaxedPriceImpl.class)
public interface MethodTaxedPrice {

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
     */
    @NotNull
    @JsonProperty("shippingMethodKey")
    public String getShippingMethodKey();

    /**
     *  <p>Taxed price for the Shipping Method.</p>
     */
    @Valid
    @JsonProperty("taxedPrice")
    public TaxedItemPrice getTaxedPrice();

    public void setShippingMethodKey(final String shippingMethodKey);

    public void setTaxedPrice(final TaxedItemPrice taxedPrice);

    public static MethodTaxedPrice of() {
        return new MethodTaxedPriceImpl();
    }

    public static MethodTaxedPrice of(final MethodTaxedPrice template) {
        MethodTaxedPriceImpl instance = new MethodTaxedPriceImpl();
        instance.setShippingMethodKey(template.getShippingMethodKey());
        instance.setTaxedPrice(template.getTaxedPrice());
        return instance;
    }

    public static MethodTaxedPriceBuilder builder() {
        return MethodTaxedPriceBuilder.of();
    }

    public static MethodTaxedPriceBuilder builder(final MethodTaxedPrice template) {
        return MethodTaxedPriceBuilder.of(template);
    }

    default <T> T withMethodTaxedPrice(Function<MethodTaxedPrice, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MethodTaxedPrice> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MethodTaxedPrice>() {
            @Override
            public String toString() {
                return "TypeReference<MethodTaxedPrice>";
            }
        };
    }
}
