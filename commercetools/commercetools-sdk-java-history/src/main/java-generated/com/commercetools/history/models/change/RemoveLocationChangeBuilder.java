
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveLocationChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveLocationChange removeLocationChange = RemoveLocationChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveLocationChangeBuilder implements Builder<RemoveLocationChange> {

    private String change;

    private com.commercetools.history.models.common.Location previousValue;

    private com.commercetools.history.models.common.Location nextValue;

    /**
     *  <p>Update action for <code>removeLocation</code> on zones</p>
     * @param change value to be set
     * @return Builder
     */

    public RemoveLocationChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Shape of the value for <code>addLocation</code> and <code>removeLocation</code> actions</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemoveLocationChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.LocationBuilder, com.commercetools.history.models.common.LocationBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocationBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Shape of the value for <code>addLocation</code> and <code>removeLocation</code> actions</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public RemoveLocationChangeBuilder previousValue(
            final com.commercetools.history.models.common.Location previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Shape of the value for <code>addLocation</code> and <code>removeLocation</code> actions</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public RemoveLocationChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.LocationBuilder, com.commercetools.history.models.common.LocationBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocationBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Shape of the value for <code>addLocation</code> and <code>removeLocation</code> actions</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public RemoveLocationChangeBuilder nextValue(final com.commercetools.history.models.common.Location nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Update action for <code>removeLocation</code> on zones</p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Shape of the value for <code>addLocation</code> and <code>removeLocation</code> actions</p>
     * @return previousValue
     */

    public com.commercetools.history.models.common.Location getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Shape of the value for <code>addLocation</code> and <code>removeLocation</code> actions</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.Location getNextValue() {
        return this.nextValue;
    }

    /**
     * builds RemoveLocationChange with checking for non-null required values
     * @return RemoveLocationChange
     */
    public RemoveLocationChange build() {
        Objects.requireNonNull(change, RemoveLocationChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, RemoveLocationChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, RemoveLocationChange.class + ": nextValue is missing");
        return new RemoveLocationChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds RemoveLocationChange without checking for non-null required values
     * @return RemoveLocationChange
     */
    public RemoveLocationChange buildUnchecked() {
        return new RemoveLocationChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of RemoveLocationChangeBuilder
     * @return builder
     */
    public static RemoveLocationChangeBuilder of() {
        return new RemoveLocationChangeBuilder();
    }

    /**
     * create builder for RemoveLocationChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveLocationChangeBuilder of(final RemoveLocationChange template) {
        RemoveLocationChangeBuilder builder = new RemoveLocationChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
