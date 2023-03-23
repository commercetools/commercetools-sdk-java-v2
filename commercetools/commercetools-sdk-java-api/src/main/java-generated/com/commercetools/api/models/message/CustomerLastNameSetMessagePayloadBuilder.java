
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
     * @param lastName
     * @return Builder
     */

    public CustomerLastNameSetMessagePayloadBuilder lastName(@Nullable final String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Nullable
    public String getLastName() {
        return this.lastName;
    }

    public CustomerLastNameSetMessagePayload build() {
        return new CustomerLastNameSetMessagePayloadImpl(lastName);
    }

    /**
     * builds CustomerLastNameSetMessagePayload without checking for non null required values
     */
    public CustomerLastNameSetMessagePayload buildUnchecked() {
        return new CustomerLastNameSetMessagePayloadImpl(lastName);
    }

    public static CustomerLastNameSetMessagePayloadBuilder of() {
        return new CustomerLastNameSetMessagePayloadBuilder();
    }

    public static CustomerLastNameSetMessagePayloadBuilder of(final CustomerLastNameSetMessagePayload template) {
        CustomerLastNameSetMessagePayloadBuilder builder = new CustomerLastNameSetMessagePayloadBuilder();
        builder.lastName = template.getLastName();
        return builder;
    }

}
