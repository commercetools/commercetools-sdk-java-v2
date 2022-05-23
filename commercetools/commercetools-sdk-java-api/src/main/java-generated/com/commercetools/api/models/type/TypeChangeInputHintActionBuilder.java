
package com.commercetools.api.models.type;

import java.util.*;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TypeChangeInputHintActionBuilder implements Builder<TypeChangeInputHintAction> {

    private String fieldName;

    private com.commercetools.api.models.type.TypeTextInputHint inputHint;

    /**
     <*  <p><code>name</code> of the Field Definition to update.</p>>
     */

    public TypeChangeInputHintActionBuilder fieldName(final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     <*  <p>New value to set. Must not be empty.</p>>
     */

    public TypeChangeInputHintActionBuilder inputHint(
            final com.commercetools.api.models.type.TypeTextInputHint inputHint) {
        this.inputHint = inputHint;
        return this;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public com.commercetools.api.models.type.TypeTextInputHint getInputHint() {
        return this.inputHint;
    }

    public TypeChangeInputHintAction build() {
        Objects.requireNonNull(fieldName, TypeChangeInputHintAction.class + ": fieldName is missing");
        Objects.requireNonNull(inputHint, TypeChangeInputHintAction.class + ": inputHint is missing");
        return new TypeChangeInputHintActionImpl(fieldName, inputHint);
    }

    /**
     * builds TypeChangeInputHintAction without checking for non null required values
     */
    public TypeChangeInputHintAction buildUnchecked() {
        return new TypeChangeInputHintActionImpl(fieldName, inputHint);
    }

    public static TypeChangeInputHintActionBuilder of() {
        return new TypeChangeInputHintActionBuilder();
    }

    public static TypeChangeInputHintActionBuilder of(final TypeChangeInputHintAction template) {
        TypeChangeInputHintActionBuilder builder = new TypeChangeInputHintActionBuilder();
        builder.fieldName = template.getFieldName();
        builder.inputHint = template.getInputHint();
        return builder;
    }

}
