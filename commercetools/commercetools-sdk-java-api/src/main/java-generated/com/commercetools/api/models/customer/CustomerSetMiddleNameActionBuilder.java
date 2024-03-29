
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerSetMiddleNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetMiddleNameAction customerSetMiddleNameAction = CustomerSetMiddleNameAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerSetMiddleNameActionBuilder implements Builder<CustomerSetMiddleNameAction> {

    @Nullable
    private String middleName;

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param middleName value to be set
     * @return Builder
     */

    public CustomerSetMiddleNameActionBuilder middleName(@Nullable final String middleName) {
        this.middleName = middleName;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return middleName
     */

    @Nullable
    public String getMiddleName() {
        return this.middleName;
    }

    /**
     * builds CustomerSetMiddleNameAction with checking for non-null required values
     * @return CustomerSetMiddleNameAction
     */
    public CustomerSetMiddleNameAction build() {
        return new CustomerSetMiddleNameActionImpl(middleName);
    }

    /**
     * builds CustomerSetMiddleNameAction without checking for non-null required values
     * @return CustomerSetMiddleNameAction
     */
    public CustomerSetMiddleNameAction buildUnchecked() {
        return new CustomerSetMiddleNameActionImpl(middleName);
    }

    /**
     * factory method for an instance of CustomerSetMiddleNameActionBuilder
     * @return builder
     */
    public static CustomerSetMiddleNameActionBuilder of() {
        return new CustomerSetMiddleNameActionBuilder();
    }

    /**
     * create builder for CustomerSetMiddleNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSetMiddleNameActionBuilder of(final CustomerSetMiddleNameAction template) {
        CustomerSetMiddleNameActionBuilder builder = new CustomerSetMiddleNameActionBuilder();
        builder.middleName = template.getMiddleName();
        return builder;
    }

}
