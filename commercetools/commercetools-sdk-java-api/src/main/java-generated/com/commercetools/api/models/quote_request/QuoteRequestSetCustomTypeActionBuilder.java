package com.commercetools.api.models.quote_request;

import com.commercetools.api.models.quote_request.QuoteRequestUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.quote_request.QuoteRequestSetCustomTypeAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteRequestSetCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestSetCustomTypeAction quoteRequestSetCustomTypeAction = QuoteRequestSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class QuoteRequestSetCustomTypeActionBuilder implements Builder<QuoteRequestSetCustomTypeAction> {

    
    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;
    
    
    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    
    /**
     *  <p>Defines the Type that extends the QuoteRequest with Custom Fields. If absent, any existing Type and Custom Fields are removed from the QuoteRequest.</p>
     * @param builder function to build the type value
     * @return Builder
     */
    
    public QuoteRequestSetCustomTypeActionBuilder type(Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Defines the Type that extends the QuoteRequest with Custom Fields. If absent, any existing Type and Custom Fields are removed from the QuoteRequest.</p>
     * @param builder function to build the type value
     * @return Builder
     */
    
    public QuoteRequestSetCustomTypeActionBuilder withType(Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Defines the Type that extends the QuoteRequest with Custom Fields. If absent, any existing Type and Custom Fields are removed from the QuoteRequest.</p>
     * @param type value to be set
     * @return Builder
     */
    
    public QuoteRequestSetCustomTypeActionBuilder type(@Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }
    
    
    
    
    /**
     *  <p>Sets the Custom Fields fields for the QuoteRequest.</p>
     * @param builder function to build the fields value
     * @return Builder
     */
    
    public QuoteRequestSetCustomTypeActionBuilder fields(Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Sets the Custom Fields fields for the QuoteRequest.</p>
     * @param builder function to build the fields value
     * @return Builder
     */
    
    public QuoteRequestSetCustomTypeActionBuilder withFields(Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Sets the Custom Fields fields for the QuoteRequest.</p>
     * @param fields value to be set
     * @return Builder
     */
    
    public QuoteRequestSetCustomTypeActionBuilder fields(@Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }
    
    

    /**
     *  <p>Defines the Type that extends the QuoteRequest with Custom Fields. If absent, any existing Type and Custom Fields are removed from the QuoteRequest.</p>
     * @return type
     */
    
    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType(){
        return this.type;
    }
    
    /**
     *  <p>Sets the Custom Fields fields for the QuoteRequest.</p>
     * @return fields
     */
    
    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields(){
        return this.fields;
    }

    /**
     * builds QuoteRequestSetCustomTypeAction with checking for non-null required values
     * @return QuoteRequestSetCustomTypeAction
     */
    public QuoteRequestSetCustomTypeAction build() {
        return new QuoteRequestSetCustomTypeActionImpl(type, fields);
    }
    
    /**
     * builds QuoteRequestSetCustomTypeAction without checking for non-null required values
     * @return QuoteRequestSetCustomTypeAction
     */
    public QuoteRequestSetCustomTypeAction buildUnchecked() {
        return new QuoteRequestSetCustomTypeActionImpl(type, fields);
    }

    /**
     * factory method for an instance of QuoteRequestSetCustomTypeActionBuilder
     * @return builder 
     */
    public static QuoteRequestSetCustomTypeActionBuilder of() {
        return new QuoteRequestSetCustomTypeActionBuilder();
    }

    /**
     * create builder for QuoteRequestSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteRequestSetCustomTypeActionBuilder of(final QuoteRequestSetCustomTypeAction template) {
        QuoteRequestSetCustomTypeActionBuilder builder = new QuoteRequestSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
