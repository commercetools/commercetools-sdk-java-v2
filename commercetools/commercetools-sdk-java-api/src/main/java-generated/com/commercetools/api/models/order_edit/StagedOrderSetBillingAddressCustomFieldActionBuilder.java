package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.order_edit.StagedOrderSetBillingAddressCustomFieldAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetBillingAddressCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetBillingAddressCustomFieldAction stagedOrderSetBillingAddressCustomFieldAction = StagedOrderSetBillingAddressCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedOrderSetBillingAddressCustomFieldActionBuilder implements Builder<StagedOrderSetBillingAddressCustomFieldAction> {

    
    
    private String name;
    
    
    @Nullable
    private java.lang.Object value;

    
    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */
    
    public StagedOrderSetBillingAddressCustomFieldActionBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    
    
    
    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */
    
    public StagedOrderSetBillingAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
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
     * builds StagedOrderSetBillingAddressCustomFieldAction with checking for non-null required values
     * @return StagedOrderSetBillingAddressCustomFieldAction
     */
    public StagedOrderSetBillingAddressCustomFieldAction build() {
        Objects.requireNonNull(name, StagedOrderSetBillingAddressCustomFieldAction.class + ": name is missing");
        return new StagedOrderSetBillingAddressCustomFieldActionImpl(name, value);
    }
    
    /**
     * builds StagedOrderSetBillingAddressCustomFieldAction without checking for non-null required values
     * @return StagedOrderSetBillingAddressCustomFieldAction
     */
    public StagedOrderSetBillingAddressCustomFieldAction buildUnchecked() {
        return new StagedOrderSetBillingAddressCustomFieldActionImpl(name, value);
    }

    /**
     * factory method for an instance of StagedOrderSetBillingAddressCustomFieldActionBuilder
     * @return builder 
     */
    public static StagedOrderSetBillingAddressCustomFieldActionBuilder of() {
        return new StagedOrderSetBillingAddressCustomFieldActionBuilder();
    }

    /**
     * create builder for StagedOrderSetBillingAddressCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetBillingAddressCustomFieldActionBuilder of(final StagedOrderSetBillingAddressCustomFieldAction template) {
        StagedOrderSetBillingAddressCustomFieldActionBuilder builder = new StagedOrderSetBillingAddressCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
