
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveAddressChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveAddressChange removeAddressChange = RemoveAddressChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveAddressChangeBuilder implements Builder<RemoveAddressChange> {

    private String change;

    private com.commercetools.history.models.common.Address previousValue;

    /**
     *  <p>Update action for <code>removeAddress</code> action.</p>
     * @param change value to be set
     * @return Builder
     */

    public RemoveAddressChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemoveAddressChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public RemoveAddressChangeBuilder previousValue(
            final com.commercetools.history.models.common.Address previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Update action for <code>removeAddress</code> action.</p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public com.commercetools.history.models.common.Address getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds RemoveAddressChange with checking for non-null required values
     * @return RemoveAddressChange
     */
    public RemoveAddressChange build() {
        Objects.requireNonNull(change, RemoveAddressChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, RemoveAddressChange.class + ": previousValue is missing");
        return new RemoveAddressChangeImpl(change, previousValue);
    }

    /**
     * builds RemoveAddressChange without checking for non-null required values
     * @return RemoveAddressChange
     */
    public RemoveAddressChange buildUnchecked() {
        return new RemoveAddressChangeImpl(change, previousValue);
    }

    /**
     * factory method for an instance of RemoveAddressChangeBuilder
     * @return builder
     */
    public static RemoveAddressChangeBuilder of() {
        return new RemoveAddressChangeBuilder();
    }

    /**
     * create builder for RemoveAddressChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveAddressChangeBuilder of(final RemoveAddressChange template) {
        RemoveAddressChangeBuilder builder = new RemoveAddressChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
