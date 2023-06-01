package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.ReturnInfo;
import com.commercetools.history.models.change.AddReturnInfoChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddReturnInfoChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddReturnInfoChange addReturnInfoChange = AddReturnInfoChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AddReturnInfoChangeBuilder implements Builder<AddReturnInfoChange> {

    
    
    private String change;
    
    
    
    private com.commercetools.history.models.common.ReturnInfo nextValue;

    
    /**
     *  <p>Update action for <code>addReturnInfo</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public AddReturnInfoChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public AddReturnInfoChangeBuilder nextValue(Function<com.commercetools.history.models.common.ReturnInfoBuilder, com.commercetools.history.models.common.ReturnInfoBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ReturnInfoBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public AddReturnInfoChangeBuilder withNextValue(Function<com.commercetools.history.models.common.ReturnInfoBuilder, com.commercetools.history.models.common.ReturnInfo> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ReturnInfoBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public AddReturnInfoChangeBuilder nextValue( final com.commercetools.history.models.common.ReturnInfo nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    

    /**
     *  <p>Update action for <code>addReturnInfo</code></p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public com.commercetools.history.models.common.ReturnInfo getNextValue(){
        return this.nextValue;
    }

    /**
     * builds AddReturnInfoChange with checking for non-null required values
     * @return AddReturnInfoChange
     */
    public AddReturnInfoChange build() {
        Objects.requireNonNull(change, AddReturnInfoChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, AddReturnInfoChange.class + ": nextValue is missing");
        return new AddReturnInfoChangeImpl(change, nextValue);
    }
    
    /**
     * builds AddReturnInfoChange without checking for non-null required values
     * @return AddReturnInfoChange
     */
    public AddReturnInfoChange buildUnchecked() {
        return new AddReturnInfoChangeImpl(change, nextValue);
    }

    /**
     * factory method for an instance of AddReturnInfoChangeBuilder
     * @return builder 
     */
    public static AddReturnInfoChangeBuilder of() {
        return new AddReturnInfoChangeBuilder();
    }

    /**
     * create builder for AddReturnInfoChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddReturnInfoChangeBuilder of(final AddReturnInfoChange template) {
        AddReturnInfoChangeBuilder builder = new AddReturnInfoChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
