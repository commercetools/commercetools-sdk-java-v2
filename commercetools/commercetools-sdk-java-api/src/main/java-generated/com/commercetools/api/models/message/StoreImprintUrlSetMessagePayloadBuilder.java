
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreImprintUrlSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreImprintUrlSetMessagePayload storeImprintUrlSetMessagePayload = StoreImprintUrlSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreImprintUrlSetMessagePayloadBuilder implements Builder<StoreImprintUrlSetMessagePayload> {

    @Nullable
    private String imprintUrl;

    /**
     *  <p>The <code>imprintUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetImprintUrlAction" rel="nofollow">Set Imprint Url</a> update action.</p>
     * @param imprintUrl value to be set
     * @return Builder
     */

    public StoreImprintUrlSetMessagePayloadBuilder imprintUrl(@Nullable final String imprintUrl) {
        this.imprintUrl = imprintUrl;
        return this;
    }

    /**
     *  <p>The <code>imprintUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetImprintUrlAction" rel="nofollow">Set Imprint Url</a> update action.</p>
     * @return imprintUrl
     */

    @Nullable
    public String getImprintUrl() {
        return this.imprintUrl;
    }

    /**
     * builds StoreImprintUrlSetMessagePayload with checking for non-null required values
     * @return StoreImprintUrlSetMessagePayload
     */
    public StoreImprintUrlSetMessagePayload build() {
        return new StoreImprintUrlSetMessagePayloadImpl(imprintUrl);
    }

    /**
     * builds StoreImprintUrlSetMessagePayload without checking for non-null required values
     * @return StoreImprintUrlSetMessagePayload
     */
    public StoreImprintUrlSetMessagePayload buildUnchecked() {
        return new StoreImprintUrlSetMessagePayloadImpl(imprintUrl);
    }

    /**
     * factory method for an instance of StoreImprintUrlSetMessagePayloadBuilder
     * @return builder
     */
    public static StoreImprintUrlSetMessagePayloadBuilder of() {
        return new StoreImprintUrlSetMessagePayloadBuilder();
    }

    /**
     * create builder for StoreImprintUrlSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreImprintUrlSetMessagePayloadBuilder of(final StoreImprintUrlSetMessagePayload template) {
        StoreImprintUrlSetMessagePayloadBuilder builder = new StoreImprintUrlSetMessagePayloadBuilder();
        builder.imprintUrl = template.getImprintUrl();
        return builder;
    }

}
