
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when update actions could not be applied to the resource (for example, because a referenced resource does not exist). This would result in a 400 Bad Request response if the same update action was sent from a regular client.</p>
 *
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLExtensionUpdateActionsFailedErrorImpl.class)
public interface GraphQLExtensionUpdateActionsFailedError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLExtensionUpdateActionsFailedError
     */
    String EXTENSION_UPDATE_ACTIONS_FAILED = "ExtensionUpdateActionsFailed";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>User-defined localized description of the error.</p>
     * @return localizedMessage
     */
    @Valid
    @JsonProperty("localizedMessage")
    public LocalizedString getLocalizedMessage();

    /**
     *  <p>Any information that should be returned to the API caller.</p>
     * @return extensionExtraInfo
     */
    @Valid
    @JsonProperty("extensionExtraInfo")
    public Object getExtensionExtraInfo();

    /**
     *  <p>Additional errors related to the API Extension.</p>
     * @return extensionErrors
     */
    @NotNull
    @Valid
    @JsonProperty("extensionErrors")
    public List<ExtensionError> getExtensionErrors();

    /**
     *  <p>User-defined localized description of the error.</p>
     * @param localizedMessage value to be set
     */

    public void setLocalizedMessage(final LocalizedString localizedMessage);

    /**
     *  <p>Any information that should be returned to the API caller.</p>
     * @param extensionExtraInfo value to be set
     */

    public void setExtensionExtraInfo(final Object extensionExtraInfo);

    /**
     *  <p>Additional errors related to the API Extension.</p>
     * @param extensionErrors values to be set
     */

    @JsonIgnore
    public void setExtensionErrors(final ExtensionError... extensionErrors);

    /**
     *  <p>Additional errors related to the API Extension.</p>
     * @param extensionErrors values to be set
     */

    public void setExtensionErrors(final List<ExtensionError> extensionErrors);

    /**
     * factory method
     * @return instance of GraphQLExtensionUpdateActionsFailedError
     */
    public static GraphQLExtensionUpdateActionsFailedError of() {
        return new GraphQLExtensionUpdateActionsFailedErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLExtensionUpdateActionsFailedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLExtensionUpdateActionsFailedError of(final GraphQLExtensionUpdateActionsFailedError template) {
        GraphQLExtensionUpdateActionsFailedErrorImpl instance = new GraphQLExtensionUpdateActionsFailedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setLocalizedMessage(template.getLocalizedMessage());
        instance.setExtensionExtraInfo(template.getExtensionExtraInfo());
        instance.setExtensionErrors(template.getExtensionErrors());
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLExtensionUpdateActionsFailedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLExtensionUpdateActionsFailedError deepCopy(
            @Nullable final GraphQLExtensionUpdateActionsFailedError template) {
        if (template == null) {
            return null;
        }
        GraphQLExtensionUpdateActionsFailedErrorImpl instance = new GraphQLExtensionUpdateActionsFailedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setLocalizedMessage(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getLocalizedMessage()));
        instance.setExtensionExtraInfo(template.getExtensionExtraInfo());
        instance.setExtensionErrors(Optional.ofNullable(template.getExtensionErrors())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.error.ExtensionError::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for GraphQLExtensionUpdateActionsFailedError
     * @return builder
     */
    public static GraphQLExtensionUpdateActionsFailedErrorBuilder builder() {
        return GraphQLExtensionUpdateActionsFailedErrorBuilder.of();
    }

    /**
     * create builder for GraphQLExtensionUpdateActionsFailedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLExtensionUpdateActionsFailedErrorBuilder builder(
            final GraphQLExtensionUpdateActionsFailedError template) {
        return GraphQLExtensionUpdateActionsFailedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLExtensionUpdateActionsFailedError(
            Function<GraphQLExtensionUpdateActionsFailedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLExtensionUpdateActionsFailedError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLExtensionUpdateActionsFailedError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLExtensionUpdateActionsFailedError>";
            }
        };
    }
}
