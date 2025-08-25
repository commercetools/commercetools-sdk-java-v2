
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a>.</p>
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
@io.vrap.rmf.base.client.utils.json.SubType("business-unit")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitReferenceImpl.class)
public interface BusinessUnitReference extends Reference, com.commercetools.api.models.Identifiable<BusinessUnit>,
        com.commercetools.api.models.IdentifiableObjHolder<BusinessUnit> {

    /**
     * discriminator value for BusinessUnitReference
     */
    String BUSINESS_UNIT = "business-unit";

    /**
     *  <p>Contains the representation of the expanded BusinessUnit. Only present in responses to requests with <span>Reference Expansion</span> for BusinessUnit.</p>
     * @return obj
     */
    @Valid
    @JsonProperty("obj")
    public BusinessUnit getObj();

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a>.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Contains the representation of the expanded BusinessUnit. Only present in responses to requests with <span>Reference Expansion</span> for BusinessUnit.</p>
     * @param obj value to be set
     */

    public void setObj(final BusinessUnit obj);

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a>.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * factory method
     * @return instance of BusinessUnitReference
     */
    public static BusinessUnitReference of() {
        return new BusinessUnitReferenceImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitReference of(final BusinessUnitReference template) {
        BusinessUnitReferenceImpl instance = new BusinessUnitReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public BusinessUnitReference copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitReference deepCopy(@Nullable final BusinessUnitReference template) {
        if (template == null) {
            return null;
        }
        BusinessUnitReferenceImpl instance = new BusinessUnitReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(com.commercetools.api.models.business_unit.BusinessUnit.deepCopy(template.getObj()));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitReference
     * @return builder
     */
    public static BusinessUnitReferenceBuilder builder() {
        return BusinessUnitReferenceBuilder.of();
    }

    /**
     * create builder for BusinessUnitReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitReferenceBuilder builder(final BusinessUnitReference template) {
        return BusinessUnitReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitReference(Function<BusinessUnitReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitReference>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitReference>";
            }
        };
    }
}
