
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountGroupIsActiveSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountGroupIsActiveSetMessagePayload discountGroupIsActiveSetMessagePayload = DiscountGroupIsActiveSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountGroupIsActiveSetMessagePayloadBuilder implements Builder<DiscountGroupIsActiveSetMessagePayload> {

    @Nullable
    private Boolean isActive;

    @Nullable
    private Boolean oldIsActive;

    /**
     *  <p><code>isActive</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroup" rel="nofollow">DiscountGroup</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroupSetIsActiveAction" rel="nofollow">Set IsActive</a> update action.</p>
     * @param isActive value to be set
     * @return Builder
     */

    public DiscountGroupIsActiveSetMessagePayloadBuilder isActive(@Nullable final Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    /**
     *  <p><code>isActive</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroup" rel="nofollow">DiscountGroup</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroupSetIsActiveAction" rel="nofollow">Set IsActive</a> update action.</p>
     * @param oldIsActive value to be set
     * @return Builder
     */

    public DiscountGroupIsActiveSetMessagePayloadBuilder oldIsActive(@Nullable final Boolean oldIsActive) {
        this.oldIsActive = oldIsActive;
        return this;
    }

    /**
     *  <p><code>isActive</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroup" rel="nofollow">DiscountGroup</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroupSetIsActiveAction" rel="nofollow">Set IsActive</a> update action.</p>
     * @return isActive
     */

    @Nullable
    public Boolean getIsActive() {
        return this.isActive;
    }

    /**
     *  <p><code>isActive</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroup" rel="nofollow">DiscountGroup</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroupSetIsActiveAction" rel="nofollow">Set IsActive</a> update action.</p>
     * @return oldIsActive
     */

    @Nullable
    public Boolean getOldIsActive() {
        return this.oldIsActive;
    }

    /**
     * builds DiscountGroupIsActiveSetMessagePayload with checking for non-null required values
     * @return DiscountGroupIsActiveSetMessagePayload
     */
    public DiscountGroupIsActiveSetMessagePayload build() {
        return new DiscountGroupIsActiveSetMessagePayloadImpl(isActive, oldIsActive);
    }

    /**
     * builds DiscountGroupIsActiveSetMessagePayload without checking for non-null required values
     * @return DiscountGroupIsActiveSetMessagePayload
     */
    public DiscountGroupIsActiveSetMessagePayload buildUnchecked() {
        return new DiscountGroupIsActiveSetMessagePayloadImpl(isActive, oldIsActive);
    }

    /**
     * factory method for an instance of DiscountGroupIsActiveSetMessagePayloadBuilder
     * @return builder
     */
    public static DiscountGroupIsActiveSetMessagePayloadBuilder of() {
        return new DiscountGroupIsActiveSetMessagePayloadBuilder();
    }

    /**
     * create builder for DiscountGroupIsActiveSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountGroupIsActiveSetMessagePayloadBuilder of(
            final DiscountGroupIsActiveSetMessagePayload template) {
        DiscountGroupIsActiveSetMessagePayloadBuilder builder = new DiscountGroupIsActiveSetMessagePayloadBuilder();
        builder.isActive = template.getIsActive();
        builder.oldIsActive = template.getOldIsActive();
        return builder;
    }

}
