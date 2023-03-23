
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
     * @param change
     * @return Builder
     */

    public RemoveAddressChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     * @return Builder
     */

    public RemoveAddressChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param previousValue
     * @return Builder
     */

    public RemoveAddressChangeBuilder previousValue(
            final com.commercetools.history.models.common.Address previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.Address getPreviousValue() {
        return this.previousValue;
    }

    public RemoveAddressChange build() {
        Objects.requireNonNull(change, RemoveAddressChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, RemoveAddressChange.class + ": previousValue is missing");
        return new RemoveAddressChangeImpl(change, previousValue);
    }

    /**
     * builds RemoveAddressChange without checking for non null required values
     */
    public RemoveAddressChange buildUnchecked() {
        return new RemoveAddressChangeImpl(change, previousValue);
    }

    public static RemoveAddressChangeBuilder of() {
        return new RemoveAddressChangeBuilder();
    }

    public static RemoveAddressChangeBuilder of(final RemoveAddressChange template) {
        RemoveAddressChangeBuilder builder = new RemoveAddressChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
