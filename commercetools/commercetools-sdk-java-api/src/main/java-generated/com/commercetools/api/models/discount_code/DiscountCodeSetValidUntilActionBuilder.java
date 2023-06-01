package com.commercetools.api.models.discount_code;

import com.commercetools.api.models.discount_code.DiscountCodeUpdateAction;
import java.time.ZonedDateTime;
import com.commercetools.api.models.discount_code.DiscountCodeSetValidUntilAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeSetValidUntilActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeSetValidUntilAction discountCodeSetValidUntilAction = DiscountCodeSetValidUntilAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class DiscountCodeSetValidUntilActionBuilder implements Builder<DiscountCodeSetValidUntilAction> {

    
    @Nullable
    private java.time.ZonedDateTime validUntil;

    
    /**
     *  <p>Value to set that must be later than <code>validFrom</code>. If empty, any existing value will be removed.</p>
     * @param validUntil value to be set
     * @return Builder
     */
    
    public DiscountCodeSetValidUntilActionBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }
    
    

    /**
     *  <p>Value to set that must be later than <code>validFrom</code>. If empty, any existing value will be removed.</p>
     * @return validUntil
     */
    
    @Nullable
    public java.time.ZonedDateTime getValidUntil(){
        return this.validUntil;
    }

    /**
     * builds DiscountCodeSetValidUntilAction with checking for non-null required values
     * @return DiscountCodeSetValidUntilAction
     */
    public DiscountCodeSetValidUntilAction build() {
        return new DiscountCodeSetValidUntilActionImpl(validUntil);
    }
    
    /**
     * builds DiscountCodeSetValidUntilAction without checking for non-null required values
     * @return DiscountCodeSetValidUntilAction
     */
    public DiscountCodeSetValidUntilAction buildUnchecked() {
        return new DiscountCodeSetValidUntilActionImpl(validUntil);
    }

    /**
     * factory method for an instance of DiscountCodeSetValidUntilActionBuilder
     * @return builder 
     */
    public static DiscountCodeSetValidUntilActionBuilder of() {
        return new DiscountCodeSetValidUntilActionBuilder();
    }

    /**
     * create builder for DiscountCodeSetValidUntilAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeSetValidUntilActionBuilder of(final DiscountCodeSetValidUntilAction template) {
        DiscountCodeSetValidUntilActionBuilder builder = new DiscountCodeSetValidUntilActionBuilder();
        builder.validUntil = template.getValidUntil();
        return builder;
    }

}
