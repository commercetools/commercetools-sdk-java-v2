
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 <p>A price tier is selected instead of the default price when a certain quantity of the ProductVariant is added to a cart and ordered.</p>

 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   PriceTier priceTier = PriceTier.builder()
           .minimumQuantity(0.3)
           .value(valueBuilder -> valueBuilder)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PriceTierImpl.class)
public interface PriceTier {

    /**
     *  <p>The minimum quantity this price tier is valid for.</p>
     */
    @NotNull
    @JsonProperty("minimumQuantity")
    public Long getMinimumQuantity();

    /**
     *  <p>The currency of a price tier is always the same as the currency of the base Price.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public TypedMoney getValue();

    public void setMinimumQuantity(final Long minimumQuantity);

    public void setValue(final TypedMoney value);

    public static PriceTier of() {
        return new PriceTierImpl();
    }

    public static PriceTier of(final PriceTier template) {
        PriceTierImpl instance = new PriceTierImpl();
        instance.setMinimumQuantity(template.getMinimumQuantity());
        instance.setValue(template.getValue());
        return instance;
    }

    public static PriceTierBuilder builder() {
        return PriceTierBuilder.of();
    }

    public static PriceTierBuilder builder(final PriceTier template) {
        return PriceTierBuilder.of(template);
    }

    default <T> T withPriceTier(Function<PriceTier, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PriceTier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PriceTier>() {
            @Override
            public String toString() {
                return "TypeReference<PriceTier>";
            }
        };
    }
}
