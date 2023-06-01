package com.commercetools.api.models.type;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.TypeUpdateAction;
import com.commercetools.api.models.type.TypeChangeNameAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TypeChangeNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeChangeNameAction typeChangeNameAction = TypeChangeNameAction.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class TypeChangeNameActionBuilder implements Builder<TypeChangeNameAction> {

    
    
    private com.commercetools.api.models.common.LocalizedString name;

    
    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param builder function to build the name value
     * @return Builder
     */
    
    public TypeChangeNameActionBuilder name(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param builder function to build the name value
     * @return Builder
     */
    
    public TypeChangeNameActionBuilder withName(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param name value to be set
     * @return Builder
     */
    
    public TypeChangeNameActionBuilder name( final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }
    
    

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return name
     */
    
    
    public com.commercetools.api.models.common.LocalizedString getName(){
        return this.name;
    }

    /**
     * builds TypeChangeNameAction with checking for non-null required values
     * @return TypeChangeNameAction
     */
    public TypeChangeNameAction build() {
        Objects.requireNonNull(name, TypeChangeNameAction.class + ": name is missing");
        return new TypeChangeNameActionImpl(name);
    }
    
    /**
     * builds TypeChangeNameAction without checking for non-null required values
     * @return TypeChangeNameAction
     */
    public TypeChangeNameAction buildUnchecked() {
        return new TypeChangeNameActionImpl(name);
    }

    /**
     * factory method for an instance of TypeChangeNameActionBuilder
     * @return builder 
     */
    public static TypeChangeNameActionBuilder of() {
        return new TypeChangeNameActionBuilder();
    }

    /**
     * create builder for TypeChangeNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeChangeNameActionBuilder of(final TypeChangeNameAction template) {
        TypeChangeNameActionBuilder builder = new TypeChangeNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
