
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerEmailChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerEmailChangedMessagePayload customerEmailChangedMessagePayload = CustomerEmailChangedMessagePayload.builder()
 *             .email("{email}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerEmailChangedMessagePayloadBuilder implements Builder<CustomerEmailChangedMessagePayload> {

    private String email;

    /**
     *  <p>The <code>email</code> that was set during the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerChangeEmailAction" rel="nofollow">Change Email</a> update action.</p>
     * @param email value to be set
     * @return Builder
     */

    public CustomerEmailChangedMessagePayloadBuilder email(final String email) {
        this.email = email;
        return this;
    }

    /**
     *  <p>The <code>email</code> that was set during the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerChangeEmailAction" rel="nofollow">Change Email</a> update action.</p>
     * @return email
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * builds CustomerEmailChangedMessagePayload with checking for non-null required values
     * @return CustomerEmailChangedMessagePayload
     */
    public CustomerEmailChangedMessagePayload build() {
        Objects.requireNonNull(email, CustomerEmailChangedMessagePayload.class + ": email is missing");
        return new CustomerEmailChangedMessagePayloadImpl(email);
    }

    /**
     * builds CustomerEmailChangedMessagePayload without checking for non-null required values
     * @return CustomerEmailChangedMessagePayload
     */
    public CustomerEmailChangedMessagePayload buildUnchecked() {
        return new CustomerEmailChangedMessagePayloadImpl(email);
    }

    /**
     * factory method for an instance of CustomerEmailChangedMessagePayloadBuilder
     * @return builder
     */
    public static CustomerEmailChangedMessagePayloadBuilder of() {
        return new CustomerEmailChangedMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerEmailChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerEmailChangedMessagePayloadBuilder of(final CustomerEmailChangedMessagePayload template) {
        CustomerEmailChangedMessagePayloadBuilder builder = new CustomerEmailChangedMessagePayloadBuilder();
        builder.email = template.getEmail();
        return builder;
    }

}
