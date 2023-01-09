
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
     */

    public InvalidItemShippingDetailsErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public InvalidItemShippingDetailsErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
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
     */

    public InvalidItemShippingDetailsErrorBuilder subject(final String subject) {
        this.subject = subject;
        return this;
    }

    /**
     *  <p>Unique identifier of the Line Item or Custom Line Item.</p>
     */

    public InvalidItemShippingDetailsErrorBuilder itemId(final String itemId) {
        this.itemId = itemId;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    public String getSubject() {
        return this.subject;
    }

    public String getItemId() {
        return this.itemId;
    }

    public InvalidItemShippingDetailsError build() {
        Objects.requireNonNull(message, InvalidItemShippingDetailsError.class + ": message is missing");
        Objects.requireNonNull(subject, InvalidItemShippingDetailsError.class + ": subject is missing");
        Objects.requireNonNull(itemId, InvalidItemShippingDetailsError.class + ": itemId is missing");
        return new InvalidItemShippingDetailsErrorImpl(message, values, subject, itemId);
    }

    /**
     * builds InvalidItemShippingDetailsError without checking for non null required values
     */
    public InvalidItemShippingDetailsError buildUnchecked() {
        return new InvalidItemShippingDetailsErrorImpl(message, values, subject, itemId);
    }

    public static InvalidItemShippingDetailsErrorBuilder of() {
        return new InvalidItemShippingDetailsErrorBuilder();
    }

    public static InvalidItemShippingDetailsErrorBuilder of(final InvalidItemShippingDetailsError template) {
        InvalidItemShippingDetailsErrorBuilder builder = new InvalidItemShippingDetailsErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.subject = template.getSubject();
        builder.itemId = template.getItemId();
        return builder;
    }

}
