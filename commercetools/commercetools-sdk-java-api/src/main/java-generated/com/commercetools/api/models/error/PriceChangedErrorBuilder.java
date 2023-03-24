
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PriceChangedErrorBuilder
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
public class PriceChangedErrorBuilder implements Builder<PriceChangedError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private java.util.List<String> lineItems;

    private Boolean shipping;

    /**
     *  <p>Plain text description of the reason for the Price change. For example, <code>"The price or tax of some line items changed at the time of placing the order: $lineItems."</code>.</p>
     * @param message value to be set
     * @return Builder
     */

    public PriceChangedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public PriceChangedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public PriceChangedErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Unique identifiers of the Line Items for which the Price or TaxRate has changed.</p>
     * @param lineItems value to be set
     * @return Builder
     */

    public PriceChangedErrorBuilder lineItems(final String... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
        return this;
    }

    /**
     *  <p>Unique identifiers of the Line Items for which the Price or TaxRate has changed.</p>
     * @param lineItems value to be set
     * @return Builder
     */

    public PriceChangedErrorBuilder lineItems(final java.util.List<String> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    /**
     *  <p>Unique identifiers of the Line Items for which the Price or TaxRate has changed.</p>
     * @param lineItems value to be set
     * @return Builder
     */

    public PriceChangedErrorBuilder plusLineItems(final String... lineItems) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.addAll(Arrays.asList(lineItems));
        return this;
    }

    /**
     *  <p><code>true</code> if the ShippingRate has changed.</p>
     * @param shipping value to be set
     * @return Builder
     */

    public PriceChangedErrorBuilder shipping(final Boolean shipping) {
        this.shipping = shipping;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    public java.util.List<String> getLineItems() {
        return this.lineItems;
    }

    public Boolean getShipping() {
        return this.shipping;
    }

    /**
     * builds PriceChangedError with checking for non-null required values
     * @return PriceChangedError
     */
    public PriceChangedError build() {
        Objects.requireNonNull(message, PriceChangedError.class + ": message is missing");
        Objects.requireNonNull(lineItems, PriceChangedError.class + ": lineItems is missing");
        Objects.requireNonNull(shipping, PriceChangedError.class + ": shipping is missing");
        return new PriceChangedErrorImpl(message, values, lineItems, shipping);
    }

    /**
     * builds PriceChangedError without checking for non-null required values
     * @return PriceChangedError
     */
    public PriceChangedError buildUnchecked() {
        return new PriceChangedErrorImpl(message, values, lineItems, shipping);
    }

    public static PriceChangedErrorBuilder of() {
        return new PriceChangedErrorBuilder();
    }

    public static PriceChangedErrorBuilder of(final PriceChangedError template) {
        PriceChangedErrorBuilder builder = new PriceChangedErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.lineItems = template.getLineItems();
        builder.shipping = template.getShipping();
        return builder;
    }

}
