
package com.commercetools.history.models.label;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * BusinessUnitLabel
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitLabel businessUnitLabel = BusinessUnitLabel.builder()
 *             .key("{key}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("BusinessUnitLabel")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitLabelImpl.class)
public interface BusinessUnitLabel extends Label {

    /**
     * discriminator value for BusinessUnitLabel
     */
    String BUSINESS_UNIT_LABEL = "BusinessUnitLabel";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>User-defined unique identifier of the Business Unit.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Name of the Business Unit.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>User-defined unique identifier of the Business Unit.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Name of the Business Unit.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     * factory method
     * @return instance of BusinessUnitLabel
     */
    public static BusinessUnitLabel of() {
        return new BusinessUnitLabelImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitLabel
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitLabel of(final BusinessUnitLabel template) {
        BusinessUnitLabelImpl instance = new BusinessUnitLabelImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        return instance;
    }

    public BusinessUnitLabel copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitLabel
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitLabel deepCopy(@Nullable final BusinessUnitLabel template) {
        if (template == null) {
            return null;
        }
        BusinessUnitLabelImpl instance = new BusinessUnitLabelImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitLabel
     * @return builder
     */
    public static BusinessUnitLabelBuilder builder() {
        return BusinessUnitLabelBuilder.of();
    }

    /**
     * create builder for BusinessUnitLabel instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitLabelBuilder builder(final BusinessUnitLabel template) {
        return BusinessUnitLabelBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitLabel(Function<BusinessUnitLabel, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitLabel> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitLabel>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitLabel>";
            }
        };
    }
}
