package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyBusinessUnitUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.me.MyBusinessUnitSetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyBusinessUnitSetCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitSetCustomFieldAction myBusinessUnitSetCustomFieldAction = MyBusinessUnitSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyBusinessUnitSetCustomFieldActionBuilder implements Builder<MyBusinessUnitSetCustomFieldAction> {

    
    
    private String name;
    
    
    @Nullable
    private java.lang.Object value;

    
    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */
    
    public MyBusinessUnitSetCustomFieldActionBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    
    
    
    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */
    
    public MyBusinessUnitSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */
    
    @Nullable
    public java.lang.Object getValue(){
        return this.value;
    }

    /**
     * builds MyBusinessUnitSetCustomFieldAction with checking for non-null required values
     * @return MyBusinessUnitSetCustomFieldAction
     */
    public MyBusinessUnitSetCustomFieldAction build() {
        Objects.requireNonNull(name, MyBusinessUnitSetCustomFieldAction.class + ": name is missing");
        return new MyBusinessUnitSetCustomFieldActionImpl(name, value);
    }
    
    /**
     * builds MyBusinessUnitSetCustomFieldAction without checking for non-null required values
     * @return MyBusinessUnitSetCustomFieldAction
     */
    public MyBusinessUnitSetCustomFieldAction buildUnchecked() {
        return new MyBusinessUnitSetCustomFieldActionImpl(name, value);
    }

    /**
     * factory method for an instance of MyBusinessUnitSetCustomFieldActionBuilder
     * @return builder 
     */
    public static MyBusinessUnitSetCustomFieldActionBuilder of() {
        return new MyBusinessUnitSetCustomFieldActionBuilder();
    }

    /**
     * create builder for MyBusinessUnitSetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyBusinessUnitSetCustomFieldActionBuilder of(final MyBusinessUnitSetCustomFieldAction template) {
        MyBusinessUnitSetCustomFieldActionBuilder builder = new MyBusinessUnitSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
