package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.discount_code.DiscountCodeReference;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderRemoveDiscountCodeAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderRemoveDiscountCodeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderRemoveDiscountCodeAction stagedOrderRemoveDiscountCodeAction = StagedOrderRemoveDiscountCodeAction.builder()
 *             .discountCode(discountCodeBuilder -> discountCodeBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedOrderRemoveDiscountCodeActionBuilder implements Builder<StagedOrderRemoveDiscountCodeAction> {

    
    
    private com.commercetools.api.models.discount_code.DiscountCodeReference discountCode;

    
    /**
     *  <p>Reference to a DiscountCode.</p>
     * @param builder function to build the discountCode value
     * @return Builder
     */
    
    public StagedOrderRemoveDiscountCodeActionBuilder discountCode(Function<com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder, com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder> builder) {
        this.discountCode = builder.apply(com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Reference to a DiscountCode.</p>
     * @param builder function to build the discountCode value
     * @return Builder
     */
    
    public StagedOrderRemoveDiscountCodeActionBuilder withDiscountCode(Function<com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder, com.commercetools.api.models.discount_code.DiscountCodeReference> builder) {
        this.discountCode = builder.apply(com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Reference to a DiscountCode.</p>
     * @param discountCode value to be set
     * @return Builder
     */
    
    public StagedOrderRemoveDiscountCodeActionBuilder discountCode( final com.commercetools.api.models.discount_code.DiscountCodeReference discountCode) {
        this.discountCode = discountCode;
        return this;
    }
    
    

    /**
     *  <p>Reference to a DiscountCode.</p>
     * @return discountCode
     */
    
    
    public com.commercetools.api.models.discount_code.DiscountCodeReference getDiscountCode(){
        return this.discountCode;
    }

    /**
     * builds StagedOrderRemoveDiscountCodeAction with checking for non-null required values
     * @return StagedOrderRemoveDiscountCodeAction
     */
    public StagedOrderRemoveDiscountCodeAction build() {
        Objects.requireNonNull(discountCode, StagedOrderRemoveDiscountCodeAction.class + ": discountCode is missing");
        return new StagedOrderRemoveDiscountCodeActionImpl(discountCode);
    }
    
    /**
     * builds StagedOrderRemoveDiscountCodeAction without checking for non-null required values
     * @return StagedOrderRemoveDiscountCodeAction
     */
    public StagedOrderRemoveDiscountCodeAction buildUnchecked() {
        return new StagedOrderRemoveDiscountCodeActionImpl(discountCode);
    }

    /**
     * factory method for an instance of StagedOrderRemoveDiscountCodeActionBuilder
     * @return builder 
     */
    public static StagedOrderRemoveDiscountCodeActionBuilder of() {
        return new StagedOrderRemoveDiscountCodeActionBuilder();
    }

    /**
     * create builder for StagedOrderRemoveDiscountCodeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderRemoveDiscountCodeActionBuilder of(final StagedOrderRemoveDiscountCodeAction template) {
        StagedOrderRemoveDiscountCodeActionBuilder builder = new StagedOrderRemoveDiscountCodeActionBuilder();
        builder.discountCode = template.getDiscountCode();
        return builder;
    }

}
