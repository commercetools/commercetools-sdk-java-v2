package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.order_edit.StagedOrderSetReturnItemCustomFieldAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetReturnItemCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetReturnItemCustomFieldAction stagedOrderSetReturnItemCustomFieldAction = StagedOrderSetReturnItemCustomFieldAction.builder()
 *             .returnItemId("{returnItemId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedOrderSetReturnItemCustomFieldActionBuilder implements Builder<StagedOrderSetReturnItemCustomFieldAction> {

    
    
    private String returnItemId;
    
    
    
    private String name;
    
    
    @Nullable
    private java.lang.Object value;

    
    /**
     * set the value to the returnItemId
     * @param returnItemId value to be set
     * @return Builder
     */
    
    public StagedOrderSetReturnItemCustomFieldActionBuilder returnItemId( final String returnItemId) {
        this.returnItemId = returnItemId;
        return this;
    }
    
    
    
    
    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */
    
    public StagedOrderSetReturnItemCustomFieldActionBuilder name( final String name) {
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
     * value of returnItemId}
     * @return returnItemId
     */
    
    
    public String getReturnItemId(){
        return this.returnItemId;
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
     * builds StagedOrderSetReturnItemCustomFieldAction with checking for non-null required values
     * @return StagedOrderSetReturnItemCustomFieldAction
     */
    public StagedOrderSetReturnItemCustomFieldAction build() {
        Objects.requireNonNull(returnItemId, StagedOrderSetReturnItemCustomFieldAction.class + ": returnItemId is missing");
        Objects.requireNonNull(name, StagedOrderSetReturnItemCustomFieldAction.class + ": name is missing");
        return new StagedOrderSetReturnItemCustomFieldActionImpl(returnItemId, name, value);
    }
    
    /**
     * builds StagedOrderSetReturnItemCustomFieldAction without checking for non-null required values
     * @return StagedOrderSetReturnItemCustomFieldAction
     */
    public StagedOrderSetReturnItemCustomFieldAction buildUnchecked() {
        return new StagedOrderSetReturnItemCustomFieldActionImpl(returnItemId, name, value);
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
    public static StagedOrderSetReturnItemCustomFieldActionBuilder of(final StagedOrderSetReturnItemCustomFieldAction template) {
        StagedOrderSetReturnItemCustomFieldActionBuilder builder = new StagedOrderSetReturnItemCustomFieldActionBuilder();
        builder.returnItemId = template.getReturnItemId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
