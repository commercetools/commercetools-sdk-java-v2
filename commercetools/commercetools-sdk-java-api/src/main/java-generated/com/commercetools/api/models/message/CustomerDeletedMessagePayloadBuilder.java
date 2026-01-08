
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerDeletedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerDeletedMessagePayload customerDeletedMessagePayload = CustomerDeletedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerDeletedMessagePayloadBuilder implements Builder<CustomerDeletedMessagePayload> {

    @Nullable
    private String email;

    /**
     *  <p>The email address of the Customer that was deleted.</p>
     * @param email value to be set
     * @return Builder
     */

    public CustomerDeletedMessagePayloadBuilder email(@Nullable final String email) {
        this.email = email;
        return this;
    }

    /**
     *  <p>The email address of the Customer that was deleted.</p>
     * @return email
     */

    @Nullable
    public String getEmail() {
        return this.email;
    }

    /**
     * builds CustomerDeletedMessagePayload with checking for non-null required values
     * @return CustomerDeletedMessagePayload
     */
    public CustomerDeletedMessagePayload build() {
        return new CustomerDeletedMessagePayloadImpl(email);
    }

    /**
     * builds CustomerDeletedMessagePayload without checking for non-null required values
     * @return CustomerDeletedMessagePayload
     */
    public CustomerDeletedMessagePayload buildUnchecked() {
        return new CustomerDeletedMessagePayloadImpl(email);
    }

    /**
     * factory method for an instance of CustomerDeletedMessagePayloadBuilder
     * @return builder
     */
    public static CustomerDeletedMessagePayloadBuilder of() {
        return new CustomerDeletedMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerDeletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerDeletedMessagePayloadBuilder of(final CustomerDeletedMessagePayload template) {
        CustomerDeletedMessagePayloadBuilder builder = new CustomerDeletedMessagePayloadBuilder();
        builder.email = template.getEmail();
        return builder;
    }

}
