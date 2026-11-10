
package com.commercetools.api.models.error;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * LineItemQuantityAboveLimitErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LineItemQuantityAboveLimitError lineItemQuantityAboveLimitError = LineItemQuantityAboveLimitError.builder()
 *             .message("{message}")
 *             .quantity(1)
 *             .maxCartQuantity(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class LineItemQuantityAboveLimitErrorBuilder implements Builder<LineItemQuantityAboveLimitError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private Integer quantity;

    private Integer maxCartQuantity;

    @Nullable
    private String lineItem;

    /**
     *  <p><code>"Quantity '$quantity' greater than maximum '$maxCartQuantity'."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public LineItemQuantityAboveLimitErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public LineItemQuantityAboveLimitErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public LineItemQuantityAboveLimitErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>The quantity that was requested.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public LineItemQuantityAboveLimitErrorBuilder quantity(final Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>The maximum quantity allowed for this Line Item.</p>
     * @param maxCartQuantity value to be set
     * @return Builder
     */

    public LineItemQuantityAboveLimitErrorBuilder maxCartQuantity(final Integer maxCartQuantity) {
        this.maxCartQuantity = maxCartQuantity;
        return this;
    }

    /**
     *  <p>Reference to the Line Item that caused the error.</p>
     * @param lineItem value to be set
     * @return Builder
     */

    public LineItemQuantityAboveLimitErrorBuilder lineItem(@Nullable final String lineItem) {
        this.lineItem = lineItem;
        return this;
    }

    /**
     *  <p><code>"Quantity '$quantity' greater than maximum '$maxCartQuantity'."</code></p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @return pattern properties
     */

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    /**
     *  <p>The quantity that was requested.</p>
     * @return quantity
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>The maximum quantity allowed for this Line Item.</p>
     * @return maxCartQuantity
     */

    public Integer getMaxCartQuantity() {
        return this.maxCartQuantity;
    }

    /**
     *  <p>Reference to the Line Item that caused the error.</p>
     * @return lineItem
     */

    @Nullable
    public String getLineItem() {
        return this.lineItem;
    }

    /**
     * builds LineItemQuantityAboveLimitError with checking for non-null required values
     * @return LineItemQuantityAboveLimitError
     */
    public LineItemQuantityAboveLimitError build() {
        Objects.requireNonNull(message, LineItemQuantityAboveLimitError.class + ": message is missing");
        Objects.requireNonNull(quantity, LineItemQuantityAboveLimitError.class + ": quantity is missing");
        Objects.requireNonNull(maxCartQuantity, LineItemQuantityAboveLimitError.class + ": maxCartQuantity is missing");
        return new LineItemQuantityAboveLimitErrorImpl(message, values, quantity, maxCartQuantity, lineItem);
    }

    /**
     * builds LineItemQuantityAboveLimitError without checking for non-null required values
     * @return LineItemQuantityAboveLimitError
     */
    public LineItemQuantityAboveLimitError buildUnchecked() {
        return new LineItemQuantityAboveLimitErrorImpl(message, values, quantity, maxCartQuantity, lineItem);
    }

    /**
     * factory method for an instance of LineItemQuantityAboveLimitErrorBuilder
     * @return builder
     */
    public static LineItemQuantityAboveLimitErrorBuilder of() {
        return new LineItemQuantityAboveLimitErrorBuilder();
    }

    /**
     * create builder for LineItemQuantityAboveLimitError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LineItemQuantityAboveLimitErrorBuilder of(final LineItemQuantityAboveLimitError template) {
        LineItemQuantityAboveLimitErrorBuilder builder = new LineItemQuantityAboveLimitErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.quantity = template.getQuantity();
        builder.maxCartQuantity = template.getMaxCartQuantity();
        builder.lineItem = template.getLineItem();
        return builder;
    }

}
