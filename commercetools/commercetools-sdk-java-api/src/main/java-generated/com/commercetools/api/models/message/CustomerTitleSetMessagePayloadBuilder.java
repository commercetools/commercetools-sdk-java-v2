
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerTitleSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerTitleSetMessagePayload customerTitleSetMessagePayload = CustomerTitleSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerTitleSetMessagePayloadBuilder implements Builder<CustomerTitleSetMessagePayload> {

    @Nullable
    private String title;

    /**
     *  <p>The <code>title</code> that was set during the Set Title update action.</p>
     * @param title value to be set
     * @return Builder
     */

    public CustomerTitleSetMessagePayloadBuilder title(@Nullable final String title) {
        this.title = title;
        return this;
    }

    /**
     *  <p>The <code>title</code> that was set during the Set Title update action.</p>
     * @return title
     */

    @Nullable
    public String getTitle() {
        return this.title;
    }

    /**
     * builds CustomerTitleSetMessagePayload with checking for non-null required values
     * @return CustomerTitleSetMessagePayload
     */
    public CustomerTitleSetMessagePayload build() {
        return new CustomerTitleSetMessagePayloadImpl(title);
    }

    /**
     * builds CustomerTitleSetMessagePayload without checking for non-null required values
     * @return CustomerTitleSetMessagePayload
     */
    public CustomerTitleSetMessagePayload buildUnchecked() {
        return new CustomerTitleSetMessagePayloadImpl(title);
    }

    /**
     * factory method for an instance of CustomerTitleSetMessagePayloadBuilder
     * @return builder
     */
    public static CustomerTitleSetMessagePayloadBuilder of() {
        return new CustomerTitleSetMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerTitleSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerTitleSetMessagePayloadBuilder of(final CustomerTitleSetMessagePayload template) {
        CustomerTitleSetMessagePayloadBuilder builder = new CustomerTitleSetMessagePayloadBuilder();
        builder.title = template.getTitle();
        return builder;
    }

}
