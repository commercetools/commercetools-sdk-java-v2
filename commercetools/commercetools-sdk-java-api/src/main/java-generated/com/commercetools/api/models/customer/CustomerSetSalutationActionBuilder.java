
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerSetSalutationActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetSalutationAction customerSetSalutationAction = CustomerSetSalutationAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerSetSalutationActionBuilder implements Builder<CustomerSetSalutationAction> {

    @Nullable
    private String salutation;

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param salutation
     * @return Builder
     */

    public CustomerSetSalutationActionBuilder salutation(@Nullable final String salutation) {
        this.salutation = salutation;
        return this;
    }

    @Nullable
    public String getSalutation() {
        return this.salutation;
    }

    public CustomerSetSalutationAction build() {
        return new CustomerSetSalutationActionImpl(salutation);
    }

    /**
     * builds CustomerSetSalutationAction without checking for non null required values
     */
    public CustomerSetSalutationAction buildUnchecked() {
        return new CustomerSetSalutationActionImpl(salutation);
    }

    public static CustomerSetSalutationActionBuilder of() {
        return new CustomerSetSalutationActionBuilder();
    }

    public static CustomerSetSalutationActionBuilder of(final CustomerSetSalutationAction template) {
        CustomerSetSalutationActionBuilder builder = new CustomerSetSalutationActionBuilder();
        builder.salutation = template.getSalutation();
        return builder;
    }

}
