package com.commercetools.history.models.common;

import com.commercetools.history.models.common.DiscountCodeState;
import com.commercetools.history.models.common.Reference;
import com.commercetools.history.models.common.DiscountCodeInfo;
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
 *             .state(DiscountCodeState.NOT_ACTIVE)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class DiscountCodeInfoBuilder implements Builder<DiscountCodeInfo> {

    
    
    private com.commercetools.history.models.common.Reference discountCode;
    
    
    
    private com.commercetools.history.models.common.DiscountCodeState state;

    
    /**
     * set the value to the discountCode using the builder function
     * @param builder function to build the discountCode value
     * @return Builder
     */
    
    public DiscountCodeInfoBuilder discountCode(Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.discountCode = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the discountCode using the builder function
     * @param builder function to build the discountCode value
     * @return Builder
     */
    
    public DiscountCodeInfoBuilder withDiscountCode(Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.Reference> builder) {
        this.discountCode = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the discountCode
     * @param discountCode value to be set
     * @return Builder
     */
    
    public DiscountCodeInfoBuilder discountCode( final com.commercetools.history.models.common.Reference discountCode) {
        this.discountCode = discountCode;
        return this;
    }
    
    
    
    
    /**
     * set the value to the state
     * @param state value to be set
     * @return Builder
     */
    
    public DiscountCodeInfoBuilder state( final com.commercetools.history.models.common.DiscountCodeState state) {
        this.state = state;
        return this;
    }
    
    

    /**
     * value of discountCode}
     * @return discountCode
     */
    
    
    public com.commercetools.history.models.common.Reference getDiscountCode(){
        return this.discountCode;
    }
    
    /**
     * value of state}
     * @return state
     */
    
    
    public com.commercetools.history.models.common.DiscountCodeState getState(){
        return this.state;
    }

    /**
     * builds DiscountCodeInfo with checking for non-null required values
     * @return DiscountCodeInfo
     */
    public DiscountCodeInfo build() {
        Objects.requireNonNull(discountCode, DiscountCodeInfo.class + ": discountCode is missing");
        Objects.requireNonNull(state, DiscountCodeInfo.class + ": state is missing");
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
