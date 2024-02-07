
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeKeySetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeKeySetMessagePayload discountCodeKeySetMessagePayload = DiscountCodeKeySetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountCodeKeySetMessagePayloadBuilder implements Builder<DiscountCodeKeySetMessagePayload> {

    @Nullable
    private String key;

    @Nullable
    private String oldKey;

    /**
     *  <p><code>key</code> value of the Discount Code after the Set Key update action.</p>
     * @param key value to be set
     * @return Builder
     */

    public DiscountCodeKeySetMessagePayloadBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p><code>key</code> value of the Discount Code before the Set Key update action.</p>
     * @param oldKey value to be set
     * @return Builder
     */

    public DiscountCodeKeySetMessagePayloadBuilder oldKey(@Nullable final String oldKey) {
        this.oldKey = oldKey;
        return this;
    }

    /**
     *  <p><code>key</code> value of the Discount Code after the Set Key update action.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p><code>key</code> value of the Discount Code before the Set Key update action.</p>
     * @return oldKey
     */

    @Nullable
    public String getOldKey() {
        return this.oldKey;
    }

    /**
     * builds DiscountCodeKeySetMessagePayload with checking for non-null required values
     * @return DiscountCodeKeySetMessagePayload
     */
    public DiscountCodeKeySetMessagePayload build() {
        return new DiscountCodeKeySetMessagePayloadImpl(key, oldKey);
    }

    /**
     * builds DiscountCodeKeySetMessagePayload without checking for non-null required values
     * @return DiscountCodeKeySetMessagePayload
     */
    public DiscountCodeKeySetMessagePayload buildUnchecked() {
        return new DiscountCodeKeySetMessagePayloadImpl(key, oldKey);
    }

    /**
     * factory method for an instance of DiscountCodeKeySetMessagePayloadBuilder
     * @return builder
     */
    public static DiscountCodeKeySetMessagePayloadBuilder of() {
        return new DiscountCodeKeySetMessagePayloadBuilder();
    }

    /**
     * create builder for DiscountCodeKeySetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeKeySetMessagePayloadBuilder of(final DiscountCodeKeySetMessagePayload template) {
        DiscountCodeKeySetMessagePayloadBuilder builder = new DiscountCodeKeySetMessagePayloadBuilder();
        builder.key = template.getKey();
        builder.oldKey = template.getOldKey();
        return builder;
    }

}
