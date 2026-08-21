
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreRefundPolicyUrlSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreRefundPolicyUrlSetMessagePayload storeRefundPolicyUrlSetMessagePayload = StoreRefundPolicyUrlSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreRefundPolicyUrlSetMessagePayloadBuilder implements Builder<StoreRefundPolicyUrlSetMessagePayload> {

    @Nullable
    private String refundPolicyUrl;

    /**
     *  <p>The <code>refundPolicyUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetRefundPolicyUrlAction" rel="nofollow">Set Refund Policy Url</a> update action.</p>
     * @param refundPolicyUrl value to be set
     * @return Builder
     */

    public StoreRefundPolicyUrlSetMessagePayloadBuilder refundPolicyUrl(@Nullable final String refundPolicyUrl) {
        this.refundPolicyUrl = refundPolicyUrl;
        return this;
    }

    /**
     *  <p>The <code>refundPolicyUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetRefundPolicyUrlAction" rel="nofollow">Set Refund Policy Url</a> update action.</p>
     * @return refundPolicyUrl
     */

    @Nullable
    public String getRefundPolicyUrl() {
        return this.refundPolicyUrl;
    }

    /**
     * builds StoreRefundPolicyUrlSetMessagePayload with checking for non-null required values
     * @return StoreRefundPolicyUrlSetMessagePayload
     */
    public StoreRefundPolicyUrlSetMessagePayload build() {
        return new StoreRefundPolicyUrlSetMessagePayloadImpl(refundPolicyUrl);
    }

    /**
     * builds StoreRefundPolicyUrlSetMessagePayload without checking for non-null required values
     * @return StoreRefundPolicyUrlSetMessagePayload
     */
    public StoreRefundPolicyUrlSetMessagePayload buildUnchecked() {
        return new StoreRefundPolicyUrlSetMessagePayloadImpl(refundPolicyUrl);
    }

    /**
     * factory method for an instance of StoreRefundPolicyUrlSetMessagePayloadBuilder
     * @return builder
     */
    public static StoreRefundPolicyUrlSetMessagePayloadBuilder of() {
        return new StoreRefundPolicyUrlSetMessagePayloadBuilder();
    }

    /**
     * create builder for StoreRefundPolicyUrlSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreRefundPolicyUrlSetMessagePayloadBuilder of(
            final StoreRefundPolicyUrlSetMessagePayload template) {
        StoreRefundPolicyUrlSetMessagePayloadBuilder builder = new StoreRefundPolicyUrlSetMessagePayloadBuilder();
        builder.refundPolicyUrl = template.getRefundPolicyUrl();
        return builder;
    }

}
