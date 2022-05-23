
package com.commercetools.ml.models.missing_data;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MissingAttributesDetails
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MissingAttributesDetails missingAttributesDetails = MissingAttributesDetails.builder()
 *             .total(0.3)
 *             .missingAttributeNames(0.3)
 *             .missingAttributeValues(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MissingAttributesDetailsImpl.class)
public interface MissingAttributesDetails {

    /**
     <*  <p>Number of products scanned.</p>>
     */
    @NotNull
    @JsonProperty("total")
    public Integer getTotal();

    /**
     <*  <p>Number of products missing attribute names.</p>>
     */
    @NotNull
    @JsonProperty("missingAttributeNames")
    public Integer getMissingAttributeNames();

    /**
     <*  <p>Number of products missing attribute values.</p>>
     */
    @NotNull
    @JsonProperty("missingAttributeValues")
    public Integer getMissingAttributeValues();

    public void setTotal(final Integer total);

    public void setMissingAttributeNames(final Integer missingAttributeNames);

    public void setMissingAttributeValues(final Integer missingAttributeValues);

    public static MissingAttributesDetails of() {
        return new MissingAttributesDetailsImpl();
    }

    public static MissingAttributesDetails of(final MissingAttributesDetails template) {
        MissingAttributesDetailsImpl instance = new MissingAttributesDetailsImpl();
        instance.setTotal(template.getTotal());
        instance.setMissingAttributeNames(template.getMissingAttributeNames());
        instance.setMissingAttributeValues(template.getMissingAttributeValues());
        return instance;
    }

    public static MissingAttributesDetailsBuilder builder() {
        return MissingAttributesDetailsBuilder.of();
    }

    public static MissingAttributesDetailsBuilder builder(final MissingAttributesDetails template) {
        return MissingAttributesDetailsBuilder.of(template);
    }

    default <T> T withMissingAttributesDetails(Function<MissingAttributesDetails, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MissingAttributesDetails> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MissingAttributesDetails>() {
            @Override
            public String toString() {
                return "TypeReference<MissingAttributesDetails>";
            }
        };
    }
}
