
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class StagedOrderSetCustomLineItemCustomFieldActionBuilder
        implements Builder<StagedOrderSetCustomLineItemCustomFieldAction> {

    private String customLineItemId;

    private String name;

    @Nullable
    private java.lang.Object value;

    public StagedOrderSetCustomLineItemCustomFieldActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
    *  <p>Name of the Custom Field.</p>
    */

    public StagedOrderSetCustomLineItemCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
    *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
    */

    public StagedOrderSetCustomLineItemCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public StagedOrderSetCustomLineItemCustomFieldAction build() {
        Objects.requireNonNull(customLineItemId,
            StagedOrderSetCustomLineItemCustomFieldAction.class + ": customLineItemId is missing");
        Objects.requireNonNull(name, StagedOrderSetCustomLineItemCustomFieldAction.class + ": name is missing");
        return new StagedOrderSetCustomLineItemCustomFieldActionImpl(customLineItemId, name, value);
    }

    /**
     * builds StagedOrderSetCustomLineItemCustomFieldAction without checking for non null required values
     */
    public StagedOrderSetCustomLineItemCustomFieldAction buildUnchecked() {
        return new StagedOrderSetCustomLineItemCustomFieldActionImpl(customLineItemId, name, value);
    }

    public static StagedOrderSetCustomLineItemCustomFieldActionBuilder of() {
        return new StagedOrderSetCustomLineItemCustomFieldActionBuilder();
    }

    public static StagedOrderSetCustomLineItemCustomFieldActionBuilder of(
            final StagedOrderSetCustomLineItemCustomFieldAction template) {
        StagedOrderSetCustomLineItemCustomFieldActionBuilder builder = new StagedOrderSetCustomLineItemCustomFieldActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
