
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when the Price, Tax Rate, or Shipping Rate of some Line Items changed since they were last added to the Cart.</p>
 *  <p>The error is returned as a failed response to:</p>
 *  <ul>
 *   <li>Create Order from Cart and Create Order in Store from Cart requests on Orders.</li>
 *   <li>Create Order from Cart and Create Order in Store from Cart requests on My Orders.</li>
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

    String PRICE_CHANGED = "PriceChanged";

    /**
     *
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Plain text description of the reason for the Price change. For example, <code>"The price or tax of some line items changed at the time of placing the order: $lineItems."</code>.</p>
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Unique identifiers of the Line Items for which the Price or TaxRate has changed.</p>
     */
    @NotNull
    @JsonProperty("lineItems")
    public List<String> getLineItems();

    /**
     *  <p><code>true</code> if the ShippingRate has changed.</p>
     */
    @NotNull
    @JsonProperty("shipping")
    public Boolean getShipping();

    public void setMessage(final String message);

    @JsonIgnore
    public void setLineItems(final String... lineItems);

    public void setLineItems(final List<String> lineItems);

    public void setShipping(final Boolean shipping);

    public static PriceChangedError of() {
        return new PriceChangedErrorImpl();
    }

    public static PriceChangedError of(final PriceChangedError template) {
        PriceChangedErrorImpl instance = new PriceChangedErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setLineItems(template.getLineItems());
        instance.setShipping(template.getShipping());
        return instance;
    }

    public static PriceChangedErrorBuilder builder() {
        return PriceChangedErrorBuilder.of();
    }

    public static PriceChangedErrorBuilder builder(final PriceChangedError template) {
        return PriceChangedErrorBuilder.of(template);
    }

    default <T> T withPriceChangedError(Function<PriceChangedError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PriceChangedError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PriceChangedError>() {
            @Override
            public String toString() {
                return "TypeReference<PriceChangedError>";
            }
        };
    }
}
