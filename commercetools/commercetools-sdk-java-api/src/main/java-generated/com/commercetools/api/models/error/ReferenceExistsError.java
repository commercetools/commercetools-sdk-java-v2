
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when a resource cannot be deleted because it is being referenced by another resource.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReferenceExistsError referenceExistsError = ReferenceExistsError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReferenceExistsErrorImpl.class)
public interface ReferenceExistsError extends ErrorObject {

    /**
     * discriminator value for ReferenceExistsError
     */
    String REFERENCE_EXISTS = "ReferenceExists";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Can not delete a $resource while it is referenced by at least one $referencedBy."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Type of referenced resource.</p>
     * @return referencedBy
     */

    @JsonProperty("referencedBy")
    public ReferenceTypeId getReferencedBy();

    /**
     *  <p><code>"Can not delete a $resource while it is referenced by at least one $referencedBy."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Type of referenced resource.</p>
     * @param referencedBy value to be set
     */

    public void setReferencedBy(final ReferenceTypeId referencedBy);

    /**
     * factory method
     * @return instance of ReferenceExistsError
     */
    public static ReferenceExistsError of() {
        return new ReferenceExistsErrorImpl();
    }

    /**
     * factory method to copy an instance of ReferenceExistsError
     * @param template instance to be copied
     * @return copy instance
     */
    public static ReferenceExistsError of(final ReferenceExistsError template) {
        ReferenceExistsErrorImpl instance = new ReferenceExistsErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setReferencedBy(template.getReferencedBy());
        return instance;
    }

    /**
     * builder factory method for ReferenceExistsError
     * @return builder
     */
    public static ReferenceExistsErrorBuilder builder() {
        return ReferenceExistsErrorBuilder.of();
    }

    /**
     * create builder for ReferenceExistsError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReferenceExistsErrorBuilder builder(final ReferenceExistsError template) {
        return ReferenceExistsErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReferenceExistsError(Function<ReferenceExistsError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReferenceExistsError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReferenceExistsError>() {
            @Override
            public String toString() {
                return "TypeReference<ReferenceExistsError>";
            }
        };
    }
}
