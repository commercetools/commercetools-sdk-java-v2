
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreTermsOfServiceUrlSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreTermsOfServiceUrlSetMessagePayload storeTermsOfServiceUrlSetMessagePayload = StoreTermsOfServiceUrlSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreTermsOfServiceUrlSetMessagePayloadBuilder
        implements Builder<StoreTermsOfServiceUrlSetMessagePayload> {

    @Nullable
    private String termsOfServiceUrl;

    /**
     *  <p>The <code>termsOfServiceUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetTermsOfServiceUrlAction" rel="nofollow">Set Terms Of Service Url</a> update action.</p>
     * @param termsOfServiceUrl value to be set
     * @return Builder
     */

    public StoreTermsOfServiceUrlSetMessagePayloadBuilder termsOfServiceUrl(@Nullable final String termsOfServiceUrl) {
        this.termsOfServiceUrl = termsOfServiceUrl;
        return this;
    }

    /**
     *  <p>The <code>termsOfServiceUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetTermsOfServiceUrlAction" rel="nofollow">Set Terms Of Service Url</a> update action.</p>
     * @return termsOfServiceUrl
     */

    @Nullable
    public String getTermsOfServiceUrl() {
        return this.termsOfServiceUrl;
    }

    /**
     * builds StoreTermsOfServiceUrlSetMessagePayload with checking for non-null required values
     * @return StoreTermsOfServiceUrlSetMessagePayload
     */
    public StoreTermsOfServiceUrlSetMessagePayload build() {
        return new StoreTermsOfServiceUrlSetMessagePayloadImpl(termsOfServiceUrl);
    }

    /**
     * builds StoreTermsOfServiceUrlSetMessagePayload without checking for non-null required values
     * @return StoreTermsOfServiceUrlSetMessagePayload
     */
    public StoreTermsOfServiceUrlSetMessagePayload buildUnchecked() {
        return new StoreTermsOfServiceUrlSetMessagePayloadImpl(termsOfServiceUrl);
    }

    /**
     * factory method for an instance of StoreTermsOfServiceUrlSetMessagePayloadBuilder
     * @return builder
     */
    public static StoreTermsOfServiceUrlSetMessagePayloadBuilder of() {
        return new StoreTermsOfServiceUrlSetMessagePayloadBuilder();
    }

    /**
     * create builder for StoreTermsOfServiceUrlSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreTermsOfServiceUrlSetMessagePayloadBuilder of(
            final StoreTermsOfServiceUrlSetMessagePayload template) {
        StoreTermsOfServiceUrlSetMessagePayloadBuilder builder = new StoreTermsOfServiceUrlSetMessagePayloadBuilder();
        builder.termsOfServiceUrl = template.getTermsOfServiceUrl();
        return builder;
    }

}
