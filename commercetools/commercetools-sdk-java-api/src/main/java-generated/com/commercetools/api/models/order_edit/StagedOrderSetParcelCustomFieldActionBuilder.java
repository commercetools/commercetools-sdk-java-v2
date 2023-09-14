
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
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetParcelCustomFieldActionBuilder implements Builder<StagedOrderSetParcelCustomFieldAction> {

    @Nullable
    private String parcelId;

    @Nullable
    private String parcelKey;

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p><code>id</code> of an existing Parcel.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     * @param parcelId value to be set
     * @return Builder
     */

    public StagedOrderSetParcelCustomFieldActionBuilder parcelId(@Nullable final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    /**
     *  <p><code>key</code> of an existing Parcel.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     * @param parcelKey value to be set
     * @return Builder
     */

    public StagedOrderSetParcelCustomFieldActionBuilder parcelKey(@Nullable final String parcelKey) {
        this.parcelKey = parcelKey;
        return this;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */

    public StagedOrderSetParcelCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public StagedOrderSetParcelCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p><code>id</code> of an existing Parcel.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     * @return parcelId
     */

    @Nullable
    public String getParcelId() {
        return this.parcelId;
    }

    /**
     *  <p><code>key</code> of an existing Parcel.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     * @return parcelKey
     */

    @Nullable
    public String getParcelKey() {
        return this.parcelKey;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds StagedOrderSetParcelCustomFieldAction with checking for non-null required values
     * @return StagedOrderSetParcelCustomFieldAction
     */
    public StagedOrderSetParcelCustomFieldAction build() {
        Objects.requireNonNull(name, StagedOrderSetParcelCustomFieldAction.class + ": name is missing");
        return new StagedOrderSetParcelCustomFieldActionImpl(parcelId, parcelKey, name, value);
    }

    /**
     * builds StagedOrderSetParcelCustomFieldAction without checking for non-null required values
     * @return StagedOrderSetParcelCustomFieldAction
     */
    public StagedOrderSetParcelCustomFieldAction buildUnchecked() {
        return new StagedOrderSetParcelCustomFieldActionImpl(parcelId, parcelKey, name, value);
    }

    /**
     * factory method for an instance of StagedOrderSetParcelCustomFieldActionBuilder
     * @return builder
     */
    public static StagedOrderSetParcelCustomFieldActionBuilder of() {
        return new StagedOrderSetParcelCustomFieldActionBuilder();
    }

    /**
     * create builder for StagedOrderSetParcelCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetParcelCustomFieldActionBuilder of(
            final StagedOrderSetParcelCustomFieldAction template) {
        StagedOrderSetParcelCustomFieldActionBuilder builder = new StagedOrderSetParcelCustomFieldActionBuilder();
        builder.parcelId = template.getParcelId();
        builder.parcelKey = template.getParcelKey();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
