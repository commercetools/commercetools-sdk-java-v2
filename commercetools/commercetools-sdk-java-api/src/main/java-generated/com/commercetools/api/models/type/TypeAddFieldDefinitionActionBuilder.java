package com.commercetools.api.models.type;

import com.commercetools.api.models.type.FieldDefinition;
import com.commercetools.api.models.type.TypeUpdateAction;
import com.commercetools.api.models.type.TypeAddFieldDefinitionAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TypeAddFieldDefinitionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeAddFieldDefinitionAction typeAddFieldDefinitionAction = TypeAddFieldDefinitionAction.builder()
 *             .fieldDefinition(fieldDefinitionBuilder -> fieldDefinitionBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class TypeAddFieldDefinitionActionBuilder implements Builder<TypeAddFieldDefinitionAction> {

    
    
    private com.commercetools.api.models.type.FieldDefinition fieldDefinition;

    
    /**
     *  <p>Value to append to the array.</p>
     * @param builder function to build the fieldDefinition value
     * @return Builder
     */
    
    public TypeAddFieldDefinitionActionBuilder fieldDefinition(Function<com.commercetools.api.models.type.FieldDefinitionBuilder, com.commercetools.api.models.type.FieldDefinitionBuilder> builder) {
        this.fieldDefinition = builder.apply(com.commercetools.api.models.type.FieldDefinitionBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Value to append to the array.</p>
     * @param builder function to build the fieldDefinition value
     * @return Builder
     */
    
    public TypeAddFieldDefinitionActionBuilder withFieldDefinition(Function<com.commercetools.api.models.type.FieldDefinitionBuilder, com.commercetools.api.models.type.FieldDefinition> builder) {
        this.fieldDefinition = builder.apply(com.commercetools.api.models.type.FieldDefinitionBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Value to append to the array.</p>
     * @param fieldDefinition value to be set
     * @return Builder
     */
    
    public TypeAddFieldDefinitionActionBuilder fieldDefinition( final com.commercetools.api.models.type.FieldDefinition fieldDefinition) {
        this.fieldDefinition = fieldDefinition;
        return this;
    }
    
    

    /**
     *  <p>Value to append to the array.</p>
     * @return fieldDefinition
     */
    
    
    public com.commercetools.api.models.type.FieldDefinition getFieldDefinition(){
        return this.fieldDefinition;
    }

    /**
     * builds TypeAddFieldDefinitionAction with checking for non-null required values
     * @return TypeAddFieldDefinitionAction
     */
    public TypeAddFieldDefinitionAction build() {
        Objects.requireNonNull(fieldDefinition, TypeAddFieldDefinitionAction.class + ": fieldDefinition is missing");
        return new TypeAddFieldDefinitionActionImpl(fieldDefinition);
    }
    
    /**
     * builds TypeAddFieldDefinitionAction without checking for non-null required values
     * @return TypeAddFieldDefinitionAction
     */
    public TypeAddFieldDefinitionAction buildUnchecked() {
        return new TypeAddFieldDefinitionActionImpl(fieldDefinition);
    }

    /**
     * factory method for an instance of TypeAddFieldDefinitionActionBuilder
     * @return builder 
     */
    public static TypeAddFieldDefinitionActionBuilder of() {
        return new TypeAddFieldDefinitionActionBuilder();
    }

    /**
     * create builder for TypeAddFieldDefinitionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeAddFieldDefinitionActionBuilder of(final TypeAddFieldDefinitionAction template) {
        TypeAddFieldDefinitionActionBuilder builder = new TypeAddFieldDefinitionActionBuilder();
        builder.fieldDefinition = template.getFieldDefinition();
        return builder;
    }

}
