package com.commercetools.api.models.type;

import com.commercetools.api.models.type.TypeTextInputHint;
import com.commercetools.api.models.type.TypeUpdateAction;
import com.commercetools.api.models.type.TypeChangeInputHintAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TypeChangeInputHintActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeChangeInputHintAction typeChangeInputHintAction = TypeChangeInputHintAction.builder()
 *             .fieldName("{fieldName}")
 *             .inputHint(TypeTextInputHint.SINGLE_LINE)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class TypeChangeInputHintActionBuilder implements Builder<TypeChangeInputHintAction> {

    
    
    private String fieldName;
    
    
    
    private com.commercetools.api.models.type.TypeTextInputHint inputHint;

    
    /**
     *  <p><code>name</code> of the Field Definition to update.</p>
     * @param fieldName value to be set
     * @return Builder
     */
    
    public TypeChangeInputHintActionBuilder fieldName( final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
    
    
    
    
    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param inputHint value to be set
     * @return Builder
     */
    
    public TypeChangeInputHintActionBuilder inputHint( final com.commercetools.api.models.type.TypeTextInputHint inputHint) {
        this.inputHint = inputHint;
        return this;
    }
    
    

    /**
     *  <p><code>name</code> of the Field Definition to update.</p>
     * @return fieldName
     */
    
    
    public String getFieldName(){
        return this.fieldName;
    }
    
    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return inputHint
     */
    
    
    public com.commercetools.api.models.type.TypeTextInputHint getInputHint(){
        return this.inputHint;
    }

    /**
     * builds TypeChangeInputHintAction with checking for non-null required values
     * @return TypeChangeInputHintAction
     */
    public TypeChangeInputHintAction build() {
        Objects.requireNonNull(fieldName, TypeChangeInputHintAction.class + ": fieldName is missing");
        Objects.requireNonNull(inputHint, TypeChangeInputHintAction.class + ": inputHint is missing");
        return new TypeChangeInputHintActionImpl(fieldName, inputHint);
    }
    
    /**
     * builds TypeChangeInputHintAction without checking for non-null required values
     * @return TypeChangeInputHintAction
     */
    public TypeChangeInputHintAction buildUnchecked() {
        return new TypeChangeInputHintActionImpl(fieldName, inputHint);
    }

    /**
     * factory method for an instance of TypeChangeInputHintActionBuilder
     * @return builder 
     */
    public static TypeChangeInputHintActionBuilder of() {
        return new TypeChangeInputHintActionBuilder();
    }

    /**
     * create builder for TypeChangeInputHintAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeChangeInputHintActionBuilder of(final TypeChangeInputHintAction template) {
        TypeChangeInputHintActionBuilder builder = new TypeChangeInputHintActionBuilder();
        builder.fieldName = template.getFieldName();
        builder.inputHint = template.getInputHint();
        return builder;
    }

}
