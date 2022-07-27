
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetProductSelectionsChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetProductSelectionsChange setProductSelectionsChange = SetProductSelectionsChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetProductSelectionsChangeBuilder implements Builder<SetProductSelectionsChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.common.ProductSelectionSetting> previousValue;

    private java.util.List<com.commercetools.history.models.common.ProductSelectionSetting> nextValue;

    /**
     *  <p>Update action for <code>setProductSelections</code></p>
     */

    public SetProductSelectionsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     */

    public SetProductSelectionsChangeBuilder previousValue(
            final com.commercetools.history.models.common.ProductSelectionSetting... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     *
     */

    public SetProductSelectionsChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.ProductSelectionSetting> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     */

    public SetProductSelectionsChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.common.ProductSelectionSetting... previousValue) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.addAll(Arrays.asList(previousValue));
        return this;
    }

    /**
     *
     */

    public SetProductSelectionsChangeBuilder plusPreviousValue(
            Function<com.commercetools.history.models.common.ProductSelectionSettingBuilder, com.commercetools.history.models.common.ProductSelectionSettingBuilder> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.add(
            builder.apply(com.commercetools.history.models.common.ProductSelectionSettingBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public SetProductSelectionsChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.ProductSelectionSettingBuilder, com.commercetools.history.models.common.ProductSelectionSettingBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue.add(
            builder.apply(com.commercetools.history.models.common.ProductSelectionSettingBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public SetProductSelectionsChangeBuilder nextValue(
            final com.commercetools.history.models.common.ProductSelectionSetting... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     *
     */

    public SetProductSelectionsChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.ProductSelectionSetting> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *
     */

    public SetProductSelectionsChangeBuilder plusNextValue(
            final com.commercetools.history.models.common.ProductSelectionSetting... nextValue) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.addAll(Arrays.asList(nextValue));
        return this;
    }

    /**
     *
     */

    public SetProductSelectionsChangeBuilder plusNextValue(
            Function<com.commercetools.history.models.common.ProductSelectionSettingBuilder, com.commercetools.history.models.common.ProductSelectionSettingBuilder> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.add(
            builder.apply(com.commercetools.history.models.common.ProductSelectionSettingBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public SetProductSelectionsChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.ProductSelectionSettingBuilder, com.commercetools.history.models.common.ProductSelectionSettingBuilder> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue.add(
            builder.apply(com.commercetools.history.models.common.ProductSelectionSettingBuilder.of()).build());
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public java.util.List<com.commercetools.history.models.common.ProductSelectionSetting> getPreviousValue() {
        return this.previousValue;
    }

    public java.util.List<com.commercetools.history.models.common.ProductSelectionSetting> getNextValue() {
        return this.nextValue;
    }

    public SetProductSelectionsChange build() {
        Objects.requireNonNull(change, SetProductSelectionsChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetProductSelectionsChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetProductSelectionsChange.class + ": nextValue is missing");
        return new SetProductSelectionsChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetProductSelectionsChange without checking for non null required values
     */
    public SetProductSelectionsChange buildUnchecked() {
        return new SetProductSelectionsChangeImpl(change, previousValue, nextValue);
    }

    public static SetProductSelectionsChangeBuilder of() {
        return new SetProductSelectionsChangeBuilder();
    }

    public static SetProductSelectionsChangeBuilder of(final SetProductSelectionsChange template) {
        SetProductSelectionsChangeBuilder builder = new SetProductSelectionsChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
