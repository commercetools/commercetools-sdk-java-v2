
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   ChangePlainEnumValueLabelChange changePlainEnumValueLabelChange = ChangePlainEnumValueLabelChange.builder()
           .change("{change}")
           .attributeName("{attributeName}")
           .valueKey("{valueKey}")
           .previousValue("{previousValue}")
           .nextValue("{nextValue}")
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangePlainEnumValueLabelChangeBuilder implements Builder<ChangePlainEnumValueLabelChange> {

    private String change;

    private String attributeName;

    private String valueKey;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Update action for <code>changePlainEnumValueLabel</code> on types</p>
     */

    public ChangePlainEnumValueLabelChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>The name of the attribute updated.</p>
     */

    public ChangePlainEnumValueLabelChangeBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     *  <p>Key of the values that was updated</p>
     */

    public ChangePlainEnumValueLabelChangeBuilder valueKey(final String valueKey) {
        this.valueKey = valueKey;
        return this;
    }

    public ChangePlainEnumValueLabelChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangePlainEnumValueLabelChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public String getValueKey() {
        return this.valueKey;
    }

    public String getPreviousValue() {
        return this.previousValue;
    }

    public String getNextValue() {
        return this.nextValue;
    }

    public ChangePlainEnumValueLabelChange build() {
        Objects.requireNonNull(change, ChangePlainEnumValueLabelChange.class + ": change is missing");
        Objects.requireNonNull(attributeName, ChangePlainEnumValueLabelChange.class + ": attributeName is missing");
        Objects.requireNonNull(valueKey, ChangePlainEnumValueLabelChange.class + ": valueKey is missing");
        Objects.requireNonNull(previousValue, ChangePlainEnumValueLabelChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangePlainEnumValueLabelChange.class + ": nextValue is missing");
        return new ChangePlainEnumValueLabelChangeImpl(change, attributeName, valueKey, previousValue, nextValue);
    }

    /**
     * builds ChangePlainEnumValueLabelChange without checking for non null required values
     */
    public ChangePlainEnumValueLabelChange buildUnchecked() {
        return new ChangePlainEnumValueLabelChangeImpl(change, attributeName, valueKey, previousValue, nextValue);
    }

    public static ChangePlainEnumValueLabelChangeBuilder of() {
        return new ChangePlainEnumValueLabelChangeBuilder();
    }

    public static ChangePlainEnumValueLabelChangeBuilder of(final ChangePlainEnumValueLabelChange template) {
        ChangePlainEnumValueLabelChangeBuilder builder = new ChangePlainEnumValueLabelChangeBuilder();
        builder.change = template.getChange();
        builder.attributeName = template.getAttributeName();
        builder.valueKey = template.getValueKey();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
