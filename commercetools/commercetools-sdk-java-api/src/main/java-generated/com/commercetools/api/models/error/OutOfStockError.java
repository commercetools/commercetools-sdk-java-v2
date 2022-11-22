
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when some of the Line Items are out of stock at the time of placing an Order.</p>
 *  <p>The error is returned as a failed response to:</p>
 *  <ul>
 *   <li>Create Order from Cart, Create Order from Cart in a Store, and Create Order by Import requests on Orders.</li>
 *   <li>Create Order from a Cart and Create Order in a Store from Cart requests on My Orders.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OutOfStockError outOfStockError = OutOfStockError.builder()
 *             .message("{message}")
 *             .plusLineItems(lineItemsBuilder -> lineItemsBuilder)
 *             .plusSkus(skusBuilder -> skusBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OutOfStockErrorImpl.class)
public interface OutOfStockError extends ErrorObject {

    String OUT_OF_STOCK = "OutOfStock";

    /**
     *
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Some line items are out of stock at the time of placing the order: $itemSku."</code></p>
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Unique identifiers of the Line Items that are out of stock.</p>
     */
    @NotNull
    @JsonProperty("lineItems")
    public List<String> getLineItems();

    /**
     *  <p>SKUs of the Line Items that are out of stock.</p>
     */
    @NotNull
    @JsonProperty("skus")
    public List<String> getSkus();

    public void setMessage(final String message);

    @JsonIgnore
    public void setLineItems(final String... lineItems);

    public void setLineItems(final List<String> lineItems);

    @JsonIgnore
    public void setSkus(final String... skus);

    public void setSkus(final List<String> skus);

    public static OutOfStockError of() {
        return new OutOfStockErrorImpl();
    }

    public static OutOfStockError of(final OutOfStockError template) {
        OutOfStockErrorImpl instance = new OutOfStockErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setLineItems(template.getLineItems());
        instance.setSkus(template.getSkus());
        return instance;
    }

    public static OutOfStockErrorBuilder builder() {
        return OutOfStockErrorBuilder.of();
    }

    public static OutOfStockErrorBuilder builder(final OutOfStockError template) {
        return OutOfStockErrorBuilder.of(template);
    }

    default <T> T withOutOfStockError(Function<OutOfStockError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OutOfStockError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OutOfStockError>() {
            @Override
            public String toString() {
                return "TypeReference<OutOfStockError>";
            }
        };
    }
}
