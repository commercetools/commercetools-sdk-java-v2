
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
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

    public void setError(final String error);

    public void setErrorDescription(final String errorDescription);

    @JsonIgnore
    public void setErrors(final ErrorObject... errors);

    public void setErrors(final List<ErrorObject> errors);

    public static AuthErrorResponse of() {
        return new AuthErrorResponseImpl();
    }

    public static AuthErrorResponse of(final AuthErrorResponse template) {
        AuthErrorResponseImpl instance = new AuthErrorResponseImpl();
        instance.setStatusCode(template.getStatusCode());
        instance.setMessage(template.getMessage());
        instance.setErrors(template.getErrors());
        instance.setError(template.getError());
        instance.setErrorDescription(template.getErrorDescription());
        return instance;
    }

    public static AuthErrorResponseBuilder builder() {
        return AuthErrorResponseBuilder.of();
    }

    public static AuthErrorResponseBuilder builder(final AuthErrorResponse template) {
        return AuthErrorResponseBuilder.of(template);
    }

    default <T> T withAuthErrorResponse(Function<AuthErrorResponse, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AuthErrorResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AuthErrorResponse>() {
            @Override
            public String toString() {
                return "TypeReference<AuthErrorResponse>";
            }
        };
    }
}
