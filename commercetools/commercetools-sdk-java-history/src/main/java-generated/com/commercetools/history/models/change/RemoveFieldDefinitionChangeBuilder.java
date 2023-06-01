package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.FieldDefinition;
import com.commercetools.history.models.change.RemoveFieldDefinitionChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveFieldDefinitionChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveFieldDefinitionChange removeFieldDefinitionChange = RemoveFieldDefinitionChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class RemoveFieldDefinitionChangeBuilder implements Builder<RemoveFieldDefinitionChange> {

    
    
    private String change;
    
    
    
    private com.commercetools.history.models.common.FieldDefinition previousValue;

    
    /**
     *  <p>Update action for <code>removeFieldDefinition</code> on payments</p>
     * @param change value to be set
     * @return Builder
     */
    
    public RemoveFieldDefinitionChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public RemoveFieldDefinitionChangeBuilder previousValue(Function<com.commercetools.history.models.common.FieldDefinitionBuilder, com.commercetools.history.models.common.FieldDefinitionBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.FieldDefinitionBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public RemoveFieldDefinitionChangeBuilder withPreviousValue(Function<com.commercetools.history.models.common.FieldDefinitionBuilder, com.commercetools.history.models.common.FieldDefinition> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.FieldDefinitionBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public RemoveFieldDefinitionChangeBuilder previousValue( final com.commercetools.history.models.common.FieldDefinition previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    

    /**
     *  <p>Update action for <code>removeFieldDefinition</code> on payments</p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     * value of previousValue}
     * @return previousValue
     */
    
    
    public com.commercetools.history.models.common.FieldDefinition getPreviousValue(){
        return this.previousValue;
    }

    /**
     * builds RemoveFieldDefinitionChange with checking for non-null required values
     * @return RemoveFieldDefinitionChange
     */
    public RemoveFieldDefinitionChange build() {
        Objects.requireNonNull(change, RemoveFieldDefinitionChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, RemoveFieldDefinitionChange.class + ": previousValue is missing");
        return new RemoveFieldDefinitionChangeImpl(change, previousValue);
    }
    
    /**
     * builds RemoveFieldDefinitionChange without checking for non-null required values
     * @return RemoveFieldDefinitionChange
     */
    public RemoveFieldDefinitionChange buildUnchecked() {
        return new RemoveFieldDefinitionChangeImpl(change, previousValue);
    }

    /**
     * factory method for an instance of RemoveFieldDefinitionChangeBuilder
     * @return builder 
     */
    public static RemoveFieldDefinitionChangeBuilder of() {
        return new RemoveFieldDefinitionChangeBuilder();
    }

    /**
     * create builder for RemoveFieldDefinitionChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveFieldDefinitionChangeBuilder of(final RemoveFieldDefinitionChange template) {
        RemoveFieldDefinitionChangeBuilder builder = new RemoveFieldDefinitionChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
