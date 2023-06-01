package com.commercetools.api.models.discount_code;

import com.commercetools.api.models.discount_code.DiscountCodeUpdateAction;
import java.time.ZonedDateTime;
import com.commercetools.api.models.discount_code.DiscountCodeSetValidFromAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeSetValidFromActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeSetValidFromAction discountCodeSetValidFromAction = DiscountCodeSetValidFromAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class DiscountCodeSetValidFromActionBuilder implements Builder<DiscountCodeSetValidFromAction> {

    
    @Nullable
    private java.time.ZonedDateTime validFrom;

    
    /**
     *  <p>Value to set that must be earlier than <code>validUntil</code>. If empty, any existing value will be removed.</p>
     * @param validFrom value to be set
     * @return Builder
     */
    
    public DiscountCodeSetValidFromActionBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }
    
    

    /**
     *  <p>Value to set that must be earlier than <code>validUntil</code>. If empty, any existing value will be removed.</p>
     * @return validFrom
     */
    
    @Nullable
    public java.time.ZonedDateTime getValidFrom(){
        return this.validFrom;
    }

    /**
     * builds DiscountCodeSetValidFromAction with checking for non-null required values
     * @return DiscountCodeSetValidFromAction
     */
    public DiscountCodeSetValidFromAction build() {
        return new DiscountCodeSetValidFromActionImpl(validFrom);
    }
    
    /**
     * builds DiscountCodeSetValidFromAction without checking for non-null required values
     * @return DiscountCodeSetValidFromAction
     */
    public DiscountCodeSetValidFromAction buildUnchecked() {
        return new DiscountCodeSetValidFromActionImpl(validFrom);
    }

    /**
     * factory method for an instance of DiscountCodeSetValidFromActionBuilder
     * @return builder 
     */
    public static DiscountCodeSetValidFromActionBuilder of() {
        return new DiscountCodeSetValidFromActionBuilder();
    }

    /**
     * create builder for DiscountCodeSetValidFromAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeSetValidFromActionBuilder of(final DiscountCodeSetValidFromAction template) {
        DiscountCodeSetValidFromActionBuilder builder = new DiscountCodeSetValidFromActionBuilder();
        builder.validFrom = template.getValidFrom();
        return builder;
    }

}
