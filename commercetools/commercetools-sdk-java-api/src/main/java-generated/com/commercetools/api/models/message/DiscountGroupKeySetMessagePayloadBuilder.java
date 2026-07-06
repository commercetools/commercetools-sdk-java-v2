
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountGroupKeySetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountGroupKeySetMessagePayload discountGroupKeySetMessagePayload = DiscountGroupKeySetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountGroupKeySetMessagePayloadBuilder implements Builder<DiscountGroupKeySetMessagePayload> {

    @Nullable
    private String key;

    @Nullable
    private String oldKey;

    /**
     *  <p><code>key</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroup" rel="nofollow">DiscountGroup</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroupSetKeyAction" rel="nofollow">Set Key</a> update action.</p>
     * @param key value to be set
     * @return Builder
     */

    public DiscountGroupKeySetMessagePayloadBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p><code>key</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroup" rel="nofollow">DiscountGroup</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroupSetKeyAction" rel="nofollow">Set Key</a> update action.</p>
     * @param oldKey value to be set
     * @return Builder
     */

    public DiscountGroupKeySetMessagePayloadBuilder oldKey(@Nullable final String oldKey) {
        this.oldKey = oldKey;
        return this;
    }

    /**
     *  <p><code>key</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroup" rel="nofollow">DiscountGroup</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroupSetKeyAction" rel="nofollow">Set Key</a> update action.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p><code>key</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroup" rel="nofollow">DiscountGroup</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroupSetKeyAction" rel="nofollow">Set Key</a> update action.</p>
     * @return oldKey
     */

    @Nullable
    public String getOldKey() {
        return this.oldKey;
    }

    /**
     * builds DiscountGroupKeySetMessagePayload with checking for non-null required values
     * @return DiscountGroupKeySetMessagePayload
     */
    public DiscountGroupKeySetMessagePayload build() {
        return new DiscountGroupKeySetMessagePayloadImpl(key, oldKey);
    }

    /**
     * builds DiscountGroupKeySetMessagePayload without checking for non-null required values
     * @return DiscountGroupKeySetMessagePayload
     */
    public DiscountGroupKeySetMessagePayload buildUnchecked() {
        return new DiscountGroupKeySetMessagePayloadImpl(key, oldKey);
    }

    /**
     * factory method for an instance of DiscountGroupKeySetMessagePayloadBuilder
     * @return builder
     */
    public static DiscountGroupKeySetMessagePayloadBuilder of() {
        return new DiscountGroupKeySetMessagePayloadBuilder();
    }

    /**
     * create builder for DiscountGroupKeySetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountGroupKeySetMessagePayloadBuilder of(final DiscountGroupKeySetMessagePayload template) {
        DiscountGroupKeySetMessagePayloadBuilder builder = new DiscountGroupKeySetMessagePayloadBuilder();
        builder.key = template.getKey();
        builder.oldKey = template.getOldKey();
        return builder;
    }

}
