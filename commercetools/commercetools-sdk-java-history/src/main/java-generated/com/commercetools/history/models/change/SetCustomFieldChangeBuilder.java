
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCustomFieldChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomFieldChange setCustomFieldChange = SetCustomFieldChange.builder()
 *             .change("{change}")
 *             .name("{name}")
 *             .customTypeId("{customTypeId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetCustomFieldChangeBuilder implements Builder<SetCustomFieldChange> {

    private String change;

    private String name;

    private String customTypeId;

    private java.lang.Object nextValue;

    private java.lang.Object previousValue;

    /**
     *  <p>Update action for setting a custom field</p>
     * @param change value to be set
     * @return Builder
     */

    public SetCustomFieldChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Custom field name</p>
     * @param name value to be set
     * @return Builder
     */

    public SetCustomFieldChangeBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *
     * @param customTypeId value to be set
     * @return Builder
     */

    public SetCustomFieldChangeBuilder customTypeId(final String customTypeId) {
        this.customTypeId = customTypeId;
        return this;
    }

    /**
     *
     * @param nextValue value to be set
     * @return Builder
     */

    public SetCustomFieldChangeBuilder nextValue(final java.lang.Object nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *
     * @param previousValue value to be set
     * @return Builder
     */

    public SetCustomFieldChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getName() {
        return this.name;
    }

    public String getCustomTypeId() {
        return this.customTypeId;
    }

    public java.lang.Object getNextValue() {
        return this.nextValue;
    }

    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds SetCustomFieldChange with checking for non-null required values
     * @return SetCustomFieldChange
     */
    public SetCustomFieldChange build() {
        Objects.requireNonNull(change, SetCustomFieldChange.class + ": change is missing");
        Objects.requireNonNull(name, SetCustomFieldChange.class + ": name is missing");
        Objects.requireNonNull(customTypeId, SetCustomFieldChange.class + ": customTypeId is missing");
        Objects.requireNonNull(nextValue, SetCustomFieldChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetCustomFieldChange.class + ": previousValue is missing");
        return new SetCustomFieldChangeImpl(change, name, customTypeId, nextValue, previousValue);
    }

    /**
     * builds SetCustomFieldChange without checking for non-null required values
     * @return SetCustomFieldChange
     */
    public SetCustomFieldChange buildUnchecked() {
        return new SetCustomFieldChangeImpl(change, name, customTypeId, nextValue, previousValue);
    }

    public static SetCustomFieldChangeBuilder of() {
        return new SetCustomFieldChangeBuilder();
    }

    public static SetCustomFieldChangeBuilder of(final SetCustomFieldChange template) {
        SetCustomFieldChangeBuilder builder = new SetCustomFieldChangeBuilder();
        builder.change = template.getChange();
        builder.name = template.getName();
        builder.customTypeId = template.getCustomTypeId();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
