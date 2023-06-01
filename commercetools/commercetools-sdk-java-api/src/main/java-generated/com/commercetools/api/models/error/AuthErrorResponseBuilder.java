package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.ErrorResponse;
import com.commercetools.api.models.error.AuthErrorResponse;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AuthErrorResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AuthErrorResponse authErrorResponse = AuthErrorResponse.builder()
 *             .statusCode(1)
 *             .message("{message}")
 *             .plusErrors(errorsBuilder -> errorsBuilder)
 *             .error("{error}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AuthErrorResponseBuilder implements Builder<AuthErrorResponse> {

    
    
    private Integer statusCode;
    
    
    
    private String message;
    
    
    
    private java.util.List<com.commercetools.api.models.error.ErrorObject> errors;
    
    
    
    private String error;
    
    
    @Nullable
    private String error_description;

    
    /**
     *  <p>HTTP status code corresponding to the error.</p>
     * @param statusCode value to be set
     * @return Builder
     */
    
    public AuthErrorResponseBuilder statusCode( final Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    
    
    /**
     *  <p>First error message in the <code>errors</code> array.</p>
     * @param message value to be set
     * @return Builder
     */
    
    public AuthErrorResponseBuilder message( final String message) {
        this.message = message;
        return this;
    }
    
    
    
    /**
     *  <p>Authentication and authorization-related errors returned for a request.</p>
     * @param errors value to be set
     * @return Builder
     */
    
    public AuthErrorResponseBuilder errors( final com.commercetools.api.models.error.ErrorObject ...errors) {
        this.errors = new ArrayList<>(Arrays.asList(errors));
        return this;
    }
    
    /**
     *  <p>Authentication and authorization-related errors returned for a request.</p>
     * @param errors value to be set
     * @return Builder
     */
    
    public AuthErrorResponseBuilder errors( final java.util.List<com.commercetools.api.models.error.ErrorObject> errors) {
        this.errors = errors;
        return this;
    }
    
    /**
     *  <p>Authentication and authorization-related errors returned for a request.</p>
     * @param errors value to be set
     * @return Builder
     */
    
    public AuthErrorResponseBuilder plusErrors( final com.commercetools.api.models.error.ErrorObject ...errors) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.addAll(Arrays.asList(errors));
        return this;
    }
    
    
    /**
     *  <p>Authentication and authorization-related errors returned for a request.</p>
     * @param builder function to build the errors value
     * @return Builder
     */
    
    public AuthErrorResponseBuilder plusErrors(Function<com.commercetools.api.models.error.ErrorObjectBuilder, Builder<? extends com.commercetools.api.models.error.ErrorObject>> builder) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(builder.apply(com.commercetools.api.models.error.ErrorObjectBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Authentication and authorization-related errors returned for a request.</p>
     * @param builder function to build the errors value
     * @return Builder
     */
    
    public AuthErrorResponseBuilder withErrors(Function<com.commercetools.api.models.error.ErrorObjectBuilder, Builder<? extends com.commercetools.api.models.error.ErrorObject>> builder) {
        this.errors = new ArrayList<>();
        this.errors.add(builder.apply(com.commercetools.api.models.error.ErrorObjectBuilder.of()).build());
        return this;
    }
                    
    
    
    
    /**
     *  <p>Error code as per the OAuth 2.0 specification. For example: <code>"access_denied"</code>.</p>
     * @param error value to be set
     * @return Builder
     */
    
    public AuthErrorResponseBuilder error( final String error) {
        this.error = error;
        return this;
    }
    
    
    
    
    /**
     *  <p>Plain text description of the first error.</p>
     * @param error_description value to be set
     * @return Builder
     */
    
    public AuthErrorResponseBuilder error_description(@Nullable final String error_description) {
        this.error_description = error_description;
        return this;
    }
    
    

    /**
     *  <p>HTTP status code corresponding to the error.</p>
     * @return statusCode
     */
    
    
    public Integer getStatusCode(){
        return this.statusCode;
    }
    
    /**
     *  <p>First error message in the <code>errors</code> array.</p>
     * @return message
     */
    
    
    public String getMessage(){
        return this.message;
    }
    
    /**
     *  <p>Authentication and authorization-related errors returned for a request.</p>
     * @return errors
     */
    
    
    public java.util.List<com.commercetools.api.models.error.ErrorObject> getErrors(){
        return this.errors;
    }
    
    /**
     *  <p>Error code as per the OAuth 2.0 specification. For example: <code>"access_denied"</code>.</p>
     * @return error
     */
    
    
    public String getError(){
        return this.error;
    }
    
    /**
     *  <p>Plain text description of the first error.</p>
     * @return error_description
     */
    
    @Nullable
    public String getError_description(){
        return this.error_description;
    }

    /**
     * builds AuthErrorResponse with checking for non-null required values
     * @return AuthErrorResponse
     */
    public AuthErrorResponse build() {
        Objects.requireNonNull(statusCode, AuthErrorResponse.class + ": statusCode is missing");
        Objects.requireNonNull(message, AuthErrorResponse.class + ": message is missing");
        Objects.requireNonNull(errors, AuthErrorResponse.class + ": errors is missing");
        Objects.requireNonNull(error, AuthErrorResponse.class + ": error is missing");
        return new AuthErrorResponseImpl(statusCode, message, errors, error, error_description);
    }
    
    /**
     * builds AuthErrorResponse without checking for non-null required values
     * @return AuthErrorResponse
     */
    public AuthErrorResponse buildUnchecked() {
        return new AuthErrorResponseImpl(statusCode, message, errors, error, error_description);
    }

    /**
     * factory method for an instance of AuthErrorResponseBuilder
     * @return builder 
     */
    public static AuthErrorResponseBuilder of() {
        return new AuthErrorResponseBuilder();
    }

    /**
     * create builder for AuthErrorResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AuthErrorResponseBuilder of(final AuthErrorResponse template) {
        AuthErrorResponseBuilder builder = new AuthErrorResponseBuilder();
        builder.statusCode = template.getStatusCode();
        builder.message = template.getMessage();
        builder.errors = template.getErrors();
        builder.error = template.getError();
        builder.error_description = template.getErrorDescription();
        return builder;
    }

}
