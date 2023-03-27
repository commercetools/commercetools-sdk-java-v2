
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderCustomerEmailSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCustomerEmailSetMessagePayload orderCustomerEmailSetMessagePayload = OrderCustomerEmailSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderCustomerEmailSetMessagePayloadBuilder implements Builder<OrderCustomerEmailSetMessagePayload> {

    @Nullable
    private String email;

    @Nullable
    private String oldEmail;

    /**
     *  <p>Email address on the Order after the Set Customer Email update action.</p>
     * @param email value to be set
     * @return Builder
     */

    public OrderCustomerEmailSetMessagePayloadBuilder email(@Nullable final String email) {
        this.email = email;
        return this;
    }

    /**
     *  <p>Email address on the Order before the Set Customer Email update action.</p>
     * @param oldEmail value to be set
     * @return Builder
     */

    public OrderCustomerEmailSetMessagePayloadBuilder oldEmail(@Nullable final String oldEmail) {
        this.oldEmail = oldEmail;
        return this;
    }

    /**
     *  <p>Email address on the Order after the Set Customer Email update action.</p>
     * @return email
     */

    @Nullable
    public String getEmail() {
        return this.email;
    }

    /**
     *  <p>Email address on the Order before the Set Customer Email update action.</p>
     * @return oldEmail
     */

    @Nullable
    public String getOldEmail() {
        return this.oldEmail;
    }

    /**
     * builds OrderCustomerEmailSetMessagePayload with checking for non-null required values
     * @return OrderCustomerEmailSetMessagePayload
     */
    public OrderCustomerEmailSetMessagePayload build() {
        return new OrderCustomerEmailSetMessagePayloadImpl(email, oldEmail);
    }

    /**
     * builds OrderCustomerEmailSetMessagePayload without checking for non-null required values
     * @return OrderCustomerEmailSetMessagePayload
     */
    public OrderCustomerEmailSetMessagePayload buildUnchecked() {
        return new OrderCustomerEmailSetMessagePayloadImpl(email, oldEmail);
    }

    /**
     * factory method for an instance of OrderCustomerEmailSetMessagePayloadBuilder
     * @return builder
     */
    public static OrderCustomerEmailSetMessagePayloadBuilder of() {
        return new OrderCustomerEmailSetMessagePayloadBuilder();
    }

    /**
     * create builder for OrderCustomerEmailSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCustomerEmailSetMessagePayloadBuilder of(final OrderCustomerEmailSetMessagePayload template) {
        OrderCustomerEmailSetMessagePayloadBuilder builder = new OrderCustomerEmailSetMessagePayloadBuilder();
        builder.email = template.getEmail();
        builder.oldEmail = template.getOldEmail();
        return builder;
    }

}
