
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PriceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Price price = Price.builder()
 *             .id("{id}")
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PriceBuilder implements Builder<Price> {

    private String id;

    private com.commercetools.history.models.common.Money value;

    /**
     *
     * @param id value to be set
     * @return Builder
     */

    public PriceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *
     * @param builder function to build the value value
     * @return Builder
     */

    public PriceBuilder value(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.value = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param value value to be set
     * @return Builder
     */

    public PriceBuilder value(final com.commercetools.history.models.common.Money value) {
        this.value = value;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public com.commercetools.history.models.common.Money getValue() {
        return this.value;
    }

    /**
     * builds Price with checking for non-null required values
     * @return Price
     */
    public Price build() {
        Objects.requireNonNull(id, Price.class + ": id is missing");
        Objects.requireNonNull(value, Price.class + ": value is missing");
        return new PriceImpl(id, value);
    }

    /**
     * builds Price without checking for non-null required values
     * @return Price
     */
    public Price buildUnchecked() {
        return new PriceImpl(id, value);
    }

    public static PriceBuilder of() {
        return new PriceBuilder();
    }

    public static PriceBuilder of(final Price template) {
        PriceBuilder builder = new PriceBuilder();
        builder.id = template.getId();
        builder.value = template.getValue();
        return builder;
    }

}
