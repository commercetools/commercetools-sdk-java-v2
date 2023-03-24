
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerSetDateOfBirthActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetDateOfBirthAction customerSetDateOfBirthAction = CustomerSetDateOfBirthAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerSetDateOfBirthActionBuilder implements Builder<CustomerSetDateOfBirthAction> {

    @Nullable
    private java.time.LocalDate dateOfBirth;

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param dateOfBirth value to be set
     * @return Builder
     */

    public CustomerSetDateOfBirthActionBuilder dateOfBirth(@Nullable final java.time.LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    @Nullable
    public java.time.LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    /**
     * builds CustomerSetDateOfBirthAction with checking for non-null required values
     * @return CustomerSetDateOfBirthAction
     */
    public CustomerSetDateOfBirthAction build() {
        return new CustomerSetDateOfBirthActionImpl(dateOfBirth);
    }

    /**
     * builds CustomerSetDateOfBirthAction without checking for non-null required values
     * @return CustomerSetDateOfBirthAction
     */
    public CustomerSetDateOfBirthAction buildUnchecked() {
        return new CustomerSetDateOfBirthActionImpl(dateOfBirth);
    }

    public static CustomerSetDateOfBirthActionBuilder of() {
        return new CustomerSetDateOfBirthActionBuilder();
    }

    public static CustomerSetDateOfBirthActionBuilder of(final CustomerSetDateOfBirthAction template) {
        CustomerSetDateOfBirthActionBuilder builder = new CustomerSetDateOfBirthActionBuilder();
        builder.dateOfBirth = template.getDateOfBirth();
        return builder;
    }

}
