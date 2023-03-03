
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * Shipping
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Shipping shipping = Shipping.builder()
 *             .shippingKey("{shippingKey}")
 *             .shippingInfo(shippingInfoBuilder -> shippingInfoBuilder)
 *             .shippingAddress(shippingAddressBuilder -> shippingAddressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingImpl.class)
public interface Shipping {

    /**
     *  <p>User-defined unique identifier of the Shipping in a Cart with <code>Multiple</code> ShippingMode.</p>
     */
    @NotNull
    @JsonProperty("shippingKey")
    public String getShippingKey();

    /**
     *  <p>Automatically set when the Shipping Method is added.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("shippingInfo")
    public ShippingInfo getShippingInfo();

    /**
     *  <p>Determines the shipping rates and Tax Rates of associated Line Items.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("shippingAddress")
    public Address getShippingAddress();

    /**
     *  <p>Used as an input to select a ShippingRatePriceTier. The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the Project:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it is ClassificationShippingRateInput.</li>
     *   <li>If <code>CartScore</code>, it is ScoreShippingRateInput.</li>
     *   <li>If <code>CartValue</code>, it cannot be used.</li>
     *  </ul>
     */
    @Valid
    @JsonProperty("shippingRateInput")
    public ShippingRateInput getShippingRateInput();

    /**
     *  <p>Custom Fields of Shipping.</p>
     */
    @Valid
    @JsonProperty("shippingCustomFields")
    public CustomFields getShippingCustomFields();

    public void setShippingKey(final String shippingKey);

    public void setShippingInfo(final ShippingInfo shippingInfo);

    public void setShippingAddress(final Address shippingAddress);

    public void setShippingRateInput(final ShippingRateInput shippingRateInput);

    public void setShippingCustomFields(final CustomFields shippingCustomFields);

    public static Shipping of() {
        return new ShippingImpl();
    }

    public static Shipping of(final Shipping template) {
        ShippingImpl instance = new ShippingImpl();
        instance.setShippingKey(template.getShippingKey());
        instance.setShippingInfo(template.getShippingInfo());
        instance.setShippingAddress(template.getShippingAddress());
        instance.setShippingRateInput(template.getShippingRateInput());
        instance.setShippingCustomFields(template.getShippingCustomFields());
        return instance;
    }

    public static ShippingBuilder builder() {
        return ShippingBuilder.of();
    }

    public static ShippingBuilder builder(final Shipping template) {
        return ShippingBuilder.of(template);
    }

    default <T> T withShipping(Function<Shipping, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<Shipping> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Shipping>() {
            @Override
            public String toString() {
                return "TypeReference<Shipping>";
            }
        };
    }
}
