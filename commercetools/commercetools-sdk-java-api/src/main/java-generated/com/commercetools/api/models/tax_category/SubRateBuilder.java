
package com.commercetools.api.models.tax_category;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SubRateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SubRate subRate = SubRate.builder()
 *             .name("{name}")
 *             .amount(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SubRateBuilder implements Builder<SubRate> {

    private String name;

    private Double amount;

    /**
     *  <p>Name of the SubRate.</p>
     * @param name
     * @return Builder
     */

    public SubRateBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *
     * @param amount
     * @return Builder
     */

    public SubRateBuilder amount(final Double amount) {
        this.amount = amount;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Double getAmount() {
        return this.amount;
    }

    public SubRate build() {
        Objects.requireNonNull(name, SubRate.class + ": name is missing");
        Objects.requireNonNull(amount, SubRate.class + ": amount is missing");
        return new SubRateImpl(name, amount);
    }

    /**
     * builds SubRate without checking for non null required values
     */
    public SubRate buildUnchecked() {
        return new SubRateImpl(name, amount);
    }

    public static SubRateBuilder of() {
        return new SubRateBuilder();
    }

    public static SubRateBuilder of(final SubRate template) {
        SubRateBuilder builder = new SubRateBuilder();
        builder.name = template.getName();
        builder.amount = template.getAmount();
        return builder;
    }

}
