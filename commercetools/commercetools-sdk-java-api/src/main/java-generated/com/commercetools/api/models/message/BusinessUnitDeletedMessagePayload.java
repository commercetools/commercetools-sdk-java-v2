
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful <span>Delete BusinessUnit</span> request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitDeletedMessagePayload businessUnitDeletedMessagePayload = BusinessUnitDeletedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("BusinessUnitDeleted")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitDeletedMessagePayloadImpl.class)
public interface BusinessUnitDeletedMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitDeletedMessagePayload
     */
    String BUSINESS_UNIT_DELETED = "BusinessUnitDeleted";

    /**
     * factory method
     * @return instance of BusinessUnitDeletedMessagePayload
     */
    public static BusinessUnitDeletedMessagePayload of() {
        return new BusinessUnitDeletedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitDeletedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitDeletedMessagePayload of(final BusinessUnitDeletedMessagePayload template) {
        BusinessUnitDeletedMessagePayloadImpl instance = new BusinessUnitDeletedMessagePayloadImpl();
        return instance;
    }

    public BusinessUnitDeletedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitDeletedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitDeletedMessagePayload deepCopy(
            @Nullable final BusinessUnitDeletedMessagePayload template) {
        if (template == null) {
            return null;
        }
        BusinessUnitDeletedMessagePayloadImpl instance = new BusinessUnitDeletedMessagePayloadImpl();
        return instance;
    }

    /**
     * builder factory method for BusinessUnitDeletedMessagePayload
     * @return builder
     */
    public static BusinessUnitDeletedMessagePayloadBuilder builder() {
        return BusinessUnitDeletedMessagePayloadBuilder.of();
    }

    /**
     * create builder for BusinessUnitDeletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitDeletedMessagePayloadBuilder builder(final BusinessUnitDeletedMessagePayload template) {
        return BusinessUnitDeletedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitDeletedMessagePayload(Function<BusinessUnitDeletedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitDeletedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitDeletedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitDeletedMessagePayload>";
            }
        };
    }
}
