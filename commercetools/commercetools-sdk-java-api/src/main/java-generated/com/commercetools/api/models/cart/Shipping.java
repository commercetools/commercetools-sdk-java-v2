
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
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
     * @return shippingKey
     */
    @NotNull
    @JsonProperty("shippingKey")
    public String getShippingKey();

    /**
     *  <p>Automatically set when the Shipping Method is added.</p>
     * @return shippingInfo
     */
    @NotNull
    @Valid
    @JsonProperty("shippingInfo")
    public ShippingInfo getShippingInfo();

    /**
     *  <p>Determines the shipping rates and Tax Rates of associated Line Items.</p>
     * @return shippingAddress
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
     * @return shippingRateInput
     */
    @Valid
    @JsonProperty("shippingRateInput")
    public ShippingRateInput getShippingRateInput();

    /**
     *  <p>Custom Fields of Shipping.</p>
     * @return shippingCustomFields
     */
    @Valid
    @JsonProperty("shippingCustomFields")
    public CustomFields getShippingCustomFields();

    /**
     *  <p>User-defined unique identifier of the Shipping in a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param shippingKey value to be set
     */

    public void setShippingKey(final String shippingKey);

    /**
     *  <p>Automatically set when the Shipping Method is added.</p>
     * @param shippingInfo value to be set
     */

    public void setShippingInfo(final ShippingInfo shippingInfo);

    /**
     *  <p>Determines the shipping rates and Tax Rates of associated Line Items.</p>
     * @param shippingAddress value to be set
     */

    public void setShippingAddress(final Address shippingAddress);

    /**
     *  <p>Used as an input to select a ShippingRatePriceTier. The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the Project:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it is ClassificationShippingRateInput.</li>
     *   <li>If <code>CartScore</code>, it is ScoreShippingRateInput.</li>
     *   <li>If <code>CartValue</code>, it cannot be used.</li>
     *  </ul>
     * @param shippingRateInput value to be set
     */

    public void setShippingRateInput(final ShippingRateInput shippingRateInput);

    /**
     *  <p>Custom Fields of Shipping.</p>
     * @param shippingCustomFields value to be set
     */

    public void setShippingCustomFields(final CustomFields shippingCustomFields);

    /**
     * factory method
     * @return instance of Shipping
     */
    public static Shipping of() {
        return new ShippingImpl();
    }

    /**
     * factory method to create a shallow copy Shipping
     * @param template instance to be copied
     * @return copy instance
     */
    public static Shipping of(final Shipping template) {
        ShippingImpl instance = new ShippingImpl();
        instance.setShippingKey(template.getShippingKey());
        instance.setShippingInfo(template.getShippingInfo());
        instance.setShippingAddress(template.getShippingAddress());
        instance.setShippingRateInput(template.getShippingRateInput());
        instance.setShippingCustomFields(template.getShippingCustomFields());
        return instance;
    }

    /**
     * factory method to create a deep copy of Shipping
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Shipping deepCopy(@Nullable final Shipping template) {
        if (template == null) {
            return null;
        }
        ShippingImpl instance = new ShippingImpl();
        instance.setShippingKey(template.getShippingKey());
        instance.setShippingInfo(Optional.ofNullable(template.getShippingInfo())
                .map(com.commercetools.api.models.cart.ShippingInfo::deepCopy)
                .orElse(null));
        instance.setShippingAddress(Optional.ofNullable(template.getShippingAddress())
                .map(com.commercetools.api.models.common.Address::deepCopy)
                .orElse(null));
        instance.setShippingRateInput(Optional.ofNullable(template.getShippingRateInput())
                .map(com.commercetools.api.models.cart.ShippingRateInput::deepCopy)
                .orElse(null));
        instance.setShippingCustomFields(Optional.ofNullable(template.getShippingCustomFields())
                .map(com.commercetools.api.models.type.CustomFields::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for Shipping
     * @return builder
     */
    public static ShippingBuilder builder() {
        return ShippingBuilder.of();
    }

    /**
     * create builder for Shipping instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingBuilder builder(final Shipping template) {
        return ShippingBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShipping(Function<Shipping, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Shipping> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Shipping>() {
            @Override
            public String toString() {
                return "TypeReference<Shipping>";
            }
        };
    }
}
