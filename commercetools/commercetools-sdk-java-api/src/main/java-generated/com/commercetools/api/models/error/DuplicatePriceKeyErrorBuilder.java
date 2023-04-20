
package com.commercetools.api.models.error;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DuplicatePriceKeyErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DuplicatePriceKeyError duplicatePriceKeyError = DuplicatePriceKeyError.builder()
 *             .message("{message}")
 *             .conflictingPrice(conflictingPriceBuilder -> conflictingPriceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DuplicatePriceKeyErrorBuilder implements Builder<DuplicatePriceKeyError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private com.commercetools.api.models.common.Price conflictingPrice;

    /**
     *  <p><code>"Duplicate price key: $priceKey. The price key must be unique per variant."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public DuplicatePriceKeyErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public DuplicatePriceKeyErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public DuplicatePriceKeyErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Conflicting Embedded Price.</p>
     * @param builder function to build the conflictingPrice value
     * @return Builder
     */

    public DuplicatePriceKeyErrorBuilder conflictingPrice(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.PriceBuilder> builder) {
        this.conflictingPrice = builder.apply(com.commercetools.api.models.common.PriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Conflicting Embedded Price.</p>
     * @param builder function to build the conflictingPrice value
     * @return Builder
     */

    public DuplicatePriceKeyErrorBuilder withConflictingPrice(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.Price> builder) {
        this.conflictingPrice = builder.apply(com.commercetools.api.models.common.PriceBuilder.of());
        return this;
    }

    /**
     *  <p>Conflicting Embedded Price.</p>
     * @param conflictingPrice value to be set
     * @return Builder
     */

    public DuplicatePriceKeyErrorBuilder conflictingPrice(
            final com.commercetools.api.models.common.Price conflictingPrice) {
        this.conflictingPrice = conflictingPrice;
        return this;
    }

    /**
     *  <p><code>"Duplicate price key: $priceKey. The price key must be unique per variant."</code></p>
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
     *  <p>Conflicting Embedded Price.</p>
     * @return conflictingPrice
     */

    public com.commercetools.api.models.common.Price getConflictingPrice() {
        return this.conflictingPrice;
    }

    /**
     * builds DuplicatePriceKeyError with checking for non-null required values
     * @return DuplicatePriceKeyError
     */
    public DuplicatePriceKeyError build() {
        Objects.requireNonNull(message, DuplicatePriceKeyError.class + ": message is missing");
        Objects.requireNonNull(conflictingPrice, DuplicatePriceKeyError.class + ": conflictingPrice is missing");
        return new DuplicatePriceKeyErrorImpl(message, values, conflictingPrice);
    }

    /**
     * builds DuplicatePriceKeyError without checking for non-null required values
     * @return DuplicatePriceKeyError
     */
    public DuplicatePriceKeyError buildUnchecked() {
        return new DuplicatePriceKeyErrorImpl(message, values, conflictingPrice);
    }

    /**
     * factory method for an instance of DuplicatePriceKeyErrorBuilder
     * @return builder
     */
    public static DuplicatePriceKeyErrorBuilder of() {
        return new DuplicatePriceKeyErrorBuilder();
    }

    /**
     * create builder for DuplicatePriceKeyError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DuplicatePriceKeyErrorBuilder of(final DuplicatePriceKeyError template) {
        DuplicatePriceKeyErrorBuilder builder = new DuplicatePriceKeyErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.conflictingPrice = template.getConflictingPrice();
        return builder;
    }

}
