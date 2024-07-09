
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when the Price or Tax Rate of some Line Items or Shipping Rate of some Shipping Methods changed since they were last added to the Cart.</p>
 *  <p>When a Cart is frozen, the error can be returned as a failed response to all update actions on Carts and My Carts.</p>
 *  <p>The error is also returned as a failed response to:</p>
 *  <ul>
 *   <li>Create Order from Cart, Create Order in Store from Cart, and Create Order from Quote requests on Orders.</li>
 *   <li>Create Order from Cart, Create Order in Store from Cart, and Create Order from Quote requests on My Orders.</li>
 *   <li>Create Order from Cart in BusinessUnit request on Associate Orders.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PriceChangedError priceChangedError = PriceChangedError.builder()
 *             .message("{message}")
 *             .plusLineItems(lineItemsBuilder -> lineItemsBuilder)
 *             .shipping(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PriceChangedErrorImpl.class)
public interface PriceChangedError extends ErrorObject {

    /**
     * discriminator value for PriceChangedError
     */
    String PRICE_CHANGED = "PriceChanged";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Plain text description of the reason for the Price change. For example, <code>"The price or tax of some line items changed at the time of placing the order: $lineItems."</code>.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Unique identifiers of the Line Items for which the Price or TaxRate has changed.</p>
     * @return lineItems
     */
    @NotNull
    @JsonProperty("lineItems")
    public List<String> getLineItems();

    /**
     *  <p><code>true</code> if the ShippingRate has changed.</p>
     * @return shipping
     */
    @NotNull
    @JsonProperty("shipping")
    public Boolean getShipping();

    /**
     *  <p>Plain text description of the reason for the Price change. For example, <code>"The price or tax of some line items changed at the time of placing the order: $lineItems."</code>.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifiers of the Line Items for which the Price or TaxRate has changed.</p>
     * @param lineItems values to be set
     */

    @JsonIgnore
    public void setLineItems(final String... lineItems);

    /**
     *  <p>Unique identifiers of the Line Items for which the Price or TaxRate has changed.</p>
     * @param lineItems values to be set
     */

    public void setLineItems(final List<String> lineItems);

    /**
     *  <p><code>true</code> if the ShippingRate has changed.</p>
     * @param shipping value to be set
     */

    public void setShipping(final Boolean shipping);

    /**
     * factory method
     * @return instance of PriceChangedError
     */
    public static PriceChangedError of() {
        return new PriceChangedErrorImpl();
    }

    /**
     * factory method to create a shallow copy PriceChangedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static PriceChangedError of(final PriceChangedError template) {
        PriceChangedErrorImpl instance = new PriceChangedErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setLineItems(template.getLineItems());
        instance.setShipping(template.getShipping());
        return instance;
    }

    /**
     * factory method to create a deep copy of PriceChangedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PriceChangedError deepCopy(@Nullable final PriceChangedError template) {
        if (template == null) {
            return null;
        }
        PriceChangedErrorImpl instance = new PriceChangedErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setLineItems(Optional.ofNullable(template.getLineItems()).map(ArrayList::new).orElse(null));
        instance.setShipping(template.getShipping());
        return instance;
    }

    /**
     * builder factory method for PriceChangedError
     * @return builder
     */
    public static PriceChangedErrorBuilder builder() {
        return PriceChangedErrorBuilder.of();
    }

    /**
     * create builder for PriceChangedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PriceChangedErrorBuilder builder(final PriceChangedError template) {
        return PriceChangedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPriceChangedError(Function<PriceChangedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PriceChangedError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PriceChangedError>() {
            @Override
            public String toString() {
                return "TypeReference<PriceChangedError>";
            }
        };
    }
}
