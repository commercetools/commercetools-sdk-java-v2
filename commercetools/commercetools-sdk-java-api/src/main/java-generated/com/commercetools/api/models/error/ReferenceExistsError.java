
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReferenceExistsError
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

    String REFERENCE_EXISTS = "ReferenceExists";

    /**
     *  <p>Type of resource the value should reference. Supported resource type identifiers are:</p>
     */

    @JsonProperty("referencedBy")
    public ReferenceTypeId getReferencedBy();

    public void setReferencedBy(final ReferenceTypeId referencedBy);

    public static ReferenceExistsError of() {
        return new ReferenceExistsErrorImpl();
    }

    public static ReferenceExistsError of(final ReferenceExistsError template) {
        ReferenceExistsErrorImpl instance = new ReferenceExistsErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setReferencedBy(template.getReferencedBy());
        return instance;
    }

    public static ReferenceExistsErrorBuilder builder() {
        return ReferenceExistsErrorBuilder.of();
    }

    public static ReferenceExistsErrorBuilder builder(final ReferenceExistsError template) {
        return ReferenceExistsErrorBuilder.of(template);
    }

    default <T> T withReferenceExistsError(Function<ReferenceExistsError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ReferenceExistsError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReferenceExistsError>() {
            @Override
            public String toString() {
                return "TypeReference<ReferenceExistsError>";
            }
        };
    }
}
