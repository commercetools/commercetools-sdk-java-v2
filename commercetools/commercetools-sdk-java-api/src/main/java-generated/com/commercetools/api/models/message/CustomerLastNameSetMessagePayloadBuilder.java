
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerLastNameSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerLastNameSetMessagePayload customerLastNameSetMessagePayload = CustomerLastNameSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerLastNameSetMessagePayloadBuilder implements Builder<CustomerLastNameSetMessagePayload> {

    @Nullable
    private String lastName;

    /**
     *  <p>The <code>lastName</code> that was set during the Set Last Name update action.</p>
     * @param lastName value to be set
     * @return Builder
     */

    public CustomerLastNameSetMessagePayloadBuilder lastName(@Nullable final String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     *  <p>The <code>lastName</code> that was set during the Set Last Name update action.</p>
     * @return lastName
     */

    @Nullable
    public String getLastName() {
        return this.lastName;
    }

    /**
     * builds CustomerLastNameSetMessagePayload with checking for non-null required values
     * @return CustomerLastNameSetMessagePayload
     */
    public CustomerLastNameSetMessagePayload build() {
        return new CustomerLastNameSetMessagePayloadImpl(lastName);
    }

    /**
     * builds CustomerLastNameSetMessagePayload without checking for non-null required values
     * @return CustomerLastNameSetMessagePayload
     */
    public CustomerLastNameSetMessagePayload buildUnchecked() {
        return new CustomerLastNameSetMessagePayloadImpl(lastName);
    }

    /**
     * factory method for an instance of CustomerLastNameSetMessagePayloadBuilder
     * @return builder
     */
    public static CustomerLastNameSetMessagePayloadBuilder of() {
        return new CustomerLastNameSetMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerLastNameSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerLastNameSetMessagePayloadBuilder of(final CustomerLastNameSetMessagePayload template) {
        CustomerLastNameSetMessagePayloadBuilder builder = new CustomerLastNameSetMessagePayloadBuilder();
        builder.lastName = template.getLastName();
        return builder;
    }

}
