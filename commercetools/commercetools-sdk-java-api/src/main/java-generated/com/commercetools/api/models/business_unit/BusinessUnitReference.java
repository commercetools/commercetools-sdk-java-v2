
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Reference to a BusinessUnit.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitReference businessUnitReference = BusinessUnitReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitReferenceImpl.class)
public interface BusinessUnitReference extends Reference, com.commercetools.api.models.Identifiable<BusinessUnit> {

    String BUSINESS_UNIT = "business-unit";

    /**
     *  <p>Contains the representation of the expanded BusinessUnit. Only present in responses to requests with Reference Expansion for BusinessUnit.</p>
     * @return obj
     */
    @Valid
    @JsonProperty("obj")
    public BusinessUnit getObj();

    /**
     *  <p>Unique identifier of the referenced BusinessUnit.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    public void setObj(final BusinessUnit obj);

    public void setId(final String id);

    public static BusinessUnitReference of() {
        return new BusinessUnitReferenceImpl();
    }

    public static BusinessUnitReference of(final BusinessUnitReference template) {
        BusinessUnitReferenceImpl instance = new BusinessUnitReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static BusinessUnitReferenceBuilder builder() {
        return BusinessUnitReferenceBuilder.of();
    }

    public static BusinessUnitReferenceBuilder builder(final BusinessUnitReference template) {
        return BusinessUnitReferenceBuilder.of(template);
    }

    default <T> T withBusinessUnitReference(Function<BusinessUnitReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitReference>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitReference>";
            }
        };
    }
}
