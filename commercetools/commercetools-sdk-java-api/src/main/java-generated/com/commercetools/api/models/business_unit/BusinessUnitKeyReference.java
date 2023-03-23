
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.KeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Reference to a BusinessUnit by its key.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitKeyReference businessUnitKeyReference = BusinessUnitKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitKeyReferenceImpl.class)
public interface BusinessUnitKeyReference extends KeyReference {

    String BUSINESS_UNIT = "business-unit";

    /**
     *  <p>Unique and immutable key of the referenced BusinessUnit.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static BusinessUnitKeyReference of() {
        return new BusinessUnitKeyReferenceImpl();
    }

    public static BusinessUnitKeyReference of(final BusinessUnitKeyReference template) {
        BusinessUnitKeyReferenceImpl instance = new BusinessUnitKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static BusinessUnitKeyReferenceBuilder builder() {
        return BusinessUnitKeyReferenceBuilder.of();
    }

    public static BusinessUnitKeyReferenceBuilder builder(final BusinessUnitKeyReference template) {
        return BusinessUnitKeyReferenceBuilder.of(template);
    }

    default <T> T withBusinessUnitKeyReference(Function<BusinessUnitKeyReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitKeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitKeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitKeyReference>";
            }
        };
    }
}
