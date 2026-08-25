
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreContactUrlSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreContactUrlSetMessagePayload storeContactUrlSetMessagePayload = StoreContactUrlSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreContactUrlSetMessagePayloadBuilder implements Builder<StoreContactUrlSetMessagePayload> {

    @Nullable
    private String contactUrl;

    /**
     *  <p>The <code>contactUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetContactUrlAction" rel="nofollow">Set Contact Url</a> update action.</p>
     * @param contactUrl value to be set
     * @return Builder
     */

    public StoreContactUrlSetMessagePayloadBuilder contactUrl(@Nullable final String contactUrl) {
        this.contactUrl = contactUrl;
        return this;
    }

    /**
     *  <p>The <code>contactUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetContactUrlAction" rel="nofollow">Set Contact Url</a> update action.</p>
     * @return contactUrl
     */

    @Nullable
    public String getContactUrl() {
        return this.contactUrl;
    }

    /**
     * builds StoreContactUrlSetMessagePayload with checking for non-null required values
     * @return StoreContactUrlSetMessagePayload
     */
    public StoreContactUrlSetMessagePayload build() {
        return new StoreContactUrlSetMessagePayloadImpl(contactUrl);
    }

    /**
     * builds StoreContactUrlSetMessagePayload without checking for non-null required values
     * @return StoreContactUrlSetMessagePayload
     */
    public StoreContactUrlSetMessagePayload buildUnchecked() {
        return new StoreContactUrlSetMessagePayloadImpl(contactUrl);
    }

    /**
     * factory method for an instance of StoreContactUrlSetMessagePayloadBuilder
     * @return builder
     */
    public static StoreContactUrlSetMessagePayloadBuilder of() {
        return new StoreContactUrlSetMessagePayloadBuilder();
    }

    /**
     * create builder for StoreContactUrlSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreContactUrlSetMessagePayloadBuilder of(final StoreContactUrlSetMessagePayload template) {
        StoreContactUrlSetMessagePayloadBuilder builder = new StoreContactUrlSetMessagePayloadBuilder();
        builder.contactUrl = template.getContactUrl();
        return builder;
    }

}
