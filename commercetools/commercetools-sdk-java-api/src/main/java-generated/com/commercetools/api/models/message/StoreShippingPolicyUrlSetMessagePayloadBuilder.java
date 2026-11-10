
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreShippingPolicyUrlSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreShippingPolicyUrlSetMessagePayload storeShippingPolicyUrlSetMessagePayload = StoreShippingPolicyUrlSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreShippingPolicyUrlSetMessagePayloadBuilder
        implements Builder<StoreShippingPolicyUrlSetMessagePayload> {

    @Nullable
    private String shippingPolicyUrl;

    /**
     *  <p>The <code>shippingPolicyUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetShippingPolicyUrlAction" rel="nofollow">Set Shipping Policy Url</a> update action.</p>
     * @param shippingPolicyUrl value to be set
     * @return Builder
     */

    public StoreShippingPolicyUrlSetMessagePayloadBuilder shippingPolicyUrl(@Nullable final String shippingPolicyUrl) {
        this.shippingPolicyUrl = shippingPolicyUrl;
        return this;
    }

    /**
     *  <p>The <code>shippingPolicyUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetShippingPolicyUrlAction" rel="nofollow">Set Shipping Policy Url</a> update action.</p>
     * @return shippingPolicyUrl
     */

    @Nullable
    public String getShippingPolicyUrl() {
        return this.shippingPolicyUrl;
    }

    /**
     * builds StoreShippingPolicyUrlSetMessagePayload with checking for non-null required values
     * @return StoreShippingPolicyUrlSetMessagePayload
     */
    public StoreShippingPolicyUrlSetMessagePayload build() {
        return new StoreShippingPolicyUrlSetMessagePayloadImpl(shippingPolicyUrl);
    }

    /**
     * builds StoreShippingPolicyUrlSetMessagePayload without checking for non-null required values
     * @return StoreShippingPolicyUrlSetMessagePayload
     */
    public StoreShippingPolicyUrlSetMessagePayload buildUnchecked() {
        return new StoreShippingPolicyUrlSetMessagePayloadImpl(shippingPolicyUrl);
    }

    /**
     * factory method for an instance of StoreShippingPolicyUrlSetMessagePayloadBuilder
     * @return builder
     */
    public static StoreShippingPolicyUrlSetMessagePayloadBuilder of() {
        return new StoreShippingPolicyUrlSetMessagePayloadBuilder();
    }

    /**
     * create builder for StoreShippingPolicyUrlSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreShippingPolicyUrlSetMessagePayloadBuilder of(
            final StoreShippingPolicyUrlSetMessagePayload template) {
        StoreShippingPolicyUrlSetMessagePayloadBuilder builder = new StoreShippingPolicyUrlSetMessagePayloadBuilder();
        builder.shippingPolicyUrl = template.getShippingPolicyUrl();
        return builder;
    }

}
