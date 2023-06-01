package com.commercetools.api.models.error;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.error.ExtensionError;
import com.commercetools.api.models.error.GraphQLErrorObject;
import java.lang.Object;
import com.commercetools.api.models.error.GraphQLExtensionUpdateActionsFailedError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLExtensionUpdateActionsFailedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLExtensionUpdateActionsFailedError graphQLExtensionUpdateActionsFailedError = GraphQLExtensionUpdateActionsFailedError.builder()
 *             .plusExtensionErrors(extensionErrorsBuilder -> extensionErrorsBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLExtensionUpdateActionsFailedErrorBuilder implements Builder<GraphQLExtensionUpdateActionsFailedError> {

    
    
    private Map<String, java.lang.Object> values = new HashMap<>();
    
    
    @Nullable
    private com.commercetools.api.models.common.LocalizedString localizedMessage;
    
    
    @Nullable
    private java.lang.Object extensionExtraInfo;
    
    
    
    private java.util.List<com.commercetools.api.models.error.ExtensionError> extensionErrors;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public GraphQLExtensionUpdateActionsFailedErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public GraphQLExtensionUpdateActionsFailedErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    
    
    
    /**
     *  <p>User-defined localized description of the error.</p>
     * @param builder function to build the localizedMessage value
     * @return Builder
     */
    
    public GraphQLExtensionUpdateActionsFailedErrorBuilder localizedMessage(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.localizedMessage = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>User-defined localized description of the error.</p>
     * @param builder function to build the localizedMessage value
     * @return Builder
     */
    
    public GraphQLExtensionUpdateActionsFailedErrorBuilder withLocalizedMessage(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.localizedMessage = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     *  <p>User-defined localized description of the error.</p>
     * @param localizedMessage value to be set
     * @return Builder
     */
    
    public GraphQLExtensionUpdateActionsFailedErrorBuilder localizedMessage(@Nullable final com.commercetools.api.models.common.LocalizedString localizedMessage) {
        this.localizedMessage = localizedMessage;
        return this;
    }
    
    
    
    
    /**
     *  <p>Any information that should be returned to the API caller.</p>
     * @param extensionExtraInfo value to be set
     * @return Builder
     */
    
    public GraphQLExtensionUpdateActionsFailedErrorBuilder extensionExtraInfo(@Nullable final java.lang.Object extensionExtraInfo) {
        this.extensionExtraInfo = extensionExtraInfo;
        return this;
    }
    
    
    
    /**
     *  <p>Additional errors related to the API Extension.</p>
     * @param extensionErrors value to be set
     * @return Builder
     */
    
    public GraphQLExtensionUpdateActionsFailedErrorBuilder extensionErrors( final com.commercetools.api.models.error.ExtensionError ...extensionErrors) {
        this.extensionErrors = new ArrayList<>(Arrays.asList(extensionErrors));
        return this;
    }
    
    /**
     *  <p>Additional errors related to the API Extension.</p>
     * @param extensionErrors value to be set
     * @return Builder
     */
    
    public GraphQLExtensionUpdateActionsFailedErrorBuilder extensionErrors( final java.util.List<com.commercetools.api.models.error.ExtensionError> extensionErrors) {
        this.extensionErrors = extensionErrors;
        return this;
    }
    
    /**
     *  <p>Additional errors related to the API Extension.</p>
     * @param extensionErrors value to be set
     * @return Builder
     */
    
    public GraphQLExtensionUpdateActionsFailedErrorBuilder plusExtensionErrors( final com.commercetools.api.models.error.ExtensionError ...extensionErrors) {
        if (this.extensionErrors == null) {
            this.extensionErrors = new ArrayList<>();
        }
        this.extensionErrors.addAll(Arrays.asList(extensionErrors));
        return this;
    }
    
    
    
    /**
     *  <p>Additional errors related to the API Extension.</p>
     * @param builder function to build the extensionErrors value
     * @return Builder
     */
    
    public GraphQLExtensionUpdateActionsFailedErrorBuilder plusExtensionErrors(Function<com.commercetools.api.models.error.ExtensionErrorBuilder, com.commercetools.api.models.error.ExtensionErrorBuilder> builder) {
        if (this.extensionErrors == null) {
            this.extensionErrors = new ArrayList<>();
        }
        this.extensionErrors.add(builder.apply(com.commercetools.api.models.error.ExtensionErrorBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Additional errors related to the API Extension.</p>
     * @param builder function to build the extensionErrors value
     * @return Builder
     */
    
    public GraphQLExtensionUpdateActionsFailedErrorBuilder withExtensionErrors(Function<com.commercetools.api.models.error.ExtensionErrorBuilder, com.commercetools.api.models.error.ExtensionErrorBuilder> builder) {
        this.extensionErrors = new ArrayList<>();
        this.extensionErrors.add(builder.apply(com.commercetools.api.models.error.ExtensionErrorBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Additional errors related to the API Extension.</p>
     * @param builder function to build the extensionErrors value
     * @return Builder
     */
    
    public GraphQLExtensionUpdateActionsFailedErrorBuilder addExtensionErrors(Function<com.commercetools.api.models.error.ExtensionErrorBuilder, com.commercetools.api.models.error.ExtensionError> builder) {
        return plusExtensionErrors(builder.apply(com.commercetools.api.models.error.ExtensionErrorBuilder.of()));
    }
    
    /**
     *  <p>Additional errors related to the API Extension.</p>
     * @param builder function to build the extensionErrors value
     * @return Builder
     */
    
    public GraphQLExtensionUpdateActionsFailedErrorBuilder setExtensionErrors(Function<com.commercetools.api.models.error.ExtensionErrorBuilder, com.commercetools.api.models.error.ExtensionError> builder) {
        return extensionErrors(builder.apply(com.commercetools.api.models.error.ExtensionErrorBuilder.of()));
    }
                    

    /**
     *  <p>Error-specific additional fields.</p>
     * @return pattern properties
     */
    
    
    public Map<String, java.lang.Object> getValues(){
        return this.values;
    }
    
    /**
     *  <p>User-defined localized description of the error.</p>
     * @return localizedMessage
     */
    
    @Nullable
    public com.commercetools.api.models.common.LocalizedString getLocalizedMessage(){
        return this.localizedMessage;
    }
    
    /**
     *  <p>Any information that should be returned to the API caller.</p>
     * @return extensionExtraInfo
     */
    
    @Nullable
    public java.lang.Object getExtensionExtraInfo(){
        return this.extensionExtraInfo;
    }
    
    /**
     *  <p>Additional errors related to the API Extension.</p>
     * @return extensionErrors
     */
    
    
    public java.util.List<com.commercetools.api.models.error.ExtensionError> getExtensionErrors(){
        return this.extensionErrors;
    }

    /**
     * builds GraphQLExtensionUpdateActionsFailedError with checking for non-null required values
     * @return GraphQLExtensionUpdateActionsFailedError
     */
    public GraphQLExtensionUpdateActionsFailedError build() {
        Objects.requireNonNull(extensionErrors, GraphQLExtensionUpdateActionsFailedError.class + ": extensionErrors is missing");
        return new GraphQLExtensionUpdateActionsFailedErrorImpl(values, localizedMessage, extensionExtraInfo, extensionErrors);
    }
    
    /**
     * builds GraphQLExtensionUpdateActionsFailedError without checking for non-null required values
     * @return GraphQLExtensionUpdateActionsFailedError
     */
    public GraphQLExtensionUpdateActionsFailedError buildUnchecked() {
        return new GraphQLExtensionUpdateActionsFailedErrorImpl(values, localizedMessage, extensionExtraInfo, extensionErrors);
    }

    /**
     * factory method for an instance of GraphQLExtensionUpdateActionsFailedErrorBuilder
     * @return builder 
     */
    public static GraphQLExtensionUpdateActionsFailedErrorBuilder of() {
        return new GraphQLExtensionUpdateActionsFailedErrorBuilder();
    }

    /**
     * create builder for GraphQLExtensionUpdateActionsFailedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLExtensionUpdateActionsFailedErrorBuilder of(final GraphQLExtensionUpdateActionsFailedError template) {
        GraphQLExtensionUpdateActionsFailedErrorBuilder builder = new GraphQLExtensionUpdateActionsFailedErrorBuilder();
        builder.values = template.values();
        builder.localizedMessage = template.getLocalizedMessage();
        builder.extensionExtraInfo = template.getExtensionExtraInfo();
        builder.extensionErrors = template.getExtensionErrors();
        return builder;
    }

}
