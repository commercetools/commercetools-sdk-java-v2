
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a>. Either <code>id</code> or <code>key</code> is required. If both are set, an <span>InvalidJsonInput</span> error is returned.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitResourceIdentifier businessUnitResourceIdentifier = BusinessUnitResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("business-unit")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitResourceIdentifierImpl.class)
public interface BusinessUnitResourceIdentifier
        extends ResourceIdentifier, com.commercetools.api.models.Identifiable<BusinessUnit> {

    /**
     * discriminator value for BusinessUnitResourceIdentifier
     */
    String BUSINESS_UNIT = "business-unit";

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a>. Required if <code>key</code> is absent.</p>
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Unique key of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a>. Required if <code>id</code> is absent.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a>. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Unique key of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a>. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of BusinessUnitResourceIdentifier
     */
    public static BusinessUnitResourceIdentifier of() {
        return new BusinessUnitResourceIdentifierImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitResourceIdentifier of(final BusinessUnitResourceIdentifier template) {
        BusinessUnitResourceIdentifierImpl instance = new BusinessUnitResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public BusinessUnitResourceIdentifier copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitResourceIdentifier deepCopy(@Nullable final BusinessUnitResourceIdentifier template) {
        if (template == null) {
            return null;
        }
        BusinessUnitResourceIdentifierImpl instance = new BusinessUnitResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitResourceIdentifier
     * @return builder
     */
    public static BusinessUnitResourceIdentifierBuilder builder() {
        return BusinessUnitResourceIdentifierBuilder.of();
    }

    /**
     * create builder for BusinessUnitResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitResourceIdentifierBuilder builder(final BusinessUnitResourceIdentifier template) {
        return BusinessUnitResourceIdentifierBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitResourceIdentifier(Function<BusinessUnitResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitResourceIdentifier>";
            }
        };
    }
}
