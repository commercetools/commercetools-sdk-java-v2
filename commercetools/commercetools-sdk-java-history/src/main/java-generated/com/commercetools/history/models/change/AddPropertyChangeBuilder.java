package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import java.lang.Object;
import com.commercetools.history.models.change.AddPropertyChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddPropertyChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddPropertyChange addPropertyChange = AddPropertyChange.builder()
 *             .change("{change}")
 *             .path("{path}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AddPropertyChangeBuilder implements Builder<AddPropertyChange> {

    
    
    private String change;
    
    
    
    private String path;
    
    
    
    private java.lang.Object nextValue;

    
    /**
     *  <p>Update action for <code>addProperty</code> on custom objects</p>
     * @param change value to be set
     * @return Builder
     */
    
    public AddPropertyChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     *  <p>Value path to the property that was added</p>
     * @param path value to be set
     * @return Builder
     */
    
    public AddPropertyChangeBuilder path( final String path) {
        this.path = path;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public AddPropertyChangeBuilder nextValue( final java.lang.Object nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    

    /**
     *  <p>Update action for <code>addProperty</code> on custom objects</p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     *  <p>Value path to the property that was added</p>
     * @return path
     */
    
    
    public String getPath(){
        return this.path;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public java.lang.Object getNextValue(){
        return this.nextValue;
    }

    /**
     * builds AddPropertyChange with checking for non-null required values
     * @return AddPropertyChange
     */
    public AddPropertyChange build() {
        Objects.requireNonNull(change, AddPropertyChange.class + ": change is missing");
        Objects.requireNonNull(path, AddPropertyChange.class + ": path is missing");
        Objects.requireNonNull(nextValue, AddPropertyChange.class + ": nextValue is missing");
        return new AddPropertyChangeImpl(change, path, nextValue);
    }
    
    /**
     * builds AddPropertyChange without checking for non-null required values
     * @return AddPropertyChange
     */
    public AddPropertyChange buildUnchecked() {
        return new AddPropertyChangeImpl(change, path, nextValue);
    }

    /**
     * factory method for an instance of AddPropertyChangeBuilder
     * @return builder 
     */
    public static AddPropertyChangeBuilder of() {
        return new AddPropertyChangeBuilder();
    }

    /**
     * create builder for AddPropertyChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddPropertyChangeBuilder of(final AddPropertyChange template) {
        AddPropertyChangeBuilder builder = new AddPropertyChangeBuilder();
        builder.change = template.getChange();
        builder.path = template.getPath();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
