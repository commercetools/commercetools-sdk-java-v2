
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingRateDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingRateDraft shippingRateDraft = ShippingRateDraft.builder()
 *             .price(priceBuilder -> priceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingRateDraftImpl.class)
public interface ShippingRateDraft {

    /**
     *  <p>Money value of the ShippingRate.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("price")
    public Money getPrice();

    /**
     *  <p>Shipping is free if the sum of the (Custom) Line Item Prices reaches the specified value.</p>
     */
    @Valid
    @JsonProperty("freeAbove")
    public Money getFreeAbove();

    /**
     *  <p>Price tiers for the ShippingRate.</p>
     */
    @Valid
    @JsonProperty("tiers")
    public List<ShippingRatePriceTier> getTiers();

    public void setPrice(final Money price);

    public void setFreeAbove(final Money freeAbove);

    @JsonIgnore
    public void setTiers(final ShippingRatePriceTier... tiers);

    public void setTiers(final List<ShippingRatePriceTier> tiers);

    public static ShippingRateDraft of() {
        return new ShippingRateDraftImpl();
    }

    public static ShippingRateDraft of(final ShippingRateDraft template) {
        ShippingRateDraftImpl instance = new ShippingRateDraftImpl();
        instance.setPrice(template.getPrice());
        instance.setFreeAbove(template.getFreeAbove());
        instance.setTiers(template.getTiers());
        return instance;
    }

    public static ShippingRateDraftBuilder builder() {
        return ShippingRateDraftBuilder.of();
    }

    public static ShippingRateDraftBuilder builder(final ShippingRateDraft template) {
        return ShippingRateDraftBuilder.of(template);
    }

    default <T> T withShippingRateDraft(Function<ShippingRateDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShippingRateDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingRateDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingRateDraft>";
            }
        };
    }
}
