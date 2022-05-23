
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   SetTaxCategoryChange setTaxCategoryChange = SetTaxCategoryChange.builder()
           .change("{change}")
           .previousValue(previousValueBuilder -> previousValueBuilder)
           .nextValue(nextValueBuilder -> nextValueBuilder)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetTaxCategoryChangeBuilder implements Builder<SetTaxCategoryChange> {

    private String change;

    private com.commercetools.history.models.common.Reference previousValue;

    private com.commercetools.history.models.common.Reference nextValue;

    /**
     *  <p>Shape of the action for <code>setTaxCategory</code></p>
     */

    public SetTaxCategoryChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetTaxCategoryChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    public SetTaxCategoryChangeBuilder previousValue(
            final com.commercetools.history.models.common.Reference previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetTaxCategoryChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    public SetTaxCategoryChangeBuilder nextValue(final com.commercetools.history.models.common.Reference nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.Reference getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.Reference getNextValue() {
        return this.nextValue;
    }

    public SetTaxCategoryChange build() {
        Objects.requireNonNull(change, SetTaxCategoryChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetTaxCategoryChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetTaxCategoryChange.class + ": nextValue is missing");
        return new SetTaxCategoryChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetTaxCategoryChange without checking for non null required values
     */
    public SetTaxCategoryChange buildUnchecked() {
        return new SetTaxCategoryChangeImpl(change, previousValue, nextValue);
    }

    public static SetTaxCategoryChangeBuilder of() {
        return new SetTaxCategoryChangeBuilder();
    }

    public static SetTaxCategoryChangeBuilder of(final SetTaxCategoryChange template) {
        SetTaxCategoryChangeBuilder builder = new SetTaxCategoryChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
