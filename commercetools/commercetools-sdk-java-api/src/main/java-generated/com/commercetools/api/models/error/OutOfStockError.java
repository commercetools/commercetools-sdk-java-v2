
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
 *   <li>Create Order from Cart, Create Order in Store from Cart, and Create Order by Import requests on Orders.</li>
 *   <li>Create Order from Cart and Create Order in Store from Cart requests on My Orders.</li>
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

    /**
     * discriminator value for OutOfStockError
     */
    String OUT_OF_STOCK = "OutOfStock";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Some line items are out of stock at the time of placing the order: $itemSku."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Unique identifiers of the Line Items that are out of stock.</p>
     * @return lineItems
     */
    @NotNull
    @JsonProperty("lineItems")
    public List<String> getLineItems();

    /**
     *  <p>SKUs of the Line Items that are out of stock.</p>
     * @return skus
     */
    @NotNull
    @JsonProperty("skus")
    public List<String> getSkus();

    /**
     *  <p><code>"Some line items are out of stock at the time of placing the order: $itemSku."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifiers of the Line Items that are out of stock.</p>
     * @param lineItems values to be set
     */

    @JsonIgnore
    public void setLineItems(final String... lineItems);

    /**
     *  <p>Unique identifiers of the Line Items that are out of stock.</p>
     * @param lineItems values to be set
     */

    public void setLineItems(final List<String> lineItems);

    /**
     *  <p>SKUs of the Line Items that are out of stock.</p>
     * @param skus values to be set
     */

    @JsonIgnore
    public void setSkus(final String... skus);

    /**
     *  <p>SKUs of the Line Items that are out of stock.</p>
     * @param skus values to be set
     */

    public void setSkus(final List<String> skus);

    /**
     * factory method
     * @return instance of OutOfStockError
     */
    public static OutOfStockError of() {
        return new OutOfStockErrorImpl();
    }

    /**
     * factory method to copy an instance of OutOfStockError
     * @param template instance to be copied
     * @return copy instance
     */
    public static OutOfStockError of(final OutOfStockError template) {
        OutOfStockErrorImpl instance = new OutOfStockErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setLineItems(template.getLineItems());
        instance.setSkus(template.getSkus());
        return instance;
    }

    /**
     * builder factory method for OutOfStockError
     * @return builder
     */
    public static OutOfStockErrorBuilder builder() {
        return OutOfStockErrorBuilder.of();
    }

    /**
     * create builder for OutOfStockError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OutOfStockErrorBuilder builder(final OutOfStockError template) {
        return OutOfStockErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOutOfStockError(Function<OutOfStockError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OutOfStockError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OutOfStockError>() {
            @Override
            public String toString() {
                return "TypeReference<OutOfStockError>";
            }
        };
    }
}
