
package com.commercetools.history.models.common;

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
 *             .amount(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SubRateBuilder implements Builder<SubRate> {

    private String name;

    private Integer amount;

    /**
     * set the value to the name
     * @param name value to be set
     * @return Builder
     */

    public SubRateBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     * set the value to the amount
     * @param amount value to be set
     * @return Builder
     */

    public SubRateBuilder amount(final Integer amount) {
        this.amount = amount;
        return this;
    }

    /**
     * value of name}
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     * value of amount}
     * @return amount
     */

    public Integer getAmount() {
        return this.amount;
    }

    /**
     * builds SubRate with checking for non-null required values
     * @return SubRate
     */
    public SubRate build() {
        Objects.requireNonNull(name, SubRate.class + ": name is missing");
        Objects.requireNonNull(amount, SubRate.class + ": amount is missing");
        return new SubRateImpl(name, amount);
    }

    /**
     * builds SubRate without checking for non-null required values
     * @return SubRate
     */
    public SubRate buildUnchecked() {
        return new SubRateImpl(name, amount);
    }

    /**
     * factory method for an instance of SubRateBuilder
     * @return builder
     */
    public static SubRateBuilder of() {
        return new SubRateBuilder();
    }

    /**
     * create builder for SubRate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SubRateBuilder of(final SubRate template) {
        SubRateBuilder builder = new SubRateBuilder();
        builder.name = template.getName();
        builder.amount = template.getAmount();
        return builder;
    }

}
