
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StorePrivacyPolicyUrlSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StorePrivacyPolicyUrlSetMessagePayload storePrivacyPolicyUrlSetMessagePayload = StorePrivacyPolicyUrlSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StorePrivacyPolicyUrlSetMessagePayloadBuilder implements Builder<StorePrivacyPolicyUrlSetMessagePayload> {

    @Nullable
    private String privacyPolicyUrl;

    /**
     *  <p>The <code>privacyPolicyUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetPrivacyPolicyUrlAction" rel="nofollow">Set Privacy Policy Url</a> update action.</p>
     * @param privacyPolicyUrl value to be set
     * @return Builder
     */

    public StorePrivacyPolicyUrlSetMessagePayloadBuilder privacyPolicyUrl(@Nullable final String privacyPolicyUrl) {
        this.privacyPolicyUrl = privacyPolicyUrl;
        return this;
    }

    /**
     *  <p>The <code>privacyPolicyUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetPrivacyPolicyUrlAction" rel="nofollow">Set Privacy Policy Url</a> update action.</p>
     * @return privacyPolicyUrl
     */

    @Nullable
    public String getPrivacyPolicyUrl() {
        return this.privacyPolicyUrl;
    }

    /**
     * builds StorePrivacyPolicyUrlSetMessagePayload with checking for non-null required values
     * @return StorePrivacyPolicyUrlSetMessagePayload
     */
    public StorePrivacyPolicyUrlSetMessagePayload build() {
        return new StorePrivacyPolicyUrlSetMessagePayloadImpl(privacyPolicyUrl);
    }

    /**
     * builds StorePrivacyPolicyUrlSetMessagePayload without checking for non-null required values
     * @return StorePrivacyPolicyUrlSetMessagePayload
     */
    public StorePrivacyPolicyUrlSetMessagePayload buildUnchecked() {
        return new StorePrivacyPolicyUrlSetMessagePayloadImpl(privacyPolicyUrl);
    }

    /**
     * factory method for an instance of StorePrivacyPolicyUrlSetMessagePayloadBuilder
     * @return builder
     */
    public static StorePrivacyPolicyUrlSetMessagePayloadBuilder of() {
        return new StorePrivacyPolicyUrlSetMessagePayloadBuilder();
    }

    /**
     * create builder for StorePrivacyPolicyUrlSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StorePrivacyPolicyUrlSetMessagePayloadBuilder of(
            final StorePrivacyPolicyUrlSetMessagePayload template) {
        StorePrivacyPolicyUrlSetMessagePayloadBuilder builder = new StorePrivacyPolicyUrlSetMessagePayloadBuilder();
        builder.privacyPolicyUrl = template.getPrivacyPolicyUrl();
        return builder;
    }

}
