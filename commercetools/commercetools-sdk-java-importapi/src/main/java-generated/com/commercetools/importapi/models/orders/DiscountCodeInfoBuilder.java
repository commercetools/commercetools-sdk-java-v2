
package com.commercetools.importapi.models.orders;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountCodeInfoBuilder implements Builder<DiscountCodeInfo> {

    private com.commercetools.importapi.models.common.DiscountCodeKeyReference discountCode;

    @Nullable
    private com.commercetools.importapi.models.orders.DiscountCodeState state;

    /**
     *  <p>References a discount code by key.</p>
     */

    public DiscountCodeInfoBuilder discountCode(
            Function<com.commercetools.importapi.models.common.DiscountCodeKeyReferenceBuilder, com.commercetools.importapi.models.common.DiscountCodeKeyReferenceBuilder> builder) {
        this.discountCode = builder
                .apply(com.commercetools.importapi.models.common.DiscountCodeKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>References a discount code by key.</p>
     */

    public DiscountCodeInfoBuilder discountCode(
            final com.commercetools.importapi.models.common.DiscountCodeKeyReference discountCode) {
        this.discountCode = discountCode;
        return this;
    }

    /**
     *  <p>Maps to <code>DiscountCodeInfo.state</code></p>
     */

    public DiscountCodeInfoBuilder state(
            @Nullable final com.commercetools.importapi.models.orders.DiscountCodeState state) {
        this.state = state;
        return this;
    }

    public com.commercetools.importapi.models.common.DiscountCodeKeyReference getDiscountCode() {
        return this.discountCode;
    }

    @Nullable
    public com.commercetools.importapi.models.orders.DiscountCodeState getState() {
        return this.state;
    }

    public DiscountCodeInfo build() {
        Objects.requireNonNull(discountCode, DiscountCodeInfo.class + ": discountCode is missing");
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
