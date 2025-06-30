
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountGroupCreatedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountGroupCreatedMessagePayload discountGroupCreatedMessagePayload = DiscountGroupCreatedMessagePayload.builder()
 *             .discountGroup(discountGroupBuilder -> discountGroupBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountGroupCreatedMessagePayloadBuilder implements Builder<DiscountGroupCreatedMessagePayload> {

    private com.commercetools.api.models.discount_group.DiscountGroup discountGroup;

    /**
     *  <p>The DiscountGroup that was created.</p>
     * @param builder function to build the discountGroup value
     * @return Builder
     */

    public DiscountGroupCreatedMessagePayloadBuilder discountGroup(
            Function<com.commercetools.api.models.discount_group.DiscountGroupBuilder, com.commercetools.api.models.discount_group.DiscountGroupBuilder> builder) {
        this.discountGroup = builder.apply(com.commercetools.api.models.discount_group.DiscountGroupBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The DiscountGroup that was created.</p>
     * @param builder function to build the discountGroup value
     * @return Builder
     */

    public DiscountGroupCreatedMessagePayloadBuilder withDiscountGroup(
            Function<com.commercetools.api.models.discount_group.DiscountGroupBuilder, com.commercetools.api.models.discount_group.DiscountGroup> builder) {
        this.discountGroup = builder.apply(com.commercetools.api.models.discount_group.DiscountGroupBuilder.of());
        return this;
    }

    /**
     *  <p>The DiscountGroup that was created.</p>
     * @param discountGroup value to be set
     * @return Builder
     */

    public DiscountGroupCreatedMessagePayloadBuilder discountGroup(
            final com.commercetools.api.models.discount_group.DiscountGroup discountGroup) {
        this.discountGroup = discountGroup;
        return this;
    }

    /**
     *  <p>The DiscountGroup that was created.</p>
     * @return discountGroup
     */

    public com.commercetools.api.models.discount_group.DiscountGroup getDiscountGroup() {
        return this.discountGroup;
    }

    /**
     * builds DiscountGroupCreatedMessagePayload with checking for non-null required values
     * @return DiscountGroupCreatedMessagePayload
     */
    public DiscountGroupCreatedMessagePayload build() {
        Objects.requireNonNull(discountGroup, DiscountGroupCreatedMessagePayload.class + ": discountGroup is missing");
        return new DiscountGroupCreatedMessagePayloadImpl(discountGroup);
    }

    /**
     * builds DiscountGroupCreatedMessagePayload without checking for non-null required values
     * @return DiscountGroupCreatedMessagePayload
     */
    public DiscountGroupCreatedMessagePayload buildUnchecked() {
        return new DiscountGroupCreatedMessagePayloadImpl(discountGroup);
    }

    /**
     * factory method for an instance of DiscountGroupCreatedMessagePayloadBuilder
     * @return builder
     */
    public static DiscountGroupCreatedMessagePayloadBuilder of() {
        return new DiscountGroupCreatedMessagePayloadBuilder();
    }

    /**
     * create builder for DiscountGroupCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountGroupCreatedMessagePayloadBuilder of(final DiscountGroupCreatedMessagePayload template) {
        DiscountGroupCreatedMessagePayloadBuilder builder = new DiscountGroupCreatedMessagePayloadBuilder();
        builder.discountGroup = template.getDiscountGroup();
        return builder;
    }

}
