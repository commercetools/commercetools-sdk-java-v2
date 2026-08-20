
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreCookiePolicyUrlSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreCookiePolicyUrlSetMessagePayload storeCookiePolicyUrlSetMessagePayload = StoreCookiePolicyUrlSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreCookiePolicyUrlSetMessagePayloadBuilder implements Builder<StoreCookiePolicyUrlSetMessagePayload> {

    @Nullable
    private String cookiePolicyUrl;

    /**
     *  <p>The <code>cookiePolicyUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetCookiePolicyUrlAction" rel="nofollow">Set Cookie Policy Url</a> update action.</p>
     * @param cookiePolicyUrl value to be set
     * @return Builder
     */

    public StoreCookiePolicyUrlSetMessagePayloadBuilder cookiePolicyUrl(@Nullable final String cookiePolicyUrl) {
        this.cookiePolicyUrl = cookiePolicyUrl;
        return this;
    }

    /**
     *  <p>The <code>cookiePolicyUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetCookiePolicyUrlAction" rel="nofollow">Set Cookie Policy Url</a> update action.</p>
     * @return cookiePolicyUrl
     */

    @Nullable
    public String getCookiePolicyUrl() {
        return this.cookiePolicyUrl;
    }

    /**
     * builds StoreCookiePolicyUrlSetMessagePayload with checking for non-null required values
     * @return StoreCookiePolicyUrlSetMessagePayload
     */
    public StoreCookiePolicyUrlSetMessagePayload build() {
        return new StoreCookiePolicyUrlSetMessagePayloadImpl(cookiePolicyUrl);
    }

    /**
     * builds StoreCookiePolicyUrlSetMessagePayload without checking for non-null required values
     * @return StoreCookiePolicyUrlSetMessagePayload
     */
    public StoreCookiePolicyUrlSetMessagePayload buildUnchecked() {
        return new StoreCookiePolicyUrlSetMessagePayloadImpl(cookiePolicyUrl);
    }

    /**
     * factory method for an instance of StoreCookiePolicyUrlSetMessagePayloadBuilder
     * @return builder
     */
    public static StoreCookiePolicyUrlSetMessagePayloadBuilder of() {
        return new StoreCookiePolicyUrlSetMessagePayloadBuilder();
    }

    /**
     * create builder for StoreCookiePolicyUrlSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreCookiePolicyUrlSetMessagePayloadBuilder of(
            final StoreCookiePolicyUrlSetMessagePayload template) {
        StoreCookiePolicyUrlSetMessagePayloadBuilder builder = new StoreCookiePolicyUrlSetMessagePayloadBuilder();
        builder.cookiePolicyUrl = template.getCookiePolicyUrl();
        return builder;
    }

}
