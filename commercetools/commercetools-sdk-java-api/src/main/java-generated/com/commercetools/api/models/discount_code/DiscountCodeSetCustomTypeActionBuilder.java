package com.commercetools.api.models.discount_code;

import com.commercetools.api.models.discount_code.DiscountCodeUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.discount_code.DiscountCodeSetCustomTypeAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeSetCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeSetCustomTypeAction discountCodeSetCustomTypeAction = DiscountCodeSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class DiscountCodeSetCustomTypeActionBuilder implements Builder<DiscountCodeSetCustomTypeAction> {

    
    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;
    
    
    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    
    /**
     *  <p>Defines the Type that extends the DiscountCode with Custom Fields. If absent, any existing Type and Custom Fields are removed from the DiscountCode.</p>
     * @param builder function to build the type value
     * @return Builder
     */
    
    public DiscountCodeSetCustomTypeActionBuilder type(Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Defines the Type that extends the DiscountCode with Custom Fields. If absent, any existing Type and Custom Fields are removed from the DiscountCode.</p>
     * @param builder function to build the type value
     * @return Builder
     */
    
    public DiscountCodeSetCustomTypeActionBuilder withType(Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Defines the Type that extends the DiscountCode with Custom Fields. If absent, any existing Type and Custom Fields are removed from the DiscountCode.</p>
     * @param type value to be set
     * @return Builder
     */
    
    public DiscountCodeSetCustomTypeActionBuilder type(@Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }
    
    
    
    
    /**
     *  <p>Sets the Custom Fields fields for the DiscountCode.</p>
     * @param builder function to build the fields value
     * @return Builder
     */
    
    public DiscountCodeSetCustomTypeActionBuilder fields(Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Sets the Custom Fields fields for the DiscountCode.</p>
     * @param builder function to build the fields value
     * @return Builder
     */
    
    public DiscountCodeSetCustomTypeActionBuilder withFields(Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Sets the Custom Fields fields for the DiscountCode.</p>
     * @param fields value to be set
     * @return Builder
     */
    
    public DiscountCodeSetCustomTypeActionBuilder fields(@Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }
    
    

    /**
     *  <p>Defines the Type that extends the DiscountCode with Custom Fields. If absent, any existing Type and Custom Fields are removed from the DiscountCode.</p>
     * @return type
     */
    
    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType(){
        return this.type;
    }
    
    /**
     *  <p>Sets the Custom Fields fields for the DiscountCode.</p>
     * @return fields
     */
    
    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields(){
        return this.fields;
    }

    /**
     * builds DiscountCodeSetCustomTypeAction with checking for non-null required values
     * @return DiscountCodeSetCustomTypeAction
     */
    public DiscountCodeSetCustomTypeAction build() {
        return new DiscountCodeSetCustomTypeActionImpl(type, fields);
    }
    
    /**
     * builds DiscountCodeSetCustomTypeAction without checking for non-null required values
     * @return DiscountCodeSetCustomTypeAction
     */
    public DiscountCodeSetCustomTypeAction buildUnchecked() {
        return new DiscountCodeSetCustomTypeActionImpl(type, fields);
    }

    /**
     * factory method for an instance of DiscountCodeSetCustomTypeActionBuilder
     * @return builder 
     */
    public static DiscountCodeSetCustomTypeActionBuilder of() {
        return new DiscountCodeSetCustomTypeActionBuilder();
    }

    /**
     * create builder for DiscountCodeSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeSetCustomTypeActionBuilder of(final DiscountCodeSetCustomTypeAction template) {
        DiscountCodeSetCustomTypeActionBuilder builder = new DiscountCodeSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
