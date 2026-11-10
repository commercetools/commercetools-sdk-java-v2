
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreFaqUrlSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreFaqUrlSetMessagePayload storeFaqUrlSetMessagePayload = StoreFaqUrlSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreFaqUrlSetMessagePayloadBuilder implements Builder<StoreFaqUrlSetMessagePayload> {

    @Nullable
    private String faqUrl;

    /**
     *  <p>The <code>faqUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetFaqUrlAction" rel="nofollow">Set Faq Url</a> update action.</p>
     * @param faqUrl value to be set
     * @return Builder
     */

    public StoreFaqUrlSetMessagePayloadBuilder faqUrl(@Nullable final String faqUrl) {
        this.faqUrl = faqUrl;
        return this;
    }

    /**
     *  <p>The <code>faqUrl</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetFaqUrlAction" rel="nofollow">Set Faq Url</a> update action.</p>
     * @return faqUrl
     */

    @Nullable
    public String getFaqUrl() {
        return this.faqUrl;
    }

    /**
     * builds StoreFaqUrlSetMessagePayload with checking for non-null required values
     * @return StoreFaqUrlSetMessagePayload
     */
    public StoreFaqUrlSetMessagePayload build() {
        return new StoreFaqUrlSetMessagePayloadImpl(faqUrl);
    }

    /**
     * builds StoreFaqUrlSetMessagePayload without checking for non-null required values
     * @return StoreFaqUrlSetMessagePayload
     */
    public StoreFaqUrlSetMessagePayload buildUnchecked() {
        return new StoreFaqUrlSetMessagePayloadImpl(faqUrl);
    }

    /**
     * factory method for an instance of StoreFaqUrlSetMessagePayloadBuilder
     * @return builder
     */
    public static StoreFaqUrlSetMessagePayloadBuilder of() {
        return new StoreFaqUrlSetMessagePayloadBuilder();
    }

    /**
     * create builder for StoreFaqUrlSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreFaqUrlSetMessagePayloadBuilder of(final StoreFaqUrlSetMessagePayload template) {
        StoreFaqUrlSetMessagePayloadBuilder builder = new StoreFaqUrlSetMessagePayloadBuilder();
        builder.faqUrl = template.getFaqUrl();
        return builder;
    }

}
