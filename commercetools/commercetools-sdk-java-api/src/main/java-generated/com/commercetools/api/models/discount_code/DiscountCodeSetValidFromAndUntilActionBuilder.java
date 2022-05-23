
package com.commercetools.api.models.discount_code;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   DiscountCodeSetValidFromAndUntilAction discountCodeSetValidFromAndUntilAction = DiscountCodeSetValidFromAndUntilAction.builder()
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountCodeSetValidFromAndUntilActionBuilder implements Builder<DiscountCodeSetValidFromAndUntilAction> {

    @Nullable
    private java.time.ZonedDateTime validFrom;

    @Nullable
    private java.time.ZonedDateTime validUntil;

    /**
     *  <p>Value to set that must be earlier than <code>validUntil</code>. If empty, any existing value will be removed.</p>
     */

    public DiscountCodeSetValidFromAndUntilActionBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     *  <p>Value to set that must be later than <code>validFrom</code>. If empty, any existing value will be removed.</p>
     */

    public DiscountCodeSetValidFromAndUntilActionBuilder validUntil(
            @Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    public DiscountCodeSetValidFromAndUntilAction build() {
        return new DiscountCodeSetValidFromAndUntilActionImpl(validFrom, validUntil);
    }

    /**
     * builds DiscountCodeSetValidFromAndUntilAction without checking for non null required values
     */
    public DiscountCodeSetValidFromAndUntilAction buildUnchecked() {
        return new DiscountCodeSetValidFromAndUntilActionImpl(validFrom, validUntil);
    }

    public static DiscountCodeSetValidFromAndUntilActionBuilder of() {
        return new DiscountCodeSetValidFromAndUntilActionBuilder();
    }

    public static DiscountCodeSetValidFromAndUntilActionBuilder of(
            final DiscountCodeSetValidFromAndUntilAction template) {
        DiscountCodeSetValidFromAndUntilActionBuilder builder = new DiscountCodeSetValidFromAndUntilActionBuilder();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        return builder;
    }

}
