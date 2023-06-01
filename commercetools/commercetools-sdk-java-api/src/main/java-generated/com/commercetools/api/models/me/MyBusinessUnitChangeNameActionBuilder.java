package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyBusinessUnitUpdateAction;
import com.commercetools.api.models.me.MyBusinessUnitChangeNameAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyBusinessUnitChangeNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitChangeNameAction myBusinessUnitChangeNameAction = MyBusinessUnitChangeNameAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyBusinessUnitChangeNameActionBuilder implements Builder<MyBusinessUnitChangeNameAction> {

    
    
    private String name;

    
    /**
     *  <p>New name to set.</p>
     * @param name value to be set
     * @return Builder
     */
    
    public MyBusinessUnitChangeNameActionBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    

    /**
     *  <p>New name to set.</p>
     * @return name
     */
    
    
    public String getName(){
        return this.name;
    }

    /**
     * builds MyBusinessUnitChangeNameAction with checking for non-null required values
     * @return MyBusinessUnitChangeNameAction
     */
    public MyBusinessUnitChangeNameAction build() {
        Objects.requireNonNull(name, MyBusinessUnitChangeNameAction.class + ": name is missing");
        return new MyBusinessUnitChangeNameActionImpl(name);
    }
    
    /**
     * builds MyBusinessUnitChangeNameAction without checking for non-null required values
     * @return MyBusinessUnitChangeNameAction
     */
    public MyBusinessUnitChangeNameAction buildUnchecked() {
        return new MyBusinessUnitChangeNameActionImpl(name);
    }

    /**
     * factory method for an instance of MyBusinessUnitChangeNameActionBuilder
     * @return builder 
     */
    public static MyBusinessUnitChangeNameActionBuilder of() {
        return new MyBusinessUnitChangeNameActionBuilder();
    }

    /**
     * create builder for MyBusinessUnitChangeNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyBusinessUnitChangeNameActionBuilder of(final MyBusinessUnitChangeNameAction template) {
        MyBusinessUnitChangeNameActionBuilder builder = new MyBusinessUnitChangeNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
