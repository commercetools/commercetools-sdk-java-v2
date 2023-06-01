package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.ErrorResponse;
import com.commercetools.api.models.error.AuthErrorResponseImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>Represents errors related to authentication and authorization in a format conforming to the OAuth 2.0 specification.</p>
 *
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
@JsonDeserialize(as = AuthErrorResponseImpl.class)
public interface AuthErrorResponse extends ErrorResponse {


    /**
     *  <p>Error code as per the OAuth 2.0 specification. For example: <code>"access_denied"</code>.</p>
     * @return error
     */
    @NotNull
    @JsonProperty("error")
    public String getError();
    /**
     *  <p>Plain text description of the first error.</p>
     * @return error_description
     */
    
    @JsonProperty("error_description")
    public String getErrorDescription();
    /**
     *  <p>Authentication and authorization-related errors returned for a request.</p>
     * @return errors
     */
    @NotNull
    @Valid
    @JsonProperty("errors")
    public List<ErrorObject> getErrors();

    /**
     *  <p>Error code as per the OAuth 2.0 specification. For example: <code>"access_denied"</code>.</p>
     * @param error value to be set
     */
    
    public void setError(final String error);
    
    
    /**
     *  <p>Plain text description of the first error.</p>
     * @param errorDescription value to be set
     */
    
    public void setErrorDescription(final String errorDescription);
    
    
    /**
     *  <p>Authentication and authorization-related errors returned for a request.</p>
     * @param errors values to be set
     */
    
    @JsonIgnore
    public void setErrors(final ErrorObject ...errors);
    /**
     *  <p>Authentication and authorization-related errors returned for a request.</p>
     * @param errors values to be set
     */
    
    public void setErrors(final List<ErrorObject> errors);

    /**
     * factory method
     * @return instance of AuthErrorResponse
     */
    public static AuthErrorResponse of(){
        return new AuthErrorResponseImpl();
    }
    

    /**
     * factory method to create a shallow copy AuthErrorResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static AuthErrorResponse of(final AuthErrorResponse template) {
        AuthErrorResponseImpl instance = new AuthErrorResponseImpl();
        instance.setStatusCode(template.getStatusCode());
        instance.setMessage(template.getMessage());
        instance.setErrors(template.getErrors());
        instance.setError(template.getError());
        instance.setErrorDescription(template.getErrorDescription());
        return instance;
    }

    /**
     * factory method to create a deep copy of AuthErrorResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AuthErrorResponse deepCopy(@Nullable final AuthErrorResponse template) {
        if (template == null) {
            return null;
        }
        AuthErrorResponseImpl instance = new AuthErrorResponseImpl();
        instance.setStatusCode(template.getStatusCode());
        instance.setMessage(template.getMessage());
        instance.setErrors(Optional.ofNullable(template.getErrors())
                .map(t -> t.stream().map(com.commercetools.api.models.error.ErrorObject::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setError(template.getError());
        instance.setErrorDescription(template.getErrorDescription());
        return instance;
    }

    /**
     * builder factory method for AuthErrorResponse
     * @return builder
     */
    public static AuthErrorResponseBuilder builder() {
        return AuthErrorResponseBuilder.of();
    }
    
    /**
     * create builder for AuthErrorResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AuthErrorResponseBuilder builder(final AuthErrorResponse template) {
        return AuthErrorResponseBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAuthErrorResponse(Function<AuthErrorResponse, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AuthErrorResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AuthErrorResponse>() {
            @Override
            public String toString() {
                return "TypeReference<AuthErrorResponse>";
            }
        };
    }
}
