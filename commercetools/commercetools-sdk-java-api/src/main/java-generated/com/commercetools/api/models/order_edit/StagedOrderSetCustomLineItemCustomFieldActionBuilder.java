package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.order_edit.StagedOrderSetCustomLineItemCustomFieldAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetCustomLineItemCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetCustomLineItemCustomFieldAction stagedOrderSetCustomLineItemCustomFieldAction = StagedOrderSetCustomLineItemCustomFieldAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedOrderSetCustomLineItemCustomFieldActionBuilder implements Builder<StagedOrderSetCustomLineItemCustomFieldAction> {

    
    
    private String customLineItemId;
    
    
    
    private String name;
    
    
    @Nullable
    private java.lang.Object value;

    
    /**
     * set the value to the customLineItemId
     * @param customLineItemId value to be set
     * @return Builder
     */
    
    public StagedOrderSetCustomLineItemCustomFieldActionBuilder customLineItemId( final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }
    
    
    
    
    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */
    
    public StagedOrderSetCustomLineItemCustomFieldActionBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    
    
    
    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */
    
    public StagedOrderSetCustomLineItemCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }
    
    

    /**
     * value of customLineItemId}
     * @return customLineItemId
     */
    
    
    public String getCustomLineItemId(){
        return this.customLineItemId;
    }
    
    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */
    
    
    public String getName(){
        return this.name;
    }
    
    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */
    
    @Nullable
    public java.lang.Object getValue(){
        return this.value;
    }

    /**
     * builds StagedOrderSetCustomLineItemCustomFieldAction with checking for non-null required values
     * @return StagedOrderSetCustomLineItemCustomFieldAction
     */
    public StagedOrderSetCustomLineItemCustomFieldAction build() {
        Objects.requireNonNull(customLineItemId, StagedOrderSetCustomLineItemCustomFieldAction.class + ": customLineItemId is missing");
        Objects.requireNonNull(name, StagedOrderSetCustomLineItemCustomFieldAction.class + ": name is missing");
        return new StagedOrderSetCustomLineItemCustomFieldActionImpl(customLineItemId, name, value);
    }
    
    /**
     * builds StagedOrderSetCustomLineItemCustomFieldAction without checking for non-null required values
     * @return StagedOrderSetCustomLineItemCustomFieldAction
     */
    public StagedOrderSetCustomLineItemCustomFieldAction buildUnchecked() {
        return new StagedOrderSetCustomLineItemCustomFieldActionImpl(customLineItemId, name, value);
    }

    /**
     * factory method for an instance of StagedOrderSetCustomLineItemCustomFieldActionBuilder
     * @return builder 
     */
    public static StagedOrderSetCustomLineItemCustomFieldActionBuilder of() {
        return new StagedOrderSetCustomLineItemCustomFieldActionBuilder();
    }

    /**
     * create builder for StagedOrderSetCustomLineItemCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetCustomLineItemCustomFieldActionBuilder of(final StagedOrderSetCustomLineItemCustomFieldAction template) {
        StagedOrderSetCustomLineItemCustomFieldActionBuilder builder = new StagedOrderSetCustomLineItemCustomFieldActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
