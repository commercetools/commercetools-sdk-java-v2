
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetReturnItemCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetReturnItemCustomFieldAction stagedOrderSetReturnItemCustomFieldAction = StagedOrderSetReturnItemCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetReturnItemCustomFieldActionBuilder
        implements Builder<StagedOrderSetReturnItemCustomFieldAction> {

    @Nullable
    private String returnItemId;

    @Nullable
    private String returnItemKey;

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p><code>id</code> of the ReturnItem to update. Either <code>returnItemId</code> or <code>returnItemKey</code> is required.</p>
     * @param returnItemId value to be set
     * @return Builder
     */

    public StagedOrderSetReturnItemCustomFieldActionBuilder returnItemId(@Nullable final String returnItemId) {
        this.returnItemId = returnItemId;
        return this;
    }

    /**
     *  <p><code>key</code> of the ReturnItem to update. Either <code>returnItemId</code> or <code>returnItemKey</code> is required.</p>
     * @param returnItemKey value to be set
     * @return Builder
     */

    public StagedOrderSetReturnItemCustomFieldActionBuilder returnItemKey(@Nullable final String returnItemKey) {
        this.returnItemKey = returnItemKey;
        return this;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */

    public StagedOrderSetReturnItemCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public StagedOrderSetReturnItemCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p><code>id</code> of the ReturnItem to update. Either <code>returnItemId</code> or <code>returnItemKey</code> is required.</p>
     * @return returnItemId
     */

    @Nullable
    public String getReturnItemId() {
        return this.returnItemId;
    }

    /**
     *  <p><code>key</code> of the ReturnItem to update. Either <code>returnItemId</code> or <code>returnItemKey</code> is required.</p>
     * @return returnItemKey
     */

    @Nullable
    public String getReturnItemKey() {
        return this.returnItemKey;
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
     * builds StagedOrderSetReturnItemCustomFieldAction with checking for non-null required values
     * @return StagedOrderSetReturnItemCustomFieldAction
     */
    public StagedOrderSetReturnItemCustomFieldAction build() {
        Objects.requireNonNull(name, StagedOrderSetReturnItemCustomFieldAction.class + ": name is missing");
        return new StagedOrderSetReturnItemCustomFieldActionImpl(returnItemId, returnItemKey, name, value);
    }

    /**
     * builds StagedOrderSetReturnItemCustomFieldAction without checking for non-null required values
     * @return StagedOrderSetReturnItemCustomFieldAction
     */
    public StagedOrderSetReturnItemCustomFieldAction buildUnchecked() {
        return new StagedOrderSetReturnItemCustomFieldActionImpl(returnItemId, returnItemKey, name, value);
    }

    /**
     * factory method for an instance of StagedOrderSetReturnItemCustomFieldActionBuilder
     * @return builder
     */
    public static StagedOrderSetReturnItemCustomFieldActionBuilder of() {
        return new StagedOrderSetReturnItemCustomFieldActionBuilder();
    }

    /**
     * create builder for StagedOrderSetReturnItemCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetReturnItemCustomFieldActionBuilder of(
            final StagedOrderSetReturnItemCustomFieldAction template) {
        StagedOrderSetReturnItemCustomFieldActionBuilder builder = new StagedOrderSetReturnItemCustomFieldActionBuilder();
        builder.returnItemId = template.getReturnItemId();
        builder.returnItemKey = template.getReturnItemKey();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
