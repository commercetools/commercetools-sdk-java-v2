
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
     *  <p>The <code>email</code> that was set during the Change Email update action.</p>
     */

    public CustomerEmailChangedMessagePayloadBuilder email(final String email) {
        this.email = email;
        return this;
    }

    public String getEmail() {
        return this.email;
    }

    public CustomerEmailChangedMessagePayload build() {
        Objects.requireNonNull(email, CustomerEmailChangedMessagePayload.class + ": email is missing");
        return new CustomerEmailChangedMessagePayloadImpl(email);
    }

    /**
     * builds CustomerEmailChangedMessagePayload without checking for non null required values
     */
    public CustomerEmailChangedMessagePayload buildUnchecked() {
        return new CustomerEmailChangedMessagePayloadImpl(email);
    }

    public static CustomerEmailChangedMessagePayloadBuilder of() {
        return new CustomerEmailChangedMessagePayloadBuilder();
    }

    public static CustomerEmailChangedMessagePayloadBuilder of(final CustomerEmailChangedMessagePayload template) {
        CustomerEmailChangedMessagePayloadBuilder builder = new CustomerEmailChangedMessagePayloadBuilder();
        builder.email = template.getEmail();
        return builder;
    }

}
