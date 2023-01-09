
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
     */

    public DuplicatePriceKeyErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public DuplicatePriceKeyErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
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
     */

    public DuplicatePriceKeyErrorBuilder conflictingPrice(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.PriceBuilder> builder) {
        this.conflictingPrice = builder.apply(com.commercetools.api.models.common.PriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Conflicting Embedded Price.</p>
     */

    public DuplicatePriceKeyErrorBuilder conflictingPrice(
            final com.commercetools.api.models.common.Price conflictingPrice) {
        this.conflictingPrice = conflictingPrice;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    public com.commercetools.api.models.common.Price getConflictingPrice() {
        return this.conflictingPrice;
    }

    public DuplicatePriceKeyError build() {
        Objects.requireNonNull(message, DuplicatePriceKeyError.class + ": message is missing");
        Objects.requireNonNull(conflictingPrice, DuplicatePriceKeyError.class + ": conflictingPrice is missing");
        return new DuplicatePriceKeyErrorImpl(message, values, conflictingPrice);
    }

    /**
     * builds DuplicatePriceKeyError without checking for non null required values
     */
    public DuplicatePriceKeyError buildUnchecked() {
        return new DuplicatePriceKeyErrorImpl(message, values, conflictingPrice);
    }

    public static DuplicatePriceKeyErrorBuilder of() {
        return new DuplicatePriceKeyErrorBuilder();
    }

    public static DuplicatePriceKeyErrorBuilder of(final DuplicatePriceKeyError template) {
        DuplicatePriceKeyErrorBuilder builder = new DuplicatePriceKeyErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.conflictingPrice = template.getConflictingPrice();
        return builder;
    }

}
