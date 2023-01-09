
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
     */

    public DuplicatePriceScopeErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public DuplicatePriceScopeErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
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
     */

    public DuplicatePriceScopeErrorBuilder conflictingPrice(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.PriceBuilder> builder) {
        this.conflictingPrice = builder.apply(com.commercetools.api.models.common.PriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Conflicting Embedded Price.</p>
     */

    public DuplicatePriceScopeErrorBuilder conflictingPrice(
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

    public DuplicatePriceScopeError build() {
        Objects.requireNonNull(message, DuplicatePriceScopeError.class + ": message is missing");
        Objects.requireNonNull(conflictingPrice, DuplicatePriceScopeError.class + ": conflictingPrice is missing");
        return new DuplicatePriceScopeErrorImpl(message, values, conflictingPrice);
    }

    /**
     * builds DuplicatePriceScopeError without checking for non null required values
     */
    public DuplicatePriceScopeError buildUnchecked() {
        return new DuplicatePriceScopeErrorImpl(message, values, conflictingPrice);
    }

    public static DuplicatePriceScopeErrorBuilder of() {
        return new DuplicatePriceScopeErrorBuilder();
    }

    public static DuplicatePriceScopeErrorBuilder of(final DuplicatePriceScopeError template) {
        DuplicatePriceScopeErrorBuilder builder = new DuplicatePriceScopeErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.conflictingPrice = template.getConflictingPrice();
        return builder;
    }

}
