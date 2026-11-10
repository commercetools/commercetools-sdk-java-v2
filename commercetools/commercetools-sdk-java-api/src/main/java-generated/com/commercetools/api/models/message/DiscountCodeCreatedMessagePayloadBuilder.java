
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeCreatedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeCreatedMessagePayload discountCodeCreatedMessagePayload = DiscountCodeCreatedMessagePayload.builder()
 *             .discountCode(discountCodeBuilder -> discountCodeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountCodeCreatedMessagePayloadBuilder implements Builder<DiscountCodeCreatedMessagePayload> {

    private com.commercetools.api.models.discount_code.DiscountCode discountCode;

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">Discount Code</a> that was created.</p>
     * @param builder function to build the discountCode value
     * @return Builder
     */

    public DiscountCodeCreatedMessagePayloadBuilder discountCode(
            Function<com.commercetools.api.models.discount_code.DiscountCodeBuilder, com.commercetools.api.models.discount_code.DiscountCodeBuilder> builder) {
        this.discountCode = builder.apply(com.commercetools.api.models.discount_code.DiscountCodeBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">Discount Code</a> that was created.</p>
     * @param builder function to build the discountCode value
     * @return Builder
     */

    public DiscountCodeCreatedMessagePayloadBuilder withDiscountCode(
            Function<com.commercetools.api.models.discount_code.DiscountCodeBuilder, com.commercetools.api.models.discount_code.DiscountCode> builder) {
        this.discountCode = builder.apply(com.commercetools.api.models.discount_code.DiscountCodeBuilder.of());
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">Discount Code</a> that was created.</p>
     * @param discountCode value to be set
     * @return Builder
     */

    public DiscountCodeCreatedMessagePayloadBuilder discountCode(
            final com.commercetools.api.models.discount_code.DiscountCode discountCode) {
        this.discountCode = discountCode;
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">Discount Code</a> that was created.</p>
     * @return discountCode
     */

    public com.commercetools.api.models.discount_code.DiscountCode getDiscountCode() {
        return this.discountCode;
    }

    /**
     * builds DiscountCodeCreatedMessagePayload with checking for non-null required values
     * @return DiscountCodeCreatedMessagePayload
     */
    public DiscountCodeCreatedMessagePayload build() {
        Objects.requireNonNull(discountCode, DiscountCodeCreatedMessagePayload.class + ": discountCode is missing");
        return new DiscountCodeCreatedMessagePayloadImpl(discountCode);
    }

    /**
     * builds DiscountCodeCreatedMessagePayload without checking for non-null required values
     * @return DiscountCodeCreatedMessagePayload
     */
    public DiscountCodeCreatedMessagePayload buildUnchecked() {
        return new DiscountCodeCreatedMessagePayloadImpl(discountCode);
    }

    /**
     * factory method for an instance of DiscountCodeCreatedMessagePayloadBuilder
     * @return builder
     */
    public static DiscountCodeCreatedMessagePayloadBuilder of() {
        return new DiscountCodeCreatedMessagePayloadBuilder();
    }

    /**
     * create builder for DiscountCodeCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeCreatedMessagePayloadBuilder of(final DiscountCodeCreatedMessagePayload template) {
        DiscountCodeCreatedMessagePayloadBuilder builder = new DiscountCodeCreatedMessagePayloadBuilder();
        builder.discountCode = template.getDiscountCode();
        return builder;
    }

}
