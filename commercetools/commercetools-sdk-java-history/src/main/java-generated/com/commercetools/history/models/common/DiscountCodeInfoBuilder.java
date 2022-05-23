
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   DiscountCodeInfo discountCodeInfo = DiscountCodeInfo.builder()
           .discountCode(discountCodeBuilder -> discountCodeBuilder)
           .state(DiscountCodeState.NOT_ACTIVE)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountCodeInfoBuilder implements Builder<DiscountCodeInfo> {

    private com.commercetools.history.models.common.Reference discountCode;

    private com.commercetools.history.models.common.DiscountCodeState state;

    public DiscountCodeInfoBuilder discountCode(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.discountCode = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    public DiscountCodeInfoBuilder discountCode(final com.commercetools.history.models.common.Reference discountCode) {
        this.discountCode = discountCode;
        return this;
    }

    public DiscountCodeInfoBuilder state(final com.commercetools.history.models.common.DiscountCodeState state) {
        this.state = state;
        return this;
    }

    public com.commercetools.history.models.common.Reference getDiscountCode() {
        return this.discountCode;
    }

    public com.commercetools.history.models.common.DiscountCodeState getState() {
        return this.state;
    }

    public DiscountCodeInfo build() {
        Objects.requireNonNull(discountCode, DiscountCodeInfo.class + ": discountCode is missing");
        Objects.requireNonNull(state, DiscountCodeInfo.class + ": state is missing");
        return new DiscountCodeInfoImpl(discountCode, state);
    }

    /**
     * builds DiscountCodeInfo without checking for non null required values
     */
    public DiscountCodeInfo buildUnchecked() {
        return new DiscountCodeInfoImpl(discountCode, state);
    }

    public static DiscountCodeInfoBuilder of() {
        return new DiscountCodeInfoBuilder();
    }

    public static DiscountCodeInfoBuilder of(final DiscountCodeInfo template) {
        DiscountCodeInfoBuilder builder = new DiscountCodeInfoBuilder();
        builder.discountCode = template.getDiscountCode();
        builder.state = template.getState();
        return builder;
    }

}
