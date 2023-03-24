
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetProductVariantKeyChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetProductVariantKeyChange setProductVariantKeyChange = SetProductVariantKeyChange.builder()
 *             .change("{change}")
 *             .catalogData("{catalogData}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetProductVariantKeyChangeBuilder implements Builder<SetProductVariantKeyChange> {

    private String change;

    private String catalogData;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Update action for <code>setProductVariantKey</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetProductVariantKeyChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     * @param catalogData value to be set
     * @return Builder
     */

    public SetProductVariantKeyChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    /**
     *
     * @param previousValue value to be set
     * @return Builder
     */

    public SetProductVariantKeyChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     * @param nextValue value to be set
     * @return Builder
     */

    public SetProductVariantKeyChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getCatalogData() {
        return this.catalogData;
    }

    public String getPreviousValue() {
        return this.previousValue;
    }

    public String getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetProductVariantKeyChange with checking for non-null required values
     * @return SetProductVariantKeyChange
     */
    public SetProductVariantKeyChange build() {
        Objects.requireNonNull(change, SetProductVariantKeyChange.class + ": change is missing");
        Objects.requireNonNull(catalogData, SetProductVariantKeyChange.class + ": catalogData is missing");
        Objects.requireNonNull(previousValue, SetProductVariantKeyChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetProductVariantKeyChange.class + ": nextValue is missing");
        return new SetProductVariantKeyChangeImpl(change, catalogData, previousValue, nextValue);
    }

    /**
     * builds SetProductVariantKeyChange without checking for non-null required values
     * @return SetProductVariantKeyChange
     */
    public SetProductVariantKeyChange buildUnchecked() {
        return new SetProductVariantKeyChangeImpl(change, catalogData, previousValue, nextValue);
    }

    public static SetProductVariantKeyChangeBuilder of() {
        return new SetProductVariantKeyChangeBuilder();
    }

    public static SetProductVariantKeyChangeBuilder of(final SetProductVariantKeyChange template) {
        SetProductVariantKeyChangeBuilder builder = new SetProductVariantKeyChangeBuilder();
        builder.change = template.getChange();
        builder.catalogData = template.getCatalogData();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
