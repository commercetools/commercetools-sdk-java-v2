
package com.commercetools.api.models.error;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DuplicatePriceScopeErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DuplicatePriceScopeError duplicatePriceScopeError = DuplicatePriceScopeError.builder()
 *             .message("{message}")
 *             .conflictingPrice(conflictingPriceBuilder -> conflictingPriceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DuplicatePriceScopeErrorBuilder implements Builder<DuplicatePriceScopeError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private com.commercetools.api.models.common.Price conflictingPrice;

    /**
     *  <p><code>"Duplicate price scope: $priceScope. The combination of currency, country, customerGroup and channel must be unique for each price of a product variant."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public DuplicatePriceScopeErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public DuplicatePriceScopeErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public DuplicatePriceScopeErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public DuplicatePriceScopeErrorBuilder conflictingPrice(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.PriceBuilder> builder) {
        this.conflictingPrice = builder.apply(com.commercetools.api.models.common.PriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Conflicting Embedded Price.</p>
     * @param conflictingPrice value to be set
     * @return Builder
     */

    public DuplicatePriceScopeErrorBuilder conflictingPrice(
            final com.commercetools.api.models.common.Price conflictingPrice) {
        this.conflictingPrice = conflictingPrice;
        return this;
    }

    /**
     *  <p><code>"Duplicate price scope: $priceScope. The combination of currency, country, customerGroup and channel must be unique for each price of a product variant."</code></p>
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
     * builds DuplicatePriceScopeError with checking for non-null required values
     * @return DuplicatePriceScopeError
     */
    public DuplicatePriceScopeError build() {
        Objects.requireNonNull(message, DuplicatePriceScopeError.class + ": message is missing");
        Objects.requireNonNull(conflictingPrice, DuplicatePriceScopeError.class + ": conflictingPrice is missing");
        return new DuplicatePriceScopeErrorImpl(message, values, conflictingPrice);
    }

    /**
     * builds DuplicatePriceScopeError without checking for non-null required values
     * @return DuplicatePriceScopeError
     */
    public DuplicatePriceScopeError buildUnchecked() {
        return new DuplicatePriceScopeErrorImpl(message, values, conflictingPrice);
    }

    /**
     * factory method for an instance of DuplicatePriceScopeErrorBuilder
     * @return builder
     */
    public static DuplicatePriceScopeErrorBuilder of() {
        return new DuplicatePriceScopeErrorBuilder();
    }

    /**
     * create builder for DuplicatePriceScopeError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DuplicatePriceScopeErrorBuilder of(final DuplicatePriceScopeError template) {
        DuplicatePriceScopeErrorBuilder builder = new DuplicatePriceScopeErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.conflictingPrice = template.getConflictingPrice();
        return builder;
    }

}
