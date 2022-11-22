
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetParcelCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetParcelCustomFieldAction stagedOrderSetParcelCustomFieldAction = StagedOrderSetParcelCustomFieldAction.builder()
 *             .parcelId("{parcelId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetParcelCustomFieldActionBuilder implements Builder<StagedOrderSetParcelCustomFieldAction> {

    private String parcelId;

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *
     */

    public StagedOrderSetParcelCustomFieldActionBuilder parcelId(final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     */

    public StagedOrderSetParcelCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    public StagedOrderSetParcelCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getParcelId() {
        return this.parcelId;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public StagedOrderSetParcelCustomFieldAction build() {
        Objects.requireNonNull(parcelId, StagedOrderSetParcelCustomFieldAction.class + ": parcelId is missing");
        Objects.requireNonNull(name, StagedOrderSetParcelCustomFieldAction.class + ": name is missing");
        return new StagedOrderSetParcelCustomFieldActionImpl(parcelId, name, value);
    }

    /**
     * builds StagedOrderSetParcelCustomFieldAction without checking for non null required values
     */
    public StagedOrderSetParcelCustomFieldAction buildUnchecked() {
        return new StagedOrderSetParcelCustomFieldActionImpl(parcelId, name, value);
    }

    public static StagedOrderSetParcelCustomFieldActionBuilder of() {
        return new StagedOrderSetParcelCustomFieldActionBuilder();
    }

    public static StagedOrderSetParcelCustomFieldActionBuilder of(
            final StagedOrderSetParcelCustomFieldAction template) {
        StagedOrderSetParcelCustomFieldActionBuilder builder = new StagedOrderSetParcelCustomFieldActionBuilder();
        builder.parcelId = template.getParcelId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
