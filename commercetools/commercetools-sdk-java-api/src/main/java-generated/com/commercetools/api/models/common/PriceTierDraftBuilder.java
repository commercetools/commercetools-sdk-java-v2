
package com.commercetools.api.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PriceTierDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PriceTierDraft priceTierDraft = PriceTierDraft.builder()
 *             .minimumQuantity(0.3)
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PriceTierDraftBuilder implements Builder<PriceTierDraft> {

    private Long minimumQuantity;

    private com.commercetools.api.models.common.Money value;

    /**
     *  <p>Minimum quantity this Price tier is valid for.</p>
     *  <p>The minimum quantity is always greater than or equal to 2. The base Price is interpreted as valid for a minimum quantity equal to 1.</p>
     * @param minimumQuantity value to be set
     * @return Builder
     */

    public PriceTierDraftBuilder minimumQuantity(final Long minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
        return this;
    }

    /**
     *  <p>Money value that applies when the <code>minimumQuantity</code> is greater than or equal to the LineItem <code>quantity</code>.</p>
     *  <p>The <code>currencyCode</code> of a Price tier must be the same as the <code>currencyCode</code> in the <code>value</code> of the related Price.</p>
     * @param builder function to build the value value
     * @return Builder
     */

    public PriceTierDraftBuilder value(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.value = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Money value that applies when the <code>minimumQuantity</code> is greater than or equal to the LineItem <code>quantity</code>.</p>
     *  <p>The <code>currencyCode</code> of a Price tier must be the same as the <code>currencyCode</code> in the <code>value</code> of the related Price.</p>
     * @param value value to be set
     * @return Builder
     */

    public PriceTierDraftBuilder value(final com.commercetools.api.models.common.Money value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Minimum quantity this Price tier is valid for.</p>
     *  <p>The minimum quantity is always greater than or equal to 2. The base Price is interpreted as valid for a minimum quantity equal to 1.</p>
     * @return minimumQuantity
     */

    public Long getMinimumQuantity() {
        return this.minimumQuantity;
    }

    /**
     *  <p>Money value that applies when the <code>minimumQuantity</code> is greater than or equal to the LineItem <code>quantity</code>.</p>
     *  <p>The <code>currencyCode</code> of a Price tier must be the same as the <code>currencyCode</code> in the <code>value</code> of the related Price.</p>
     * @return value
     */

    public com.commercetools.api.models.common.Money getValue() {
        return this.value;
    }

    /**
     * builds PriceTierDraft with checking for non-null required values
     * @return PriceTierDraft
     */
    public PriceTierDraft build() {
        Objects.requireNonNull(minimumQuantity, PriceTierDraft.class + ": minimumQuantity is missing");
        Objects.requireNonNull(value, PriceTierDraft.class + ": value is missing");
        return new PriceTierDraftImpl(minimumQuantity, value);
    }

    /**
     * builds PriceTierDraft without checking for non-null required values
     * @return PriceTierDraft
     */
    public PriceTierDraft buildUnchecked() {
        return new PriceTierDraftImpl(minimumQuantity, value);
    }

    /**
     * factory method for an instance of PriceTierDraftBuilder
     * @return builder
     */
    public static PriceTierDraftBuilder of() {
        return new PriceTierDraftBuilder();
    }

    /**
     * create builder for PriceTierDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PriceTierDraftBuilder of(final PriceTierDraft template) {
        PriceTierDraftBuilder builder = new PriceTierDraftBuilder();
        builder.minimumQuantity = template.getMinimumQuantity();
        builder.value = template.getValue();
        return builder;
    }

}
