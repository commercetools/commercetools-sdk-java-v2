
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   AddLocationChange addLocationChange = AddLocationChange.builder()
           .change("{change}")
           .previousValue(previousValueBuilder -> previousValueBuilder)
           .nextValue(nextValueBuilder -> nextValueBuilder)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddLocationChangeBuilder implements Builder<AddLocationChange> {

    private String change;

    private com.commercetools.history.models.common.Location previousValue;

    private com.commercetools.history.models.common.Location nextValue;

    /**
     *  <p>Update action for <code>addLocation</code> on zones</p>
     */

    public AddLocationChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Shape of the value for <code>addLocation</code> and <code>removeLocation</code> actions</p>
     */

    public AddLocationChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.LocationBuilder, com.commercetools.history.models.common.LocationBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocationBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Shape of the value for <code>addLocation</code> and <code>removeLocation</code> actions</p>
     */

    public AddLocationChangeBuilder previousValue(
            final com.commercetools.history.models.common.Location previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Shape of the value for <code>addLocation</code> and <code>removeLocation</code> actions</p>
     */

    public AddLocationChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.LocationBuilder, com.commercetools.history.models.common.LocationBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocationBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Shape of the value for <code>addLocation</code> and <code>removeLocation</code> actions</p>
     */

    public AddLocationChangeBuilder nextValue(final com.commercetools.history.models.common.Location nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.Location getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.Location getNextValue() {
        return this.nextValue;
    }

    public AddLocationChange build() {
        Objects.requireNonNull(change, AddLocationChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, AddLocationChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, AddLocationChange.class + ": nextValue is missing");
        return new AddLocationChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds AddLocationChange without checking for non null required values
     */
    public AddLocationChange buildUnchecked() {
        return new AddLocationChangeImpl(change, previousValue, nextValue);
    }

    public static AddLocationChangeBuilder of() {
        return new AddLocationChangeBuilder();
    }

    public static AddLocationChangeBuilder of(final AddLocationChange template) {
        AddLocationChangeBuilder builder = new AddLocationChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
