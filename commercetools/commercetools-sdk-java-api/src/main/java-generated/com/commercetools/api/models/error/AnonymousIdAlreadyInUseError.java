
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when the anonymous ID is being used by another resource.</p>
 *  <p>The client application should choose another anonymous ID or retrieve an automatically generated one.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AnonymousIdAlreadyInUseError anonymousIdAlreadyInUseError = AnonymousIdAlreadyInUseError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AnonymousIdAlreadyInUseErrorImpl.class)
public interface AnonymousIdAlreadyInUseError extends ErrorObject {

    String ANONYMOUS_ID_ALREADY_IN_USE = "AnonymousIdAlreadyInUse";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"The given anonymous ID is already in use."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    public void setMessage(final String message);

    public static AnonymousIdAlreadyInUseError of() {
        return new AnonymousIdAlreadyInUseErrorImpl();
    }

    public static AnonymousIdAlreadyInUseError of(final AnonymousIdAlreadyInUseError template) {
        AnonymousIdAlreadyInUseErrorImpl instance = new AnonymousIdAlreadyInUseErrorImpl();
        instance.setMessage(template.getMessage());

        return instance;
    }

    public static AnonymousIdAlreadyInUseErrorBuilder builder() {
        return AnonymousIdAlreadyInUseErrorBuilder.of();
    }

    public static AnonymousIdAlreadyInUseErrorBuilder builder(final AnonymousIdAlreadyInUseError template) {
        return AnonymousIdAlreadyInUseErrorBuilder.of(template);
    }

    default <T> T withAnonymousIdAlreadyInUseError(Function<AnonymousIdAlreadyInUseError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AnonymousIdAlreadyInUseError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AnonymousIdAlreadyInUseError>() {
            @Override
            public String toString() {
                return "TypeReference<AnonymousIdAlreadyInUseError>";
            }
        };
    }
}
