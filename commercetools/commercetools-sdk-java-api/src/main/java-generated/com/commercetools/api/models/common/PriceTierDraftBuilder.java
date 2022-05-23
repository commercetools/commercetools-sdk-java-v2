
package com.commercetools.api.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   PriceTierDraft priceTierDraft = PriceTierDraft.builder()
           .minimumQuantity(0.3)
           .value(valueBuilder -> valueBuilder)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PriceTierDraftBuilder implements Builder<PriceTierDraft> {

    private Long minimumQuantity;

    private com.commercetools.api.models.common.Money value;

    /**
     *  <p>Minimum quantity this Price tier is valid for.</p>
     *  <p>The minimum quantity is always greater than or equal to 2. The base Price is interpreted as valid for a minimum quantity equal to 1.</p>
     */

    public PriceTierDraftBuilder minimumQuantity(final Long minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
        return this;
    }

    /**
     *  <p>Money value that applies when the <code>minimumQuantity</code> is greater than or equal to the LineItem <code>quantity</code>.</p>
     *  <p>The <code>currencyCode</code> of a Price tier must be the same as the <code>currencyCode</code> in the <code>value</code> of the related Price.</p>
     */

    public PriceTierDraftBuilder value(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.value = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Money value that applies when the <code>minimumQuantity</code> is greater than or equal to the LineItem <code>quantity</code>.</p>
     *  <p>The <code>currencyCode</code> of a Price tier must be the same as the <code>currencyCode</code> in the <code>value</code> of the related Price.</p>
     */

    public PriceTierDraftBuilder value(final com.commercetools.api.models.common.Money value) {
        this.value = value;
        return this;
    }

    public Long getMinimumQuantity() {
        return this.minimumQuantity;
    }

    public com.commercetools.api.models.common.Money getValue() {
        return this.value;
    }

    public PriceTierDraft build() {
        Objects.requireNonNull(minimumQuantity, PriceTierDraft.class + ": minimumQuantity is missing");
        Objects.requireNonNull(value, PriceTierDraft.class + ": value is missing");
        return new PriceTierDraftImpl(minimumQuantity, value);
    }

    /**
     * builds PriceTierDraft without checking for non null required values
     */
    public PriceTierDraft buildUnchecked() {
        return new PriceTierDraftImpl(minimumQuantity, value);
    }

    public static PriceTierDraftBuilder of() {
        return new PriceTierDraftBuilder();
    }

    public static PriceTierDraftBuilder of(final PriceTierDraft template) {
        PriceTierDraftBuilder builder = new PriceTierDraftBuilder();
        builder.minimumQuantity = template.getMinimumQuantity();
        builder.value = template.getValue();
        return builder;
    }

}
