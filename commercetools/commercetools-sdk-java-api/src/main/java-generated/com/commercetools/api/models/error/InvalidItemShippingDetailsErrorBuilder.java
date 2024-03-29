
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InvalidItemShippingDetailsErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidItemShippingDetailsError invalidItemShippingDetailsError = InvalidItemShippingDetailsError.builder()
 *             .message("{message}")
 *             .subject("{subject}")
 *             .itemId("{itemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InvalidItemShippingDetailsErrorBuilder implements Builder<InvalidItemShippingDetailsError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private String subject;

    private String itemId;

    /**
     *  <p><code>"Inconsistent shipping details for $subject with ID $itemId. $subject quantity is $itemQuantity and shippingTargets quantity sum is $quantitySum."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public InvalidItemShippingDetailsErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public InvalidItemShippingDetailsErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public InvalidItemShippingDetailsErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p><code>"LineItem"</code> or <code>"CustomLineItem"</code></p>
     * @param subject value to be set
     * @return Builder
     */

    public InvalidItemShippingDetailsErrorBuilder subject(final String subject) {
        this.subject = subject;
        return this;
    }

    /**
     *  <p>Unique identifier of the Line Item or Custom Line Item.</p>
     * @param itemId value to be set
     * @return Builder
     */

    public InvalidItemShippingDetailsErrorBuilder itemId(final String itemId) {
        this.itemId = itemId;
        return this;
    }

    /**
     *  <p><code>"Inconsistent shipping details for $subject with ID $itemId. $subject quantity is $itemQuantity and shippingTargets quantity sum is $quantitySum."</code></p>
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
     *  <p><code>"LineItem"</code> or <code>"CustomLineItem"</code></p>
     * @return subject
     */

    public String getSubject() {
        return this.subject;
    }

    /**
     *  <p>Unique identifier of the Line Item or Custom Line Item.</p>
     * @return itemId
     */

    public String getItemId() {
        return this.itemId;
    }

    /**
     * builds InvalidItemShippingDetailsError with checking for non-null required values
     * @return InvalidItemShippingDetailsError
     */
    public InvalidItemShippingDetailsError build() {
        Objects.requireNonNull(message, InvalidItemShippingDetailsError.class + ": message is missing");
        Objects.requireNonNull(subject, InvalidItemShippingDetailsError.class + ": subject is missing");
        Objects.requireNonNull(itemId, InvalidItemShippingDetailsError.class + ": itemId is missing");
        return new InvalidItemShippingDetailsErrorImpl(message, values, subject, itemId);
    }

    /**
     * builds InvalidItemShippingDetailsError without checking for non-null required values
     * @return InvalidItemShippingDetailsError
     */
    public InvalidItemShippingDetailsError buildUnchecked() {
        return new InvalidItemShippingDetailsErrorImpl(message, values, subject, itemId);
    }

    /**
     * factory method for an instance of InvalidItemShippingDetailsErrorBuilder
     * @return builder
     */
    public static InvalidItemShippingDetailsErrorBuilder of() {
        return new InvalidItemShippingDetailsErrorBuilder();
    }

    /**
     * create builder for InvalidItemShippingDetailsError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InvalidItemShippingDetailsErrorBuilder of(final InvalidItemShippingDetailsError template) {
        InvalidItemShippingDetailsErrorBuilder builder = new InvalidItemShippingDetailsErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.subject = template.getSubject();
        builder.itemId = template.getItemId();
        return builder;
    }

}
