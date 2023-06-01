package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.common.DiscountCodeKeyReference;
import com.commercetools.importapi.models.orders.DiscountCodeState;
import com.commercetools.importapi.models.orders.DiscountCodeInfo;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeInfoBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeInfo discountCodeInfo = DiscountCodeInfo.builder()
 *             .discountCode(discountCodeBuilder -> discountCodeBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class DiscountCodeInfoBuilder implements Builder<DiscountCodeInfo> {

    
    
    private com.commercetools.importapi.models.common.DiscountCodeKeyReference discountCode;
    
    
    @Nullable
    private com.commercetools.importapi.models.orders.DiscountCodeState state;

    
    /**
     *  <p>References a discount code by key.</p>
     * @param builder function to build the discountCode value
     * @return Builder
     */
    
    public DiscountCodeInfoBuilder discountCode(Function<com.commercetools.importapi.models.common.DiscountCodeKeyReferenceBuilder, com.commercetools.importapi.models.common.DiscountCodeKeyReferenceBuilder> builder) {
        this.discountCode = builder.apply(com.commercetools.importapi.models.common.DiscountCodeKeyReferenceBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>References a discount code by key.</p>
     * @param builder function to build the discountCode value
     * @return Builder
     */
    
    public DiscountCodeInfoBuilder withDiscountCode(Function<com.commercetools.importapi.models.common.DiscountCodeKeyReferenceBuilder, com.commercetools.importapi.models.common.DiscountCodeKeyReference> builder) {
        this.discountCode = builder.apply(com.commercetools.importapi.models.common.DiscountCodeKeyReferenceBuilder.of());
        return this;
    }
                    
    /**
     *  <p>References a discount code by key.</p>
     * @param discountCode value to be set
     * @return Builder
     */
    
    public DiscountCodeInfoBuilder discountCode( final com.commercetools.importapi.models.common.DiscountCodeKeyReference discountCode) {
        this.discountCode = discountCode;
        return this;
    }
    
    
    
    
    /**
     *  <p>Maps to <code>DiscountCodeInfo.state</code></p>
     * @param state value to be set
     * @return Builder
     */
    
    public DiscountCodeInfoBuilder state(@Nullable final com.commercetools.importapi.models.orders.DiscountCodeState state) {
        this.state = state;
        return this;
    }
    
    

    /**
     *  <p>References a discount code by key.</p>
     * @return discountCode
     */
    
    
    public com.commercetools.importapi.models.common.DiscountCodeKeyReference getDiscountCode(){
        return this.discountCode;
    }
    
    /**
     *  <p>Maps to <code>DiscountCodeInfo.state</code></p>
     * @return state
     */
    
    @Nullable
    public com.commercetools.importapi.models.orders.DiscountCodeState getState(){
        return this.state;
    }

    /**
     * builds DiscountCodeInfo with checking for non-null required values
     * @return DiscountCodeInfo
     */
    public DiscountCodeInfo build() {
        Objects.requireNonNull(discountCode, DiscountCodeInfo.class + ": discountCode is missing");
        return new DiscountCodeInfoImpl(discountCode, state);
    }
    
    /**
     * builds DiscountCodeInfo without checking for non-null required values
     * @return DiscountCodeInfo
     */
    public DiscountCodeInfo buildUnchecked() {
        return new DiscountCodeInfoImpl(discountCode, state);
    }

    /**
     * factory method for an instance of DiscountCodeInfoBuilder
     * @return builder 
     */
    public static DiscountCodeInfoBuilder of() {
        return new DiscountCodeInfoBuilder();
    }

    /**
     * create builder for DiscountCodeInfo instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeInfoBuilder of(final DiscountCodeInfo template) {
        DiscountCodeInfoBuilder builder = new DiscountCodeInfoBuilder();
        builder.discountCode = template.getDiscountCode();
        builder.state = template.getState();
        return builder;
    }

}
